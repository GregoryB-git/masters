package r4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p4.d;
import v5.u;

/* loaded from: classes.dex */
public final class b extends e9.a {
    public static a C(u uVar) {
        String p10 = uVar.p();
        p10.getClass();
        String p11 = uVar.p();
        p11.getClass();
        return new a(p10, p11, uVar.o(), uVar.o(), Arrays.copyOfRange(uVar.f15974a, uVar.f15975b, uVar.f15976c));
    }

    @Override // e9.a
    public final p4.a i(d dVar, ByteBuffer byteBuffer) {
        return new p4.a(C(new u(byteBuffer.array(), byteBuffer.limit())));
    }
}
