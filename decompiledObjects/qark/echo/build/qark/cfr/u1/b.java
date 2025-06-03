/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.ArgbEvaluator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.AnimatedVectorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  org.xmlpull.v1.XmlPullParser
 */
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
import java.util.Collection;
import org.xmlpull.v1.XmlPullParser;
import u1.a;
import u1.d;
import u1.f;
import u1.g;
import z.k;

public class b
extends f
implements Animatable {
    public b p;
    public Context q;
    public ArgbEvaluator r = null;
    public Animator.AnimatorListener s = null;
    public ArrayList t = null;
    public final Drawable.Callback u;

    public b() {
        this(null, null, null);
    }

    public b(Context context) {
        this(context, null, null);
    }

    public b(Context context, b b8, Resources resources) {
        Drawable.Callback callback;
        this.u = callback = new Drawable.Callback(){

            public void invalidateDrawable(Drawable drawable2) {
                b.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable2, Runnable runnable, long l8) {
                b.this.scheduleSelf(runnable, l8);
            }

            public void unscheduleDrawable(Drawable drawable2, Runnable runnable) {
                b.this.unscheduleSelf(runnable);
            }
        };
        this.q = context;
        if (b8 != null) {
            this.p = b8;
            return;
        }
        this.p = new b(context, b8, callback, resources);
    }

    public static b a(Context object, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        object = new b((Context)object);
        object.inflate(resources, xmlPullParser, attributeSet, theme);
        return object;
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            B.a.a(drawable2, theme);
        }
    }

    public final void b(String string2, Animator animator) {
        animator.setTarget(this.p.b.d(string2));
        b b8 = this.p;
        if (b8.d == null) {
            b8.d = new ArrayList();
            this.p.e = new t.a();
        }
        this.p.d.add((Object)animator);
        this.p.e.put((Object)animator, string2);
    }

    public boolean canApplyTheme() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return B.a.b(drawable2);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.draw(canvas);
            return;
        }
        this.p.b.draw(canvas);
        if (this.p.c.isStarted()) {
            this.invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return B.a.c(drawable2);
        }
        return this.p.b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.getChangingConfigurations();
        }
        return Drawable.super.getChangingConfigurations() | this.p.a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return B.a.d(drawable2);
        }
        return this.p.b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.o != null && Build.VERSION.SDK_INT >= 24) {
            return new c(this.o.getConstantState());
        }
        return null;
    }

    public int getIntrinsicHeight() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.getIntrinsicHeight();
        }
        return this.p.b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.getIntrinsicWidth();
        }
        return this.p.b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return this.p.b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        this.inflate(resources, xmlPullParser, attributeSet, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Object object = this.o;
        if (object != null) {
            B.a.f((Drawable)object, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int n8 = xmlPullParser.getEventType();
        int n9 = xmlPullParser.getDepth();
        while (n8 != 1 && (xmlPullParser.getDepth() >= n9 + 1 || n8 != 3)) {
            block10 : {
                block12 : {
                    TypedArray typedArray;
                    Object object2;
                    block11 : {
                        if (n8 != 2) break block10;
                        object = xmlPullParser.getName();
                        if (!"animated-vector".equals(object)) break block11;
                        typedArray = k.k(resources, theme, attributeSet, a.e);
                        n8 = typedArray.getResourceId(0, 0);
                        object = typedArray;
                        if (n8 != 0) {
                            object = g.b(resources, n8, theme);
                            object.h(false);
                            object.setCallback(this.u);
                            object2 = this.p.b;
                            if (object2 != null) {
                                object2.setCallback(null);
                            }
                            this.p.b = object;
                            object = typedArray;
                        }
                        break block12;
                    }
                    if (!"target".equals(object)) break block10;
                    typedArray = resources.obtainAttributes(attributeSet, a.f);
                    object2 = typedArray.getString(0);
                    n8 = typedArray.getResourceId(1, 0);
                    object = typedArray;
                    if (n8 != 0) {
                        object = this.q;
                        if (object == null) {
                            typedArray.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        this.b((String)object2, d.i((Context)object, n8));
                        object = typedArray;
                    }
                }
                object.recycle();
            }
            n8 = xmlPullParser.next();
        }
        this.p.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return B.a.g(drawable2);
        }
        return this.p.b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return ((AnimatedVectorDrawable)drawable2).isRunning();
        }
        return this.p.c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.isStateful();
        }
        return this.p.b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
            return;
        }
        this.p.b.setBounds(rect);
    }

    @Override
    public boolean onLevelChange(int n8) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.setLevel(n8);
        }
        return this.p.b.setLevel(n8);
    }

    public boolean onStateChange(int[] arrn) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.setState(arrn);
        }
        return this.p.b.setState(arrn);
    }

    public void setAlpha(int n8) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.setAlpha(n8);
            return;
        }
        this.p.b.setAlpha(n8);
    }

    public void setAutoMirrored(boolean bl) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            B.a.i(drawable2, bl);
            return;
        }
        this.p.b.setAutoMirrored(bl);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        this.p.b.setColorFilter(colorFilter);
    }

    public void setTint(int n8) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            B.a.l(drawable2, n8);
            return;
        }
        this.p.b.setTint(n8);
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            B.a.m(drawable2, colorStateList);
            return;
        }
        this.p.b.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            B.a.n(drawable2, mode);
            return;
        }
        this.p.b.setTintMode(mode);
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.setVisible(bl, bl2);
        }
        this.p.b.setVisible(bl, bl2);
        return Drawable.super.setVisible(bl, bl2);
    }

    public void start() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            ((AnimatedVectorDrawable)drawable2).start();
            return;
        }
        if (this.p.c.isStarted()) {
            return;
        }
        this.p.c.start();
        this.invalidateSelf();
    }

    public void stop() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            ((AnimatedVectorDrawable)drawable2).stop();
            return;
        }
        this.p.c.end();
    }

    public static class b
    extends Drawable.ConstantState {
        public int a;
        public g b;
        public AnimatorSet c;
        public ArrayList d;
        public t.a e;

        /*
         * Enabled aggressive block sorting
         */
        public b(Context object, b b8, Drawable.Callback object2, Resources resources) {
            if (b8 != null) {
                this.a = b8.a;
                object = b8.b;
                int n8 = 0;
                if (object != null) {
                    object = object.getConstantState();
                    object = resources != null ? object.newDrawable(resources) : object.newDrawable();
                    this.b = (g)((Object)object);
                    this.b = object = (g)this.b.mutate();
                    object.setCallback((Drawable.Callback)object2);
                    this.b.setBounds(b8.b.getBounds());
                    this.b.h(false);
                }
                if ((object = b8.d) != null) {
                    int n9 = object.size();
                    this.d = new ArrayList(n9);
                    this.e = new t.a(n9);
                    while (n8 < n9) {
                        object2 = (Animator)b8.d.get(n8);
                        object = object2.clone();
                        object2 = (String)b8.e.get(object2);
                        object.setTarget(this.b.d((String)object2));
                        this.d.add(object);
                        this.e.put(object, object2);
                        ++n8;
                    }
                    this.a();
                }
            }
        }

        public void a() {
            if (this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether((Collection)this.d);
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public static class c
    extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public c(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            Drawable drawable2;
            b b8 = new b();
            b8.o = drawable2 = this.a.newDrawable();
            drawable2.setCallback(b8.u);
            return b8;
        }

        public Drawable newDrawable(Resources resources) {
            b b8 = new b();
            resources = this.a.newDrawable(resources);
            b8.o = resources;
            resources.setCallback(b8.u);
            return b8;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b b8 = new b();
            resources = this.a.newDrawable(resources, theme);
            b8.o = resources;
            resources.setCallback(b8.u);
            return b8;
        }
    }

}

