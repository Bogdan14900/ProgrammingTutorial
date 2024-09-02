package obiectConstructor.Hotel;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hotelTest {

    @Test
    public void  hotelMetoda(){
        Map<String, String> oferta=new HashMap<>() ;
        oferta.put("Durata oferta","30 zile");
        oferta.put("Perioada sedere","10 nopti");
        oferta.put("Numar persoane","4");
        oferta.put("Offseason","Da");

        Hotel Hilton=new Hotel();
        Hilton.prezentareHotel();

    }
}
