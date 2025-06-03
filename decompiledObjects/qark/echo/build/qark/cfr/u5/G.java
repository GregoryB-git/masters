/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.AssertionError
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 */
package u5;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class G {
    public long a;
    public b b;
    public long c;
    public long d;
    public boolean e;
    public a f;
    public String g;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ByteBuffer a() {
        byte[] arrby;
        block5 : {
            block4 : {
                try {
                    arrby = this.g;
                    if (arrby != null) break block4;
                    arrby = null;
                    break block5;
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    throw new AssertionError((Object)"UTF-8 not supported");
                }
            }
            arrby = arrby.getBytes("UTF-8");
        }
        int n8 = arrby == null ? 0 : arrby.length;
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int)(n8 + 56));
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putLong((long)n8);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b.e());
        byteBuffer.putLong(this.c);
        byteBuffer.putLong(this.d);
        long l8 = this.e ? 1L : 0L;
        byteBuffer.putLong(l8);
        byteBuffer.putLong(this.f.e());
        if (arrby == null) return byteBuffer;
        byteBuffer.put(arrby);
        return byteBuffer;
    }

    public static final class a
    extends Enum {
        public static final /* enum */ a p = new a(0L);
        public static final /* enum */ a q = new a(1L);
        public static final /* enum */ a r = new a(2L);
        public static final /* enum */ a s = new a(3L);
        public static final /* enum */ a t = new a(4L);
        public static final /* synthetic */ a[] u;
        public final long o;

        static {
            u = a.c();
        }

        public a(long l8) {
            this.o = l8;
        }

        public static /* synthetic */ a[] c() {
            return new a[]{p, q, r, s, t};
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])u.clone();
        }

        public long e() {
            return this.o;
        }
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b p = new b(0L);
        public static final /* enum */ b q = new b(1L);
        public static final /* enum */ b r = new b(2L);
        public static final /* synthetic */ b[] s;
        public long o;

        static {
            s = b.c();
        }

        public b(long l8) {
            this.o = l8;
        }

        public static /* synthetic */ b[] c() {
            return new b[]{p, q, r};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])s.clone();
        }

        public long e() {
            return this.o;
        }
    }

}

