package t0;

import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* loaded from: classes.dex */
public final class g {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f14398a;

        public a(ByteBuffer byteBuffer) {
            this.f14398a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final long a() {
            return this.f14398a.getInt() & KeyboardMap.kValueMask;
        }

        public final void b(int i10) {
            ByteBuffer byteBuffer = this.f14398a;
            byteBuffer.position(byteBuffer.position() + i10);
        }
    }

    public static u0.b a(MappedByteBuffer mappedByteBuffer) {
        long j10;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        a aVar = new a(duplicate);
        aVar.b(4);
        int i10 = duplicate.getShort() & 65535;
        if (i10 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        aVar.b(6);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                j10 = -1;
                break;
            }
            int i12 = aVar.f14398a.getInt();
            aVar.b(4);
            j10 = aVar.a();
            aVar.b(4);
            if (1835365473 == i12) {
                break;
            }
            i11++;
        }
        if (j10 != -1) {
            aVar.b((int) (j10 - aVar.f14398a.position()));
            aVar.b(12);
            long a10 = aVar.a();
            for (int i13 = 0; i13 < a10; i13++) {
                int i14 = aVar.f14398a.getInt();
                long a11 = aVar.a();
                aVar.a();
                if (1164798569 == i14 || 1701669481 == i14) {
                    duplicate.position((int) (a11 + j10));
                    u0.b bVar = new u0.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f14883b = duplicate;
                    bVar.f14882a = position;
                    int i15 = position - duplicate.getInt(position);
                    bVar.f14884c = i15;
                    bVar.f14885d = bVar.f14883b.getShort(i15);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
