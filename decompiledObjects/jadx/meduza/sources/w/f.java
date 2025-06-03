package w;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;
import java.util.WeakHashMap;
import w.f;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f16159a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<d, SparseArray<c>> f16160b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16161c = new Object();

    public static class a {
        public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    public static class b {
        public static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        public static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final ColorStateList f16162a;

        /* renamed from: b, reason: collision with root package name */
        public final Configuration f16163b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16164c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f16162a = colorStateList;
            this.f16163b = configuration;
            this.f16164c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f16165a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources.Theme f16166b;

        public d(Resources resources, Resources.Theme theme) {
            this.f16165a = resources;
            this.f16166b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f16165a.equals(dVar.f16165a) && Objects.equals(this.f16166b, dVar.f16166b);
        }

        public final int hashCode() {
            return Objects.hash(this.f16165a, this.f16166b);
        }
    }

    public static abstract class e {
        public final void a() {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: w.h
                @Override // java.lang.Runnable
                public final void run() {
                    f.e.this.getClass();
                }
            });
        }

        public final void b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new g(0, this, typeface));
        }

        public abstract void c(Typeface typeface);
    }
}
