package g;

import android.view.View;
import e0.d0;
import e0.o0;
import e0.q0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k extends q0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f5618b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar) {
        super(0);
        this.f5618b = gVar;
    }

    @Override // e0.q0, e0.p0
    public final void b() {
        this.f5618b.D.setVisibility(0);
        if (this.f5618b.D.getParent() instanceof View) {
            View view = (View) this.f5618b.D.getParent();
            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
            d0.c.c(view);
        }
    }

    @Override // e0.p0
    public final void c() {
        this.f5618b.D.setAlpha(1.0f);
        this.f5618b.G.d(null);
        this.f5618b.G = null;
    }
}
