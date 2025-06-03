/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package C4;

import A4.a;
import C4.v;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class f
extends v {
    public static f a;
    public static final Map b;

    static {
        b = Collections.unmodifiableMap((Map)new HashMap(){
            {
                this.put((Object)461L, (Object)"FIREPERF_AUTOPUSH");
                this.put((Object)462L, (Object)"FIREPERF");
                this.put((Object)675L, (Object)"FIREPERF_INTERNAL_LOW");
                this.put((Object)676L, (Object)"FIREPERF_INTERNAL_HIGH");
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static f e() {
        synchronized (f.class) {
            try {
                if (a != null) return a;
                a = new f();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static String f(long l8) {
        return (String)b.get((Object)l8);
    }

    public static boolean g(long l8) {
        return b.containsKey((Object)l8);
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    @Override
    public String c() {
        return "fpr_log_source";
    }

    public String d() {
        return a.c;
    }

}

