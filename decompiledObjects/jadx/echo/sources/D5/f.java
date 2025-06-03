package D5;

import E5.k;
import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import t5.AbstractC1995b;
import w5.C2105a;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final E5.k f1278a;

    /* renamed from: b, reason: collision with root package name */
    public final k.c f1279b;

    public class a implements k.c {
        public a() {
        }

        @Override // E5.k.c
        public void onMethodCall(E5.j jVar, k.d dVar) {
            dVar.a(null);
        }
    }

    public f(C2105a c2105a) {
        a aVar = new a();
        this.f1279b = aVar;
        E5.k kVar = new E5.k(c2105a, "flutter/backgesture", E5.q.f1685b);
        this.f1278a = kVar;
        kVar.e(aVar);
    }

    public final Map a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }

    public void b() {
        AbstractC1995b.f("BackGestureChannel", "Sending message to cancel back gesture");
        this.f1278a.c("cancelBackGesture", null);
    }

    public void c() {
        AbstractC1995b.f("BackGestureChannel", "Sending message to commit back gesture");
        this.f1278a.c("commitBackGesture", null);
    }

    public void d(BackEvent backEvent) {
        AbstractC1995b.f("BackGestureChannel", "Sending message to start back gesture");
        this.f1278a.c("startBackGesture", a(backEvent));
    }

    public void e(BackEvent backEvent) {
        AbstractC1995b.f("BackGestureChannel", "Sending message to update back gesture progress");
        this.f1278a.c("updateBackGestureProgress", a(backEvent));
    }
}
