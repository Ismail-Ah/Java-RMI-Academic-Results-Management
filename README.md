# Java RMI Academic Results Management

This project implements a distributed application using Java RMI (Remote Method Invocation) to manage academic results for a set of students. It includes functionality to add students, manage their exams, and calculate their averages.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Directory Structure](#directory-structure)
- [Instructions to Run](#instructions-to-run)


## Features

- Add students and their respective exams.
- Calculate the average of individual students.
- Calculate the average of the entire promotion (group of students).
- List all exams for each student with their scores and coefficients.

## Technologies Used

- Java
- Java RMI
- RMI Registry
- ArrayList for managing student data

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/Ismail-Ah/Java-RMI-Academic-Results-Management.git
   ```

## Usage

1. Start the RMI server and then the client.
2. The client will prompt for adding students and their exams.
3. You can view the averages of each student and the entire promotion in the terminal.

## Directory Structure

**Server**
```
.
├── Epreuve_avec_coeff.java   # Class representing an exam with a coefficient and score
├── Etudiant.java              # RMI interface for student management
├── EtudImpl.java              # Implementation of the Etudiant interface
├── PromoImpl.java             # Implementation of the Promotion interface
├── Promotion.java             # RMI interface for promotion management
├── Server.java                # RMI server implementation
└── security.policy            # Security policy file
```

**Client**
```
.
├── Etudiant.java              # RMI interface for student management
├── Promotion.java             # RMI interface for promotion management
├── Client.java                # RMI client implementation
└── security.policy            # Security policy file
```

## Instructions to Run

### Prerequisites

- Ensure you have Java Development Kit (JDK) installed on your machine. You can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- Set up the Java environment variable (JAVA_HOME) on your system.

### Steps to Run

1. **Compile the Code**

   Open your terminal (or command prompt) and navigate to the `Server` and `Client` directories. Compile the Java files using the following commands:

   **For Server:**
   ```bash
   cd Server
   javac *.java
   ```

   **For Client:**
   ```bash
   cd ../Client
   javac *.java
   ```

2. **Start the RMI Registry**

   In a new terminal window, navigate to the `Server` directory and start the RMI registry:

   ```bash
   cd Server
   rmiregistry
   ```

   Leave this terminal open as it is running the RMI registry.

3. **Start the RMI Server**

   In another terminal window, navigate to the `Server` directory again and start the RMI server:

   ```bash
   cd Server
   java Server
   ```

4. **Run the Client**

   Finally, in a new terminal window, navigate to the `Client` directory and run the client application:

   ```bash
   cd Client
   java Client
   ```

5. **Interacting with the Application**

   - Follow the prompts in the client terminal to add students and their exams.
   - You can view the averages of each student and the entire promotion in the terminal output.

### Notes

- Ensure that all terminal windows remain open during the execution of the server and client.
- If you encounter any issues, check the output logs for error messages and ensure all dependencies are correctly set up.

