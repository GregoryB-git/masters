package gb;

import eb.j;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j2 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f6535a;

    /* renamed from: c, reason: collision with root package name */
    public s3 f6537c;

    /* renamed from: g, reason: collision with root package name */
    public final t3 f6540g;

    /* renamed from: h, reason: collision with root package name */
    public final l3 f6541h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6542i;

    /* renamed from: j, reason: collision with root package name */
    public int f6543j;

    /* renamed from: l, reason: collision with root package name */
    public long f6545l;

    /* renamed from: b, reason: collision with root package name */
    public int f6536b = -1;

    /* renamed from: d, reason: collision with root package name */
    public eb.l f6538d = j.b.f5135a;

    /* renamed from: e, reason: collision with root package name */
    public final b f6539e = new b();
    public final ByteBuffer f = ByteBuffer.allocate(5);

    /* renamed from: k, reason: collision with root package name */
    public int f6544k = -1;

    public final class a extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f6546a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public s3 f6547b;

        public a() {
        }

        @Override // java.io.OutputStream
        public final void write(int i10) {
            s3 s3Var = this.f6547b;
            if (s3Var == null || s3Var.a() <= 0) {
                write(new byte[]{(byte) i10}, 0, 1);
            } else {
                this.f6547b.c((byte) i10);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x001e -> B:4:0x0032). Please report as a decompilation issue!!! */
        @Override // java.io.OutputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void write(byte[] r4, int r5, int r6) {
            /*
                r3 = this;
                gb.s3 r0 = r3.f6547b
                if (r0 != 0) goto Lf
                gb.j2 r0 = gb.j2.this
                gb.t3 r0 = r0.f6540g
                hb.o r0 = r0.a(r6)
                r1 = r0
                r0 = r3
                goto L32
            Lf:
                r0 = r3
            L10:
                if (r6 <= 0) goto L42
                gb.s3 r1 = r0.f6547b
                int r1 = r1.a()
                int r1 = java.lang.Math.min(r6, r1)
                if (r1 != 0) goto L3a
                gb.s3 r1 = r0.f6547b
                int r1 = r1.b()
                int r1 = r1 * 2
                int r1 = java.lang.Math.max(r6, r1)
                gb.j2 r2 = gb.j2.this
                gb.t3 r2 = r2.f6540g
                hb.o r1 = r2.a(r1)
            L32:
                r0.f6547b = r1
                java.util.ArrayList r2 = r0.f6546a
                r2.add(r1)
                goto L10
            L3a:
                gb.s3 r2 = r0.f6547b
                r2.write(r4, r5, r1)
                int r5 = r5 + r1
                int r6 = r6 - r1
                goto L10
            L42:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gb.j2.a.write(byte[], int, int):void");
        }
    }

    public class b extends OutputStream {
        public b() {
        }

        @Override // java.io.OutputStream
        public final void write(int i10) {
            write(new byte[]{(byte) i10}, 0, 1);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) {
            j2.this.e(bArr, i10, i11);
        }
    }

    public interface c {
        void c(s3 s3Var, boolean z10, boolean z11, int i10);
    }

    public j2(c cVar, eb.y yVar, l3 l3Var) {
        x6.b.y(cVar, "sink");
        this.f6535a = cVar;
        this.f6540g = yVar;
        this.f6541h = l3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int f(InputStream inputStream, OutputStream outputStream) {
        if (inputStream instanceof eb.t) {
            return ((eb.t) inputStream).f(outputStream);
        }
        int i10 = p7.b.f13030a;
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j10 += read;
        }
        x6.b.m(j10, "Message size overflow: %s", j10 <= 2147483647L);
        return (int) j10;
    }

    @Override // gb.t0
    public final t0 a(eb.l lVar) {
        x6.b.y(lVar, "Can't pass an empty compressor");
        this.f6538d = lVar;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[LOOP:1: B:26:0x0079->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[LOOP:2: B:30:0x008b->B:31:0x008d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[LOOP:3: B:34:0x009e->B:35:0x00a0, LOOP_END] */
    @Override // gb.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.io.InputStream r14) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.j2.b(java.io.InputStream):void");
    }

    public final void c(a aVar, boolean z10) {
        Iterator it = aVar.f6546a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((s3) it.next()).b();
        }
        int i11 = this.f6536b;
        if (i11 >= 0 && i10 > i11) {
            throw new eb.g1(eb.e1.f5075k.g(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i10), Integer.valueOf(this.f6536b))));
        }
        this.f.clear();
        this.f.put(z10 ? (byte) 1 : (byte) 0).putInt(i10);
        hb.o a10 = this.f6540g.a(5);
        a10.write(this.f.array(), 0, this.f.position());
        if (i10 == 0) {
            this.f6537c = a10;
            return;
        }
        this.f6535a.c(a10, false, false, this.f6543j - 1);
        this.f6543j = 1;
        ArrayList arrayList = aVar.f6546a;
        for (int i12 = 0; i12 < arrayList.size() - 1; i12++) {
            this.f6535a.c((s3) arrayList.get(i12), false, false, 0);
        }
        this.f6537c = (s3) arrayList.get(arrayList.size() - 1);
        this.f6545l = i10;
    }

    @Override // gb.t0
    public final void close() {
        s3 s3Var;
        if (this.f6542i) {
            return;
        }
        this.f6542i = true;
        s3 s3Var2 = this.f6537c;
        if (s3Var2 != null && s3Var2.b() == 0 && (s3Var = this.f6537c) != null) {
            s3Var.release();
            this.f6537c = null;
        }
        s3 s3Var3 = this.f6537c;
        this.f6537c = null;
        this.f6535a.c(s3Var3, true, true, this.f6543j);
        this.f6543j = 0;
    }

    public final int d(InputStream inputStream) {
        a aVar = new a();
        OutputStream b10 = this.f6538d.b(aVar);
        try {
            int f = f(inputStream, b10);
            b10.close();
            int i10 = this.f6536b;
            if (i10 >= 0 && f > i10) {
                throw new eb.g1(eb.e1.f5075k.g(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(f), Integer.valueOf(this.f6536b))));
            }
            c(aVar, true);
            return f;
        } catch (Throwable th) {
            b10.close();
            throw th;
        }
    }

    public final void e(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            s3 s3Var = this.f6537c;
            if (s3Var != null && s3Var.a() == 0) {
                s3 s3Var2 = this.f6537c;
                this.f6537c = null;
                this.f6535a.c(s3Var2, false, false, this.f6543j);
                this.f6543j = 0;
            }
            if (this.f6537c == null) {
                this.f6537c = this.f6540g.a(i11);
            }
            int min = Math.min(i11, this.f6537c.a());
            this.f6537c.write(bArr, i10, min);
            i10 += min;
            i11 -= min;
        }
    }

    @Override // gb.t0
    public final void flush() {
        s3 s3Var = this.f6537c;
        if (s3Var == null || s3Var.b() <= 0) {
            return;
        }
        s3 s3Var2 = this.f6537c;
        this.f6537c = null;
        this.f6535a.c(s3Var2, false, true, this.f6543j);
        this.f6543j = 0;
    }

    public final int g(InputStream inputStream, int i10) {
        if (i10 == -1) {
            a aVar = new a();
            int f = f(inputStream, aVar);
            c(aVar, false);
            return f;
        }
        this.f6545l = i10;
        int i11 = this.f6536b;
        if (i11 >= 0 && i10 > i11) {
            throw new eb.g1(eb.e1.f5075k.g(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i10), Integer.valueOf(this.f6536b))));
        }
        this.f.clear();
        this.f.put((byte) 0).putInt(i10);
        if (this.f6537c == null) {
            this.f6537c = this.f6540g.a(this.f.position() + i10);
        }
        e(this.f.array(), 0, this.f.position());
        return f(inputStream, this.f6539e);
    }

    @Override // gb.t0
    public final void h(int i10) {
        x6.b.I(this.f6536b == -1, "max size already set");
        this.f6536b = i10;
    }

    @Override // gb.t0
    public final boolean isClosed() {
        return this.f6542i;
    }
}
