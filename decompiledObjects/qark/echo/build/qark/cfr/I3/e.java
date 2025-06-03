/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.File
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.RandomAccessFile
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.channels.FileChannel
 *  java.nio.channels.WritableByteChannel
 *  java.util.NoSuchElementException
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package I3;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class e
implements Closeable {
    public static final Logger u = Logger.getLogger((String)e.class.getName());
    public final RandomAccessFile o;
    public int p;
    public int q;
    public b r;
    public b s;
    public final byte[] t = new byte[16];

    public e(File file) {
        if (!file.exists()) {
            e.n(file);
        }
        this.o = e.s(file);
        this.u();
    }

    public static void H(byte[] arrby, int n8, int n9) {
        arrby[n8] = (byte)(n9 >> 24);
        arrby[n8 + 1] = (byte)(n9 >> 16);
        arrby[n8 + 2] = (byte)(n9 >> 8);
        arrby[n8 + 3] = (byte)n9;
    }

    public static /* varargs */ void I(byte[] arrby, int ... arrn) {
        int n8 = arrn.length;
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            e.H(arrby, n9, arrn[i8]);
            n9 += 4;
        }
    }

    public static void n(File file) {
        StringBuilder stringBuilder;
        block3 : {
            stringBuilder = new StringBuilder();
            stringBuilder.append(file.getPath());
            stringBuilder.append(".tmp");
            File file2 = new File(stringBuilder.toString());
            stringBuilder = e.s(file2);
            stringBuilder.setLength(4096L);
            stringBuilder.seek(0L);
            byte[] arrby = new byte[16];
            e.I(arrby, 4096, 0, 0, 0);
            stringBuilder.write(arrby);
            if (!file2.renameTo(file)) break block3;
            return;
        }
        throw new IOException("Rename failed!");
        finally {
            stringBuilder.close();
        }
    }

    public static Object r(Object object, String string2) {
        if (object != null) {
            return object;
        }
        throw new NullPointerException(string2);
    }

    public static RandomAccessFile s(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    public static int v(byte[] arrby, int n8) {
        return ((arrby[n8] & 255) << 24) + ((arrby[n8 + 1] & 255) << 16) + ((arrby[n8 + 2] & 255) << 8) + (arrby[n8 + 3] & 255);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void B(int n8, byte[] arrby, int n9, int n10) {
        int n11;
        RandomAccessFile randomAccessFile;
        if ((n8 = this.F(n8)) + n10 <= (n11 = this.p)) {
            this.o.seek((long)n8);
            randomAccessFile = this.o;
        } else {
            this.o.seek((long)n8);
            this.o.readFully(arrby, n9, n11 -= n8);
            this.o.seek(16L);
            randomAccessFile = this.o;
            n9 += n11;
            n10 -= n11;
        }
        randomAccessFile.readFully(arrby, n9, n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void C(int n8, byte[] arrby, int n9, int n10) {
        int n11;
        RandomAccessFile randomAccessFile;
        if ((n8 = this.F(n8)) + n10 <= (n11 = this.p)) {
            this.o.seek((long)n8);
            randomAccessFile = this.o;
        } else {
            this.o.seek((long)n8);
            this.o.write(arrby, n9, n11 -= n8);
            this.o.seek(16L);
            randomAccessFile = this.o;
            n9 += n11;
            n10 -= n11;
        }
        randomAccessFile.write(arrby, n9, n10);
    }

    public final void D(int n8) {
        this.o.setLength((long)n8);
        this.o.getChannel().force(true);
    }

    public int E() {
        if (this.q == 0) {
            return 16;
        }
        b b8 = this.s;
        int n8 = b8.a;
        int n9 = this.r.a;
        if (n8 >= n9) {
            return n8 - n9 + 4 + b8.b + 16;
        }
        return n8 + 4 + b8.b + this.p - n9;
    }

    public final int F(int n8) {
        int n9 = this.p;
        if (n8 < n9) {
            return n8;
        }
        return n8 + 16 - n9;
    }

    public final void G(int n8, int n9, int n10, int n11) {
        e.I(this.t, n8, n9, n10, n11);
        this.o.seek(0L);
        this.o.write(this.t);
    }

    public void close() {
        synchronized (this) {
            this.o.close();
            return;
        }
    }

    public void h(byte[] arrby) {
        this.i(arrby, 0, arrby.length);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void i(byte[] var1_1, int var2_3, int var3_4) {
        block6 : {
            // MONITORENTER : this
            e.r(var1_1, "buffer");
            if ((var2_3 | var3_4) < 0) throw new IndexOutOfBoundsException();
            if (var3_4 > var1_1.length - var2_3) throw new IndexOutOfBoundsException();
            this.l(var3_4);
            var5_5 = this.q();
            if (!var5_5) break block6;
            var4_6 = 16;
            ** GOTO lbl18
        }
        var6_7 = this.s;
        var4_6 = this.F(var6_7.a + 4 + var6_7.b);
lbl18: // 2 sources:
        var6_7 = new b(var4_6, var3_4);
        e.H(this.t, 0, var3_4);
        this.C(var6_7.a, this.t, 0, 4);
        this.C(var6_7.a + 4, var1_1, var2_3, var3_4);
        var2_3 = var5_5 != false ? var6_7.a : this.r.a;
        this.G(this.p, this.q + 1, var2_3, var6_7.a);
        this.s = var6_7;
        ++this.q;
        if (var5_5) {
            this.r = var6_7;
        }
        // MONITOREXIT : this
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void k() {
        synchronized (this) {
            try {
                b b8;
                this.G(4096, 0, 0, 0);
                this.q = 0;
                this.r = b8 = b.c;
                this.s = b8;
                if (this.p > 4096) {
                    this.D(4096);
                }
                this.p = 4096;
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void l(int n8) {
        int n9;
        int n10;
        int n11 = n8 + 4;
        int n12 = this.w();
        if (n12 >= n11) {
            return;
        }
        n8 = this.p;
        do {
            n10 = n12 + n8;
            n9 = n8 << 1;
            n12 = n10;
            n8 = n9;
        } while (n10 < n11);
        this.D(n9);
        b b8 = this.s;
        n8 = this.F(b8.a + 4 + b8.b);
        if (n8 < this.r.a) {
            b8 = this.o.getChannel();
            b8.position((long)this.p);
            long l8 = n8 - 4;
            if (b8.transferTo(16L, l8, (WritableByteChannel)b8) != l8) {
                throw new AssertionError((Object)"Copied insufficient number of bytes!");
            }
        }
        if ((n12 = this.s.a) < (n8 = this.r.a)) {
            n12 = this.p + n12 - 16;
            this.G(n9, this.q, n8, n12);
            this.s = new b(n12, this.s.b);
        } else {
            this.G(n9, this.q, n8, n12);
        }
        this.p = n9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m(d d8) {
        synchronized (this) {
            int n8;
            int n9;
            block4 : {
                try {
                    n9 = this.r.a;
                    n8 = 0;
                    break block4;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
            while (n8 < this.q) {
                b b8 = this.t(n9);
                d8.a(new c(b8, null), b8.b);
                n9 = this.F(b8.a + 4 + b8.b);
                ++n8;
            }
            return;
        }
    }

    public boolean q() {
        synchronized (this) {
            int n8 = this.q;
            boolean bl = n8 == 0;
            return bl;
        }
    }

    public final b t(int n8) {
        if (n8 == 0) {
            return b.c;
        }
        this.o.seek((long)n8);
        return new b(n8, this.o.readInt());
    }

    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append('[');
        stringBuilder.append("fileLength=");
        stringBuilder.append(this.p);
        stringBuilder.append(", size=");
        stringBuilder.append(this.q);
        stringBuilder.append(", first=");
        stringBuilder.append((Object)this.r);
        stringBuilder.append(", last=");
        stringBuilder.append((Object)this.s);
        stringBuilder.append(", element lengths=[");
        try {
            this.m(new d(){
                public boolean a;
                {
                    this.a = true;
                }

                @Override
                public void a(InputStream inputStream, int n8) {
                    if (this.a) {
                        this.a = false;
                    } else {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(n8);
                }
            });
        }
        catch (IOException iOException) {
            u.log(Level.WARNING, "read error", (Throwable)iOException);
        }
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }

    public final void u() {
        int n8;
        this.o.seek(0L);
        this.o.readFully(this.t);
        this.p = n8 = e.v(this.t, 0);
        if ((long)n8 <= this.o.length()) {
            this.q = e.v(this.t, 4);
            n8 = e.v(this.t, 8);
            int n9 = e.v(this.t, 12);
            this.r = this.t(n8);
            this.s = this.t(n9);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("File is truncated. Expected length: ");
        stringBuilder.append(this.p);
        stringBuilder.append(", Actual length: ");
        stringBuilder.append(this.o.length());
        throw new IOException(stringBuilder.toString());
    }

    public final int w() {
        return this.p - this.E();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void x() {
        synchronized (this) {
            try {
                if (this.q()) {
                    throw new NoSuchElementException();
                }
                if (this.q == 1) {
                    this.k();
                } else {
                    b b8 = this.r;
                    int n8 = this.F(b8.a + 4 + b8.b);
                    this.B(n8, this.t, 0, 4);
                    int n9 = e.v(this.t, 0);
                    this.G(this.p, this.q - 1, n8, this.s.a);
                    --this.q;
                    this.r = new b(n8, n9);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static class b {
        public static final b c = new b(0, 0);
        public final int a;
        public final int b;

        public b(int n8, int n9) {
            this.a = n8;
            this.b = n9;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append("[position = ");
            stringBuilder.append(this.a);
            stringBuilder.append(", length = ");
            stringBuilder.append(this.b);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public final class c
    extends InputStream {
        public int o;
        public int p;

        public c(b b8) {
            this.o = e.this.F(b8.a + 4);
            this.p = b8.b;
        }

        public /* synthetic */ c(b b8,  a8) {
            this(b8);
        }

        public int read() {
            if (this.p == 0) {
                return -1;
            }
            e.this.o.seek((long)this.o);
            int n8 = e.this.o.read();
            this.o = e.this.F(this.o + 1);
            --this.p;
            return n8;
        }

        public int read(byte[] arrby, int n8, int n9) {
            e.r(arrby, "buffer");
            if ((n8 | n9) >= 0 && n9 <= arrby.length - n8) {
                int n10 = this.p;
                if (n10 > 0) {
                    int n11 = n9;
                    if (n9 > n10) {
                        n11 = n10;
                    }
                    e.this.B(this.o, arrby, n8, n11);
                    this.o = e.this.F(this.o + n11);
                    this.p -= n11;
                    return n11;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static interface d {
        public void a(InputStream var1, int var2);
    }

}

