package x3;

import java.nio.ByteBuffer;
import x3.f;

/* loaded from: classes.dex */
public final class w extends q {

    /* renamed from: i, reason: collision with root package name */
    public static final int f17102i = Float.floatToIntBits(Float.NaN);

    @Override // x3.f
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer j10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f17030b.f16971c;
        if (i11 == 536870912) {
            j10 = j((i10 / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits == f17102i) {
                    floatToIntBits = Float.floatToIntBits(0.0f);
                }
                j10.putInt(floatToIntBits);
                position += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            j10 = j(i10);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == f17102i) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                j10.putInt(floatToIntBits2);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j10.flip();
    }

    @Override // x3.q
    public final f.a f(f.a aVar) {
        int i10 = aVar.f16971c;
        if (i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 4 ? new f.a(aVar.f16969a, aVar.f16970b, 4) : f.a.f16968e;
        }
        throw new f.b(aVar);
    }
}
