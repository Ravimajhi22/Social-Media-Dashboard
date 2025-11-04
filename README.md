🌐 Social Media Dashboard
=============================
A Java-based Social Media Dashboard designed to provide users with an overview of social media activities, such as posts, followers, likes, and engagement metrics — all in one place.
This project demonstrates the integration of Object-Oriented Programming (OOP) concepts, data structures, and modular code design to simulate real-world dashboard functionality through a Command-Line Interface (CLI) or GUI (optional).

🧩 Features
=============
📊 View user analytics (followers, likes, shares, comments)

📝 Create and manage posts

🔍 Search for users or posts

💬 Track engagement metrics

🧰 Modular OOP design (User, Post, Dashboard classes)

💾 Data persistence using file handling or database (optional)

🛠️ Technologies Used
=====================
Language: Java

Concepts Used:

OOP (Encapsulation, Inheritance, Polymorphism)

Collections (ArrayList, HashMap)

Exception Handling

File Handling (optional)

Java I/O and Scanner for user input

📁 Project Structure
======================
Social-Media-Dashboard/
│
├── src/
│   ├── User.java             # Defines user profile details and activities
│   ├── Post.java             # Defines post structure (content, likes, comments)
│   ├── Dashboard.java        # Handles main dashboard functionality and analytics
│   ├── Main.java             # Entry point for the project
│
├── README.md                 # Project documentation
└── data/
    └── users.txt             # (Optional) Stored user data

📜 How to Run the Project
==========================
1️⃣ Compile the Java files
cd path/to/Social-Media-Dashboard
javac src/*.java

2️⃣ Run the application
java src.Main

🧠 Example Output
========================================
      WELCOME TO SOCIAL MEDIA DASHBOARD
========================================

1. Create New Post
2. View All Posts
3. View Analytics
4. Search User
5. Exit

Enter your choice: 1
Enter post content: "Hello, this is my first post!"
Post created successfully! 🎉

Enter your choice: 3
Total Posts: 1
Total Likes: 0
Total Comments: 0
Engagement Rate: 0%

Thank you for using the Social Media Dashboard!
