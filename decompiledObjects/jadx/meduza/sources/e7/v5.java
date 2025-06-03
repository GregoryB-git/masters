package e7;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class v5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q5 f4716a;

    public v5(q5 q5Var) {
        this.f4716a = q5Var;
    }

    public final void a() {
        this.f4716a.l();
        l1 j10 = this.f4716a.j();
        ((b.z) this.f4716a.zzb()).getClass();
        if (j10.r(System.currentTimeMillis())) {
            this.f4716a.j().f4462v.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f4716a.zzj().f4067w.b("Detected application was in foreground");
                ((b.z) this.f4716a.zzb()).getClass();
                c(System.currentTimeMillis());
            }
        }
    }

    public final void b(long j10, boolean z10) {
        this.f4716a.l();
        this.f4716a.v();
        if (this.f4716a.j().r(j10)) {
            this.f4716a.j().f4462v.a(true);
            this.f4716a.m().x();
        }
        this.f4716a.j().f4466z.b(j10);
        if (this.f4716a.j().f4462v.b()) {
            c(j10);
        }
    }

    public final void c(long j10) {
        this.f4716a.l();
        if (((j2) this.f4716a.f3407b).d()) {
            this.f4716a.j().f4466z.b(j10);
            ((b.z) this.f4716a.zzb()).getClass();
            this.f4716a.zzj().f4067w.c("Session started, time", Long.valueOf(SystemClock.elapsedRealtime()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.f4716a.o().F("auto", "_sid", valueOf, j10);
            this.f4716a.j().A.b(valueOf.longValue());
            this.f4716a.j().f4462v.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            this.f4716a.o().D("auto", "_s", bundle, j10);
            String a10 = this.f4716a.j().F.a();
            if (TextUtils.isEmpty(a10)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", a10);
            this.f4716a.o().D("auto", "_ssr", bundle2, j10);
        }
    }
}
