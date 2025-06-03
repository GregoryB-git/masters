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
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.x;
import java.util.Collections;
import java.util.Map;

public class p {
    public static boolean b = true;
    public static volatile p c;
    public static final p d;
    public final Map a = Collections.emptyMap();

    static {
        d = new p(true);
    }

    public p(boolean bl) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static p b() {
        p p8 = c;
        if (p8 != null) {
            return p8;
        }
        synchronized (p.class) {
            try {
                p p9;
                p8 = p9 = c;
                if (p9 == null) {
                    p8 = b ? o.a() : d;
                    c = p8;
                }
                return p8;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public x.c a(O o8, int n8) {
        android.support.v4.media.a.a(this.a.get((Object)new a(o8, n8)));
        return null;
    }

    public static final class a {
        public final Object a;
        public final int b;

        public a(Object object, int n8) {
            this.a = object;
            this.b = n8;
        }

        public boolean equals(Object object) {
            boolean bl = object instanceof a;
            boolean bl2 = false;
            if (!bl) {
                return false;
            }
            object = (a)object;
            bl = bl2;
            if (this.a == object.a) {
                bl = bl2;
                if (this.b == object.b) {
                    bl = true;
                }
            }
            return bl;
        }

        public int hashCode() {
            return System.identityHashCode((Object)this.a) * 65535 + this.b;
        }
    }

}

