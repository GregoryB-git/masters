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

public final class d
extends v {
    public static d a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d e() {
        synchronized (d.class) {
            try {
                if (a != null) return a;
                a = new d();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override
    public String b() {
        return "experiment_app_start_ttid";
    }

    @Override
    public String c() {
        return "fpr_experiment_app_start_ttid";
    }

    public Boolean d() {
        return Boolean.FALSE;
    }
}

