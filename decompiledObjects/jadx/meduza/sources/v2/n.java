package v2;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final g<Boolean> f15227a;

    /* renamed from: b, reason: collision with root package name */
    public final c f15228b;

    /* renamed from: c, reason: collision with root package name */
    public final g<t2.c> f15229c;

    /* renamed from: d, reason: collision with root package name */
    public final g<Boolean> f15230d;

    public n(Context context, a3.b bVar) {
        Context applicationContext = context.getApplicationContext();
        ec.i.d(applicationContext, "context.applicationContext");
        a aVar = new a(applicationContext, bVar);
        Context applicationContext2 = context.getApplicationContext();
        ec.i.d(applicationContext2, "context.applicationContext");
        c cVar = new c(applicationContext2, bVar);
        Context applicationContext3 = context.getApplicationContext();
        ec.i.d(applicationContext3, "context.applicationContext");
        String str = j.f15224a;
        ec.i.e(bVar, "taskExecutor");
        g<t2.c> iVar = Build.VERSION.SDK_INT >= 24 ? new i(applicationContext3, bVar) : new k(applicationContext3, bVar);
        Context applicationContext4 = context.getApplicationContext();
        ec.i.d(applicationContext4, "context.applicationContext");
        l lVar = new l(applicationContext4, bVar);
        ec.i.e(bVar, "taskExecutor");
        this.f15227a = aVar;
        this.f15228b = cVar;
        this.f15229c = iVar;
        this.f15230d = lVar;
    }
}
