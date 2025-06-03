/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.cast.framework.CastStateListener
 *  com.google.android.gms.cast.framework.IntroductoryOverlay$OnOverlayDismissedListener
 *  java.lang.Object
 */
import com.google.android.gms.cast.framework.CastStateListener;
import com.google.android.gms.cast.framework.IntroductoryOverlay;
import tvrain.cast.CastActivity;

public final class e0
implements IntroductoryOverlay.OnOverlayDismissedListener,
CastStateListener {
    public final CastActivity a;

    public /* synthetic */ e0(CastActivity castActivity) {
        this.a = castActivity;
    }

    public final void onCastStateChanged(int n2) {
        CastActivity.B(this.a, n2);
    }

    public final void onOverlayDismissed() {
        CastActivity.z(this.a);
    }
}

