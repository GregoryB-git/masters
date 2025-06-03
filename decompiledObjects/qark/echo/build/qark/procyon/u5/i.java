// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u5;

import android.os.BaseBundle;
import android.content.Intent;
import java.util.List;
import android.content.Context;
import androidx.lifecycle.d;
import android.content.pm.PackageManager$NameNotFoundException;
import t5.b;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import io.flutter.embedding.engine.a;
import android.os.Build$VERSION;
import android.view.View;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.h;
import android.app.Activity;

public abstract class i extends Activity implements c, h
{
    public static final int s;
    public boolean o;
    public j p;
    public androidx.lifecycle.i q;
    public final OnBackInvokedCallback r;
    
    static {
        s = View.generateViewId();
    }
    
    public i() {
        this.o = false;
        OnBackInvokedCallback k;
        if (Build$VERSION.SDK_INT < 33) {
            k = null;
        }
        else {
            k = this.K();
        }
        this.r = k;
        this.q = new androidx.lifecycle.i(this);
    }
    
    public O A() {
        if (this.L() == u5.k.o) {
            return O.o;
        }
        return O.p;
    }
    
    public boolean B() {
        return true;
    }
    
    public P D() {
        if (this.L() == u5.k.o) {
            return P.o;
        }
        return P.p;
    }
    
    public void E(final a a) {
        if (this.p.p()) {
            return;
        }
        C5.a.a(a);
    }
    
    public void F() {
        if (this.S("cancelBackGesture")) {
            this.p.h();
        }
    }
    
    public void G() {
        if (this.S("commitBackGesture")) {
            this.p.i();
        }
    }
    
    public final void H() {
        final Window window = this.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }
    
    public final void I() {
        if (this.L() == u5.k.p) {
            this.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(0));
        }
    }
    
    public final View J() {
        return this.p.u(null, null, null, i.s, this.A() == O.o);
    }
    
    public final OnBackInvokedCallback K() {
        if (Build$VERSION.SDK_INT >= 34) {
            return new OnBackAnimationCallback() {
                public void onBackCancelled() {
                    i.this.F();
                }
                
                public void onBackInvoked() {
                    i.this.G();
                }
                
                public void onBackProgressed(final BackEvent backEvent) {
                    i.this.V(backEvent);
                }
                
                public void onBackStarted(final BackEvent backEvent) {
                    i.this.R(backEvent);
                }
            };
        }
        return new h(this);
    }
    
    public k L() {
        if (this.getIntent().hasExtra("background_mode")) {
            return u5.k.valueOf(this.getIntent().getStringExtra("background_mode"));
        }
        return u5.k.o;
    }
    
    public a M() {
        return this.p.n();
    }
    
    public Bundle N() {
        return ((Context)this).getPackageManager().getActivityInfo(this.getComponentName(), 128).metaData;
    }
    
    public final boolean O() {
        return (((Context)this).getApplicationInfo().flags & 0x2) != 0x0;
    }
    
    public void P() {
        if (Build$VERSION.SDK_INT >= 33) {
            u5.g.a(e.a(this), 0, this.r);
            this.o = true;
        }
    }
    
    public void Q() {
        this.U();
        final j p = this.p;
        if (p != null) {
            p.J();
            this.p = null;
        }
    }
    
    public void R(final BackEvent backEvent) {
        if (this.S("startBackGesture")) {
            this.p.L(backEvent);
        }
    }
    
    public final boolean S(final String s) {
        final j p = this.p;
        String str;
        StringBuilder sb2;
        if (p == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(this.hashCode());
            sb.append(" ");
            sb.append(s);
            str = " called after release.";
            sb2 = sb;
        }
        else {
            if (p.o()) {
                return true;
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("FlutterActivity ");
            sb3.append(this.hashCode());
            sb3.append(" ");
            sb3.append(s);
            final String s2 = " called after detach.";
            sb2 = sb3;
            str = s2;
        }
        sb2.append(str);
        b.g("FlutterActivity", sb2.toString());
        return false;
    }
    
    public final void T() {
        while (true) {
            while (true) {
                try {
                    final Bundle n = this.N();
                    if (n != null) {
                        final int int1 = ((BaseBundle)n).getInt("io.flutter.embedding.android.NormalTheme", -1);
                        if (int1 != -1) {
                            ((Context)this).setTheme(int1);
                        }
                        return;
                    }
                    b.f("FlutterActivity", "Using the launch theme as normal theme.");
                    return;
                    b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
                    return;
                }
                catch (PackageManager$NameNotFoundException ex) {}
                continue;
            }
        }
    }
    
    public void U() {
        if (Build$VERSION.SDK_INT >= 33) {
            f.a(e.a(this), this.r);
            this.o = false;
        }
    }
    
    public void V(final BackEvent backEvent) {
        if (this.S("updateBackGestureProgress")) {
            this.p.M(backEvent);
        }
    }
    
    public boolean a() {
        return false;
    }
    
    public void b() {
    }
    
    public Activity c() {
        return this;
    }
    
    public void d() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FlutterActivity ");
        sb.append(this);
        sb.append(" connection to the engine ");
        sb.append(this.M());
        sb.append(" evicted by another attaching activity");
        b.g("FlutterActivity", sb.toString());
        final j p = this.p;
        if (p != null) {
            p.v();
            this.p.w();
        }
    }
    
    public void e() {
        if (Build$VERSION.SDK_INT >= 29) {
            this.reportFullyDrawn();
        }
    }
    
    public void f(final boolean b) {
        if (b && !this.o) {
            this.P();
            return;
        }
        if (!b && this.o) {
            this.U();
        }
    }
    
    public d g() {
        return this.q;
    }
    
    public Context getContext() {
        return (Context)this;
    }
    
    public String h() {
        return this.getIntent().getStringExtra("cached_engine_group_id");
    }
    
    public String i() {
        if (this.getIntent().hasExtra("route")) {
            return this.getIntent().getStringExtra("route");
        }
        String string = null;
        try {
            final Bundle n = this.N();
            if (n != null) {
                string = ((BaseBundle)n).getString("io.flutter.InitialRoute");
            }
            return string;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public void l(final s s) {
    }
    
    public List m() {
        return (List)this.getIntent().getSerializableExtra("dart_entrypoint_args");
    }
    
    public boolean n() {
        return true;
    }
    
    public boolean o() {
        boolean b = this.getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        if (this.q() == null) {
            if (this.p.p()) {
                return b;
            }
            b = this.getIntent().getBooleanExtra("destroy_engine_with_activity", true);
        }
        return b;
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        if (this.S("onActivityResult")) {
            this.p.r(n, n2, intent);
        }
    }
    
    public void onBackPressed() {
        if (this.S("onBackPressed")) {
            this.p.t();
        }
    }
    
    public void onCreate(final Bundle bundle) {
        this.T();
        super.onCreate(bundle);
        (this.p = new j((j.c)this)).s((Context)this);
        this.p.B(bundle);
        this.q.h(d.b.ON_CREATE);
        this.I();
        this.setContentView(this.J());
        this.H();
    }
    
    public void onDestroy() {
        super.onDestroy();
        if (this.S("onDestroy")) {
            this.p.v();
            this.p.w();
        }
        this.Q();
        this.q.h(d.b.ON_DESTROY);
    }
    
    public void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        if (this.S("onNewIntent")) {
            this.p.x(intent);
        }
    }
    
    public void onPause() {
        super.onPause();
        if (this.S("onPause")) {
            this.p.y();
        }
        this.q.h(d.b.ON_PAUSE);
    }
    
    public void onPostResume() {
        super.onPostResume();
        if (this.S("onPostResume")) {
            this.p.z();
        }
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        if (this.S("onRequestPermissionsResult")) {
            this.p.A(n, array, array2);
        }
    }
    
    public void onResume() {
        super.onResume();
        this.q.h(d.b.ON_RESUME);
        if (this.S("onResume")) {
            this.p.C();
        }
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.S("onSaveInstanceState")) {
            this.p.D(bundle);
        }
    }
    
    public void onStart() {
        super.onStart();
        this.q.h(d.b.ON_START);
        if (this.S("onStart")) {
            this.p.E();
        }
    }
    
    public void onStop() {
        super.onStop();
        if (this.S("onStop")) {
            this.p.F();
        }
        this.q.h(d.b.ON_STOP);
    }
    
    public void onTrimMemory(final int n) {
        super.onTrimMemory(n);
        if (this.S("onTrimMemory")) {
            this.p.G(n);
        }
    }
    
    public void onUserLeaveHint() {
        if (this.S("onUserLeaveHint")) {
            this.p.H();
        }
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (this.S("onWindowFocusChanged")) {
            this.p.I(b);
        }
    }
    
    public boolean p() {
        return true;
    }
    
    public String q() {
        return this.getIntent().getStringExtra("cached_engine_id");
    }
    
    public boolean r() {
        if (this.getIntent().hasExtra("enable_state_restoration")) {
            return this.getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        return this.q() == null;
    }
    
    public String s() {
        String s = "main";
        if (this.getIntent().hasExtra("dart_entrypoint")) {
            return this.getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            final Bundle n = this.N();
            String string;
            if (n != null) {
                string = ((BaseBundle)n).getString("io.flutter.Entrypoint");
            }
            else {
                string = null;
            }
            if (string != null) {
                s = string;
            }
            return s;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return "main";
        }
    }
    
    public void t(final a a) {
    }
    
    public String u() {
        String string = null;
        try {
            final Bundle n = this.N();
            if (n != null) {
                string = ((BaseBundle)n).getString("io.flutter.EntrypointUri");
            }
            return string;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public io.flutter.plugin.platform.h v(final Activity activity, final a a) {
        return new io.flutter.plugin.platform.h(this.c(), a.p(), (h.d)this);
    }
    
    public String w() {
        if (this.O() && "android.intent.action.RUN".equals(this.getIntent().getAction())) {
            final String dataString = this.getIntent().getDataString();
            if (dataString != null) {
                return dataString;
            }
        }
        return null;
    }
    
    public void x(final t t) {
    }
    
    public boolean y() {
        boolean boolean1 = false;
        try {
            final Bundle n = this.N();
            if (n != null) {
                boolean1 = ((BaseBundle)n).getBoolean("flutter_deeplinking_enabled");
            }
            return boolean1;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    public v5.j z() {
        return v5.j.a(this.getIntent());
    }
}
