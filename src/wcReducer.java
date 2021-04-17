// Importing libraries
import java.io.IOException;
import java.util.Iterator;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;
  
public class wcReducer extends MapReduceBase implements Reducer<Text,
                                    IntWritable, Text, IntWritable> {
  
    // Reduce function
    public void reduce(Text key, Iterator<IntWritable> value, 
                   OutputCollector<Text, IntWritable> output, 
                            Reporter rep) throws IOException
    {
  
        int count = 0;
        System.out.println("Counting words frequency...");
  
        // Counting the frequency of each words
        while (value.hasNext()) 
        {
            IntWritable i = value.next();
            count += i.get();
        }
        System.out.println("Completed counting words");
        output.collect(key, new IntWritable(count));
    }
}
