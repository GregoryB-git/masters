package x7;

import android.os.Bundle;
import b.a0;
import e7.j3;
import o7.x;

/* loaded from: classes.dex */
public final class d implements j3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f17208a;

    public d(a aVar) {
        this.f17208a = aVar;
    }

    @Override // e7.j3
    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (this.f17208a.f17201a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            x<String> xVar = b.f17203a;
            String i10 = va.a.i(str2, a0.f1565d, a0.f1561b);
            if (i10 != null) {
                str2 = i10;
            }
            bundle2.putString("events", str2);
            ((f8.b) this.f17208a.f17202b).a(2, bundle2);
        }
    }
}
