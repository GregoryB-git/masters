package x3;

import java.util.HashSet;
import java.util.Set;
import w3.InterfaceC2100a;

/* renamed from: x3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2216d {

    /* renamed from: a, reason: collision with root package name */
    public Set f21211a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2100a.b f21212b;

    /* renamed from: c, reason: collision with root package name */
    public Q2.a f21213c;

    /* renamed from: d, reason: collision with root package name */
    public C2215c f21214d;

    public C2216d(Q2.a aVar, InterfaceC2100a.b bVar) {
        this.f21212b = bVar;
        this.f21213c = aVar;
        C2215c c2215c = new C2215c(this);
        this.f21214d = c2215c;
        this.f21213c.f(c2215c);
        this.f21211a = new HashSet();
    }
}
