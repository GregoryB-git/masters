// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import androidx.lifecycle.u;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.content.res.Configuration;
import H.e;

public class i
{
    public final k a;
    
    public i(final k a) {
        this.a = a;
    }
    
    public static i b(final k k) {
        return new i((k)e.c(k, "callbacks == null"));
    }
    
    public void a(final Fragment fragment) {
        final k a = this.a;
        a.s.k(a, a, fragment);
    }
    
    public void c() {
        this.a.s.y();
    }
    
    public void d(final Configuration configuration) {
        this.a.s.A(configuration);
    }
    
    public boolean e(final MenuItem menuItem) {
        return this.a.s.B(menuItem);
    }
    
    public void f() {
        this.a.s.C();
    }
    
    public boolean g(final Menu menu, final MenuInflater menuInflater) {
        return this.a.s.D(menu, menuInflater);
    }
    
    public void h() {
        this.a.s.E();
    }
    
    public void i() {
        this.a.s.G();
    }
    
    public void j(final boolean b) {
        this.a.s.H(b);
    }
    
    public boolean k(final MenuItem menuItem) {
        return this.a.s.J(menuItem);
    }
    
    public void l(final Menu menu) {
        this.a.s.K(menu);
    }
    
    public void m() {
        this.a.s.M();
    }
    
    public void n(final boolean b) {
        this.a.s.N(b);
    }
    
    public boolean o(final Menu menu) {
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
    
    public View v(final View view, final String s, final Context context, final AttributeSet set) {
        return this.a.s.t0().onCreateView(view, s, context, set);
    }
    
    public void w(final Parcelable parcelable) {
        final k a = this.a;
        if (a instanceof u) {
            a.s.c1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }
    
    public Parcelable x() {
        return this.a.s.e1();
    }
}
