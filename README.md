HomeSeer plugin lazybones templates
===================================

### Instructions

1. Install [gvm](http://gvmtool.net/) : `curl -s get.gvmtool.net | bash`
2. Install lazybones : `gvm install lazybones`
3. Edit `~/.lazybones/config.groovy` and paste this into it:

        bintrayRepositories = [
            "ihomeautomate/lazybones-templates",
            "pledbrook/lazybones-templates"
        ]

7. `lazybones create homeseer-zee-plugin <name-of-project>` or if you know the answers `lazybones create homeseer-zee-plugin -Pgroup='org.example' -Pversion='0.1' -PpluginName=MyPlugin -PpluginDescription='My plugin description' -Pvendor='MyOrganisation' -PvendorUrl='http://my.organisation.org' <name-of-project>`
8. Answer the prompted questions or provide values via command line
9. `cd <name-of-project>`
10. `git init`
11. `git remote add origin <github url>`
12. Go forth and develop your plugin.

### Instructions for developing

1. Install [gvm](http://gvmtool.net/) : `curl -s get.gvmtool.net | bash`
2. Install lazybones : `gvm install lazybones`
3. Clone our template: `git clone https://github.com/ihomeautomate/homeseer-lazybones-templates.git`
4. `cd homeseer-lazybones-templates`
5. Install the template: `./gradlew installTemplateHomeseerZeePlugin`
6. Change directory to where you want to create the plugin project
7. `lazybones create homeseer-zee-plugin 0.1.0-SNAPSHOT <name-of-project>` or if you know the answers `lazybones create homeseer-zee-plugin 0.1.0-SNAPSHOT -Pgroup='org.example' -Pversion='0.1' -PpluginName=MyPlugin -PpluginDescription='My plugin description' -Pvendor='MyOrganisation' -PvendorUrl='http://my.organisation.org' <name-of-project>`
8. Answer the prompted questions or provide values via command line
9. `cd <name-of-project>`
10. `git init`
11. `git remote add origin <github url>`
12. Go forth and develop your plugin.

### Lazybones Info

You can find out more about creating lazybones templates on its [github wiki][7].

### Copyright and licensing
    
Code and documentation copyright 2014 [iHomeAutomate](http://www.iHomeAutomate.eu). Code released under the [Apache-2.0 license](LICENSE.txt).
    
### Social media

<!-- Please don't remove this: Grab your social icons from https://github.com/carlsednaoui/gitsocial -->

[![@ihomeautomate][1.1]][1]
[![iHomeAutomate @ Facebook][2.1]][2]
[![+IhomeautomateEu][3.1]][3]
[![github.com/ihomeautomate][6.1]][6]

<!-- links to social media icons -->
<!-- no need to change these -->

<!-- icons with padding -->

[1.1]: http://i.imgur.com/tXSoThF.png (twitter icon with padding)
[2.1]: http://i.imgur.com/P3YfQoD.png (facebook icon with padding)
[3.1]: http://i.imgur.com/yCsTjba.png (google plus icon with padding)
[4.1]: http://i.imgur.com/YckIOms.png (tumblr icon with padding)
[5.1]: http://i.imgur.com/1AGmwO3.png (dribbble icon with padding)
[6.1]: http://i.imgur.com/0o48UoR.png (github icon with padding)

<!-- icons without padding -->

[1.2]: http://i.imgur.com/wWzX9uB.png (twitter icon without padding)
[2.2]: http://i.imgur.com/fep1WsG.png (facebook icon without padding)
[3.2]: http://i.imgur.com/VlgBKQ9.png (google plus icon without padding)
[4.2]: http://i.imgur.com/jDRp47c.png (tumblr icon without padding)
[5.2]: http://i.imgur.com/Vvy3Kru.png (dribbble icon without padding)
[6.2]: http://i.imgur.com/9I6NRUm.png (github icon without padding)


<!-- links to your social media accounts -->
<!-- update these accordingly -->

[1]: http://twitter.com/ihomeautomate
[2]: https://facebook.com/pages/iHomeAutomate/218034961586842
[3]: https://plus.google.com/+IhomeautomateEu
[6]: http://github.com/ihomeautomate
[7]: https://github.com/pledbrook/lazybones/wiki/Template-developers-guide

<!-- Please don't remove this: Grab your social icons from https://github.com/carlsednaoui/gitsocial -->    