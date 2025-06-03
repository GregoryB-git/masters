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

public final class l
extends v {
    public static l a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static l e() {
        synchronized (l.class) {
            try {
                if (a != null) return a;
                a = new l();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    @Override
    public String c() {
        return "fpr_enabled";
    }

    public Boolean d() {
        return Boolean.TRUE;
    }
}

