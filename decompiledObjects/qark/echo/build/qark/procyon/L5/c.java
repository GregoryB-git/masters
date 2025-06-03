// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L5;

import Q3.b;
import java.util.HashMap;
import java.util.Map;
import E5.d;

public abstract class c
{
    public final d.b a;
    public final String b;
    
    public c(final d.b a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public Map g(final String s, final String s2) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("eventType", s);
        if (s2 != null) {
            hashMap.put("previousChildKey", s2);
        }
        return hashMap;
    }
    
    public void h(final String anObject, final b b, final String s) {
        if (!this.b.equals(anObject)) {
            return;
        }
        this.a.a(new x(b).b(this.g(anObject, s)).a());
    }
}
