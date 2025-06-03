/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicReference
 */
package k3;

import java.util.concurrent.atomic.AtomicReference;
import k3.f;
import n3.b;
import n3.c;

public final class g {
    public static final g b = new g();
    public static final b c = new b(null);
    public final AtomicReference a = new AtomicReference();

    public static g b() {
        return b;
    }

    public n3.b a() {
        n3.b b8;
        n3.b b9 = b8 = (n3.b)this.a.get();
        if (b8 == null) {
            b9 = c;
        }
        return b9;
    }

    public static class b
    implements n3.b {
        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        @Override
        public b.a a(c c8, String string2, String string3) {
            return f.a;
        }
    }

}

