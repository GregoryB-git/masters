package x0;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.meduza.meduza.R;
import x0.g0;
import x0.y.n;

/* loaded from: classes.dex */
public class h extends i implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public b f16638a;

    /* renamed from: b, reason: collision with root package name */
    public c f16639b;

    /* renamed from: c, reason: collision with root package name */
    public int f16640c;

    /* renamed from: d, reason: collision with root package name */
    public int f16641d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16642e;
    public boolean f;

    /* renamed from: o, reason: collision with root package name */
    public int f16643o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16644p;

    /* renamed from: q, reason: collision with root package name */
    public d f16645q;

    /* renamed from: r, reason: collision with root package name */
    public Dialog f16646r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16647s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16648u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16649v;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h hVar = h.this;
            hVar.f16639b.onDismiss(hVar.f16646r);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            h hVar = h.this;
            Dialog dialog = hVar.f16646r;
            if (dialog != null) {
                hVar.onCancel(dialog);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            h hVar = h.this;
            Dialog dialog = hVar.f16646r;
            if (dialog != null) {
                hVar.onDismiss(dialog);
            }
        }
    }

    public class d implements b1.x<b1.o> {
        public d() {
        }

        @Override // b1.x
        public final void a(b1.o oVar) {
            if (oVar != null) {
                h hVar = h.this;
                if (hVar.f) {
                    View requireView = hVar.requireView();
                    if (requireView.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (h.this.f16646r != null) {
                        if (y.L(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + h.this.f16646r);
                        }
                        h.this.f16646r.setContentView(requireView);
                    }
                }
            }
        }
    }

    public class e extends p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f16654a;

        public e(p pVar) {
            this.f16654a = pVar;
        }

        @Override // x0.p
        public final View b(int i10) {
            if (this.f16654a.c()) {
                return this.f16654a.b(i10);
            }
            Dialog dialog = h.this.f16646r;
            if (dialog != null) {
                return dialog.findViewById(i10);
            }
            return null;
        }

        @Override // x0.p
        public final boolean c() {
            return this.f16654a.c() || h.this.f16649v;
        }
    }

    public h() {
        new a();
        this.f16638a = new b();
        this.f16639b = new c();
        this.f16640c = 0;
        this.f16641d = 0;
        this.f16642e = true;
        this.f = true;
        this.f16643o = -1;
        this.f16645q = new d();
        this.f16649v = false;
    }

    @Override // x0.i
    public final p createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public Dialog e() {
        if (y.L(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new b.l(requireContext(), this.f16641d);
    }

    @Override // x0.i
    @Deprecated
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // x0.i
    public final void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.f16645q);
        if (this.f16648u) {
            return;
        }
        this.t = false;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // x0.i
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new Handler();
        this.f = this.mContainerId == 0;
        if (bundle != null) {
            this.f16640c = bundle.getInt("android:style", 0);
            this.f16641d = bundle.getInt("android:theme", 0);
            this.f16642e = bundle.getBoolean("android:cancelable", true);
            this.f = bundle.getBoolean("android:showsDialog", this.f);
            this.f16643o = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // x0.i
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f16646r;
        if (dialog != null) {
            this.f16647s = true;
            dialog.setOnDismissListener(null);
            this.f16646r.dismiss();
            if (!this.t) {
                onDismiss(this.f16646r);
            }
            this.f16646r = null;
            this.f16649v = false;
        }
    }

    @Override // x0.i
    public final void onDetach() {
        super.onDetach();
        if (!this.f16648u && !this.t) {
            this.t = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.f16645q);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f16647s) {
            return;
        }
        if (y.L(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.t) {
            return;
        }
        this.t = true;
        this.f16648u = false;
        Dialog dialog = this.f16646r;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f16646r.dismiss();
        }
        this.f16647s = true;
        if (this.f16643o >= 0) {
            y parentFragmentManager = getParentFragmentManager();
            int i10 = this.f16643o;
            parentFragmentManager.getClass();
            if (i10 < 0) {
                throw new IllegalArgumentException(defpackage.f.h("Bad id: ", i10));
            }
            parentFragmentManager.y(parentFragmentManager.new n(i10), true);
            this.f16643o = -1;
            return;
        }
        y parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        x0.a aVar = new x0.a(parentFragmentManager2);
        aVar.f16629o = true;
        y yVar = this.mFragmentManager;
        if (yVar == null || yVar == aVar.f16515p) {
            aVar.b(new g0.a(this, 3));
            aVar.d(true);
        } else {
            StringBuilder l10 = defpackage.f.l("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            l10.append(toString());
            l10.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(l10.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x004d, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0065), top: B:9:0x001a }] */
    @Override // x0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.onGetLayoutInflater(r8)
            boolean r0 = r7.f
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L9b
            boolean r3 = r7.f16644p
            if (r3 == 0) goto L11
            goto L9b
        L11:
            if (r0 != 0) goto L14
            goto L6f
        L14:
            boolean r0 = r7.f16649v
            if (r0 != 0) goto L6f
            r0 = 0
            r3 = 1
            r7.f16644p = r3     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r4 = r7.e()     // Catch: java.lang.Throwable -> L6b
            r7.f16646r = r4     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r7.f     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L65
            int r5 = r7.f16640c     // Catch: java.lang.Throwable -> L6b
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L6b
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L6b
        L3e:
            android.content.Context r4 = r7.getContext()     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L4d
            android.app.Dialog r5 = r7.f16646r     // Catch: java.lang.Throwable -> L6b
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L6b
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L6b
        L4d:
            android.app.Dialog r4 = r7.f16646r     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r7.f16642e     // Catch: java.lang.Throwable -> L6b
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r4 = r7.f16646r     // Catch: java.lang.Throwable -> L6b
            x0.h$b r5 = r7.f16638a     // Catch: java.lang.Throwable -> L6b
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r4 = r7.f16646r     // Catch: java.lang.Throwable -> L6b
            x0.h$c r5 = r7.f16639b     // Catch: java.lang.Throwable -> L6b
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L6b
            r7.f16649v = r3     // Catch: java.lang.Throwable -> L6b
            goto L68
        L65:
            r3 = 0
            r7.f16646r = r3     // Catch: java.lang.Throwable -> L6b
        L68:
            r7.f16644p = r0
            goto L6f
        L6b:
            r8 = move-exception
            r7.f16644p = r0
            throw r8
        L6f:
            boolean r0 = x0.y.L(r2)
            if (r0 == 0) goto L8e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8e:
            android.app.Dialog r0 = r7.f16646r
            if (r0 == 0) goto L9a
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
        L9a:
            return r8
        L9b:
            boolean r0 = x0.y.L(r2)
            if (r0 == 0) goto Ld2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.f
            if (r2 != 0) goto Lbe
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mShowsDialog = false: "
            goto Lc5
        Lbe:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mCreatingDialog = true: "
        Lc5:
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        Ld2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.h.onGetLayoutInflater(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // x0.i
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f16646r;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f16640c;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f16641d;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f16642e;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f16643o;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // x0.i
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.f16646r;
        if (dialog != null) {
            this.f16647s = false;
            dialog.show();
            View decorView = this.f16646r.getWindow().getDecorView();
            b.a0.G(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            b.a0.H(decorView, this);
        }
    }

    @Override // x0.i
    public final void onStop() {
        super.onStop();
        Dialog dialog = this.f16646r;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // x0.i
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f16646r == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f16646r.onRestoreInstanceState(bundle2);
    }

    @Override // x0.i
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f16646r == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f16646r.onRestoreInstanceState(bundle2);
    }
}
