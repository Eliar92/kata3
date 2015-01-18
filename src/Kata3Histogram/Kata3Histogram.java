package Kata3Histogram;

public class Kata3Histogram {

    public static void main(String[] args) {
       MailReader reader = new MailReader("mails.txt"); 
       HistogramBuilder builder = new HistogramBuilder<>();
       Histogram<String> histogram = builder.build(reader.readDomains());
       new HistogramViewer<String>().print(histogram);
    }
}
