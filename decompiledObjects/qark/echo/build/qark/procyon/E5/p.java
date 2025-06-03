// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E5;

import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public class p implements i
{
    public static final p a;
    public static final boolean b;
    public static final Charset c;
    
    static {
        a = new p();
        b = (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN);
        c = Charset.forName("UTF8");
    }
    
    public static final void c(final ByteBuffer byteBuffer, final int n) {
        final int n2 = byteBuffer.position() % n;
        if (n2 != 0) {
            byteBuffer.position(byteBuffer.position() + n - n2);
        }
    }
    
    public static final byte[] d(final ByteBuffer byteBuffer) {
        final byte[] dst = new byte[e(byteBuffer)];
        byteBuffer.get(dst);
        return dst;
    }
    
    public static final int e(final ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        final int n = byteBuffer.get() & 0xFF;
        if (n < 254) {
            return n;
        }
        if (n == 254) {
            return byteBuffer.getChar();
        }
        return byteBuffer.getInt();
    }
    
    public static final void h(final ByteArrayOutputStream byteArrayOutputStream, final int n) {
        final int n2 = byteArrayOutputStream.size() % n;
        if (n2 != 0) {
            for (int i = 0; i < n - n2; ++i) {
                byteArrayOutputStream.write(0);
            }
        }
    }
    
    public static final void i(final ByteArrayOutputStream byteArrayOutputStream, final byte[] b) {
        o(byteArrayOutputStream, b.length);
        byteArrayOutputStream.write(b, 0, b.length);
    }
    
    public static final void j(final ByteArrayOutputStream byteArrayOutputStream, int n) {
        if (p.b) {
            byteArrayOutputStream.write(n);
            n >>>= 8;
        }
        else {
            byteArrayOutputStream.write(n >>> 8);
        }
        byteArrayOutputStream.write(n);
    }
    
    public static final void k(final ByteArrayOutputStream byteArrayOutputStream, final double value) {
        n(byteArrayOutputStream, Double.doubleToLongBits(value));
    }
    
    public static final void l(final ByteArrayOutputStream byteArrayOutputStream, final float value) {
        m(byteArrayOutputStream, Float.floatToIntBits(value));
    }
    
    public static final void m(final ByteArrayOutputStream byteArrayOutputStream, int n) {
        if (p.b) {
            byteArrayOutputStream.write(n);
            byteArrayOutputStream.write(n >>> 8);
            byteArrayOutputStream.write(n >>> 16);
            n >>>= 24;
        }
        else {
            byteArrayOutputStream.write(n >>> 24);
            byteArrayOutputStream.write(n >>> 16);
            byteArrayOutputStream.write(n >>> 8);
        }
        byteArrayOutputStream.write(n);
    }
    
    public static final void n(final ByteArrayOutputStream byteArrayOutputStream, long n) {
        if (p.b) {
            byteArrayOutputStream.write((byte)n);
            byteArrayOutputStream.write((byte)(n >>> 8));
            byteArrayOutputStream.write((byte)(n >>> 16));
            byteArrayOutputStream.write((byte)(n >>> 24));
            byteArrayOutputStream.write((byte)(n >>> 32));
            byteArrayOutputStream.write((byte)(n >>> 40));
            byteArrayOutputStream.write((byte)(n >>> 48));
            n >>>= 56;
        }
        else {
            byteArrayOutputStream.write((byte)(n >>> 56));
            byteArrayOutputStream.write((byte)(n >>> 48));
            byteArrayOutputStream.write((byte)(n >>> 40));
            byteArrayOutputStream.write((byte)(n >>> 32));
            byteArrayOutputStream.write((byte)(n >>> 24));
            byteArrayOutputStream.write((byte)(n >>> 16));
            byteArrayOutputStream.write((byte)(n >>> 8));
        }
        byteArrayOutputStream.write((byte)n);
    }
    
    public static final void o(final ByteArrayOutputStream byteArrayOutputStream, final int b) {
        if (b < 254) {
            byteArrayOutputStream.write(b);
            return;
        }
        if (b <= 65535) {
            byteArrayOutputStream.write(254);
            j(byteArrayOutputStream, b);
            return;
        }
        byteArrayOutputStream.write(255);
        m(byteArrayOutputStream, b);
    }
    
    @Override
    public ByteBuffer a(final Object o) {
        if (o == null) {
            return null;
        }
        final a a = new a();
        this.p(a, o);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(a.size());
        allocateDirect.put(a.a(), 0, a.size());
        return allocateDirect;
    }
    
    @Override
    public Object b(final ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        final Object f = this.f(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return f;
        }
        throw new IllegalArgumentException("Message corrupted");
    }
    
    public final Object f(final ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return this.g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }
    
    public Object g(final byte b, final ByteBuffer byteBuffer) {
        final int n = 0;
        final int n2 = 0;
        int n6 = 0;
        double[] array2 = null;
        Label_0259: {
            int n3 = 0;
            float[] array = null;
            switch (b) {
                default: {
                    throw new IllegalArgumentException("Message corrupted");
                }
                case 14: {
                    n3 = e(byteBuffer);
                    array = new float[n3];
                    c(byteBuffer, 4);
                    byteBuffer.asFloatBuffer().get(array);
                    break;
                }
                case 13: {
                    final int e = e(byteBuffer);
                    final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
                    int n4 = n2;
                    while (true) {
                        final Cloneable cloneable = hashMap;
                        if (n4 >= e) {
                            return cloneable;
                        }
                        hashMap.put(this.f(byteBuffer), this.f(byteBuffer));
                        ++n4;
                    }
                    break;
                }
                case 12: {
                    final int e2 = e(byteBuffer);
                    final ArrayList list = new ArrayList<Object>(e2);
                    int n5 = n;
                    while (true) {
                        final Cloneable cloneable = list;
                        if (n5 >= e2) {
                            return cloneable;
                        }
                        list.add(this.f(byteBuffer));
                        ++n5;
                    }
                    break;
                }
                case 11: {
                    n6 = e(byteBuffer);
                    array2 = new double[n6];
                    c(byteBuffer, 8);
                    byteBuffer.asDoubleBuffer().get(array2);
                    break Label_0259;
                }
                case 10: {
                    n6 = e(byteBuffer);
                    array2 = (double[])new long[n6];
                    c(byteBuffer, 8);
                    byteBuffer.asLongBuffer().get((long[])array2);
                    break Label_0259;
                }
                case 9: {
                    n3 = e(byteBuffer);
                    array = (float[])new int[n3];
                    c(byteBuffer, 4);
                    byteBuffer.asIntBuffer().get((int[])array);
                    break;
                }
                case 8: {
                    return d(byteBuffer);
                }
                case 7: {
                    return new String(d(byteBuffer), p.c);
                }
                case 6: {
                    c(byteBuffer, 8);
                    return byteBuffer.getDouble();
                }
                case 5: {
                    return new BigInteger(new String(d(byteBuffer), p.c), 16);
                }
                case 4: {
                    return byteBuffer.getLong();
                }
                case 3: {
                    return byteBuffer.getInt();
                }
                case 2: {
                    return Boolean.FALSE;
                }
                case 1: {
                    return Boolean.TRUE;
                }
                case 0: {
                    return null;
                }
            }
            byteBuffer.position(byteBuffer.position() + n3 * 4);
            return array;
        }
        byteBuffer.position(byteBuffer.position() + n6 * 8);
        return array2;
    }
    
    public void p(final ByteArrayOutputStream byteArrayOutputStream, final Object obj) {
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        int i = 0;
        if (obj != null && !obj.equals(null)) {
            if (obj instanceof Boolean) {
                int b;
                if (obj) {
                    b = 1;
                }
                else {
                    b = 2;
                }
                byteArrayOutputStream.write(b);
                return;
            }
            if (obj instanceof Number) {
                if (obj instanceof Integer || obj instanceof Short || obj instanceof Byte) {
                    byteArrayOutputStream.write(3);
                    m(byteArrayOutputStream, ((Number)obj).intValue());
                    return;
                }
                if (obj instanceof Long) {
                    byteArrayOutputStream.write(4);
                    n(byteArrayOutputStream, (long)obj);
                    return;
                }
                if (obj instanceof Float || obj instanceof Double) {
                    byteArrayOutputStream.write(6);
                    h(byteArrayOutputStream, 8);
                    k(byteArrayOutputStream, ((Number)obj).doubleValue());
                    return;
                }
                if (obj instanceof BigInteger) {
                    byteArrayOutputStream.write(5);
                    i(byteArrayOutputStream, ((BigInteger)obj).toString(16).getBytes(p.c));
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported Number type: ");
                sb.append(obj.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
            else {
                if (obj instanceof CharSequence) {
                    byteArrayOutputStream.write(7);
                    i(byteArrayOutputStream, obj.toString().getBytes(p.c));
                    return;
                }
                if (obj instanceof byte[]) {
                    byteArrayOutputStream.write(8);
                    i(byteArrayOutputStream, (byte[])obj);
                    return;
                }
                if (obj instanceof int[]) {
                    byteArrayOutputStream.write(9);
                    final int[] array = (int[])obj;
                    o(byteArrayOutputStream, array.length);
                    h(byteArrayOutputStream, 4);
                    while (i < array.length) {
                        m(byteArrayOutputStream, array[i]);
                        ++i;
                    }
                }
                else if (obj instanceof long[]) {
                    byteArrayOutputStream.write(10);
                    final long[] array2 = (long[])obj;
                    o(byteArrayOutputStream, array2.length);
                    h(byteArrayOutputStream, 8);
                    for (int length = array2.length, j = n; j < length; ++j) {
                        n(byteArrayOutputStream, array2[j]);
                    }
                }
                else if (obj instanceof double[]) {
                    byteArrayOutputStream.write(11);
                    final double[] array3 = (double[])obj;
                    o(byteArrayOutputStream, array3.length);
                    h(byteArrayOutputStream, 8);
                    for (int length2 = array3.length, k = n2; k < length2; ++k) {
                        k(byteArrayOutputStream, array3[k]);
                    }
                }
                else if (obj instanceof List) {
                    byteArrayOutputStream.write(12);
                    final List list = (List)obj;
                    o(byteArrayOutputStream, list.size());
                    final Iterator<Object> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        this.p(byteArrayOutputStream, iterator.next());
                    }
                }
                else if (obj instanceof Map) {
                    byteArrayOutputStream.write(13);
                    final Map map = (Map)obj;
                    o(byteArrayOutputStream, map.size());
                    for (final Map.Entry<Object, V> entry : map.entrySet()) {
                        this.p(byteArrayOutputStream, entry.getKey());
                        this.p(byteArrayOutputStream, entry.getValue());
                    }
                }
                else {
                    if (!(obj instanceof float[])) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unsupported value: '");
                        sb2.append(obj);
                        sb2.append("' of type '");
                        sb2.append(obj.getClass());
                        sb2.append("'");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    byteArrayOutputStream.write(14);
                    final float[] array4 = (float[])obj;
                    o(byteArrayOutputStream, array4.length);
                    h(byteArrayOutputStream, 4);
                    for (int length3 = array4.length, l = n3; l < length3; ++l) {
                        l(byteArrayOutputStream, array4[l]);
                    }
                }
            }
        }
        else {
            byteArrayOutputStream.write(0);
        }
    }
    
    public static final class a extends ByteArrayOutputStream
    {
        public byte[] a() {
            return super.buf;
        }
    }
}
