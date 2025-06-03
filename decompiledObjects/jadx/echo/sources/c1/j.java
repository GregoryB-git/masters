package c1;

import g0.AbstractC1297a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class j extends j0.k implements l {

    /* renamed from: o, reason: collision with root package name */
    public final String f10026o;

    public class a extends q {
        public a() {
        }

        @Override // j0.j
        public void x() {
            j.this.t(this);
        }
    }

    public j(String str) {
        super(new p[2], new q[2]);
        this.f10026o = str;
        w(1024);
    }

    @Override // j0.k
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final m k(Throwable th) {
        return new m("Unexpected decode error", th);
    }

    public abstract k B(byte[] bArr, int i7, boolean z7);

    @Override // j0.k
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final m l(p pVar, q qVar, boolean z7) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC1297a.e(pVar.f15400r);
            qVar.z(pVar.f15402t, B(byteBuffer.array(), byteBuffer.limit(), z7), pVar.f10042x);
            qVar.f15410r = false;
            return null;
        } catch (m e7) {
            return e7;
        }
    }

    @Override // j0.k
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final p i() {
        return new p();
    }

    @Override // j0.k
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final q j() {
        return new a();
    }

    @Override // c1.l
    public void d(long j7) {
    }
}
