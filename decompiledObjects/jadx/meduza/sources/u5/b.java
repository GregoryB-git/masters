package u5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import u5.a;
import v5.e0;

/* loaded from: classes.dex */
public final class b implements t5.j {

    /* renamed from: a, reason: collision with root package name */
    public final u5.a f14977a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14978b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14979c;

    /* renamed from: d, reason: collision with root package name */
    public t5.n f14980d;

    /* renamed from: e, reason: collision with root package name */
    public long f14981e;
    public File f;

    /* renamed from: g, reason: collision with root package name */
    public OutputStream f14982g;

    /* renamed from: h, reason: collision with root package name */
    public long f14983h;

    /* renamed from: i, reason: collision with root package name */
    public long f14984i;

    /* renamed from: j, reason: collision with root package name */
    public o f14985j;

    public static final class a extends a.C0242a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public b(q qVar, long j10) {
        if (!(j10 > 0 || j10 == -1)) {
            throw new IllegalStateException("fragmentSize must be positive or C.LENGTH_UNSET.");
        }
        if (j10 != -1 && j10 < 2097152) {
            v5.m.f("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f14977a = qVar;
        this.f14978b = j10 == -1 ? Long.MAX_VALUE : j10;
        this.f14979c = 20480;
    }

    @Override // t5.j
    public final void a(t5.n nVar) {
        nVar.f14553h.getClass();
        if (nVar.f14552g == -1) {
            if ((nVar.f14554i & 2) == 2) {
                this.f14980d = null;
                return;
            }
        }
        this.f14980d = nVar;
        this.f14981e = (nVar.f14554i & 4) == 4 ? this.f14978b : Long.MAX_VALUE;
        this.f14984i = 0L;
        try {
            c(nVar);
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    public final void b() {
        OutputStream outputStream = this.f14982g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            e0.g(this.f14982g);
            this.f14982g = null;
            File file = this.f;
            this.f = null;
            this.f14977a.h(file, this.f14983h);
        } catch (Throwable th) {
            e0.g(this.f14982g);
            this.f14982g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    public final void c(t5.n nVar) {
        long j10 = nVar.f14552g;
        long min = j10 != -1 ? Math.min(j10 - this.f14984i, this.f14981e) : -1L;
        u5.a aVar = this.f14977a;
        String str = nVar.f14553h;
        int i10 = e0.f15881a;
        this.f = aVar.e(nVar.f + this.f14984i, min, str);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        OutputStream outputStream = fileOutputStream;
        if (this.f14979c > 0) {
            o oVar = this.f14985j;
            if (oVar == null) {
                this.f14985j = new o(fileOutputStream, this.f14979c);
            } else {
                oVar.f(fileOutputStream);
            }
            outputStream = this.f14985j;
        }
        this.f14982g = outputStream;
        this.f14983h = 0L;
    }

    @Override // t5.j
    public final void close() {
        if (this.f14980d == null) {
            return;
        }
        try {
            b();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // t5.j
    public final void write(byte[] bArr, int i10, int i11) {
        t5.n nVar = this.f14980d;
        if (nVar == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.f14983h == this.f14981e) {
                    b();
                    c(nVar);
                }
                int min = (int) Math.min(i11 - i12, this.f14981e - this.f14983h);
                OutputStream outputStream = this.f14982g;
                int i13 = e0.f15881a;
                outputStream.write(bArr, i10 + i12, min);
                i12 += min;
                long j10 = min;
                this.f14983h += j10;
                this.f14984i += j10;
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
    }
}
