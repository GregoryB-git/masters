package b;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1558a = new a();

    public final BackEvent a(float f, float f10, float f11, int i10) {
        return new BackEvent(f, f10, f11, i10);
    }

    public final float b(BackEvent backEvent) {
        ec.i.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        ec.i.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        ec.i.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        ec.i.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
