package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import c0.c;
import j0.h;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import l.a0;

/* loaded from: classes.dex */
public class d0 extends TextView implements j0.j {

    /* renamed from: a, reason: collision with root package name */
    public final d f9303a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f9304b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f9305c;

    /* renamed from: d, reason: collision with root package name */
    public m f9306d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9307e;
    public b f;

    /* renamed from: o, reason: collision with root package name */
    public Future<c0.c> f9308o;

    public interface a {
        void a(int i10);

        void b(int i10);
    }

    public class b implements a {
        public b() {
        }

        @Override // l.d0.a
        public void a(int i10) {
        }

        @Override // l.d0.a
        public void b(int i10) {
        }
    }

    public class c extends b {
        public c() {
            super();
        }

        @Override // l.d0.b, l.d0.a
        public final void a(int i10) {
            d0.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // l.d0.b, l.d0.a
        public final void b(int i10) {
            d0.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public d0() {
        throw null;
    }

    public d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        w0.a(context);
        this.f9307e = false;
        this.f = null;
        u0.a(this, getContext());
        d dVar = new d(this);
        this.f9303a = dVar;
        dVar.d(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f9304b = b0Var;
        b0Var.f(attributeSet, i10);
        b0Var.b();
        this.f9305c = new a0(this);
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    private m getEmojiTextViewHelper() {
        if (this.f9306d == null) {
            this.f9306d = new m(this);
        }
        return this.f9306d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f9303a;
        if (dVar != null) {
            dVar.a();
        }
        b0 b0Var = this.f9304b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f1.f9341b) {
            return super.getAutoSizeMaxTextSize();
        }
        b0 b0Var = this.f9304b;
        if (b0Var != null) {
            return Math.round(b0Var.f9272i.f9326e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (f1.f9341b) {
            return super.getAutoSizeMinTextSize();
        }
        b0 b0Var = this.f9304b;
        if (b0Var != null) {
            return Math.round(b0Var.f9272i.f9325d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (f1.f9341b) {
            return super.getAutoSizeStepGranularity();
        }
        b0 b0Var = this.f9304b;
        if (b0Var != null) {
            return Math.round(b0Var.f9272i.f9324c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (f1.f9341b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        b0 b0Var = this.f9304b;
        return b0Var != null ? b0Var.f9272i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (f1.f9341b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        b0 b0Var = this.f9304b;
        if (b0Var != null) {
            return b0Var.f9272i.f9322a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j0.h.e(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        b bVar;
        if (this.f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                bVar = new c();
            } else if (i10 >= 26) {
                bVar = new b();
            }
            this.f = bVar;
        }
        return this.f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f9303a;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f9303a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9304b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9304b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<c0.c> future = this.f9308o;
        if (future != null) {
            try {
                this.f9308o = null;
                j0.h.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f9305c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = a0Var.f9261b;
        return textClassifier == null ? a0.a.a(a0Var.f9260a) : textClassifier;
    }

    public c.a getTextMetricsParamsCompat() {
        return j0.h.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f9304b.getClass();
        b0.h(this, onCreateInputConnection, editorInfo);
        b.a0.y(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b0 b0Var = this.f9304b;
        if (b0Var == null || f1.f9341b) {
            return;
        }
        b0Var.f9272i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future<c0.c> future = this.f9308o;
        if (future != null) {
            try {
                this.f9308o = null;
                j0.h.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((r1.i() && r1.f9322a != 0) != false) goto L15;
     */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
        /*
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            l.b0 r1 = r0.f9304b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            boolean r4 = l.f1.f9341b
            if (r4 != 0) goto L1f
            l.e0 r1 = r1.f9272i
            boolean r4 = r1.i()
            if (r4 == 0) goto L1b
            int r1 = r1.f9322a
            if (r1 == 0) goto L1b
            r1 = r2
            goto L1c
        L1b:
            r1 = r3
        L1c:
            if (r1 == 0) goto L1f
            goto L20
        L1f:
            r2 = r3
        L20:
            if (r2 == 0) goto L29
            l.b0 r1 = r0.f9304b
            l.e0 r1 = r1.f9272i
            r1.a()
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.d0.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (f1.f9341b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        b0 b0Var = this.f9304b;
        if (b0Var != null) {
            b0Var.i(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (f1.f9341b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        b0 b0Var = this.f9304b;
        if (b0Var != null) {
            b0Var.j(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (f1.f9341b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        b0 b0Var = this.f9304b;
        if (b0Var != null) {
            b0Var.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f9303a;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f9303a;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f9304b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f9304b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? x6.b.X(context, i10) : null, i11 != 0 ? x6.b.X(context, i11) : null, i12 != 0 ? x6.b.X(context, i12) : null, i13 != 0 ? x6.b.X(context, i13) : null);
        b0 b0Var = this.f9304b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? x6.b.X(context, i10) : null, i11 != 0 ? x6.b.X(context, i11) : null, i12 != 0 ? x6.b.X(context, i12) : null, i13 != 0 ? x6.b.X(context, i13) : null);
        b0 b0Var = this.f9304b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j0.h.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f9403b.f15196a.a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            j0.h.b(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i10);
        } else {
            j0.h.c(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i10 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(c0.c cVar) {
        j0.h.d(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f9303a;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f9303a;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    @Override // j0.j
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f9304b.l(colorStateList);
        this.f9304b.b();
    }

    @Override // j0.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f9304b.m(mode);
        this.f9304b.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f9304b;
        if (b0Var != null) {
            b0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f9305c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a0Var.f9261b = textClassifier;
        }
    }

    public void setTextFuture(Future<c0.c> future) {
        this.f9308o = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic = aVar.f2208b;
        int i10 = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i10 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i10 = 7;
            }
        }
        setTextDirection(i10);
        getPaint().set(aVar.f2207a);
        h.a.e(this, aVar.f2209c);
        h.a.h(this, aVar.f2210d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f) {
        boolean z10 = f1.f9341b;
        if (z10) {
            super.setTextSize(i10, f);
            return;
        }
        b0 b0Var = this.f9304b;
        if (b0Var == null || z10) {
            return;
        }
        e0 e0Var = b0Var.f9272i;
        if (e0Var.i() && e0Var.f9322a != 0) {
            return;
        }
        b0Var.f9272i.f(f, i10);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        if (this.f9307e) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i10 > 0) {
            Context context = getContext();
            x.l lVar = x.e.f16498a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i10);
        }
        this.f9307e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f9307e = false;
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f9304b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f9304b;
        if (b0Var != null) {
            b0Var.b();
        }
    }
}
