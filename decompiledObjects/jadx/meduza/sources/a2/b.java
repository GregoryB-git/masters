package a2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import y.a;

/* loaded from: classes.dex */
public final class b extends e implements Animatable {

    /* renamed from: b, reason: collision with root package name */
    public C0001b f26b;

    /* renamed from: c, reason: collision with root package name */
    public Context f27c;

    /* renamed from: d, reason: collision with root package name */
    public final a f28d;

    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            b.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: a2.b$b, reason: collision with other inner class name */
    public static class C0001b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public f f30a;

        /* renamed from: b, reason: collision with root package name */
        public AnimatorSet f31b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<Animator> f32c;

        /* renamed from: d, reason: collision with root package name */
        public r.b<Animator, String> f33d;

        public C0001b(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f34a;

        public c(Drawable.ConstantState constantState) {
            this.f34a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f34a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f34a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            b bVar = new b();
            Drawable newDrawable = this.f34a.newDrawable();
            bVar.f37a = newDrawable;
            newDrawable.setCallback(bVar.f28d);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable newDrawable = this.f34a.newDrawable(resources);
            bVar.f37a = newDrawable;
            newDrawable.setCallback(bVar.f28d);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable newDrawable = this.f34a.newDrawable(resources, theme);
            bVar.f37a = newDrawable;
            newDrawable.setCallback(bVar.f28d);
            return bVar;
        }
    }

    public b() {
        this(null);
    }

    public b(Context context) {
        a aVar = new a();
        this.f28d = aVar;
        this.f27c = context;
        this.f26b = new C0001b(aVar);
    }

    @Override // a2.e, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            a.C0261a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            return a.C0261a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f26b.f30a.draw(canvas);
        if (this.f26b.f31b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f37a;
        return drawable != null ? drawable.getAlpha() : this.f26b.f30a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f26b.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f37a;
        return drawable != null ? a.C0261a.c(drawable) : this.f26b.f30a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f37a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f37a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f37a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f26b.f30a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f37a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f26b.f30a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f37a;
        return drawable != null ? drawable.getOpacity() : this.f26b.f30a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.b.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f37a;
        return drawable != null ? drawable.isAutoMirrored() : this.f26b.f30a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f37a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f26b.f31b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f37a;
        return drawable != null ? drawable.isStateful() : this.f26b.f30a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f26b.f30a.setBounds(rect);
        }
    }

    @Override // a2.e, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f37a;
        return drawable != null ? drawable.setLevel(i10) : this.f26b.f30a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f37a;
        return drawable != null ? drawable.setState(iArr) : this.f26b.f30a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f26b.f30a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f26b.f30a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f26b.f30a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            y.a.a(drawable, i10);
        } else {
            this.f26b.f30a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            y.a.b(drawable, colorStateList);
        } else {
            this.f26b.f30a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            y.a.c(drawable, mode);
        } else {
            this.f26b.f30a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f26b.f30a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f26b.f31b.isStarted()) {
                return;
            }
            this.f26b.f31b.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f26b.f31b.end();
        }
    }
}
