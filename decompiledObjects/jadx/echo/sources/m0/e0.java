package m0;

import e0.InterfaceC1240b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class e0 extends e0.d {

    /* renamed from: i, reason: collision with root package name */
    public static final int f17548i = Float.floatToIntBits(Float.NaN);

    public static void n(int i7, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i7 * 4.656612875245797E-10d));
        if (floatToIntBits == f17548i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // e0.InterfaceC1240b
    public void f(ByteBuffer byteBuffer) {
        ByteBuffer m7;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        int i8 = this.f13682b.f13679c;
        if (i8 == 21) {
            m7 = m((i7 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), m7);
                position += 3;
            }
        } else if (i8 == 22) {
            m7 = m(i7);
            while (position < limit) {
                n((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), m7);
                position += 4;
            }
        } else if (i8 == 1342177280) {
            m7 = m((i7 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), m7);
                position += 3;
            }
        } else {
            if (i8 != 1610612736) {
                throw new IllegalStateException();
            }
            m7 = m(i7);
            while (position < limit) {
                n((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), m7);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m7.flip();
    }

    @Override // e0.d
    public InterfaceC1240b.a i(InterfaceC1240b.a aVar) {
        int i7 = aVar.f13679c;
        if (g0.M.z0(i7)) {
            return i7 != 4 ? new InterfaceC1240b.a(aVar.f13677a, aVar.f13678b, 4) : InterfaceC1240b.a.f13676e;
        }
        throw new InterfaceC1240b.C0195b(aVar);
    }
}
