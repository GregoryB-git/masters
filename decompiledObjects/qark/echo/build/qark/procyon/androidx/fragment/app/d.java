// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import android.os.BaseBundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.Window;
import android.content.Context;
import android.app.Activity;
import android.os.Looper;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import androidx.lifecycle.h;
import android.content.DialogInterface;
import android.app.Dialog;
import androidx.lifecycle.m;
import android.os.Handler;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;

public class d extends Fragment implements DialogInterface$OnCancelListener, DialogInterface$OnDismissListener
{
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public Handler o0;
    public Runnable p0;
    public DialogInterface$OnCancelListener q0;
    public DialogInterface$OnDismissListener r0;
    public int s0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public int w0;
    public boolean x0;
    public m y0;
    public Dialog z0;
    
    public d() {
        this.p0 = new Runnable() {
            @Override
            public void run() {
                d.I1(d.this).onDismiss((DialogInterface)d.H1(d.this));
            }
        };
        this.q0 = (DialogInterface$OnCancelListener)new DialogInterface$OnCancelListener() {
            public void onCancel(final DialogInterface dialogInterface) {
                if (d.H1(d.this) != null) {
                    final d o = d.this;
                    o.onCancel((DialogInterface)d.H1(o));
                }
            }
        };
        this.r0 = (DialogInterface$OnDismissListener)new DialogInterface$OnDismissListener() {
            public void onDismiss(final DialogInterface dialogInterface) {
                if (d.H1(d.this) != null) {
                    final d o = d.this;
                    o.onDismiss((DialogInterface)d.H1(o));
                }
            }
        };
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = true;
        this.v0 = true;
        this.w0 = -1;
        this.y0 = new m() {
            public void b(final androidx.lifecycle.h h) {
                if (h != null && d.J1(d.this)) {
                    final View q1 = d.this.q1();
                    if (q1.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (d.H1(d.this) != null) {
                        if (n.D0(3)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("DialogFragment ");
                            sb.append(this);
                            sb.append(" setting the content view on ");
                            sb.append(d.H1(d.this));
                            Log.d("FragmentManager", sb.toString());
                        }
                        d.H1(d.this).setContentView(q1);
                    }
                }
            }
        };
        this.D0 = false;
    }
    
    public static /* synthetic */ Dialog H1(final d d) {
        return d.z0;
    }
    
    public static /* synthetic */ DialogInterface$OnDismissListener I1(final d d) {
        return d.r0;
    }
    
    public static /* synthetic */ boolean J1(final d d) {
        return d.v0;
    }
    
    @Override
    public void I0(final Bundle bundle) {
        super.I0(bundle);
        final Dialog z0 = this.z0;
        if (z0 != null) {
            final Bundle onSaveInstanceState = z0.onSaveInstanceState();
            ((BaseBundle)onSaveInstanceState).putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        final int s0 = this.s0;
        if (s0 != 0) {
            ((BaseBundle)bundle).putInt("android:style", s0);
        }
        final int t0 = this.t0;
        if (t0 != 0) {
            ((BaseBundle)bundle).putInt("android:theme", t0);
        }
        final boolean u0 = this.u0;
        if (!u0) {
            ((BaseBundle)bundle).putBoolean("android:cancelable", u0);
        }
        final boolean v0 = this.v0;
        if (!v0) {
            ((BaseBundle)bundle).putBoolean("android:showsDialog", v0);
        }
        final int w0 = this.w0;
        if (w0 != -1) {
            ((BaseBundle)bundle).putInt("android:backStackId", w0);
        }
    }
    
    @Override
    public void J0() {
        super.J0();
        final Dialog z0 = this.z0;
        if (z0 != null) {
            this.A0 = false;
            z0.show();
        }
    }
    
    @Override
    public void K0() {
        super.K0();
        final Dialog z0 = this.z0;
        if (z0 != null) {
            z0.hide();
        }
    }
    
    public final void K1(final boolean b, final boolean b2) {
        if (this.B0) {
            return;
        }
        this.B0 = true;
        this.C0 = false;
        final Dialog z0 = this.z0;
        if (z0 != null) {
            z0.setOnDismissListener((DialogInterface$OnDismissListener)null);
            this.z0.dismiss();
            if (!b2) {
                if (Looper.myLooper() == this.o0.getLooper()) {
                    this.onDismiss((DialogInterface)this.z0);
                }
                else {
                    this.o0.post(this.p0);
                }
            }
        }
        this.A0 = true;
        if (this.w0 >= 0) {
            this.F().R0(this.w0, 1);
            this.w0 = -1;
            return;
        }
        final v m = this.F().m();
        m.k(this);
        if (b) {
            m.g();
            return;
        }
        m.f();
    }
    
    public Dialog L1() {
        return this.z0;
    }
    
    @Override
    public void M0(Bundle bundle) {
        super.M0(bundle);
        if (this.z0 != null && bundle != null) {
            bundle = bundle.getBundle("android:savedDialogState");
            if (bundle != null) {
                this.z0.onRestoreInstanceState(bundle);
            }
        }
    }
    
    public int M1() {
        return this.t0;
    }
    
    public Dialog N1(final Bundle bundle) {
        if (n.D0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        return new Dialog(this.p1(), this.M1());
    }
    
    public View O1(final int n) {
        final Dialog z0 = this.z0;
        if (z0 != null) {
            return z0.findViewById(n);
        }
        return null;
    }
    
    public boolean P1() {
        return this.D0;
    }
    
    public final void Q1(final Bundle bundle) {
        if (!this.v0) {
            return;
        }
        if (this.D0) {
            return;
        }
        while (true) {
            while (true) {
                try {
                    this.x0 = true;
                    final Dialog n1 = this.N1(bundle);
                    this.z0 = n1;
                    if (this.v0) {
                        this.S1(n1, this.s0);
                        final Context t = this.t();
                        if (t instanceof Activity) {
                            this.z0.setOwnerActivity((Activity)t);
                        }
                        this.z0.setCancelable(this.u0);
                        this.z0.setOnCancelListener(this.q0);
                        this.z0.setOnDismissListener(this.r0);
                        this.D0 = true;
                    }
                    else {
                        this.z0 = null;
                    }
                    this.x0 = false;
                    return;
                    this.x0 = false;
                }
                finally {}
                continue;
            }
        }
    }
    
    public void R1(final boolean v0) {
        this.v0 = v0;
    }
    
    public void S1(final Dialog dialog, final int n) {
        if (n != 1 && n != 2) {
            if (n != 3) {
                return;
            }
            final Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }
    
    @Override
    public void T0(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.T0(layoutInflater, viewGroup, bundle);
        if (super.V == null && this.z0 != null && bundle != null) {
            final Bundle bundle2 = bundle.getBundle("android:savedDialogState");
            if (bundle2 != null) {
                this.z0.onRestoreInstanceState(bundle2);
            }
        }
    }
    
    public void T1(final n n, final String s) {
        this.B0 = false;
        this.C0 = true;
        final v m = n.m();
        m.d(this, s);
        m.f();
    }
    
    @Override
    public g f() {
        return new g() {
            public final /* synthetic */ g o = super.f();
            
            @Override
            public View e(final int n) {
                final View o1 = d.this.O1(n);
                if (o1 != null) {
                    return o1;
                }
                if (this.o.f()) {
                    return this.o.e(n);
                }
                return null;
            }
            
            @Override
            public boolean f() {
                return d.this.P1() || this.o.f();
            }
        };
    }
    
    @Override
    public void j0(final Context context) {
        super.j0(context);
        this.S().e(this.y0);
        if (!this.C0) {
            this.B0 = false;
        }
    }
    
    @Override
    public void m0(final Bundle bundle) {
        super.m0(bundle);
        this.o0 = new Handler();
        this.v0 = (super.L == 0);
        if (bundle != null) {
            this.s0 = ((BaseBundle)bundle).getInt("android:style", 0);
            this.t0 = ((BaseBundle)bundle).getInt("android:theme", 0);
            this.u0 = ((BaseBundle)bundle).getBoolean("android:cancelable", true);
            this.v0 = ((BaseBundle)bundle).getBoolean("android:showsDialog", this.v0);
            this.w0 = ((BaseBundle)bundle).getInt("android:backStackId", -1);
        }
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
    }
    
    public void onDismiss(final DialogInterface dialogInterface) {
        if (!this.A0) {
            if (n.D0(3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("onDismiss called for DialogFragment ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
            }
            this.K1(true, true);
        }
    }
    
    @Override
    public void t0() {
        super.t0();
        final Dialog z0 = this.z0;
        if (z0 != null) {
            this.A0 = true;
            z0.setOnDismissListener((DialogInterface$OnDismissListener)null);
            this.z0.dismiss();
            if (!this.B0) {
                this.onDismiss((DialogInterface)this.z0);
            }
            this.z0 = null;
            this.D0 = false;
        }
    }
    
    @Override
    public void u0() {
        super.u0();
        if (!this.C0 && !this.B0) {
            this.B0 = true;
        }
        this.S().i(this.y0);
    }
    
    @Override
    public LayoutInflater v0(final Bundle bundle) {
        final LayoutInflater v0 = super.v0(bundle);
        if (this.v0 && !this.x0) {
            this.Q1(bundle);
            if (n.D0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("get layout inflater for DialogFragment ");
                sb.append(this);
                sb.append(" from dialog context");
                Log.d("FragmentManager", sb.toString());
            }
            final Dialog z0 = this.z0;
            LayoutInflater cloneInContext = v0;
            if (z0 != null) {
                cloneInContext = v0.cloneInContext(z0.getContext());
            }
            return cloneInContext;
        }
        if (n.D0(2)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("getting layout inflater for DialogFragment ");
            sb2.append(this);
            final String string = sb2.toString();
            StringBuilder sb3;
            String str;
            if (!this.v0) {
                sb3 = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            else {
                sb3 = new StringBuilder();
                str = "mCreatingDialog = true: ";
            }
            sb3.append(str);
            sb3.append(string);
            Log.d("FragmentManager", sb3.toString());
            return v0;
        }
        return v0;
    }
}
