// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public abstract class K
{
    public static List a(final byte[] array) {
        final long k = k(f(array));
        final long i = k(3840L);
        final ArrayList<byte[]> list = new ArrayList<byte[]>(3);
        list.add(array);
        list.add(b(k));
        list.add(b(i));
        return list;
    }
    
    public static byte[] b(final long n) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(n).array();
    }
    
    public static int c(final byte[] array) {
        return array[9] & 0xFF;
    }
    
    public static long d(final byte b, final byte b2) {
        final int n = b & 0x3;
        int n2;
        if (n != 0) {
            n2 = 2;
            if (n != 1) {
                n2 = n2;
                if (n != 2) {
                    n2 = (b2 & 0x3F);
                }
            }
        }
        else {
            n2 = 1;
        }
        final int n3 = (b & 0xFF) >> 3;
        final int n4 = n3 & 0x3;
        int n5;
        if (n3 >= 16) {
            n5 = 2500 << n4;
        }
        else if (n3 >= 12) {
            n5 = 10000 << (n3 & 0x1);
        }
        else if (n4 == 3) {
            n5 = 60000;
        }
        else {
            n5 = 10000 << n4;
        }
        return n2 * (long)n5;
    }
    
    public static long e(final byte[] array) {
        byte b = 0;
        final byte b2 = array[0];
        if (array.length > 1) {
            b = array[1];
        }
        return d(b2, b);
    }
    
    public static int f(final byte[] array) {
        return (array[10] & 0xFF) | (array[11] & 0xFF) << 8;
    }
    
    public static boolean g(final long n, final long n2) {
        return n - n2 <= k(3840L) / 1000L;
    }
    
    public static int h(final ByteBuffer byteBuffer) {
        final int i = i(byteBuffer);
        final int n = byteBuffer.get(i + 26) + 27 + i;
        final byte value = byteBuffer.get(n);
        byte value2;
        if (byteBuffer.limit() - n > 1) {
            value2 = byteBuffer.get(n + 1);
        }
        else {
            value2 = 0;
        }
        return (int)(d(value, value2) * 48000L / 1000000L);
    }
    
    public static int i(final ByteBuffer byteBuffer) {
        final byte value = byteBuffer.get(5);
        final int n = 0;
        if ((value & 0x2) == 0x0) {
            return 0;
        }
        final byte value2 = byteBuffer.get(26);
        int n2 = 28;
        int i = 0;
        int n3 = 28;
        while (i < value2) {
            n3 += byteBuffer.get(i + 27);
            ++i;
        }
        final byte value3 = byteBuffer.get(n3 + 26);
        for (int j = n; j < value3; ++j) {
            n2 += byteBuffer.get(n3 + 27 + j);
        }
        return n3 + n2;
    }
    
    public static int j(final ByteBuffer byteBuffer) {
        byte value = 0;
        final byte value2 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            value = byteBuffer.get(1);
        }
        return (int)(d(value2, value) * 48000L / 1000000L);
    }
    
    public static long k(final long n) {
        return n * 1000000000L / 48000L;
    }
}
