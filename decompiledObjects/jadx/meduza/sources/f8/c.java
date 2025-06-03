package f8;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
import j8.s;
import j8.w;
import java.util.Collections;
import u7.f;
import x0.g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final s f5482a;

    public c(s sVar) {
        this.f5482a = sVar;
    }

    public static c a() {
        c cVar = (c) f.e().c(c.class);
        if (cVar != null) {
            return cVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void b(Exception exc) {
        s sVar = this.f5482a;
        sVar.f8639p.f9140a.a(new g(sVar, exc, Collections.emptyMap(), 6));
    }

    public final void c(Boolean bool) {
        Boolean a10;
        w wVar = this.f5482a.f8626b;
        synchronized (wVar) {
            if (bool != null) {
                try {
                    wVar.f = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bool != null) {
                a10 = bool;
            } else {
                f fVar = wVar.f8652b;
                fVar.a();
                a10 = wVar.a(fVar.f15084a);
            }
            wVar.f8656g = a10;
            SharedPreferences.Editor edit = wVar.f8651a.edit();
            if (bool != null) {
                edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
            } else {
                edit.remove("firebase_crashlytics_collection_enabled");
            }
            edit.apply();
            synchronized (wVar.f8653c) {
                if (wVar.b()) {
                    if (!wVar.f8655e) {
                        wVar.f8654d.trySetResult(null);
                        wVar.f8655e = true;
                    }
                } else if (wVar.f8655e) {
                    wVar.f8654d = new TaskCompletionSource<>();
                    wVar.f8655e = false;
                }
            }
        }
    }
}
