// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package v5;

import java.util.HashMap;
import java.util.Map;

public class a
{
    public static a b;
    public final Map a;
    
    public a() {
        this.a = new HashMap();
    }
    
    public static a b() {
        if (a.b == null) {
            a.b = new a();
        }
        return a.b;
    }
    
    public io.flutter.embedding.engine.a a(final String s) {
        return this.a.get(s);
    }
    
    public void c(final String s, final io.flutter.embedding.engine.a a) {
        if (a != null) {
            this.a.put(s, a);
            return;
        }
        this.a.remove(s);
    }
    
    public void d(final String s) {
        this.c(s, null);
    }
}
