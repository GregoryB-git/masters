package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.d;
import androidx.savedstate.SavedStateRegistry;
import c.InterfaceC0810b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import w.AbstractC2072a;

/* loaded from: classes.dex */
public abstract class e extends ComponentActivity implements AbstractC2072a.e {

    /* renamed from: A, reason: collision with root package name */
    public boolean f9404A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f9405B;

    /* renamed from: y, reason: collision with root package name */
    public final i f9407y = i.b(new c());

    /* renamed from: z, reason: collision with root package name */
    public final androidx.lifecycle.i f9408z = new androidx.lifecycle.i(this);

    /* renamed from: C, reason: collision with root package name */
    public boolean f9406C = true;

    public class a implements SavedStateRegistry.b {
        public a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            e.this.p();
            e.this.f9408z.h(d.b.ON_STOP);
            Parcelable x7 = e.this.f9407y.x();
            if (x7 != null) {
                bundle.putParcelable("android:support:fragments", x7);
            }
            return bundle;
        }
    }

    public class b implements InterfaceC0810b {
        public b() {
        }

        @Override // c.InterfaceC0810b
        public void a(Context context) {
            e.this.f9407y.a(null);
            Bundle a7 = e.this.k().a("android:support:fragments");
            if (a7 != null) {
                e.this.f9407y.w(a7.getParcelable("android:support:fragments"));
            }
        }
    }

    public class c extends k implements androidx.lifecycle.u, androidx.activity.c, androidx.activity.result.d, r {
        public c() {
            super(e.this);
        }

        @Override // androidx.fragment.app.r
        public void a(n nVar, Fragment fragment) {
            e.this.r(fragment);
        }

        @Override // androidx.activity.result.d
        public ActivityResultRegistry c() {
            return e.this.c();
        }

        @Override // androidx.lifecycle.u
        public androidx.lifecycle.t d() {
            return e.this.d();
        }

        @Override // androidx.fragment.app.g
        public View e(int i7) {
            return e.this.findViewById(i7);
        }

        @Override // androidx.fragment.app.g
        public boolean f() {
            Window window = e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.h
        public androidx.lifecycle.d g() {
            return e.this.f9408z;
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher j() {
            return e.this.j();
        }

        @Override // androidx.fragment.app.k
        public LayoutInflater n() {
            return e.this.getLayoutInflater().cloneInContext(e.this);
        }

        @Override // androidx.fragment.app.k
        public boolean o(Fragment fragment) {
            return !e.this.isFinishing();
        }

        @Override // androidx.fragment.app.k
        public void q() {
            e.this.u();
        }

        @Override // androidx.fragment.app.k
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public e m() {
            return e.this;
        }
    }

    public e() {
        o();
    }

    public static boolean q(n nVar, d.c cVar) {
        boolean z7 = false;
        for (Fragment fragment : nVar.r0()) {
            if (fragment != null) {
                if (fragment.z() != null) {
                    z7 |= q(fragment.s(), cVar);
                }
                z zVar = fragment.f9269h0;
                if (zVar != null && zVar.g().b().c(d.c.STARTED)) {
                    fragment.f9269h0.f(cVar);
                    z7 = true;
                }
                if (fragment.f9268g0.b().c(d.c.STARTED)) {
                    fragment.f9268g0.o(cVar);
                    z7 = true;
                }
            }
        }
        return z7;
    }

    @Override // w.AbstractC2072a.e
    public final void a(int i7) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f9404A);
        printWriter.print(" mResumed=");
        printWriter.print(this.f9405B);
        printWriter.print(" mStopped=");
        printWriter.print(this.f9406C);
        if (getApplication() != null) {
            Y.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f9407y.t().W(str, fileDescriptor, printWriter, strArr);
    }

    public final View m(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f9407y.v(view, str, context, attributeSet);
    }

    public n n() {
        return this.f9407y.t();
    }

    public final void o() {
        k().d("android:support:fragments", new a());
        f(new b());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        this.f9407y.u();
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9407y.u();
        this.f9407y.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, w.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9408z.h(d.b.ON_CREATE);
        this.f9407y.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i7, Menu menu) {
        return i7 == 0 ? super.onCreatePanelMenu(i7, menu) | this.f9407y.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i7, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View m7 = m(view, str, context, attributeSet);
        return m7 == null ? super.onCreateView(view, str, context, attributeSet) : m7;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f9407y.h();
        this.f9408z.h(d.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f9407y.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 0) {
            return this.f9407y.k(menuItem);
        }
        if (i7 != 6) {
            return false;
        }
        return this.f9407y.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z7) {
        this.f9407y.j(z7);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f9407y.u();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        if (i7 == 0) {
            this.f9407y.l(menu);
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f9405B = false;
        this.f9407y.m();
        this.f9408z.h(d.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z7) {
        this.f9407y.n(z7);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        t();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i7, View view, Menu menu) {
        return i7 == 0 ? s(view, menu) | this.f9407y.o(menu) : super.onPreparePanel(i7, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        this.f9407y.u();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f9405B = true;
        this.f9407y.u();
        this.f9407y.s();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f9406C = false;
        if (!this.f9404A) {
            this.f9404A = true;
            this.f9407y.c();
        }
        this.f9407y.u();
        this.f9407y.s();
        this.f9408z.h(d.b.ON_START);
        this.f9407y.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f9407y.u();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f9406C = true;
        p();
        this.f9407y.r();
        this.f9408z.h(d.b.ON_STOP);
    }

    public void p() {
        while (q(n(), d.c.CREATED)) {
        }
    }

    public void r(Fragment fragment) {
    }

    public boolean s(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void t() {
        this.f9408z.h(d.b.ON_RESUME);
        this.f9407y.p();
    }

    public void u() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View m7 = m(null, str, context, attributeSet);
        return m7 == null ? super.onCreateView(str, context, attributeSet) : m7;
    }
}
