package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import b.a0;
import g.g;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: g.a$a, reason: collision with other inner class name */
    public static class C0088a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f5540a;

        public C0088a() {
            super(-2, -2);
            this.f5540a = 8388627;
        }

        public C0088a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5540a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f1574o);
            this.f5540a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0088a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5540a = 0;
        }

        public C0088a(C0088a c0088a) {
            super((ViewGroup.MarginLayoutParams) c0088a);
            this.f5540a = 0;
            this.f5540a = c0088a.f5540a;
        }
    }

    public interface b {
        void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z10);

    public abstract int d();

    public abstract Context e();

    public abstract void f();

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i();

    public void j() {
    }

    public abstract boolean k(int i10, KeyEvent keyEvent);

    public boolean l(KeyEvent keyEvent) {
        return false;
    }

    public boolean m() {
        return false;
    }

    public abstract void n(ColorDrawable colorDrawable);

    public abstract void o(boolean z10);

    public abstract void p(boolean z10);

    public abstract void q(boolean z10);

    public abstract void r(CharSequence charSequence);

    public abstract void s(CharSequence charSequence);

    public abstract void t();

    public j.a u(g.e eVar) {
        return null;
    }
}
