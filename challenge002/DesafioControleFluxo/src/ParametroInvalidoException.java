public class ParametroInvalidoException extends RuntimeException{
    String name;
    ParametroInvalidoException(String name ){
        this.name= name;
    }
    String getName(){
        return name;
    }
}
