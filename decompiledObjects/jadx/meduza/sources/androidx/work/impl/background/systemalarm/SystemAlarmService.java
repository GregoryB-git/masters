package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import b1.r;
import java.util.LinkedHashMap;
import java.util.Map;
import o2.j;
import rb.h;
import y2.v;
import y2.w;

/* loaded from: classes.dex */
public class SystemAlarmService extends r implements d.c {

    /* renamed from: d, reason: collision with root package name */
    public static final String f1478d = j.f("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public d f1479b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1480c;

    public final void a() {
        this.f1480c = true;
        j.d().a(f1478d, "All commands completed in dispatcher");
        String str = v.f17406a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (w.f17407a) {
            linkedHashMap.putAll(w.f17408b);
            h hVar = h.f13851a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            boolean z10 = false;
            if (wakeLock != null && wakeLock.isHeld()) {
                z10 = true;
            }
            if (z10) {
                j.d().g(v.f17406a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // b1.r, android.app.Service
    public final void onCreate() {
        super.onCreate();
        d dVar = new d(this);
        this.f1479b = dVar;
        if (dVar.f1511q != null) {
            j.d().b(d.t, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            dVar.f1511q = this;
        }
        this.f1480c = false;
    }

    @Override // b1.r, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1480c = true;
        d dVar = this.f1479b;
        dVar.getClass();
        j.d().a(d.t, "Destroying SystemAlarmDispatcher");
        p2.r rVar = dVar.f1507d;
        synchronized (rVar.f12953k) {
            rVar.f12952j.remove(dVar);
        }
        dVar.f1511q = null;
    }

    @Override // b1.r, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f1480c) {
            j.d().e(f1478d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            d dVar = this.f1479b;
            dVar.getClass();
            j d10 = j.d();
            String str = d.t;
            d10.a(str, "Destroying SystemAlarmDispatcher");
            p2.r rVar = dVar.f1507d;
            synchronized (rVar.f12953k) {
                rVar.f12952j.remove(dVar);
            }
            dVar.f1511q = null;
            d dVar2 = new d(this);
            this.f1479b = dVar2;
            if (dVar2.f1511q != null) {
                j.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                dVar2.f1511q = this;
            }
            this.f1480c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1479b.b(i11, intent);
        return 3;
    }
}
