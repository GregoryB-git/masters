package x3;

import Q2.a;
import android.os.Bundle;
import w3.InterfaceC2100a;

/* renamed from: x3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2215c implements a.InterfaceC0082a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2216d f21210a;

    public C2215c(C2216d c2216d) {
        this.f21210a = c2216d;
    }

    @Override // R2.InterfaceC0612u3
    public final void a(String str, String str2, Bundle bundle, long j7) {
        InterfaceC2100a.b bVar;
        if (this.f21210a.f21211a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", AbstractC2213a.b(str2));
            bVar = this.f21210a.f21212b;
            bVar.a(2, bundle2);
        }
    }
}
