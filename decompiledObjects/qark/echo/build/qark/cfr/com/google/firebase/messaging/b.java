/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.FilterInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.Arrays
 *  java.util.Queue
 */
package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public abstract class b {
    public static byte[] a(Queue queue, int n8) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] arrby = (byte[])queue.remove();
        if (arrby.length == n8) {
            return arrby;
        }
        int n9 = n8 - arrby.length;
        arrby = Arrays.copyOf((byte[])arrby, (int)n8);
        while (n9 > 0) {
            byte[] arrby2 = (byte[])queue.remove();
            int n10 = Math.min((int)n9, (int)arrby2.length);
            System.arraycopy((Object)arrby2, (int)0, (Object)arrby, (int)(n8 - n9), (int)n10);
            n9 -= n10;
        }
        return arrby;
    }

    public static InputStream b(InputStream inputStream, long l8) {
        return new a(inputStream, l8);
    }

    public static int c(long l8) {
        if (l8 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (l8 < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)l8;
    }

    public static byte[] d(InputStream inputStream) {
        return b.e(inputStream, (Queue)new ArrayDeque(20), 0);
    }

    public static byte[] e(InputStream inputStream, Queue queue, int n8) {
        int n9 = Math.min((int)8192, (int)Math.max((int)128, (int)(Integer.highestOneBit((int)n8) * 2)));
        while (n8 < 2147483639) {
            int n10 = Math.min((int)n9, (int)(2147483639 - n8));
            byte[] arrby = new byte[n10];
            queue.add((Object)arrby);
            int n11 = 0;
            while (n11 < n10) {
                int n12 = inputStream.read(arrby, n11, n10 - n11);
                if (n12 == -1) {
                    return b.a(queue, n8);
                }
                n11 += n12;
                n8 += n12;
            }
            long l8 = n9;
            n9 = n9 < 4096 ? 4 : 2;
            n9 = b.c(l8 * (long)n9);
        }
        if (inputStream.read() == -1) {
            return b.a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final class a
    extends FilterInputStream {
        public long o;
        public long p = -1L;

        public a(InputStream inputStream, long l8) {
            super(inputStream);
            this.o = l8;
        }

        public int available() {
            return (int)Math.min((long)this.in.available(), (long)this.o);
        }

        public void mark(int n8) {
            synchronized (this) {
                this.in.mark(n8);
                this.p = this.o;
                return;
            }
        }

        public int read() {
            if (this.o == 0L) {
                return -1;
            }
            int n8 = this.in.read();
            if (n8 != -1) {
                --this.o;
            }
            return n8;
        }

        public int read(byte[] arrby, int n8, int n9) {
            long l8 = this.o;
            if (l8 == 0L) {
                return -1;
            }
            if ((n8 = this.in.read(arrby, n8, n9 = (int)Math.min((long)n9, (long)l8))) != -1) {
                this.o -= (long)n8;
            }
            return n8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void reset() {
            synchronized (this) {
                try {
                    if (!this.in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.p == -1L) throw new IOException("Mark not set");
                    {
                        this.in.reset();
                        this.o = this.p;
                        return;
                    }
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        public long skip(long l8) {
            l8 = Math.min((long)l8, (long)this.o);
            l8 = this.in.skip(l8);
            this.o -= l8;
            return l8;
        }
    }

}

