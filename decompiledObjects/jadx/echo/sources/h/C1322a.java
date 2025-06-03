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
import h.AbstractC1323b;
import h.AbstractC1325d;
import i.AbstractC1340b;
import l.M;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t.i;
import u1.C2003b;
import z.k;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1322a extends AbstractC1325d {

    /* renamed from: C, reason: collision with root package name */
    public c f14448C;

    /* renamed from: D, reason: collision with root package name */
    public g f14449D;

    /* renamed from: E, reason: collision with root package name */
    public int f14450E;

    /* renamed from: F, reason: collision with root package name */
    public int f14451F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f14452G;

    /* renamed from: h.a$b */
    public static class b extends g {

        /* renamed from: a, reason: collision with root package name */
        public final Animatable f14453a;

        public b(Animatable animatable) {
            super();
            this.f14453a = animatable;
        }

        @Override // h.C1322a.g
        public void c() {
            this.f14453a.start();
        }

        @Override // h.C1322a.g
        public void d() {
            this.f14453a.stop();
        }
    }

    /* renamed from: h.a$c */
    public static class c extends AbstractC1325d.a {

        /* renamed from: K, reason: collision with root package name */
        public t.f f14454K;

        /* renamed from: L, reason: collision with root package name */
        public i f14455L;

        public c(c cVar, C1322a c1322a, Resources resources) {
            super(cVar, c1322a, resources);
            i iVar;
            if (cVar != null) {
                this.f14454K = cVar.f14454K;
                iVar = cVar.f14455L;
            } else {
                this.f14454K = new t.f();
                iVar = new i();
            }
            this.f14455L = iVar;
        }

        public static long D(int i7, int i8) {
            return i8 | (i7 << 32);
        }

        public int B(int[] iArr, Drawable drawable, int i7) {
            int z7 = super.z(iArr, drawable);
            this.f14455L.n(z7, Integer.valueOf(i7));
            return z7;
        }

        public int C(int i7, int i8, Drawable drawable, boolean z7) {
            int a7 = super.a(drawable);
            long D7 = D(i7, i8);
            long j7 = z7 ? 8589934592L : 0L;
            long j8 = a7;
            this.f14454K.a(D7, Long.valueOf(j8 | j7));
            if (z7) {
                this.f14454K.a(D(i8, i7), Long.valueOf(4294967296L | j8 | j7));
            }
            return a7;
        }

        public int E(int i7) {
            if (i7 < 0) {
                return 0;
            }
            return ((Integer) this.f14455L.j(i7, 0)).intValue();
        }

        public int F(int[] iArr) {
            int A7 = super.A(iArr);
            return A7 >= 0 ? A7 : super.A(StateSet.WILD_CARD);
        }

        public int G(int i7, int i8) {
            return (int) ((Long) this.f14454K.g(D(i7, i8), -1L)).longValue();
        }

        public boolean H(int i7, int i8) {
            return (((Long) this.f14454K.g(D(i7, i8), -1L)).longValue() & 4294967296L) != 0;
        }

        public boolean I(int i7, int i8) {
            return (((Long) this.f14454K.g(D(i7, i8), -1L)).longValue() & 8589934592L) != 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1322a(this, null);
        }

        @Override // h.AbstractC1325d.a, h.AbstractC1323b.c
        public void r() {
            this.f14454K = this.f14454K.clone();
            this.f14455L = this.f14455L.clone();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C1322a(this, resources);
        }
    }

    /* renamed from: h.a$d */
    public static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        public final C2003b f14456a;

        public d(C2003b c2003b) {
            super();
            this.f14456a = c2003b;
        }

        @Override // h.C1322a.g
        public void c() {
            this.f14456a.start();
        }

        @Override // h.C1322a.g
        public void d() {
            this.f14456a.stop();
        }
    }

    /* renamed from: h.a$e */
    public static class e extends g {

        /* renamed from: a, reason: collision with root package name */
        public final ObjectAnimator f14457a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14458b;

        public e(AnimationDrawable animationDrawable, boolean z7, boolean z8) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i7 = z7 ? numberOfFrames - 1 : 0;
            int i8 = z7 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z7);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i7, i8);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f14458b = z8;
            this.f14457a = ofInt;
        }

        @Override // h.C1322a.g
        public boolean a() {
            return this.f14458b;
        }

        @Override // h.C1322a.g
        public void b() {
            this.f14457a.reverse();
        }

        @Override // h.C1322a.g
        public void c() {
            this.f14457a.start();
        }

        @Override // h.C1322a.g
        public void d() {
            this.f14457a.cancel();
        }
    }

    /* renamed from: h.a$f */
    public static class f implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        public int[] f14459a;

        /* renamed from: b, reason: collision with root package name */
        public int f14460b;

        /* renamed from: c, reason: collision with root package name */
        public int f14461c;

        public f(AnimationDrawable animationDrawable, boolean z7) {
            b(animationDrawable, z7);
        }

        public int a() {
            return this.f14461c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z7) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f14460b = numberOfFrames;
            int[] iArr = this.f14459a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f14459a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f14459a;
            int i7 = 0;
            for (int i8 = 0; i8 < numberOfFrames; i8++) {
                int duration = animationDrawable.getDuration(z7 ? (numberOfFrames - i8) - 1 : i8);
                iArr2[i8] = duration;
                i7 += duration;
            }
            this.f14461c = i7;
            return i7;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f7) {
            int i7 = (int) ((f7 * this.f14461c) + 0.5f);
            int i8 = this.f14460b;
            int[] iArr = this.f14459a;
            int i9 = 0;
            while (i9 < i8) {
                int i10 = iArr[i9];
                if (i7 < i10) {
                    break;
                }
                i7 -= i10;
                i9++;
            }
            return (i9 / i8) + (i9 < i8 ? i7 / this.f14461c : 0.0f);
        }
    }

    public C1322a() {
        this(null, null);
    }

    public static C1322a l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C1322a c1322a = new C1322a();
            c1322a.m(context, resources, xmlPullParser, attributeSet, theme);
            return c1322a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // h.AbstractC1325d, h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // h.AbstractC1325d, h.AbstractC1323b
    public void h(AbstractC1323b.c cVar) {
        super.h(cVar);
        if (cVar instanceof c) {
            this.f14448C = (c) cVar;
        }
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f14449D;
        if (gVar != null) {
            gVar.d();
            this.f14449D = null;
            g(this.f14450E);
            this.f14450E = -1;
            this.f14451F = -1;
        }
    }

    @Override // h.AbstractC1323b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.f14448C, this, null);
    }

    public void m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k7 = k.k(resources, theme, attributeSet, AbstractC1340b.f14604a);
        setVisible(k7.getBoolean(AbstractC1340b.f14606c, true), true);
        s(k7);
        i(resources);
        k7.recycle();
        n(context, resources, xmlPullParser, attributeSet, theme);
        o();
    }

    @Override // h.AbstractC1325d, h.AbstractC1323b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f14452G && super.mutate() == this) {
            this.f14448C.r();
            this.f14452G = true;
        }
        return this;
    }

    public final void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    p(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    public final void o() {
        onStateChange(getState());
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i7) {
        return super.onLayoutDirectionChanged(i7);
    }

    @Override // h.AbstractC1325d, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int F6 = this.f14448C.F(iArr);
        boolean z7 = F6 != c() && (r(F6) || g(F6));
        Drawable current = getCurrent();
        return current != null ? z7 | current.setState(iArr) : z7;
    }

    public final int p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k7 = k.k(resources, theme, attributeSet, AbstractC1340b.f14611h);
        int resourceId = k7.getResourceId(AbstractC1340b.f14612i, 0);
        int resourceId2 = k7.getResourceId(AbstractC1340b.f14613j, -1);
        Drawable j7 = resourceId2 > 0 ? M.h().j(context, resourceId2) : null;
        k7.recycle();
        int[] j8 = j(attributeSet);
        if (j7 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j7 = xmlPullParser.getName().equals("vector") ? u1.g.c(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (j7 != null) {
            return this.f14448C.B(j8, j7, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    public final int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k7 = k.k(resources, theme, attributeSet, AbstractC1340b.f14614k);
        int resourceId = k7.getResourceId(AbstractC1340b.f14617n, -1);
        int resourceId2 = k7.getResourceId(AbstractC1340b.f14616m, -1);
        int resourceId3 = k7.getResourceId(AbstractC1340b.f14615l, -1);
        Drawable j7 = resourceId3 > 0 ? M.h().j(context, resourceId3) : null;
        boolean z7 = k7.getBoolean(AbstractC1340b.f14618o, false);
        k7.recycle();
        if (j7 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j7 = xmlPullParser.getName().equals("animated-vector") ? C2003b.a(context, resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (j7 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f14448C.C(resourceId, resourceId2, j7, z7);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    public final boolean r(int i7) {
        int c7;
        int G6;
        g bVar;
        g gVar = this.f14449D;
        if (gVar == null) {
            c7 = c();
        } else {
            if (i7 == this.f14450E) {
                return true;
            }
            if (i7 == this.f14451F && gVar.a()) {
                gVar.b();
                this.f14450E = this.f14451F;
                this.f14451F = i7;
                return true;
            }
            c7 = this.f14450E;
            gVar.d();
        }
        this.f14449D = null;
        this.f14451F = -1;
        this.f14450E = -1;
        c cVar = this.f14448C;
        int E6 = cVar.E(c7);
        int E7 = cVar.E(i7);
        if (E7 == 0 || E6 == 0 || (G6 = cVar.G(E6, E7)) < 0) {
            return false;
        }
        boolean I6 = cVar.I(E6, E7);
        g(G6);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(E6, E7), I6);
        } else {
            if (!(current instanceof C2003b)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((C2003b) current);
        }
        bVar.c();
        this.f14449D = bVar;
        this.f14451F = c7;
        this.f14450E = i7;
        return true;
    }

    public final void s(TypedArray typedArray) {
        c cVar = this.f14448C;
        cVar.f14488d |= typedArray.getChangingConfigurations();
        cVar.x(typedArray.getBoolean(AbstractC1340b.f14607d, cVar.f14493i));
        cVar.t(typedArray.getBoolean(AbstractC1340b.f14608e, cVar.f14496l));
        cVar.u(typedArray.getInt(AbstractC1340b.f14609f, cVar.f14476A));
        cVar.v(typedArray.getInt(AbstractC1340b.f14610g, cVar.f14477B));
        setDither(typedArray.getBoolean(AbstractC1340b.f14605b, cVar.f14508x));
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        super.scheduleDrawable(drawable, runnable, j7);
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i7) {
        super.setAlpha(i7);
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z7) {
        super.setAutoMirrored(z7);
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z7) {
        super.setDither(z7);
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f7, float f8) {
        super.setHotspot(f7, f8);
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i7, int i8, int i9, int i10) {
        super.setHotspotBounds(i7, i8, i9, i10);
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        boolean visible = super.setVisible(z7, z8);
        g gVar = this.f14449D;
        if (gVar != null && (visible || z8)) {
            if (z7) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public C1322a(c cVar, Resources resources) {
        super(null);
        this.f14450E = -1;
        this.f14451F = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: h.a$g */
    public static abstract class g {
        public g() {
        }

        public boolean a() {
            return false;
        }

        public abstract void c();

        public abstract void d();

        public void b() {
        }
    }
}
