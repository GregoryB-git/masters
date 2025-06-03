package v2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class k extends e<t2.c> {

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f15225g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, a3.b bVar) {
        super(context, bVar);
        ec.i.e(bVar, "taskExecutor");
        Object systemService = this.f15217b.getSystemService("connectivity");
        ec.i.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f15225g = (ConnectivityManager) systemService;
    }

    @Override // v2.g
    public final Object a() {
        return j.a(this.f15225g);
    }

    @Override // v2.e
    public final IntentFilter e() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // v2.e
    public final void f(Intent intent) {
        ec.i.e(intent, "intent");
        if (ec.i.a(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            o2.j.d().a(j.f15224a, "Network broadcast received");
            b(j.a(this.f15225g));
        }
    }
}
