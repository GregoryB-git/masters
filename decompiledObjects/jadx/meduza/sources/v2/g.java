package v2;

import android.content.Context;
import java.util.LinkedHashSet;
import sb.q;

/* loaded from: classes.dex */
public abstract class g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final a3.b f15216a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15217b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15218c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet<t2.a<T>> f15219d;

    /* renamed from: e, reason: collision with root package name */
    public T f15220e;

    public g(Context context, a3.b bVar) {
        ec.i.e(bVar, "taskExecutor");
        this.f15216a = bVar;
        Context applicationContext = context.getApplicationContext();
        ec.i.d(applicationContext, "context.applicationContext");
        this.f15217b = applicationContext;
        this.f15218c = new Object();
        this.f15219d = new LinkedHashSet<>();
    }

    public abstract T a();

    public final void b(T t) {
        synchronized (this.f15218c) {
            T t10 = this.f15220e;
            if (t10 == null || !ec.i.a(t10, t)) {
                this.f15220e = t;
                this.f15216a.b().execute(new x0.f(2, q.u(this.f15219d), this));
                rb.h hVar = rb.h.f13851a;
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
