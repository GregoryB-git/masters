// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L5;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import Q3.b;
import java.util.Map;

public class x
{
    public Map a;
    
    public x(final b b) {
        this.a = new HashMap();
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("key", b.e());
        hashMap.put("value", (String)b.h());
        hashMap.put("priority", (String)b.f());
        final int n = (int)b.d();
        List<String> list;
        if (n == 0) {
            list = new ArrayList<String>();
        }
        else {
            final String[] a = new String[n];
            final Iterator<b> iterator = b.c().iterator();
            int n2 = 0;
            while (iterator.hasNext()) {
                a[n2] = iterator.next().e();
                ++n2;
            }
            list = Arrays.asList(a);
        }
        hashMap.put("childKeys", (String)list);
        this.a.put("snapshot", hashMap);
    }
    
    public Map a() {
        return this.a;
    }
    
    public x b(final Map map) {
        (this.a = new HashMap()).putAll(this.a);
        this.a.putAll(map);
        return this;
    }
}
