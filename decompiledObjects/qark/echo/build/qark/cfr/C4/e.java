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

public final class e
extends v {
    public static e a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e e() {
        synchronized (e.class) {
            try {
                if (a != null) return a;
                a = new e();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    @Override
    public String b() {
        return "fragment_sampling_percentage";
    }

    @Override
    public String c() {
        return "fpr_vc_fragment_sampling_rate";
    }

    public Double d() {
        return 0.0;
    }
}

