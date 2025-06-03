/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package L5;

import E5.d;
import L5.x;
import Q3.b;
import java.util.HashMap;
import java.util.Map;

public abstract class c {
    public final d.b a;
    public final String b;

    public c(d.b b8, String string2) {
        this.a = b8;
        this.b = string2;
    }

    public Map g(String string2, String string3) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"eventType", (Object)string2);
        if (string3 != null) {
            hashMap.put((Object)"previousChildKey", (Object)string3);
        }
        return hashMap;
    }

    public void h(String string2, b object, String string3) {
        if (!this.b.equals((Object)string2)) {
            return;
        }
        object = new x((b)object);
        string2 = this.g(string2, string3);
        this.a.a((Object)object.b((Map)string2).a());
    }
}

