/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31190527_stack; //class berada pada package ini
import static e31190527_stack.E31190527_Stack.in; //sintax untuk mengimport kelas E31190527_Stack
import java.util.ArrayList; //sintax untuk menambah data secara dinamis tanpa harus menentukan ukuran awal
import java.util.List; //sintax dari jenis array yang memperbolehkan value dublicate
import java.util.Scanner; //sintax untuk mengambil input pada keyboard
/**
 *
 * @author Noviansyftr
 */
public class E31190527_Stack { //nama class

    /**
     * @param args the command line arguments
     */
        public static Scanner in=new Scanner(System.in); //sintax untuk inisialisasi Scanner sebagai in
        private List<Object> list=new ArrayList<Object>(); //sintax untuk menginsialisasi list
        private int currentIndex=-1; //sintax untuk inisialisasi sebagai int
    //sintax untuk menambahkan atau push kedalam stack
    public void push(Object object){
        list.add(object); //list tambahkan object
        currentIndex++; //currentIndex +1
    }
    //sintax untuk menghapus atau pop pada stack
    public Object pop(){
        Object object=list.remove(currentIndex); //object adalah list dihapus dari currentIndex
        currentIndex--; //currentIndex -1
        return object; //kembali ke object selanjutnya
    }
    //sintax untuk menampilkan banyak array pada stack
    public int count(){
        return list.size(); //kembali ke ukuran list yang ada
    }
    //sintax untuk menampilkan array teratas pada stack
    public Object peek(){
        return list.get(currentIndex); //kembali ke dapatkan list yang ada
    }
}

class App
{
    public static void main( String[] args ){ //sintax main method untuk menjalankan program
        E31190527_Stack stack=new E31190527_Stack(); //sintax untuk memanggil kelas E31190527_Stack
        String nama; //inisialisasi nama sebagai string
        System.out.print("Masukan Nama : "); 
        nama = in.nextLine(); //nama di input menggunakan keyboard
        stack.push(nama); //tambahkan nama pada stack
        System.out.print("Masukan Nama : ");
        nama = in.nextLine(); //nama di input menggunakan keyboard
        stack.push(nama); //tambahkan nama pada stack
        System.out.print("Masukan Nama : ");
        nama = in.nextLine(); //nama di input menggunakan keyboard
        stack.push(nama); //tambahkan nama pada stack
        
        System.out.println("===========================================");
        
        int count=stack.count(); //memanggil void count berupa int
        Object object=stack.peek(); //object memanggil void peek
        System.out.println("Jumlah Data Pada Stack : "+count);
        System.out.println("Data Teratas Pada Stack : "+object);
        
        System.out.println("===========================================");
        
        object=stack.pop(); //object adalah pop
        System.out.println("Objek yang dikeluarkan (Pop) : "+object);
        count=stack.count(); //object adalah count
        System.out.println("Jumlah Data Pada Stack setelah Pop: "+count);
        
        System.out.println("===========================================");
        
        object=stack.pop(); //object adalah pop
        System.out.println("Objek yang dikeluarkan (Pop) : "+object);
        count=stack.count(); //object adalah count
        System.out.println("Jumlah Data Pada Stack setelah Pop: "+count);
        
        System.out.println("===========================================");
        
        object=stack.peek(); //object adalah peek
        System.out.println("Data Teratas Pada Stack setelah Pop: "+object);
    }
}