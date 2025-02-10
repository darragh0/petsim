# petsim

A CLI virtual pet simulator in Java. This application allows you to interact with a virtual pet, taking care of its needs and ensuring its well-being.

### Features

-   Feed your pet
-   Play with your pet
-   Check your pet's status
-   And more!

### Prerequisites

-   Java Development Kit (JDK) 8 or higher
-   Apache Maven

### To Build

From the root directory, run this to compile and package the project into a JAR file:

```sh
mvn package
```

### To Run

To run the application, use:

```sh
mvn exec:java
```

Alternatively, you can run the application with a clear console output:

```sh
clear && mvn exec:java -q
```

> [!NOTE]
> Replace `clear` with `cls` if you are on Windows

### Usage

Once the application is running, follow the on-screen prompts to interact with your virtual pet. You can perform various actions such as feeding, playing, and checking the status of your pet.

### License

This project is licensed under the MIT License.
