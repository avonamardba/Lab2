package bigdata.labs.lab2;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class AirportJoinApp {
    public static void main(String args[]) throws Exception {
        if (args.length != 3) {
            System.err.println("Arguments error");
            System.exit(1);
        }

        Job job = Job.getInstance();
        job.setJarByClass(AirportJoinApp.class);
        job.setJobName("AirportJoinApp");

        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, FlightsMapper.class);
        MultipleInputs.addInputPath(job, new Path(args[1]), TextInputFormat.class, AirportsMapper.class);
        FileOutputFormat.setOutputPath(job, new Path(args[2]));
        job.setGroupingComparatorClass(AirportIDComparator.class);
        job.setPartitionerClass(AirportIDPartitioner.class);
        job.setReducerClass(AirportReducer.class);
        job.setMapOutputKeyClass(AirportKeyComparable.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);
        job.setNumReduceTasks(1);
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
