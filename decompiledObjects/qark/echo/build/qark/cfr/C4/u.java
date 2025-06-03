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

public final class u
extends v {
    public static u a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static u f() {
        synchronized (u.class) {
            try {
                if (a != null) return a;
                a = new u();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    @Override
    public String c() {
        return "fpr_vc_trace_sampling_rate";
    }

    public Double d() {
        return 1.0;
    }

    public Double e() {
        return this.d() / 1000.0;
    }
}

