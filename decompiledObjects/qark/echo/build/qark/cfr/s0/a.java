/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 */
package s0;

import android.graphics.Bitmap;
import d0.A;
import d0.q;
import d0.z;
import g0.M;
import j0.h;
import j0.i;
import j0.j;
import j0.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import k0.Z0;
import s0.c;
import s0.d;
import s0.f;

public final class a
extends k
implements s0.c {
    public final b o;

    public a(b b8) {
        super(new i[1], new f[1]);
        this.o = b8;
    }

    public /* synthetic */ a(b b8,  a8) {
        this(b8);
    }

    public static Bitmap B(byte[] arrby, int n8) {
        try {
            Bitmap bitmap = i0.c.a(arrby, n8, null);
            return bitmap;
        }
        catch (IOException iOException) {
            throw new d((Throwable)iOException);
        }
        catch (A a8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not decode image data with BitmapFactory. (data.length = ");
            stringBuilder.append(arrby.length);
            stringBuilder.append(", input length = ");
            stringBuilder.append(n8);
            stringBuilder.append(")");
            throw new d(stringBuilder.toString(), (Throwable)a8);
        }
    }

    public d A(Throwable throwable) {
        return new d("Unexpected decode error", throwable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public d C(i i8, f f8, boolean bl) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer)g0.a.e((Object)i8.r);
            g0.a.f(byteBuffer.hasArray());
            bl = byteBuffer.arrayOffset() == 0;
            g0.a.a(bl);
            f8.s = this.o.a(byteBuffer.array(), byteBuffer.remaining());
            f8.p = i8.t;
            return null;
        }
        catch (d d8) {
            return d8;
        }
    }

    @Override
    public i i() {
        return new i(1);
    }

    public f z() {
        return new f(){

            @Override
            public void x() {
                a.this.t(this);
            }
        };
    }

    public static interface b {
        public Bitmap a(byte[] var1, int var2);
    }

    public static final class c
    implements c.a {
        public final b b = new s0.b();

        public static /* synthetic */ Bitmap c(byte[] arrby, int n8) {
            return c.e(arrby, n8);
        }

        public static /* synthetic */ Bitmap e(byte[] arrby, int n8) {
            return a.B(arrby, n8);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public int a(q q8) {
            int n8;
            String string2 = q8.n;
            if (string2 == null || !z.p(string2)) return Z0.a(0);
            if (M.y0(q8.n)) {
                n8 = 4;
                do {
                    return Z0.a(n8);
                    break;
                } while (true);
            }
            n8 = 1;
            return Z0.a(n8);
        }

        public a d() {
            return new a(this.b, null);
        }
    }

}

