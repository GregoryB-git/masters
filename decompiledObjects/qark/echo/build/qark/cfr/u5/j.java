/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  android.window.BackEvent
 *  java.lang.AssertionError
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 */
package u5;

import B5.b;
import D5.k;
import D5.n;
import D5.v;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.window.BackEvent;
import io.flutter.embedding.engine.b;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.platform.h;
import io.flutter.plugin.platform.r;
import java.util.Arrays;
import java.util.List;
import u5.D;
import u5.O;
import u5.P;
import u5.d;
import u5.s;
import u5.t;
import w5.a;
import y5.f;

public class j
implements d {
    public c a;
    public io.flutter.embedding.engine.a b;
    public D c;
    public h d;
    public ViewTreeObserver.OnPreDrawListener e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Integer j;
    public io.flutter.embedding.engine.b k;
    public final io.flutter.embedding.engine.renderer.j l;

    public j(c c8) {
        this(c8, null);
    }

    public j(c c8, io.flutter.embedding.engine.b b8) {
        this.l = new io.flutter.embedding.engine.renderer.j(){

            @Override
            public void b() {
                j.this.a.b();
                j.this.g = false;
            }

            @Override
            public void e() {
                j.this.a.e();
                j.this.g = true;
                j.this.h = true;
            }
        };
        this.a = c8;
        this.h = false;
        this.k = b8;
    }

    public void A(int n8, String[] arrstring, int[] arrn) {
        this.l();
        if (this.b != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: ");
            stringBuilder.append(n8);
            stringBuilder.append("\npermissions: ");
            stringBuilder.append(Arrays.toString((Object[])arrstring));
            stringBuilder.append("\ngrantResults: ");
            stringBuilder.append(Arrays.toString((int[])arrn));
            t5.b.f("FlutterActivityAndFragmentDelegate", stringBuilder.toString());
            this.b.i().b(n8, arrstring, arrn);
            return;
        }
        t5.b.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
    }

    public void B(Bundle bundle) {
        byte[] arrby;
        t5.b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        this.l();
        if (bundle != null) {
            arrby = bundle.getBundle("plugins");
            byte[] arrby2 = bundle.getByteArray("framework");
            bundle = arrby;
            arrby = arrby2;
        } else {
            bundle = null;
            arrby = null;
        }
        if (this.a.r()) {
            this.b.u().j(arrby);
        }
        if (this.a.n()) {
            this.b.i().e(bundle);
        }
    }

    public void C() {
        io.flutter.embedding.engine.a a8;
        t5.b.f("FlutterActivityAndFragmentDelegate", "onResume()");
        this.l();
        if (this.a.p() && (a8 = this.b) != null) {
            a8.l().e();
        }
    }

    public void D(Bundle bundle) {
        t5.b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        this.l();
        if (this.a.r()) {
            bundle.putByteArray("framework", this.b.u().h());
        }
        if (this.a.n()) {
            Bundle bundle2 = new Bundle();
            this.b.i().g(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    public void E() {
        t5.b.f("FlutterActivityAndFragmentDelegate", "onStart()");
        this.l();
        this.k();
        Integer n8 = this.j;
        if (n8 != null) {
            this.c.setVisibility(n8);
        }
    }

    public void F() {
        io.flutter.embedding.engine.a a8;
        t5.b.f("FlutterActivityAndFragmentDelegate", "onStop()");
        this.l();
        if (this.a.p() && (a8 = this.b) != null) {
            a8.l().d();
        }
        this.j = this.c.getVisibility();
        this.c.setVisibility(8);
        a8 = this.b;
        if (a8 != null) {
            a8.t().j(40);
        }
    }

    public void G(int n8) {
        this.l();
        io.flutter.embedding.engine.a a8 = this.b;
        if (a8 != null) {
            if (this.h && n8 >= 10) {
                a8.k().m();
                this.b.x().a();
            }
            this.b.t().j(n8);
            this.b.q().Z(n8);
        }
    }

    public void H() {
        this.l();
        if (this.b != null) {
            t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.b.i().h();
            return;
        }
        t5.b.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
    }

    public void I(boolean bl) {
        this.l();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Received onWindowFocusChanged: ");
        Object object = bl ? "true" : "false";
        stringBuilder.append((String)object);
        t5.b.f("FlutterActivityAndFragmentDelegate", stringBuilder.toString());
        if (this.a.p() && (object = this.b) != null) {
            if (bl) {
                object.l().a();
                return;
            }
            object.l().f();
        }
    }

    public void J() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void K() {
        t5.b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        Object object = this.a.q();
        if (object != null) {
            io.flutter.embedding.engine.a a8;
            this.b = a8 = v5.a.b().a((String)object);
            this.f = true;
            if (a8 != null) {
                return;
            }
            a8 = new StringBuilder();
            a8.append("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '");
            a8.append((String)object);
            a8.append("'");
            throw new IllegalStateException(a8.toString());
        }
        object = this.a;
        this.b = object = object.C(object.getContext());
        if (object != null) {
            this.f = true;
            return;
        }
        object = this.a.h();
        if (object != null) {
            io.flutter.embedding.engine.b b8 = v5.c.b().a((String)object);
            if (b8 == null) {
                b8 = new StringBuilder();
                b8.append("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '");
                b8.append((String)object);
                b8.append("'");
                throw new IllegalStateException(b8.toString());
            }
            object = b8.a(this.g(new b.b(this.a.getContext())));
        } else {
            t5.b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
            io.flutter.embedding.engine.b b9 = this.k;
            object = b9;
            if (b9 == null) {
                object = new io.flutter.embedding.engine.b(this.a.getContext(), this.a.z().b());
            }
            object = object.a(this.g(new b.b(this.a.getContext()).h(false).l(this.a.r())));
        }
        this.b = object;
        this.f = false;
    }

    public void L(BackEvent backEvent) {
        this.l();
        if (this.b != null) {
            t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding startBackGesture() to FlutterEngine.");
            this.b.j().d(backEvent);
            return;
        }
        t5.b.g("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
    }

    public void M(BackEvent backEvent) {
        this.l();
        if (this.b != null) {
            t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding updateBackGestureProgress() to FlutterEngine.");
            this.b.j().e(backEvent);
            return;
        }
        t5.b.g("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
    }

    public void N() {
        h h8 = this.d;
        if (h8 != null) {
            h8.E();
        }
    }

    @Override
    public void d() {
        if (!this.a.o()) {
            this.a.d();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The internal FlutterEngine created by ");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(" has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        throw new AssertionError((Object)stringBuilder.toString());
    }

    public final b.b g(b.b b8) {
        String string2;
        String string3;
        block6 : {
            block5 : {
                string2 = this.a.w();
                if (string2 == null) break block5;
                string3 = string2;
                if (!string2.isEmpty()) break block6;
            }
            string3 = t5.a.e().c().j();
        }
        a.c c8 = new a.c(string3, this.a.s());
        string3 = string2 = this.a.i();
        if (string2 == null) {
            string3 = string2 = this.q(this.a.c().getIntent());
            if (string2 == null) {
                string3 = "/";
            }
        }
        return b8.i(c8).k(string3).j(this.a.m());
    }

    public void h() {
        this.l();
        if (this.b != null) {
            t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding cancelBackGesture() to FlutterEngine.");
            this.b.j().b();
            return;
        }
        t5.b.g("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
    }

    public void i() {
        this.l();
        if (this.b != null) {
            t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding commitBackGesture() to FlutterEngine.");
            this.b.j().c();
            return;
        }
        t5.b.g("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
    }

    public final void j(final D d8) {
        if (this.a.A() == O.o) {
            if (this.e != null) {
                d8.getViewTreeObserver().removeOnPreDrawListener(this.e);
            }
            this.e = new ViewTreeObserver.OnPreDrawListener(){

                public boolean onPreDraw() {
                    if (j.this.g && j.this.e != null) {
                        d8.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
                        j.this.e = null;
                    }
                    return j.this.g;
                }
            };
            d8.getViewTreeObserver().addOnPreDrawListener(this.e);
            return;
        }
        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
    }

    public final void k() {
        Object object;
        String string2;
        block10 : {
            block9 : {
                if (this.a.q() != null) {
                    return;
                }
                if (this.b.k().l()) {
                    return;
                }
                String string3 = this.a.i();
                object = string3;
                if (string3 == null) {
                    string3 = this.q(this.a.c().getIntent());
                    object = string3;
                    if (string3 == null) {
                        object = "/";
                    }
                }
                string2 = this.a.u();
                string3 = new StringBuilder();
                string3.append("Executing Dart entrypoint: ");
                string3.append(this.a.s());
                string3.append(", library uri: ");
                string3.append(string2);
                if (string3.toString() == null) {
                    string3 = "\"\"";
                } else {
                    string3 = new StringBuilder();
                    string3.append(string2);
                    string3.append(", and sending initial route: ");
                    string3.append((String)object);
                    string3 = string3.toString();
                }
                t5.b.f("FlutterActivityAndFragmentDelegate", string3);
                this.b.o().c((String)object);
                string3 = this.a.w();
                if (string3 == null) break block9;
                object = string3;
                if (!string3.isEmpty()) break block10;
            }
            object = t5.a.e().c().j();
        }
        object = string2 == null ? new a.c((String)object, this.a.s()) : new a.c((String)object, string2, this.a.s());
        this.b.k().k((a.c)object, this.a.m());
    }

    public final void l() {
        if (this.a != null) {
            return;
        }
        throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
    }

    public Activity m() {
        Activity activity = this.a.c();
        if (activity != null) {
            return activity;
        }
        throw new AssertionError((Object)"FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    public io.flutter.embedding.engine.a n() {
        return this.b;
    }

    public boolean o() {
        return this.i;
    }

    public boolean p() {
        return this.f;
    }

    public final String q(Intent intent) {
        if (this.a.y() && (intent = intent.getData()) != null) {
            return intent.toString();
        }
        return null;
    }

    public void r(int n8, int n9, Intent intent) {
        this.l();
        if (this.b != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Forwarding onActivityResult() to FlutterEngine:\nrequestCode: ");
            stringBuilder.append(n8);
            stringBuilder.append("\nresultCode: ");
            stringBuilder.append(n9);
            stringBuilder.append("\ndata: ");
            stringBuilder.append((Object)intent);
            t5.b.f("FlutterActivityAndFragmentDelegate", stringBuilder.toString());
            this.b.i().a(n8, n9, intent);
            return;
        }
        t5.b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
    }

    public void s(Context object) {
        this.l();
        if (this.b == null) {
            this.K();
        }
        if (this.a.n()) {
            t5.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.b.i().i(this, this.a.g());
        }
        object = this.a;
        this.d = object.v(object.c(), this.b);
        this.a.E(this.b);
        this.i = true;
    }

    public void t() {
        this.l();
        if (this.b != null) {
            t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.b.o().a();
            return;
        }
        t5.b.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
    }

    /*
     * Enabled aggressive block sorting
     */
    public View u(LayoutInflater object, ViewGroup object2, Bundle bundle, int n8, boolean bl) {
        t5.b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        this.l();
        object = this.a.A();
        object2 = O.o;
        boolean bl2 = false;
        boolean bl3 = false;
        if (object == object2) {
            object = this.a.getContext();
            if (this.a.D() == P.p) {
                bl3 = true;
            }
            object = new s((Context)object, bl3);
            this.a.l((s)object);
            object = new D(this.a.getContext(), (s)object);
        } else {
            object = new t(this.a.getContext());
            bl3 = bl2;
            if (this.a.D() == P.o) {
                bl3 = true;
            }
            object.setOpaque(bl3);
            this.a.x((t)object);
            object = new D(this.a.getContext(), (t)object);
        }
        this.c = object;
        this.c.l(this.l);
        if (this.a.B()) {
            t5.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
            this.c.n(this.b);
        }
        this.c.setId(n8);
        if (bl) {
            this.j(this.c);
        }
        return this.c;
    }

    public void v() {
        D d8;
        t5.b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        this.l();
        if (this.e != null) {
            this.c.getViewTreeObserver().removeOnPreDrawListener(this.e);
            this.e = null;
        }
        if ((d8 = this.c) != null) {
            d8.s();
            this.c.y(this.l);
        }
    }

    public void w() {
        Object object;
        if (!this.i) {
            return;
        }
        t5.b.f("FlutterActivityAndFragmentDelegate", "onDetach()");
        this.l();
        this.a.t(this.b);
        if (this.a.n()) {
            t5.b.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.a.c().isChangingConfigurations()) {
                this.b.i().d();
            } else {
                this.b.i().f();
            }
        }
        if ((object = this.d) != null) {
            object.q();
            this.d = null;
        }
        if (this.a.p() && (object = this.b) != null) {
            object.l().b();
        }
        if (this.a.o()) {
            this.b.g();
            if (this.a.q() != null) {
                v5.a.b().d(this.a.q());
            }
            this.b = null;
        }
        this.i = false;
    }

    public void x(Intent object) {
        this.l();
        if (this.b != null) {
            t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
            this.b.i().onNewIntent((Intent)object);
            object = this.q((Intent)object);
            if (object != null && !object.isEmpty()) {
                this.b.o().b((String)object);
                return;
            }
        } else {
            t5.b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    public void y() {
        io.flutter.embedding.engine.a a8;
        t5.b.f("FlutterActivityAndFragmentDelegate", "onPause()");
        this.l();
        if (this.a.p() && (a8 = this.b) != null) {
            a8.l().c();
        }
    }

    public void z() {
        t5.b.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        this.l();
        if (this.b != null) {
            this.N();
            this.b.q().Y();
            return;
        }
        t5.b.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
    }

    public static interface c
    extends h.d {
        public O A();

        public boolean B();

        public io.flutter.embedding.engine.a C(Context var1);

        public P D();

        public void E(io.flutter.embedding.engine.a var1);

        public void b();

        public Activity c();

        public void d();

        public void e();

        public androidx.lifecycle.d g();

        public Context getContext();

        public String h();

        public String i();

        public void l(s var1);

        public List m();

        public boolean n();

        public boolean o();

        public boolean p();

        public String q();

        public boolean r();

        public String s();

        public void t(io.flutter.embedding.engine.a var1);

        public String u();

        public h v(Activity var1, io.flutter.embedding.engine.a var2);

        public String w();

        public void x(t var1);

        public boolean y();

        public v5.j z();
    }

}

