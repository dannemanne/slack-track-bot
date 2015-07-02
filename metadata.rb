name             "slack-track-bot"
maintainer       "Daniel Viklund"
license          "MIT License"
description      "Installs/Configures environment for scala-track-bot"
long_description IO.read(File.join(File.dirname(__FILE__), 'README.md'))
version          "0.1.0"

depends "mysql", "= 2.1.2"
depends "database", "= 1.3.12"
depends "apache2", "= 1.6.2"
