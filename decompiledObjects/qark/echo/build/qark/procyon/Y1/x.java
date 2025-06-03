// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Intent;
import android.content.ComponentName;
import android.app.Activity;
import V5.t;
import android.os.Parcelable;
import android.os.Bundle;
import androidx.fragment.app.e;
import android.util.Log;
import M1.b;
import kotlin.jvm.internal.Intrinsics;
import androidx.activity.result.a;
import g6.l;
import kotlin.jvm.internal.g;
import android.view.View;
import androidx.activity.result.c;
import kotlin.Metadata;
import androidx.fragment.app.Fragment;

@Metadata
public class x extends Fragment
{
    public static final a t0;
    public String o0;
    public Y1.u.e p0;
    public Y1.u q0;
    public androidx.activity.result.c r0;
    public View s0;
    
    static {
        t0 = new a(null);
    }
    
    public static final void S1(final x x, final Y1.u.f f) {
        Intrinsics.checkNotNullParameter(x, "this$0");
        Intrinsics.checkNotNullParameter(f, "outcome");
        x.U1(f);
    }
    
    public static final void T1(final l l, final androidx.activity.result.a a) {
        Intrinsics.checkNotNullParameter(l, "$tmp0");
        l.invoke(a);
    }
    
    @Override
    public void C0() {
        super.C0();
        final View r = this.R();
        View viewById;
        if (r == null) {
            viewById = null;
        }
        else {
            viewById = r.findViewById(b.d);
        }
        if (viewById != null) {
            viewById.setVisibility(8);
        }
    }
    
    @Override
    public void H0() {
        super.H0();
        if (this.o0 != null) {
            this.O1().z(this.p0);
            return;
        }
        Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
        final e n = this.n();
        if (n == null) {
            return;
        }
        n.finish();
    }
    
    @Override
    public void I0(final Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.I0(bundle);
        bundle.putParcelable("loginClient", (Parcelable)this.O1());
    }
    
    public Y1.u L1() {
        return new Y1.u(this);
    }
    
    public final androidx.activity.result.c M1() {
        final androidx.activity.result.c r0 = this.r0;
        if (r0 != null) {
            return r0;
        }
        Intrinsics.n("launcher");
        throw null;
    }
    
    public int N1() {
        return M1.c.c;
    }
    
    public final Y1.u O1() {
        final Y1.u q0 = this.q0;
        if (q0 != null) {
            return q0;
        }
        Intrinsics.n("loginClient");
        throw null;
    }
    
    public final l P1(final e e) {
        return new l() {
            public final /* synthetic */ x o;
            
            public final void a(final androidx.activity.result.a a) {
                Intrinsics.checkNotNullParameter(a, "result");
                if (a.b() == -1) {
                    this.o.O1().v(Y1.u.A.b(), a.b(), a.a());
                    return;
                }
                e.finish();
            }
        };
    }
    
    public final void Q1() {
        final View s0 = this.s0;
        if (s0 != null) {
            s0.setVisibility(8);
            this.V1();
            return;
        }
        Intrinsics.n("progressBar");
        throw null;
    }
    
    public final void R1(final Activity activity) {
        final ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.o0 = callingActivity.getPackageName();
    }
    
    public final void U1(final Y1.u.f f) {
        this.p0 = null;
        int n;
        if (f.o == Y1.u.f.a.q) {
            n = 0;
        }
        else {
            n = -1;
        }
        final Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", (Parcelable)f);
        final Intent intent = new Intent();
        intent.putExtras(bundle);
        final e n2 = this.n();
        if (this.W() && n2 != null) {
            n2.setResult(n, intent);
            n2.finish();
        }
    }
    
    public void V1() {
    }
    
    public void W1() {
    }
    
    public final void X1() {
        final View s0 = this.s0;
        if (s0 != null) {
            s0.setVisibility(0);
            this.W1();
            return;
        }
        Intrinsics.n("progressBar");
        throw null;
    }
    
    @Override
    public void h0(final int n, final int n2, final Intent intent) {
        super.h0(n, n2, intent);
        this.O1().v(n, n2, intent);
    }
    
    @Override
    public void m0(final Bundle bundle) {
        super.m0(bundle);
        Y1.u l1;
        if (bundle == null) {
            l1 = null;
        }
        else {
            l1 = (Y1.u)bundle.getParcelable("loginClient");
        }
        if (l1 != null) {
            l1.x(this);
        }
        else {
            l1 = this.L1();
        }
        this.q0 = l1;
        this.O1().y((Y1.u.d)new v(this));
        final e n = this.n();
        if (n == null) {
            return;
        }
        this.R1(n);
        final Intent intent = n.getIntent();
        if (intent != null) {
            final Bundle bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request");
            if (bundleExtra != null) {
                this.p0 = (Y1.u.e)bundleExtra.getParcelable("request");
            }
        }
        final androidx.activity.result.c m1 = this.m1(new d.c(), new w(this.P1(n)));
        Intrinsics.checkNotNullExpressionValue(m1, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.r0 = m1;
    }
    
    @Override
    public View q0(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(this.N1(), viewGroup, false);
        final View viewById = inflate.findViewById(b.d);
        Intrinsics.checkNotNullExpressionValue(viewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.s0 = viewById;
        this.O1().w((Y1.u.a)new Y1.u.a() {
            @Override
            public void a() {
                x.this.X1();
            }
            
            @Override
            public void b() {
                x.this.Q1();
            }
        });
        return inflate;
    }
    
    @Override
    public void r0() {
        this.O1().c();
        super.r0();
    }
    
    public static final class a
    {
    }
}
