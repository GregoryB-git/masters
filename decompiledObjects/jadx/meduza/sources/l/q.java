package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes.dex */
public final class q extends MultiAutoCompleteTextView implements j0.j {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9439d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final d f9440a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f9441b;

    /* renamed from: c, reason: collision with root package name */
    public final l f9442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, io.meduza.meduza.R.attr.autoCompleteTextViewStyle);
        w0.a(context);
        u0.a(this, getContext());
        z0 m10 = z0.m(getContext(), attributeSet, f9439d, io.meduza.meduza.R.attr.autoCompleteTextViewStyle);
        if (m10.l(0)) {
            setDropDownBackgroundDrawable(m10.e(0));
        }
        m10.n();
        d dVar = new d(this);
        this.f9440a = dVar;
        dVar.d(attributeSet, io.meduza.meduza.R.attr.autoCompleteTextViewStyle);
        b0 b0Var = new b0(this);
        this.f9441b = b0Var;
        b0Var.f(attributeSet, io.meduza.meduza.R.attr.autoCompleteTextViewStyle);
        b0Var.b();
        l lVar = new l(this);
        this.f9442c = lVar;
        lVar.c(attributeSet, io.meduza.meduza.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener b10 = lVar.b(keyListener);
            if (b10 == keyListener) {
                return;
            }
            super.setKeyListener(b10);
            setRawInputType(inputType);
            setFocusable(isFocusable);
            setClickable(isClickable);
            setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f9440a;
        if (dVar != null) {
            dVar.a();
        }
        b0 b0Var = this.f9441b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f9440a;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f9440a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9441b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9441b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.a0.y(this, editorInfo, onCreateInputConnection);
        return this.f9442c.d(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f9440a;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f9440a;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f9441b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f9441b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(x6.b.X(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f9442c.g(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f9442c.b(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f9440a;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f9440a;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    @Override // j0.j
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f9441b.l(colorStateList);
        this.f9441b.b();
    }

    @Override // j0.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f9441b.m(mode);
        this.f9441b.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f9441b;
        if (b0Var != null) {
            b0Var.g(context, i10);
        }
    }
}
