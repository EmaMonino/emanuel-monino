import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/* La idea es anular los test de las Opciones no seleccionadas */
public class BlogTest {
String selectedOption = "Post Entry";
String selectedOption1 = "Delete Entry";
String selectedOption2 = "Show recent entries";


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void postnewentry () {
        blog1 Blog2 = new blog1();
        Blog2.posting();
        Assert.assertEquals("Post", Blog2.posting());
        if(selectedOption == "Post Entry") {
            System.out.println("Insert new Post");
        }


    }

    @Test
    public void Deleteexistingentry() {
        blog1 Blog2 = new blog1();
        Blog2.deleteexistingentry();
        Assert.assertEquals("Delete", Blog2.deleteexistingentry());
        if(selectedOption1 == "Delete Entry") {
            System.out.println("Deleting Entry");
        }

    }

    @Test
    public void show10mostrecententries() {
        blog1 Blog2 = new blog1();
        Blog2.show10mostrecententries();
        Assert.assertEquals("Show", Blog2.show10mostrecententries());
        if(selectedOption2 == "Show recent entries"){
            System.out.println("Show the 10 most recent entries");
        }




    }
}
