/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.google.protobuf;

import com.google.protobuf.h;
import com.google.protobuf.m0;
import com.google.protobuf.o;

public class D {
    public final a a;
    public final Object b;
    public final Object c;

    public D(m0.b b8, Object object, m0.b b9, Object object2) {
        this.a = new a(b8, object, b9, object2);
        this.b = object;
        this.c = object2;
    }

    public static int b(a a8, Object object, Object object2) {
        return o.b(a8.a, 1, object) + o.b(a8.c, 2, object2);
    }

    public static D d(m0.b b8, Object object, m0.b b9, Object object2) {
        return new D(b8, object, b9, object2);
    }

    public static void e(h h8, a a8, Object object, Object object2) {
        o.u(h8, a8.a, 1, object);
        o.u(h8, a8.c, 2, object2);
    }

    public int a(int n8, Object object, Object object2) {
        return h.O(n8) + h.z(D.b(this.a, object, object2));
    }

    public a c() {
        return this.a;
    }

    public static class a {
        public final m0.b a;
        public final Object b;
        public final m0.b c;
        public final Object d;

        public a(m0.b b8, Object object, m0.b b9, Object object2) {
            this.a = b8;
            this.b = object;
            this.c = b9;
            this.d = object2;
        }
    }

}

