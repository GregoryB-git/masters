package u5;

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
import io.flutter.plugin.platform.h;
import java.util.Arrays;
import java.util.List;
import t5.AbstractC1995b;
import t5.C1994a;
import v5.C2062a;
import v5.C2064c;
import v5.C2071j;
import w5.C2105a;

/* renamed from: u5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2023j implements InterfaceC2017d {

    /* renamed from: a, reason: collision with root package name */
    public c f19911a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.a f19912b;

    /* renamed from: c, reason: collision with root package name */
    public D f19913c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.h f19914d;

    /* renamed from: e, reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f19915e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19916f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19917g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19918h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19919i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f19920j;

    /* renamed from: k, reason: collision with root package name */
    public io.flutter.embedding.engine.b f19921k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.j f19922l;

    /* renamed from: u5.j$a */
    public class a implements io.flutter.embedding.engine.renderer.j {
        public a() {
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void b() {
            C2023j.this.f19911a.b();
            C2023j.this.f19917g = false;
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void e() {
            C2023j.this.f19911a.e();
            C2023j.this.f19917g = true;
            C2023j.this.f19918h = true;
        }
    }

    /* renamed from: u5.j$b */
    public class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ D f19924o;

        public b(D d7) {
            this.f19924o = d7;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (C2023j.this.f19917g && C2023j.this.f19915e != null) {
                this.f19924o.getViewTreeObserver().removeOnPreDrawListener(this);
                C2023j.this.f19915e = null;
            }
            return C2023j.this.f19917g;
        }
    }

    /* renamed from: u5.j$c */
    public interface c extends h.d {
        O A();

        boolean B();

        io.flutter.embedding.engine.a C(Context context);

        P D();

        void E(io.flutter.embedding.engine.a aVar);

        void b();

        Activity c();

        void d();

        void e();

        androidx.lifecycle.d g();

        Context getContext();

        String h();

        String i();

        void l(s sVar);

        List m();

        boolean n();

        boolean o();

        boolean p();

        String q();

        boolean r();

        String s();

        void t(io.flutter.embedding.engine.a aVar);

        String u();

        io.flutter.plugin.platform.h v(Activity activity, io.flutter.embedding.engine.a aVar);

        String w();

        void x(t tVar);

        boolean y();

        C2071j z();
    }

    public C2023j(c cVar) {
        this(cVar, null);
    }

    public void A(int i7, String[] strArr, int[] iArr) {
        l();
        if (this.f19912b == null) {
            AbstractC1995b.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i7 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.f19912b.i().b(i7, strArr, iArr);
    }

    public void B(Bundle bundle) {
        Bundle bundle2;
        byte[] bArr;
        AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        l();
        if (bundle != null) {
            bundle2 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
        } else {
            bundle2 = null;
            bArr = null;
        }
        if (this.f19911a.r()) {
            this.f19912b.u().j(bArr);
        }
        if (this.f19911a.n()) {
            this.f19912b.i().e(bundle2);
        }
    }

    public void C() {
        io.flutter.embedding.engine.a aVar;
        AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "onResume()");
        l();
        if (!this.f19911a.p() || (aVar = this.f19912b) == null) {
            return;
        }
        aVar.l().e();
    }

    public void D(Bundle bundle) {
        AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        l();
        if (this.f19911a.r()) {
            bundle.putByteArray("framework", this.f19912b.u().h());
        }
        if (this.f19911a.n()) {
            Bundle bundle2 = new Bundle();
            this.f19912b.i().g(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    public void E() {
        AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "onStart()");
        l();
        k();
        Integer num = this.f19920j;
        if (num != null) {
            this.f19913c.setVisibility(num.intValue());
        }
    }

    public void F() {
        io.flutter.embedding.engine.a aVar;
        AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "onStop()");
        l();
        if (this.f19911a.p() && (aVar = this.f19912b) != null) {
            aVar.l().d();
        }
        this.f19920j = Integer.valueOf(this.f19913c.getVisibility());
        this.f19913c.setVisibility(8);
        io.flutter.embedding.engine.a aVar2 = this.f19912b;
        if (aVar2 != null) {
            aVar2.t().j(40);
        }
    }

    public void G(int i7) {
        l();
        io.flutter.embedding.engine.a aVar = this.f19912b;
        if (aVar != null) {
            if (this.f19918h && i7 >= 10) {
                aVar.k().m();
                this.f19912b.x().a();
            }
            this.f19912b.t().j(i7);
            this.f19912b.q().Z(i7);
        }
    }

    public void H() {
        l();
        if (this.f19912b == null) {
            AbstractC1995b.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f19912b.i().h();
        }
    }

    public void I(boolean z7) {
        io.flutter.embedding.engine.a aVar;
        l();
        StringBuilder sb = new StringBuilder();
        sb.append("Received onWindowFocusChanged: ");
        sb.append(z7 ? "true" : "false");
        AbstractC1995b.f("FlutterActivityAndFragmentDelegate", sb.toString());
        if (!this.f19911a.p() || (aVar = this.f19912b) == null) {
            return;
        }
        if (z7) {
            aVar.l().a();
        } else {
            aVar.l().f();
        }
    }

    public void J() {
        this.f19911a = null;
        this.f19912b = null;
        this.f19913c = null;
        this.f19914d = null;
    }

    public void K() {
        io.flutter.embedding.engine.a a7;
        AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String q7 = this.f19911a.q();
        if (q7 != null) {
            io.flutter.embedding.engine.a a8 = C2062a.b().a(q7);
            this.f19912b = a8;
            this.f19916f = true;
            if (a8 != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + q7 + "'");
        }
        c cVar = this.f19911a;
        io.flutter.embedding.engine.a C7 = cVar.C(cVar.getContext());
        this.f19912b = C7;
        if (C7 != null) {
            this.f19916f = true;
            return;
        }
        String h7 = this.f19911a.h();
        if (h7 != null) {
            io.flutter.embedding.engine.b a9 = C2064c.b().a(h7);
            if (a9 == null) {
                throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + h7 + "'");
            }
            a7 = a9.a(g(new b.C0219b(this.f19911a.getContext())));
        } else {
            AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
            io.flutter.embedding.engine.b bVar = this.f19921k;
            if (bVar == null) {
                bVar = new io.flutter.embedding.engine.b(this.f19911a.getContext(), this.f19911a.z().b());
            }
            a7 = bVar.a(g(new b.C0219b(this.f19911a.getContext()).h(false).l(this.f19911a.r())));
        }
        this.f19912b = a7;
        this.f19916f = false;
    }

    public void L(BackEvent backEvent) {
        l();
        if (this.f19912b == null) {
            AbstractC1995b.g("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "Forwarding startBackGesture() to FlutterEngine.");
            this.f19912b.j().d(backEvent);
        }
    }

    public void M(BackEvent backEvent) {
        l();
        if (this.f19912b == null) {
            AbstractC1995b.g("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "Forwarding updateBackGestureProgress() to FlutterEngine.");
            this.f19912b.j().e(backEvent);
        }
    }

    public void N() {
        io.flutter.plugin.platform.h hVar = this.f19914d;
        if (hVar != null) {
            hVar.E();
        }
    }

    @Override // u5.InterfaceC2017d
    public void d() {
        if (!this.f19911a.o()) {
            this.f19911a.d();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f19911a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    public final b.C0219b g(b.C0219b c0219b) {
        String w7 = this.f19911a.w();
        if (w7 == null || w7.isEmpty()) {
            w7 = C1994a.e().c().j();
        }
        C2105a.c cVar = new C2105a.c(w7, this.f19911a.s());
        String i7 = this.f19911a.i();
        if (i7 == null && (i7 = q(this.f19911a.c().getIntent())) == null) {
            i7 = "/";
        }
        return c0219b.i(cVar).k(i7).j(this.f19911a.m());
    }

    public void h() {
        l();
        if (this.f19912b == null) {
            AbstractC1995b.g("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "Forwarding cancelBackGesture() to FlutterEngine.");
            this.f19912b.j().b();
        }
    }

    public void i() {
        l();
        if (this.f19912b == null) {
            AbstractC1995b.g("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "Forwarding commitBackGesture() to FlutterEngine.");
            this.f19912b.j().c();
        }
    }

    public final void j(D d7) {
        if (this.f19911a.A() != O.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.f19915e != null) {
            d7.getViewTreeObserver().removeOnPreDrawListener(this.f19915e);
        }
        this.f19915e = new b(d7);
        d7.getViewTreeObserver().addOnPreDrawListener(this.f19915e);
    }

    public final void k() {
        String str;
        if (this.f19911a.q() == null && !this.f19912b.k().l()) {
            String i7 = this.f19911a.i();
            if (i7 == null && (i7 = q(this.f19911a.c().getIntent())) == null) {
                i7 = "/";
            }
            String u7 = this.f19911a.u();
            if (("Executing Dart entrypoint: " + this.f19911a.s() + ", library uri: " + u7) == null) {
                str = "\"\"";
            } else {
                str = u7 + ", and sending initial route: " + i7;
            }
            AbstractC1995b.f("FlutterActivityAndFragmentDelegate", str);
            this.f19912b.o().c(i7);
            String w7 = this.f19911a.w();
            if (w7 == null || w7.isEmpty()) {
                w7 = C1994a.e().c().j();
            }
            this.f19912b.k().k(u7 == null ? new C2105a.c(w7, this.f19911a.s()) : new C2105a.c(w7, u7, this.f19911a.s()), this.f19911a.m());
        }
    }

    public final void l() {
        if (this.f19911a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    @Override // u5.InterfaceC2017d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Activity e() {
        Activity c7 = this.f19911a.c();
        if (c7 != null) {
            return c7;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    public io.flutter.embedding.engine.a n() {
        return this.f19912b;
    }

    public boolean o() {
        return this.f19919i;
    }

    public boolean p() {
        return this.f19916f;
    }

    public final String q(Intent intent) {
        Uri data;
        if (!this.f19911a.y() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public void r(int i7, int i8, Intent intent) {
        l();
        if (this.f19912b == null) {
            AbstractC1995b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i7 + "\nresultCode: " + i8 + "\ndata: " + intent);
        this.f19912b.i().a(i7, i8, intent);
    }

    public void s(Context context) {
        l();
        if (this.f19912b == null) {
            K();
        }
        if (this.f19911a.n()) {
            AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f19912b.i().i(this, this.f19911a.g());
        }
        c cVar = this.f19911a;
        this.f19914d = cVar.v(cVar.c(), this.f19912b);
        this.f19911a.E(this.f19912b);
        this.f19919i = true;
    }

    public void t() {
        l();
        if (this.f19912b == null) {
            AbstractC1995b.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f19912b.o().a();
        }
    }

    public View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i7, boolean z7) {
        D d7;
        AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        l();
        if (this.f19911a.A() == O.surface) {
            s sVar = new s(this.f19911a.getContext(), this.f19911a.D() == P.transparent);
            this.f19911a.l(sVar);
            d7 = new D(this.f19911a.getContext(), sVar);
        } else {
            t tVar = new t(this.f19911a.getContext());
            tVar.setOpaque(this.f19911a.D() == P.opaque);
            this.f19911a.x(tVar);
            d7 = new D(this.f19911a.getContext(), tVar);
        }
        this.f19913c = d7;
        this.f19913c.l(this.f19922l);
        if (this.f19911a.B()) {
            AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
            this.f19913c.n(this.f19912b);
        }
        this.f19913c.setId(i7);
        if (z7) {
            j(this.f19913c);
        }
        return this.f19913c;
    }

    public void v() {
        AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        l();
        if (this.f19915e != null) {
            this.f19913c.getViewTreeObserver().removeOnPreDrawListener(this.f19915e);
            this.f19915e = null;
        }
        D d7 = this.f19913c;
        if (d7 != null) {
            d7.s();
            this.f19913c.y(this.f19922l);
        }
    }

    public void w() {
        io.flutter.embedding.engine.a aVar;
        if (this.f19919i) {
            AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "onDetach()");
            l();
            this.f19911a.t(this.f19912b);
            if (this.f19911a.n()) {
                AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
                if (this.f19911a.c().isChangingConfigurations()) {
                    this.f19912b.i().d();
                } else {
                    this.f19912b.i().f();
                }
            }
            io.flutter.plugin.platform.h hVar = this.f19914d;
            if (hVar != null) {
                hVar.q();
                this.f19914d = null;
            }
            if (this.f19911a.p() && (aVar = this.f19912b) != null) {
                aVar.l().b();
            }
            if (this.f19911a.o()) {
                this.f19912b.g();
                if (this.f19911a.q() != null) {
                    C2062a.b().d(this.f19911a.q());
                }
                this.f19912b = null;
            }
            this.f19919i = false;
        }
    }

    public void x(Intent intent) {
        l();
        if (this.f19912b == null) {
            AbstractC1995b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
        this.f19912b.i().onNewIntent(intent);
        String q7 = q(intent);
        if (q7 == null || q7.isEmpty()) {
            return;
        }
        this.f19912b.o().b(q7);
    }

    public void y() {
        io.flutter.embedding.engine.a aVar;
        AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "onPause()");
        l();
        if (!this.f19911a.p() || (aVar = this.f19912b) == null) {
            return;
        }
        aVar.l().c();
    }

    public void z() {
        AbstractC1995b.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        l();
        if (this.f19912b == null) {
            AbstractC1995b.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        } else {
            N();
            this.f19912b.q().Y();
        }
    }

    public C2023j(c cVar, io.flutter.embedding.engine.b bVar) {
        this.f19922l = new a();
        this.f19911a = cVar;
        this.f19918h = false;
        this.f19921k = bVar;
    }
}
