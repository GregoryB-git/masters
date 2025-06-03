package b;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import b1.k;

/* loaded from: classes.dex */
public class l extends Dialog implements b1.o, y, s1.e {

    /* renamed from: a, reason: collision with root package name */
    public b1.p f1616a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.d f1617b;

    /* renamed from: c, reason: collision with root package name */
    public final w f1618c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, int i10) {
        super(context, i10);
        ec.i.e(context, "context");
        this.f1617b = new s1.d(this);
        this.f1618c = new w(new k(this, 0));
    }

    public static void a(l lVar) {
        ec.i.e(lVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ec.i.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        ec.i.b(window);
        View decorView = window.getDecorView();
        ec.i.d(decorView, "window!!.decorView");
        a0.G(decorView, this);
        Window window2 = getWindow();
        ec.i.b(window2);
        View decorView2 = window2.getDecorView();
        ec.i.d(decorView2, "window!!.decorView");
        a0.F(decorView2, this);
        Window window3 = getWindow();
        ec.i.b(window3);
        View decorView3 = window3.getDecorView();
        ec.i.d(decorView3, "window!!.decorView");
        a0.H(decorView3, this);
    }

    @Override // b1.o
    public final b1.k getLifecycle() {
        b1.p pVar = this.f1616a;
        if (pVar != null) {
            return pVar;
        }
        b1.p pVar2 = new b1.p(this);
        this.f1616a = pVar2;
        return pVar2;
    }

    @Override // b.y
    public final w getOnBackPressedDispatcher() {
        return this.f1618c;
    }

    @Override // s1.e
    public final s1.c getSavedStateRegistry() {
        return this.f1617b.f14147b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1618c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            w wVar = this.f1618c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            ec.i.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            wVar.getClass();
            wVar.f = onBackInvokedDispatcher;
            wVar.c(wVar.f1643h);
        }
        this.f1617b.b(bundle);
        b1.p pVar = this.f1616a;
        if (pVar == null) {
            pVar = new b1.p(this);
            this.f1616a = pVar;
        }
        pVar.f(k.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        ec.i.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1617b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        b1.p pVar = this.f1616a;
        if (pVar == null) {
            pVar = new b1.p(this);
            this.f1616a = pVar;
        }
        pVar.f(k.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b1.p pVar = this.f1616a;
        if (pVar == null) {
            pVar = new b1.p(this);
            this.f1616a = pVar;
        }
        pVar.f(k.a.ON_DESTROY);
        this.f1616a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        b();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        ec.i.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ec.i.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
