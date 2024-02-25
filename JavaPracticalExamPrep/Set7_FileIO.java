

import java.util.*;
import java.io.*;

class writeFile extends Thread {

    String filename, data;

    writeFile(String filename, String data) {
        this.filename = filename;
        this.data = data;
    }

    public void run() {
        writeFile.write(filename, data);
    }

    public static void write(String filename, String data) {
        try {
            File f = new File(filename);
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            for (int i = 0; i < data.length(); i++) {
                bw.write(data.charAt(i));
            }
            bw.close();

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Data successfully inserted!");
        }
    }

}

class readFile extends Thread {

    String filename;

    readFile() {
        System.out.println("Thread Created!");
    }

    readFile(String filename) {
        this.filename = filename;
    }

    public void run() {
        System.out.println(read(filename));
    }

    public static String read(String filename) {
        StringBuilder file_data = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                file_data.append(line).append("\n");
            }
            br.close();

        } catch (IOException e) {
            System.out.println(e);
        }
        return file_data.toString();
    }

}

class copyFile extends Thread {

    String sourcefile, targetfile;

    copyFile(String sourcefile, String targetfile) {
        this.sourcefile = sourcefile;
        this.targetfile = targetfile;
    }

    public void run() {
        copy(sourcefile, targetfile);
    }

    public static void copy(String readfile, String writefile) {
        System.out.println("Enter the source file:");
        String sourcedata = readFile.read(readfile);
        writeFile.write(writefile, sourcedata);
    }
}

public class Set7_FileIO extends Thread {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        try {
            while (true) {
                System.out.println("Enter an option:");
                System.out.println(
                        "\n1. Read contents of a file\n2. Write to a file\n3. Copy contents of a file to another\n4. Exit...");

                String choice2 = sc.nextLine();
                choice = Integer.parseInt(choice2);

                String filename, targetfile, sourcefile;

                switch (choice) {

                    case 1:
                        System.out.println("Enter the file name to read:");
                        filename = sc.nextLine();
                        readFile threadRead = new readFile(filename);
                        threadRead.start();
                        break;

                    case 2:
                        System.out.println("Enter the file name to write! (with extension)");
                        filename = sc.nextLine();
                        System.out.println("Enter the data to write into the file:");
                        String data = sc.nextLine();
                        writeFile threadWrite = new writeFile(filename, data);
                        threadWrite.start();
                        break;

                    case 3:
                        System.out.println("Enter the source file name! (with extension)");
                        sourcefile = sc.nextLine();
                        System.out.println("Enter the source file name! (with extension)");
                        targetfile = sc.nextLine();

                        copyFile threadCopy = new copyFile(sourcefile, targetfile);
                        threadCopy.start();
                        break;

                    case 4:
                        return;

                    default:
                        System.out.println("Invalid Choice!\n");
                        break;

                }

            }
        } finally {
            sc.close();
        }
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}