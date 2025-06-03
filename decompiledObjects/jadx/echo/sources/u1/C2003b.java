package u1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import t.C1958a;
import z.k;

/* renamed from: u1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2003b extends f implements Animatable {

    /* renamed from: p, reason: collision with root package name */
    public C0277b f19676p;

    /* renamed from: q, reason: collision with root package name */
    public Context f19677q;

    /* renamed from: r, reason: collision with root package name */
    public ArgbEvaluator f19678r;

    /* renamed from: s, reason: collision with root package name */
    public Animator.AnimatorListener f19679s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f19680t;

    /* renamed from: u, reason: collision with root package name */
    public final Drawable.Callback f19681u;

    /* renamed from: u1.b$a */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C2003b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
            C2003b.this.scheduleSelf(runnable, j7);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C2003b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: u1.b$b, reason: collision with other inner class name */
    public static class C0277b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f19683a;

        /* renamed from: b, reason: collision with root package name */
        public g f19684b;

        /* renamed from: c, reason: collision with root package name */
        public AnimatorSet f19685c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f19686d;

        /* renamed from: e, reason: collision with root package name */
        public C1958a f19687e;

        public C0277b(Context context, C0277b c0277b, Drawable.Callback callback, Resources resources) {
            if (c0277b != null) {
                this.f19683a = c0277b.f19683a;
                g gVar = c0277b.f19684b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    this.f19684b = (g) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    g gVar2 = (g) this.f19684b.mutate();
                    this.f19684b = gVar2;
                    gVar2.setCallback(callback);
                    this.f19684b.setBounds(c0277b.f19684b.getBounds());
                    this.f19684b.h(false);
                }
                ArrayList arrayList = c0277b.f19686d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f19686d = new ArrayList(size);
                    this.f19687e = new C1958a(size);
                    for (int i7 = 0; i7 < size; i7++) {
                        Animator animator = (Animator) c0277b.f19686d.get(i7);
                        Animator clone = animator.clone();
                        String str = (String) c0277b.f19687e.get(animator);
                        clone.setTarget(this.f19684b.d(str));
                        this.f19686d.add(clone);
                        this.f19687e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f19685c == null) {
                this.f19685c = new AnimatorSet();
            }
            this.f19685c.playTogether(this.f19686d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f19683a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: u1.b$c */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f19688a;

        public c(Drawable.ConstantState constantState) {
            this.f19688a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f19688a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f19688a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C2003b c2003b = new C2003b();
            Drawable newDrawable = this.f19688a.newDrawable();
            c2003b.f19691o = newDrawable;
            newDrawable.setCallback(c2003b.f19681u);
            return c2003b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C2003b c2003b = new C2003b();
            Drawable newDrawable = this.f19688a.newDrawable(resources);
            c2003b.f19691o = newDrawable;
            newDrawable.setCallback(c2003b.f19681u);
            return c2003b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C2003b c2003b = new C2003b();
            Drawable newDrawable = this.f19688a.newDrawable(resources, theme);
            c2003b.f19691o = newDrawable;
            newDrawable.setCallback(c2003b.f19681u);
            return c2003b;
        }
    }

    public C2003b() {
        this(null, null, null);
    }

    public static C2003b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C2003b c2003b = new C2003b(context);
        c2003b.inflate(resources, xmlPullParser, attributeSet, theme);
        return c2003b;
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            B.a.a(drawable, theme);
        }
    }

    public final void b(String str, Animator animator) {
        animator.setTarget(this.f19676p.f19684b.d(str));
        C0277b c0277b = this.f19676p;
        if (c0277b.f19686d == null) {
            c0277b.f19686d = new ArrayList();
            this.f19676p.f19687e = new C1958a();
        }
        this.f19676p.f19686d.add(animator);
        this.f19676p.f19687e.put(animator, str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            return B.a.b(drawable);
        }
        return false;
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f19676p.f19684b.draw(canvas);
        if (this.f19676p.f19685c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f19691o;
        return drawable != null ? B.a.c(drawable) : this.f19676p.f19684b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f19691o;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f19676p.f19683a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f19691o;
        return drawable != null ? B.a.d(drawable) : this.f19676p.f19684b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f19691o == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f19691o.getConstantState());
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f19691o;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f19676p.f19684b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f19691o;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f19676p.f19684b.getIntrinsicWidth();
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f19691o;
        return drawable != null ? drawable.getOpacity() : this.f19676p.f19684b.getOpacity();
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f19691o;
        return drawable != null ? B.a.g(drawable) : this.f19676p.f19684b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f19691o;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f19676p.f19685c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f19691o;
        return drawable != null ? drawable.isStateful() : this.f19676p.f19684b.isStateful();
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f19676p.f19684b.setBounds(rect);
        }
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i7) {
        Drawable drawable = this.f19691o;
        return drawable != null ? drawable.setLevel(i7) : this.f19676p.f19684b.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f19691o;
        return drawable != null ? drawable.setState(iArr) : this.f19676p.f19684b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else {
            this.f19676p.f19684b.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            B.a.i(drawable, z7);
        } else {
            this.f19676p.f19684b.setAutoMirrored(z7);
        }
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i7) {
        super.setChangingConfigurations(i7);
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i7, PorterDuff.Mode mode) {
        super.setColorFilter(i7, mode);
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z7) {
        super.setFilterBitmap(z7);
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f7, float f8) {
        super.setHotspot(f7, f8);
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i7, int i8, int i9, int i10) {
        super.setHotspotBounds(i7, i8, i9, i10);
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i7) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            B.a.l(drawable, i7);
        } else {
            this.f19676p.f19684b.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            B.a.m(drawable, colorStateList);
        } else {
            this.f19676p.f19684b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            B.a.n(drawable, mode);
        } else {
            this.f19676p.f19684b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            return drawable.setVisible(z7, z8);
        }
        this.f19676p.f19684b.setVisible(z7, z8);
        return super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f19676p.f19685c.isStarted()) {
                return;
            }
            this.f19676p.f19685c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f19676p.f19685c.end();
        }
    }

    public C2003b(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            B.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = k.k(resources, theme, attributeSet, AbstractC2002a.f19668e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        g b7 = g.b(resources, resourceId, theme);
                        b7.h(false);
                        b7.setCallback(this.f19681u);
                        g gVar = this.f19676p.f19684b;
                        if (gVar != null) {
                            gVar.setCallback(null);
                        }
                        this.f19676p.f19684b = b7;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC2002a.f19669f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f19677q;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        b(string, AbstractC2005d.i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f19676p.a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f19676p.f19684b.setColorFilter(colorFilter);
        }
    }

    public C2003b(Context context, C0277b c0277b, Resources resources) {
        this.f19678r = null;
        this.f19679s = null;
        this.f19680t = null;
        a aVar = new a();
        this.f19681u = aVar;
        this.f19677q = context;
        if (c0277b != null) {
            this.f19676p = c0277b;
        } else {
            this.f19676p = new C0277b(context, c0277b, aVar, resources);
        }
    }
}
