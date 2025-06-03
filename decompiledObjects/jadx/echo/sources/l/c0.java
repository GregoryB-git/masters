package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class c0 extends Resources {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f16439b = false;

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f16440a;

    public c0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f16440a = new WeakReference(context);
    }

    public static boolean a() {
        return f16439b;
    }

    public static boolean b() {
        a();
        return false;
    }

    public final Drawable c(int i7) {
        return super.getDrawable(i7);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i7) {
        Context context = (Context) this.f16440a.get();
        return context != null ? M.h().s(context, this, i7) : super.getDrawable(i7);
    }
}
