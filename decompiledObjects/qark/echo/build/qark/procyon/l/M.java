// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import u1.b;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import i.a;
import android.graphics.drawable.Drawable$ConstantState;
import java.lang.ref.WeakReference;
import t.f;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.Log;
import u1.g;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.graphics.PorterDuffColorFilter;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import t.i;
import t.h;
import java.util.WeakHashMap;
import android.graphics.PorterDuff$Mode;

public final class M
{
    public static final PorterDuff$Mode h;
    public static M i;
    public static final c j;
    public WeakHashMap a;
    public h b;
    public i c;
    public final WeakHashMap d;
    public TypedValue e;
    public boolean f;
    public e g;
    
    static {
        h = PorterDuff$Mode.SRC_IN;
        j = new c(6);
    }
    
    public M() {
        this.d = new WeakHashMap(0);
    }
    
    public static long e(final TypedValue typedValue) {
        return (long)typedValue.assetCookie << 32 | (long)typedValue.data;
    }
    
    public static PorterDuffColorFilter g(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode, final int[] array) {
        if (list != null && porterDuff$Mode != null) {
            return l(list.getColorForState(array, 0), porterDuff$Mode);
        }
        return null;
    }
    
    public static M h() {
        // monitorenter(M.class)
        while (true) {
            try {
                if (M.i == null) {
                    p(M.i = new M());
                }
                // monitorexit(M.class)
                return M.i;
                // monitorexit(M.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static PorterDuffColorFilter l(final int n, final PorterDuff$Mode porterDuff$Mode) {
        // monitorenter(M.class)
        // monitorexit(M.class)
        Label_0053: {
            PorterDuffColorFilter k;
            try {
                final c j = M.j;
                if ((k = j.k(n, porterDuff$Mode)) == null) {
                    k = new PorterDuffColorFilter(n, porterDuff$Mode);
                    j.l(n, porterDuff$Mode, k);
                }
            }
            finally {
                break Label_0053;
            }
            return k;
        }
    }
    // monitorexit(M.class)
    
    public static void p(final M m) {
        if (Build$VERSION.SDK_INT < 24) {
            m.a("vector", (d)new f());
            m.a("animated-vector", (d)new b());
            m.a("animated-selector", (d)new a());
        }
    }
    
    public static boolean q(final Drawable drawable) {
        return drawable instanceof g || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }
    
    public static void v(final Drawable drawable, final V v, final int[] array) {
        if (B.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        final boolean d = v.d;
        if (!d && !v.c) {
            drawable.clearColorFilter();
        }
        else {
            ColorStateList a;
            if (d) {
                a = v.a;
            }
            else {
                a = null;
            }
            PorterDuff$Mode porterDuff$Mode;
            if (v.c) {
                porterDuff$Mode = v.b;
            }
            else {
                porterDuff$Mode = M.h;
            }
            drawable.setColorFilter((ColorFilter)g(a, porterDuff$Mode, array));
        }
        if (Build$VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }
    
    public final void a(final String s, final d d) {
        if (this.b == null) {
            this.b = new h();
        }
        this.b.put(s, d);
    }
    
    public final boolean b(final Context context, final long n, final Drawable drawable) {
        // monitorenter(this)
        while (true) {
            try {
                final Drawable$ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    t.f value;
                    if ((value = this.d.get(context)) == null) {
                        value = new t.f();
                        this.d.put(context, value);
                    }
                    value.l(n, new WeakReference(constantState));
                    // monitorexit(this)
                    return true;
                }
                // monitorexit(this)
                return false;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void c(final Context context, final int n, final ColorStateList list) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        i value;
        if ((value = this.a.get(context)) == null) {
            value = new i();
            this.a.put(context, value);
        }
        value.a(n, list);
    }
    
    public final void d(final Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        final Drawable j = this.j(context, i.a.a);
        if (j != null && q(j)) {
            return;
        }
        this.f = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }
    
    public final Drawable f(final Context context, final int n) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        final TypedValue e = this.e;
        context.getResources().getValue(n, e, true);
        final long e2 = e(e);
        final Drawable i = this.i(context, e2);
        if (i != null) {
            return i;
        }
        final e g = this.g;
        Drawable d;
        if (g == null) {
            d = null;
        }
        else {
            d = g.d(this, context, n);
        }
        if (d != null) {
            d.setChangingConfigurations(e.changingConfigurations);
            this.b(context, e2, d);
        }
        return d;
    }
    
    public final Drawable i(final Context key, final long n) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0083: {
            Label_0079: {
                t.f f;
                try {
                    f = this.d.get(key);
                    if (f == null) {
                        // monitorexit(this)
                        return null;
                    }
                    final WeakReference weakReference = (WeakReference)f.f(n);
                    if (weakReference == null) {
                        break Label_0079;
                    }
                    final Drawable$ConstantState drawable$ConstantState = weakReference.get();
                    if (drawable$ConstantState != null) {
                        // monitorexit(this)
                        return drawable$ConstantState.newDrawable(key.getResources());
                    }
                }
                finally {
                    break Label_0083;
                }
                f.n(n);
            }
            return null;
        }
    }
    // monitorexit(this)
    
    public Drawable j(final Context context, final int n) {
        synchronized (this) {
            return this.k(context, n, false);
        }
    }
    
    public Drawable k(final Context context, final int n, final boolean b) {
        // monitorenter(this)
        while (true) {
            try {
                this.d(context);
                Drawable drawable;
                if ((drawable = this.r(context, n)) == null) {
                    drawable = this.f(context, n);
                }
                Drawable d;
                if ((d = drawable) == null) {
                    d = x.a.d(context, n);
                }
                Drawable u;
                if ((u = d) != null) {
                    u = this.u(context, n, b, d);
                }
                if (u != null) {
                    B.b(u);
                }
                // monitorexit(this)
                return u;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public ColorStateList m(final Context context, final int n) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0068: {
            ColorStateList n2;
            try {
                if ((n2 = this.n(context, n)) == null) {
                    final e g = this.g;
                    ColorStateList c;
                    if (g == null) {
                        c = null;
                    }
                    else {
                        c = g.c(context, n);
                    }
                    n2 = c;
                    if (c != null) {
                        this.c(context, n, c);
                        n2 = c;
                    }
                }
            }
            finally {
                break Label_0068;
            }
            return n2;
        }
    }
    // monitorexit(this)
    
    public final ColorStateList n(final Context key, final int n) {
        final WeakHashMap a = this.a;
        ColorStateList list = null;
        if (a != null) {
            final i i = a.get(key);
            list = list;
            if (i != null) {
                list = (ColorStateList)i.g(n);
            }
        }
        return list;
    }
    
    public PorterDuff$Mode o(final int n) {
        final e g = this.g;
        if (g == null) {
            return null;
        }
        return g.b(n);
    }
    
    public final Drawable r(final Context context, final int n) {
        final h b = this.b;
        while (true) {
            Label_0401: {
                if (b == null || b.isEmpty()) {
                    break Label_0401;
                }
                final i c = this.c;
                if (c != null) {
                    final String anObject = (String)c.g(n);
                    if ("appcompat_skip_skip".equals(anObject) || (anObject != null && this.b.get(anObject) == null)) {
                        return null;
                    }
                }
                else {
                    this.c = new i();
                }
                if (this.e == null) {
                    this.e = new TypedValue();
                }
                final TypedValue e = this.e;
                final Resources resources = context.getResources();
                resources.getValue(n, e, true);
                final long e2 = e(e);
                final Drawable i = this.i(context, e2);
                if (i != null) {
                    return i;
                }
                final CharSequence string = e.string;
                Drawable drawable = i;
                while (true) {
                    if (string == null) {
                        break Label_0382;
                    }
                    drawable = i;
                    if (!string.toString().endsWith(".xml")) {
                        break Label_0382;
                    }
                    drawable = i;
                    try {
                        final XmlResourceParser xml = resources.getXml(n);
                        drawable = i;
                        final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
                        int next;
                        do {
                            drawable = i;
                            next = ((XmlPullParser)xml).next();
                        } while (next != 2 && next != 1);
                        if (next == 2) {
                            drawable = i;
                            final String name = ((XmlPullParser)xml).getName();
                            drawable = i;
                            this.c.a(n, name);
                            drawable = i;
                            final d d = (d)this.b.get(name);
                            Drawable a = i;
                            if (d != null) {
                                drawable = i;
                                a = d.a(context, (XmlPullParser)xml, attributeSet, context.getTheme());
                            }
                            if ((drawable = a) != null) {
                                drawable = a;
                                a.setChangingConfigurations(e.changingConfigurations);
                                drawable = a;
                                this.b(context, e2, a);
                                drawable = a;
                            }
                            if (drawable == null) {
                                this.c.a(n, "appcompat_skip_skip");
                            }
                            return drawable;
                        }
                        drawable = i;
                        throw new XmlPullParserException("No start tag found");
                        final Exception ex;
                        Log.e("ResourceManagerInternal", "Exception while inflating drawable", (Throwable)ex);
                        continue;
                        return null;
                    }
                    catch (Exception ex2) {}
                    break;
                }
            }
            final Exception ex2;
            final Exception ex = ex2;
            continue;
        }
    }
    
    public Drawable s(final Context context, final c0 c0, final int n) {
        // monitorenter(this)
        while (true) {
            try {
                Drawable drawable;
                if ((drawable = this.r(context, n)) == null) {
                    drawable = c0.c(n);
                }
                if (drawable != null) {
                    // monitorexit(this)
                    return this.u(context, n, false, drawable);
                }
                // monitorexit(this)
                return null;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void t(final e g) {
        synchronized (this) {
            this.g = g;
        }
    }
    
    public final Drawable u(final Context context, final int n, final boolean b, final Drawable drawable) {
        final ColorStateList m = this.m(context, n);
        Drawable drawable2;
        if (m != null) {
            Drawable mutate = drawable;
            if (B.a(drawable)) {
                mutate = drawable.mutate();
            }
            final Drawable o = B.a.o(mutate);
            B.a.m(o, m);
            final PorterDuff$Mode o2 = this.o(n);
            drawable2 = o;
            if (o2 != null) {
                B.a.n(o, o2);
                return o;
            }
        }
        else {
            final e g = this.g;
            if (g != null && g.e(context, n, drawable)) {
                return drawable;
            }
            drawable2 = drawable;
            if (!this.w(context, n, drawable)) {
                drawable2 = drawable;
                if (b) {
                    drawable2 = null;
                }
            }
        }
        return drawable2;
    }
    
    public boolean w(final Context context, final int n, final Drawable drawable) {
        final e g = this.g;
        return g != null && g.a(context, n, drawable);
    }
    
    public static class a implements d
    {
        @Override
        public Drawable a(final Context context, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
            try {
                return h.a.l(context, context.getResources(), xmlPullParser, set, resources$Theme);
            }
            catch (Exception ex) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", (Throwable)ex);
                return null;
            }
        }
    }
    
    public static class b implements d
    {
        @Override
        public Drawable a(final Context context, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
            try {
                return u1.b.a(context, context.getResources(), xmlPullParser, set, resources$Theme);
            }
            catch (Exception ex) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", (Throwable)ex);
                return null;
            }
        }
    }
    
    public static class c extends g
    {
        public c(final int n) {
            super(n);
        }
        
        public static int j(final int n, final PorterDuff$Mode porterDuff$Mode) {
            return (n + 31) * 31 + porterDuff$Mode.hashCode();
        }
        
        public PorterDuffColorFilter k(final int n, final PorterDuff$Mode porterDuff$Mode) {
            return (PorterDuffColorFilter)this.c(j(n, porterDuff$Mode));
        }
        
        public PorterDuffColorFilter l(final int n, final PorterDuff$Mode porterDuff$Mode, final PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter)this.d(j(n, porterDuff$Mode), porterDuffColorFilter);
        }
    }
    
    public interface d
    {
        Drawable a(final Context p0, final XmlPullParser p1, final AttributeSet p2, final Resources$Theme p3);
    }
    
    public interface e
    {
        boolean a(final Context p0, final int p1, final Drawable p2);
        
        PorterDuff$Mode b(final int p0);
        
        ColorStateList c(final Context p0, final int p1);
        
        Drawable d(final M p0, final Context p1, final int p2);
        
        boolean e(final Context p0, final int p1, final Drawable p2);
    }
    
    public static class f implements d
    {
        @Override
        public Drawable a(final Context context, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
            try {
                return u1.g.c(context.getResources(), xmlPullParser, set, resources$Theme);
            }
            catch (Exception ex) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", (Throwable)ex);
                return null;
            }
        }
    }
}
