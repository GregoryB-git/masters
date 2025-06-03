/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.String
 *  java.lang.Throwable
 */
package C4;

import C4.v;

public final class r
extends v {
    public static r a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static r f() {
        synchronized (r.class) {
            try {
                if (a != null) return a;
                a = new r();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    @Override
    public String b() {
        return "sessions_sampling_percentage";
    }

    @Override
    public String c() {
        return "fpr_vc_session_sampling_rate";
    }

    public Double d() {
        return 0.01;
    }

    public Double e() {
        return this.d() / 1000.0;
    }
}

