package z2;

import A2.AbstractC0328n;
import android.app.Activity;

/* renamed from: z2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2303f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21735a;

    public C2303f(Activity activity) {
        AbstractC0328n.j(activity, "Activity must not be null");
        this.f21735a = activity;
    }

    public final Activity a() {
        return (Activity) this.f21735a;
    }

    public final androidx.fragment.app.e b() {
        return (androidx.fragment.app.e) this.f21735a;
    }

    public final boolean c() {
        return this.f21735a instanceof Activity;
    }

    public final boolean d() {
        return this.f21735a instanceof androidx.fragment.app.e;
    }
}
