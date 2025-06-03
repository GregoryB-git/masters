package b1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import b1.k;

/* loaded from: classes.dex */
public class r extends Service implements o {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f1786a = new m0(this);

    @Override // b1.o
    public final k getLifecycle() {
        return this.f1786a.f1759a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ec.i.e(intent, "intent");
        this.f1786a.a(k.a.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f1786a.a(k.a.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m0 m0Var = this.f1786a;
        m0Var.a(k.a.ON_STOP);
        m0Var.a(k.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        this.f1786a.a(k.a.ON_START);
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
