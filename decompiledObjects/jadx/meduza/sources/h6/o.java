package h6;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static o f7166d;

    /* renamed from: a, reason: collision with root package name */
    public final b f7167a;

    /* renamed from: b, reason: collision with root package name */
    public GoogleSignInAccount f7168b;

    /* renamed from: c, reason: collision with root package name */
    public GoogleSignInOptions f7169c;

    public o(Context context) {
        b a10 = b.a(context);
        this.f7167a = a10;
        this.f7168b = a10.b();
        this.f7169c = a10.c();
    }

    public static synchronized o a(Context context) {
        o oVar;
        synchronized (o.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (o.class) {
                oVar = f7166d;
                if (oVar == null) {
                    oVar = new o(applicationContext);
                    f7166d = oVar;
                }
            }
            return oVar;
        }
        return oVar;
    }

    public final synchronized void b() {
        b bVar = this.f7167a;
        bVar.f7152a.lock();
        try {
            bVar.f7153b.edit().clear().apply();
            bVar.f7152a.unlock();
            this.f7168b = null;
            this.f7169c = null;
        } catch (Throwable th) {
            bVar.f7152a.unlock();
            throw th;
        }
    }
}
