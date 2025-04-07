<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Charity Management System</title>
    <style>
        /* Reset some default styles */
        body, h2, h3, p {
            margin: 0;
            padding: 0;
        }

        body {
            font-family: 'Arial', sans-serif;
            line-height: 1.6;
            background-color: #f9f9f9;
        }

        /* Header and Navbar */
        header {
            background-color: #333;
            color: #fff;
        }

        nav ul {
            display: flex;
            justify-content: center;
            list-style: none;
            padding: 10px 0;
            margin: 0;
        }

        nav ul li {
            margin: 0 20px;
        }

        nav ul li a {
            text-decoration: none;
            color: #fff;
            font-weight: bold;
            transition: color 0.3s;
        }

        nav ul li a:hover {
            color: #4CAF50;
        }

        /* Main Content */
        main {
            padding: 50px;
            text-align: center;
        }

        #needy-section {
            background-color: #fff;
            padding: 30px;
            margin: 0 auto;
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
            max-width: 800px;
        }

        .donation-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
            gap: 20px;
            margin-top: 20px;
        }

        .donation-category {
            background-color: #e9ecef;
            padding: 15px;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            width: 180px;
            text-align: center;
        }

        .donation-category h3 {
            margin-bottom: 10px;
        }

        button {
            background-color: #4CAF50;
            color: #fff;
            border: none;
            padding: 10px 15px;
            border-radius: 5px;
            cursor: pointer;
            font-size: 1em;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #45a049;
        }

        /* Footer */
        footer {
            background-color: #333;
            color: #fff;
            padding: 20px 0;
            text-align: center;
        }

        footer section h3 {
            margin-bottom: 10px;
        }

        footer a {
            color: #4CAF50;
            text-decoration: none;
        }

        footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <header>
        <nav>
            <ul>
                <li><a href="home.jsp">Home</a></li>
                <li><a href="adminLogin.jsp">Admin</a></li>
                <li><a href="charityLogin.jsp">Charity</a></li>
                <li><a href="donorLogin.jsp">Donor</a></li>
                <li><a href="contactUs.jsp">Contact Us</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <section id="needy-section">
            <h2>Help Those in Need</h2>
            <div class="donation-container">
                <div class="donation-category">
                    <h3>Poverty</h3>
                    <button onclick="window.location.href='donate.jsp'">Donate Now</button>
                </div>
                <div class="donation-category">
                    <h3>Hunger</h3>
                    <button onclick="window.location.href='donate.jsp'">Donate Now</button>
                </div>
                <div class="donation-category">
                    <h3>Animal Welfare</h3>
                    <button onclick="window.location.href='donate.jsp'">Donate Now</button>
                </div>
                <div class="donation-category">
                    <h3>Education</h3>
                    <button onclick="window.location.href='donate.jsp'">Donate Now</button>
                </div>
            </div>
        </section>
    </main>
    <footer>
        <section>
            <h3>Our Mission</h3>
            <p>Empowering communities and transforming lives.</p>
            <a href="aboutUs.jsp">About Us</a>
        </section>
    </footer>
</body>
</html>
