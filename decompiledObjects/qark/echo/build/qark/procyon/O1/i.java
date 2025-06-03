// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import android.os.BaseBundle;
import android.os.Message;
import android.content.res.Configuration;
import android.content.Intent;
import androidx.fragment.app.e;
import java.util.Arrays;
import x1.B;
import kotlin.jvm.internal.x;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import x1.o;
import android.os.Bundle;
import kotlin.jvm.internal.g;
import android.app.Dialog;
import kotlin.Metadata;
import androidx.fragment.app.d;

@Metadata
public final class i extends d
{
    public static final a F0;
    public Dialog E0;
    
    static {
        F0 = new a(null);
    }
    
    public static final void X1(final i i, final Bundle bundle, final o o) {
        Intrinsics.checkNotNullParameter(i, "this$0");
        i.Z1(bundle, o);
    }
    
    public static final void Y1(final i i, final Bundle bundle, final o o) {
        Intrinsics.checkNotNullParameter(i, "this$0");
        i.a2(bundle);
    }
    
    @Override
    public void H0() {
        super.H0();
        final Dialog e0 = this.E0;
        if (!(e0 instanceof V)) {
            return;
        }
        if (e0 != null) {
            ((V)e0).x();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
    }
    
    @Override
    public Dialog N1(final Bundle bundle) {
        final Dialog e0 = this.E0;
        if (e0 == null) {
            this.Z1(null, null);
            this.R1(false);
            final Dialog n1 = super.N1(bundle);
            Intrinsics.checkNotNullExpressionValue(n1, "super.onCreateDialog(savedInstanceState)");
            return n1;
        }
        if (e0 != null) {
            return e0;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
    }
    
    public final void W1() {
        if (this.E0 != null) {
            return;
        }
        final e n = this.n();
        if (n == null) {
            return;
        }
        final Intent intent = n.getIntent();
        final E a = O1.E.a;
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        final Bundle u = O1.E.u(intent);
        final boolean b = u != null && ((BaseBundle)u).getBoolean("is_fallback", false);
        String string = null;
        Bundle bundle = null;
        V e0 = null;
        Label_0258: {
            String s;
            if (!b) {
                String string2;
                if (u == null) {
                    string2 = null;
                }
                else {
                    string2 = ((BaseBundle)u).getString("action");
                }
                if (u != null) {
                    bundle = u.getBundle("params");
                }
                if (O1.P.c0(string2)) {
                    s = "Cannot start a WebDialog with an empty/missing 'actionName'";
                }
                else {
                    if (string2 != null) {
                        e0 = new V.a((Context)n, string2, bundle).h(new O1.g(this)).a();
                        break Label_0258;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            else {
                if (u != null) {
                    string = ((BaseBundle)u).getString("url");
                }
                if (O1.P.c0(string)) {
                    s = "Cannot start a fallback WebDialog with an empty/missing 'url'";
                }
                else {
                    final x a2 = kotlin.jvm.internal.x.a;
                    final String format = String.format("fb%s://bridge/", Arrays.copyOf(new Object[] { x1.B.m() }, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    final m.a e2 = m.E;
                    if (string != null) {
                        e0 = e2.a((Context)n, string, format);
                        e0.B((V.d)new O1.h(this));
                        break Label_0258;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            O1.P.j0("FacebookDialogFragment", s);
            n.finish();
            return;
        }
        this.E0 = e0;
    }
    
    public final void Z1(final Bundle bundle, final o o) {
        final e n = this.n();
        if (n == null) {
            return;
        }
        final E a = O1.E.a;
        final Intent intent = n.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "fragmentActivity.intent");
        final Intent m = O1.E.m(intent, bundle, o);
        int n2;
        if (o == null) {
            n2 = -1;
        }
        else {
            n2 = 0;
        }
        n.setResult(n2, m);
        n.finish();
    }
    
    public final void a2(final Bundle bundle) {
        final e n = this.n();
        if (n == null) {
            return;
        }
        final Intent intent = new Intent();
        Bundle bundle2;
        if ((bundle2 = bundle) == null) {
            bundle2 = new Bundle();
        }
        intent.putExtras(bundle2);
        n.setResult(-1, intent);
        n.finish();
    }
    
    public final void b2(final Dialog e0) {
        this.E0 = e0;
    }
    
    @Override
    public void m0(final Bundle bundle) {
        super.m0(bundle);
        this.W1();
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if (!(this.E0 instanceof V) || !this.d0()) {
            return;
        }
        final Dialog e0 = this.E0;
        if (e0 != null) {
            ((V)e0).x();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
    }
    
    @Override
    public void t0() {
        final Dialog l1 = this.L1();
        if (l1 != null && this.J()) {
            l1.setDismissMessage((Message)null);
        }
        super.t0();
    }
    
    public static final class a
    {
    }
}
