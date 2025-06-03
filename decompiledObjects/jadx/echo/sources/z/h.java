package z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.util.WeakHashMap;
import z.h;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f21579a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f21580b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f21581c = new Object();

    public static class a {
        public static Drawable a(Resources resources, int i7, Resources.Theme theme) {
            return resources.getDrawable(i7, theme);
        }

        public static Drawable b(Resources resources, int i7, int i8, Resources.Theme theme) {
            return resources.getDrawableForDensity(i7, i8, theme);
        }
    }

    public static abstract class b {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i7, Handler handler) {
            e(handler).post(new Runnable() { // from class: z.j
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.f(i7);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: z.i
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.g(typeface);
                }
            });
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i7);

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(Typeface typeface);
    }

    public static Drawable a(Resources resources, int i7, Resources.Theme theme) {
        return a.a(resources, i7, theme);
    }

    public static Typeface b(Context context, int i7, TypedValue typedValue, int i8, b bVar) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i7, typedValue, i8, bVar, null, true, false);
    }

    public static Typeface c(Context context, int i7, TypedValue typedValue, int i8, b bVar, Handler handler, boolean z7, boolean z8) {
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        Typeface d7 = d(context, resources, typedValue, i7, i8, bVar, handler, z7, z8);
        if (d7 != null || bVar != null || z8) {
            return d7;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i7) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface d(android.content.Context r16, android.content.res.Resources r17, android.util.TypedValue r18, int r19, int r20, z.h.b r21, android.os.Handler r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.h.d(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, z.h$b, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
