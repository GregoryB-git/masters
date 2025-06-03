/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.window.BackEvent
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package u5;

import D5.o;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.d;
import io.flutter.embedding.engine.a;
import io.flutter.plugin.platform.h;
import java.io.Serializable;
import java.util.List;
import t5.b;
import u5.O;
import u5.P;
import u5.e;
import u5.f;
import u5.g;
import u5.h;
import u5.j;
import u5.k;
import u5.s;
import u5.t;

public abstract class i
extends Activity
implements j.c,
androidx.lifecycle.h {
    public static final int s = View.generateViewId();
    public boolean o = false;
    public j p;
    public androidx.lifecycle.i q;
    public final OnBackInvokedCallback r;

    public i() {
        OnBackInvokedCallback onBackInvokedCallback = Build.VERSION.SDK_INT < 33 ? null : this.K();
        this.r = onBackInvokedCallback;
        this.q = new androidx.lifecycle.i(this);
    }

    @Override
    public O A() {
        if (this.L() == k.o) {
            return O.o;
        }
        return O.p;
    }

    @Override
    public boolean B() {
        return true;
    }

    @Override
    public P D() {
        if (this.L() == k.o) {
            return P.o;
        }
        return P.p;
    }

    @Override
    public void E(a a8) {
        if (this.p.p()) {
            return;
        }
        C5.a.a(a8);
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
        Window window = this.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    public final void I() {
        if (this.L() == k.p) {
            this.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(0));
        }
    }

    public final View J() {
        int n8;
        j j8;
        boolean bl;
        j8 = this.p;
        n8 = s;
        bl = this.A() == O.o;
        return j8.u(null, null, null, n8, bl);
    }

    public final OnBackInvokedCallback K() {
        if (Build.VERSION.SDK_INT >= 34) {
            return new OnBackAnimationCallback(){

                public void onBackCancelled() {
                    i.this.F();
                }

                public void onBackInvoked() {
                    i.this.G();
                }

                public void onBackProgressed(BackEvent backEvent) {
                    i.this.V(backEvent);
                }

                public void onBackStarted(BackEvent backEvent) {
                    i.this.R(backEvent);
                }
            };
        }
        return new h(this);
    }

    public k L() {
        if (this.getIntent().hasExtra("background_mode")) {
            return k.valueOf(this.getIntent().getStringExtra("background_mode"));
        }
        return k.o;
    }

    public a M() {
        return this.p.n();
    }

    public Bundle N() {
        return this.getPackageManager().getActivityInfo((ComponentName)this.getComponentName(), (int)128).metaData;
    }

    public final boolean O() {
        if ((this.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public void P() {
        if (Build.VERSION.SDK_INT >= 33) {
            g.a(e.a(this), 0, this.r);
            this.o = true;
        }
    }

    public void Q() {
        this.U();
        j j8 = this.p;
        if (j8 != null) {
            j8.J();
            this.p = null;
        }
    }

    public void R(BackEvent backEvent) {
        if (this.S("startBackGesture")) {
            this.p.L(backEvent);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean S(String object) {
        Object object2 = this.p;
        if (object2 == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FlutterActivity ");
            stringBuilder.append(this.hashCode());
            stringBuilder.append(" ");
            stringBuilder.append((String)object);
            object2 = " called after release.";
            object = stringBuilder;
        } else {
            if (object2.o()) {
                return true;
            }
            object2 = new StringBuilder();
            object2.append("FlutterActivity ");
            object2.append(this.hashCode());
            object2.append(" ");
            object2.append((String)object);
            String string2 = " called after detach.";
            object = object2;
            object2 = string2;
        }
        object.append((String)object2);
        b.g("FlutterActivity", object.toString());
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void T() {
        try {
            Bundle bundle = this.N();
            if (bundle != null) {
                int n8 = bundle.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (n8 == -1) return;
                this.setTheme(n8);
                return;
            }
            b.f("FlutterActivity", "Using the launch theme as normal theme.");
            return;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
    }

    public void U() {
        if (Build.VERSION.SDK_INT >= 33) {
            f.a(e.a(this), this.r);
            this.o = false;
        }
    }

    public void V(BackEvent backEvent) {
        if (this.S("updateBackGestureProgress")) {
            this.p.M(backEvent);
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public void b() {
    }

    @Override
    public Activity c() {
        return this;
    }

    @Override
    public void d() {
        Object object = new StringBuilder();
        object.append("FlutterActivity ");
        object.append((Object)this);
        object.append(" connection to the engine ");
        object.append((Object)this.M());
        object.append(" evicted by another attaching activity");
        b.g("FlutterActivity", object.toString());
        object = this.p;
        if (object != null) {
            object.v();
            this.p.w();
        }
    }

    @Override
    public void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.reportFullyDrawn();
        }
    }

    @Override
    public void f(boolean bl) {
        if (bl && !this.o) {
            this.P();
            return;
        }
        if (!bl && this.o) {
            this.U();
        }
    }

    @Override
    public d g() {
        return this.q;
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public String h() {
        return this.getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override
    public String i() {
        String string2;
        block4 : {
            Bundle bundle;
            if (this.getIntent().hasExtra("route")) {
                return this.getIntent().getStringExtra("route");
            }
            string2 = null;
            try {
                bundle = this.N();
                if (bundle == null) break block4;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return null;
            }
            string2 = bundle.getString("io.flutter.InitialRoute");
        }
        return string2;
    }

    @Override
    public void l(s s8) {
    }

    @Override
    public List m() {
        return (List)this.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public boolean o() {
        boolean bl;
        boolean bl2 = bl = this.getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        if (this.q() == null) {
            if (this.p.p()) {
                return bl;
            }
            bl2 = this.getIntent().getBooleanExtra("destroy_engine_with_activity", true);
        }
        return bl2;
    }

    public void onActivityResult(int n8, int n9, Intent intent) {
        if (this.S("onActivityResult")) {
            this.p.r(n8, n9, intent);
        }
    }

    public void onBackPressed() {
        if (this.S("onBackPressed")) {
            this.p.t();
        }
    }

    public void onCreate(Bundle bundle) {
        j j8;
        this.T();
        super.onCreate(bundle);
        this.p = j8 = new j(this);
        j8.s((Context)this);
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

    public void onNewIntent(Intent intent) {
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

    public void onRequestPermissionsResult(int n8, String[] arrstring, int[] arrn) {
        if (this.S("onRequestPermissionsResult")) {
            this.p.A(n8, arrstring, arrn);
        }
    }

    public void onResume() {
        super.onResume();
        this.q.h(d.b.ON_RESUME);
        if (this.S("onResume")) {
            this.p.C();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
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

    public void onTrimMemory(int n8) {
        super.onTrimMemory(n8);
        if (this.S("onTrimMemory")) {
            this.p.G(n8);
        }
    }

    public void onUserLeaveHint() {
        if (this.S("onUserLeaveHint")) {
            this.p.H();
        }
    }

    public void onWindowFocusChanged(boolean bl) {
        super.onWindowFocusChanged(bl);
        if (this.S("onWindowFocusChanged")) {
            this.p.I(bl);
        }
    }

    @Override
    public boolean p() {
        return true;
    }

    @Override
    public String q() {
        return this.getIntent().getStringExtra("cached_engine_id");
    }

    @Override
    public boolean r() {
        if (this.getIntent().hasExtra("enable_state_restoration")) {
            return this.getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        if (this.q() != null) {
            return false;
        }
        return true;
    }

    @Override
    public String s() {
        Object object;
        Object object2;
        block6 : {
            block5 : {
                object2 = "main";
                if (this.getIntent().hasExtra("dart_entrypoint")) {
                    return this.getIntent().getStringExtra("dart_entrypoint");
                }
                try {
                    object = this.N();
                    if (object == null) break block5;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    return "main";
                }
                object = object.getString("io.flutter.Entrypoint");
                break block6;
            }
            object = null;
        }
        if (object != null) {
            object2 = object;
        }
        return object2;
    }

    @Override
    public void t(a a8) {
    }

    @Override
    public String u() {
        String string2;
        block3 : {
            Bundle bundle;
            string2 = null;
            try {
                bundle = this.N();
                if (bundle == null) break block3;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return null;
            }
            string2 = bundle.getString("io.flutter.EntrypointUri");
        }
        return string2;
    }

    @Override
    public io.flutter.plugin.platform.h v(Activity activity, a a8) {
        return new io.flutter.plugin.platform.h(this.c(), a8.p(), this);
    }

    @Override
    public String w() {
        String string2;
        if (this.O() && "android.intent.action.RUN".equals((Object)this.getIntent().getAction()) && (string2 = this.getIntent().getDataString()) != null) {
            return string2;
        }
        return null;
    }

    @Override
    public void x(t t8) {
    }

    @Override
    public boolean y() {
        boolean bl;
        block3 : {
            Bundle bundle;
            bl = false;
            try {
                bundle = this.N();
                if (bundle == null) break block3;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return false;
            }
            bl = bundle.getBoolean("flutter_deeplinking_enabled");
        }
        return bl;
    }

    @Override
    public v5.j z() {
        return v5.j.a(this.getIntent());
    }

}

