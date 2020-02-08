# VKBot
VKBot based on Java SDK 11 (Maven)

# Sources
-------
To download the sources, use the following git command:
```bash
git clone https://github.com/zow1e2k/vk-bot.git
```
# Start
-------
1. Insert group id and access token into groupId, access_token in ``` java/core/vk/VKCore.java ``` to connect vk group with application
2. Insert vk id into first arg in ``` java/core/commands/enums/Admins.java ``` to set the admin permission
3. Build the project and deploy it

# Build
--------
To build the project you need use [Maven framework](http://maven.apache.org/). To edit the project you can use [Intellij IDEA](https://www.jetbrains.com/idea/).<br />
Note: don't forget to install [Java SDK 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html).

# Deploy
--------
This template already has Procfile that allow deploy it on [heroku](https://dashboard.heroku.com/login)
1. Register on heroku and go into dashboard
2. Create the application
3. Login into with cmd.exe
4. Commit and push it in your heroku repos

Note: <br />To start the process use: 
```bash
heroku ps:scale worker=1
```
To kill the process: 
```bash
heroku ps:kill worker
```

# Special Thanks
--------
[AppLoidx](https://github.com/AppLoidx/) for [BotOnJavaSDKExample](https://github.com/AppLoidx/BotOnJavaSDKExample)
