import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Testeo {

    /**
    * Testa a inclusao de ejecutar um registro com os valores
    */
    @Test
    void testInsertAndSearch() {
        BinarioLogica<String> dictionary = new BinarioLogica<>();
        
        assertEquals("casa", dictionary.search("house"));
        assertEquals("tarea", dictionary.search("homework"));
        dictionary.insert("house", "casa");
        dictionary.insert("homework", "tarea");
        
    }
}