# Convert OpenSearch Dashboard alert to Telegram API

A simple example of REST API Endpoint that convert OpenSearch Dashboard HTTP Request into Telegram API request.

## Features
- Convert OpenSearch Dashboard's Alert HTTP Request into Telegram API 


## Build

- Install maven
- Setup the application.properties with your telegram credential. telegram.id is the chat-id that you want to send the message, whereas telegram.bot is the telegram bot Id

- Use mvn package to build the module into jar file

```shell
mvn clean package
```
- Run the resulting jar

```shell
java -jar SendToTelegram-1.0.0.jar
```
- The application will listening port 10080

## Explanation
You can find the detail explanation of in [this medium blog](https://mrizkysatrio.medium.com/send-opensearch-dashboard-alert-via-telegram-messenger-a6980c18ba9).


## Feedback
For feedback, please raise issues in the issue section of the repository. Enjoy!!.
