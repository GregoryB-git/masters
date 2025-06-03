package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import e.AbstractC1238i;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1510i extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f16463b = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f16464a;

    public C1510i(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        a(context, attributeSet, i7, i8);
    }

    public final void a(Context context, AttributeSet attributeSet, int i7, int i8) {
        X s7 = X.s(context, attributeSet, AbstractC1238i.f13655w1, i7, i8);
        if (s7.p(AbstractC1238i.f13663y1)) {
            b(s7.a(AbstractC1238i.f13663y1, false));
        }
        setBackgroundDrawable(s7.f(AbstractC1238i.f13659x1));
        s7.t();
    }

    public final void b(boolean z7) {
        if (f16463b) {
            this.f16464a = z7;
        } else {
            L.g.a(this, z7);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i7, int i8) {
        if (f16463b && this.f16464a) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i7, i8);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i7, int i8, int i9, int i10) {
        if (f16463b && this.f16464a) {
            i8 -= view.getHeight();
        }
        super.update(view, i7, i8, i9, i10);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i7, int i8, int i9) {
        if (f16463b && this.f16464a) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i7, i8, i9);
    }
}
