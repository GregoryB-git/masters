package x1;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import x1.J;

/* loaded from: classes.dex */
public final class T extends FilterOutputStream implements U {

    /* renamed from: o, reason: collision with root package name */
    public final J f20982o;

    /* renamed from: p, reason: collision with root package name */
    public final Map f20983p;

    /* renamed from: q, reason: collision with root package name */
    public final long f20984q;

    /* renamed from: r, reason: collision with root package name */
    public final long f20985r;

    /* renamed from: s, reason: collision with root package name */
    public long f20986s;

    /* renamed from: t, reason: collision with root package name */
    public long f20987t;

    /* renamed from: u, reason: collision with root package name */
    public V f20988u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(OutputStream out, J requests, Map progressMap, long j7) {
        super(out);
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(progressMap, "progressMap");
        this.f20982o = requests;
        this.f20983p = progressMap;
        this.f20984q = j7;
        this.f20985r = C2146B.A();
    }

    private final void b(long j7) {
        V v7 = this.f20988u;
        if (v7 != null) {
            v7.a(j7);
        }
        long j8 = this.f20986s + j7;
        this.f20986s = j8;
        if (j8 >= this.f20987t + this.f20985r || j8 >= this.f20984q) {
            c();
        }
    }

    @Override // x1.U
    public void a(F f7) {
        this.f20988u = f7 != null ? (V) this.f20983p.get(f7) : null;
    }

    public final void c() {
        if (this.f20986s > this.f20987t) {
            for (J.a aVar : this.f20982o.T()) {
            }
            this.f20987t = this.f20986s;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        Iterator it = this.f20983p.values().iterator();
        while (it.hasNext()) {
            ((V) it.next()).c();
        }
        c();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i7) {
        ((FilterOutputStream) this).out.write(i7);
        b(1L);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        b(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer, int i7, int i8) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i7, i8);
        b(i8);
    }
}
