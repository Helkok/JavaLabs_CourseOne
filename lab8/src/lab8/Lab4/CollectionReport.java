package lab8.Lab4;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CollectionReport {
    private Collection collection ;

    public CollectionReport(Collection collection) {
        this.collection = collection;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }


    private String createReport(){
        StringBuilder report = new StringBuilder(collection.getName() + ", author: " + collection.getOwner() + "\n\n");
        for(Album album : collection.getAlbums()){
            report.append("Альбом: ").append(album.getAuthor()).
                    append(", ").append(album.getGenre()).
                    append(", ").append(album.getDate()).append("\n");
            for(Composition composition : album.getCompositionList() ){
                report.append(composition.getName()).
                        append(" | ").append(composition.getDuration()).append("\n");
            }
            report.append("--------------\n").append("Общая длительность: ").
                    append(Math.round(album.getDuration())).append("\n\n");
        }
        return report.toString();
    }
    public void createAndSaveReport(String fileName) throws IOException {
        String report = createReport();
        FileOutputStream fileOutput = new FileOutputStream(fileName);
        fileOutput.write(report.getBytes());
        fileOutput.close();
        System.out.println("Success write report!");
    }


    public String loadReport(String fileName){
        String report = null;
        try(FileInputStream fileInput = new FileInputStream(fileName)) {
            byte []bytesReport = new byte[fileInput.available()];
            fileInput.read(bytesReport);
            report = new String(bytesReport);

        }catch (IOException e){
            System.out.println("Exception was caught in Class" + this.getClass().getName());
        }
        return report;
    }
}
