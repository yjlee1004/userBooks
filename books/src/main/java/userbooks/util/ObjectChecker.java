package userbooks.util;

/**
 * Created by yjlee on 2018-07-16.
 */
public class ObjectChecker {

    public static void shouldNotNull(Object value , String msg){
        if(value ==null) throw new IllegalArgumentException(msg);
    }
    public static void shouldNotNullEmpty(String value , String msg){
        if(value==null || value.isEmpty()) throw new IllegalArgumentException(msg);
    }
}
