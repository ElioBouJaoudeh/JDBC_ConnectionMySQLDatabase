# JDBC Connection to MySQL Database
Java Project, MySQL database and JDBC driver provided to connect to MySQL database with Java

## Steps to Follow:

1) Install Requirements in MySQL database version 8.0.28 via **https://dev.mysql.com/downloads/windows/installer/8.0.html** (2.3mb MSI Installer)

![Community](https://user-images.githubusercontent.com/88712232/151714466-b1d039f1-73a0-44ce-b216-65cb63633417.jpg)


![Install Required Product Features](https://user-images.githubusercontent.com/88712232/151714329-607b076c-969f-4ebe-a8ff-a2baad113902.jpg)


2) Connect to the server and Apply Configuration in the Installer

![Connect to Server](https://user-images.githubusercontent.com/88712232/151714350-9a628749-e55d-4321-bd31-96b9f7d3a955.jpg)

![Apply Configuration](https://user-images.githubusercontent.com/88712232/151714355-568d340c-a111-4c73-a455-db40653939c9.jpg)


3) Make sure everything required including the MySQL Workbench are installed and Finish

![Installer](https://user-images.githubusercontent.com/88712232/151714383-2ec691a1-b6f3-479f-8802-b67dc5872f4c.jpg)


4) Create a MySQL database and table using the MySQL Workbench by logging in through the username and password established in the steps before (root or regular user)

![Workbench](https://user-images.githubusercontent.com/88712232/151714392-6779a2c7-ab95-4e96-be02-0c65bf2d4128.jpg)

![Creation of Table employees](https://user-images.githubusercontent.com/88712232/151714550-8dc07bd5-d1fc-4191-9f21-ff0ff05f1c63.jpg)

![Table employees](https://user-images.githubusercontent.com/88712232/151714555-a95c18d5-7d58-42cd-9ead-5ee4cbe3e73b.jpg)

![MySQL Workbench](https://user-images.githubusercontent.com/88712232/151714397-0d728723-f307-4b9f-992f-c263da333610.jpg)


5) Download JDBC Driver version 8.0.28 (latest one as of January 2022) from **https://dev.mysql.com/downloads/connector/j/** for Platform Independent (Compressed 4.0mb TAR Archive)

![Connector](https://user-images.githubusercontent.com/88712232/151714475-b95157e0-d27f-4b7f-9e84-e824b7b6c920.jpg)

![Connector2](https://user-images.githubusercontent.com/88712232/151714708-9235a338-4334-4168-b97f-0d0fdd737af8.jpg)


6) Create a Java Project and include the **Driver.java** file that will be used to connect to the database. Change to corresponding port number on which the server is running (in our example it's **3306**)


7) Run as a Java Application and the entries of the database will be displayed as expected

![Scala Eclipse IDE](https://user-images.githubusercontent.com/88712232/151714485-7421c0ea-6d91-4981-a19c-d0494ca9950f.jpg)
