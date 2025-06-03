/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Throwable
 */
package p0;

import android.os.Looper;
import d0.m;
import d0.q;
import l0.y1;
import p0.D;
import p0.T;
import p0.n;
import p0.v;
import p0.w;
import p0.y;

public interface x {
    public static final x a = new x(){

        @Override
        public void a(Looper looper, y1 y12) {
        }

        @Override
        public int b(q q8) {
            if (q8.r != null) {
                return 1;
            }
            return 0;
        }

        @Override
        public n c(v.a a8, q q8) {
            if (q8.r == null) {
                return null;
            }
            return new D(new n.a((Throwable)new T(1), 6001));
        }

        @Override
        public /* synthetic */ b d(v.a a8, q q8) {
            return w.a(this, a8, q8);
        }

        @Override
        public /* synthetic */ void g() {
            w.b(this);
        }

        @Override
        public /* synthetic */ void release() {
            w.c(this);
        }
    };

    public void a(Looper var1, y1 var2);

    public int b(q var1);

    public n c(v.a var1, q var2);

    public b d(v.a var1, q var2);

    public void g();

    public void release();

    public static interface b {
        public static final b a = new y();

        public void release();
    }

}

