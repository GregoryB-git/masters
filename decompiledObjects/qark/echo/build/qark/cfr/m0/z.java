/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceInfo
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 */
package m0;

import android.media.AudioDeviceInfo;
import d0.C;
import d0.q;
import java.nio.ByteBuffer;
import l0.y1;
import m0.k;

public interface z {
    public void A(g0.c var1);

    public void B();

    public void C(d var1);

    public boolean a(q var1);

    public void b();

    public boolean c();

    public void d(boolean var1);

    public void e();

    public void f(AudioDeviceInfo var1);

    public void flush();

    public void g();

    public C h();

    public boolean i();

    public void j();

    public void k(C var1);

    public void l(float var1);

    public void m(d0.e var1);

    public void n(int var1);

    public int o(q var1);

    public void p();

    public void q(int var1, int var2);

    public k r(q var1);

    public void release();

    public void s(d0.b var1);

    public void t(y1 var1);

    public boolean u(ByteBuffer var1, long var2, int var4);

    public void v(int var1);

    public long w(boolean var1);

    public void x();

    public void y(long var1);

    public void z(q var1, int var2, int[] var3);

    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final int f;

        public a(int n8, int n9, int n10, boolean bl, boolean bl2, int n11) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = bl;
            this.e = bl2;
            this.f = n11;
        }
    }

    public static final class b
    extends Exception {
        public final q o;

        public b(String string2, q q8) {
            super(string2);
            this.o = q8;
        }

        public b(Throwable throwable, q q8) {
            super(throwable);
            this.o = q8;
        }
    }

    public static final class c
    extends Exception {
        public final int o;
        public final boolean p;
        public final q q;

        public c(int n8, int n9, int n10, int n11, q q8, boolean bl, Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioTrack init failed ");
            stringBuilder.append(n8);
            stringBuilder.append(" ");
            stringBuilder.append("Config(");
            stringBuilder.append(n9);
            stringBuilder.append(", ");
            stringBuilder.append(n10);
            stringBuilder.append(", ");
            stringBuilder.append(n11);
            stringBuilder.append(")");
            stringBuilder.append(" ");
            stringBuilder.append((Object)q8);
            String string2 = bl ? " (recoverable)" : "";
            stringBuilder.append(string2);
            super(stringBuilder.toString(), (Throwable)exception);
            this.o = n8;
            this.p = bl;
            this.q = q8;
        }
    }

    public static interface d {
        public void a(a var1);

        public void b(long var1);

        public void c(boolean var1);

        public void d(Exception var1);

        public void e(a var1);

        public void f();

        public void g();

        public void h();

        public void i();

        public void j();

        public void k(int var1, long var2, long var4);
    }

    public static final class e
    extends Exception {
        public final long o;
        public final long p;

        public e(long l8, long l9) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected audio track timestamp discontinuity: expected ");
            stringBuilder.append(l9);
            stringBuilder.append(", got ");
            stringBuilder.append(l8);
            super(stringBuilder.toString());
            this.o = l8;
            this.p = l9;
        }
    }

    public static final class f
    extends Exception {
        public final int o;
        public final boolean p;
        public final q q;

        public f(int n8, q q8, boolean bl) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioTrack write failed: ");
            stringBuilder.append(n8);
            super(stringBuilder.toString());
            this.p = bl;
            this.o = n8;
            this.q = q8;
        }
    }

}

