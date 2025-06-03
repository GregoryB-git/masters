package Y1;

import Y1.u;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public class x extends Fragment {

    /* renamed from: t0, reason: collision with root package name */
    public static final a f7518t0 = new a(null);

    /* renamed from: o0, reason: collision with root package name */
    public String f7519o0;

    /* renamed from: p0, reason: collision with root package name */
    public u.e f7520p0;

    /* renamed from: q0, reason: collision with root package name */
    public u f7521q0;

    /* renamed from: r0, reason: collision with root package name */
    public androidx.activity.result.c f7522r0;

    /* renamed from: s0, reason: collision with root package name */
    public View f7523s0;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class b extends kotlin.jvm.internal.l implements g6.l {

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.e f7525p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.fragment.app.e eVar) {
            super(1);
            this.f7525p = eVar;
        }

        public final void a(androidx.activity.result.a result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (result.b() == -1) {
                x.this.O1().v(u.f7470A.b(), result.b(), result.a());
            } else {
                this.f7525p.finish();
            }
        }

        @Override // g6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.activity.result.a) obj);
            return V5.t.f6803a;
        }
    }

    public static final class c implements u.a {
        public c() {
        }

        @Override // Y1.u.a
        public void a() {
            x.this.X1();
        }

        @Override // Y1.u.a
        public void b() {
            x.this.Q1();
        }
    }

    public static final void S1(x this$0, u.f outcome) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        this$0.U1(outcome);
    }

    public static final void T1(g6.l tmp0, androidx.activity.result.a aVar) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(aVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void C0() {
        super.C0();
        View R6 = R();
        View findViewById = R6 == null ? null : R6.findViewById(M1.b.f3484d);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void H0() {
        super.H0();
        if (this.f7519o0 != null) {
            O1().z(this.f7520p0);
            return;
        }
        Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
        androidx.fragment.app.e n7 = n();
        if (n7 == null) {
            return;
        }
        n7.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void I0(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.I0(outState);
        outState.putParcelable("loginClient", O1());
    }

    public u L1() {
        return new u(this);
    }

    public final androidx.activity.result.c M1() {
        androidx.activity.result.c cVar = this.f7522r0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.n("launcher");
        throw null;
    }

    public int N1() {
        return M1.c.f3489c;
    }

    public final u O1() {
        u uVar = this.f7521q0;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.n("loginClient");
        throw null;
    }

    public final g6.l P1(androidx.fragment.app.e eVar) {
        return new b(eVar);
    }

    public final void Q1() {
        View view = this.f7523s0;
        if (view == null) {
            Intrinsics.n("progressBar");
            throw null;
        }
        view.setVisibility(8);
        V1();
    }

    public final void R1(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.f7519o0 = callingActivity.getPackageName();
    }

    public final void U1(u.f fVar) {
        this.f7520p0 = null;
        int i7 = fVar.f7503o == u.f.a.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", fVar);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        androidx.fragment.app.e n7 = n();
        if (!W() || n7 == null) {
            return;
        }
        n7.setResult(i7, intent);
        n7.finish();
    }

    public final void X1() {
        View view = this.f7523s0;
        if (view == null) {
            Intrinsics.n("progressBar");
            throw null;
        }
        view.setVisibility(0);
        W1();
    }

    @Override // androidx.fragment.app.Fragment
    public void h0(int i7, int i8, Intent intent) {
        super.h0(i7, i8, intent);
        O1().v(i7, i8, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void m0(Bundle bundle) {
        Bundle bundleExtra;
        super.m0(bundle);
        u uVar = bundle == null ? null : (u) bundle.getParcelable("loginClient");
        if (uVar != null) {
            uVar.x(this);
        } else {
            uVar = L1();
        }
        this.f7521q0 = uVar;
        O1().y(new u.d() { // from class: Y1.v
            @Override // Y1.u.d
            public final void a(u.f fVar) {
                x.S1(x.this, fVar);
            }
        });
        androidx.fragment.app.e n7 = n();
        if (n7 == null) {
            return;
        }
        R1(n7);
        Intent intent = n7.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f7520p0 = (u.e) bundleExtra.getParcelable("request");
        }
        d.c cVar = new d.c();
        final g6.l P12 = P1(n7);
        androidx.activity.result.c m12 = m1(cVar, new androidx.activity.result.b() { // from class: Y1.w
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                x.T1(g6.l.this, (androidx.activity.result.a) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m12, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.f7522r0 = m12;
    }

    @Override // androidx.fragment.app.Fragment
    public View q0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(N1(), viewGroup, false);
        View findViewById = inflate.findViewById(M1.b.f3484d);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.f7523s0 = findViewById;
        O1().w(new c());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void r0() {
        O1().c();
        super.r0();
    }

    public void V1() {
    }

    public void W1() {
    }
}
