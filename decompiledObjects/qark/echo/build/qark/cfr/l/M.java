/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.TypedValue
 *  android.util.Xml
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.WeakHashMap
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import l.B;
import l.V;
import l.c0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t.h;
import t.i;
import u1.g;

public final class M {
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static M i;
    public static final c j;
    public WeakHashMap a;
    public h b;
    public i c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public e g;

    static {
        j = new c(6);
    }

    public static long e(TypedValue typedValue) {
        return (long)typedValue.assetCookie << 32 | (long)typedValue.data;
    }

    public static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] arrn) {
        if (colorStateList != null && mode != null) {
            return M.l(colorStateList.getColorForState(arrn, 0), mode);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static M h() {
        synchronized (M.class) {
            try {
                M m8;
                if (i != null) return i;
                i = m8 = new M();
                M.p(m8);
                return i;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static PorterDuffColorFilter l(int n8, PorterDuff.Mode mode) {
        synchronized (M.class) {
            Throwable throwable2;
            block5 : {
                PorterDuffColorFilter porterDuffColorFilter;
                block4 : {
                    c c8;
                    try {
                        PorterDuffColorFilter porterDuffColorFilter2;
                        c8 = j;
                        porterDuffColorFilter = porterDuffColorFilter2 = c8.k(n8, mode);
                        if (porterDuffColorFilter2 != null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    porterDuffColorFilter = new PorterDuffColorFilter(n8, mode);
                    c8.l(n8, mode, porterDuffColorFilter);
                }
                return porterDuffColorFilter;
            }
            throw throwable2;
        }
    }

    public static void p(M m8) {
        if (Build.VERSION.SDK_INT < 24) {
            m8.a("vector", new f());
            m8.a("animated-vector", new b());
            m8.a("animated-selector", new a());
        }
    }

    public static boolean q(Drawable drawable2) {
        if (!(drawable2 instanceof g) && !"android.graphics.drawable.VectorDrawable".equals((Object)drawable2.getClass().getName())) {
            return false;
        }
        return true;
    }

    public static void v(Drawable drawable2, V v8, int[] arrn) {
        if (B.a(drawable2) && drawable2.mutate() != drawable2) {
            Log.d((String)"ResourceManagerInternal", (String)"Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean bl = v8.d;
        if (!bl && !v8.c) {
            drawable2.clearColorFilter();
        } else {
            ColorStateList colorStateList = bl ? v8.a : null;
            v8 = v8.c ? v8.b : h;
            drawable2.setColorFilter((ColorFilter)M.g(colorStateList, (PorterDuff.Mode)v8, arrn));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable2.invalidateSelf();
        }
    }

    public final void a(String string2, d d8) {
        if (this.b == null) {
            this.b = new h();
        }
        this.b.put(string2, d8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(Context context, long l8, Drawable object) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    Drawable.ConstantState constantState = object.getConstantState();
                    if (constantState == null) break block4;
                    t.f f8 = (t.f)this.d.get((Object)context);
                    object = f8;
                    if (f8 == null) {
                        object = new t.f();
                        this.d.put((Object)context, object);
                    }
                    object.l(l8, (Object)new WeakReference((Object)constantState));
                    return true;
                }
                catch (Throwable throwable2) {}
            }
            return false;
            throw throwable2;
        }
    }

    public final void c(Context context, int n8, ColorStateList colorStateList) {
        i i8;
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        i i9 = i8 = (i)this.a.get((Object)context);
        if (i8 == null) {
            i9 = new i();
            this.a.put((Object)context, (Object)i9);
        }
        i9.a(n8, (Object)colorStateList);
    }

    public final void d(Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        if ((context = this.j(context, i.a.a)) != null && M.q((Drawable)context)) {
            return;
        }
        this.f = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    public final Drawable f(Context context, int n8) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(n8, typedValue, true);
        long l8 = M.e(typedValue);
        Object object = this.i(context, l8);
        if (object != null) {
            return object;
        }
        object = this.g;
        object = object == null ? null : object.d(this, context, n8);
        if (object != null) {
            object.setChangingConfigurations(typedValue.changingConfigurations);
            this.b(context, l8, (Drawable)object);
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Drawable i(Context context, long l8) {
        synchronized (this) {
            Throwable throwable2;
            block7 : {
                t.f f8;
                block6 : {
                    block5 : {
                        try {
                            f8 = (t.f)this.d.get((Object)context);
                            if (f8 != null) break block5;
                        }
                        catch (Throwable throwable2) {}
                        return null;
                    }
                    WeakReference weakReference = (WeakReference)f8.f(l8);
                    if (weakReference == null) return null;
                    if ((weakReference = (Drawable.ConstantState)weakReference.get()) != null) {
                        return weakReference.newDrawable(context.getResources());
                    }
                    break block6;
                    break block7;
                }
                f8.n(l8);
                return null;
            }
            throw throwable2;
        }
    }

    public Drawable j(Context context, int n8) {
        synchronized (this) {
            context = this.k(context, n8, false);
            return context;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Drawable k(Context context, int n8, boolean bl) {
        synchronized (this) {
            try {
                Drawable drawable2;
                this.d(context);
                Drawable drawable3 = drawable2 = this.r(context, n8);
                if (drawable2 == null) {
                    drawable3 = this.f(context, n8);
                }
                drawable2 = drawable3;
                if (drawable3 == null) {
                    drawable2 = x.a.d(context, n8);
                }
                drawable3 = drawable2;
                if (drawable2 != null) {
                    drawable3 = this.u(context, n8, bl, drawable2);
                }
                if (drawable3 != null) {
                    B.b(drawable3);
                }
                return drawable3;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public ColorStateList m(Context context, int n8) {
        synchronized (this) {
            Throwable throwable2;
            block10 : {
                Object object;
                block7 : {
                    Object object2;
                    block9 : {
                        block8 : {
                            try {
                                object = object2 = this.n(context, n8);
                                if (object2 != null) break block7;
                            }
                            catch (Throwable throwable2) {
                                break block10;
                            }
                            object2 = this.g;
                            if (object2 != null) break block8;
                            object2 = null;
                            break block9;
                        }
                        object2 = object2.c(context, n8);
                    }
                    object = object2;
                    if (object2 != null) {
                        this.c(context, n8, (ColorStateList)object2);
                        object = object2;
                    }
                }
                return object;
            }
            throw throwable2;
        }
    }

    public final ColorStateList n(Context object, int n8) {
        ColorStateList colorStateList;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = colorStateList = null;
        if (weakHashMap != null) {
            object = (i)weakHashMap.get(object);
            colorStateList2 = colorStateList;
            if (object != null) {
                colorStateList2 = (ColorStateList)object.g(n8);
            }
        }
        return colorStateList2;
    }

    public PorterDuff.Mode o(int n8) {
        e e8 = this.g;
        if (e8 == null) {
            return null;
        }
        return e8.b(n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Drawable r(Context context, int n8) {
        Object object;
        block13 : {
            Object object2 = this.b;
            if (object2 == null) return null;
            if (object2.isEmpty()) return null;
            object2 = this.c;
            if (object2 != null) {
                if ("appcompat_skip_skip".equals(object2 = (String)object2.g(n8))) return null;
                if (object2 != null && this.b.get(object2) == null) {
                    return null;
                }
            } else {
                this.c = new i();
            }
            if (this.e == null) {
                this.e = new TypedValue();
            }
            TypedValue typedValue = this.e;
            object2 = context.getResources();
            object2.getValue(n8, typedValue, true);
            long l8 = M.e(typedValue);
            Drawable drawable2 = this.i(context, l8);
            if (drawable2 != null) {
                return drawable2;
            }
            CharSequence charSequence = typedValue.string;
            object = drawable2;
            if (charSequence != null) {
                object = drawable2;
                if (charSequence.toString().endsWith(".xml")) {
                    object = drawable2;
                    try {
                        int n9;
                        charSequence = object2.getXml(n8);
                        object = drawable2;
                        AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)charSequence);
                        do {
                            object = drawable2;
                        } while ((n9 = charSequence.next()) != 2 && n9 != 1);
                        if (n9 != 2) {
                            object = drawable2;
                            throw new XmlPullParserException("No start tag found");
                        }
                        object = drawable2;
                        object2 = charSequence.getName();
                        object = drawable2;
                        this.c.a(n8, object2);
                        object = drawable2;
                        d d8 = (d)this.b.get(object2);
                        object2 = drawable2;
                        if (d8 != null) {
                            object = drawable2;
                            object2 = d8.a(context, (XmlPullParser)charSequence, attributeSet, context.getTheme());
                        }
                        object = object2;
                        if (object2 != null) {
                            object = object2;
                            object2.setChangingConfigurations(typedValue.changingConfigurations);
                            object = object2;
                            this.b(context, l8, (Drawable)object2);
                            object = object2;
                        }
                        break block13;
                    }
                    catch (Exception exception) {}
                    Log.e((String)"ResourceManagerInternal", (String)"Exception while inflating drawable", (Throwable)exception);
                }
            }
        }
        if (object != null) return object;
        this.c.a(n8, "appcompat_skip_skip");
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Drawable s(Context context, c0 c02, int n8) {
        synchronized (this) {
            try {
                Drawable drawable2;
                Drawable drawable3 = drawable2 = this.r(context, n8);
                if (drawable2 == null) {
                    drawable3 = c02.c(n8);
                }
                if (drawable3 == null) return null;
                return this.u(context, n8, false, drawable3);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void t(e e8) {
        synchronized (this) {
            this.g = e8;
            return;
        }
    }

    public final Drawable u(Context context, int n8, boolean bl, Drawable drawable2) {
        Object object = this.m(context, n8);
        if (object != null) {
            context = drawable2;
            if (B.a(drawable2)) {
                context = drawable2.mutate();
            }
            context = B.a.o((Drawable)context);
            B.a.m((Drawable)context, (ColorStateList)object);
            drawable2 = this.o(n8);
            object = context;
            if (drawable2 != null) {
                B.a.n((Drawable)context, (PorterDuff.Mode)drawable2);
                return context;
            }
        } else {
            object = this.g;
            if (object != null && object.e(context, n8, drawable2)) {
                return drawable2;
            }
            object = drawable2;
            if (!this.w(context, n8, drawable2)) {
                object = drawable2;
                if (bl) {
                    object = null;
                }
            }
        }
        return object;
    }

    public boolean w(Context context, int n8, Drawable drawable2) {
        e e8 = this.g;
        if (e8 != null && e8.a(context, n8, drawable2)) {
            return true;
        }
        return false;
    }

    public static class a
    implements d {
        @Override
        public Drawable a(Context object, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                object = h.a.l((Context)object, object.getResources(), xmlPullParser, attributeSet, theme);
                return object;
            }
            catch (Exception exception) {
                Log.e((String)"AsldcInflateDelegate", (String)"Exception while inflating <animated-selector>", (Throwable)exception);
                return null;
            }
        }
    }

    public static class b
    implements d {
        @Override
        public Drawable a(Context object, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                object = u1.b.a((Context)object, object.getResources(), xmlPullParser, attributeSet, theme);
                return object;
            }
            catch (Exception exception) {
                Log.e((String)"AvdcInflateDelegate", (String)"Exception while inflating <animated-vector>", (Throwable)exception);
                return null;
            }
        }
    }

    public static class c
    extends t.g {
        public c(int n8) {
            super(n8);
        }

        public static int j(int n8, PorterDuff.Mode mode) {
            return (n8 + 31) * 31 + mode.hashCode();
        }

        public PorterDuffColorFilter k(int n8, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter)this.c(c.j(n8, mode));
        }

        public PorterDuffColorFilter l(int n8, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter)this.d(c.j(n8, mode), (Object)porterDuffColorFilter);
        }
    }

    public static interface d {
        public Drawable a(Context var1, XmlPullParser var2, AttributeSet var3, Resources.Theme var4);
    }

    public static interface e {
        public boolean a(Context var1, int var2, Drawable var3);

        public PorterDuff.Mode b(int var1);

        public ColorStateList c(Context var1, int var2);

        public Drawable d(M var1, Context var2, int var3);

        public boolean e(Context var1, int var2, Drawable var3);
    }

    public static class f
    implements d {
        @Override
        public Drawable a(Context object, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                object = g.c(object.getResources(), xmlPullParser, attributeSet, theme);
                return object;
            }
            catch (Exception exception) {
                Log.e((String)"VdcInflateDelegate", (String)"Exception while inflating <vector>", (Throwable)exception);
                return null;
            }
        }
    }

}

