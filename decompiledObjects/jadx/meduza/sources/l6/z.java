package l6;

import com.google.android.gms.internal.base.zau;
import l6.b;

/* loaded from: classes.dex */
public final class z implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f9745a;

    public z(d dVar) {
        this.f9745a = dVar;
    }

    @Override // l6.b.a
    public final void a(boolean z10) {
        zau zauVar = this.f9745a.f9655v;
        zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
