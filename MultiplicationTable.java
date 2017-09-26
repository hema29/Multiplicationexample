import java.util.*;
import java.lang.*;
import java.io.*;

public class MultiplicationTables {

    public void print(int n) {
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }
}