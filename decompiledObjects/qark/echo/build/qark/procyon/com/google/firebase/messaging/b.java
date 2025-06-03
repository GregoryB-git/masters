// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import java.io.IOException;
import java.io.FilterInputStream;
import java.util.ArrayDeque;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Queue;

public abstract class b
{
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
    
    public static InputStream b(final InputStream inputStream, final long n) {
        return new a(inputStream, n);
    }
    
    public static int c(final long n) {
        if (n > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (n < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int)n;
    }
    
    public static byte[] d(final InputStream inputStream) {
        return e(inputStream, new ArrayDeque(20), 0);
    }
    
    public static byte[] e(final InputStream inputStream, final Queue queue, int i) {
        int a = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            final int min = Math.min(a, 2147483639 - i);
            final byte[] b = new byte[min];
            queue.add(b);
            int read;
            for (int j = 0; j < min; j += read, i += read) {
                read = inputStream.read(b, j, min - j);
                if (read == -1) {
                    return a(queue, i);
                }
            }
            final long n = a;
            int n2;
            if (a < 4096) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            a = c(n * n2);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
    
    public static final class a extends FilterInputStream
    {
        public long o;
        public long p;
        
        public a(final InputStream in, final long o) {
            super(in);
            this.p = -1L;
            this.o = o;
        }
        
        @Override
        public int available() {
            return (int)Math.min(super.in.available(), this.o);
        }
        
        @Override
        public void mark(final int readlimit) {
            synchronized (this) {
                super.in.mark(readlimit);
                this.p = this.o;
            }
        }
        
        @Override
        public int read() {
            if (this.o == 0L) {
                return -1;
            }
            final int read = super.in.read();
            if (read != -1) {
                --this.o;
            }
            return read;
        }
        
        @Override
        public int read(final byte[] b, int read, int len) {
            final long o = this.o;
            if (o == 0L) {
                return -1;
            }
            len = (int)Math.min(len, o);
            read = super.in.read(b, read, len);
            if (read != -1) {
                this.o -= read;
            }
            return read;
        }
        
        @Override
        public void reset() {
            // monitorenter(this)
            Label_0065: {
                try {
                    if (!super.in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.p != -1L) {
                        super.in.reset();
                        this.o = this.p;
                        // monitorexit(this)
                        return;
                    }
                }
                finally {
                    break Label_0065;
                }
                throw new IOException("Mark not set");
            }
        }
        // monitorexit(this)
        
        @Override
        public long skip(long n) {
            n = Math.min(n, this.o);
            n = super.in.skip(n);
            this.o -= n;
            return n;
        }
    }
}
