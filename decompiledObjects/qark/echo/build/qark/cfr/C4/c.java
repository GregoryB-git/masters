/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.lang.Throwable
 */
package C4;

import C4.v;

public final class c
extends v {
    public static c a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c d() {
        synchronized (c.class) {
            try {
                if (a != null) return a;
                a = new c();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "isEnabled";
    }

    @Override
    public String b() {
        return "firebase_performance_collection_enabled";
    }
}

