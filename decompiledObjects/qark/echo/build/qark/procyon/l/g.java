// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.net.Uri;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageButton;

public class g extends ImageButton
{
    public final d o;
    public final h p;
    
    public g(final Context context, final AttributeSet set, final int n) {
        super(U.b(context), set, n);
        T.a((View)this, ((View)this).getContext());
        (this.o = new d((View)this)).e(set, n);
        (this.p = new h((ImageView)this)).f(set, n);
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final d o = this.o;
        if (o != null) {
            o.b();
        }
        final h p = this.p;
        if (p != null) {
            p.b();
        }
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
    
    public ColorStateList getSupportImageTintList() {
        final h p = this.p;
        if (p != null) {
            return p.c();
        }
        return null;
    }
    
    public PorterDuff$Mode getSupportImageTintMode() {
        final h p = this.p;
        if (p != null) {
            return p.d();
        }
        return null;
    }
    
    public boolean hasOverlappingRendering() {
        return this.p.e() && super.hasOverlappingRendering();
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
    
    public void setImageBitmap(final Bitmap imageBitmap) {
        super.setImageBitmap(imageBitmap);
        final h p = this.p;
        if (p != null) {
            p.b();
        }
    }
    
    public void setImageDrawable(final Drawable imageDrawable) {
        super.setImageDrawable(imageDrawable);
        final h p = this.p;
        if (p != null) {
            p.b();
        }
    }
    
    public void setImageResource(final int n) {
        this.p.g(n);
    }
    
    public void setImageURI(final Uri imageURI) {
        super.setImageURI(imageURI);
        final h p = this.p;
        if (p != null) {
            p.b();
        }
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
    
    public void setSupportImageTintList(final ColorStateList list) {
        final h p = this.p;
        if (p != null) {
            p.h(list);
        }
    }
    
    public void setSupportImageTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final h p = this.p;
        if (p != null) {
            p.i(porterDuff$Mode);
        }
    }
}
