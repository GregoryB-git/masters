// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u5;

import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.net.Uri;
import android.content.Intent;
import android.app.Activity;
import android.window.BackEvent;
import v5.c;
import android.os.Bundle;
import java.util.Arrays;
import io.flutter.embedding.engine.b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import io.flutter.plugin.platform.h;
import io.flutter.embedding.engine.a;

public class j implements d
{
    public c a;
    public a b;
    public D c;
    public h d;
    public ViewTreeObserver$OnPreDrawListener e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Integer j;
    public b k;
    public final io.flutter.embedding.engine.renderer.j l;
    
    public j(final c c) {
        this(c, null);
    }
    
    public j(final c a, final b k) {
        this.l = new io.flutter.embedding.engine.renderer.j() {
            @Override
            public void b() {
                j.a(j.this).b();
                j.c(j.this, false);
            }
            
            @Override
            public void e() {
                j.a(j.this).e();
                j.c(j.this, true);
                j.f(j.this, true);
            }
        };
        this.a = a;
        this.h = false;
        this.k = k;
    }
    
    public static /* synthetic */ c a(final j j) {
        return j.a;
    }
    
    public static /* synthetic */ boolean b(final j j) {
        return j.g;
    }
    
    public static /* synthetic */ boolean c(final j j, final boolean g) {
        return j.g = g;
    }
    
    public static /* synthetic */ boolean f(final j j, final boolean h) {
        return j.h = h;
    }
    
    public void A(final int i, final String[] a, final int[] a2) {
        this.l();
        if (this.b != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: ");
            sb.append(i);
            sb.append("\npermissions: ");
            sb.append(Arrays.toString(a));
            sb.append("\ngrantResults: ");
            sb.append(Arrays.toString(a2));
            t5.b.f("FlutterActivityAndFragmentDelegate", sb.toString());
            this.b.i().b(i, a, a2);
            return;
        }
        t5.b.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
    }
    
    public void B(Bundle bundle) {
        t5.b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        this.l();
        byte[] array;
        if (bundle != null) {
            final Bundle bundle2 = bundle.getBundle("plugins");
            final byte[] byteArray = bundle.getByteArray("framework");
            bundle = bundle2;
            array = byteArray;
        }
        else {
            bundle = null;
            array = null;
        }
        if (this.a.r()) {
            this.b.u().j(array);
        }
        if (this.a.n()) {
            this.b.i().e(bundle);
        }
    }
    
    public void C() {
        t5.b.f("FlutterActivityAndFragmentDelegate", "onResume()");
        this.l();
        if (this.a.p()) {
            final a b = this.b;
            if (b != null) {
                b.l().e();
            }
        }
    }
    
    public void D(final Bundle bundle) {
        t5.b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        this.l();
        if (this.a.r()) {
            bundle.putByteArray("framework", this.b.u().h());
        }
        if (this.a.n()) {
            final Bundle bundle2 = new Bundle();
            this.b.i().g(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }
    
    public void E() {
        t5.b.f("FlutterActivityAndFragmentDelegate", "onStart()");
        this.l();
        this.k();
        final Integer j = this.j;
        if (j != null) {
            this.c.setVisibility(j);
        }
    }
    
    public void F() {
        t5.b.f("FlutterActivityAndFragmentDelegate", "onStop()");
        this.l();
        if (this.a.p()) {
            final a b = this.b;
            if (b != null) {
                b.l().d();
            }
        }
        this.j = ((View)this.c).getVisibility();
        this.c.setVisibility(8);
        final a b2 = this.b;
        if (b2 != null) {
            b2.t().j(40);
        }
    }
    
    public void G(final int n) {
        this.l();
        final a b = this.b;
        if (b != null) {
            if (this.h && n >= 10) {
                b.k().m();
                this.b.x().a();
            }
            this.b.t().j(n);
            this.b.q().Z(n);
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
    
    public void I(final boolean b) {
        this.l();
        final StringBuilder sb = new StringBuilder();
        sb.append("Received onWindowFocusChanged: ");
        String str;
        if (b) {
            str = "true";
        }
        else {
            str = "false";
        }
        sb.append(str);
        t5.b.f("FlutterActivityAndFragmentDelegate", sb.toString());
        if (this.a.p()) {
            final a b2 = this.b;
            if (b2 != null) {
                if (b) {
                    b2.l().a();
                    return;
                }
                b2.l().f();
            }
        }
    }
    
    public void J() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
    
    public void K() {
        t5.b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        final String q = this.a.q();
        if (q != null) {
            final a a = v5.a.b().a(q);
            this.b = a;
            this.f = true;
            if (a != null) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '");
            sb.append(q);
            sb.append("'");
            throw new IllegalStateException(sb.toString());
        }
        else {
            final c a2 = this.a;
            if ((this.b = a2.C(a2.getContext())) != null) {
                this.f = true;
                return;
            }
            final String h = this.a.h();
            a b;
            if (h != null) {
                final b a3 = v5.c.b().a(h);
                if (a3 == null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '");
                    sb2.append(h);
                    sb2.append("'");
                    throw new IllegalStateException(sb2.toString());
                }
                b = a3.a(this.g(new b.b(this.a.getContext())));
            }
            else {
                t5.b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
                b k;
                if ((k = this.k) == null) {
                    k = new b(this.a.getContext(), this.a.z().b());
                }
                b = k.a(this.g(new b.b(this.a.getContext()).h(false).l(this.a.r())));
            }
            this.b = b;
            this.f = false;
        }
    }
    
    public void L(final BackEvent backEvent) {
        this.l();
        if (this.b != null) {
            t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding startBackGesture() to FlutterEngine.");
            this.b.j().d(backEvent);
            return;
        }
        t5.b.g("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
    }
    
    public void M(final BackEvent backEvent) {
        this.l();
        if (this.b != null) {
            t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding updateBackGestureProgress() to FlutterEngine.");
            this.b.j().e(backEvent);
            return;
        }
        t5.b.g("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
    }
    
    public void N() {
        final h d = this.d;
        if (d != null) {
            d.E();
        }
    }
    
    @Override
    public void d() {
        if (!this.a.o()) {
            this.a.d();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("The internal FlutterEngine created by ");
        sb.append(this.a);
        sb.append(" has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        throw new AssertionError((Object)sb.toString());
    }
    
    public final b.b g(final b.b b) {
        final String w = this.a.w();
        String j = null;
        Label_0033: {
            if (w != null) {
                j = w;
                if (!w.isEmpty()) {
                    break Label_0033;
                }
            }
            j = t5.a.e().c().j();
        }
        final w5.a.c c = new w5.a.c(j, this.a.s());
        String s;
        if ((s = this.a.i()) == null && (s = this.q(this.a.c().getIntent())) == null) {
            s = "/";
        }
        return b.i(c).k(s).j(this.a.m());
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
    
    public final void j(final D d) {
        if (this.a.A() == O.o) {
            if (this.e != null) {
                ((View)d).getViewTreeObserver().removeOnPreDrawListener(this.e);
            }
            this.e = (ViewTreeObserver$OnPreDrawListener)new ViewTreeObserver$OnPreDrawListener() {
                public boolean onPreDraw() {
                    if (u5.j.b(u5.j.this) && u5.j.this.e != null) {
                        ((View)d).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                        u5.j.this.e = null;
                    }
                    return u5.j.b(u5.j.this);
                }
            };
            ((View)d).getViewTreeObserver().addOnPreDrawListener(this.e);
            return;
        }
        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
    }
    
    public final void k() {
        if (this.a.q() != null) {
            return;
        }
        if (this.b.k().l()) {
            return;
        }
        String str;
        if ((str = this.a.i()) == null && (str = this.q(this.a.c().getIntent())) == null) {
            str = "/";
        }
        final String u = this.a.u();
        final StringBuilder sb = new StringBuilder();
        sb.append("Executing Dart entrypoint: ");
        sb.append(this.a.s());
        sb.append(", library uri: ");
        sb.append(u);
        String string;
        if (sb.toString() == null) {
            string = "\"\"";
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(u);
            sb2.append(", and sending initial route: ");
            sb2.append(str);
            string = sb2.toString();
        }
        t5.b.f("FlutterActivityAndFragmentDelegate", string);
        this.b.o().c(str);
        final String w = this.a.w();
        String j = null;
        Label_0221: {
            if (w != null) {
                j = w;
                if (!w.isEmpty()) {
                    break Label_0221;
                }
            }
            j = t5.a.e().c().j();
        }
        w5.a.c c;
        if (u == null) {
            c = new w5.a.c(j, this.a.s());
        }
        else {
            c = new w5.a.c(j, u, this.a.s());
        }
        this.b.k().k(c, this.a.m());
    }
    
    public final void l() {
        if (this.a != null) {
            return;
        }
        throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
    }
    
    public Activity m() {
        final Activity c = this.a.c();
        if (c != null) {
            return c;
        }
        throw new AssertionError((Object)"FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }
    
    public a n() {
        return this.b;
    }
    
    public boolean o() {
        return this.i;
    }
    
    public boolean p() {
        return this.f;
    }
    
    public final String q(final Intent intent) {
        if (this.a.y()) {
            final Uri data = intent.getData();
            if (data != null) {
                return data.toString();
            }
        }
        return null;
    }
    
    public void r(final int i, final int j, final Intent obj) {
        this.l();
        if (this.b != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Forwarding onActivityResult() to FlutterEngine:\nrequestCode: ");
            sb.append(i);
            sb.append("\nresultCode: ");
            sb.append(j);
            sb.append("\ndata: ");
            sb.append(obj);
            t5.b.f("FlutterActivityAndFragmentDelegate", sb.toString());
            this.b.i().a(i, j, obj);
            return;
        }
        t5.b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
    }
    
    public void s(final Context context) {
        this.l();
        if (this.b == null) {
            this.K();
        }
        if (this.a.n()) {
            t5.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.b.i().i(this, this.a.g());
        }
        final c a = this.a;
        this.d = a.v(a.c(), this.b);
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
    
    public View u(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle, final int id, final boolean b) {
        t5.b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        this.l();
        final O a = this.a.A();
        final O o = O.o;
        final boolean b2 = false;
        boolean b3 = false;
        D c;
        if (a == o) {
            final Context context = this.a.getContext();
            if (this.a.D() == P.p) {
                b3 = true;
            }
            final s s = new s(context, b3);
            this.a.l(s);
            c = new D(this.a.getContext(), s);
        }
        else {
            final t t = new t(this.a.getContext());
            boolean opaque = b2;
            if (this.a.D() == P.o) {
                opaque = true;
            }
            t.setOpaque(opaque);
            this.a.x(t);
            c = new D(this.a.getContext(), t);
        }
        (this.c = c).l(this.l);
        if (this.a.B()) {
            t5.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
            this.c.n(this.b);
        }
        ((View)this.c).setId(id);
        if (b) {
            this.j(this.c);
        }
        return (View)this.c;
    }
    
    public void v() {
        t5.b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        this.l();
        if (this.e != null) {
            ((View)this.c).getViewTreeObserver().removeOnPreDrawListener(this.e);
            this.e = null;
        }
        final D c = this.c;
        if (c != null) {
            c.s();
            this.c.y(this.l);
        }
    }
    
    public void w() {
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
            }
            else {
                this.b.i().f();
            }
        }
        final h d = this.d;
        if (d != null) {
            d.q();
            this.d = null;
        }
        if (this.a.p()) {
            final a b = this.b;
            if (b != null) {
                b.l().b();
            }
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
    
    public void x(final Intent intent) {
        this.l();
        if (this.b != null) {
            t5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
            this.b.i().onNewIntent(intent);
            final String q = this.q(intent);
            if (q != null && !q.isEmpty()) {
                this.b.o().b(q);
            }
        }
        else {
            t5.b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
        }
    }
    
    public void y() {
        t5.b.f("FlutterActivityAndFragmentDelegate", "onPause()");
        this.l();
        if (this.a.p()) {
            final a b = this.b;
            if (b != null) {
                b.l().c();
            }
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
    
    public interface c extends h.d
    {
        O A();
        
        boolean B();
        
        a C(final Context p0);
        
        P D();
        
        void E(final a p0);
        
        void b();
        
        Activity c();
        
        void d();
        
        void e();
        
        androidx.lifecycle.d g();
        
        Context getContext();
        
        String h();
        
        String i();
        
        void l(final s p0);
        
        List m();
        
        boolean n();
        
        boolean o();
        
        boolean p();
        
        String q();
        
        boolean r();
        
        String s();
        
        void t(final a p0);
        
        String u();
        
        h v(final Activity p0, final a p1);
        
        String w();
        
        void x(final t p0);
        
        boolean y();
        
        v5.j z();
    }
}
