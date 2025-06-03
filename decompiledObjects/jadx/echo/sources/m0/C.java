package m0;

import e0.InterfaceC1240b;
import g0.AbstractC1297a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class C extends e0.d {

    /* renamed from: i, reason: collision with root package name */
    public int[] f17366i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f17367j;

    @Override // e0.InterfaceC1240b
    public void f(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC1297a.e(this.f17367j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m7 = m(((limit - position) / this.f13682b.f13680d) * this.f13683c.f13680d);
        while (position < limit) {
            for (int i7 : iArr) {
                m7.putShort(byteBuffer.getShort((i7 * 2) + position));
            }
            position += this.f13682b.f13680d;
        }
        byteBuffer.position(limit);
        m7.flip();
    }

    @Override // e0.d
    public InterfaceC1240b.a i(InterfaceC1240b.a aVar) {
        int[] iArr = this.f17366i;
        if (iArr == null) {
            return InterfaceC1240b.a.f13676e;
        }
        if (aVar.f13679c != 2) {
            throw new InterfaceC1240b.C0195b(aVar);
        }
        boolean z7 = aVar.f13678b != iArr.length;
        int i7 = 0;
        while (i7 < iArr.length) {
            int i8 = iArr[i7];
            if (i8 >= aVar.f13678b) {
                throw new InterfaceC1240b.C0195b(aVar);
            }
            z7 |= i8 != i7;
            i7++;
        }
        return z7 ? new InterfaceC1240b.a(aVar.f13677a, iArr.length, 2) : InterfaceC1240b.a.f13676e;
    }

    @Override // e0.d
    public void j() {
        this.f17367j = this.f17366i;
    }

    @Override // e0.d
    public void l() {
        this.f17367j = null;
        this.f17366i = null;
    }

    public void n(int[] iArr) {
        this.f17366i = iArr;
    }
}
