package I3;

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
public class e implements Closeable {

    /* renamed from: u, reason: collision with root package name */
    public static final Logger f2522u = Logger.getLogger(e.class.getName());

    /* renamed from: o, reason: collision with root package name */
    public final RandomAccessFile f2523o;

    /* renamed from: p, reason: collision with root package name */
    public int f2524p;

    /* renamed from: q, reason: collision with root package name */
    public int f2525q;

    /* renamed from: r, reason: collision with root package name */
    public b f2526r;

    /* renamed from: s, reason: collision with root package name */
    public b f2527s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f2528t = new byte[16];

    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2529a = true;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f2530b;

        public a(StringBuilder sb) {
            this.f2530b = sb;
        }

        @Override // I3.e.d
        public void a(InputStream inputStream, int i7) {
            if (this.f2529a) {
                this.f2529a = false;
            } else {
                this.f2530b.append(", ");
            }
            this.f2530b.append(i7);
        }
    }

    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f2532c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        public final int f2533a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2534b;

        public b(int i7, int i8) {
            this.f2533a = i7;
            this.f2534b = i8;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f2533a + ", length = " + this.f2534b + "]";
        }
    }

    public final class c extends InputStream {

        /* renamed from: o, reason: collision with root package name */
        public int f2535o;

        /* renamed from: p, reason: collision with root package name */
        public int f2536p;

        public c(b bVar) {
            this.f2535o = e.this.F(bVar.f2533a + 4);
            this.f2536p = bVar.f2534b;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f2536p == 0) {
                return -1;
            }
            e.this.f2523o.seek(this.f2535o);
            int read = e.this.f2523o.read();
            this.f2535o = e.this.F(this.f2535o + 1);
            this.f2536p--;
            return read;
        }

        public /* synthetic */ c(e eVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) {
            e.r(bArr, "buffer");
            if ((i7 | i8) < 0 || i8 > bArr.length - i7) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i9 = this.f2536p;
            if (i9 <= 0) {
                return -1;
            }
            if (i8 > i9) {
                i8 = i9;
            }
            e.this.B(this.f2535o, bArr, i7, i8);
            this.f2535o = e.this.F(this.f2535o + i8);
            this.f2536p -= i8;
            return i8;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i7);
    }

    public e(File file) {
        if (!file.exists()) {
            n(file);
        }
        this.f2523o = s(file);
        u();
    }

    public static void H(byte[] bArr, int i7, int i8) {
        bArr[i7] = (byte) (i8 >> 24);
        bArr[i7 + 1] = (byte) (i8 >> 16);
        bArr[i7 + 2] = (byte) (i8 >> 8);
        bArr[i7 + 3] = (byte) i8;
    }

    public static void I(byte[] bArr, int... iArr) {
        int i7 = 0;
        for (int i8 : iArr) {
            H(bArr, i7, i8);
            i7 += 4;
        }
    }

    public static void n(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile s7 = s(file2);
        try {
            s7.setLength(4096L);
            s7.seek(0L);
            byte[] bArr = new byte[16];
            I(bArr, 4096, 0, 0, 0);
            s7.write(bArr);
            s7.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            s7.close();
            throw th;
        }
    }

    public static Object r(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static RandomAccessFile s(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    public static int v(byte[] bArr, int i7) {
        return ((bArr[i7] & 255) << 24) + ((bArr[i7 + 1] & 255) << 16) + ((bArr[i7 + 2] & 255) << 8) + (bArr[i7 + 3] & 255);
    }

    public final void B(int i7, byte[] bArr, int i8, int i9) {
        RandomAccessFile randomAccessFile;
        int F6 = F(i7);
        int i10 = F6 + i9;
        int i11 = this.f2524p;
        if (i10 <= i11) {
            this.f2523o.seek(F6);
            randomAccessFile = this.f2523o;
        } else {
            int i12 = i11 - F6;
            this.f2523o.seek(F6);
            this.f2523o.readFully(bArr, i8, i12);
            this.f2523o.seek(16L);
            randomAccessFile = this.f2523o;
            i8 += i12;
            i9 -= i12;
        }
        randomAccessFile.readFully(bArr, i8, i9);
    }

    public final void C(int i7, byte[] bArr, int i8, int i9) {
        RandomAccessFile randomAccessFile;
        int F6 = F(i7);
        int i10 = F6 + i9;
        int i11 = this.f2524p;
        if (i10 <= i11) {
            this.f2523o.seek(F6);
            randomAccessFile = this.f2523o;
        } else {
            int i12 = i11 - F6;
            this.f2523o.seek(F6);
            this.f2523o.write(bArr, i8, i12);
            this.f2523o.seek(16L);
            randomAccessFile = this.f2523o;
            i8 += i12;
            i9 -= i12;
        }
        randomAccessFile.write(bArr, i8, i9);
    }

    public final void D(int i7) {
        this.f2523o.setLength(i7);
        this.f2523o.getChannel().force(true);
    }

    public int E() {
        if (this.f2525q == 0) {
            return 16;
        }
        b bVar = this.f2527s;
        int i7 = bVar.f2533a;
        int i8 = this.f2526r.f2533a;
        return i7 >= i8 ? (i7 - i8) + 4 + bVar.f2534b + 16 : (((i7 + 4) + bVar.f2534b) + this.f2524p) - i8;
    }

    public final int F(int i7) {
        int i8 = this.f2524p;
        return i7 < i8 ? i7 : (i7 + 16) - i8;
    }

    public final void G(int i7, int i8, int i9, int i10) {
        I(this.f2528t, i7, i8, i9, i10);
        this.f2523o.seek(0L);
        this.f2523o.write(this.f2528t);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f2523o.close();
    }

    public void h(byte[] bArr) {
        i(bArr, 0, bArr.length);
    }

    public synchronized void i(byte[] bArr, int i7, int i8) {
        int F6;
        try {
            r(bArr, "buffer");
            if ((i7 | i8) < 0 || i8 > bArr.length - i7) {
                throw new IndexOutOfBoundsException();
            }
            l(i8);
            boolean q7 = q();
            if (q7) {
                F6 = 16;
            } else {
                b bVar = this.f2527s;
                F6 = F(bVar.f2533a + 4 + bVar.f2534b);
            }
            b bVar2 = new b(F6, i8);
            H(this.f2528t, 0, i8);
            C(bVar2.f2533a, this.f2528t, 0, 4);
            C(bVar2.f2533a + 4, bArr, i7, i8);
            G(this.f2524p, this.f2525q + 1, q7 ? bVar2.f2533a : this.f2526r.f2533a, bVar2.f2533a);
            this.f2527s = bVar2;
            this.f2525q++;
            if (q7) {
                this.f2526r = bVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void k() {
        try {
            G(4096, 0, 0, 0);
            this.f2525q = 0;
            b bVar = b.f2532c;
            this.f2526r = bVar;
            this.f2527s = bVar;
            if (this.f2524p > 4096) {
                D(4096);
            }
            this.f2524p = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l(int i7) {
        int i8 = i7 + 4;
        int w7 = w();
        if (w7 >= i8) {
            return;
        }
        int i9 = this.f2524p;
        do {
            w7 += i9;
            i9 <<= 1;
        } while (w7 < i8);
        D(i9);
        b bVar = this.f2527s;
        int F6 = F(bVar.f2533a + 4 + bVar.f2534b);
        if (F6 < this.f2526r.f2533a) {
            FileChannel channel = this.f2523o.getChannel();
            channel.position(this.f2524p);
            long j7 = F6 - 4;
            if (channel.transferTo(16L, j7, channel) != j7) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i10 = this.f2527s.f2533a;
        int i11 = this.f2526r.f2533a;
        if (i10 < i11) {
            int i12 = (this.f2524p + i10) - 16;
            G(i9, this.f2525q, i11, i12);
            this.f2527s = new b(i12, this.f2527s.f2534b);
        } else {
            G(i9, this.f2525q, i11, i10);
        }
        this.f2524p = i9;
    }

    public synchronized void m(d dVar) {
        int i7 = this.f2526r.f2533a;
        for (int i8 = 0; i8 < this.f2525q; i8++) {
            b t7 = t(i7);
            dVar.a(new c(this, t7, null), t7.f2534b);
            i7 = F(t7.f2533a + 4 + t7.f2534b);
        }
    }

    public synchronized boolean q() {
        return this.f2525q == 0;
    }

    public final b t(int i7) {
        if (i7 == 0) {
            return b.f2532c;
        }
        this.f2523o.seek(i7);
        return new b(i7, this.f2523o.readInt());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f2524p);
        sb.append(", size=");
        sb.append(this.f2525q);
        sb.append(", first=");
        sb.append(this.f2526r);
        sb.append(", last=");
        sb.append(this.f2527s);
        sb.append(", element lengths=[");
        try {
            m(new a(sb));
        } catch (IOException e7) {
            f2522u.log(Level.WARNING, "read error", (Throwable) e7);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final void u() {
        this.f2523o.seek(0L);
        this.f2523o.readFully(this.f2528t);
        int v7 = v(this.f2528t, 0);
        this.f2524p = v7;
        if (v7 <= this.f2523o.length()) {
            this.f2525q = v(this.f2528t, 4);
            int v8 = v(this.f2528t, 8);
            int v9 = v(this.f2528t, 12);
            this.f2526r = t(v8);
            this.f2527s = t(v9);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f2524p + ", Actual length: " + this.f2523o.length());
    }

    public final int w() {
        return this.f2524p - E();
    }

    public synchronized void x() {
        try {
            if (q()) {
                throw new NoSuchElementException();
            }
            if (this.f2525q == 1) {
                k();
            } else {
                b bVar = this.f2526r;
                int F6 = F(bVar.f2533a + 4 + bVar.f2534b);
                B(F6, this.f2528t, 0, 4);
                int v7 = v(this.f2528t, 0);
                G(this.f2524p, this.f2525q - 1, F6, this.f2527s.f2533a);
                this.f2525q--;
                this.f2526r = new b(F6, v7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
