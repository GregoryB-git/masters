// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h;

import android.animation.ValueAnimator;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.util.StateSet;
import t.i;
import t.f;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import u1.g;
import l.M;
import android.content.res.TypedArray;
import z.k;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import org.xmlpull.v1.XmlPullParserException;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import android.content.res.Resources;

public class a extends h.d
{
    public c C;
    public g D;
    public int E;
    public int F;
    public boolean G;
    
    public a() {
        this(null, null);
    }
    
    public a(final c c, final Resources resources) {
        super(null);
        this.E = -1;
        this.F = -1;
        this.h(new c(c, this, resources));
        this.onStateChange(this.getState());
        this.jumpToCurrentState();
    }
    
    public static a l(final Context context, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            final a a = new a();
            a.m(context, resources, xmlPullParser, set, resources$Theme);
            return a;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }
    
    @Override
    public void h(final h.b.c c) {
        super.h(c);
        if (c instanceof c) {
            this.C = (c)c;
        }
    }
    
    public boolean isStateful() {
        return true;
    }
    
    @Override
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        final g d = this.D;
        if (d != null) {
            d.d();
            this.D = null;
            this.g(this.E);
            this.E = -1;
            this.F = -1;
        }
    }
    
    public c k() {
        return new c(this.C, this, null);
    }
    
    public void m(final Context context, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final TypedArray k = z.k.k(resources, resources$Theme, set, i.b.a);
        this.setVisible(k.getBoolean(i.b.c, true), true);
        this.s(k);
        this.i(resources);
        k.recycle();
        this.n(context, resources, xmlPullParser, set, resources$Theme);
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
    
    public final void n(final Context context, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final int n = xmlPullParser.getDepth() + 1;
        while (true) {
            final int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            final int depth = xmlPullParser.getDepth();
            if (depth < n && next == 3) {
                break;
            }
            if (next != 2) {
                continue;
            }
            if (depth > n) {
                continue;
            }
            if (xmlPullParser.getName().equals("item")) {
                this.p(context, resources, xmlPullParser, set, resources$Theme);
            }
            else {
                if (!xmlPullParser.getName().equals("transition")) {
                    continue;
                }
                this.q(context, resources, xmlPullParser, set, resources$Theme);
            }
        }
    }
    
    public final void o() {
        this.onStateChange(this.getState());
    }
    
    @Override
    public boolean onStateChange(final int[] state) {
        final int f = this.C.F(state);
        final boolean b = f != this.c() && (this.r(f) || this.g(f));
        final Drawable current = this.getCurrent();
        boolean b2 = b;
        if (current != null) {
            b2 = (b | current.setState(state));
        }
        return b2;
    }
    
    public final int p(final Context context, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final TypedArray k = z.k.k(resources, resources$Theme, set, i.b.h);
        final int resourceId = k.getResourceId(i.b.i, 0);
        final int resourceId2 = k.getResourceId(i.b.j, -1);
        Drawable j;
        if (resourceId2 > 0) {
            j = M.h().j(context, resourceId2);
        }
        else {
            j = null;
        }
        k.recycle();
        final int[] i = this.j(set);
        Drawable drawable = j;
        if (j == null) {
            int next;
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            }
            if (xmlPullParser.getName().equals("vector")) {
                drawable = u1.g.c(resources, xmlPullParser, set, resources$Theme);
            }
            else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, set, resources$Theme);
            }
        }
        if (drawable != null) {
            return this.C.B(i, drawable, resourceId);
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(sb2.toString());
    }
    
    public final int q(final Context context, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final TypedArray k = z.k.k(resources, resources$Theme, set, i.b.k);
        final int resourceId = k.getResourceId(i.b.n, -1);
        final int resourceId2 = k.getResourceId(i.b.m, -1);
        final int resourceId3 = k.getResourceId(i.b.l, -1);
        Drawable j;
        if (resourceId3 > 0) {
            j = M.h().j(context, resourceId3);
        }
        else {
            j = null;
        }
        final boolean boolean1 = k.getBoolean(i.b.o, false);
        k.recycle();
        Drawable drawable = j;
        if (j == null) {
            int next;
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            }
            if (xmlPullParser.getName().equals("animated-vector")) {
                drawable = u1.b.a(context, resources, xmlPullParser, set, resources$Theme);
            }
            else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, set, resources$Theme);
            }
        }
        if (drawable == null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new XmlPullParserException(sb2.toString());
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.C.C(resourceId, resourceId2, drawable, boolean1);
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(xmlPullParser.getPositionDescription());
        sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
        throw new XmlPullParserException(sb3.toString());
    }
    
    public final boolean r(final int n) {
        final g d = this.D;
        int f;
        if (d != null) {
            if (n == this.E) {
                return true;
            }
            if (n == this.F && d.a()) {
                d.b();
                this.E = this.F;
                this.F = n;
                return true;
            }
            f = this.E;
            d.d();
        }
        else {
            f = this.c();
        }
        this.D = null;
        this.F = -1;
        this.E = -1;
        final c c = this.C;
        final int e = c.E(f);
        final int e2 = c.E(n);
        if (e2 != 0) {
            if (e == 0) {
                return false;
            }
            final int g = c.G(e, e2);
            if (g < 0) {
                return false;
            }
            final boolean i = c.I(e, e2);
            this.g(g);
            final Drawable current = this.getCurrent();
            g d2;
            if (current instanceof AnimationDrawable) {
                d2 = new e((AnimationDrawable)current, c.H(e, e2), i);
            }
            else if (current instanceof u1.b) {
                d2 = new d((u1.b)current);
            }
            else {
                if (!(current instanceof Animatable)) {
                    return false;
                }
                d2 = new b((Animatable)current);
            }
            d2.c();
            this.D = d2;
            this.F = f;
            this.E = n;
            return true;
        }
        return false;
    }
    
    public final void s(final TypedArray typedArray) {
        final c c = this.C;
        c.d |= typedArray.getChangingConfigurations();
        ((h.b.c)c).x(typedArray.getBoolean(i.b.d, c.i));
        ((h.b.c)c).t(typedArray.getBoolean(i.b.e, c.l));
        ((h.b.c)c).u(typedArray.getInt(i.b.f, c.A));
        ((h.b.c)c).v(typedArray.getInt(i.b.g, c.B));
        this.setDither(typedArray.getBoolean(i.b.b, c.x));
    }
    
    @Override
    public boolean setVisible(final boolean b, final boolean b2) {
        final boolean setVisible = super.setVisible(b, b2);
        final g d = this.D;
        if (d != null && (setVisible || b2)) {
            if (b) {
                d.c();
                return setVisible;
            }
            this.jumpToCurrentState();
        }
        return setVisible;
    }
    
    public static class b extends g
    {
        public final Animatable a;
        
        public b(final Animatable a) {
            super(null);
            this.a = a;
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
    
    public static class c extends a
    {
        public t.f K;
        public i L;
        
        public c(final c c, final a a, final Resources resources) {
            super((a)c, a, resources);
            i l;
            if (c != null) {
                this.K = c.K;
                l = c.L;
            }
            else {
                this.K = new t.f();
                l = new i();
            }
            this.L = l;
        }
        
        public static long D(final int n, final int n2) {
            return (long)n2 | (long)n << 32;
        }
        
        public int B(final int[] array, final Drawable drawable, final int i) {
            final int z = super.z(array, drawable);
            this.L.n(z, i);
            return z;
        }
        
        public int C(final int n, final int n2, final Drawable drawable, final boolean b) {
            final int a = super.a(drawable);
            final long d = D(n, n2);
            long n3;
            if (b) {
                n3 = 8589934592L;
            }
            else {
                n3 = 0L;
            }
            final t.f k = this.K;
            final long n4 = a;
            k.a(d, n4 | n3);
            if (b) {
                this.K.a(D(n2, n), 0x100000000L | n4 | n3);
            }
            return a;
        }
        
        public int E(final int n) {
            if (n < 0) {
                return 0;
            }
            return (int)this.L.j(n, 0);
        }
        
        public int F(final int[] array) {
            final int a = super.A(array);
            if (a >= 0) {
                return a;
            }
            return super.A(StateSet.WILD_CARD);
        }
        
        public int G(final int n, final int n2) {
            return (int)(long)this.K.g(D(n, n2), -1L);
        }
        
        public boolean H(final int n, final int n2) {
            return ((long)this.K.g(D(n, n2), -1L) & 0x100000000L) != 0x0L;
        }
        
        public boolean I(final int n, final int n2) {
            return ((long)this.K.g(D(n, n2), -1L) & 0x200000000L) != 0x0L;
        }
        
        public Drawable newDrawable() {
            return new a(this, null);
        }
        
        public Drawable newDrawable(final Resources resources) {
            return new a(this, resources);
        }
        
        @Override
        public void r() {
            this.K = this.K.b();
            this.L = this.L.d();
        }
    }
    
    public static class d extends g
    {
        public final u1.b a;
        
        public d(final u1.b a) {
            super(null);
            this.a = a;
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
    
    public static class e extends g
    {
        public final ObjectAnimator a;
        public final boolean b;
        
        public e(final AnimationDrawable animationDrawable, final boolean b, final boolean b2) {
            super(null);
            final int numberOfFrames = animationDrawable.getNumberOfFrames();
            int n = 0;
            int n2;
            if (b) {
                n2 = numberOfFrames - 1;
            }
            else {
                n2 = 0;
            }
            if (!b) {
                n = numberOfFrames - 1;
            }
            final f interpolator = new f(animationDrawable, b);
            final ObjectAnimator ofInt = ObjectAnimator.ofInt((Object)animationDrawable, "currentIndex", new int[] { n2, n });
            ofInt.setAutoCancel(true);
            ofInt.setDuration((long)interpolator.a());
            ((Animator)ofInt).setInterpolator((TimeInterpolator)interpolator);
            this.b = b2;
            this.a = ofInt;
        }
        
        @Override
        public boolean a() {
            return this.b;
        }
        
        @Override
        public void b() {
            ((ValueAnimator)this.a).reverse();
        }
        
        @Override
        public void c() {
            this.a.start();
        }
        
        @Override
        public void d() {
            ((Animator)this.a).cancel();
        }
    }
    
    public static class f implements TimeInterpolator
    {
        public int[] a;
        public int b;
        public int c;
        
        public f(final AnimationDrawable animationDrawable, final boolean b) {
            this.b(animationDrawable, b);
        }
        
        public int a() {
            return this.c;
        }
        
        public int b(final AnimationDrawable animationDrawable, final boolean b) {
            final int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            final int[] a = this.a;
            if (a == null || a.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            final int[] a2 = this.a;
            int i = 0;
            int c = 0;
            while (i < numberOfFrames) {
                int n;
                if (b) {
                    n = numberOfFrames - i - 1;
                }
                else {
                    n = i;
                }
                final int duration = animationDrawable.getDuration(n);
                a2[i] = duration;
                c += duration;
                ++i;
            }
            return this.c = c;
        }
        
        public float getInterpolation(float n) {
            int n2 = (int)(n * this.c + 0.5f);
            final int b = this.b;
            final int[] a = this.a;
            int i;
            for (i = 0; i < b; ++i) {
                final int n3 = a[i];
                if (n2 < n3) {
                    break;
                }
                n2 -= n3;
            }
            if (i < b) {
                n = n2 / (float)this.c;
            }
            else {
                n = 0.0f;
            }
            return i / (float)b + n;
        }
    }
    
    public abstract static class g
    {
        public boolean a() {
            return false;
        }
        
        public void b() {
        }
        
        public abstract void c();
        
        public abstract void d();
    }
}
