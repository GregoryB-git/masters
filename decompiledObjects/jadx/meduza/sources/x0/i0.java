package x0;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public final class i0 extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f16691a;

    public i0(Rect rect) {
        this.f16691a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.f16691a;
    }
}
