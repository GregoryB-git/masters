package I;

import android.view.View;
import android.view.ViewParent;

/* renamed from: I.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0414k {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f2424a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f2425b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2426c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2427d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f2428e;

    public C0414k(View view) {
        this.f2426c = view;
    }

    public boolean a(float f7, float f8, boolean z7) {
        ViewParent g7;
        if (!j() || (g7 = g(0)) == null) {
            return false;
        }
        return AbstractC0425w.a(g7, this.f2426c, f7, f8, z7);
    }

    public boolean b(float f7, float f8) {
        ViewParent g7;
        if (!j() || (g7 = g(0)) == null) {
            return false;
        }
        return AbstractC0425w.b(g7, this.f2426c, f7, f8);
    }

    public boolean c(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        ViewParent g7;
        int i10;
        int i11;
        if (!j() || (g7 = g(i9)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f2426c.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            iArr = h();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        AbstractC0425w.c(g7, this.f2426c, i7, i8, iArr, i9);
        if (iArr2 != null) {
            this.f2426c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void d(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        f(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    public boolean e(int i7, int i8, int i9, int i10, int[] iArr) {
        return f(i7, i8, i9, i10, iArr, 0, null);
    }

    public final boolean f(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        ViewParent g7;
        int i12;
        int i13;
        int[] iArr3;
        if (!j() || (g7 = g(i11)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2426c.getLocationInWindow(iArr);
            i12 = iArr[0];
            i13 = iArr[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr2 == null) {
            int[] h7 = h();
            h7[0] = 0;
            h7[1] = 0;
            iArr3 = h7;
        } else {
            iArr3 = iArr2;
        }
        AbstractC0425w.d(g7, this.f2426c, i7, i8, i9, i10, i11, iArr3);
        if (iArr != null) {
            this.f2426c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i12;
            iArr[1] = iArr[1] - i13;
        }
        return true;
    }

    public final ViewParent g(int i7) {
        if (i7 == 0) {
            return this.f2424a;
        }
        if (i7 != 1) {
            return null;
        }
        return this.f2425b;
    }

    public final int[] h() {
        if (this.f2428e == null) {
            this.f2428e = new int[2];
        }
        return this.f2428e;
    }

    public boolean i(int i7) {
        return g(i7) != null;
    }

    public boolean j() {
        return this.f2427d;
    }

    public void k(boolean z7) {
        if (this.f2427d) {
            AbstractC0421s.L(this.f2426c);
        }
        this.f2427d = z7;
    }

    public final void l(int i7, ViewParent viewParent) {
        if (i7 == 0) {
            this.f2424a = viewParent;
        } else {
            if (i7 != 1) {
                return;
            }
            this.f2425b = viewParent;
        }
    }

    public boolean m(int i7, int i8) {
        if (i(i8)) {
            return true;
        }
        if (!j()) {
            return false;
        }
        View view = this.f2426c;
        for (ViewParent parent = this.f2426c.getParent(); parent != null; parent = parent.getParent()) {
            if (AbstractC0425w.f(parent, view, this.f2426c, i7, i8)) {
                l(i8, parent);
                AbstractC0425w.e(parent, view, this.f2426c, i7, i8);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void n(int i7) {
        ViewParent g7 = g(i7);
        if (g7 != null) {
            AbstractC0425w.g(g7, this.f2426c, i7);
            l(i7, null);
        }
    }
}
