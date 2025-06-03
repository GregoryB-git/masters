package G2;

import android.content.Context;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static d f2080b = new d();

    /* renamed from: a, reason: collision with root package name */
    public c f2081a = null;

    public static c a(Context context) {
        return f2080b.b(context);
    }

    public final synchronized c b(Context context) {
        try {
            if (this.f2081a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f2081a = new c(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2081a;
    }
}
