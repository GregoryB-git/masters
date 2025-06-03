package O0;

import d0.C1201x;
import g0.AbstractC1297a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c implements a {
    @Override // O0.a
    public final C1201x a(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1297a.e(bVar.f15400r);
        AbstractC1297a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }

    public abstract C1201x b(b bVar, ByteBuffer byteBuffer);
}
