// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import android.os.BaseBundle;
import x1.h;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Collection;
import W5.I;
import W5.m;
import org.json.JSONException;
import org.json.JSONObject;
import O1.P;
import android.content.Context;
import x1.B;
import O1.F;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import android.os.Parcel;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import android.os.Parcelable$Creator;

public final class q extends A
{
    @NotNull
    public static final Parcelable$Creator<q> CREATOR;
    public static final b t;
    public o r;
    public final String s;
    
    static {
        t = new b(null);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public q a(final Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new q(parcel);
            }
            
            public q[] b(final int n) {
                return new q[n];
            }
        };
    }
    
    public q(final u u) {
        Intrinsics.checkNotNullParameter(u, "loginClient");
        super(u);
        this.s = "get_token";
    }
    
    public q(final Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        super(parcel);
        this.s = "get_token";
    }
    
    public static final void u(final q q, final u.e e, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(q, "this$0");
        Intrinsics.checkNotNullParameter(e, "$request");
        q.r(e, bundle);
    }
    
    @Override
    public void b() {
        final o r = this.r;
        if (r == null) {
            return;
        }
        r.b();
        r.g(null);
        this.r = null;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String f() {
        return this.s;
    }
    
    @Override
    public int o(final u.e e) {
        Intrinsics.checkNotNullParameter(e, "request");
        Object o;
        if ((o = this.d().i()) == null) {
            o = B.l();
        }
        final o r = new o((Context)o, e);
        this.r = r;
        if (Intrinsics.a(r.h(), Boolean.FALSE)) {
            return 0;
        }
        this.d().r();
        final p p = new p(this, e);
        final o r2 = this.r;
        if (r2 != null) {
            r2.g((F.b)p);
        }
        return 1;
    }
    
    public final void q(final u.e e, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(e, "request");
        Intrinsics.checkNotNullParameter(bundle, "result");
        final String string = ((BaseBundle)bundle).getString("com.facebook.platform.extra.USER_ID");
        if (string != null && string.length() != 0) {
            this.t(e, bundle);
            return;
        }
        this.d().r();
        final String string2 = ((BaseBundle)bundle).getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 != null) {
            final P a = P.a;
            P.G(string2, (P.a)new P.a() {
                public final /* synthetic */ q b;
                
                @Override
                public void a(final JSONObject jsonObject) {
                    try {
                        final Bundle a = bundle;
                        String string;
                        if (jsonObject == null) {
                            string = null;
                        }
                        else {
                            string = jsonObject.getString("id");
                        }
                        ((BaseBundle)a).putString("com.facebook.platform.extra.USER_ID", string);
                        this.b.t(e, bundle);
                    }
                    catch (JSONException ex) {
                        this.b.d().f(u.f.c.d(u.f.w, this.b.d().o(), "Caught exception", ((Throwable)ex).getMessage(), null, 8, null));
                    }
                }
                
                @Override
                public void b(final x1.o o) {
                    final u d = this.b.d();
                    final u.f.c w = u.f.w;
                    final u.e o2 = this.b.d().o();
                    String message;
                    if (o == null) {
                        message = null;
                    }
                    else {
                        message = o.getMessage();
                    }
                    d.f(u.f.c.d(w, o2, "Caught exception", message, null, 8, null));
                }
            });
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
    
    public final void r(final u.e e, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(e, "request");
        final o r = this.r;
        if (r != null) {
            r.g(null);
        }
        this.r = null;
        this.d().t();
        if (bundle != null) {
            List list;
            if ((list = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS")) == null) {
                list = m.f();
            }
            Set set;
            if ((set = e.n()) == null) {
                set = I.b();
            }
            final String string = ((BaseBundle)bundle).getString("com.facebook.platform.extra.ID_TOKEN");
            if (!set.contains("openid") || (string != null && string.length() != 0)) {
                if (list.containsAll(set)) {
                    this.q(e, bundle);
                    return;
                }
                final HashSet<String> set2 = new HashSet<String>();
                for (final String e2 : set) {
                    if (!list.contains(e2)) {
                        set2.add(e2);
                    }
                }
                if (set2.isEmpty() ^ true) {
                    this.a("new_permissions", TextUtils.join((CharSequence)",", (Iterable)set2));
                }
                e.u(set2);
            }
        }
        this.d().B();
    }
    
    public final void t(final u.e e, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(e, "request");
        Intrinsics.checkNotNullParameter(bundle, "result");
        u.f f;
        try {
            final a q = A.q;
            f = u.f.w.b(e, q.a(bundle, h.s, e.a()), q.c(bundle, e.m()));
        }
        catch (x1.o o) {
            f = u.f.c.d(u.f.w, this.d().o(), null, o.getMessage(), null, 8, null);
        }
        this.d().g(f);
    }
    
    public static final class b
    {
    }
}
