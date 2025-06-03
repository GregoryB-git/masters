package l;

import G.l;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import g.AbstractC1294a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: l.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1523w extends TextView implements L.i, L.b {

    /* renamed from: o, reason: collision with root package name */
    public final C1505d f16484o;

    /* renamed from: p, reason: collision with root package name */
    public final C1522v f16485p;

    /* renamed from: q, reason: collision with root package name */
    public final C1515n f16486q;

    /* renamed from: r, reason: collision with root package name */
    public Future f16487r;

    public C1523w(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1505d c1505d = this.f16484o;
        if (c1505d != null) {
            c1505d.b();
        }
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            c1522v.b();
        }
    }

    public final void e() {
        Future future = this.f16487r;
        if (future != null) {
            try {
                this.f16487r = null;
                android.support.v4.media.a.a(future.get());
                L.h.k(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (L.b.f3284b) {
            return super.getAutoSizeMaxTextSize();
        }
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            return c1522v.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (L.b.f3284b) {
            return super.getAutoSizeMinTextSize();
        }
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            return c1522v.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (L.b.f3284b) {
            return super.getAutoSizeStepGranularity();
        }
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            return c1522v.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (L.b.f3284b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1522v c1522v = this.f16485p;
        return c1522v != null ? c1522v.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (L.b.f3284b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            return c1522v.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return L.h.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return L.h.b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1505d c1505d = this.f16484o;
        if (c1505d != null) {
            return c1505d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1505d c1505d = this.f16484o;
        if (c1505d != null) {
            return c1505d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f16485p.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f16485p.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        e();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        C1515n c1515n;
        return (Build.VERSION.SDK_INT >= 28 || (c1515n = this.f16486q) == null) ? super.getTextClassifier() : c1515n.a();
    }

    @NonNull
    public l.a getTextMetricsParamsCompat() {
        return L.h.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC1507f.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            c1522v.o(z7, i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        e();
        super.onMeasure(i7, i8);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        C1522v c1522v = this.f16485p;
        if (c1522v == null || L.b.f3284b || !c1522v.l()) {
            return;
        }
        this.f16485p.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) {
        if (L.b.f3284b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
            return;
        }
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            c1522v.s(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (L.b.f3284b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            c1522v.t(iArr, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (L.b.f3284b) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            c1522v.u(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1505d c1505d = this.f16484o;
        if (c1505d != null) {
            c1505d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C1505d c1505d = this.f16484o;
        if (c1505d != null) {
            c1505d.g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            c1522v.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            c1522v.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? AbstractC1294a.b(context, i7) : null, i8 != 0 ? AbstractC1294a.b(context, i8) : null, i9 != 0 ? AbstractC1294a.b(context, i9) : null, i10 != 0 ? AbstractC1294a.b(context, i10) : null);
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            c1522v.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? AbstractC1294a.b(context, i7) : null, i8 != 0 ? AbstractC1294a.b(context, i8) : null, i9 != 0 ? AbstractC1294a.b(context, i9) : null, i10 != 0 ? AbstractC1294a.b(context, i10) : null);
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            c1522v.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(L.h.m(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i7);
        } else {
            L.h.h(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i7);
        } else {
            L.h.i(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7) {
        L.h.j(this, i7);
    }

    public void setPrecomputedText(@NonNull G.l lVar) {
        L.h.k(this, lVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1505d c1505d = this.f16484o;
        if (c1505d != null) {
            c1505d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1505d c1505d = this.f16484o;
        if (c1505d != null) {
            c1505d.j(mode);
        }
    }

    @Override // L.i
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f16485p.v(colorStateList);
        this.f16485p.b();
    }

    @Override // L.i
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f16485p.w(mode);
        this.f16485p.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            c1522v.q(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1515n c1515n;
        if (Build.VERSION.SDK_INT >= 28 || (c1515n = this.f16486q) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1515n.b(textClassifier);
        }
    }

    public void setTextFuture(Future<G.l> future) {
        this.f16487r = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull l.a aVar) {
        L.h.l(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i7, float f7) {
        if (L.b.f3284b) {
            super.setTextSize(i7, f7);
            return;
        }
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            c1522v.z(i7, f7);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i7) {
        Typeface a7 = (typeface == null || i7 <= 0) ? null : A.h.a(getContext(), typeface, i7);
        if (a7 != null) {
            typeface = a7;
        }
        super.setTypeface(typeface, i7);
    }

    public C1523w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            c1522v.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1522v c1522v = this.f16485p;
        if (c1522v != null) {
            c1522v.p();
        }
    }

    public C1523w(Context context, AttributeSet attributeSet, int i7) {
        super(U.b(context), attributeSet, i7);
        T.a(this, getContext());
        C1505d c1505d = new C1505d(this);
        this.f16484o = c1505d;
        c1505d.e(attributeSet, i7);
        C1522v c1522v = new C1522v(this);
        this.f16485p = c1522v;
        c1522v.m(attributeSet, i7);
        c1522v.b();
        this.f16486q = new C1515n(this);
    }
}
