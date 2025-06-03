package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes.dex */
public final class n extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final d f9405a;

    /* renamed from: b, reason: collision with root package name */
    public final o f9406b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9407c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        w0.a(context);
        this.f9407c = false;
        u0.a(this, getContext());
        d dVar = new d(this);
        this.f9405a = dVar;
        dVar.d(attributeSet, i10);
        o oVar = new o(this);
        this.f9406b = oVar;
        oVar.b(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f9405a;
        if (dVar != null) {
            dVar.a();
        }
        o oVar = this.f9406b;
        if (oVar != null) {
            oVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f9405a;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f9405a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        x0 x0Var;
        o oVar = this.f9406b;
        if (oVar == null || (x0Var = oVar.f9430b) == null) {
            return null;
        }
        return x0Var.f9492a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        x0 x0Var;
        o oVar = this.f9406b;
        if (oVar == null || (x0Var = oVar.f9430b) == null) {
            return null;
        }
        return x0Var.f9493b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((this.f9406b.f9429a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f9405a;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f9405a;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        o oVar = this.f9406b;
        if (oVar != null) {
            oVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        o oVar = this.f9406b;
        if (oVar != null && drawable != null && !this.f9407c) {
            oVar.f9431c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        o oVar2 = this.f9406b;
        if (oVar2 != null) {
            oVar2.a();
            if (this.f9407c) {
                return;
            }
            o oVar3 = this.f9406b;
            if (oVar3.f9429a.getDrawable() != null) {
                oVar3.f9429a.getDrawable().setLevel(oVar3.f9431c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f9407c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f9406b.c(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        o oVar = this.f9406b;
        if (oVar != null) {
            oVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f9405a;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f9405a;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        o oVar = this.f9406b;
        if (oVar != null) {
            if (oVar.f9430b == null) {
                oVar.f9430b = new x0();
            }
            x0 x0Var = oVar.f9430b;
            x0Var.f9492a = colorStateList;
            x0Var.f9495d = true;
            oVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        o oVar = this.f9406b;
        if (oVar != null) {
            if (oVar.f9430b == null) {
                oVar.f9430b = new x0();
            }
            x0 x0Var = oVar.f9430b;
            x0Var.f9493b = mode;
            x0Var.f9494c = true;
            oVar.a();
        }
    }
}
