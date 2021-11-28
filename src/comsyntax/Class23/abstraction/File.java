package comsyntax.Class23.abstraction;

public abstract class File {
    /*
    Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method
    while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation
    of open behaviour: Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word
    to be installed etc
     */
    abstract void open();
    void edit(){
        System.out.println("Edit the file");
    }
    void close(){
        System.out.println("Close the file by pressing the 'x' in the upper right corner");
    }
}
class JavaFile extends File{
    public void open(){
        System.out.println("In order to open a .java file, we need notepad or sublime text");
    }
}
class WordFile extends File{
    public void open(){
        System.out.println("In order to open a .doc or .docx file, we need Microsoft Word");
    }
}
class PdfFile extends File{
    public void open() {
        System.out.println("In order to open a .pdf, we need Acrobate Reader installed");
    }
}