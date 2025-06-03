/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s;

public class H {
    public final a a;
    public final Object b;
    public final Object c;

    public H(r0.b b8, Object object, r0.b b9, Object object2) {
        this.a = new a(b8, object, b9, object2);
        this.b = object;
        this.c = object2;
    }

    public static int b(a a8, Object object, Object object2) {
        return s.b(a8.a, 1, object) + s.b(a8.c, 2, object2);
    }

    public static H d(r0.b b8, Object object, r0.b b9, Object object2) {
        return new H(b8, object, b9, object2);
    }

    public static void e(j j8, a a8, Object object, Object object2) {
        s.u(j8, a8.a, 1, object);
        s.u(j8, a8.c, 2, object2);
    }

    public int a(int n8, Object object, Object object2) {
        return j.P(n8) + j.y(H.b(this.a, object, object2));
    }

    public a c() {
        return this.a;
    }

    public static class a {
        public final r0.b a;
        public final Object b;
        public final r0.b c;
        public final Object d;

        public a(r0.b b8, Object object, r0.b b9, Object object2) {
            this.a = b8;
            this.b = object;
            this.c = b9;
            this.d = object2;
        }
    }

}

