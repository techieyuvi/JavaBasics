import java.io.*;

public class LearningByteStream {
    public static void main(String[] args) throws IOException {

        InputStream sourceStream = null;
        OutputStream targetStream = null;

        try {
            sourceStream = new FileInputStream("C:\\Users\\YuvarajKaruppaiya\\IdeaProjects\\LearningJava\\src\\source");
            targetStream = new FileOutputStream("C:\\Users\\YuvarajKaruppaiya\\IdeaProjects\\LearningJava\\src\\target");

            int temp;
            while ((temp = sourceStream.read()) != -1) {
                targetStream.write((byte) temp);
            }
        } finally {
            if (sourceStream != null){
                sourceStream.close();
            }
            if (targetStream != null){
                targetStream.close();
            }
        }
    }
}