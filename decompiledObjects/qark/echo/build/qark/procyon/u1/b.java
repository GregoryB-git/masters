// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u1;

import java.util.Collection;
import android.animation.AnimatorSet;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.content.res.TypedArray;
import z.k;
import android.graphics.Region;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.animation.Animator;
import B.a;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.graphics.drawable.Drawable$Callback;
import java.util.ArrayList;
import android.animation.Animator$AnimatorListener;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.drawable.Animatable;

public class b extends f implements Animatable
{
    public b p;
    public Context q;
    public ArgbEvaluator r;
    public Animator$AnimatorListener s;
    public ArrayList t;
    public final Drawable$Callback u;
    
    public b() {
        this(null, null, null);
    }
    
    public b(final Context context) {
        this(context, null, null);
    }
    
    public b(final Context q, final b p3, final Resources resources) {
        this.r = null;
        this.s = null;
        this.t = null;
        final Drawable$Callback u = (Drawable$Callback)new Drawable$Callback() {
            public void invalidateDrawable(final Drawable drawable) {
                b.this.invalidateSelf();
            }
            
            public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
                b.this.scheduleSelf(runnable, n);
            }
            
            public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
                b.this.unscheduleSelf(runnable);
            }
        };
        this.u = (Drawable$Callback)u;
        this.q = q;
        if (p3 != null) {
            this.p = p3;
            return;
        }
        this.p = new b(q, p3, (Drawable$Callback)u, resources);
    }
    
    public static b a(final Context context, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final b b = new b(context);
        b.inflate(resources, xmlPullParser, set, resources$Theme);
        return b;
    }
    
    @Override
    public void applyTheme(final Resources$Theme resources$Theme) {
        final Drawable o = super.o;
        if (o != null) {
            a.a(o, resources$Theme);
        }
    }
    
    public final void b(final String s, final Animator e) {
        e.setTarget(this.p.b.d(s));
        final b p2 = this.p;
        if (p2.d == null) {
            p2.d = new ArrayList();
            this.p.e = new t.a();
        }
        this.p.d.add(e);
        this.p.e.put(e, s);
    }
    
    public boolean canApplyTheme() {
        final Drawable o = super.o;
        return o != null && a.b(o);
    }
    
    public void draw(final Canvas canvas) {
        final Drawable o = super.o;
        if (o != null) {
            o.draw(canvas);
            return;
        }
        this.p.b.draw(canvas);
        if (this.p.c.isStarted()) {
            this.invalidateSelf();
        }
    }
    
    public int getAlpha() {
        final Drawable o = super.o;
        if (o != null) {
            return a.c(o);
        }
        return this.p.b.getAlpha();
    }
    
    public int getChangingConfigurations() {
        final Drawable o = super.o;
        if (o != null) {
            return o.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.p.a;
    }
    
    public ColorFilter getColorFilter() {
        final Drawable o = super.o;
        if (o != null) {
            return a.d(o);
        }
        return this.p.b.getColorFilter();
    }
    
    public Drawable$ConstantState getConstantState() {
        if (super.o != null && Build$VERSION.SDK_INT >= 24) {
            return new c(super.o.getConstantState());
        }
        return null;
    }
    
    public int getIntrinsicHeight() {
        final Drawable o = super.o;
        if (o != null) {
            return o.getIntrinsicHeight();
        }
        return this.p.b.getIntrinsicHeight();
    }
    
    public int getIntrinsicWidth() {
        final Drawable o = super.o;
        if (o != null) {
            return o.getIntrinsicWidth();
        }
        return this.p.b.getIntrinsicWidth();
    }
    
    public int getOpacity() {
        final Drawable o = super.o;
        if (o != null) {
            return o.getOpacity();
        }
        return this.p.b.getOpacity();
    }
    
    public void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set) {
        this.inflate(resources, xmlPullParser, set, null);
    }
    
    public void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final Drawable o = super.o;
        if (o != null) {
            a.f(o, resources, xmlPullParser, set, resources$Theme);
            return;
        }
        for (int n = xmlPullParser.getEventType(), depth = xmlPullParser.getDepth(); n != 1 && (xmlPullParser.getDepth() >= depth + 1 || n != 3); n = xmlPullParser.next()) {
            if (n == 2) {
                final String name = xmlPullParser.getName();
                TypedArray typedArray;
                if ("animated-vector".equals(name)) {
                    final TypedArray k = z.k.k(resources, resources$Theme, set, u1.a.e);
                    final int resourceId = k.getResourceId(0, 0);
                    typedArray = k;
                    if (resourceId != 0) {
                        final g b = g.b(resources, resourceId, resources$Theme);
                        b.h(false);
                        b.setCallback(this.u);
                        final g b2 = this.p.b;
                        if (b2 != null) {
                            b2.setCallback((Drawable$Callback)null);
                        }
                        this.p.b = b;
                        typedArray = k;
                    }
                }
                else {
                    if (!"target".equals(name)) {
                        continue;
                    }
                    final TypedArray obtainAttributes = resources.obtainAttributes(set, u1.a.f);
                    final String string = obtainAttributes.getString(0);
                    final int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    typedArray = obtainAttributes;
                    if (resourceId2 != 0) {
                        final Context q = this.q;
                        if (q == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        this.b(string, d.i(q, resourceId2));
                        typedArray = obtainAttributes;
                    }
                }
                typedArray.recycle();
            }
        }
        this.p.a();
    }
    
    public boolean isAutoMirrored() {
        final Drawable o = super.o;
        if (o != null) {
            return a.g(o);
        }
        return this.p.b.isAutoMirrored();
    }
    
    public boolean isRunning() {
        final Drawable o = super.o;
        if (o != null) {
            return ((AnimatedVectorDrawable)o).isRunning();
        }
        return this.p.c.isRunning();
    }
    
    public boolean isStateful() {
        final Drawable o = super.o;
        if (o != null) {
            return o.isStateful();
        }
        return this.p.b.isStateful();
    }
    
    public Drawable mutate() {
        final Drawable o = super.o;
        if (o != null) {
            o.mutate();
        }
        return this;
    }
    
    public void onBoundsChange(final Rect rect) {
        final Drawable o = super.o;
        if (o != null) {
            o.setBounds(rect);
            return;
        }
        this.p.b.setBounds(rect);
    }
    
    @Override
    public boolean onLevelChange(final int n) {
        final Drawable o = super.o;
        if (o != null) {
            return o.setLevel(n);
        }
        return this.p.b.setLevel(n);
    }
    
    public boolean onStateChange(final int[] array) {
        final Drawable o = super.o;
        if (o != null) {
            return o.setState(array);
        }
        return this.p.b.setState(array);
    }
    
    public void setAlpha(final int n) {
        final Drawable o = super.o;
        if (o != null) {
            o.setAlpha(n);
            return;
        }
        this.p.b.setAlpha(n);
    }
    
    public void setAutoMirrored(final boolean autoMirrored) {
        final Drawable o = super.o;
        if (o != null) {
            a.i(o, autoMirrored);
            return;
        }
        this.p.b.setAutoMirrored(autoMirrored);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        final Drawable o = super.o;
        if (o != null) {
            o.setColorFilter(colorFilter);
            return;
        }
        this.p.b.setColorFilter(colorFilter);
    }
    
    public void setTint(final int tint) {
        final Drawable o = super.o;
        if (o != null) {
            a.l(o, tint);
            return;
        }
        this.p.b.setTint(tint);
    }
    
    public void setTintList(final ColorStateList tintList) {
        final Drawable o = super.o;
        if (o != null) {
            a.m(o, tintList);
            return;
        }
        this.p.b.setTintList(tintList);
    }
    
    public void setTintMode(final PorterDuff$Mode tintMode) {
        final Drawable o = super.o;
        if (o != null) {
            a.n(o, tintMode);
            return;
        }
        this.p.b.setTintMode(tintMode);
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        final Drawable o = super.o;
        if (o != null) {
            return o.setVisible(b, b2);
        }
        this.p.b.setVisible(b, b2);
        return super.setVisible(b, b2);
    }
    
    public void start() {
        final Drawable o = super.o;
        if (o != null) {
            ((AnimatedVectorDrawable)o).start();
            return;
        }
        if (this.p.c.isStarted()) {
            return;
        }
        this.p.c.start();
        this.invalidateSelf();
    }
    
    public void stop() {
        final Drawable o = super.o;
        if (o != null) {
            ((AnimatedVectorDrawable)o).stop();
            return;
        }
        this.p.c.end();
    }
    
    public static class b extends Drawable$ConstantState
    {
        public int a;
        public g b;
        public AnimatorSet c;
        public ArrayList d;
        public t.a e;
        
        public b(final Context context, final b b, final Drawable$Callback callback, final Resources resources) {
            if (b != null) {
                this.a = b.a;
                final g b2 = b.b;
                int i = 0;
                if (b2 != null) {
                    final Drawable$ConstantState constantState = b2.getConstantState();
                    Drawable drawable;
                    if (resources != null) {
                        drawable = constantState.newDrawable(resources);
                    }
                    else {
                        drawable = constantState.newDrawable();
                    }
                    this.b = (g)drawable;
                    (this.b = (g)this.b.mutate()).setCallback(callback);
                    this.b.setBounds(b.b.getBounds());
                    this.b.h(false);
                }
                final ArrayList d = b.d;
                if (d != null) {
                    final int size = d.size();
                    this.d = new ArrayList(size);
                    this.e = new t.a(size);
                    while (i < size) {
                        final Animator animator = b.d.get(i);
                        final Animator clone = animator.clone();
                        final String s = (String)b.e.get(animator);
                        clone.setTarget(this.b.d(s));
                        this.d.add(clone);
                        this.e.put(clone, s);
                        ++i;
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
        
        public Drawable newDrawable(final Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }
    
    public static class c extends Drawable$ConstantState
    {
        public final Drawable$ConstantState a;
        
        public c(final Drawable$ConstantState a) {
            this.a = a;
        }
        
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }
        
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }
        
        public Drawable newDrawable() {
            final b b = new b();
            (b.o = this.a.newDrawable()).setCallback(b.u);
            return b;
        }
        
        public Drawable newDrawable(final Resources resources) {
            final b b = new b();
            (b.o = this.a.newDrawable(resources)).setCallback(b.u);
            return b;
        }
        
        public Drawable newDrawable(final Resources resources, final Resources$Theme resources$Theme) {
            final b b = new b();
            (b.o = this.a.newDrawable(resources, resources$Theme)).setCallback(b.u);
            return b;
        }
    }
}
