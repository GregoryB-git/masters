package io.flutter.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import u5.r;

/* loaded from: classes.dex */
public class b extends u5.r {

    /* renamed from: u, reason: collision with root package name */
    public a f15064u;

    public b(Context context, int i7, int i8, a aVar) {
        super(context, i7, i8, r.b.overlay);
        this.f15064u = aVar;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f15064u;
        if (aVar == null || !aVar.a(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}
