package A2;

import android.os.Bundle;
import x2.C2188b;

/* loaded from: classes.dex */
public final class Z extends K {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0317c f403g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(AbstractC0317c abstractC0317c, int i7, Bundle bundle) {
        super(abstractC0317c, i7, null);
        this.f403g = abstractC0317c;
    }

    @Override // A2.K
    public final void f(C2188b c2188b) {
        if (this.f403g.t() && AbstractC0317c.h0(this.f403g)) {
            AbstractC0317c.d0(this.f403g, 16);
        } else {
            this.f403g.f428p.b(c2188b);
            this.f403g.L(c2188b);
        }
    }

    @Override // A2.K
    public final boolean g() {
        this.f403g.f428p.b(C2188b.f21167s);
        return true;
    }
}
