package S5;

import A5.a;
import android.util.Log;

/* loaded from: classes.dex */
public final class j implements A5.a, B5.a {

    /* renamed from: a, reason: collision with root package name */
    public i f5921a;

    @Override // B5.a
    public void onAttachedToActivity(B5.c cVar) {
        i iVar = this.f5921a;
        if (iVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            iVar.l(cVar.c());
        }
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        this.f5921a = new i(bVar.a());
        g.g(bVar.b(), this.f5921a);
    }

    @Override // B5.a
    public void onDetachedFromActivity() {
        i iVar = this.f5921a;
        if (iVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            iVar.l(null);
        }
    }

    @Override // B5.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        if (this.f5921a == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            g.g(bVar.b(), null);
            this.f5921a = null;
        }
    }

    @Override // B5.a
    public void onReattachedToActivityForConfigChanges(B5.c cVar) {
        onAttachedToActivity(cVar);
    }
}
