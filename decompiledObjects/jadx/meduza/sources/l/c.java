package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class c extends AutoCompleteTextView implements j0.j {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9281d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final d f9282a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f9283b;

    /* renamed from: c, reason: collision with root package name */
    public final l f9284c;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, io.meduza.meduza.R.attr.autoCompleteTextViewStyle);
        w0.a(context);
        u0.a(this, getContext());
        z0 m10 = z0.m(getContext(), attributeSet, f9281d, io.meduza.meduza.R.attr.autoCompleteTextViewStyle);
        if (m10.l(0)) {
            setDropDownBackgroundDrawable(m10.e(0));
        }
        m10.n();
        d dVar = new d(this);
        this.f9282a = dVar;
        dVar.d(attributeSet, io.meduza.meduza.R.attr.autoCompleteTextViewStyle);
        b0 b0Var = new b0(this);
        this.f9283b = b0Var;
        b0Var.f(attributeSet, io.meduza.meduza.R.attr.autoCompleteTextViewStyle);
        b0Var.b();
        l lVar = new l(this);
        this.f9284c = lVar;
        lVar.c(attributeSet, io.meduza.meduza.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener b10 = lVar.b(keyListener);
            if (b10 == keyListener) {
                return;
            }
            super.setKeyListener(b10);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f9282a;
        if (dVar != null) {
            dVar.a();
        }
        b0 b0Var = this.f9283b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j0.h.e(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f9282a;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f9282a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9283b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9283b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.a0.y(this, editorInfo, onCreateInputConnection);
        return this.f9284c.d(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f9282a;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f9282a;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f9283b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f9283b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j0.h.f(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(x6.b.X(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f9284c.g(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f9284c.b(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f9282a;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f9282a;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    @Override // j0.j
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f9283b.l(colorStateList);
        this.f9283b.b();
    }

    @Override // j0.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f9283b.m(mode);
        this.f9283b.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f9283b;
        if (b0Var != null) {
            b0Var.g(context, i10);
        }
    }
}
