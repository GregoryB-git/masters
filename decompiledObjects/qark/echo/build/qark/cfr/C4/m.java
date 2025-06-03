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

public final class m
extends v {
    public static m a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static m e() {
        synchronized (m.class) {
            try {
                if (a != null) return a;
                a = new m();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    @Override
    public String b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    @Override
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    public Long d() {
        return 0L;
    }
}

