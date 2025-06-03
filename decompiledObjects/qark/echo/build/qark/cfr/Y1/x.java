/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Object
 *  java.lang.String
 */
package Y1;

import V5.t;
import Y1.u;
import Y1.v;
import Y1.w;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.b;
import androidx.activity.result.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import g6.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

@Metadata
public class x
extends Fragment {
    public static final a t0 = new a(null);
    public String o0;
    public u.e p0;
    public u q0;
    public c r0;
    public View s0;

    public static /* synthetic */ void H1(l l8, androidx.activity.result.a a8) {
        x.T1(l8, a8);
    }

    public static /* synthetic */ void I1(x x8, u.f f8) {
        x.S1(x8, f8);
    }

    public static final void S1(x x8, u.f f8) {
        Intrinsics.checkNotNullParameter(x8, "this$0");
        Intrinsics.checkNotNullParameter(f8, "outcome");
        x8.U1(f8);
    }

    public static final void T1(l l8, androidx.activity.result.a a8) {
        Intrinsics.checkNotNullParameter(l8, "$tmp0");
        l8.invoke(a8);
    }

    @Override
    public void C0() {
        super.C0();
        View view = this.R();
        view = view == null ? null : view.findViewById(M1.b.d);
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override
    public void H0() {
        super.H0();
        if (this.o0 == null) {
            Log.e((String)"LoginFragment", (String)"Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            e e8 = this.n();
            if (e8 == null) {
                return;
            }
            e8.finish();
            return;
        }
        this.O1().z(this.p0);
    }

    @Override
    public void I0(Bundle bundle) {
        Intrinsics.checkNotNullParameter((Object)bundle, "outState");
        super.I0(bundle);
        bundle.putParcelable("loginClient", (Parcelable)this.O1());
    }

    public u L1() {
        return new u(this);
    }

    public final c M1() {
        c c8 = this.r0;
        if (c8 != null) {
            return c8;
        }
        Intrinsics.n("launcher");
        throw null;
    }

    public int N1() {
        return M1.c.c;
    }

    public final u O1() {
        u u8 = this.q0;
        if (u8 != null) {
            return u8;
        }
        Intrinsics.n("loginClient");
        throw null;
    }

    public final l P1(final e e8) {
        return new l(){

            public final void a(androidx.activity.result.a a8) {
                Intrinsics.checkNotNullParameter(a8, "result");
                if (a8.b() == -1) {
                    this.O1().v(u.A.b(), a8.b(), a8.a());
                    return;
                }
                e8.finish();
            }
        };
    }

    public final void Q1() {
        View view = this.s0;
        if (view != null) {
            view.setVisibility(8);
            this.V1();
            return;
        }
        Intrinsics.n("progressBar");
        throw null;
    }

    public final void R1(Activity activity) {
        if ((activity = activity.getCallingActivity()) == null) {
            return;
        }
        this.o0 = activity.getPackageName();
    }

    public final void U1(u.f f8) {
        this.p0 = null;
        int n8 = f8.o == u.f.a.q ? 0 : -1;
        Object object = new Bundle();
        object.putParcelable("com.facebook.LoginFragment:Result", (Parcelable)f8);
        f8 = new Intent();
        f8.putExtras((Bundle)object);
        object = this.n();
        if (this.W() && object != null) {
            object.setResult(n8, (Intent)f8);
            object.finish();
        }
    }

    public void V1() {
    }

    public void W1() {
    }

    public final void X1() {
        View view = this.s0;
        if (view != null) {
            view.setVisibility(0);
            this.W1();
            return;
        }
        Intrinsics.n("progressBar");
        throw null;
    }

    @Override
    public void h0(int n8, int n9, Intent intent) {
        super.h0(n8, n9, intent);
        this.O1().v(n8, n9, intent);
    }

    @Override
    public void m0(Bundle object) {
        super.m0((Bundle)object);
        object = object == null ? null : (u)object.getParcelable("loginClient");
        if (object != null) {
            object.x(this);
        } else {
            object = this.L1();
        }
        this.q0 = object;
        this.O1().y(new v(this));
        object = this.n();
        if (object == null) {
            return;
        }
        this.R1((Activity)object);
        Intent intent = object.getIntent();
        if (intent != null && (intent = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.p0 = (u.e)intent.getParcelable("request");
        }
        object = this.m1(new d.c(), new w(this.P1((e)object)));
        Intrinsics.checkNotNullExpressionValue(object, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.r0 = object;
    }

    @Override
    public View q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter((Object)layoutInflater, "inflater");
        layoutInflater = layoutInflater.inflate(this.N1(), viewGroup, false);
        viewGroup = layoutInflater.findViewById(M1.b.d);
        Intrinsics.checkNotNullExpressionValue((Object)viewGroup, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.s0 = viewGroup;
        this.O1().w(new u.a(){

            @Override
            public void a() {
                this.X1();
            }

            @Override
            public void b() {
                this.Q1();
            }
        });
        return layoutInflater;
    }

    @Override
    public void r0() {
        this.O1().c();
        super.r0();
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

