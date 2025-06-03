// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import android.os.BaseBundle;
import java.util.List;
import x1.B;
import W5.m;
import java.util.Collection;
import O1.H;
import O1.P;
import androidx.activity.result.c;
import androidx.fragment.app.Fragment;
import V5.t;
import android.content.Intent;
import x1.r;
import x1.o;
import android.os.Bundle;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;
import x1.h;

public abstract class D extends A
{
    public final h r;
    
    public D(final u u) {
        Intrinsics.checkNotNullParameter(u, "loginClient");
        super(u);
        this.r = h.q;
    }
    
    public D(final Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        super(parcel);
        this.r = h.q;
    }
    
    public static final void A(final D d, final u.e e, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(d, "this$0");
        Intrinsics.checkNotNullParameter(e, "$request");
        Intrinsics.checkNotNullParameter(bundle, "$extras");
        Label_0050: {
            try {
                d.x(e, d.k(e, bundle));
                return;
            }
            catch (o o) {}
            catch (x1.D d2) {
                break Label_0050;
            }
            final o o;
            d.w(e, null, o.getMessage(), null);
            return;
        }
        final x1.D d2;
        final r c = d2.c();
        d.w(e, c.d(), c.c(), String.valueOf(c.b()));
    }
    
    public boolean B(final Intent intent, final int n) {
        if (intent == null) {
            return false;
        }
        if (!this.y(intent)) {
            return false;
        }
        final Fragment k = this.d().k();
        final boolean b = k instanceof x;
        final t t = null;
        x x;
        if (b) {
            x = (x)k;
        }
        else {
            x = null;
        }
        t a;
        if (x == null) {
            a = t;
        }
        else {
            final c m1 = x.M1();
            if (m1 == null) {
                a = t;
            }
            else {
                m1.a(intent);
                a = V5.t.a;
            }
        }
        return a != null;
    }
    
    @Override
    public boolean j(final int n, final int n2, final Intent intent) {
        final u.e o = this.d().o();
        u.f f;
        if (intent == null) {
            f = u.f.w.a(o, "Operation canceled");
        }
        else {
            if (n2 == 0) {
                this.v(o, intent);
                return true;
            }
            if (n2 != -1) {
                f = u.f.c.d(u.f.w, o, "Unexpected resultCode from authorization.", null, null, 8, null);
            }
            else {
                final Bundle extras = intent.getExtras();
                if (extras == null) {
                    this.q(u.f.c.d(u.f.w, o, "Unexpected null from returned authorization data.", null, null, 8, null));
                    return true;
                }
                final String r = this.r(extras);
                final Object value = ((BaseBundle)extras).get("error_code");
                String string;
                if (value == null) {
                    string = null;
                }
                else {
                    string = value.toString();
                }
                final String t = this.t(extras);
                final String string2 = ((BaseBundle)extras).getString("e2e");
                if (!P.c0(string2)) {
                    this.h(string2);
                }
                if (r == null && string == null && t == null && o != null) {
                    this.z(o, extras);
                    return true;
                }
                this.w(o, r, t, string);
                return true;
            }
        }
        this.q(f);
        return true;
    }
    
    public final void q(final u.f f) {
        if (f != null) {
            this.d().g(f);
            return;
        }
        this.d().B();
    }
    
    public String r(final Bundle bundle) {
        String string;
        if (bundle == null) {
            string = null;
        }
        else {
            string = ((BaseBundle)bundle).getString("error");
        }
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return ((BaseBundle)bundle).getString("error_type");
    }
    
    public String t(final Bundle bundle) {
        String string;
        if (bundle == null) {
            string = null;
        }
        else {
            string = ((BaseBundle)bundle).getString("error_message");
        }
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return ((BaseBundle)bundle).getString("error_description");
    }
    
    public h u() {
        return this.r;
    }
    
    public void v(final u.e e, final Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "data");
        final Bundle extras = intent.getExtras();
        final String r = this.r(extras);
        String string = null;
        if (extras != null) {
            final Object value = ((BaseBundle)extras).get("error_code");
            if (value != null) {
                string = value.toString();
            }
        }
        u.f f;
        if (Intrinsics.a(H.c(), string)) {
            f = u.f.w.c(e, r, this.t(extras), string);
        }
        else {
            f = u.f.w.a(e, r);
        }
        this.q(f);
    }
    
    public void w(final u.e e, final String s, final String s2, final String s3) {
        if (s != null && Intrinsics.a(s, "logged_out")) {
            Y1.c.z = true;
        }
        else if (!m.o(H.d(), s)) {
            u.f f;
            if (m.o(H.e(), s)) {
                f = u.f.w.a(e, null);
            }
            else {
                f = u.f.w.c(e, s, s2, s3);
            }
            this.q(f);
            return;
        }
        this.q(null);
    }
    
    public void x(final u.e e, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(e, "request");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        try {
            final a q = A.q;
            this.q(u.f.w.b(e, q.b(e.n(), bundle, this.u(), e.a()), q.d(bundle, e.m())));
        }
        catch (o o) {
            this.q(u.f.c.d(u.f.w, e, null, o.getMessage(), null, 8, null));
        }
    }
    
    public final boolean y(final Intent intent) {
        final List queryIntentActivities = B.l().getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return queryIntentActivities.isEmpty() ^ true;
    }
    
    public final void z(final u.e e, final Bundle bundle) {
        if (((BaseBundle)bundle).containsKey("code")) {
            final P a = P.a;
            if (!P.c0(((BaseBundle)bundle).getString("code"))) {
                B.t().execute(new C(this, e, bundle));
                return;
            }
        }
        this.x(e, bundle);
    }
}
