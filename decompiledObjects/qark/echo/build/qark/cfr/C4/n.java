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

public final class n
extends v {
    public static n a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static n f() {
        synchronized (n.class) {
            try {
                if (a != null) return a;
                a = new n();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    @Override
    public String b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    @Override
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    public Long d() {
        return 100L;
    }

    public Long e() {
        return this.d() * 3L;
    }
}

