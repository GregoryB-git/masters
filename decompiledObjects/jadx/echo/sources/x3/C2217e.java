package x3;

import Q2.a;
import android.os.Bundle;
import w3.InterfaceC2100a;

/* renamed from: x3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2217e implements a.InterfaceC0082a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2218f f21215a;

    public C2217e(C2218f c2218f) {
        this.f21215a = c2218f;
    }

    @Override // R2.InterfaceC0612u3
    public final void a(String str, String str2, Bundle bundle, long j7) {
        InterfaceC2100a.b bVar;
        if (str == null || !AbstractC2213a.i(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j7);
        bundle2.putBundle("params", bundle);
        bVar = this.f21215a.f21216a;
        bVar.a(3, bundle2);
    }
}
