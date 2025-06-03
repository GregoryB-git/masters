package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import l.C1505d;
import l.C1509h;
import l.T;
import l.U;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: o, reason: collision with root package name */
    public final C1505d f8612o;

    /* renamed from: p, reason: collision with root package name */
    public final C1509h f8613p;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1505d c1505d = this.f8612o;
        if (c1505d != null) {
            c1505d.b();
        }
        C1509h c1509h = this.f8613p;
        if (c1509h != null) {
            c1509h.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1505d c1505d = this.f8612o;
        if (c1505d != null) {
            return c1505d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1505d c1505d = this.f8612o;
        if (c1505d != null) {
            return c1505d.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1509h c1509h = this.f8613p;
        if (c1509h != null) {
            return c1509h.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1509h c1509h = this.f8613p;
        if (c1509h != null) {
            return c1509h.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f8613p.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1505d c1505d = this.f8612o;
        if (c1505d != null) {
            c1505d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C1505d c1505d = this.f8612o;
        if (c1505d != null) {
            c1505d.g(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1509h c1509h = this.f8613p;
        if (c1509h != null) {
            c1509h.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C1509h c1509h = this.f8613p;
        if (c1509h != null) {
            c1509h.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        C1509h c1509h = this.f8613p;
        if (c1509h != null) {
            c1509h.g(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1509h c1509h = this.f8613p;
        if (c1509h != null) {
            c1509h.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1505d c1505d = this.f8612o;
        if (c1505d != null) {
            c1505d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1505d c1505d = this.f8612o;
        if (c1505d != null) {
            c1505d.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1509h c1509h = this.f8613p;
        if (c1509h != null) {
            c1509h.h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1509h c1509h = this.f8613p;
        if (c1509h != null) {
            c1509h.i(mode);
        }
    }

    public AppCompatImageView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i7) {
        super(U.b(context), attributeSet, i7);
        T.a(this, getContext());
        C1505d c1505d = new C1505d(this);
        this.f8612o = c1505d;
        c1505d.e(attributeSet, i7);
        C1509h c1509h = new C1509h(this);
        this.f8613p = c1509h;
        c1509h.f(attributeSet, i7);
    }
}
