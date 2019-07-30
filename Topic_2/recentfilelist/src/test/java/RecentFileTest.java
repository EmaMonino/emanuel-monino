import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class RecentFileTest {
    String StateofFile = "OpenAdded";
    String StateofFileOnRecentFileList = "already exists";
    int RecentFileListStatus = 15;


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void WhenProgramStartListisEmpty() {
        list1 List1 = new list1();
        Assert.assertEquals("empty", List1.status());
    }

    @Test
        public void Whenafileisopeneditisaddedtotherecentfilelist () {
        list1 List2 = new list1();
        List2.open();
        Assert.assertEquals("Open", List2.open());


        if(StateofFile == "OpenAdded" && StateofFileOnRecentFileList == "already exists") {

              System.out.println("File has been added to the Recent file list and to the top of the list");

        }else {
            System.out.println("File has been added to the Recent file list");
        }
        if (RecentFileListStatus > 15){
            System.out.println("Older files get replace by new ones");
        }

    }


    }


