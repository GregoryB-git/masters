package gb;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* loaded from: classes.dex */
public final class w0 implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public int f6871e;
    public int f;

    /* renamed from: o, reason: collision with root package name */
    public Inflater f6872o;

    /* renamed from: r, reason: collision with root package name */
    public int f6875r;

    /* renamed from: s, reason: collision with root package name */
    public int f6876s;
    public long t;

    /* renamed from: a, reason: collision with root package name */
    public final w f6867a = new w();

    /* renamed from: b, reason: collision with root package name */
    public final CRC32 f6868b = new CRC32();

    /* renamed from: c, reason: collision with root package name */
    public final a f6869c = new a();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f6870d = new byte[512];

    /* renamed from: p, reason: collision with root package name */
    public int f6873p = 1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6874q = false;

    /* renamed from: u, reason: collision with root package name */
    public int f6877u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f6878v = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6879w = true;

    public class a {
        public a() {
        }

        public static void a(a aVar, int i10) {
            int i11;
            w0 w0Var = w0.this;
            int i12 = w0Var.f - w0Var.f6871e;
            if (i12 > 0) {
                int min = Math.min(i12, i10);
                w0 w0Var2 = w0.this;
                w0Var2.f6868b.update(w0Var2.f6870d, w0Var2.f6871e, min);
                w0.this.f6871e += min;
                i11 = i10 - min;
            } else {
                i11 = i10;
            }
            if (i11 > 0) {
                byte[] bArr = new byte[512];
                int i13 = 0;
                while (i13 < i11) {
                    int min2 = Math.min(i11 - i13, 512);
                    w0.this.f6867a.U(bArr, 0, min2);
                    w0.this.f6868b.update(bArr, 0, min2);
                    i13 += min2;
                }
            }
            w0.this.f6877u += i10;
        }

        public final int b() {
            int readUnsignedByte;
            w0 w0Var = w0.this;
            int i10 = w0Var.f;
            int i11 = w0Var.f6871e;
            if (i10 - i11 > 0) {
                readUnsignedByte = w0Var.f6870d[i11] & 255;
                w0Var.f6871e = i11 + 1;
            } else {
                readUnsignedByte = w0Var.f6867a.readUnsignedByte();
            }
            w0.this.f6868b.update(readUnsignedByte);
            w0.this.f6877u++;
            return readUnsignedByte;
        }

        public final int c() {
            return b() | (b() << 8);
        }

        public final int d() {
            w0 w0Var = w0.this;
            return (w0Var.f - w0Var.f6871e) + w0Var.f6867a.f6865c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6874q) {
            return;
        }
        this.f6874q = true;
        this.f6867a.close();
        Inflater inflater = this.f6872o;
        if (inflater != null) {
            inflater.end();
            this.f6872o = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x01ff, code lost:
    
        if (r3 == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0203, code lost:
    
        if (r12.f6873p != 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x020b, code lost:
    
        if (r12.f6869c.d() >= 10) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x020e, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x020f, code lost:
    
        r12.f6879w = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0211, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d2, code lost:
    
        if (r12.f6872o.needsInput() != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.w0.f(byte[], int, int):int");
    }

    public final boolean g() {
        if (this.f6872o != null && this.f6869c.d() <= 18) {
            this.f6872o.end();
            this.f6872o = null;
        }
        if (this.f6869c.d() < 8) {
            return false;
        }
        long value = this.f6868b.getValue();
        a aVar = this.f6869c;
        if (value == (aVar.c() | (aVar.c() << 16))) {
            long j10 = this.t;
            a aVar2 = this.f6869c;
            if (j10 == ((aVar2.c() << 16) | aVar2.c())) {
                this.f6868b.reset();
                this.f6873p = 1;
                return true;
            }
        }
        throw new ZipException("Corrupt GZIP trailer");
    }
}
