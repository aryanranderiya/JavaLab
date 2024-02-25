

import java.io.*;
import java.util.*;

public class Set5_CustomerDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name");
        String name = sc.nextLine();

        StringBuilder read_data = readCustomerDetails();
        searchCustomer(read_data, name);

        sc.close();
    }

    public static void searchCustomer(StringBuilder read_data, String name) {

        String[] lines = read_data.toString().split("\n");

        for (int i = 0; i < lines.length; i++) {
            lines[i] = lines[i].replaceAll("\n", ",");
        }

        String result = String.join(",", lines);

        String[] fields = result.toString().split(",");

        for (int i = 0; i < fields.length; i++) {
            if (name.equals(fields[i])) {
                System.out.println(fields[i + 1]);
                System.out.println(fields[i + 2]);
            }
        }

    }

    public static StringBuilder readCustomerDetails() {

        String line_of_file;
        StringBuilder read_data = new StringBuilder();
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File("CustomerDetails.txt")));

            while ((line_of_file = bf.readLine()) != null) {
                read_data.append(line_of_file).append("\n");
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        return read_data;
    }
}
