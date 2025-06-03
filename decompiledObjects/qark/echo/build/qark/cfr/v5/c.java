/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 */
package v5;

import io.flutter.embedding.engine.b;
import java.util.HashMap;
import java.util.Map;

public class c {
    public static volatile c b;
    public final Map a = new HashMap();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c b() {
        if (b != null) return b;
        synchronized (c.class) {
            try {
                if (b != null) return b;
                b = new c();
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public b a(String string2) {
        return (b)this.a.get((Object)string2);
    }
}

