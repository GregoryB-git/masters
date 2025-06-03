package T;

import T.b;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public class a {

    /* renamed from: T, reason: collision with root package name */
    public static SimpleDateFormat f5941T;

    /* renamed from: U, reason: collision with root package name */
    public static SimpleDateFormat f5942U;

    /* renamed from: Y, reason: collision with root package name */
    public static final d[] f5946Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final d[] f5947Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final d[] f5948a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final d[] f5949b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final d[] f5950c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final d f5951d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final d[] f5952e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final d[] f5953f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final d[] f5954g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final d[] f5955h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final d[][] f5956i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final d[] f5957j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final HashMap[] f5958k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final HashMap[] f5959l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final HashSet f5960m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final HashMap f5961n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final Charset f5962o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final byte[] f5963p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final byte[] f5964q0;

    /* renamed from: r0, reason: collision with root package name */
    public static final Pattern f5965r0;

    /* renamed from: s0, reason: collision with root package name */
    public static final Pattern f5966s0;

    /* renamed from: t0, reason: collision with root package name */
    public static final Pattern f5967t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final Pattern f5969u0;

    /* renamed from: a, reason: collision with root package name */
    public String f5975a;

    /* renamed from: b, reason: collision with root package name */
    public FileDescriptor f5976b;

    /* renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f5977c;

    /* renamed from: d, reason: collision with root package name */
    public int f5978d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5979e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap[] f5980f;

    /* renamed from: g, reason: collision with root package name */
    public Set f5981g;

    /* renamed from: h, reason: collision with root package name */
    public ByteOrder f5982h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5983i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5984j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5985k;

    /* renamed from: l, reason: collision with root package name */
    public int f5986l;

    /* renamed from: m, reason: collision with root package name */
    public int f5987m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f5988n;

    /* renamed from: o, reason: collision with root package name */
    public int f5989o;

    /* renamed from: p, reason: collision with root package name */
    public int f5990p;

    /* renamed from: q, reason: collision with root package name */
    public int f5991q;

    /* renamed from: r, reason: collision with root package name */
    public int f5992r;

    /* renamed from: s, reason: collision with root package name */
    public int f5993s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5994t;

    /* renamed from: u, reason: collision with root package name */
    public static final boolean f5968u = Log.isLoggable("ExifInterface", 3);

    /* renamed from: v, reason: collision with root package name */
    public static final List f5970v = Arrays.asList(1, 6, 3, 8);

    /* renamed from: w, reason: collision with root package name */
    public static final List f5971w = Arrays.asList(2, 7, 4, 5);

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f5972x = {8, 8, 8};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f5973y = {4};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f5974z = {8};

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f5922A = {-1, -40, -1};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f5923B = {102, 116, 121, 112};

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f5924C = {109, 105, 102, 49};

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f5925D = {104, 101, 105, 99};

    /* renamed from: E, reason: collision with root package name */
    public static final byte[] f5926E = {79, 76, 89, 77, 80, 0};

    /* renamed from: F, reason: collision with root package name */
    public static final byte[] f5927F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: G, reason: collision with root package name */
    public static final byte[] f5928G = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: H, reason: collision with root package name */
    public static final byte[] f5929H = {101, 88, 73, 102};

    /* renamed from: I, reason: collision with root package name */
    public static final byte[] f5930I = {73, 72, 68, 82};

    /* renamed from: J, reason: collision with root package name */
    public static final byte[] f5931J = {73, 69, 78, 68};

    /* renamed from: K, reason: collision with root package name */
    public static final byte[] f5932K = {82, 73, 70, 70};

    /* renamed from: L, reason: collision with root package name */
    public static final byte[] f5933L = {87, 69, 66, 80};

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f5934M = {69, 88, 73, 70};

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f5935N = {-99, 1, 42};

    /* renamed from: O, reason: collision with root package name */
    public static final byte[] f5936O = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: P, reason: collision with root package name */
    public static final byte[] f5937P = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: Q, reason: collision with root package name */
    public static final byte[] f5938Q = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: R, reason: collision with root package name */
    public static final byte[] f5939R = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: S, reason: collision with root package name */
    public static final byte[] f5940S = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: V, reason: collision with root package name */
    public static final String[] f5943V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: W, reason: collision with root package name */
    public static final int[] f5944W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: X, reason: collision with root package name */
    public static final byte[] f5945X = {65, 83, 67, 73, 73, 0, 0, 0};

    public static class b extends InputStream implements DataInput {

        /* renamed from: s, reason: collision with root package name */
        public static final ByteOrder f5998s = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: t, reason: collision with root package name */
        public static final ByteOrder f5999t = ByteOrder.BIG_ENDIAN;

        /* renamed from: o, reason: collision with root package name */
        public final DataInputStream f6000o;

        /* renamed from: p, reason: collision with root package name */
        public ByteOrder f6001p;

        /* renamed from: q, reason: collision with root package name */
        public int f6002q;

        /* renamed from: r, reason: collision with root package name */
        public byte[] f6003r;

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.f6002q;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f6000o.available();
        }

        public long b() {
            return readInt() & 4294967295L;
        }

        public void c(ByteOrder byteOrder) {
            this.f6001p = byteOrder;
        }

        public void e(int i7) {
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i7 - i8;
                int skip = (int) this.f6000o.skip(i9);
                if (skip <= 0) {
                    if (this.f6003r == null) {
                        this.f6003r = new byte[8192];
                    }
                    skip = this.f6000o.read(this.f6003r, 0, Math.min(8192, i9));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i7 + " bytes.");
                    }
                }
                i8 += skip;
            }
            this.f6002q += i8;
        }

        @Override // java.io.InputStream
        public void mark(int i7) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f6002q++;
            return this.f6000o.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f6002q++;
            return this.f6000o.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f6002q++;
            int read = this.f6000o.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f6002q += 2;
            return this.f6000o.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f6002q += bArr.length;
            this.f6000o.readFully(bArr);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f6002q += 4;
            int read = this.f6000o.read();
            int read2 = this.f6000o.read();
            int read3 = this.f6000o.read();
            int read4 = this.f6000o.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f6001p;
            if (byteOrder == f5998s) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f5999t) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f6001p);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f6002q += 8;
            int read = this.f6000o.read();
            int read2 = this.f6000o.read();
            int read3 = this.f6000o.read();
            int read4 = this.f6000o.read();
            int read5 = this.f6000o.read();
            int read6 = this.f6000o.read();
            int read7 = this.f6000o.read();
            int read8 = this.f6000o.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f6001p;
            if (byteOrder == f5998s) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f5999t) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f6001p);
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f6002q += 2;
            int read = this.f6000o.read();
            int read2 = this.f6000o.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f6001p;
            if (byteOrder == f5998s) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f5999t) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f6001p);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f6002q += 2;
            return this.f6000o.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f6002q++;
            return this.f6000o.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f6002q += 2;
            int read = this.f6000o.read();
            int read2 = this.f6000o.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f6001p;
            if (byteOrder == f5998s) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f5999t) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f6001p);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i7) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            this.f6001p = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f6000o = dataInputStream;
            dataInputStream.mark(0);
            this.f6002q = 0;
            this.f6001p = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) {
            int read = this.f6000o.read(bArr, i7, i8);
            this.f6002q += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i7, int i8) {
            this.f6002q += i8;
            this.f6000o.readFully(bArr, i7, i8);
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f6004a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6005b;

        /* renamed from: c, reason: collision with root package name */
        public final long f6006c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f6007d;

        public c(int i7, int i8, long j7, byte[] bArr) {
            this.f6004a = i7;
            this.f6005b = i8;
            this.f6006c = j7;
            this.f6007d = bArr;
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f5962o0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j7, ByteOrder byteOrder) {
            return c(new long[]{j7}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f5944W[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j7 : jArr) {
                wrap.putInt((int) j7);
            }
            return new c(4, jArr.length, wrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f5944W[5] * eVarArr.length]);
            wrap.order(byteOrder);
            for (e eVar : eVarArr) {
                wrap.putInt((int) eVar.f6012a);
                wrap.putInt((int) eVar.f6013b);
            }
            return new c(5, eVarArr.length, wrap.array());
        }

        public static c f(int i7, ByteOrder byteOrder) {
            return g(new int[]{i7}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f5944W[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i7 : iArr) {
                wrap.putShort((short) i7);
            }
            return new c(3, iArr.length, wrap.array());
        }

        public double h(ByteOrder byteOrder) {
            Object k7 = k(byteOrder);
            if (k7 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (k7 instanceof String) {
                return Double.parseDouble((String) k7);
            }
            if (k7 instanceof long[]) {
                if (((long[]) k7).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (k7 instanceof int[]) {
                if (((int[]) k7).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (k7 instanceof double[]) {
                double[] dArr = (double[]) k7;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(k7 instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) k7;
            if (eVarArr.length == 1) {
                return eVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int i(ByteOrder byteOrder) {
            Object k7 = k(byteOrder);
            if (k7 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (k7 instanceof String) {
                return Integer.parseInt((String) k7);
            }
            if (k7 instanceof long[]) {
                long[] jArr = (long[]) k7;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(k7 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) k7;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String j(ByteOrder byteOrder) {
            Object k7 = k(byteOrder);
            if (k7 == null) {
                return null;
            }
            if (k7 instanceof String) {
                return (String) k7;
            }
            StringBuilder sb = new StringBuilder();
            int i7 = 0;
            if (k7 instanceof long[]) {
                long[] jArr = (long[]) k7;
                while (i7 < jArr.length) {
                    sb.append(jArr[i7]);
                    i7++;
                    if (i7 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (k7 instanceof int[]) {
                int[] iArr = (int[]) k7;
                while (i7 < iArr.length) {
                    sb.append(iArr[i7]);
                    i7++;
                    if (i7 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (k7 instanceof double[]) {
                double[] dArr = (double[]) k7;
                while (i7 < dArr.length) {
                    sb.append(dArr[i7]);
                    i7++;
                    if (i7 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(k7 instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) k7;
            while (i7 < eVarArr.length) {
                sb.append(eVarArr[i7].f6012a);
                sb.append('/');
                sb.append(eVarArr[i7].f6013b);
                i7++;
                if (i7 != eVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:167:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:170:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object k(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 446
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: T.a.c.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + a.f5943V[this.f6004a] + ", data length:" + this.f6007d.length + ")";
        }

        public c(int i7, int i8, byte[] bArr) {
            this(i7, i8, -1L, bArr);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f6008a;

        /* renamed from: b, reason: collision with root package name */
        public final String f6009b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6010c;

        /* renamed from: d, reason: collision with root package name */
        public final int f6011d;

        public d(String str, int i7, int i8) {
            this.f6009b = str;
            this.f6008a = i7;
            this.f6010c = i8;
            this.f6011d = -1;
        }

        public boolean a(int i7) {
            int i8;
            int i9 = this.f6010c;
            if (i9 == 7 || i7 == 7 || i9 == i7 || (i8 = this.f6011d) == i7) {
                return true;
            }
            if ((i9 == 4 || i8 == 4) && i7 == 3) {
                return true;
            }
            if ((i9 == 9 || i8 == 9) && i7 == 8) {
                return true;
            }
            return (i9 == 12 || i8 == 12) && i7 == 11;
        }

        public d(String str, int i7, int i8, int i9) {
            this.f6009b = str;
            this.f6008a = i7;
            this.f6010c = i8;
            this.f6011d = i9;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final long f6012a;

        /* renamed from: b, reason: collision with root package name */
        public final long f6013b;

        public e(long j7, long j8) {
            if (j8 == 0) {
                this.f6012a = 0L;
                this.f6013b = 1L;
            } else {
                this.f6012a = j7;
                this.f6013b = j8;
            }
        }

        public double a() {
            return this.f6012a / this.f6013b;
        }

        public String toString() {
            return this.f6012a + "/" + this.f6013b;
        }
    }

    public static class f extends b {
        public f(InputStream inputStream) {
            super(inputStream);
            if (!inputStream.markSupported()) {
                throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.f6000o.mark(Integer.MAX_VALUE);
        }

        public void h(long j7) {
            int i7 = this.f6002q;
            if (i7 > j7) {
                this.f6002q = 0;
                this.f6000o.reset();
            } else {
                j7 -= i7;
            }
            e((int) j7);
        }

        public f(byte[] bArr) {
            super(bArr);
            this.f6000o.mark(Integer.MAX_VALUE);
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        f5946Y = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f5947Z = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f5948a0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f5949b0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f5950c0 = dVarArr5;
        f5951d0 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f5952e0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f5953f0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f5954g0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f5955h0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f5956i0 = dVarArr10;
        f5957j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f5958k0 = new HashMap[dVarArr10.length];
        f5959l0 = new HashMap[dVarArr10.length];
        f5960m0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f5961n0 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f5962o0 = forName;
        f5963p0 = "Exif\u0000\u0000".getBytes(forName);
        f5964q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f5941T = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f5942U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i7 = 0;
        while (true) {
            d[][] dVarArr11 = f5956i0;
            if (i7 >= dVarArr11.length) {
                HashMap hashMap = f5961n0;
                d[] dVarArr12 = f5957j0;
                hashMap.put(Integer.valueOf(dVarArr12[0].f6008a), 5);
                hashMap.put(Integer.valueOf(dVarArr12[1].f6008a), 1);
                hashMap.put(Integer.valueOf(dVarArr12[2].f6008a), 2);
                hashMap.put(Integer.valueOf(dVarArr12[3].f6008a), 3);
                hashMap.put(Integer.valueOf(dVarArr12[4].f6008a), 7);
                hashMap.put(Integer.valueOf(dVarArr12[5].f6008a), 8);
                f5965r0 = Pattern.compile(".*[1-9].*");
                f5966s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f5967t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f5969u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f5958k0[i7] = new HashMap();
            f5959l0[i7] = new HashMap();
            for (d dVar : dVarArr11[i7]) {
                f5958k0[i7].put(Integer.valueOf(dVar.f6008a), dVar);
                f5959l0[i7].put(dVar.f6009b, dVar);
            }
            i7++;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public static boolean L(int i7) {
        return (i7 == 4 || i7 == 9 || i7 == 13 || i7 == 14) ? false : true;
    }

    public static boolean r(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f5963p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr3 = f5963p0;
            if (i7 >= bArr3.length) {
                return true;
            }
            if (bArr2[i7] != bArr3[i7]) {
                return false;
            }
            i7++;
        }
    }

    public static boolean t(byte[] bArr) {
        int i7 = 0;
        while (true) {
            byte[] bArr2 = f5922A;
            if (i7 >= bArr2.length) {
                return true;
            }
            if (bArr[i7] != bArr2[i7]) {
                return false;
            }
            i7++;
        }
    }

    public static boolean y(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f5968u) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public final boolean A(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.f5982h) <= 512 && cVar2.i(this.f5982h) <= 512;
    }

    public final boolean B(byte[] bArr) {
        int i7 = 0;
        while (true) {
            byte[] bArr2 = f5932K;
            if (i7 >= bArr2.length) {
                int i8 = 0;
                while (true) {
                    byte[] bArr3 = f5933L;
                    if (i8 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f5932K.length + i8 + 4] != bArr3[i8]) {
                        return false;
                    }
                    i8++;
                }
            } else {
                if (bArr[i7] != bArr2[i7]) {
                    return false;
                }
                i7++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:8:0x001e, B:10:0x0022, B:11:0x0030, B:13:0x0038, B:15:0x0041, B:16:0x0061, B:23:0x0045, B:25:0x004b, B:28:0x0052, B:31:0x005a, B:32:0x005e, B:33:0x006b, B:35:0x0075, B:38:0x007d, B:41:0x0085, B:44:0x008d, B:53:0x009b, B:55:0x009f), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lb8
            r0 = 0
            r1 = r0
        L4:
            T.a$d[][] r2 = T.a.f5956i0     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 >= r2) goto L1e
            java.util.HashMap[] r2 = r4.f5980f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2[r1] = r3     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r1 + 1
            goto L4
        L15:
            r5 = move-exception
            goto Lad
        L18:
            r5 = move-exception
            goto L9b
        L1b:
            r5 = move-exception
            goto L9b
        L1e:
            boolean r1 = r4.f5979e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 != 0) goto L30
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.g(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.f5978d = r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r5 = r1
        L30:
            int r1 = r4.f5978d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r1 = L(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 == 0) goto L6b
            T.a$f r0 = new T.a$f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r5 = r4.f5979e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r5 == 0) goto L45
            r4.n(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L45:
            int r5 = r4.f5978d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1 = 12
            if (r5 != r1) goto L4f
            r4.e(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L4f:
            r1 = 7
            if (r5 != r1) goto L56
            r4.h(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L56:
            r1 = 10
            if (r5 != r1) goto L5e
            r4.m(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L5e:
            r4.k(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L61:
            int r5 = r4.f5990p     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.h(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.K(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L6b:
            T.a$b r1 = new T.a$b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.f5978d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 4
            if (r5 != r2) goto L79
            r4.f(r1, r0, r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L79:
            r0 = 13
            if (r5 != r0) goto L81
            r4.i(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L81:
            r0 = 9
            if (r5 != r0) goto L89
            r4.j(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L89:
            r0 = 14
            if (r5 != r0) goto L90
            r4.o(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L90:
            r4.a()
            boolean r5 = T.a.f5968u
            if (r5 == 0) goto Lac
        L97:
            r4.E()
            goto Lac
        L9b:
            boolean r0 = T.a.f5968u     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto La6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L15
        La6:
            r4.a()
            if (r0 == 0) goto Lac
            goto L97
        Lac:
            return
        Lad:
            r4.a()
            boolean r0 = T.a.f5968u
            if (r0 == 0) goto Lb7
            r4.E()
        Lb7:
            throw r5
        Lb8:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: T.a.C(java.io.InputStream):void");
    }

    public final void D(b bVar) {
        ByteOrder F6 = F(bVar);
        this.f5982h = F6;
        bVar.c(F6);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i7 = this.f5978d;
        if (i7 != 7 && i7 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i8 = readInt - 8;
        if (i8 > 0) {
            bVar.e(i8);
        }
    }

    public final void E() {
        for (int i7 = 0; i7 < this.f5980f.length; i7++) {
            Log.d("ExifInterface", "The size of tag group[" + i7 + "]: " + this.f5980f[i7].size());
            for (Map.Entry entry : this.f5980f[i7].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.j(this.f5982h) + "'");
            }
        }
    }

    public final ByteOrder F(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f5968u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (f5968u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void G(byte[] bArr, int i7) {
        f fVar = new f(bArr);
        D(fVar);
        H(fVar, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(T.a.f r28, int r29) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T.a.H(T.a$f, int):void");
    }

    public final void I(int i7, String str, String str2) {
        if (this.f5980f[i7].isEmpty() || this.f5980f[i7].get(str) == null) {
            return;
        }
        HashMap hashMap = this.f5980f[i7];
        hashMap.put(str2, hashMap.get(str));
        this.f5980f[i7].remove(str);
    }

    public final void J(f fVar, int i7) {
        c cVar = (c) this.f5980f[i7].get("ImageLength");
        c cVar2 = (c) this.f5980f[i7].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = (c) this.f5980f[i7].get("JPEGInterchangeFormat");
            c cVar4 = (c) this.f5980f[i7].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int i8 = cVar3.i(this.f5982h);
            int i9 = cVar3.i(this.f5982h);
            fVar.h(i8);
            byte[] bArr = new byte[i9];
            fVar.read(bArr);
            f(new b(bArr), i8, i7);
        }
    }

    public final void K(b bVar) {
        HashMap hashMap = this.f5980f[4];
        c cVar = (c) hashMap.get("Compression");
        if (cVar != null) {
            int i7 = cVar.i(this.f5982h);
            this.f5989o = i7;
            if (i7 != 1) {
                if (i7 != 6) {
                    if (i7 != 7) {
                        return;
                    }
                }
            }
            if (z(hashMap)) {
                q(bVar, hashMap);
                return;
            }
            return;
        }
        this.f5989o = 6;
        p(bVar, hashMap);
    }

    public final void M(int i7, int i8) {
        String str;
        if (this.f5980f[i7].isEmpty() || this.f5980f[i8].isEmpty()) {
            if (f5968u) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) this.f5980f[i7].get("ImageLength");
        c cVar2 = (c) this.f5980f[i7].get("ImageWidth");
        c cVar3 = (c) this.f5980f[i8].get("ImageLength");
        c cVar4 = (c) this.f5980f[i8].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (!f5968u) {
                return;
            } else {
                str = "First image does not contain valid size information";
            }
        } else {
            if (cVar3 != null && cVar4 != null) {
                int i9 = cVar.i(this.f5982h);
                int i10 = cVar2.i(this.f5982h);
                int i11 = cVar3.i(this.f5982h);
                int i12 = cVar4.i(this.f5982h);
                if (i9 >= i11 || i10 >= i12) {
                    return;
                }
                HashMap[] hashMapArr = this.f5980f;
                HashMap hashMap = hashMapArr[i7];
                hashMapArr[i7] = hashMapArr[i8];
                hashMapArr[i8] = hashMap;
                return;
            }
            if (!f5968u) {
                return;
            } else {
                str = "Second image does not contain valid size information";
            }
        }
        Log.d("ExifInterface", str);
    }

    public final void N(f fVar, int i7) {
        StringBuilder sb;
        String arrays;
        c f7;
        c f8;
        c cVar = (c) this.f5980f[i7].get("DefaultCropSize");
        c cVar2 = (c) this.f5980f[i7].get("SensorTopBorder");
        c cVar3 = (c) this.f5980f[i7].get("SensorLeftBorder");
        c cVar4 = (c) this.f5980f[i7].get("SensorBottomBorder");
        c cVar5 = (c) this.f5980f[i7].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                J(fVar, i7);
                return;
            }
            int i8 = cVar2.i(this.f5982h);
            int i9 = cVar4.i(this.f5982h);
            int i10 = cVar5.i(this.f5982h);
            int i11 = cVar3.i(this.f5982h);
            if (i9 <= i8 || i10 <= i11) {
                return;
            }
            c f9 = c.f(i9 - i8, this.f5982h);
            c f10 = c.f(i10 - i11, this.f5982h);
            this.f5980f[i7].put("ImageLength", f9);
            this.f5980f[i7].put("ImageWidth", f10);
            return;
        }
        if (cVar.f6004a == 5) {
            e[] eVarArr = (e[]) cVar.k(this.f5982h);
            if (eVarArr != null && eVarArr.length == 2) {
                f7 = c.d(eVarArr[0], this.f5982h);
                f8 = c.d(eVarArr[1], this.f5982h);
                this.f5980f[i7].put("ImageWidth", f7);
                this.f5980f[i7].put("ImageLength", f8);
                return;
            }
            sb = new StringBuilder();
            sb.append("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(eVarArr);
            sb.append(arrays);
            Log.w("ExifInterface", sb.toString());
        }
        int[] iArr = (int[]) cVar.k(this.f5982h);
        if (iArr != null && iArr.length == 2) {
            f7 = c.f(iArr[0], this.f5982h);
            f8 = c.f(iArr[1], this.f5982h);
            this.f5980f[i7].put("ImageWidth", f7);
            this.f5980f[i7].put("ImageLength", f8);
            return;
        }
        sb = new StringBuilder();
        sb.append("Invalid crop size values. cropSize=");
        arrays = Arrays.toString(iArr);
        sb.append(arrays);
        Log.w("ExifInterface", sb.toString());
    }

    public final void O() {
        M(0, 5);
        M(0, 4);
        M(5, 4);
        c cVar = (c) this.f5980f[1].get("PixelXDimension");
        c cVar2 = (c) this.f5980f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f5980f[0].put("ImageWidth", cVar);
            this.f5980f[0].put("ImageLength", cVar2);
        }
        if (this.f5980f[4].isEmpty() && A(this.f5980f[5])) {
            HashMap[] hashMapArr = this.f5980f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!A(this.f5980f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        I(0, "ThumbnailOrientation", "Orientation");
        I(0, "ThumbnailImageLength", "ImageLength");
        I(0, "ThumbnailImageWidth", "ImageWidth");
        I(5, "ThumbnailOrientation", "Orientation");
        I(5, "ThumbnailImageLength", "ImageLength");
        I(5, "ThumbnailImageWidth", "ImageWidth");
        I(4, "Orientation", "ThumbnailOrientation");
        I(4, "ImageLength", "ThumbnailImageLength");
        I(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void a() {
        String b7 = b("DateTimeOriginal");
        if (b7 != null && b("DateTime") == null) {
            this.f5980f[0].put("DateTime", c.a(b7));
        }
        if (b("ImageWidth") == null) {
            this.f5980f[0].put("ImageWidth", c.b(0L, this.f5982h));
        }
        if (b("ImageLength") == null) {
            this.f5980f[0].put("ImageLength", c.b(0L, this.f5982h));
        }
        if (b("Orientation") == null) {
            this.f5980f[0].put("Orientation", c.b(0L, this.f5982h));
        }
        if (b("LightSource") == null) {
            this.f5980f[1].put("LightSource", c.b(0L, this.f5982h));
        }
    }

    public String b(String str) {
        String str2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c d7 = d(str);
        if (d7 != null) {
            if (!f5960m0.contains(str)) {
                return d7.j(this.f5982h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i7 = d7.f6004a;
                if (i7 == 5 || i7 == 10) {
                    e[] eVarArr = (e[]) d7.k(this.f5982h);
                    if (eVarArr != null && eVarArr.length == 3) {
                        e eVar = eVarArr[0];
                        Integer valueOf = Integer.valueOf((int) (eVar.f6012a / eVar.f6013b));
                        e eVar2 = eVarArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (eVar2.f6012a / eVar2.f6013b));
                        e eVar3 = eVarArr[2];
                        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (eVar3.f6012a / eVar3.f6013b)));
                    }
                    str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr);
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + d7.f6004a;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(d7.h(this.f5982h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int c(String str, int i7) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c d7 = d(str);
        if (d7 == null) {
            return i7;
        }
        try {
            return d7.i(this.f5982h);
        } catch (NumberFormatException unused) {
            return i7;
        }
    }

    public final c d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f5968u) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i7 = 0; i7 < f5956i0.length; i7++) {
            c cVar = (c) this.f5980f[i7].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(f fVar) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0098b.a(mediaMetadataRetriever, new C0097a(fVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (str != null) {
                    this.f5980f[0].put("ImageWidth", c.f(Integer.parseInt(str), this.f5982h));
                }
                if (str2 != null) {
                    this.f5980f[0].put("ImageLength", c.f(Integer.parseInt(str2), this.f5982h));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    this.f5980f[0].put("Orientation", c.f(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f5982h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.h(parseInt2);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i7 = parseInt2 + 6;
                    int i8 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f5963p0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    if (fVar.read(bArr2) != i8) {
                        throw new IOException("Can't read exif");
                    }
                    this.f5990p = i7;
                    G(bArr2, 0);
                }
                if (f5968u) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0191, code lost:
    
        r22.c(r21.f5982h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0196, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017b A[LOOP:0: B:9:0x0037->B:33:0x017b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(T.a.b r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T.a.f(T.a$b, int, int):void");
    }

    public final int g(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (t(bArr)) {
            return 4;
        }
        if (w(bArr)) {
            return 9;
        }
        if (s(bArr)) {
            return 12;
        }
        if (u(bArr)) {
            return 7;
        }
        if (x(bArr)) {
            return 10;
        }
        if (v(bArr)) {
            return 13;
        }
        return B(bArr) ? 14 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(T.a.f r6) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T.a.h(T.a$f):void");
    }

    public final void i(b bVar) {
        if (f5968u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.c(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f5928G;
        bVar.e(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i7 = length + 8;
                if (i7 == 16 && !Arrays.equals(bArr2, f5930I)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f5931J)) {
                    return;
                }
                if (Arrays.equals(bArr2, f5929H)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + T.b.a(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f5990p = i7;
                        G(bArr3, 0);
                        O();
                        K(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i8 = readInt + 4;
                bVar.e(i8);
                length = i7 + i8;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void j(b bVar) {
        boolean z7 = f5968u;
        if (z7) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.e(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i7 = ByteBuffer.wrap(bArr).getInt();
        int i8 = ByteBuffer.wrap(bArr2).getInt();
        int i9 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i8];
        bVar.e(i7 - bVar.a());
        bVar.read(bArr4);
        f(new b(bArr4), i7, 5);
        bVar.e(i9 - bVar.a());
        bVar.c(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z7) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i10 = 0; i10 < readInt; i10++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f5951d0.f6008a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c f7 = c.f(readShort, this.f5982h);
                c f8 = c.f(readShort2, this.f5982h);
                this.f5980f[0].put("ImageLength", f7);
                this.f5980f[0].put("ImageWidth", f8);
                if (f5968u) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.e(readUnsignedShort2);
        }
    }

    public final void k(f fVar) {
        c cVar;
        D(fVar);
        H(fVar, 0);
        N(fVar, 0);
        N(fVar, 5);
        N(fVar, 4);
        O();
        if (this.f5978d != 8 || (cVar = (c) this.f5980f[1].get("MakerNote")) == null) {
            return;
        }
        f fVar2 = new f(cVar.f6007d);
        fVar2.c(this.f5982h);
        fVar2.e(6);
        H(fVar2, 9);
        c cVar2 = (c) this.f5980f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f5980f[1].put("ColorSpace", cVar2);
        }
    }

    public int l() {
        switch (c("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void m(f fVar) {
        if (f5968u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        c cVar = (c) this.f5980f[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f6007d), (int) cVar.f6006c, 5);
        }
        c cVar2 = (c) this.f5980f[0].get("ISO");
        c cVar3 = (c) this.f5980f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f5980f[1].put("PhotographicSensitivity", cVar2);
    }

    public final void n(f fVar) {
        byte[] bArr = f5963p0;
        fVar.e(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.f5990p = bArr.length;
        G(bArr2, 0);
    }

    public final void o(b bVar) {
        if (f5968u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.c(ByteOrder.LITTLE_ENDIAN);
        bVar.e(f5932K.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f5933L;
        bVar.e(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i7 = length + 8;
                if (Arrays.equals(f5934M, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (bVar.read(bArr3) == readInt2) {
                        this.f5990p = i7;
                        G(bArr3, 0);
                        K(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + T.b.a(bArr2));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i7 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.e(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void p(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i7 = cVar.i(this.f5982h);
        int i8 = cVar2.i(this.f5982h);
        if (this.f5978d == 7) {
            i7 += this.f5991q;
        }
        if (i7 > 0 && i8 > 0) {
            this.f5983i = true;
            if (this.f5975a == null && this.f5977c == null && this.f5976b == null) {
                byte[] bArr = new byte[i8];
                bVar.skip(i7);
                bVar.read(bArr);
                this.f5988n = bArr;
            }
            this.f5986l = i7;
            this.f5987m = i8;
        }
        if (f5968u) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i7 + ", length: " + i8);
        }
    }

    public final void q(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("StripOffsets");
        c cVar2 = (c) hashMap.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] b7 = T.b.b(cVar.k(this.f5982h));
        long[] b8 = T.b.b(cVar2.k(this.f5982h));
        if (b7 == null || b7.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (b8 == null || b8.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (b7.length != b8.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j7 = 0;
        for (long j8 : b8) {
            j7 += j8;
        }
        int i7 = (int) j7;
        byte[] bArr = new byte[i7];
        this.f5985k = true;
        this.f5984j = true;
        this.f5983i = true;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < b7.length; i10++) {
            int i11 = (int) b7[i10];
            int i12 = (int) b8[i10];
            if (i10 < b7.length - 1 && i11 + i12 != b7[i10 + 1]) {
                this.f5985k = false;
            }
            int i13 = i11 - i8;
            if (i13 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            long j9 = i13;
            if (bVar.skip(j9) != j9) {
                Log.d("ExifInterface", "Failed to skip " + i13 + " bytes.");
                return;
            }
            int i14 = i8 + i13;
            byte[] bArr2 = new byte[i12];
            if (bVar.read(bArr2) != i12) {
                Log.d("ExifInterface", "Failed to read " + i12 + " bytes.");
                return;
            }
            i8 = i14 + i12;
            System.arraycopy(bArr2, 0, bArr, i9, i12);
            i9 += i12;
        }
        this.f5988n = bArr;
        if (this.f5985k) {
            this.f5986l = (int) b7[0];
            this.f5987m = i7;
        }
    }

    public final boolean s(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j7;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    readInt = bVar.readInt();
                    bArr2 = new byte[4];
                    bVar.read(bArr2);
                } catch (Exception e7) {
                    e = e7;
                    bVar2 = bVar;
                    if (f5968u) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e8) {
            e = e8;
        }
        if (!Arrays.equals(bArr2, f5923B)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j7 = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j7 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j8 = readInt - j7;
        if (j8 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z7 = false;
        boolean z8 = false;
        for (long j9 = 0; j9 < j8 / 4; j9++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j9 != 1) {
                if (Arrays.equals(bArr3, f5924C)) {
                    z7 = true;
                } else if (Arrays.equals(bArr3, f5925D)) {
                    z8 = true;
                }
                if (z7 && z8) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    public final boolean u(byte[] bArr) {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder F6 = F(bVar);
            this.f5982h = F6;
            bVar.c(F6);
            short readShort = bVar.readShort();
            boolean z7 = readShort == 20306 || readShort == 21330;
            bVar.close();
            return z7;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    public final boolean v(byte[] bArr) {
        int i7 = 0;
        while (true) {
            byte[] bArr2 = f5928G;
            if (i7 >= bArr2.length) {
                return true;
            }
            if (bArr[i7] != bArr2[i7]) {
                return false;
            }
            i7++;
        }
    }

    public final boolean w(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i7 = 0; i7 < bytes.length; i7++) {
            if (bArr[i7] != bytes[i7]) {
                return false;
            }
        }
        return true;
    }

    public final boolean x(byte[] bArr) {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder F6 = F(bVar);
            this.f5982h = F6;
            bVar.c(F6);
            boolean z7 = bVar.readShort() == 85;
            bVar.close();
            return z7;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    public final boolean z(HashMap hashMap) {
        c cVar;
        int i7;
        c cVar2 = (c) hashMap.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.k(this.f5982h);
            int[] iArr2 = f5972x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f5978d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((i7 = cVar.i(this.f5982h)) == 1 && Arrays.equals(iArr, f5974z)) || (i7 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f5968u) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    public a(InputStream inputStream, int i7) {
        d[][] dVarArr = f5956i0;
        this.f5980f = new HashMap[dVarArr.length];
        this.f5981g = new HashSet(dVarArr.length);
        this.f5982h = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        this.f5975a = null;
        if (i7 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f5963p0.length);
            if (!r(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f5979e = true;
            this.f5977c = null;
            this.f5976b = null;
            inputStream = bufferedInputStream;
        } else {
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f5977c = (AssetManager.AssetInputStream) inputStream;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (y(fileInputStream.getFD())) {
                        this.f5977c = null;
                        this.f5976b = fileInputStream.getFD();
                    }
                }
                this.f5977c = null;
            }
            this.f5976b = null;
        }
        C(inputStream);
    }

    /* renamed from: T.a$a, reason: collision with other inner class name */
    public class C0097a extends MediaDataSource {

        /* renamed from: o, reason: collision with root package name */
        public long f5995o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ f f5996p;

        public C0097a(f fVar) {
            this.f5996p = fVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j7, byte[] bArr, int i7, int i8) {
            if (i8 == 0) {
                return 0;
            }
            if (j7 < 0) {
                return -1;
            }
            try {
                long j8 = this.f5995o;
                if (j8 != j7) {
                    if (j8 >= 0 && j7 >= j8 + this.f5996p.available()) {
                        return -1;
                    }
                    this.f5996p.h(j7);
                    this.f5995o = j7;
                }
                if (i8 > this.f5996p.available()) {
                    i8 = this.f5996p.available();
                }
                int read = this.f5996p.read(bArr, i7, i8);
                if (read >= 0) {
                    this.f5995o += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f5995o = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
