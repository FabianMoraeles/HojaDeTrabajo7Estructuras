import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    /**
    * Metodo que dibuja el programa de inorder traversar la BST y retorna un traducci
    * 
    * @param args - Arreglo de parametros a mostrar
    */
    /**
    * Metodo que permite realizar el programa de traduccion de la palabra
    * 
    * @param args - Nombre de entrada a generar
    */
    public static void main(String[] args) {
        BinarioLogica<String> bst = new BinarioLogica<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
            String line;
            // Reads a line of text and inserts it into the buffer.
            // Reads a line of text and inserts it into the buffer.
            while ((line = reader.readLine()) != null) {
                
                String[] words = line.split(",");
                
                String englishWord = words[0].trim().replaceAll("\\(", "");
                String spanishWord = words[1].trim().replaceAll("\\)", "");
                
                bst.insert(englishWord, spanishWord);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        
        System.out.println("Recorrido InOrder:");
        bst.inOrderTraversal();

        
        String wordToSearch = "yes";
        String translation = bst.search(wordToSearch);
        // Las la traducción de la palabra.
        // Las la traducción de la palabra.
        if (!translation.equals(wordToSearch)) {
            System.out.println("La traducción de '" + wordToSearch + "' es '" + translation + "'");
        } else {
            System.out.println("La palabra '" + wordToSearch + "' no fue encontrada en el árbol.");
        }
    
    try {
        BufferedReader reader = new BufferedReader(new FileReader("texto.txt"));
        String line;
        // Traducir cada palabra y mostrar la salida.
        // Las la salida a la salida
        while ((line = reader.readLine()) != null) {
            
            String[] words = line.split(" ");
            // Traducir cada palabra y mostrar la salida
            for (String word : words) {
                String conversion = bst.search(word.toLowerCase()); 
                // Prints the word to System. out. print conversion word. toLowerCase
                // Prints the word to System. out. print conversion word. toLowerCase
                if (conversion.equals(word.toLowerCase())) {
                    System.out.print("*" + word + "* ");
                } else {
                    System.out.print(conversion + " ");
                }
            }
            
            System.out.println();
        }
        reader.close();
    } catch (IOException e) {
        System.err.println("Error al leer el archivo de texto: " + e.getMessage());
    }
}
}