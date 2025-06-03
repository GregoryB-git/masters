// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.graphics.Typeface;
import android.view.ActionMode$Callback;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;
import android.os.Build$VERSION;
import android.view.textclassifier.TextClassifier;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.annotation.SuppressLint;
import java.util.concurrent.ExecutionException;
import G.l;
import L.h;
import android.support.v4.media.a;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import java.util.concurrent.Future;
import L.b;
import L.i;
import android.widget.TextView;

public class w extends TextView implements i, b
{
    public final d o;
    public final v p;
    public final n q;
    public Future r;
    
    public w(final Context context) {
        this(context, null);
    }
    
    public w(final Context context, final AttributeSet set) {
        this(context, set, 16842884);
    }
    
    public w(final Context context, final AttributeSet set, final int n) {
        super(U.b(context), set, n);
        T.a((View)this, ((View)this).getContext());
        (this.o = new d((View)this)).e(set, n);
        final v p3 = new v(this);
        (this.p = p3).m(set, n);
        p3.b();
        this.q = new n(this);
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final d o = this.o;
        if (o != null) {
            o.b();
        }
        final v p = this.p;
        if (p != null) {
            p.b();
        }
    }
    
    public final void e() {
        final Future r = this.r;
        if (r == null) {
            return;
        }
        try {
            this.r = null;
            a.a(r.get());
            h.k(this, null);
        }
        catch (InterruptedException | ExecutionException ex) {}
    }
    
    public int getAutoSizeMaxTextSize() {
        if (L.b.b) {
            return super.getAutoSizeMaxTextSize();
        }
        final v p = this.p;
        if (p != null) {
            return p.e();
        }
        return -1;
    }
    
    public int getAutoSizeMinTextSize() {
        if (L.b.b) {
            return super.getAutoSizeMinTextSize();
        }
        final v p = this.p;
        if (p != null) {
            return p.f();
        }
        return -1;
    }
    
    public int getAutoSizeStepGranularity() {
        if (L.b.b) {
            return super.getAutoSizeStepGranularity();
        }
        final v p = this.p;
        if (p != null) {
            return p.g();
        }
        return -1;
    }
    
    public int[] getAutoSizeTextAvailableSizes() {
        if (L.b.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        final v p = this.p;
        if (p != null) {
            return p.h();
        }
        return new int[0];
    }
    
    @SuppressLint({ "WrongConstant" })
    public int getAutoSizeTextType() {
        final boolean b = L.b.b;
        int n = 0;
        if (b) {
            if (super.getAutoSizeTextType() == 1) {
                n = 1;
            }
            return n;
        }
        final v p = this.p;
        if (p != null) {
            return p.i();
        }
        return 0;
    }
    
    public int getFirstBaselineToTopHeight() {
        return h.a(this);
    }
    
    public int getLastBaselineToBottomHeight() {
        return h.b(this);
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final d o = this.o;
        if (o != null) {
            return o.c();
        }
        return null;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final d o = this.o;
        if (o != null) {
            return o.d();
        }
        return null;
    }
    
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.p.j();
    }
    
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode() {
        return this.p.k();
    }
    
    public CharSequence getText() {
        this.e();
        return super.getText();
    }
    
    @NonNull
    public TextClassifier getTextClassifier() {
        if (Build$VERSION.SDK_INT < 28) {
            final n q = this.q;
            if (q != null) {
                return q.a();
            }
        }
        return super.getTextClassifier();
    }
    
    @NonNull
    public l.a getTextMetricsParamsCompat() {
        return h.e(this);
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        return f.a(super.onCreateInputConnection(editorInfo), editorInfo, (View)this);
    }
    
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final v p5 = this.p;
        if (p5 != null) {
            p5.o(b, n, n2, n3, n4);
        }
    }
    
    public void onMeasure(final int n, final int n2) {
        this.e();
        super.onMeasure(n, n2);
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        super.onTextChanged(charSequence, n, n2, n3);
        final v p4 = this.p;
        if (p4 != null && !L.b.b && p4.l()) {
            this.p.c();
        }
    }
    
    public void setAutoSizeTextTypeUniformWithConfiguration(final int n, final int n2, final int n3, final int n4) {
        if (L.b.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
            return;
        }
        final v p4 = this.p;
        if (p4 != null) {
            p4.s(n, n2, n3, n4);
        }
    }
    
    public void setAutoSizeTextTypeUniformWithPresetSizes(final int[] array, final int n) {
        if (L.b.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(array, n);
            return;
        }
        final v p2 = this.p;
        if (p2 != null) {
            p2.t(array, n);
        }
    }
    
    public void setAutoSizeTextTypeWithDefaults(final int autoSizeTextTypeWithDefaults) {
        if (L.b.b) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextTypeWithDefaults);
            return;
        }
        final v p = this.p;
        if (p != null) {
            p.u(autoSizeTextTypeWithDefaults);
        }
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final d o = this.o;
        if (o != null) {
            o.f(backgroundDrawable);
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final d o = this.o;
        if (o != null) {
            o.g(backgroundResource);
        }
    }
    
    public void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final v p4 = this.p;
        if (p4 != null) {
            p4.p();
        }
    }
    
    public void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final v p4 = this.p;
        if (p4 != null) {
            p4.p();
        }
    }
    
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        final Context context = ((View)this).getContext();
        Drawable b = null;
        Drawable b2;
        if (n != 0) {
            b2 = g.a.b(context, n);
        }
        else {
            b2 = null;
        }
        Drawable b3;
        if (n2 != 0) {
            b3 = g.a.b(context, n2);
        }
        else {
            b3 = null;
        }
        Drawable b4;
        if (n3 != 0) {
            b4 = g.a.b(context, n3);
        }
        else {
            b4 = null;
        }
        if (n4 != 0) {
            b = g.a.b(context, n4);
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds(b2, b3, b4, b);
        final v p4 = this.p;
        if (p4 != null) {
            p4.p();
        }
    }
    
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        final v p4 = this.p;
        if (p4 != null) {
            p4.p();
        }
    }
    
    public void setCompoundDrawablesWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        final Context context = ((View)this).getContext();
        Drawable b = null;
        Drawable b2;
        if (n != 0) {
            b2 = g.a.b(context, n);
        }
        else {
            b2 = null;
        }
        Drawable b3;
        if (n2 != 0) {
            b3 = g.a.b(context, n2);
        }
        else {
            b3 = null;
        }
        Drawable b4;
        if (n3 != 0) {
            b4 = g.a.b(context, n3);
        }
        else {
            b4 = null;
        }
        if (n4 != 0) {
            b = g.a.b(context, n4);
        }
        this.setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, b);
        final v p4 = this.p;
        if (p4 != null) {
            p4.p();
        }
    }
    
    public void setCompoundDrawablesWithIntrinsicBounds(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        final v p4 = this.p;
        if (p4 != null) {
            p4.p();
        }
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(h.m(this, actionMode$Callback));
    }
    
    public void setFirstBaselineToTopHeight(final int firstBaselineToTopHeight) {
        if (Build$VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
            return;
        }
        h.h(this, firstBaselineToTopHeight);
    }
    
    public void setLastBaselineToBottomHeight(final int lastBaselineToBottomHeight) {
        if (Build$VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(lastBaselineToBottomHeight);
            return;
        }
        h.i(this, lastBaselineToBottomHeight);
    }
    
    public void setLineHeight(final int n) {
        h.j(this, n);
    }
    
    public void setPrecomputedText(@NonNull final l l) {
        h.k(this, l);
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final d o = this.o;
        if (o != null) {
            o.i(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final d o = this.o;
        if (o != null) {
            o.j(porterDuff$Mode);
        }
    }
    
    public void setSupportCompoundDrawablesTintList(final ColorStateList list) {
        this.p.v(list);
        this.p.b();
    }
    
    public void setSupportCompoundDrawablesTintMode(final PorterDuff$Mode porterDuff$Mode) {
        this.p.w(porterDuff$Mode);
        this.p.b();
    }
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final v p2 = this.p;
        if (p2 != null) {
            p2.q(context, n);
        }
    }
    
    public void setTextClassifier(final TextClassifier textClassifier) {
        if (Build$VERSION.SDK_INT < 28) {
            final n q = this.q;
            if (q != null) {
                q.b(textClassifier);
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }
    
    public void setTextFuture(final Future<l> r) {
        this.r = r;
        if (r != null) {
            ((View)this).requestLayout();
        }
    }
    
    public void setTextMetricsParamsCompat(@NonNull final l.a a) {
        h.l(this, a);
    }
    
    public void setTextSize(final int n, final float n2) {
        if (L.b.b) {
            super.setTextSize(n, n2);
            return;
        }
        final v p2 = this.p;
        if (p2 != null) {
            p2.z(n, n2);
        }
    }
    
    public void setTypeface(Typeface typeface, final int n) {
        Typeface a;
        if (typeface != null && n > 0) {
            a = A.h.a(((View)this).getContext(), typeface, n);
        }
        else {
            a = null;
        }
        if (a != null) {
            typeface = a;
        }
        super.setTypeface(typeface, n);
    }
}
