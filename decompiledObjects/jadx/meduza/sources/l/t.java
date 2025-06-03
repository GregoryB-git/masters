package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import io.meduza.meduza.R;

/* loaded from: classes.dex */
public final class t extends RadioButton implements j0.j {

    /* renamed from: a, reason: collision with root package name */
    public final i f9462a;

    /* renamed from: b, reason: collision with root package name */
    public final d f9463b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f9464c;

    /* renamed from: d, reason: collision with root package name */
    public m f9465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        w0.a(context);
        u0.a(this, getContext());
        i iVar = new i(this);
        this.f9462a = iVar;
        iVar.b(attributeSet, R.attr.radioButtonStyle);
        d dVar = new d(this);
        this.f9463b = dVar;
        dVar.d(attributeSet, R.attr.radioButtonStyle);
        b0 b0Var = new b0(this);
        this.f9464c = b0Var;
        b0Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private m getEmojiTextViewHelper() {
        if (this.f9465d == null) {
            this.f9465d = new m(this);
        }
        return this.f9465d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f9463b;
        if (dVar != null) {
            dVar.a();
        }
        b0 b0Var = this.f9464c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f9462a;
        if (iVar != null) {
            iVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f9463b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f9463b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f9462a;
        if (iVar != null) {
            return iVar.f9352b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f9462a;
        if (iVar != null) {
            return iVar.f9353c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9464c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9464c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f9463b;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f9463b;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(x6.b.X(getContext(), i10));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f9462a;
        if (iVar != null) {
            if (iVar.f) {
                iVar.f = false;
            } else {
                iVar.f = true;
                iVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f9464c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f9464c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f9403b.f15196a.a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f9463b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f9463b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f9462a;
        if (iVar != null) {
            iVar.f9352b = colorStateList;
            iVar.f9354d = true;
            iVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f9462a;
        if (iVar != null) {
            iVar.f9353c = mode;
            iVar.f9355e = true;
            iVar.a();
        }
    }

    @Override // j0.j
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f9464c.l(colorStateList);
        this.f9464c.b();
    }

    @Override // j0.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f9464c.m(mode);
        this.f9464c.b();
    }
}
