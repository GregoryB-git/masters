/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package v5;

import java.util.HashMap;
import java.util.Map;

public class a {
    public static a b;
    public final Map a = new HashMap();

    public static a b() {
        if (b == null) {
            b = new a();
        }
        return b;
    }

    public io.flutter.embedding.engine.a a(String string2) {
        return (io.flutter.embedding.engine.a)this.a.get((Object)string2);
    }

    public void c(String string2, io.flutter.embedding.engine.a a8) {
        if (a8 != null) {
            this.a.put((Object)string2, (Object)a8);
            return;
        }
        this.a.remove((Object)string2);
    }

    public void d(String string2) {
        this.c(string2, null);
    }
}

