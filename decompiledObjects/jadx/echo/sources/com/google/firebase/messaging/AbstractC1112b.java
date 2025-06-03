package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1112b {

    /* renamed from: com.google.firebase.messaging.b$a */
    public static final class a extends FilterInputStream {

        /* renamed from: o, reason: collision with root package name */
        public long f11727o;

        /* renamed from: p, reason: collision with root package name */
        public long f11728p;

        public a(InputStream inputStream, long j7) {
            super(inputStream);
            this.f11728p = -1L;
            this.f11727o = j7;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f11727o);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i7) {
            ((FilterInputStream) this).in.mark(i7);
            this.f11728p = this.f11727o;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            if (this.f11727o == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f11727o--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f11728p == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f11727o = this.f11728p;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j7) {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j7, this.f11727o));
            this.f11727o -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) {
            long j7 = this.f11727o;
            if (j7 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i7, (int) Math.min(i8, j7));
            if (read != -1) {
                this.f11727o -= read;
            }
            return read;
        }
    }

    public static byte[] a(Queue queue, int i7) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i7) {
            return bArr;
        }
        int length = i7 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i7);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i7 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static InputStream b(InputStream inputStream, long j7) {
        return new a(inputStream, j7);
    }

    public static int c(long j7) {
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }

    public static byte[] d(InputStream inputStream) {
        return e(inputStream, new ArrayDeque(20), 0);
    }

    public static byte[] e(InputStream inputStream, Queue queue, int i7) {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i7) * 2));
        while (i7 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i7);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i8 = 0;
            while (i8 < min2) {
                int read = inputStream.read(bArr, i8, min2 - i8);
                if (read == -1) {
                    return a(queue, i7);
                }
                i8 += read;
                i7 += read;
            }
            min = c(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
