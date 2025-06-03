// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p5;

import n5.F;
import java.util.HashMap;
import java.util.Map;

public abstract class h
{
    public static Map a(final e e) {
        final F d = e.d();
        if (d != null) {
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("sql", d.c());
            hashMap.put("arguments", (String)d.b());
            return hashMap;
        }
        return null;
    }
}
