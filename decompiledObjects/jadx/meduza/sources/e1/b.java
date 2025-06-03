package e1;

import a0.j;
import android.content.Context;
import e1.a;

/* loaded from: classes.dex */
public class b<D> {

    /* renamed from: a, reason: collision with root package name */
    public int f3860a;

    /* renamed from: b, reason: collision with root package name */
    public a<D> f3861b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3862c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3863d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3864e = true;
    public boolean f = false;

    public interface a<D> {
    }

    public b(Context context) {
        context.getApplicationContext();
    }

    public final void a() {
        e1.a aVar = (e1.a) this;
        if (aVar.f3858h != null) {
            boolean z10 = aVar.f3862c;
            if (!z10) {
                if (z10) {
                    aVar.a();
                    aVar.f3858h = new a.RunnableC0067a();
                    aVar.b();
                } else {
                    aVar.f = true;
                }
            }
            if (aVar.f3859i != null) {
                aVar.f3858h.getClass();
            } else {
                aVar.f3858h.getClass();
                e1.a<D>.RunnableC0067a runnableC0067a = aVar.f3858h;
                runnableC0067a.f3868c.set(true);
                if (runnableC0067a.f3866a.cancel(false)) {
                    aVar.f3859i = aVar.f3858h;
                }
            }
            aVar.f3858h = null;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=");
        return j.m(sb2, this.f3860a, "}");
    }
}
