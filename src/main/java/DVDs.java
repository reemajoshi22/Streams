import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DVDs {
    public static void main(String[] args) {
        List<DVDInfo> dvds=loadDVDs();
        dvds.forEach(System.out::println);
    }

    private static List<DVDInfo> loadDVDs() {
        List<DVDInfo> dvds = new ArrayList<DVDInfo>();
        //stream a file line by line
        try(Stream<String> stream= Files.lines(Paths.get("G:/laptopWorkspace/LearningWorkspace/Streams/src/main/resources/dvdInfo.txt"))){
            stream.forEach(line->{
                String[] dvdItems=line.split("/");
                DVDInfo dvd=new DVDInfo(dvdItems[0],dvdItems[1],dvdItems[2]);
                dvds.add(dvd);
            });
        } catch (IOException e) {
            System.out.println("Error reading DVDs");
            e.printStackTrace();
        }


        return dvds;
    }
}
