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

public final class t
extends v {
    public static t a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static t e() {
        synchronized (t.class) {
            try {
                if (a != null) return a;
                a = new t();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    @Override
    public String c() {
        return "fpr_rl_trace_event_count_fg";
    }

    public Long d() {
        return 300L;
    }
}

