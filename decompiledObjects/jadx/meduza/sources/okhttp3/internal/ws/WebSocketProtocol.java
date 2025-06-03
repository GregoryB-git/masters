package okhttp3.internal.ws;

import ec.i;
import xc.f;

/* loaded from: classes.dex */
public final class WebSocketProtocol {
    private WebSocketProtocol() {
        throw new AssertionError("No instances.");
    }

    public static void a(f.a aVar, byte[] bArr) {
        long j10;
        int length = bArr.length;
        int i10 = 0;
        do {
            byte[] bArr2 = aVar.f17257e;
            int i11 = aVar.f;
            int i12 = aVar.f17258o;
            while (true) {
                if (i11 >= i12) {
                    break;
                }
                int i13 = i10 % length;
                bArr2[i11] = (byte) (bArr2[i11] ^ bArr[i13]);
                i11++;
                i10 = i13 + 1;
            }
            long j11 = aVar.f17256d;
            f fVar = aVar.f17253a;
            i.b(fVar);
            if (!(j11 != fVar.f17252b)) {
                throw new IllegalStateException("no more bytes".toString());
            }
            j10 = aVar.f17256d;
        } while (aVar.f(j10 == -1 ? 0L : j10 + (aVar.f17258o - aVar.f)) != -1);
    }
}
