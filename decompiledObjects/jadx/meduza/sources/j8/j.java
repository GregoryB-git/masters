package j8;

import android.util.Log;
import fa.b;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j implements fa.b {

    /* renamed from: a, reason: collision with root package name */
    public final w f8588a;

    /* renamed from: b, reason: collision with root package name */
    public final i f8589b;

    public j(w wVar, p8.e eVar) {
        this.f8588a = wVar;
        this.f8589b = new i(eVar);
    }

    @Override // fa.b
    public final void a(b.C0085b c0085b) {
        String str = "App Quality Sessions session changed: " + c0085b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        i iVar = this.f8589b;
        String str2 = c0085b.f5526a;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f8587c, str2)) {
                i.a(iVar.f8585a, iVar.f8586b, str2);
                iVar.f8587c = str2;
            }
        }
    }

    @Override // fa.b
    public final boolean b() {
        return this.f8588a.b();
    }

    @Override // fa.b
    public final void c() {
    }
}
