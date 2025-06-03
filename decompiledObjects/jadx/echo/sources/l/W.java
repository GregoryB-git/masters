package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class W extends N {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f16402b;

    public W(Context context, Resources resources) {
        super(resources);
        this.f16402b = new WeakReference(context);
    }

    @Override // l.N, android.content.res.Resources
    public Drawable getDrawable(int i7) {
        Drawable drawable = super.getDrawable(i7);
        Context context = (Context) this.f16402b.get();
        if (drawable != null && context != null) {
            M.h().w(context, i7, drawable);
        }
        return drawable;
    }
}
