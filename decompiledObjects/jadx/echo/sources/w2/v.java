package w2;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class v extends AbstractC2098t {
    public v(int i7, int i8, Bundle bundle) {
        super(i7, 1, bundle);
    }

    @Override // w2.AbstractC2098t
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // w2.AbstractC2098t
    public final boolean b() {
        return false;
    }
}
