package V0;

import d0.C1201x;
import g0.E;
import g0.y;
import g0.z;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c extends O0.c {

    /* renamed from: a, reason: collision with root package name */
    public final z f6376a = new z();

    /* renamed from: b, reason: collision with root package name */
    public final y f6377b = new y();

    /* renamed from: c, reason: collision with root package name */
    public E f6378c;

    @Override // O0.c
    public C1201x b(O0.b bVar, ByteBuffer byteBuffer) {
        E e7 = this.f6378c;
        if (e7 == null || bVar.f3710x != e7.f()) {
            E e8 = new E(bVar.f15402t);
            this.f6378c = e8;
            e8.a(bVar.f15402t - bVar.f3710x);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f6376a.R(array, limit);
        this.f6377b.o(array, limit);
        this.f6377b.r(39);
        long h7 = (this.f6377b.h(1) << 32) | this.f6377b.h(32);
        this.f6377b.r(20);
        int h8 = this.f6377b.h(12);
        int h9 = this.f6377b.h(8);
        this.f6376a.U(14);
        C1201x.b a7 = h9 != 0 ? h9 != 255 ? h9 != 4 ? h9 != 5 ? h9 != 6 ? null : g.a(this.f6376a, h7, this.f6378c) : d.a(this.f6376a, h7, this.f6378c) : f.a(this.f6376a) : a.a(this.f6376a, h8, h7) : new e();
        return a7 == null ? new C1201x(new C1201x.b[0]) : new C1201x(a7);
    }
}
