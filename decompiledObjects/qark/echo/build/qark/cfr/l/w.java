/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.textclassifier.TextClassifier
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Future
 */
package l;

import A.h;
import G.l;
import L.b;
import L.i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import l.T;
import l.U;
import l.d;
import l.f;
import l.n;
import l.v;

public class w
extends TextView
implements i,
b {
    public final d o;
    public final v p;
    public final n q;
    public Future r;

    public w(Context context) {
        this(context, null);
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public w(Context object, AttributeSet attributeSet, int n8) {
        super(U.b((Context)object), attributeSet, n8);
        T.a((View)this, this.getContext());
        this.o = object = new d((View)this);
        object.e(attributeSet, n8);
        this.p = object = new v(this);
        object.m(attributeSet, n8);
        object.b();
        this.q = new n(this);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Object object = this.o;
        if (object != null) {
            object.b();
        }
        if ((object = this.p) != null) {
            object.b();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void e() {
        Future future = this.r;
        if (future == null) return;
        try {
            this.r = null;
            a.a(future.get());
            L.h.k(this, null);
            return;
        }
        catch (InterruptedException | ExecutionException interruptedException) {
            return;
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.b) {
            return super.getAutoSizeMaxTextSize();
        }
        v v8 = this.p;
        if (v8 != null) {
            return v8.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.b) {
            return super.getAutoSizeMinTextSize();
        }
        v v8 = this.p;
        if (v8 != null) {
            return v8.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.b) {
            return super.getAutoSizeStepGranularity();
        }
        v v8 = this.p;
        if (v8 != null) {
            return v8.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        v v8 = this.p;
        if (v8 != null) {
            return v8.h();
        }
        return new int[0];
    }

    @SuppressLint(value={"WrongConstant"})
    public int getAutoSizeTextType() {
        boolean bl = b.b;
        int n8 = 0;
        if (bl) {
            if (super.getAutoSizeTextType() == 1) {
                n8 = 1;
            }
            return n8;
        }
        v v8 = this.p;
        if (v8 != null) {
            return v8.i();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return L.h.a(this);
    }

    public int getLastBaselineToBottomHeight() {
        return L.h.b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        d d8 = this.o;
        if (d8 != null) {
            return d8.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d d8 = this.o;
        if (d8 != null) {
            return d8.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.p.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.p.k();
    }

    public CharSequence getText() {
        this.e();
        return super.getText();
    }

    @NonNull
    public TextClassifier getTextClassifier() {
        n n8;
        if (Build.VERSION.SDK_INT < 28 && (n8 = this.q) != null) {
            return n8.a();
        }
        return super.getTextClassifier();
    }

    @NonNull
    public l.a getTextMetricsParamsCompat() {
        return L.h.e(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return f.a(super.onCreateInputConnection(editorInfo), editorInfo, (View)this);
    }

    public void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        v v8 = this.p;
        if (v8 != null) {
            v8.o(bl, n8, n9, n10, n11);
        }
    }

    public void onMeasure(int n8, int n9) {
        this.e();
        super.onMeasure(n8, n9);
    }

    public void onTextChanged(CharSequence object, int n8, int n9, int n10) {
        super.onTextChanged((CharSequence)object, n8, n9, n10);
        object = this.p;
        if (object != null && !b.b && object.l()) {
            this.p.c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int n8, int n9, int n10, int n11) {
        if (b.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(n8, n9, n10, n11);
            return;
        }
        v v8 = this.p;
        if (v8 != null) {
            v8.s(n8, n9, n10, n11);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] arrn, int n8) {
        if (b.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(arrn, n8);
            return;
        }
        v v8 = this.p;
        if (v8 != null) {
            v8.t(arrn, n8);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int n8) {
        if (b.b) {
            super.setAutoSizeTextTypeWithDefaults(n8);
            return;
        }
        v v8 = this.p;
        if (v8 != null) {
            v8.u(n8);
        }
    }

    public void setBackgroundDrawable(Drawable drawable2) {
        super.setBackgroundDrawable(drawable2);
        d d8 = this.o;
        if (d8 != null) {
            d8.f(drawable2);
        }
    }

    public void setBackgroundResource(int n8) {
        super.setBackgroundResource(n8);
        d d8 = this.o;
        if (d8 != null) {
            d8.g(n8);
        }
    }

    public void setCompoundDrawables(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables((Drawable)object, drawable2, drawable3, drawable4);
        object = this.p;
        if (object != null) {
            object.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative((Drawable)object, drawable2, drawable3, drawable4);
        object = this.p;
        if (object != null) {
            object.p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int n8, int n9, int n10, int n11) {
        Context context = this.getContext();
        Drawable drawable2 = null;
        Object object = n8 != 0 ? g.a.b(context, n8) : null;
        Drawable drawable3 = n9 != 0 ? g.a.b(context, n9) : null;
        Drawable drawable4 = n10 != 0 ? g.a.b(context, n10) : null;
        if (n11 != 0) {
            drawable2 = g.a.b(context, n11);
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)object, drawable3, drawable4, drawable2);
        object = this.p;
        if (object != null) {
            object.p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)object, drawable2, drawable3, drawable4);
        object = this.p;
        if (object != null) {
            object.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int n8, int n9, int n10, int n11) {
        Context context = this.getContext();
        Drawable drawable2 = null;
        Object object = n8 != 0 ? g.a.b(context, n8) : null;
        Drawable drawable3 = n9 != 0 ? g.a.b(context, n9) : null;
        Drawable drawable4 = n10 != 0 ? g.a.b(context, n10) : null;
        if (n11 != 0) {
            drawable2 = g.a.b(context, n11);
        }
        this.setCompoundDrawablesWithIntrinsicBounds((Drawable)object, drawable3, drawable4, drawable2);
        object = this.p;
        if (object != null) {
            object.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable object, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds((Drawable)object, drawable2, drawable3, drawable4);
        object = this.p;
        if (object != null) {
            object.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(L.h.m(this, callback));
    }

    public void setFirstBaselineToTopHeight(int n8) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(n8);
            return;
        }
        L.h.h(this, n8);
    }

    public void setLastBaselineToBottomHeight(int n8) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(n8);
            return;
        }
        L.h.i(this, n8);
    }

    public void setLineHeight(int n8) {
        L.h.j(this, n8);
    }

    public void setPrecomputedText(@NonNull l l8) {
        L.h.k(this, l8);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d d8 = this.o;
        if (d8 != null) {
            d8.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d d8 = this.o;
        if (d8 != null) {
            d8.j(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.p.v(colorStateList);
        this.p.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.p.w(mode);
        this.p.b();
    }

    public void setTextAppearance(Context context, int n8) {
        super.setTextAppearance(context, n8);
        v v8 = this.p;
        if (v8 != null) {
            v8.q(context, n8);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        n n8;
        if (Build.VERSION.SDK_INT < 28 && (n8 = this.q) != null) {
            n8.b(textClassifier);
            return;
        }
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<l> future) {
        this.r = future;
        if (future != null) {
            this.requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull l.a a8) {
        L.h.l(this, a8);
    }

    public void setTextSize(int n8, float f8) {
        if (b.b) {
            super.setTextSize(n8, f8);
            return;
        }
        v v8 = this.p;
        if (v8 != null) {
            v8.z(n8, f8);
        }
    }

    public void setTypeface(Typeface typeface, int n8) {
        Typeface typeface2 = typeface != null && n8 > 0 ? h.a(this.getContext(), typeface, n8) : null;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, n8);
    }
}

