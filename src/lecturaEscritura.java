
import java.io.*;

public class lecturaEscritura{

    File texto3 = new File("C:\\inteliji\\primitiveWriteUTF\\texto3.txt");

    FileOutputStream fos = new FileOutputStream(texto3);
    DataOutputStream escribirCadea = new DataOutputStream(fos);

    public lecturaEscritura() throws IOException {
        //Escribir a cadea de texto as veces indicadas
        escribirCadeaDeTexto();
        //Leer as cadeas de texto
        leerCadeaDeTexto();
    }
    public void escribirCadeaDeTexto() throws IOException {
        String cadeaDeTexto="o tempo está xélido";
            //Comezamos o bucle para escribilo tres veces
        for (int numeroDeVeces = 0;numeroDeVeces <= 3; numeroDeVeces++){
            //Escribimos a cadea de texto:
            escribirCadea.writeUTF(cadeaDeTexto);
            escribirCadea.flush();
            //Mostramos la lonngitud del archivo:
            System.out.println("Tamaño del archivo después de la escritura " + numeroDeVeces + ": " + texto3.length() + " bytes");
        }
    }

    public void leerCadeaDeTexto()throws IOException {
            //Creamos un FileInputStream para poder ler dende o arquivo
        FileInputStream arquivoALeer = new FileInputStream(texto3);
        DataInputStream lecturaDoArquivo = new DataInputStream(arquivoALeer);
            //Leer e mostrar as cadeas de texto
            while (lecturaDoArquivo.available() >0){
                String cadeaLeida = lecturaDoArquivo.readUTF();
                System.out.println("A cadea e: " + cadeaLeida);
        }
    }
    //Fin del código
}
