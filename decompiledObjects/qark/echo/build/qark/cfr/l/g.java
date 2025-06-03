/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  java.lang.Object
 */
package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import l.T;
import l.U;
import l.d;
import l.h;

public class g
extends ImageButton {
    public final d o;
    public final h p;

    public g(Context object, AttributeSet attributeSet, int n8) {
        super(U.b((Context)object), attributeSet, n8);
        T.a((View)this, this.getContext());
        this.o = object = new d((View)this);
        object.e(attributeSet, n8);
        this.p = object = new h((ImageView)this);
        object.f(attributeSet, n8);
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

    public ColorStateList getSupportImageTintList() {
        h h8 = this.p;
        if (h8 != null) {
            return h8.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        h h8 = this.p;
        if (h8 != null) {
            return h8.d();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        if (this.p.e() && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
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

    public void setImageBitmap(Bitmap object) {
        super.setImageBitmap((Bitmap)object);
        object = this.p;
        if (object != null) {
            object.b();
        }
    }

    public void setImageDrawable(Drawable object) {
        super.setImageDrawable((Drawable)object);
        object = this.p;
        if (object != null) {
            object.b();
        }
    }

    public void setImageResource(int n8) {
        this.p.g(n8);
    }

    public void setImageURI(Uri object) {
        super.setImageURI((Uri)object);
        object = this.p;
        if (object != null) {
            object.b();
        }
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

    public void setSupportImageTintList(ColorStateList colorStateList) {
        h h8 = this.p;
        if (h8 != null) {
            h8.h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        h h8 = this.p;
        if (h8 != null) {
            h8.i(mode);
        }
    }
}

