import java.util.*;

import org.hyperdex.client.Client;
import org.hyperdex.client.ByteString;
import org.hyperdex.client.HyperDexClientException;
import org.hyperdex.client.Iterator;
import org.hyperdex.client.LessEqual;
import org.hyperdex.client.GreaterEqual;
import org.hyperdex.client.Range;
import org.hyperdex.client.Regex;
import org.hyperdex.client.LengthEquals;
import org.hyperdex.client.LengthLessEqual;
import org.hyperdex.client.LengthGreaterEqual;

public class DataTypeMapStringString
{
    public static void main(String[] args) throws HyperDexClientException
    {
        Client c = new Client(args[0], Integer.parseInt(args[1]));
        Map<String, Object> attrs0 = new HashMap<String, Object>();
        Object obj0 = c.put("kv", "k", attrs0);
        assert(obj0 != null);
        Boolean bool0 = (Boolean)obj0;
        assert(bool0 == true);
        Map<String, Object> get1 = c.get("kv", "k");
        assert(get1 != null);
        Map<String, Object> expected1 = new HashMap<String, Object>();
        Map<Object, Object> map2 = new HashMap<Object, Object>();
        expected1.put("v", map2);
        get1.equals(expected1);
        Map<String, Object> attrs3 = new HashMap<String, Object>();
        Map<Object, Object> map4 = new HashMap<Object, Object>();
        map4.put("A", "X");
        map4.put("B", "Y");
        map4.put("C", "Z");
        attrs3.put("v", map4);
        Object obj3 = c.put("kv", "k", attrs3);
        assert(obj3 != null);
        Boolean bool3 = (Boolean)obj3;
        assert(bool3 == true);
        Map<String, Object> get5 = c.get("kv", "k");
        assert(get5 != null);
        Map<String, Object> expected5 = new HashMap<String, Object>();
        Map<Object, Object> map6 = new HashMap<Object, Object>();
        map6.put("A", "X");
        map6.put("B", "Y");
        map6.put("C", "Z");
        expected5.put("v", map6);
        get5.equals(expected5);
        Map<String, Object> attrs7 = new HashMap<String, Object>();
        Map<Object, Object> map8 = new HashMap<Object, Object>();
        attrs7.put("v", map8);
        Object obj7 = c.put("kv", "k", attrs7);
        assert(obj7 != null);
        Boolean bool7 = (Boolean)obj7;
        assert(bool7 == true);
        Map<String, Object> get9 = c.get("kv", "k");
        assert(get9 != null);
        Map<String, Object> expected9 = new HashMap<String, Object>();
        Map<Object, Object> map10 = new HashMap<Object, Object>();
        expected9.put("v", map10);
        get9.equals(expected9);
    }
}
