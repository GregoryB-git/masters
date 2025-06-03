/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.widget.AutoCompleteTextView
 *  android.widget.TextView
 *  java.lang.Object
 */
package l;

import L.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import g.a;
import l.T;
import l.U;
import l.X;
import l.d;
import l.f;
import l.v;

public abstract class c
extends AutoCompleteTextView {
    public static final int[] q = new int[]{16843126};
    public final d o;
    public final v p;

    public c(Context object, AttributeSet attributeSet, int n8) {
        super(U.b((Context)object), attributeSet, n8);
        T.a((View)this, this.getContext());
        object = X.s(this.getContext(), attributeSet, q, n8, 0);
        if (object.p(0)) {
            this.setDropDownBackgroundDrawable(object.f(0));
        }
        object.t();
        this.o = object = new d((View)this);
        object.e(attributeSet, n8);
        this.p = object = new v((TextView)this);
        object.m(attributeSet, n8);
        object.b();
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

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return f.a(super.onCreateInputConnection(editorInfo), editorInfo, (View)this);
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.m((TextView)this, callback));
    }

    public void setDropDownBackgroundResource(int n8) {
        this.setDropDownBackgroundDrawable(a.b(this.getContext(), n8));
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

    public void setTextAppearance(Context context, int n8) {
        super.setTextAppearance(context, n8);
        v v8 = this.p;
        if (v8 != null) {
            v8.q(context, n8);
        }
    }
}

