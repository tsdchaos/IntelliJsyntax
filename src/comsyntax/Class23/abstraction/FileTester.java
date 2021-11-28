package comsyntax.Class23.abstraction;

public class FileTester {
    public static void main(String[] args) {
        File[] file={new JavaFile(), new PdfFile(), new WordFile()};
        for(File file2: file){
            file2.close();
            file2.edit();
            file2.open();
        }
    }
}
