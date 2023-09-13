# Java Swing Chat Application

This is a simple Java-based chat application that allows multiple users to communicate with each other in real time. 
It uses the Swing library for the user interface and facilitates communication between clients through a central server.

## Features
- Real-time chat between multiple users.
- User-friendly graphical user interface (GUI).
- Messages are broadcast to all connected users.
- Modular design for easy expansion and customization.

## Techniques Used

The chat application was developed using the following techniques and libraries:

- **Java**: The core programming language used for developing the application.
- **Swing**: The Java Swing library was used to create the graphical user interface (GUI) for the chat client.
- **Client-Server Architecture**: The application is built on a client-server architecture, where multiple chat clients connect to a central server to exchange messages.
- **Interfaces**: The application uses Java interfaces to define contracts for communication between clients and the server. This allows for easy integration of different components.
- **Event Handling**: The Swing components in the client application use event handling to respond to user actions, such as clicking the send button.
- **ArrayList**: The `ArrayList` data structure is used to maintain a list of connected clients on the server.
- **Object-Oriented Programming (OOP)**: The application follows object-oriented principles to organize code into classes and objects for better maintainability and scalability.

## Getting Started

To get started with this chat application, follow these steps:

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/WilliamEricCastillo/chat-application.git
2. Open the project in your preferred Java development environment (e.g., Eclipse, IntelliJ IDEA).
3. Compile and run the Main class to start the server and create chat clients.
4. Customize and expand the application as needed for your specific use case.

## Usage
1. Run the Main class to start the server.
2. Create multiple instances of the Chatty class (chat clients) with different user names.
3. Use the GUI of each chat client to send and receive messages in real time.
4. Messages sent by one client will be broadcast to all connected clients.
