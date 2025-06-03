package g8;

import android.util.Log;
import io.flutter.plugins.firebase.auth.g;
import java.util.concurrent.atomic.AtomicReference;
import m8.g0;

/* loaded from: classes.dex */
public final class b implements g8.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f5906c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final t9.a<g8.a> f5907a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<g8.a> f5908b = new AtomicReference<>(null);

    public static final class a implements d {
    }

    public b(t9.a<g8.a> aVar) {
        this.f5907a = aVar;
        aVar.a(new g(this, 13));
    }

    @Override // g8.a
    public final d a(String str) {
        g8.a aVar = this.f5908b.get();
        return aVar == null ? f5906c : aVar.a(str);
    }

    @Override // g8.a
    public final boolean b() {
        g8.a aVar = this.f5908b.get();
        return aVar != null && aVar.b();
    }

    @Override // g8.a
    public final void c(String str, String str2, long j10, g0 g0Var) {
        String d10 = defpackage.g.d("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", d10, null);
        }
        this.f5907a.a(new e8.b(str, str2, j10, g0Var));
    }

    @Override // g8.a
    public final boolean d(String str) {
        g8.a aVar = this.f5908b.get();
        return aVar != null && aVar.d(str);
    }
}
