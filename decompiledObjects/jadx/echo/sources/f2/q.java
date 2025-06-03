package f2;

import c2.C0819b;
import c2.InterfaceC0822e;
import java.util.Set;

/* loaded from: classes.dex */
public final class q implements c2.g {

    /* renamed from: a, reason: collision with root package name */
    public final Set f14219a;

    /* renamed from: b, reason: collision with root package name */
    public final p f14220b;

    /* renamed from: c, reason: collision with root package name */
    public final t f14221c;

    public q(Set set, p pVar, t tVar) {
        this.f14219a = set;
        this.f14220b = pVar;
        this.f14221c = tVar;
    }

    @Override // c2.g
    public c2.f a(String str, Class cls, C0819b c0819b, InterfaceC0822e interfaceC0822e) {
        if (this.f14219a.contains(c0819b)) {
            return new s(this.f14220b, str, c0819b, interfaceC0822e, this.f14221c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c0819b, this.f14219a));
    }
}
