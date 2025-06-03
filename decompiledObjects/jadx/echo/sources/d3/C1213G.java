package d3;

import d3.I;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.C1919a;
import r3.C1920b;

/* renamed from: d3.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1213G extends AbstractC1216b {

    /* renamed from: a, reason: collision with root package name */
    public final I f13155a;

    /* renamed from: b, reason: collision with root package name */
    public final C1920b f13156b;

    /* renamed from: c, reason: collision with root package name */
    public final C1919a f13157c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f13158d;

    public C1213G(I i7, C1920b c1920b, C1919a c1919a, Integer num) {
        this.f13155a = i7;
        this.f13156b = c1920b;
        this.f13157c = c1919a;
        this.f13158d = num;
    }

    public static C1213G a(I.a aVar, C1920b c1920b, Integer num) {
        I.a aVar2 = I.a.f13163d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c1920b.b() == 32) {
            I a7 = I.a(aVar);
            return new C1213G(a7, c1920b, b(a7, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c1920b.b());
    }

    public static C1919a b(I i7, Integer num) {
        if (i7.b() == I.a.f13163d) {
            return C1919a.a(new byte[0]);
        }
        if (i7.b() == I.a.f13162c) {
            return C1919a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (i7.b() == I.a.f13161b) {
            return C1919a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + i7.b());
    }
}
