#Environemnt setup  
	First Check if there are any packages need to update.
	$ sudo apt-get update

##usefull linke
###package Install for JDBC  
	https://marksman.wordpress.com/2009/03/01/setting-up-mysqljdbc-driver-on-ubuntu/  


##Package Required  

	mysql client
	mysql server  

	$ sudo apt-get install mysql-server mysql-client

	* It will ask you to set up SQL root password.  

	Type $ sudo service mysql restart  in terminal to check if it install successfully, OR  
		 $ mysqladmin --version, it should show the version installed.

##Support package  

### apache -->  $ sudo apt-get install libapache2-mod-auth-mysql
### php    -->  $ sudo apt-get install php5-mysql
### Java   -->  $ sudo apt-get install libmysql-java  
		Old Version of Java require environment setting, you could add the following in .bashrc  
			CLASSPATH=$CLASSPATH:/usr/share/java/mysql.jar
			export CLASSPATH  
		ALTERNATIVE, you can set it to all users by  
			CLASSPATH=".:/usr/share/java/mysql.jar"  
		TEST by _$ echo $CLASSPATH_ and it should show the path

## LOGIN AND TEST

### login
	Open terminal and type  
		$ mysql -u -root -p 
	Enter password for "root", you will log in to mysql database.
	
### manage account  
	Change password  
		mysql> mysqladmin -u root password "new_password"  

	Check if SQL server start
		ps -ef| grep mysqld  
	
	Shutdown mysql server  
		mysqladmin -u root -p shutdown  

	Add user account  
		use mysql;
		INSERT INTO user(host, user, password, select_priv,insert_priv,update_priv)
		VALUES('localhost','guest',PASSWORD('giest123'),'Y','Y','Y');

	Grant priv  
		GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP
		ON TUTORIALS.* 
		TO 'guest'@'localhost'
		IDENTIFIED BY 'guest123';


