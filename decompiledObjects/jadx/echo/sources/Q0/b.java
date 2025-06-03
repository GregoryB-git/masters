package Q0;

import d0.C1201x;
import g0.AbstractC1297a;
import g0.z;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends O0.c {
    @Override // O0.c
    public C1201x b(O0.b bVar, ByteBuffer byteBuffer) {
        return new C1201x(c(new z(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(z zVar) {
        return new a((String) AbstractC1297a.e(zVar.A()), (String) AbstractC1297a.e(zVar.A()), zVar.z(), zVar.z(), Arrays.copyOfRange(zVar.e(), zVar.f(), zVar.g()));
    }
}
