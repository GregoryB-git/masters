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

public final class s
extends v {
    public static s a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static s e() {
        synchronized (s.class) {
            try {
                if (a != null) return a;
                a = new s();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    @Override
    public String c() {
        return "fpr_rl_trace_event_count_bg";
    }

    public Long d() {
        return 30L;
    }
}

