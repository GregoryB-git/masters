package z2;

import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0654e;
import java.util.Map;

/* renamed from: z2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2311n implements InterfaceC0654e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0660k f21743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2312o f21744b;

    public C2311n(C2312o c2312o, C0660k c0660k) {
        this.f21744b = c2312o;
        this.f21743a = c0660k;
    }

    @Override // V2.InterfaceC0654e
    public final void a(AbstractC0659j abstractC0659j) {
        Map map;
        map = this.f21744b.f21746b;
        map.remove(this.f21743a);
    }
}
