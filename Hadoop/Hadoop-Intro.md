#Hadoop Note
-Study note for Hadoop The Definitive Guide written by OReilly

##Why Hadoop and tools
We need to deal with read/write large amount of data in parallel from/to disk/pages, and there are two problems:  
### 1. Hardware failure  
  		Hard disk will usually lead to the problem that if one piece of the hard disk is damadged,
		the whole memory access will be affected. A common way to avoid data loss is 'replication'-RAID.
		Hadoop Distributed Filesystem.  
### 2. analysis task need to be able to combine data.  
		Mapreduce:  
		two computation-the map and the reduce
		MapReduce is a *batch query processor*
  		  -it is not suitable for interactive analysis(slow). Queries take more time, so it's best for offline use.    
  
##Compare with other system  
### RDBMS  
	1. Seek time improving  
	|             |RDBMS              |MapReduce      |
	|-------------|:-----------------:|--------------:|
	|Data Size    | GB                | PB            | 
	|Access       | Interactive&batch | Batch         |
	|Updates      | R/W many time     | write once    |
	|Transactions | ACID              | None          |
	|Structure    | Schema-on-write   | Schema-on-read|
	|Integrity    | High              | Low           |
	|Scaling      | Nonlinear         | Linear        |
	
	<table class="table table-bordered table-striped table-condensed">
	  <tr>
	    <td><td/>
<td><td/>
<td><td/>
<td><td/>
   	  </tr>


	2. Data set operator structure- in hadoop data, data loading phase is just a file copy (ignore schema).
	Hadoop works well on unstructured or semi-structured data because it is designed to interpret the data at processing time. This provides flexibility and avoids the costly data loading phase of an RDMBS.
	
	3. Relational data is normalized(retain integrity and remove redundancy).
	   Hadoop scales linearly with the size of the data. 
              e.x. double input size (slower x2)
                   double cluster    (faster x2)

## Outline
### part1: foundmental
		1. Meet Hadoop
		2. MapReduce
		3. Hadoop distributed Filesystem
		4. YARN
		5. Hadoop I/O  
### part2: MapReduce
		6. Develiping a MapReduce App
		7. How MR works
		8. MR types and Formats
		9. MR features
	
### part3: Hadoop Operations
		10. Setting up a Hadoop Cluster
		11. Administering Hadoop
	
### part4: Projects
		Data Format
		Data Ingestion
		Data Processing
		Storage
		Condition
		
