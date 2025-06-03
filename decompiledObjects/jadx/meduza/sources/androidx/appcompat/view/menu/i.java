package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import e0.d0;
import e0.o0;
import io.meduza.meduza.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f716a;

    /* renamed from: b, reason: collision with root package name */
    public final f f717b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f718c;

    /* renamed from: d, reason: collision with root package name */
    public final int f719d;

    /* renamed from: e, reason: collision with root package name */
    public final int f720e;
    public View f;

    /* renamed from: g, reason: collision with root package name */
    public int f721g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f722h;

    /* renamed from: i, reason: collision with root package name */
    public j.a f723i;

    /* renamed from: j, reason: collision with root package name */
    public k.d f724j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f725k;

    /* renamed from: l, reason: collision with root package name */
    public final a f726l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public i(int i10, int i11, Context context, View view, f fVar, boolean z10) {
        this.f721g = 8388611;
        this.f726l = new a();
        this.f716a = context;
        this.f717b = fVar;
        this.f = view;
        this.f718c = z10;
        this.f719d = i10;
        this.f720e = i11;
    }

    public i(Context context, f fVar, View view, boolean z10) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, fVar, z10);
    }

    public final k.d a() {
        k.d lVar;
        if (this.f724j == null) {
            Display defaultDisplay = ((WindowManager) this.f716a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            b.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= this.f716a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                lVar = new androidx.appcompat.view.menu.b(this.f716a, this.f, this.f719d, this.f720e, this.f718c);
            } else {
                lVar = new l(this.f719d, this.f720e, this.f716a, this.f, this.f717b, this.f718c);
            }
            lVar.k(this.f717b);
            lVar.q(this.f726l);
            lVar.m(this.f);
            lVar.d(this.f723i);
            lVar.n(this.f722h);
            lVar.o(this.f721g);
            this.f724j = lVar;
        }
        return this.f724j;
    }

    public final boolean b() {
        k.d dVar = this.f724j;
        return dVar != null && dVar.a();
    }

    public void c() {
        this.f724j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f725k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        k.d a10 = a();
        a10.r(z11);
        if (z10) {
            int i12 = this.f721g;
            View view = this.f;
            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
            if ((Gravity.getAbsoluteGravity(i12, view.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f.getWidth();
            }
            a10.p(i10);
            a10.s(i11);
            int i13 = (int) ((this.f716a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f8815a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a10.show();
    }
}
