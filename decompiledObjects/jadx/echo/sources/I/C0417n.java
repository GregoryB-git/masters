package I;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: I.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0417n {

    /* renamed from: a, reason: collision with root package name */
    public int f2429a;

    /* renamed from: b, reason: collision with root package name */
    public int f2430b;

    public C0417n(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f2429a | this.f2430b;
    }

    public void b(View view, View view2, int i7) {
        c(view, view2, i7, 0);
    }

    public void c(View view, View view2, int i7, int i8) {
        if (i8 == 1) {
            this.f2430b = i7;
        } else {
            this.f2429a = i7;
        }
    }

    public void d(View view, int i7) {
        if (i7 == 1) {
            this.f2430b = 0;
        } else {
            this.f2429a = 0;
        }
    }
}
