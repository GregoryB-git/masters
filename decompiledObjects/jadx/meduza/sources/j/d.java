package j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import j.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d extends a implements f.a {

    /* renamed from: c, reason: collision with root package name */
    public Context f8198c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f8199d;

    /* renamed from: e, reason: collision with root package name */
    public a.InterfaceC0121a f8200e;
    public WeakReference<View> f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8201o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.appcompat.view.menu.f f8202p;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0121a interfaceC0121a) {
        this.f8198c = context;
        this.f8199d = actionBarContextView;
        this.f8200e = interfaceC0121a;
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(actionBarContextView.getContext());
        fVar.f675l = 1;
        this.f8202p = fVar;
        fVar.f669e = this;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        return this.f8200e.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        i();
        androidx.appcompat.widget.a aVar = this.f8199d.f9253d;
        if (aVar != null) {
            aVar.l();
        }
    }

    @Override // j.a
    public final void c() {
        if (this.f8201o) {
            return;
        }
        this.f8201o = true;
        this.f8200e.b(this);
    }

    @Override // j.a
    public final View d() {
        WeakReference<View> weakReference = this.f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // j.a
    public final androidx.appcompat.view.menu.f e() {
        return this.f8202p;
    }

    @Override // j.a
    public final MenuInflater f() {
        return new f(this.f8199d.getContext());
    }

    @Override // j.a
    public final CharSequence g() {
        return this.f8199d.getSubtitle();
    }

    @Override // j.a
    public final CharSequence h() {
        return this.f8199d.getTitle();
    }

    @Override // j.a
    public final void i() {
        this.f8200e.c(this, this.f8202p);
    }

    @Override // j.a
    public final boolean j() {
        return this.f8199d.A;
    }

    @Override // j.a
    public final void k(View view) {
        this.f8199d.setCustomView(view);
        this.f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // j.a
    public final void l(int i10) {
        m(this.f8198c.getString(i10));
    }

    @Override // j.a
    public final void m(CharSequence charSequence) {
        this.f8199d.setSubtitle(charSequence);
    }

    @Override // j.a
    public final void n(int i10) {
        o(this.f8198c.getString(i10));
    }

    @Override // j.a
    public final void o(CharSequence charSequence) {
        this.f8199d.setTitle(charSequence);
    }

    @Override // j.a
    public final void p(boolean z10) {
        this.f8192b = z10;
        this.f8199d.setTitleOptional(z10);
    }
}
