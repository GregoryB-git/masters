/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory2
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.fragment.app;

import H.e;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.fragment.app.k;
import androidx.fragment.app.n;
import androidx.lifecycle.u;

public class i {
    public final k a;

    public i(k k8) {
        this.a = k8;
    }

    public static i b(k k8) {
        return new i((k)e.c(k8, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        k k8 = this.a;
        k8.s.k(k8, k8, fragment);
    }

    public void c() {
        this.a.s.y();
    }

    public void d(Configuration configuration) {
        this.a.s.A(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.a.s.B(menuItem);
    }

    public void f() {
        this.a.s.C();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.a.s.D(menu, menuInflater);
    }

    public void h() {
        this.a.s.E();
    }

    public void i() {
        this.a.s.G();
    }

    public void j(boolean bl) {
        this.a.s.H(bl);
    }

    public boolean k(MenuItem menuItem) {
        return this.a.s.J(menuItem);
    }

    public void l(Menu menu) {
        this.a.s.K(menu);
    }

    public void m() {
        this.a.s.M();
    }

    public void n(boolean bl) {
        this.a.s.N(bl);
    }

    public boolean o(Menu menu) {
        return this.a.s.O(menu);
    }

    public void p() {
        this.a.s.Q();
    }

    public void q() {
        this.a.s.R();
    }

    public void r() {
        this.a.s.T();
    }

    public boolean s() {
        return this.a.s.a0(true);
    }

    public n t() {
        return this.a.s;
    }

    public void u() {
        this.a.s.P0();
    }

    public View v(View view, String string2, Context context, AttributeSet attributeSet) {
        return this.a.s.t0().onCreateView(view, string2, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        k k8 = this.a;
        if (k8 instanceof u) {
            k8.s.c1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable x() {
        return this.a.s.e1();
    }
}

