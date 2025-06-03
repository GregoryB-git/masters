// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import g.a;
import L.h;
import android.view.ActionMode$Callback;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.AutoCompleteTextView;

public abstract class c extends AutoCompleteTextView
{
    public static final int[] q;
    public final d o;
    public final v p;
    
    static {
        q = new int[] { 16843126 };
    }
    
    public c(final Context context, final AttributeSet set, final int n) {
        super(U.b(context), set, n);
        T.a((View)this, ((View)this).getContext());
        final X s = X.s(((View)this).getContext(), set, c.q, n, 0);
        if (s.p(0)) {
            this.setDropDownBackgroundDrawable(s.f(0));
        }
        s.t();
        (this.o = new d((View)this)).e(set, n);
        final v p3 = new v((TextView)this);
        (this.p = p3).m(set, n);
        p3.b();
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final d o = this.o;
        if (o != null) {
            o.b();
        }
        final v p = this.p;
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
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        return f.a(super.onCreateInputConnection(editorInfo), editorInfo, (View)this);
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
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(h.m((TextView)this, actionMode$Callback));
    }
    
    public void setDropDownBackgroundResource(final int n) {
        this.setDropDownBackgroundDrawable(a.b(((View)this).getContext(), n));
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
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final v p2 = this.p;
        if (p2 != null) {
            p2.q(context, n);
        }
    }
}
