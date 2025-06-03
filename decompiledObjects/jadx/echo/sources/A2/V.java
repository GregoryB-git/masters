package A2;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public Object f394a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f395b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0317c f396c;

    public V(AbstractC0317c abstractC0317c, Object obj) {
        this.f396c = abstractC0317c;
        this.f394a = obj;
    }

    public abstract void a(Object obj);

    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f394a;
                if (this.f395b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f395b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f394a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.f396c.f430r;
        synchronized (arrayList) {
            arrayList2 = this.f396c.f430r;
            arrayList2.remove(this);
        }
    }
}
