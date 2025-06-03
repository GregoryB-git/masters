/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.lang.Throwable
 */
package C4;

import C4.v;

public final class k
extends v {
    public static k a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static k e() {
        synchronized (k.class) {
            try {
                if (a != null) return a;
                a = new k();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    @Override
    public String c() {
        return "fpr_disabled_android_versions";
    }

    public String d() {
        return "";
    }
}

