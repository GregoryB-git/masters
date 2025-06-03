package w2;

import android.os.Bundle;

/* renamed from: w2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2097s extends AbstractC2098t {
    public C2097s(int i7, int i8, Bundle bundle) {
        super(i7, 2, bundle);
    }

    @Override // w2.AbstractC2098t
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new C2099u(4, "Invalid response to one way request", null));
        }
    }

    @Override // w2.AbstractC2098t
    public final boolean b() {
        return true;
    }
}
