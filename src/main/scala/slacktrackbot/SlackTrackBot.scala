import slack.rtm.SlackRtmClient
import akka.actor.ActorSystem

object SlackTrackBot {

  def main(args: Array[String]) {
    println("SlackTrack started!")

    implicit val system = ActorSystem("slack")

    val token = sys.env("SLACK_TOKEN")
    val client = SlackRtmClient(token)

    // val state = client.state
    // val selfId = state.self.id
    // val chanId = state.getChannelIdForName("general")
    //
    // val generalChanId = state.getChannelIdForName("general").get
    // client.sendMessage(generalChanId, "Hello!")
  }

}
