/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.google.firebase.remoteconfig.internal;

import P4.q;
import P4.s;

public class f
implements q {
    public final long a;
    public final int b;
    public final s c;

    public f(long l8, int n8, s s8) {
        this.a = l8;
        this.b = n8;
        this.c = s8;
    }

    public /* synthetic */ f(long l8, int n8, s s8,  a8) {
        this(l8, n8, s8);
    }

    public static b d() {
        return new b(null);
    }

    @Override
    public long a() {
        return this.a;
    }

    @Override
    public s b() {
        return this.c;
    }

    @Override
    public int c() {
        return this.b;
    }

    public static class b {
        public long a;
        public int b;
        public s c;

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public f a() {
            return new f(this.a, this.b, this.c, null);
        }

        public b b(s s8) {
            this.c = s8;
            return this;
        }

        public b c(int n8) {
            this.b = n8;
            return this;
        }

        public b d(long l8) {
            this.a = l8;
            return this;
        }
    }

}

