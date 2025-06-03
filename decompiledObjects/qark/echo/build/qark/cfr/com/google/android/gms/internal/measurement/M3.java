/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.Map
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.X3;
import com.google.android.gms.internal.measurement.Y3;
import java.util.Collections;
import java.util.Map;

public class M3 {
    public static volatile M3 b;
    public static final M3 c;
    public final Map a = Collections.emptyMap();

    static {
        c = new M3(true);
    }

    public M3(boolean bl) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static M3 a() {
        M3 m32 = b;
        if (m32 != null) {
            return m32;
        }
        synchronized (M3.class) {
            try {
                m32 = b;
                if (m32 != null) {
                    return m32;
                }
                b = m32 = X3.a(M3.class);
                return m32;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Y3.d b(I4 i42, int n8) {
        android.support.v4.media.a.a(this.a.get((Object)new a(i42, n8)));
        return null;
    }

    public static final class a {
        public final Object a;
        public final int b;

        public a(Object object, int n8) {
            this.a = object;
            this.b = n8;
        }

        public final boolean equals(Object object) {
            if (!(object instanceof a)) {
                return false;
            }
            object = (a)object;
            if (this.a == object.a && this.b == object.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return System.identityHashCode((Object)this.a) * 65535 + this.b;
        }
    }

}

