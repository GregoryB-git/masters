/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package D5;

import E5.a;
import E5.c;
import E5.f;
import E5.i;
import java.util.HashMap;
import t5.b;

public class v {
    public final a a;

    public v(w5.a a8) {
        this.a = new a(a8, "flutter/system", f.a);
    }

    public void a() {
        b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put((Object)"type", (Object)"memoryPressure");
        this.a.c((Object)hashMap);
    }
}

