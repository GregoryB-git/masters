package z2;

import V2.C0660k;
import x2.C2190d;
import y2.C2270a;
import z2.AbstractC2310m;

/* loaded from: classes.dex */
public final class N extends AbstractC2310m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC2310m.a f21675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(AbstractC2310m.a aVar, C2190d[] c2190dArr, boolean z7, int i7) {
        super(c2190dArr, z7, i7);
        this.f21675d = aVar;
    }

    @Override // z2.AbstractC2310m
    public final void b(C2270a.b bVar, C0660k c0660k) {
        InterfaceC2308k interfaceC2308k;
        interfaceC2308k = this.f21675d.f21739a;
        interfaceC2308k.a(bVar, c0660k);
    }
}
