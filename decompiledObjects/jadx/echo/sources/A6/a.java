package A6;

import A5.a;
import E5.j;
import E5.k;
import android.os.Build;

/* loaded from: classes.dex */
public class a implements A5.a, k.c {

    /* renamed from: a, reason: collision with root package name */
    public k f573a;

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        k kVar = new k(bVar.b(), "flutter_native_splash");
        this.f573a = kVar;
        kVar.e(this);
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f573a.e(null);
    }

    @Override // E5.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        if (!jVar.f1670a.equals("getPlatformVersion")) {
            dVar.c();
            return;
        }
        dVar.a("Android " + Build.VERSION.RELEASE);
    }
}
