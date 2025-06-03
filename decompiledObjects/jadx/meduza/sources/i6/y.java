package i6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class y extends x {
    public y(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // i6.x
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // i6.x
    public final boolean b() {
        return false;
    }
}
