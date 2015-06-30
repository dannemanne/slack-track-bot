import slack.rtm.SlackRtmClient
import akka.actor.ActorSystem

import slack.api._

object SlackTrackBot {

  def main(args: Array[String]) {
    println("SlackTrack started!")

    implicit val system = ActorSystem("slack")
    implicit val ec = system.dispatcher

    val token = sys.env("SLACK_TOKEN")

    implicit val timeout = new Timeout(30.second)
    val apiClient = BlockingSlackApiClient(token)
    val state = RtmState(apiClient.startRealTimeMessageSession())
    val generalChanId = state.getChannelIdForName("general").get
    val actor = SlackRtmConnectionActor(token, state)

    actor ! SendMessage(generalChanId, "Hello Slack!")

    //val client = SlackRtmClient(token)

    // val state = client.state
    // val selfId = state.self.id
    // val chanId = state.getChannelIdForName("general")
    //
    // val generalChanId = state.getChannelIdForName("general").get
    // client.sendMessage(generalChanId, "Hello!")
  }

}
