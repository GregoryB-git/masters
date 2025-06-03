package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import g.AbstractC1294a;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1504c extends AutoCompleteTextView {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f16436q = {R.attr.popupBackground};

    /* renamed from: o, reason: collision with root package name */
    public final C1505d f16437o;

    /* renamed from: p, reason: collision with root package name */
    public final C1522v f16438p;

    public AbstractC1504c(Context context, AttributeSet attributeSet, int i7) {
        super(U.b(context), attributeSet, i7);
        T.a(this, getContext());
        X s7 = X.s(getContext(), attributeSet, f16436q, i7, 0);
        if (s7.p(0)) {
            setDropDownBackgroundDrawable(s7.f(0));
        }
        s7.t();
        C1505d c1505d = new C1505d(this);
        this.f16437o = c1505d;
        c1505d.e(attributeSet, i7);
        C1522v c1522v = new C1522v(this);
        this.f16438p = c1522v;
        c1522v.m(attributeSet, i7);
        c1522v.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1505d c1505d = this.f16437o;
        if (c1505d != null) {
            c1505d.b();
        }
        C1522v c1522v = this.f16438p;
        if (c1522v != null) {
            c1522v.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1505d c1505d = this.f16437o;
        if (c1505d != null) {
            return c1505d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1505d c1505d = this.f16437o;
        if (c1505d != null) {
            return c1505d.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC1507f.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1505d c1505d = this.f16437o;
        if (c1505d != null) {
            c1505d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C1505d c1505d = this.f16437o;
        if (c1505d != null) {
            c1505d.g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(L.h.m(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i7) {
        setDropDownBackgroundDrawable(AbstractC1294a.b(getContext(), i7));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1505d c1505d = this.f16437o;
        if (c1505d != null) {
            c1505d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1505d c1505d = this.f16437o;
        if (c1505d != null) {
            c1505d.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C1522v c1522v = this.f16438p;
        if (c1522v != null) {
            c1522v.q(context, i7);
        }
    }
}
