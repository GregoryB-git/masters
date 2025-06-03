package x3;

import java.nio.ByteBuffer;
import x3.f;

/* loaded from: classes.dex */
public final class r extends q {

    /* renamed from: i, reason: collision with root package name */
    public int[] f17036i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f17037j;

    @Override // x3.f
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.f17037j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j10 = j(((limit - position) / this.f17030b.f16972d) * this.f17031c.f16972d);
        while (position < limit) {
            for (int i10 : iArr) {
                j10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f17030b.f16972d;
        }
        byteBuffer.position(limit);
        j10.flip();
    }

    @Override // x3.q
    public final f.a f(f.a aVar) {
        int[] iArr = this.f17036i;
        if (iArr == null) {
            return f.a.f16968e;
        }
        if (aVar.f16971c != 2) {
            throw new f.b(aVar);
        }
        boolean z10 = aVar.f16970b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f16970b) {
                throw new f.b(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new f.a(aVar.f16969a, iArr.length, 2) : f.a.f16968e;
    }

    @Override // x3.q
    public final void g() {
        this.f17037j = this.f17036i;
    }

    @Override // x3.q
    public final void i() {
        this.f17037j = null;
        this.f17036i = null;
    }
}
