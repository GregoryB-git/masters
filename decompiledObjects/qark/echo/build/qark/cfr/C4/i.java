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

public final class i
extends v {
    public static i a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static i f() {
        synchronized (i.class) {
            try {
                if (a != null) return a;
                a = new i();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    @Override
    public String c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    public Double d() {
        return 1.0;
    }

    public Double e() {
        return this.d() / 1000.0;
    }
}

