package File;

import java.io.*;

public class Main {
    public static void main(String [] args){
        File file = new File("mytxt");
        File file2 = new File("mytxt2");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            int symbol = br.read(), symbol1 = br2.read();
            int povtor = 0, razn = 0;
            while(symbol != -1 || symbol1 != -1)
            {
                char c = (char) symbol, c1 = (char) symbol1;
                if(c == c1)
                    povtor++;
                else
                    razn++;
                symbol = br.read();
                symbol1 = br2.read();
            }
            System.out.println(povtor + " " + razn);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //System.out.println(file.length()); //длина
        //System.out.println(file.getAbsolutePath()); //ссылка
        //System.out.println(file.getPath()); //название
        //System.out.println(file.lastModified()); //когда последний раз меняли файл
        //System.out.println(file.exists()); //можно ли обратиться к файлу

        //System.out.println(new Date(file.lastModified()).toString());
        //String a[] = file.list(); //по строкам
        //File list[] = file.listFiles(); //сохраняет в файлы
        //for(File f: list){
            //System.out.println(f.getName() + " " + f.isFile());
        //}
        //System.out.println();
        //for (int i = 0; i < a.length; i++) {
           // System.out.println(a[i]);
        //}


        //Записывающий поток
        //если файла нет, он сам его создаст
        //int a = 255;
        //try {
            //PrintWriter pw = new PrintWriter(new FileWriter(file)); //нужен Exaption
            //pw.print(Integer.toBinaryString(a) + " ");
            //pw.print(Integer.toOctalString(a) + " ");
            //pw.print(Integer.toHexString(a));
            //pw.close();//теперь записывается в файл
        //} catch (IOException e) {
            //throw new RuntimeException(e);
        //}


        //Считывающий поток
        //try {
            //Scanner in = new Scanner(file); //сканнер сам себе поток
            //while(in.hasNext()){ //до конца файла
                //System.out.println(in.nextInt() * 2);
            //}
        //} catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
        //}

    }
}
