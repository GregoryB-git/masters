// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import java.util.HashMap;
import t5.b;
import E5.i;
import E5.c;
import E5.f;
import E5.a;

public class v
{
    public final a a;
    
    public v(final w5.a a) {
        this.a = new a(a, "flutter/system", f.a);
    }
    
    public void a() {
        b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        final HashMap<String, String> hashMap = new HashMap<String, String>(1);
        hashMap.put("type", "memoryPressure");
        this.a.c(hashMap);
    }
}
