import java.lang.reflect.Array;

public class Cities {
   String Id;
   String Name;
   String Virus;
   String City1;
   String City2;
   String City3;

    public static void main(String [] args)
    {
        Cities cities1 = new Cities("1","Fabelas","2","2","3","4");
        Cities cities2 = new Cities("2","Mozanbique","3","1","3","4");
        Cities cities3 = new Cities("3","Mogavisio","1","1","2","4");
        Cities cities4 = new Cities("3","Montevideo","1","1","2","4");
    }

    Cities(String _Id,String _name,String _virus,String _city1, String _city2, String _city3)
    {
        this.Id = _Id;
        this.Name = _name;
        this.Virus = _virus;
        this.City1 = _city1;
        this.City2 = _city2;
        this.City3 = _city3;
    }





}
