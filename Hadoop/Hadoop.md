#Hadoop Note
-Study note for Hadoop The Definitive Guide written by OReilly

##Why Hadoop and tools
We need to deal with read/write large amount of data in parallel from/to disk/pages, and there are two problems:
  ###1. Hardware failure
		Hard disk will usually lead to the problem that if one piece of the hard disk is damadged,
		the whole memory access will be affected. A common way to avoid data loss is 'replication'-RAID.
		Hadoop Distributed Filesystem.
  
  ###2. analysis task need to be able to combine data. 
  		Mapreduce: two computation-the map and the reduce

  		 