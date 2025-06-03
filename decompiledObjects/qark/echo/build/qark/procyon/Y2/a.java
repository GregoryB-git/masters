// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y2;

import Z2.d;
import java.util.ArrayDeque;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Queue;
import W2.m;
import java.io.OutputStream;

public abstract class a
{
    public static final OutputStream a;
    
    static {
        a = new OutputStream() {
            @Override
            public String toString() {
                return "ByteStreams.nullOutputStream()";
            }
            
            @Override
            public void write(final int n) {
            }
            
            @Override
            public void write(final byte[] array) {
                m.j(array);
            }
            
            @Override
            public void write(final byte[] array, final int n, final int n2) {
                m.j(array);
                m.n(n, n2 + n, array.length);
            }
        };
    }
    
    public static byte[] a(final Queue queue, final int newLength) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        final byte[] original = queue.remove();
        if (original.length == newLength) {
            return original;
        }
        int i = newLength - original.length;
        final byte[] copy = Arrays.copyOf(original, newLength);
        while (i > 0) {
            final byte[] array = queue.remove();
            final int min = Math.min(i, array.length);
            System.arraycopy(array, 0, copy, newLength - i, min);
            i -= min;
        }
        return copy;
    }
    
    public static byte[] b(final InputStream inputStream) {
        m.j(inputStream);
        return c(inputStream, new ArrayDeque(20), 0);
    }
    
    public static byte[] c(final InputStream inputStream, final Queue queue, int c) {
        final int min = Math.min(8192, Math.max(128, Integer.highestOneBit(c) * 2));
        int i = c;
        c = min;
        while (i < 2147483639) {
            final int min2 = Math.min(c, 2147483639 - i);
            final byte[] b = new byte[min2];
            queue.add(b);
            int read;
            for (int j = 0; j < min2; j += read, i += read) {
                read = inputStream.read(b, j, min2 - j);
                if (read == -1) {
                    return a(queue, i);
                }
            }
            int n;
            if (c < 4096) {
                n = 4;
            }
            else {
                n = 2;
            }
            c = d.c(c, n);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
