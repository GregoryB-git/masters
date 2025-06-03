package x0;

import android.view.View;

/* loaded from: classes.dex */
public final class s0 {
    public static int a(View view) {
        if ((view.getAlpha() == 0.0f) && view.getVisibility() == 0) {
            return 4;
        }
        int visibility = view.getVisibility();
        if (visibility == 0) {
            return 2;
        }
        if (visibility == 4) {
            return 4;
        }
        if (visibility == 8) {
            return 3;
        }
        throw new IllegalArgumentException(defpackage.f.h("Unknown visibility ", visibility));
    }
}
