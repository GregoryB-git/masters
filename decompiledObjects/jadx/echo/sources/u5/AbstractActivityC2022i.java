package u5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.d;
import java.util.List;
import t5.AbstractC1995b;
import u5.C2023j;
import v5.C2071j;

/* renamed from: u5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2022i extends Activity implements C2023j.c, androidx.lifecycle.h {

    /* renamed from: s, reason: collision with root package name */
    public static final int f19905s = View.generateViewId();

    /* renamed from: o, reason: collision with root package name */
    public boolean f19906o = false;

    /* renamed from: p, reason: collision with root package name */
    public C2023j f19907p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.lifecycle.i f19908q;

    /* renamed from: r, reason: collision with root package name */
    public final OnBackInvokedCallback f19909r;

    /* renamed from: u5.i$a */
    public class a implements OnBackAnimationCallback {
        public a() {
        }

        public void onBackCancelled() {
            AbstractActivityC2022i.this.F();
        }

        public void onBackInvoked() {
            AbstractActivityC2022i.this.G();
        }

        public void onBackProgressed(BackEvent backEvent) {
            AbstractActivityC2022i.this.V(backEvent);
        }

        public void onBackStarted(BackEvent backEvent) {
            AbstractActivityC2022i.this.R(backEvent);
        }
    }

    public AbstractActivityC2022i() {
        this.f19909r = Build.VERSION.SDK_INT < 33 ? null : K();
        this.f19908q = new androidx.lifecycle.i(this);
    }

    @Override // u5.C2023j.c
    public O A() {
        return L() == EnumC2024k.opaque ? O.surface : O.texture;
    }

    @Override // u5.C2023j.c
    public boolean B() {
        return true;
    }

    @Override // u5.C2023j.c
    public P D() {
        return L() == EnumC2024k.opaque ? P.opaque : P.transparent;
    }

    @Override // u5.C2023j.c
    public void E(io.flutter.embedding.engine.a aVar) {
        if (this.f19907p.p()) {
            return;
        }
        C5.a.a(aVar);
    }

    public void F() {
        if (S("cancelBackGesture")) {
            this.f19907p.h();
        }
    }

    public void G() {
        if (S("commitBackGesture")) {
            this.f19907p.i();
        }
    }

    public final void H() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    public final void I() {
        if (L() == EnumC2024k.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public final View J() {
        return this.f19907p.u(null, null, null, f19905s, A() == O.surface);
    }

    public final OnBackInvokedCallback K() {
        return Build.VERSION.SDK_INT >= 34 ? new a() : new OnBackInvokedCallback() { // from class: u5.h
            public final void onBackInvoked() {
                AbstractActivityC2022i.this.onBackPressed();
            }
        };
    }

    public EnumC2024k L() {
        return getIntent().hasExtra("background_mode") ? EnumC2024k.valueOf(getIntent().getStringExtra("background_mode")) : EnumC2024k.opaque;
    }

    public io.flutter.embedding.engine.a M() {
        return this.f19907p.n();
    }

    public Bundle N() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final boolean O() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    public void P() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.f19909r);
            this.f19906o = true;
        }
    }

    public void Q() {
        U();
        C2023j c2023j = this.f19907p;
        if (c2023j != null) {
            c2023j.J();
            this.f19907p = null;
        }
    }

    public void R(BackEvent backEvent) {
        if (S("startBackGesture")) {
            this.f19907p.L(backEvent);
        }
    }

    public final boolean S(String str) {
        StringBuilder sb;
        String str2;
        C2023j c2023j = this.f19907p;
        if (c2023j == null) {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after release.";
        } else {
            if (c2023j.o()) {
                return true;
            }
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after detach.";
        }
        sb.append(str2);
        AbstractC1995b.g("FlutterActivity", sb.toString());
        return false;
    }

    public final void T() {
        try {
            Bundle N6 = N();
            if (N6 != null) {
                int i7 = N6.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i7 != -1) {
                    setTheme(i7);
                }
            } else {
                AbstractC1995b.f("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC1995b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    public void U() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f19909r);
            this.f19906o = false;
        }
    }

    public void V(BackEvent backEvent) {
        if (S("updateBackGestureProgress")) {
            this.f19907p.M(backEvent);
        }
    }

    @Override // io.flutter.plugin.platform.h.d
    public boolean a() {
        return false;
    }

    @Override // u5.C2023j.c
    public void d() {
        AbstractC1995b.g("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + M() + " evicted by another attaching activity");
        C2023j c2023j = this.f19907p;
        if (c2023j != null) {
            c2023j.v();
            this.f19907p.w();
        }
    }

    @Override // u5.C2023j.c
    public void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.plugin.platform.h.d
    public void f(boolean z7) {
        if (z7 && !this.f19906o) {
            P();
        } else {
            if (z7 || !this.f19906o) {
                return;
            }
            U();
        }
    }

    @Override // u5.C2023j.c, androidx.lifecycle.h
    public androidx.lifecycle.d g() {
        return this.f19908q;
    }

    @Override // u5.C2023j.c
    public String h() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // u5.C2023j.c
    public String i() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle N6 = N();
            if (N6 != null) {
                return N6.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // u5.C2023j.c
    public List m() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // u5.C2023j.c
    public boolean n() {
        return true;
    }

    @Override // u5.C2023j.c
    public boolean o() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (q() != null || this.f19907p.p()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (S("onActivityResult")) {
            this.f19907p.r(i7, i8, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (S("onBackPressed")) {
            this.f19907p.t();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        T();
        super.onCreate(bundle);
        C2023j c2023j = new C2023j(this);
        this.f19907p = c2023j;
        c2023j.s(this);
        this.f19907p.B(bundle);
        this.f19908q.h(d.b.ON_CREATE);
        I();
        setContentView(J());
        H();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (S("onDestroy")) {
            this.f19907p.v();
            this.f19907p.w();
        }
        Q();
        this.f19908q.h(d.b.ON_DESTROY);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (S("onNewIntent")) {
            this.f19907p.x(intent);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (S("onPause")) {
            this.f19907p.y();
        }
        this.f19908q.h(d.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (S("onPostResume")) {
            this.f19907p.z();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (S("onRequestPermissionsResult")) {
            this.f19907p.A(i7, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f19908q.h(d.b.ON_RESUME);
        if (S("onResume")) {
            this.f19907p.C();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (S("onSaveInstanceState")) {
            this.f19907p.D(bundle);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f19908q.h(d.b.ON_START);
        if (S("onStart")) {
            this.f19907p.E();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        if (S("onStop")) {
            this.f19907p.F();
        }
        this.f19908q.h(d.b.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        if (S("onTrimMemory")) {
            this.f19907p.G(i7);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (S("onUserLeaveHint")) {
            this.f19907p.H();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        if (S("onWindowFocusChanged")) {
            this.f19907p.I(z7);
        }
    }

    @Override // u5.C2023j.c
    public boolean p() {
        return true;
    }

    @Override // u5.C2023j.c
    public String q() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // u5.C2023j.c
    public boolean r() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : q() == null;
    }

    @Override // u5.C2023j.c
    public String s() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle N6 = N();
            String string = N6 != null ? N6.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // u5.C2023j.c
    public String u() {
        try {
            Bundle N6 = N();
            if (N6 != null) {
                return N6.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // u5.C2023j.c
    public io.flutter.plugin.platform.h v(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new io.flutter.plugin.platform.h(c(), aVar.p(), this);
    }

    @Override // u5.C2023j.c
    public String w() {
        String dataString;
        if (O() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // u5.C2023j.c
    public boolean y() {
        try {
            Bundle N6 = N();
            if (N6 != null) {
                return N6.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // u5.C2023j.c
    public C2071j z() {
        return C2071j.a(getIntent());
    }

    @Override // u5.C2023j.c
    public void b() {
    }

    @Override // u5.C2023j.c
    public Activity c() {
        return this;
    }

    @Override // u5.C2023j.c
    public Context getContext() {
        return this;
    }

    @Override // u5.C2023j.c
    public void l(s sVar) {
    }

    @Override // u5.C2023j.c
    public void t(io.flutter.embedding.engine.a aVar) {
    }

    @Override // u5.C2023j.c
    public void x(t tVar) {
    }
}
