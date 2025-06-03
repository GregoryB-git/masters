/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.String
 *  java.lang.Throwable
 */
package C4;

import C4.v;

public final class g
extends v {
    public static g a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static g e() {
        synchronized (g.class) {
            try {
                if (a != null) return a;
                a = new g();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    @Override
    public String c() {
        return "fpr_rl_network_event_count_bg";
    }

    public Long d() {
        return 70L;
    }
}

