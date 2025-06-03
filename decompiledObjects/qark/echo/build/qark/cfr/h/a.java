/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Outline
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.AnimationDrawable
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.StateSet
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package h;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import h.b;
import h.d;
import l.M;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t.i;
import z.k;

public class a
extends h.d {
    public c C;
    public g D;
    public int E = -1;
    public int F = -1;
    public boolean G;

    public a() {
        this(null, null);
    }

    public a(c c8, Resources resources) {
        super(null);
        this.h(new c(c8, this, resources));
        this.onStateChange(this.getState());
        this.jumpToCurrentState();
    }

    public static a l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Object object = xmlPullParser.getName();
        if (object.equals((Object)"animated-selector")) {
            object = new a();
            object.m(context, resources, xmlPullParser, attributeSet, theme);
            return object;
        }
        context = new StringBuilder();
        context.append(xmlPullParser.getPositionDescription());
        context.append(": invalid animated-selector tag ");
        context.append((String)object);
        throw new XmlPullParserException(context.toString());
    }

    @Override
    public void h(b.c c8) {
        super.h(c8);
        if (c8 instanceof c) {
            this.C = (c)c8;
        }
    }

    public boolean isStateful() {
        return true;
    }

    @Override
    public void jumpToCurrentState() {
        h.b.super.jumpToCurrentState();
        g g8 = this.D;
        if (g8 != null) {
            g8.d();
            this.D = null;
            this.g(this.E);
            this.E = -1;
            this.F = -1;
        }
    }

    public c k() {
        return new c(this.C, this, null);
    }

    public void m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArray = k.k(resources, theme, attributeSet, i.b.a);
        this.setVisible(typedArray.getBoolean(i.b.c, true), true);
        this.s(typedArray);
        this.i(resources);
        typedArray.recycle();
        this.n(context, resources, xmlPullParser, attributeSet, theme);
        this.o();
    }

    @Override
    public Drawable mutate() {
        if (!this.G && super.mutate() == this) {
            this.C.r();
            this.G = true;
        }
        return this;
    }

    public final void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int n8;
        int n9;
        int n10 = xmlPullParser.getDepth() + 1;
        while ((n8 = xmlPullParser.next()) != 1 && ((n9 = xmlPullParser.getDepth()) >= n10 || n8 != 3)) {
            if (n8 != 2 || n9 > n10) continue;
            if (xmlPullParser.getName().equals((Object)"item")) {
                this.p(context, resources, xmlPullParser, attributeSet, theme);
                continue;
            }
            if (!xmlPullParser.getName().equals((Object)"transition")) continue;
            this.q(context, resources, xmlPullParser, attributeSet, theme);
        }
    }

    public final void o() {
        this.onStateChange(this.getState());
    }

    @Override
    public boolean onStateChange(int[] arrn) {
        int n8 = this.C.F(arrn);
        boolean bl = n8 != this.c() && (this.r(n8) || this.g(n8));
        Drawable drawable2 = this.getCurrent();
        boolean bl2 = bl;
        if (drawable2 != null) {
            bl2 = bl | drawable2.setState(arrn);
        }
        return bl2;
    }

    public final int p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Object object = k.k(resources, theme, attributeSet, i.b.h);
        int n8 = object.getResourceId(i.b.i, 0);
        int n9 = object.getResourceId(i.b.j, -1);
        context = n9 > 0 ? M.h().j(context, n9) : null;
        object.recycle();
        int[] arrn = this.j(attributeSet);
        object = context;
        if (context == null) {
            while ((n9 = xmlPullParser.next()) == 4) {
            }
            if (n9 == 2) {
                object = xmlPullParser.getName().equals((Object)"vector") ? u1.g.c(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner((Resources)resources, (XmlPullParser)xmlPullParser, (AttributeSet)attributeSet, (Resources.Theme)theme);
            } else {
                context = new StringBuilder();
                context.append(xmlPullParser.getPositionDescription());
                context.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(context.toString());
            }
        }
        if (object != null) {
            return this.C.B(arrn, (Drawable)object, n8);
        }
        context = new StringBuilder();
        context.append(xmlPullParser.getPositionDescription());
        context.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(context.toString());
    }

    public final int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Object object = k.k(resources, theme, attributeSet, i.b.k);
        int n8 = object.getResourceId(i.b.n, -1);
        int n9 = object.getResourceId(i.b.m, -1);
        int n10 = object.getResourceId(i.b.l, -1);
        Drawable drawable2 = n10 > 0 ? M.h().j(context, n10) : null;
        boolean bl = object.getBoolean(i.b.o, false);
        object.recycle();
        object = drawable2;
        if (drawable2 == null) {
            while ((n10 = xmlPullParser.next()) == 4) {
            }
            if (n10 == 2) {
                object = xmlPullParser.getName().equals((Object)"animated-vector") ? u1.b.a(context, resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner((Resources)resources, (XmlPullParser)xmlPullParser, (AttributeSet)attributeSet, (Resources.Theme)theme);
            } else {
                context = new StringBuilder();
                context.append(xmlPullParser.getPositionDescription());
                context.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(context.toString());
            }
        }
        if (object != null) {
            if (n8 != -1 && n9 != -1) {
                return this.C.C(n8, n9, (Drawable)object, bl);
            }
            context = new StringBuilder();
            context.append(xmlPullParser.getPositionDescription());
            context.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(context.toString());
        }
        context = new StringBuilder();
        context.append(xmlPullParser.getPositionDescription());
        context.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(context.toString());
    }

    public final boolean r(int n8) {
        block9 : {
            int n9;
            Object object;
            block11 : {
                Drawable drawable2;
                block12 : {
                    block10 : {
                        object = this.D;
                        if (object != null) {
                            if (n8 == this.E) {
                                return true;
                            }
                            if (n8 == this.F && object.a()) {
                                object.b();
                                this.E = this.F;
                                this.F = n8;
                                return true;
                            }
                            n9 = this.E;
                            object.d();
                        } else {
                            n9 = this.c();
                        }
                        this.D = null;
                        this.F = -1;
                        this.E = -1;
                        object = this.C;
                        int n10 = object.E(n9);
                        int n11 = object.E(n8);
                        if (n11 == 0) break block9;
                        if (n10 == 0) {
                            return false;
                        }
                        int n12 = object.G(n10, n11);
                        if (n12 < 0) {
                            return false;
                        }
                        boolean bl = object.I(n10, n11);
                        this.g(n12);
                        drawable2 = this.getCurrent();
                        if (!(drawable2 instanceof AnimationDrawable)) break block10;
                        boolean bl2 = object.H(n10, n11);
                        object = new e((AnimationDrawable)drawable2, bl2, bl);
                        break block11;
                    }
                    if (!(drawable2 instanceof u1.b)) break block12;
                    object = new d((u1.b)drawable2);
                    break block11;
                }
                if (!(drawable2 instanceof Animatable)) break block9;
                object = new b((Animatable)drawable2);
            }
            object.c();
            this.D = object;
            this.F = n9;
            this.E = n8;
            return true;
        }
        return false;
    }

    public final void s(TypedArray typedArray) {
        c c8 = this.C;
        c8.d |= typedArray.getChangingConfigurations();
        c8.x(typedArray.getBoolean(i.b.d, c8.i));
        c8.t(typedArray.getBoolean(i.b.e, c8.l));
        c8.u(typedArray.getInt(i.b.f, c8.A));
        c8.v(typedArray.getInt(i.b.g, c8.B));
        this.setDither(typedArray.getBoolean(i.b.b, c8.x));
    }

    @Override
    public boolean setVisible(boolean bl, boolean bl2) {
        boolean bl3 = h.b.super.setVisible(bl, bl2);
        g g8 = this.D;
        if (g8 != null && (bl3 || bl2)) {
            if (bl) {
                g8.c();
                return bl3;
            }
            this.jumpToCurrentState();
        }
        return bl3;
    }

    public static class b
    extends g {
        public final Animatable a;

        public b(Animatable animatable) {
            super(null);
            this.a = animatable;
        }

        @Override
        public void c() {
            this.a.start();
        }

        @Override
        public void d() {
            this.a.stop();
        }
    }

    public static class c
    extends d.a {
        public t.f K;
        public i L;

        /*
         * Enabled aggressive block sorting
         */
        public c(c object, a a8, Resources resources) {
            super((d.a)((Object)object), a8, resources);
            if (object != null) {
                this.K = object.K;
                object = object.L;
            } else {
                this.K = new t.f();
                object = new i();
            }
            this.L = object;
        }

        public static long D(int n8, int n9) {
            long l8 = n8;
            return (long)n9 | l8 << 32;
        }

        public int B(int[] arrn, Drawable drawable2, int n8) {
            int n9 = super.z(arrn, drawable2);
            this.L.n(n9, n8);
            return n9;
        }

        public int C(int n8, int n9, Drawable object, boolean bl) {
            int n10 = b.c.super.a((Drawable)object);
            long l8 = c.D(n8, n9);
            long l9 = bl ? 0x200000000L : 0L;
            object = this.K;
            long l10 = n10;
            object.a(l8, l10 | l9);
            if (bl) {
                l8 = c.D(n9, n8);
                this.K.a(l8, 0x100000000L | l10 | l9);
            }
            return n10;
        }

        public int E(int n8) {
            if (n8 < 0) {
                return 0;
            }
            return (Integer)this.L.j(n8, 0);
        }

        public int F(int[] arrn) {
            int n8 = super.A(arrn);
            if (n8 >= 0) {
                return n8;
            }
            return super.A(StateSet.WILD_CARD);
        }

        public int G(int n8, int n9) {
            long l8 = c.D(n8, n9);
            return (int)((Long)this.K.g(l8, -1L)).longValue();
        }

        public boolean H(int n8, int n9) {
            long l8 = c.D(n8, n9);
            if (((Long)this.K.g(l8, -1L) & 0x100000000L) != 0L) {
                return true;
            }
            return false;
        }

        public boolean I(int n8, int n9) {
            long l8 = c.D(n8, n9);
            if (((Long)this.K.g(l8, -1L) & 0x200000000L) != 0L) {
                return true;
            }
            return false;
        }

        public Drawable newDrawable() {
            return new a(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        @Override
        public void r() {
            this.K = this.K.b();
            this.L = this.L.d();
        }
    }

    public static class d
    extends g {
        public final u1.b a;

        public d(u1.b b8) {
            super(null);
            this.a = b8;
        }

        @Override
        public void c() {
            this.a.start();
        }

        @Override
        public void d() {
            this.a.stop();
        }
    }

    public static class e
    extends g {
        public final ObjectAnimator a;
        public final boolean b;

        public e(AnimationDrawable animationDrawable, boolean bl, boolean bl2) {
            super(null);
            int n8 = animationDrawable.getNumberOfFrames();
            int n9 = 0;
            int n10 = bl ? n8 - 1 : 0;
            if (!bl) {
                n9 = n8 - 1;
            }
            f f8 = new f(animationDrawable, bl);
            animationDrawable = ObjectAnimator.ofInt((Object)animationDrawable, (String)"currentIndex", (int[])new int[]{n10, n9});
            animationDrawable.setAutoCancel(true);
            animationDrawable.setDuration((long)f8.a());
            animationDrawable.setInterpolator((TimeInterpolator)f8);
            this.b = bl2;
            this.a = animationDrawable;
        }

        @Override
        public boolean a() {
            return this.b;
        }

        @Override
        public void b() {
            this.a.reverse();
        }

        @Override
        public void c() {
            this.a.start();
        }

        @Override
        public void d() {
            this.a.cancel();
        }
    }

    public static class f
    implements TimeInterpolator {
        public int[] a;
        public int b;
        public int c;

        public f(AnimationDrawable animationDrawable, boolean bl) {
            this.b(animationDrawable, bl);
        }

        public int a() {
            return this.c;
        }

        public int b(AnimationDrawable animationDrawable, boolean bl) {
            int n8;
            this.b = n8 = animationDrawable.getNumberOfFrames();
            int[] arrn = this.a;
            if (arrn == null || arrn.length < n8) {
                this.a = new int[n8];
            }
            arrn = this.a;
            int n9 = 0;
            for (int i8 = 0; i8 < n8; ++i8) {
                int n10 = bl ? n8 - i8 - 1 : i8;
                arrn[i8] = n10 = animationDrawable.getDuration(n10);
                n9 += n10;
            }
            this.c = n9;
            return n9;
        }

        public float getInterpolation(float f8) {
            int n8;
            int n9;
            int n10 = (int)(f8 * (float)this.c + 0.5f);
            int n11 = this.b;
            int[] arrn = this.a;
            for (n8 = 0; n8 < n11 && n10 >= (n9 = arrn[n8]); n10 -= n9, ++n8) {
            }
            f8 = n8 < n11 ? (float)n10 / (float)this.c : 0.0f;
            return (float)n8 / (float)n11 + f8;
        }
    }

    public static abstract class g {
        public g() {
        }

        public /* synthetic */ g( a8) {
            this();
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

}

