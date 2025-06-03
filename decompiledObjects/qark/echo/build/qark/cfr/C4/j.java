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

public final class j
extends v {
    public static j a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static j e() {
        synchronized (j.class) {
            try {
                if (a != null) return a;
                a = new j();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    @Override
    public String c() {
        return "fpr_rl_time_limit_sec";
    }

    public Long d() {
        return 600L;
    }
}

