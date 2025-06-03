package h5;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class f extends z3.j<k, l, i> implements h {
    public f() {
        super(new k[2], new l[2]);
        x6.b.H(this.f17548g == this.f17547e.length);
        for (z3.g gVar : this.f17547e) {
            gVar.q(1024);
        }
    }

    @Override // h5.h
    public final void a(long j10) {
    }

    @Override // z3.j
    public final i e(Throwable th) {
        return new i("Unexpected decode error", th);
    }

    @Override // z3.j
    public final i f(z3.g gVar, z3.h hVar, boolean z10) {
        k kVar = (k) gVar;
        l lVar = (l) hVar;
        try {
            ByteBuffer byteBuffer = kVar.f17532c;
            byteBuffer.getClass();
            lVar.p(kVar.f17534e, h(byteBuffer.array(), byteBuffer.limit(), z10), kVar.f7138q);
            lVar.f17508a &= Integer.MAX_VALUE;
            return null;
        } catch (i e10) {
            return e10;
        }
    }

    public abstract g h(byte[] bArr, int i10, boolean z10);
}
