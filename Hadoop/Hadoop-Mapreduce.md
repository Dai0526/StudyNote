#Map Reduce  
	MapReduce works by breaking the processing into two phases:
			*. map
			*. Reduce  
	Each phase has key-value pairs as input and output.  

##  How?  
	All discussion is about when and where to do map and reduce.
		can use combine function to combine the output for each cluster, then reduce
		See the code for MaxTemperature  <job.setCombinerClass(MaxtemperatureReducer.class);>  
		Function with this property are called _commutative_ and _associative_

		The mapreduce can also be achieved with ruby and Python. (will do later)


## How to Run and compile files

### Add PATH  
	Add the following path command into */.bashrc* 
	export HADOOP_HOME=/usr/local/hadoop  
	export CLASSPATH=$($HADOOP_HOME/bin/hadoop classpath):$CLASSPATH  

	Then run source ~/.bashrc to make it take effect immediately.


### Compile and Pack all .class file into .jar package so that it can run with HDFS  
	
	$jar -cvf xxxx.jar ./xxxx*.class  


### Create input directory and input data  
	
	$mkdir input  

	$echo "<data>" > ./input/file#  
	$...  
	$...

	Note that:

		Sometime it will report error that "input path does not exist". If it happens,  
		run the following command in cmd to add input into HDFS

		$hadoop fs -put conf input

### Run

	$ /usr/local/hadoop/bin/hadoop/ jar xxxx.jar xxxx input output  

	Note:  

	1. If there is already a output directory, it will report error.  

	2. If you import package such as org.apache.hadoop.example, you need to include   
	   it in the command line  
	   			$ /usr/local/hadoop/bin/hadoop/ jar xxxx.jar org.apache.hadoop.example.xxxx input output  


