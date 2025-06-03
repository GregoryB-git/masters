package d3;

import d3.C1207A;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.C1919a;
import r3.C1920b;

/* loaded from: classes.dex */
public final class y extends AbstractC1216b {

    /* renamed from: a, reason: collision with root package name */
    public final C1207A f13263a;

    /* renamed from: b, reason: collision with root package name */
    public final C1920b f13264b;

    /* renamed from: c, reason: collision with root package name */
    public final C1919a f13265c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f13266d;

    public y(C1207A c1207a, C1920b c1920b, C1919a c1919a, Integer num) {
        this.f13263a = c1207a;
        this.f13264b = c1920b;
        this.f13265c = c1919a;
        this.f13266d = num;
    }

    public static y a(C1207A.a aVar, C1920b c1920b, Integer num) {
        C1207A.a aVar2 = C1207A.a.f13142d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c1920b.b() == 32) {
            C1207A a7 = C1207A.a(aVar);
            return new y(a7, c1920b, b(a7, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c1920b.b());
    }

    public static C1919a b(C1207A c1207a, Integer num) {
        if (c1207a.b() == C1207A.a.f13142d) {
            return C1919a.a(new byte[0]);
        }
        if (c1207a.b() == C1207A.a.f13141c) {
            return C1919a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (c1207a.b() == C1207A.a.f13140b) {
            return C1919a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + c1207a.b());
    }
}
