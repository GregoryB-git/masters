package l8;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class i implements Closeable {

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f9769o = Logger.getLogger(i.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f9770a;

    /* renamed from: b, reason: collision with root package name */
    public int f9771b;

    /* renamed from: c, reason: collision with root package name */
    public int f9772c;

    /* renamed from: d, reason: collision with root package name */
    public a f9773d;

    /* renamed from: e, reason: collision with root package name */
    public a f9774e;
    public final byte[] f;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f9775c = new a(0, 0);

        /* renamed from: a, reason: collision with root package name */
        public final int f9776a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9777b;

        public a(int i10, int i11) {
            this.f9776a = i10;
            this.f9777b = i11;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.class.getSimpleName());
            sb2.append("[position = ");
            sb2.append(this.f9776a);
            sb2.append(", length = ");
            return a0.j.m(sb2, this.f9777b, "]");
        }
    }

    public i(File file) {
        byte[] bArr = new byte[16];
        this.f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 4; i10 < i12; i12 = 4) {
                    int i13 = iArr[i10];
                    bArr2[i11] = (byte) (i13 >> 24);
                    bArr2[i11 + 1] = (byte) (i13 >> 16);
                    bArr2[i11 + 2] = (byte) (i13 >> 8);
                    bArr2[i11 + 3] = (byte) i13;
                    i11 += 4;
                    i10++;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f9770a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int H = H(bArr, 0);
        this.f9771b = H;
        if (H > randomAccessFile2.length()) {
            StringBuilder l10 = defpackage.f.l("File is truncated. Expected length: ");
            l10.append(this.f9771b);
            l10.append(", Actual length: ");
            l10.append(randomAccessFile2.length());
            throw new IOException(l10.toString());
        }
        this.f9772c = H(bArr, 4);
        int H2 = H(bArr, 8);
        int H3 = H(bArr, 12);
        this.f9773d = C(H2);
        this.f9774e = C(H3);
    }

    public static int H(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public final a C(int i10) {
        if (i10 == 0) {
            return a.f9775c;
        }
        this.f9770a.seek(i10);
        return new a(i10, this.f9770a.readInt());
    }

    public final synchronized void I() {
        int i10;
        try {
            synchronized (this) {
                i10 = this.f9772c;
            }
        } catch (Throwable th) {
            throw th;
        }
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        if (i10 == 1) {
            synchronized (this) {
                h0(4096, 0, 0, 0);
                this.f9772c = 0;
                a aVar = a.f9775c;
                this.f9773d = aVar;
                this.f9774e = aVar;
                if (this.f9771b > 4096) {
                    this.f9770a.setLength(4096);
                    this.f9770a.getChannel().force(true);
                }
                this.f9771b = 4096;
            }
        } else {
            a aVar2 = this.f9773d;
            int c02 = c0(aVar2.f9776a + 4 + aVar2.f9777b);
            M(c02, this.f, 0, 4);
            int H = H(this.f, 0);
            h0(this.f9771b, this.f9772c - 1, c02, this.f9774e.f9776a);
            this.f9772c--;
            this.f9773d = new a(c02, H);
        }
    }

    public final void M(int i10, byte[] bArr, int i11, int i12) {
        RandomAccessFile randomAccessFile;
        int c02 = c0(i10);
        int i13 = c02 + i12;
        int i14 = this.f9771b;
        if (i13 <= i14) {
            this.f9770a.seek(c02);
            randomAccessFile = this.f9770a;
        } else {
            int i15 = i14 - c02;
            this.f9770a.seek(c02);
            this.f9770a.readFully(bArr, i11, i15);
            this.f9770a.seek(16L);
            randomAccessFile = this.f9770a;
            i11 += i15;
            i12 -= i15;
        }
        randomAccessFile.readFully(bArr, i11, i12);
    }

    public final void Q(int i10, byte[] bArr, int i11) {
        RandomAccessFile randomAccessFile;
        int c02 = c0(i10);
        int i12 = c02 + i11;
        int i13 = this.f9771b;
        int i14 = 0;
        if (i12 <= i13) {
            this.f9770a.seek(c02);
            randomAccessFile = this.f9770a;
        } else {
            int i15 = i13 - c02;
            this.f9770a.seek(c02);
            this.f9770a.write(bArr, 0, i15);
            this.f9770a.seek(16L);
            randomAccessFile = this.f9770a;
            i14 = 0 + i15;
            i11 -= i15;
        }
        randomAccessFile.write(bArr, i14, i11);
    }

    public final int b0() {
        if (this.f9772c == 0) {
            return 16;
        }
        a aVar = this.f9774e;
        int i10 = aVar.f9776a;
        int i11 = this.f9773d.f9776a;
        return i10 >= i11 ? (i10 - i11) + 4 + aVar.f9777b + 16 : (((i10 + 4) + aVar.f9777b) + this.f9771b) - i11;
    }

    public final int c0(int i10) {
        int i11 = this.f9771b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f9770a.close();
    }

    public final void f(byte[] bArr) {
        boolean z10;
        int c02;
        int length = bArr.length;
        synchronized (this) {
            if ((length | 0) >= 0) {
                if (length <= bArr.length - 0) {
                    g(length);
                    synchronized (this) {
                        z10 = this.f9772c == 0;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
        if (z10) {
            c02 = 16;
        } else {
            a aVar = this.f9774e;
            c02 = c0(aVar.f9776a + 4 + aVar.f9777b);
        }
        a aVar2 = new a(c02, length);
        byte[] bArr2 = this.f;
        bArr2[0] = (byte) (length >> 24);
        bArr2[1] = (byte) (length >> 16);
        bArr2[2] = (byte) (length >> 8);
        bArr2[3] = (byte) length;
        Q(c02, bArr2, 4);
        Q(c02 + 4, bArr, length);
        h0(this.f9771b, this.f9772c + 1, z10 ? c02 : this.f9773d.f9776a, c02);
        this.f9774e = aVar2;
        this.f9772c++;
        if (z10) {
            this.f9773d = aVar2;
        }
    }

    public final void g(int i10) {
        int i11 = i10 + 4;
        int b02 = this.f9771b - b0();
        if (b02 >= i11) {
            return;
        }
        int i12 = this.f9771b;
        do {
            b02 += i12;
            i12 <<= 1;
        } while (b02 < i11);
        this.f9770a.setLength(i12);
        this.f9770a.getChannel().force(true);
        a aVar = this.f9774e;
        int c02 = c0(aVar.f9776a + 4 + aVar.f9777b);
        if (c02 < this.f9773d.f9776a) {
            FileChannel channel = this.f9770a.getChannel();
            channel.position(this.f9771b);
            long j10 = c02 - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f9774e.f9776a;
        int i14 = this.f9773d.f9776a;
        if (i13 < i14) {
            int i15 = (this.f9771b + i13) - 16;
            h0(i12, this.f9772c, i14, i15);
            this.f9774e = new a(i15, this.f9774e.f9777b);
        } else {
            h0(i12, this.f9772c, i14, i13);
        }
        this.f9771b = i12;
    }

    public final void h0(int i10, int i11, int i12, int i13) {
        byte[] bArr = this.f;
        int[] iArr = {i10, i11, i12, i13};
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = iArr[i15];
            bArr[i14] = (byte) (i16 >> 24);
            bArr[i14 + 1] = (byte) (i16 >> 16);
            bArr[i14 + 2] = (byte) (i16 >> 8);
            bArr[i14 + 3] = (byte) i16;
            i14 += 4;
        }
        this.f9770a.seek(0L);
        this.f9770a.write(this.f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i.class.getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f9771b);
        sb2.append(", size=");
        sb2.append(this.f9772c);
        sb2.append(", first=");
        sb2.append(this.f9773d);
        sb2.append(", last=");
        sb2.append(this.f9774e);
        sb2.append(", element lengths=[");
        try {
            synchronized (this) {
                int i10 = this.f9773d.f9776a;
                boolean z10 = true;
                for (int i11 = 0; i11 < this.f9772c; i11++) {
                    a C = C(i10);
                    new b(C);
                    int i12 = C.f9777b;
                    if (z10) {
                        z10 = false;
                    } else {
                        sb2.append(", ");
                    }
                    sb2.append(i12);
                    i10 = c0(C.f9776a + 4 + C.f9777b);
                }
            }
        } catch (IOException e10) {
            f9769o.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final class b extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        public int f9778a;

        /* renamed from: b, reason: collision with root package name */
        public int f9779b;

        public b(a aVar) {
            this.f9778a = i.this.c0(aVar.f9776a + 4);
            this.f9779b = aVar.f9777b;
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.f9779b == 0) {
                return -1;
            }
            i.this.f9770a.seek(this.f9778a);
            int read = i.this.f9770a.read();
            this.f9778a = i.this.c0(this.f9778a + 1);
            this.f9779b--;
            return read;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f9779b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            i.this.M(this.f9778a, bArr, i10, i11);
            this.f9778a = i.this.c0(this.f9778a + i11);
            this.f9779b -= i11;
            return i11;
        }
    }
}
