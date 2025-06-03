package ea;

import android.content.Context;
import android.content.Intent;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import ea.h0;

/* loaded from: classes.dex */
public final class k0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final u7.f f4947a;

    public k0(u7.f fVar) {
        this.f4947a = fVar;
    }

    @Override // ea.j0
    public final void a(Messenger messenger, h0.b bVar) {
        boolean z10;
        ec.i.e(bVar, "serviceConnection");
        u7.f fVar = this.f4947a;
        fVar.a();
        Context applicationContext = fVar.f15084a.getApplicationContext();
        ec.i.d(applicationContext, "firebaseApp.applicationContext.applicationContext");
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        intent.setPackage(applicationContext.getPackageName());
        try {
            z10 = applicationContext.bindService(intent, bVar, 65);
        } catch (SecurityException e10) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e10);
            z10 = false;
        }
        if (z10) {
            return;
        }
        try {
            applicationContext.unbindService(bVar);
            rb.h hVar = rb.h.f13851a;
        } catch (IllegalArgumentException e11) {
            Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e11);
        }
        Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
    }
}
