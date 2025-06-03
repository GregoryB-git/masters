/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.BigInteger
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.DoubleBuffer
 *  java.nio.FloatBuffer
 *  java.nio.IntBuffer
 *  java.nio.LongBuffer
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package E5;

import E5.i;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class p
implements i {
    public static final p a = new p();
    public static final boolean b;
    public static final Charset c;

    static {
        boolean bl = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        b = bl;
        c = Charset.forName((String)"UTF8");
    }

    public static final void c(ByteBuffer byteBuffer, int n8) {
        int n9 = byteBuffer.position() % n8;
        if (n9 != 0) {
            byteBuffer.position(byteBuffer.position() + n8 - n9);
        }
    }

    public static final byte[] d(ByteBuffer byteBuffer) {
        byte[] arrby = new byte[p.e(byteBuffer)];
        byteBuffer.get(arrby);
        return arrby;
    }

    public static final int e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int n8 = byteBuffer.get() & 255;
            if (n8 < 254) {
                return n8;
            }
            if (n8 == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public static final void h(ByteArrayOutputStream byteArrayOutputStream, int n8) {
        int n9 = byteArrayOutputStream.size() % n8;
        if (n9 != 0) {
            for (int i8 = 0; i8 < n8 - n9; ++i8) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    public static final void i(ByteArrayOutputStream byteArrayOutputStream, byte[] arrby) {
        p.o(byteArrayOutputStream, arrby.length);
        byteArrayOutputStream.write(arrby, 0, arrby.length);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void j(ByteArrayOutputStream byteArrayOutputStream, int n8) {
        if (b) {
            byteArrayOutputStream.write(n8);
            n8 >>>= 8;
        } else {
            byteArrayOutputStream.write(n8 >>> 8);
        }
        byteArrayOutputStream.write(n8);
    }

    public static final void k(ByteArrayOutputStream byteArrayOutputStream, double d8) {
        p.n(byteArrayOutputStream, Double.doubleToLongBits((double)d8));
    }

    public static final void l(ByteArrayOutputStream byteArrayOutputStream, float f8) {
        p.m(byteArrayOutputStream, Float.floatToIntBits((float)f8));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void m(ByteArrayOutputStream byteArrayOutputStream, int n8) {
        if (b) {
            byteArrayOutputStream.write(n8);
            byteArrayOutputStream.write(n8 >>> 8);
            byteArrayOutputStream.write(n8 >>> 16);
            n8 >>>= 24;
        } else {
            byteArrayOutputStream.write(n8 >>> 24);
            byteArrayOutputStream.write(n8 >>> 16);
            byteArrayOutputStream.write(n8 >>> 8);
        }
        byteArrayOutputStream.write(n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void n(ByteArrayOutputStream byteArrayOutputStream, long l8) {
        if (b) {
            byteArrayOutputStream.write((int)((byte)l8));
            byteArrayOutputStream.write((int)((byte)(l8 >>> 8)));
            byteArrayOutputStream.write((int)((byte)(l8 >>> 16)));
            byteArrayOutputStream.write((int)((byte)(l8 >>> 24)));
            byteArrayOutputStream.write((int)((byte)(l8 >>> 32)));
            byteArrayOutputStream.write((int)((byte)(l8 >>> 40)));
            byteArrayOutputStream.write((int)((byte)(l8 >>> 48)));
            l8 >>>= 56;
        } else {
            byteArrayOutputStream.write((int)((byte)(l8 >>> 56)));
            byteArrayOutputStream.write((int)((byte)(l8 >>> 48)));
            byteArrayOutputStream.write((int)((byte)(l8 >>> 40)));
            byteArrayOutputStream.write((int)((byte)(l8 >>> 32)));
            byteArrayOutputStream.write((int)((byte)(l8 >>> 24)));
            byteArrayOutputStream.write((int)((byte)(l8 >>> 16)));
            byteArrayOutputStream.write((int)((byte)(l8 >>> 8)));
        }
        byteArrayOutputStream.write((int)((byte)l8));
    }

    public static final void o(ByteArrayOutputStream byteArrayOutputStream, int n8) {
        if (n8 < 254) {
            byteArrayOutputStream.write(n8);
            return;
        }
        if (n8 <= 65535) {
            byteArrayOutputStream.write(254);
            p.j(byteArrayOutputStream, n8);
            return;
        }
        byteArrayOutputStream.write(255);
        p.m(byteArrayOutputStream, n8);
    }

    @Override
    public ByteBuffer a(Object object) {
        if (object == null) {
            return null;
        }
        a a8 = new a();
        this.p(a8, object);
        object = ByteBuffer.allocateDirect((int)a8.size());
        object.put(a8.a(), 0, a8.size());
        return object;
    }

    @Override
    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object object = this.f(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return object;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public final Object f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return this.g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public Object g(byte var1_1, ByteBuffer var2_2) {
        var4_3 = 0;
        var3_4 = 0;
        switch (var1_1) {
            default: {
                throw new IllegalArgumentException("Message corrupted");
            }
            case 14: {
                var1_1 = (byte)p.e(var2_2);
                var5_5 = new float[var1_1];
                p.c(var2_2, 4);
                var2_2.asFloatBuffer().get(var5_5);
                ** GOTO lbl50
            }
            case 13: {
                var4_3 = p.e(var2_2);
                var6_8 = new HashMap();
                var1_1 = (byte)var3_4;
                do {
                    var5_6 = var6_8;
                    if (var1_1 >= var4_3) return var5_6;
                    var6_8.put(this.f(var2_2), this.f(var2_2));
                    var1_1 = (byte)(var1_1 + 1);
                } while (true);
            }
            case 12: {
                var3_4 = p.e(var2_2);
                var6_9 = new ArrayList(var3_4);
                var1_1 = (byte)var4_3;
                do {
                    var5_6 = var6_9;
                    if (var1_1 >= var3_4) return var5_6;
                    var6_9.add(this.f(var2_2));
                    var1_1 = (byte)(var1_1 + 1);
                } while (true);
            }
            case 11: {
                var1_1 = (byte)p.e(var2_2);
                var5_7 = new double[var1_1];
                p.c(var2_2, 8);
                var2_2.asDoubleBuffer().get(var5_7);
                ** GOTO lbl43
            }
            case 10: {
                var1_1 = (byte)p.e(var2_2);
                var5_7 = new long[var1_1];
                p.c(var2_2, 8);
                var2_2.asLongBuffer().get((long[])var5_7);
lbl43: // 2 sources:
                var2_2.position(var2_2.position() + var1_1 * 8);
                return var5_7;
            }
            case 9: {
                var1_1 = (byte)p.e(var2_2);
                var5_5 = new int[var1_1];
                p.c(var2_2, 4);
                var2_2.asIntBuffer().get((int[])var5_5);
lbl50: // 2 sources:
                var2_2.position(var2_2.position() + var1_1 * 4);
                return var5_5;
            }
            case 8: {
                return p.d(var2_2);
            }
            case 7: {
                return new String(p.d(var2_2), p.c);
            }
            case 6: {
                p.c(var2_2, 8);
                return var2_2.getDouble();
            }
            case 5: {
                return new BigInteger(new String(p.d(var2_2), p.c), 16);
            }
            case 4: {
                return var2_2.getLong();
            }
            case 3: {
                return var2_2.getInt();
            }
            case 2: {
                return Boolean.FALSE;
            }
            case 1: {
                return Boolean.TRUE;
            }
            case 0: 
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void p(ByteArrayOutputStream byteArrayOutputStream, Object iterator) {
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        if (iterator != null && !iterator.equals((Object)null)) {
            int n11;
            if (iterator instanceof Boolean) {
                n11 = (Boolean)iterator != false ? 1 : 2;
                byteArrayOutputStream.write(n11);
                return;
            }
            if (iterator instanceof Number) {
                if (!(iterator instanceof Integer || iterator instanceof Short || iterator instanceof Byte)) {
                    if (iterator instanceof Long) {
                        byteArrayOutputStream.write(4);
                        p.n(byteArrayOutputStream, (Long)iterator);
                        return;
                    }
                    if (!(iterator instanceof Float) && !(iterator instanceof Double)) {
                        if (iterator instanceof BigInteger) {
                            byteArrayOutputStream.write(5);
                            p.i(byteArrayOutputStream, ((BigInteger)iterator).toString(16).getBytes(c));
                            return;
                        }
                        byteArrayOutputStream = new StringBuilder();
                        byteArrayOutputStream.append("Unsupported Number type: ");
                        byteArrayOutputStream.append((Object)iterator.getClass());
                        throw new IllegalArgumentException(byteArrayOutputStream.toString());
                    }
                    byteArrayOutputStream.write(6);
                    p.h(byteArrayOutputStream, 8);
                    p.k(byteArrayOutputStream, ((Number)iterator).doubleValue());
                    return;
                }
                byteArrayOutputStream.write(3);
                p.m(byteArrayOutputStream, ((Number)iterator).intValue());
                return;
            }
            if (iterator instanceof CharSequence) {
                byteArrayOutputStream.write(7);
                p.i(byteArrayOutputStream, iterator.toString().getBytes(c));
                return;
            }
            if (iterator instanceof byte[]) {
                byteArrayOutputStream.write(8);
                p.i(byteArrayOutputStream, (byte[])iterator);
                return;
            }
            if (iterator instanceof int[]) {
                byteArrayOutputStream.write(9);
                iterator = iterator;
                p.o(byteArrayOutputStream, iterator.length);
                p.h(byteArrayOutputStream, 4);
                n8 = iterator.length;
                for (n11 = 0; n11 < n8; ++n11) {
                    p.m(byteArrayOutputStream, (int)iterator[n11]);
                }
                return;
            } else if (iterator instanceof long[]) {
                byteArrayOutputStream.write(10);
                iterator = (long[])iterator;
                p.o(byteArrayOutputStream, iterator.length);
                p.h(byteArrayOutputStream, 8);
                n9 = iterator.length;
                for (n11 = n8; n11 < n9; ++n11) {
                    p.n(byteArrayOutputStream, (long)iterator[n11]);
                }
                return;
            } else if (iterator instanceof double[]) {
                byteArrayOutputStream.write(11);
                iterator = (double[])iterator;
                p.o(byteArrayOutputStream, iterator.length);
                p.h(byteArrayOutputStream, 8);
                n8 = iterator.length;
                for (n11 = n9; n11 < n8; ++n11) {
                    p.k(byteArrayOutputStream, (double)iterator[n11]);
                }
                return;
            } else if (iterator instanceof List) {
                byteArrayOutputStream.write(12);
                iterator = iterator;
                p.o(byteArrayOutputStream, iterator.size());
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    this.p(byteArrayOutputStream, iterator.next());
                }
                return;
            } else if (iterator instanceof Map) {
                byteArrayOutputStream.write(13);
                iterator = (Map)iterator;
                p.o(byteArrayOutputStream, iterator.size());
                for (Map.Entry entry : iterator.entrySet()) {
                    this.p(byteArrayOutputStream, entry.getKey());
                    this.p(byteArrayOutputStream, entry.getValue());
                }
                return;
            } else {
                if (!(iterator instanceof float[])) {
                    byteArrayOutputStream = new StringBuilder();
                    byteArrayOutputStream.append("Unsupported value: '");
                    byteArrayOutputStream.append((Object)iterator);
                    byteArrayOutputStream.append("' of type '");
                    byteArrayOutputStream.append((Object)iterator.getClass());
                    byteArrayOutputStream.append("'");
                    throw new IllegalArgumentException(byteArrayOutputStream.toString());
                }
                byteArrayOutputStream.write(14);
                iterator = iterator;
                p.o(byteArrayOutputStream, iterator.length);
                p.h(byteArrayOutputStream, 4);
                n8 = iterator.length;
                for (n11 = n10; n11 < n8; ++n11) {
                    p.l(byteArrayOutputStream, (float)iterator[n11]);
                }
            }
            return;
        } else {
            byteArrayOutputStream.write(0);
        }
    }

    public static final class a
    extends ByteArrayOutputStream {
        public byte[] a() {
            return this.buf;
        }
    }

}

