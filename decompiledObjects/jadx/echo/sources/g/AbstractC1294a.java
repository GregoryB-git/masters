package g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;
import l.M;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1294a {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f14241a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f14242b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f14243c = new Object();

    public static ColorStateList a(Context context, int i7) {
        return context.getColorStateList(i7);
    }

    public static Drawable b(Context context, int i7) {
        return M.h().j(context, i7);
    }
}
