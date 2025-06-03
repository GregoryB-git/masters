package g;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import e0.d0;
import e0.o0;
import e0.s0;
import io.meduza.meduza.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.f1;

/* loaded from: classes.dex */
public final class h implements e0.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f5614a;

    public h(g gVar) {
        this.f5614a = gVar;
    }

    public final s0 a(View view, s0 s0Var) {
        boolean z10;
        s0 s0Var2;
        boolean z11;
        Context context;
        int i10;
        int i11 = s0Var.f3823a.g().f16492b;
        g gVar = this.f5614a;
        gVar.getClass();
        int i12 = s0Var.f3823a.g().f16492b;
        ActionBarContextView actionBarContextView = gVar.D;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.D.getLayoutParams();
            if (gVar.D.isShown()) {
                if (gVar.f5568l0 == null) {
                    gVar.f5568l0 = new Rect();
                    gVar.f5569m0 = new Rect();
                }
                Rect rect = gVar.f5568l0;
                Rect rect2 = gVar.f5569m0;
                rect.set(s0Var.f3823a.g().f16491a, s0Var.f3823a.g().f16492b, s0Var.f3823a.g().f16493c, s0Var.f3823a.g().f16494d);
                ViewGroup viewGroup = gVar.J;
                Method method = f1.f9340a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i13 = rect.top;
                int i14 = rect.left;
                int i15 = rect.right;
                ViewGroup viewGroup2 = gVar.J;
                WeakHashMap<View, o0> weakHashMap = d0.f3766a;
                s0 a10 = d0.e.a(viewGroup2);
                int i16 = a10 == null ? 0 : a10.f3823a.g().f16491a;
                int i17 = a10 == null ? 0 : a10.f3823a.g().f16493c;
                if (marginLayoutParams.topMargin == i13 && marginLayoutParams.leftMargin == i14 && marginLayoutParams.rightMargin == i15) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i13;
                    marginLayoutParams.leftMargin = i14;
                    marginLayoutParams.rightMargin = i15;
                    z11 = true;
                }
                if (i13 <= 0 || gVar.L != null) {
                    View view2 = gVar.L;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i18 = marginLayoutParams2.height;
                        int i19 = marginLayoutParams.topMargin;
                        if (i18 != i19 || marginLayoutParams2.leftMargin != i16 || marginLayoutParams2.rightMargin != i17) {
                            marginLayoutParams2.height = i19;
                            marginLayoutParams2.leftMargin = i16;
                            marginLayoutParams2.rightMargin = i17;
                            gVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(gVar.f5574s);
                    gVar.L = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i16;
                    layoutParams.rightMargin = i17;
                    gVar.J.addView(gVar.L, -1, layoutParams);
                }
                View view4 = gVar.L;
                z10 = view4 != null;
                if (z10 && view4.getVisibility() != 0) {
                    View view5 = gVar.L;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        context = gVar.f5574s;
                        i10 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        context = gVar.f5574s;
                        i10 = R.color.abc_decor_view_status_guard;
                    }
                    view5.setBackgroundColor(v.a.getColor(context, i10));
                }
                if (!gVar.Q && z10) {
                    i12 = 0;
                }
                r10 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r10 = false;
            }
            if (r10) {
                gVar.D.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = gVar.L;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        if (i11 != i12) {
            int i20 = s0Var.f3823a.g().f16491a;
            int i21 = s0Var.f3823a.g().f16493c;
            int i22 = s0Var.f3823a.g().f16494d;
            int i23 = Build.VERSION.SDK_INT;
            s0.e dVar = i23 >= 30 ? new s0.d(s0Var) : i23 >= 29 ? new s0.c(s0Var) : new s0.b(s0Var);
            dVar.d(x.b.a(i20, i12, i21, i22));
            s0Var2 = dVar.b();
        } else {
            s0Var2 = s0Var;
        }
        WeakHashMap<View, o0> weakHashMap2 = d0.f3766a;
        WindowInsets b10 = s0Var2.b();
        if (b10 == null) {
            return s0Var2;
        }
        WindowInsets b11 = d0.c.b(view, b10);
        return !b11.equals(b10) ? s0.c(b11, view) : s0Var2;
    }
}
