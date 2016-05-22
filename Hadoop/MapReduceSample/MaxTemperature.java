import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class MaxTemperature{

	public static void main(String[] args)throws Exception{
		if(args.length != 2){
			System.err.println("Usage: MaxTemperature <input path> <output path>");
			System.exit(-1);
		}

		//A job object forms the specification of the job
		Job job = new Job();

		//package the code into a JAR file when run on Hadoop cluster
		job.setJarByClass(MaxTemperature.class);
		job.setJobName("MaxTemperature");

		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));

		//control of the map&reduce class
		job.setMapperClass(MaxTemperatureMapper.class);
		job.setReducerClass(MaxTemperatureReducer.class);

		//output must match the type 
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
	
		System.exit(job.waitForCompletion(true)? 0 : 1);
	}



}