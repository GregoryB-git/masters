/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayDeque
 *  java.util.Arrays
 *  java.util.Queue
 */
package Y2;

import W2.m;
import Z2.d;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public abstract class a {
    public static final OutputStream a = new OutputStream(){

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        public void write(int n8) {
        }

        public void write(byte[] arrby) {
            m.j(arrby);
        }

        public void write(byte[] arrby, int n8, int n9) {
            m.j(arrby);
            m.n(n8, n9 + n8, arrby.length);
        }
    };

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

    public static byte[] b(InputStream inputStream) {
        m.j((Object)inputStream);
        return a.c(inputStream, (Queue)new ArrayDeque(20), 0);
    }

    public static byte[] c(InputStream inputStream, Queue queue, int n8) {
        int n9 = Math.min((int)8192, (int)Math.max((int)128, (int)(Integer.highestOneBit((int)n8) * 2)));
        int n10 = n8;
        n8 = n9;
        while (n10 < 2147483639) {
            int n11 = Math.min((int)n8, (int)(2147483639 - n10));
            byte[] arrby = new byte[n11];
            queue.add((Object)arrby);
            n9 = 0;
            while (n9 < n11) {
                int n12 = inputStream.read(arrby, n9, n11 - n9);
                if (n12 == -1) {
                    return a.a(queue, n10);
                }
                n9 += n12;
                n10 += n12;
            }
            n9 = n8 < 4096 ? 4 : 2;
            n8 = d.c(n8, n9);
        }
        if (inputStream.read() == -1) {
            return a.a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

}

