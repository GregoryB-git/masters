/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.Map
 */
package com.google.protobuf;

import com.google.protobuf.j;
import java.util.Collections;
import java.util.Map;

public class k {
    public static boolean b = true;
    public static volatile k c;
    public static final k d;
    public final Map a = Collections.emptyMap();

    static {
        d = new k(true);
    }

    public k(boolean bl) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static k a() {
        k k8 = c;
        if (k8 != null) {
            return k8;
        }
        synchronized (k.class) {
            try {
                k k9;
                k8 = k9 = c;
                if (k9 == null) {
                    k8 = b ? j.a() : d;
                    c = k8;
                }
                return k8;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

