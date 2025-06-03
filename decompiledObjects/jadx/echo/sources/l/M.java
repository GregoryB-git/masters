package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import h.C1322a;
import i.AbstractC1339a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u1.C2003b;
import x.AbstractC2112a;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: i, reason: collision with root package name */
    public static M f16347i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f16349a;

    /* renamed from: b, reason: collision with root package name */
    public t.h f16350b;

    /* renamed from: c, reason: collision with root package name */
    public t.i f16351c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f16352d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f16353e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16354f;

    /* renamed from: g, reason: collision with root package name */
    public e f16355g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f16346h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final c f16348j = new c(6);

    public static class a implements d {
        @Override // l.M.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1322a.l(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e7) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e7);
                return null;
            }
        }
    }

    public static class b implements d {
        @Override // l.M.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C2003b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e7) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e7);
                return null;
            }
        }
    }

    public static class c extends t.g {
        public c(int i7) {
            super(i7);
        }

        public static int j(int i7, PorterDuff.Mode mode) {
            return ((i7 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter k(int i7, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(j(i7, mode)));
        }

        public PorterDuffColorFilter l(int i7, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(j(i7, mode)), porterDuffColorFilter);
        }
    }

    public interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface e {
        boolean a(Context context, int i7, Drawable drawable);

        PorterDuff.Mode b(int i7);

        ColorStateList c(Context context, int i7);

        Drawable d(M m7, Context context, int i7);

        boolean e(Context context, int i7, Drawable drawable);
    }

    public static class f implements d {
        @Override // l.M.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return u1.g.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e7) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e7);
                return null;
            }
        }
    }

    public static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    public static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized M h() {
        M m7;
        synchronized (M.class) {
            try {
                if (f16347i == null) {
                    M m8 = new M();
                    f16347i = m8;
                    p(m8);
                }
                m7 = f16347i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return m7;
    }

    public static synchronized PorterDuffColorFilter l(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter k7;
        synchronized (M.class) {
            c cVar = f16348j;
            k7 = cVar.k(i7, mode);
            if (k7 == null) {
                k7 = new PorterDuffColorFilter(i7, mode);
                cVar.l(i7, mode, k7);
            }
        }
        return k7;
    }

    public static void p(M m7) {
        if (Build.VERSION.SDK_INT < 24) {
            m7.a("vector", new f());
            m7.a("animated-vector", new b());
            m7.a("animated-selector", new a());
        }
    }

    public static boolean q(Drawable drawable) {
        return (drawable instanceof u1.g) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void v(Drawable drawable, V v7, int[] iArr) {
        if (AbstractC1494B.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z7 = v7.f16401d;
        if (z7 || v7.f16400c) {
            drawable.setColorFilter(g(z7 ? v7.f16398a : null, v7.f16400c ? v7.f16399b : f16346h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final void a(String str, d dVar) {
        if (this.f16350b == null) {
            this.f16350b = new t.h();
        }
        this.f16350b.put(str, dVar);
    }

    public final synchronized boolean b(Context context, long j7, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            t.f fVar = (t.f) this.f16352d.get(context);
            if (fVar == null) {
                fVar = new t.f();
                this.f16352d.put(context, fVar);
            }
            fVar.l(j7, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Context context, int i7, ColorStateList colorStateList) {
        if (this.f16349a == null) {
            this.f16349a = new WeakHashMap();
        }
        t.i iVar = (t.i) this.f16349a.get(context);
        if (iVar == null) {
            iVar = new t.i();
            this.f16349a.put(context, iVar);
        }
        iVar.a(i7, colorStateList);
    }

    public final void d(Context context) {
        if (this.f16354f) {
            return;
        }
        this.f16354f = true;
        Drawable j7 = j(context, AbstractC1339a.f14603a);
        if (j7 == null || !q(j7)) {
            this.f16354f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable f(Context context, int i7) {
        if (this.f16353e == null) {
            this.f16353e = new TypedValue();
        }
        TypedValue typedValue = this.f16353e;
        context.getResources().getValue(i7, typedValue, true);
        long e7 = e(typedValue);
        Drawable i8 = i(context, e7);
        if (i8 != null) {
            return i8;
        }
        e eVar = this.f16355g;
        Drawable d7 = eVar == null ? null : eVar.d(this, context, i7);
        if (d7 != null) {
            d7.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e7, d7);
        }
        return d7;
    }

    public final synchronized Drawable i(Context context, long j7) {
        t.f fVar = (t.f) this.f16352d.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) fVar.f(j7);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            fVar.n(j7);
        }
        return null;
    }

    public synchronized Drawable j(Context context, int i7) {
        return k(context, i7, false);
    }

    public synchronized Drawable k(Context context, int i7, boolean z7) {
        Drawable r7;
        try {
            d(context);
            r7 = r(context, i7);
            if (r7 == null) {
                r7 = f(context, i7);
            }
            if (r7 == null) {
                r7 = AbstractC2112a.d(context, i7);
            }
            if (r7 != null) {
                r7 = u(context, i7, z7, r7);
            }
            if (r7 != null) {
                AbstractC1494B.b(r7);
            }
        } catch (Throwable th) {
            throw th;
        }
        return r7;
    }

    public synchronized ColorStateList m(Context context, int i7) {
        ColorStateList n7;
        n7 = n(context, i7);
        if (n7 == null) {
            e eVar = this.f16355g;
            n7 = eVar == null ? null : eVar.c(context, i7);
            if (n7 != null) {
                c(context, i7, n7);
            }
        }
        return n7;
    }

    public final ColorStateList n(Context context, int i7) {
        t.i iVar;
        WeakHashMap weakHashMap = this.f16349a;
        if (weakHashMap == null || (iVar = (t.i) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) iVar.g(i7);
    }

    public PorterDuff.Mode o(int i7) {
        e eVar = this.f16355g;
        if (eVar == null) {
            return null;
        }
        return eVar.b(i7);
    }

    public final Drawable r(Context context, int i7) {
        int next;
        t.h hVar = this.f16350b;
        if (hVar == null || hVar.isEmpty()) {
            return null;
        }
        t.i iVar = this.f16351c;
        if (iVar != null) {
            String str = (String) iVar.g(i7);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f16350b.get(str) == null)) {
                return null;
            }
        } else {
            this.f16351c = new t.i();
        }
        if (this.f16353e == null) {
            this.f16353e = new TypedValue();
        }
        TypedValue typedValue = this.f16353e;
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        long e7 = e(typedValue);
        Drawable i8 = i(context, e7);
        if (i8 != null) {
            return i8;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i7);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f16351c.a(i7, name);
                d dVar = (d) this.f16350b.get(name);
                if (dVar != null) {
                    i8 = dVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i8 != null) {
                    i8.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e7, i8);
                }
            } catch (Exception e8) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e8);
            }
        }
        if (i8 == null) {
            this.f16351c.a(i7, "appcompat_skip_skip");
        }
        return i8;
    }

    public synchronized Drawable s(Context context, c0 c0Var, int i7) {
        try {
            Drawable r7 = r(context, i7);
            if (r7 == null) {
                r7 = c0Var.c(i7);
            }
            if (r7 == null) {
                return null;
            }
            return u(context, i7, false, r7);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(e eVar) {
        this.f16355g = eVar;
    }

    public final Drawable u(Context context, int i7, boolean z7, Drawable drawable) {
        ColorStateList m7 = m(context, i7);
        if (m7 == null) {
            e eVar = this.f16355g;
            if ((eVar == null || !eVar.e(context, i7, drawable)) && !w(context, i7, drawable) && z7) {
                return null;
            }
            return drawable;
        }
        if (AbstractC1494B.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable o7 = B.a.o(drawable);
        B.a.m(o7, m7);
        PorterDuff.Mode o8 = o(i7);
        if (o8 == null) {
            return o7;
        }
        B.a.n(o7, o8);
        return o7;
    }

    public boolean w(Context context, int i7, Drawable drawable) {
        e eVar = this.f16355g;
        return eVar != null && eVar.a(context, i7, drawable);
    }
}
