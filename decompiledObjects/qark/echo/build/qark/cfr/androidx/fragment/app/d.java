/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.Window
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.fragment.app.n;
import androidx.fragment.app.v;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.h;
import androidx.lifecycle.m;

public class d
extends Fragment
implements DialogInterface.OnCancelListener,
DialogInterface.OnDismissListener {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public Handler o0;
    public Runnable p0;
    public DialogInterface.OnCancelListener q0;
    public DialogInterface.OnDismissListener r0;
    public int s0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public int w0;
    public boolean x0;
    public m y0;
    public Dialog z0;

    public d() {
        this.p0 = new Runnable(){

            public void run() {
                d.this.r0.onDismiss((DialogInterface)d.this.z0);
            }
        };
        this.q0 = new DialogInterface.OnCancelListener(){

            public void onCancel(DialogInterface object) {
                if (d.this.z0 != null) {
                    object = d.this;
                    object.onCancel((DialogInterface)((d)object).z0);
                }
            }
        };
        this.r0 = new DialogInterface.OnDismissListener(){

            public void onDismiss(DialogInterface object) {
                if (d.this.z0 != null) {
                    object = d.this;
                    object.onDismiss((DialogInterface)((d)object).z0);
                }
            }
        };
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = true;
        this.v0 = true;
        this.w0 = -1;
        this.y0 = new m(){

            public void b(h h8) {
                if (h8 != null && d.this.v0) {
                    h8 = d.this.q1();
                    if (h8.getParent() == null) {
                        if (d.this.z0 != null) {
                            if (n.D0(3)) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("DialogFragment ");
                                stringBuilder.append((Object)this);
                                stringBuilder.append(" setting the content view on ");
                                stringBuilder.append((Object)d.this.z0);
                                Log.d((String)"FragmentManager", (String)stringBuilder.toString());
                            }
                            d.this.z0.setContentView((View)h8);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                }
            }
        };
        this.D0 = false;
    }

    @Override
    public void I0(Bundle bundle) {
        int n8;
        boolean bl;
        super.I0(bundle);
        Dialog dialog = this.z0;
        if (dialog != null) {
            dialog = dialog.onSaveInstanceState();
            dialog.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", (Bundle)dialog);
        }
        if ((n8 = this.s0) != 0) {
            bundle.putInt("android:style", n8);
        }
        if ((n8 = this.t0) != 0) {
            bundle.putInt("android:theme", n8);
        }
        if (!(bl = this.u0)) {
            bundle.putBoolean("android:cancelable", bl);
        }
        if (!(bl = this.v0)) {
            bundle.putBoolean("android:showsDialog", bl);
        }
        if ((n8 = this.w0) != -1) {
            bundle.putInt("android:backStackId", n8);
        }
    }

    @Override
    public void J0() {
        super.J0();
        Dialog dialog = this.z0;
        if (dialog != null) {
            this.A0 = false;
            dialog.show();
        }
    }

    @Override
    public void K0() {
        super.K0();
        Dialog dialog = this.z0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void K1(boolean bl, boolean bl2) {
        if (this.B0) {
            return;
        }
        this.B0 = true;
        this.C0 = false;
        Object object = this.z0;
        if (object != null) {
            object.setOnDismissListener(null);
            this.z0.dismiss();
            if (!bl2) {
                if (Looper.myLooper() == this.o0.getLooper()) {
                    this.onDismiss((DialogInterface)this.z0);
                } else {
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
        object = this.F().m();
        object.k(this);
        if (bl) {
            object.g();
            return;
        }
        object.f();
    }

    public Dialog L1() {
        return this.z0;
    }

    @Override
    public void M0(Bundle bundle) {
        super.M0(bundle);
        if (this.z0 != null && bundle != null && (bundle = bundle.getBundle("android:savedDialogState")) != null) {
            this.z0.onRestoreInstanceState(bundle);
        }
    }

    public int M1() {
        return this.t0;
    }

    public Dialog N1(Bundle bundle) {
        if (n.D0(3)) {
            bundle = new StringBuilder();
            bundle.append("onCreateDialog called for DialogFragment ");
            bundle.append((Object)this);
            Log.d((String)"FragmentManager", (String)bundle.toString());
        }
        return new Dialog(this.p1(), this.M1());
    }

    public View O1(int n8) {
        Dialog dialog = this.z0;
        if (dialog != null) {
            return dialog.findViewById(n8);
        }
        return null;
    }

    public boolean P1() {
        return this.D0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Q1(Bundle bundle) {
        Throwable throwable2;
        block6 : {
            if (!this.v0) {
                return;
            }
            if (this.D0) {
                return;
            }
            try {
                this.x0 = true;
                bundle = this.N1(bundle);
                this.z0 = bundle;
                if (this.v0) {
                    this.S1((Dialog)bundle, this.s0);
                    bundle = this.t();
                    if (bundle instanceof Activity) {
                        this.z0.setOwnerActivity((Activity)bundle);
                    }
                    this.z0.setCancelable(this.u0);
                    this.z0.setOnCancelListener(this.q0);
                    this.z0.setOnDismissListener(this.r0);
                    this.D0 = true;
                    break block6;
                }
                this.z0 = null;
            }
            catch (Throwable throwable2) {}
        }
        this.x0 = false;
        return;
        this.x0 = false;
        throw throwable2;
    }

    public void R1(boolean bl) {
        this.v0 = bl;
    }

    public void S1(Dialog dialog, int n8) {
        if (n8 != 1 && n8 != 2) {
            if (n8 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override
    public void T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.T0(layoutInflater, viewGroup, bundle);
        if (this.V == null && this.z0 != null && bundle != null && (layoutInflater = bundle.getBundle("android:savedDialogState")) != null) {
            this.z0.onRestoreInstanceState((Bundle)layoutInflater);
        }
    }

    public void T1(n object, String string2) {
        this.B0 = false;
        this.C0 = true;
        object = object.m();
        object.d(this, string2);
        object.f();
    }

    @Override
    public g f() {
        return new g(super.f()){
            public final /* synthetic */ g o;
            {
                this.o = g8;
            }

            @Override
            public View e(int n8) {
                View view = d.this.O1(n8);
                if (view != null) {
                    return view;
                }
                if (this.o.f()) {
                    return this.o.e(n8);
                }
                return null;
            }

            @Override
            public boolean f() {
                if (!d.this.P1() && !this.o.f()) {
                    return false;
                }
                return true;
            }
        };
    }

    @Override
    public void j0(Context context) {
        super.j0(context);
        this.S().e(this.y0);
        if (!this.C0) {
            this.B0 = false;
        }
    }

    @Override
    public void m0(Bundle bundle) {
        super.m0(bundle);
        this.o0 = new Handler();
        boolean bl = this.L == 0;
        this.v0 = bl;
        if (bundle != null) {
            this.s0 = bundle.getInt("android:style", 0);
            this.t0 = bundle.getInt("android:theme", 0);
            this.u0 = bundle.getBoolean("android:cancelable", true);
            this.v0 = bundle.getBoolean("android:showsDialog", this.v0);
            this.w0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.A0) {
            if (n.D0(3)) {
                dialogInterface = new StringBuilder();
                dialogInterface.append("onDismiss called for DialogFragment ");
                dialogInterface.append((Object)this);
                Log.d((String)"FragmentManager", (String)dialogInterface.toString());
            }
            this.K1(true, true);
        }
    }

    @Override
    public void t0() {
        super.t0();
        Dialog dialog = this.z0;
        if (dialog != null) {
            this.A0 = true;
            dialog.setOnDismissListener(null);
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

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public LayoutInflater v0(Bundle bundle) {
        String string2;
        LayoutInflater layoutInflater = super.v0(bundle);
        if (this.v0 && !this.x0) {
            this.Q1(bundle);
            if (n.D0(2)) {
                bundle = new StringBuilder();
                bundle.append("get layout inflater for DialogFragment ");
                bundle.append((Object)this);
                bundle.append(" from dialog context");
                Log.d((String)"FragmentManager", (String)bundle.toString());
            }
            Dialog dialog = this.z0;
            bundle = layoutInflater;
            if (dialog == null) return bundle;
            return layoutInflater.cloneInContext(dialog.getContext());
        }
        if (!n.D0(2)) {
            return layoutInflater;
        }
        bundle = new StringBuilder();
        bundle.append("getting layout inflater for DialogFragment ");
        bundle.append((Object)this);
        String string3 = bundle.toString();
        if (!this.v0) {
            bundle = new StringBuilder();
            string2 = "mShowsDialog = false: ";
        } else {
            bundle = new StringBuilder();
            string2 = "mCreatingDialog = true: ";
        }
        bundle.append(string2);
        bundle.append(string3);
        Log.d((String)"FragmentManager", (String)bundle.toString());
        return layoutInflater;
    }

}

