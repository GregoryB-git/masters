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

public final class p
extends v {
    public static p a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static p e() {
        synchronized (p.class) {
            try {
                if (a != null) return a;
                a = new p();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override
    public String b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    @Override
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    public Long d() {
        return 0L;
    }
}

