Youth Job & Skills Hub 🌍
A web-based platform that allows youth to post and find job opportunities, built using Javaee7, PrimeFaces, Payara Server 5 and MySQL.

✨ Features
🔐 User Registration and Login
🧑‍💼 Post Job Opportunities (Title, Description, Location, Category, Deadline)
📄 List All Jobs with Details
🚪 Logout functionality
📁 (Planned) Filter/Search Jobs by Category and Location
📎 (Planned) CV Upload and User Profiles
📷 Screenshots
Coming soon...

⚙️ Technologies Used
Layer	Technology
Frontend	JSF + PrimeFaces
Backend	Javaee7 (CDI, ManagedBeans)
Database	MySQL
Server	Payara / GlassFish
IDE	NetBeans 25
Language	Java 1.8
🏗️ Project Structure
├── src/main/java │ ├── com.youthhub.bean # JSF ManagedBeans │ ├── com.youthhub.dao # DAO for DB logic │ └── com.youthhub.model # Entity classes ├── src/main/webapp │ ├── login.xhtml │ ├── register.xhtml │ └── index.xhtml

🚀 Setup Instructions
Clone the repository

Import into NetBeans or your preferred Java EE IDE

Create MySQL database CREATE DATABASE youthhub;

Create users and jobs tables Adjust according to your DAO implementation: CREATE TABLE users ( id INT AUTO_INCREMENT PRIMARY KEY, full_name VARCHAR(100), email VARCHAR(100) UNIQUE, password VARCHAR(100) );

CREATE TABLE jobs ( id INT AUTO_INCREMENT PRIMARY KEY, title VARCHAR(100), description TEXT, location VARCHAR(100), category VARCHAR(50), deadline DATE );

Edit DB connection in UserDAO and JobDAO String url = "jdbc:mysql://localhost:3306/youthhub"; String user = "root"; String password = "your_password";

Deploy to Payara or GlassFish Server

✅ To-Do Job Filtering / Search Bar

File upload for CVs

Profile page for users

Admin dashboard

Responsive mobile design

👨‍💻 Author Brian Muriuki 📧 muriuki.brian@outlook.com

📄 License MIT License. Feel free to use and improve this project.
