package i6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class w extends x {
    public w(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // i6.x
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new z3.f("Invalid response to one way request", (SecurityException) null));
        }
    }

    @Override // i6.x
    public final boolean b() {
        return true;
    }
}
