/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.String
 *  java.lang.Throwable
 */
package C4;

import C4.v;

public final class b
extends v {
    public static b a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b e() {
        synchronized (b.class) {
            try {
                if (a != null) return a;
                a = new b();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String b() {
        return "firebase_performance_collection_deactivated";
    }

    public Boolean d() {
        return Boolean.FALSE;
    }
}

