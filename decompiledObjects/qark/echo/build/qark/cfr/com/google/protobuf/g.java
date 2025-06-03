/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.google.protobuf;

import com.google.protobuf.v;

public abstract class g {
    public static volatile int d = 100;
    public int a = d;
    public int b = Integer.MAX_VALUE;
    public boolean c = false;

    public g() {
    }

    public /* synthetic */ g( a8) {
        this();
    }

    public static g a(byte[] arrby) {
        return g.b(arrby, 0, arrby.length);
    }

    public static g b(byte[] arrby, int n8, int n9) {
        return g.c(arrby, n8, n9, false);
    }

    public static g c(byte[] object, int n8, int n9, boolean bl) {
        object = new b((byte[])object, n8, n9, bl, null);
        try {
            object.e(n9);
            return object;
        }
        catch (v v8) {
            throw new IllegalArgumentException((Throwable)v8);
        }
    }

    public static final class b
    extends g {
        public final byte[] e;
        public final boolean f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k = Integer.MAX_VALUE;

        public b(byte[] arrby, int n8, int n9, boolean bl) {
            super(null);
            this.e = arrby;
            this.g = n9 + n8;
            this.i = n8;
            this.j = n8;
            this.f = bl;
        }

        public /* synthetic */ b(byte[] arrby, int n8, int n9, boolean bl,  a8) {
            this(arrby, n8, n9, bl);
        }

        public int d() {
            return this.i - this.j;
        }

        public int e(int n8) {
            if (n8 >= 0) {
                if ((n8 += this.d()) >= 0) {
                    int n9 = this.k;
                    if (n8 <= n9) {
                        this.k = n8;
                        this.f();
                        return n9;
                    }
                    throw v.d();
                }
                throw v.c();
            }
            throw v.b();
        }

        public final void f() {
            int n8;
            this.g = n8 = this.g + this.h;
            int n9 = n8 - this.j;
            int n10 = this.k;
            if (n9 > n10) {
                this.h = n9 -= n10;
                this.g = n8 - n9;
                return;
            }
            this.h = 0;
        }
    }

}

