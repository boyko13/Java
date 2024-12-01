import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class PassWordGenerator {

    int passwordLength;


    ArrayList<String> passwrod = new ArrayList<String>();
    String[] chars = {

            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",

            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",

            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",

            "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=",
            "+", "[", "]", "{", "}", ";", ":", "'", "\"", ",", ".", "/", "<",
            ">", "?", "\\", "|", "`", "~"
    };
    PassWordGenerator(int length){
        this.passwordLength = length;

    }

    public void generatorHasla(int passwordLength){
        Random random = new Random();
            for (int i = 0; i < passwordLength; i++) {

                int index = random.nextInt(chars.length);

                passwrod.add(chars[index]);
            }
        String passwordString = String.join("", passwrod);
        System.out.println(passwordString);

    }






}
