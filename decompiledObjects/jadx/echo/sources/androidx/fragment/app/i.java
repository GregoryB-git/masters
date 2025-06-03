package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final k f9433a;

    public i(k kVar) {
        this.f9433a = kVar;
    }

    public static i b(k kVar) {
        return new i((k) H.e.c(kVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        k kVar = this.f9433a;
        kVar.f9439s.k(kVar, kVar, fragment);
    }

    public void c() {
        this.f9433a.f9439s.y();
    }

    public void d(Configuration configuration) {
        this.f9433a.f9439s.A(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f9433a.f9439s.B(menuItem);
    }

    public void f() {
        this.f9433a.f9439s.C();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f9433a.f9439s.D(menu, menuInflater);
    }

    public void h() {
        this.f9433a.f9439s.E();
    }

    public void i() {
        this.f9433a.f9439s.G();
    }

    public void j(boolean z7) {
        this.f9433a.f9439s.H(z7);
    }

    public boolean k(MenuItem menuItem) {
        return this.f9433a.f9439s.J(menuItem);
    }

    public void l(Menu menu) {
        this.f9433a.f9439s.K(menu);
    }

    public void m() {
        this.f9433a.f9439s.M();
    }

    public void n(boolean z7) {
        this.f9433a.f9439s.N(z7);
    }

    public boolean o(Menu menu) {
        return this.f9433a.f9439s.O(menu);
    }

    public void p() {
        this.f9433a.f9439s.Q();
    }

    public void q() {
        this.f9433a.f9439s.R();
    }

    public void r() {
        this.f9433a.f9439s.T();
    }

    public boolean s() {
        return this.f9433a.f9439s.a0(true);
    }

    public n t() {
        return this.f9433a.f9439s;
    }

    public void u() {
        this.f9433a.f9439s.P0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f9433a.f9439s.t0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        k kVar = this.f9433a;
        if (!(kVar instanceof androidx.lifecycle.u)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        kVar.f9439s.c1(parcelable);
    }

    public Parcelable x() {
        return this.f9433a.f9439s.e1();
    }
}
