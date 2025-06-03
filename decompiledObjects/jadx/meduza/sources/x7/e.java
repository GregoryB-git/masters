package x7;

import android.os.Bundle;
import e7.j3;

/* loaded from: classes.dex */
public final class e implements j3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f17209a;

    public e(c cVar) {
        this.f17209a = cVar;
    }

    @Override // e7.j3
    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (str == null || !(!b.f17203a.contains(str2))) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        ((f8.b) this.f17209a.f17207a).a(3, bundle2);
    }
}
