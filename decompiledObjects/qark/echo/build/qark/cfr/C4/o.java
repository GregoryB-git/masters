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

public final class o
extends v {
    public static o a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static o e() {
        synchronized (o.class) {
            try {
                if (a != null) return a;
                a = new o();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    @Override
    public String b() {
        return "sessions_max_length_minutes";
    }

    @Override
    public String c() {
        return "fpr_session_max_duration_min";
    }

    public Long d() {
        return 240L;
    }
}

