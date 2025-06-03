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
import android.view.Window;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0782d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: A0, reason: collision with root package name */
    public boolean f9382A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f9383B0;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f9384C0;

    /* renamed from: o0, reason: collision with root package name */
    public Handler f9386o0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f9395x0;

    /* renamed from: z0, reason: collision with root package name */
    public Dialog f9397z0;

    /* renamed from: p0, reason: collision with root package name */
    public Runnable f9387p0 = new a();

    /* renamed from: q0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f9388q0 = new b();

    /* renamed from: r0, reason: collision with root package name */
    public DialogInterface.OnDismissListener f9389r0 = new c();

    /* renamed from: s0, reason: collision with root package name */
    public int f9390s0 = 0;

    /* renamed from: t0, reason: collision with root package name */
    public int f9391t0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f9392u0 = true;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f9393v0 = true;

    /* renamed from: w0, reason: collision with root package name */
    public int f9394w0 = -1;

    /* renamed from: y0, reason: collision with root package name */
    public androidx.lifecycle.m f9396y0 = new C0159d();

    /* renamed from: D0, reason: collision with root package name */
    public boolean f9385D0 = false;

    /* renamed from: androidx.fragment.app.d$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC0782d.this.f9389r0.onDismiss(DialogInterfaceOnCancelListenerC0782d.this.f9397z0);
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0782d.this.f9397z0 != null) {
                DialogInterfaceOnCancelListenerC0782d dialogInterfaceOnCancelListenerC0782d = DialogInterfaceOnCancelListenerC0782d.this;
                dialogInterfaceOnCancelListenerC0782d.onCancel(dialogInterfaceOnCancelListenerC0782d.f9397z0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0782d.this.f9397z0 != null) {
                DialogInterfaceOnCancelListenerC0782d dialogInterfaceOnCancelListenerC0782d = DialogInterfaceOnCancelListenerC0782d.this;
                dialogInterfaceOnCancelListenerC0782d.onDismiss(dialogInterfaceOnCancelListenerC0782d.f9397z0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    public class C0159d implements androidx.lifecycle.m {
        public C0159d() {
        }

        @Override // androidx.lifecycle.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.lifecycle.h hVar) {
            if (hVar == null || !DialogInterfaceOnCancelListenerC0782d.this.f9393v0) {
                return;
            }
            View q12 = DialogInterfaceOnCancelListenerC0782d.this.q1();
            if (q12.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC0782d.this.f9397z0 != null) {
                if (n.D0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC0782d.this.f9397z0);
                }
                DialogInterfaceOnCancelListenerC0782d.this.f9397z0.setContentView(q12);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    public class e extends g {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ g f9402o;

        public e(g gVar) {
            this.f9402o = gVar;
        }

        @Override // androidx.fragment.app.g
        public View e(int i7) {
            View O12 = DialogInterfaceOnCancelListenerC0782d.this.O1(i7);
            if (O12 != null) {
                return O12;
            }
            if (this.f9402o.f()) {
                return this.f9402o.e(i7);
            }
            return null;
        }

        @Override // androidx.fragment.app.g
        public boolean f() {
            return DialogInterfaceOnCancelListenerC0782d.this.P1() || this.f9402o.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void I0(Bundle bundle) {
        super.I0(bundle);
        Dialog dialog = this.f9397z0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i7 = this.f9390s0;
        if (i7 != 0) {
            bundle.putInt("android:style", i7);
        }
        int i8 = this.f9391t0;
        if (i8 != 0) {
            bundle.putInt("android:theme", i8);
        }
        boolean z7 = this.f9392u0;
        if (!z7) {
            bundle.putBoolean("android:cancelable", z7);
        }
        boolean z8 = this.f9393v0;
        if (!z8) {
            bundle.putBoolean("android:showsDialog", z8);
        }
        int i9 = this.f9394w0;
        if (i9 != -1) {
            bundle.putInt("android:backStackId", i9);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void J0() {
        super.J0();
        Dialog dialog = this.f9397z0;
        if (dialog != null) {
            this.f9382A0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void K0() {
        super.K0();
        Dialog dialog = this.f9397z0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void K1(boolean z7, boolean z8) {
        if (this.f9383B0) {
            return;
        }
        this.f9383B0 = true;
        this.f9384C0 = false;
        Dialog dialog = this.f9397z0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f9397z0.dismiss();
            if (!z8) {
                if (Looper.myLooper() == this.f9386o0.getLooper()) {
                    onDismiss(this.f9397z0);
                } else {
                    this.f9386o0.post(this.f9387p0);
                }
            }
        }
        this.f9382A0 = true;
        if (this.f9394w0 >= 0) {
            F().R0(this.f9394w0, 1);
            this.f9394w0 = -1;
            return;
        }
        v m7 = F().m();
        m7.k(this);
        if (z7) {
            m7.g();
        } else {
            m7.f();
        }
    }

    public Dialog L1() {
        return this.f9397z0;
    }

    @Override // androidx.fragment.app.Fragment
    public void M0(Bundle bundle) {
        Bundle bundle2;
        super.M0(bundle);
        if (this.f9397z0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f9397z0.onRestoreInstanceState(bundle2);
    }

    public int M1() {
        return this.f9391t0;
    }

    public Dialog N1(Bundle bundle) {
        if (n.D0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(p1(), M1());
    }

    public View O1(int i7) {
        Dialog dialog = this.f9397z0;
        if (dialog != null) {
            return dialog.findViewById(i7);
        }
        return null;
    }

    public boolean P1() {
        return this.f9385D0;
    }

    public final void Q1(Bundle bundle) {
        if (this.f9393v0 && !this.f9385D0) {
            try {
                this.f9395x0 = true;
                Dialog N12 = N1(bundle);
                this.f9397z0 = N12;
                if (this.f9393v0) {
                    S1(N12, this.f9390s0);
                    Context t7 = t();
                    if (t7 instanceof Activity) {
                        this.f9397z0.setOwnerActivity((Activity) t7);
                    }
                    this.f9397z0.setCancelable(this.f9392u0);
                    this.f9397z0.setOnCancelListener(this.f9388q0);
                    this.f9397z0.setOnDismissListener(this.f9389r0);
                    this.f9385D0 = true;
                } else {
                    this.f9397z0 = null;
                }
                this.f9395x0 = false;
            } catch (Throwable th) {
                this.f9395x0 = false;
                throw th;
            }
        }
    }

    public void R1(boolean z7) {
        this.f9393v0 = z7;
    }

    public void S1(Dialog dialog, int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.T0(layoutInflater, viewGroup, bundle);
        if (this.f9257V != null || this.f9397z0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f9397z0.onRestoreInstanceState(bundle2);
    }

    public void T1(n nVar, String str) {
        this.f9383B0 = false;
        this.f9384C0 = true;
        v m7 = nVar.m();
        m7.d(this, str);
        m7.f();
    }

    @Override // androidx.fragment.app.Fragment
    public g f() {
        return new e(super.f());
    }

    @Override // androidx.fragment.app.Fragment
    public void j0(Context context) {
        super.j0(context);
        S().e(this.f9396y0);
        if (this.f9384C0) {
            return;
        }
        this.f9383B0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void m0(Bundle bundle) {
        super.m0(bundle);
        this.f9386o0 = new Handler();
        this.f9393v0 = this.f9247L == 0;
        if (bundle != null) {
            this.f9390s0 = bundle.getInt("android:style", 0);
            this.f9391t0 = bundle.getInt("android:theme", 0);
            this.f9392u0 = bundle.getBoolean("android:cancelable", true);
            this.f9393v0 = bundle.getBoolean("android:showsDialog", this.f9393v0);
            this.f9394w0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f9382A0) {
            return;
        }
        if (n.D0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        K1(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void t0() {
        super.t0();
        Dialog dialog = this.f9397z0;
        if (dialog != null) {
            this.f9382A0 = true;
            dialog.setOnDismissListener(null);
            this.f9397z0.dismiss();
            if (!this.f9383B0) {
                onDismiss(this.f9397z0);
            }
            this.f9397z0 = null;
            this.f9385D0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void u0() {
        super.u0();
        if (!this.f9384C0 && !this.f9383B0) {
            this.f9383B0 = true;
        }
        S().i(this.f9396y0);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater v0(Bundle bundle) {
        StringBuilder sb;
        String str;
        LayoutInflater v02 = super.v0(bundle);
        if (this.f9393v0 && !this.f9395x0) {
            Q1(bundle);
            if (n.D0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f9397z0;
            return dialog != null ? v02.cloneInContext(dialog.getContext()) : v02;
        }
        if (n.D0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.f9393v0) {
                sb = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb.append(str);
            sb.append(str2);
            Log.d("FragmentManager", sb.toString());
        }
        return v02;
    }
}
