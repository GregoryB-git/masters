package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import io.meduza.meduza.R;

/* loaded from: classes.dex */
public final class e extends Button implements j0.j {

    /* renamed from: a, reason: collision with root package name */
    public final d f9317a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f9318b;

    /* renamed from: c, reason: collision with root package name */
    public m f9319c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        w0.a(context);
        u0.a(this, getContext());
        d dVar = new d(this);
        this.f9317a = dVar;
        dVar.d(attributeSet, R.attr.buttonStyle);
        b0 b0Var = new b0(this);
        this.f9318b = b0Var;
        b0Var.f(attributeSet, R.attr.buttonStyle);
        b0Var.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyle);
    }

    private m getEmojiTextViewHelper() {
        if (this.f9319c == null) {
            this.f9319c = new m(this);
        }
        return this.f9319c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f9317a;
        if (dVar != null) {
            dVar.a();
        }
        b0 b0Var = this.f9318b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f1.f9341b) {
            return super.getAutoSizeMaxTextSize();
        }
        b0 b0Var = this.f9318b;
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
        b0 b0Var = this.f9318b;
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
        b0 b0Var = this.f9318b;
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
        b0 b0Var = this.f9318b;
        return b0Var != null ? b0Var.f9272i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (f1.f9341b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        b0 b0Var = this.f9318b;
        if (b0Var != null) {
            return b0Var.f9272i.f9322a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j0.h.e(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f9317a;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f9317a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9318b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9318b.e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b0 b0Var = this.f9318b;
        if (b0Var == null || f1.f9341b) {
            return;
        }
        b0Var.f9272i.a();
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
            l.b0 r1 = r0.f9318b
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
            l.b0 r1 = r0.f9318b
            l.e0 r1 = r1.f9272i
            r1.a()
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.e.onTextChanged(java.lang.CharSequence, int, int, int):void");
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
        b0 b0Var = this.f9318b;
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
        b0 b0Var = this.f9318b;
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
        b0 b0Var = this.f9318b;
        if (b0Var != null) {
            b0Var.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f9317a;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f9317a;
        if (dVar != null) {
            dVar.f(i10);
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

    public void setSupportAllCaps(boolean z10) {
        b0 b0Var = this.f9318b;
        if (b0Var != null) {
            b0Var.f9265a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f9317a;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f9317a;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    @Override // j0.j
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f9318b.l(colorStateList);
        this.f9318b.b();
    }

    @Override // j0.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f9318b.m(mode);
        this.f9318b.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f9318b;
        if (b0Var != null) {
            b0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f) {
        boolean z10 = f1.f9341b;
        if (z10) {
            super.setTextSize(i10, f);
            return;
        }
        b0 b0Var = this.f9318b;
        if (b0Var == null || z10) {
            return;
        }
        e0 e0Var = b0Var.f9272i;
        if (e0Var.i() && e0Var.f9322a != 0) {
            return;
        }
        b0Var.f9272i.f(f, i10);
    }
}
