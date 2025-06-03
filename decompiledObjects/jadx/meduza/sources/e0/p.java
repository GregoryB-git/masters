package e0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f3814a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f3815b;

    /* renamed from: c, reason: collision with root package name */
    public final View f3816c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3817d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3818e;

    public p(View view) {
        this.f3816c = view;
    }

    public final boolean a(float f, float f10, boolean z10) {
        ViewParent f11;
        if (!this.f3817d || (f11 = f(0)) == null) {
            return false;
        }
        try {
            return l0.a(f11, this.f3816c, f, f10, z10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f11 + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public final boolean b(float f, float f10) {
        ViewParent f11;
        if (!this.f3817d || (f11 = f(0)) == null) {
            return false;
        }
        try {
            return l0.b(f11, this.f3816c, f, f10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f11 + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public final boolean c(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent f;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f3817d || (f = f(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f3816c.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f3818e == null) {
                this.f3818e = new int[2];
            }
            iArr3 = this.f3818e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = this.f3816c;
        if (f instanceof q) {
            ((q) f).onNestedPreScroll(view, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                l0.c(f, view, i10, i11, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            this.f3816c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void d(int i10, int i11, int i12, int[] iArr) {
        e(0, i10, 0, i11, null, i12, iArr);
    }

    public final boolean e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent f;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.f3817d || (f = f(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f3816c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            if (this.f3818e == null) {
                this.f3818e = new int[2];
            }
            int[] iArr4 = this.f3818e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f3816c;
        if (f instanceof r) {
            ((r) f).onNestedScroll(view, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (f instanceof q) {
                ((q) f).onNestedScroll(view, i10, i11, i12, i13, i14);
            } else if (i14 == 0) {
                try {
                    l0.d(f, view, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr != null) {
            this.f3816c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    public final ViewParent f(int i10) {
        if (i10 == 0) {
            return this.f3814a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f3815b;
    }

    public final boolean g(int i10, int i11) {
        boolean f;
        if (f(i11) != null) {
            return true;
        }
        if (this.f3817d) {
            View view = this.f3816c;
            for (ViewParent parent = this.f3816c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f3816c;
                boolean z10 = parent instanceof q;
                if (z10) {
                    f = ((q) parent).onStartNestedScroll(view, view2, i10, i11);
                } else {
                    if (i11 == 0) {
                        try {
                            f = l0.f(parent, view, view2, i10);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        }
                    }
                    f = false;
                }
                if (f) {
                    if (i11 == 0) {
                        this.f3814a = parent;
                    } else if (i11 == 1) {
                        this.f3815b = parent;
                    }
                    View view3 = this.f3816c;
                    if (z10) {
                        ((q) parent).onNestedScrollAccepted(view, view3, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            l0.e(parent, view, view3, i10);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i10) {
        ViewParent f = f(i10);
        if (f != null) {
            View view = this.f3816c;
            if (f instanceof q) {
                ((q) f).onStopNestedScroll(view, i10);
            } else if (i10 == 0) {
                try {
                    l0.g(f, view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 == 0) {
                this.f3814a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f3815b = null;
            }
        }
    }
}
