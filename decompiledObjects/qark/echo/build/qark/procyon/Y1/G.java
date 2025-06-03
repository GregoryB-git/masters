// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import android.os.BaseBundle;
import androidx.fragment.app.e;
import android.app.Dialog;
import O1.i;
import android.content.Context;
import O1.P;
import x1.o;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import android.os.Parcel;
import kotlin.jvm.internal.g;
import x1.h;
import O1.V;
import org.jetbrains.annotations.NotNull;
import android.os.Parcelable$Creator;

public class G extends F
{
    @NotNull
    public static final Parcelable$Creator<G> CREATOR;
    public static final c x;
    public V t;
    public String u;
    public final String v;
    public final h w;
    
    static {
        x = new c(null);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public G a(final Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new G(parcel);
            }
            
            public G[] b(final int n) {
                return new G[n];
            }
        };
    }
    
    public G(final u u) {
        Intrinsics.checkNotNullParameter(u, "loginClient");
        super(u);
        this.v = "web_view";
        this.w = h.t;
    }
    
    public G(final Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        super(parcel);
        this.v = "web_view";
        this.w = h.t;
        this.u = parcel.readString();
    }
    
    @Override
    public void b() {
        final V t = this.t;
        if (t != null) {
            if (t != null) {
                t.cancel();
            }
            this.t = null;
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String f() {
        return this.v;
    }
    
    @Override
    public boolean i() {
        return true;
    }
    
    @Override
    public int o(final u.e e) {
        Intrinsics.checkNotNullParameter(e, "request");
        final Bundle q = this.q(e);
        final V.d d = new V.d() {
            public final /* synthetic */ G a;
            
            @Override
            public void a(final Bundle bundle, final o o) {
                this.a.x(e, bundle, o);
            }
        };
        this.a("e2e", this.u = Y1.u.A.a());
        final e i = this.d().i();
        if (i == null) {
            return 0;
        }
        final boolean w = P.W((Context)i);
        final a a = new a((Context)i, e.a(), q);
        final String u = this.u;
        if (u != null) {
            this.t = ((V.a)a.m(u).p(w).k(e.c()).q(e.j()).r(e.k()).o(e.q()).s(e.v())).h(d).a();
            final i j = new i();
            j.D1(true);
            j.b2(this.t);
            j.T1(i.n(), "FacebookDialogFragment");
            return 1;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
    
    @Override
    public h t() {
        return this.w;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        super.writeToParcel(parcel, n);
        parcel.writeString(this.u);
    }
    
    public final void x(final u.e e, final Bundle bundle, final o o) {
        Intrinsics.checkNotNullParameter(e, "request");
        super.v(e, bundle, o);
    }
    
    public final class a extends V.a
    {
        public String h;
        public t i;
        public B j;
        public boolean k;
        public boolean l;
        public String m;
        public String n;
        
        public a(final Context context, final String s, final Bundle bundle) {
            Intrinsics.checkNotNullParameter(G.this, "this$0");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(s, "applicationId");
            Intrinsics.checkNotNullParameter(bundle, "parameters");
            super(context, s, "oauth", bundle);
            this.h = "fbconnect://success";
            this.i = t.v;
            this.j = Y1.B.q;
        }
        
        @Override
        public V a() {
            final Bundle f = ((V.a)this).f();
            if (f == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
            }
            ((BaseBundle)f).putString("redirect_uri", this.h);
            ((BaseBundle)f).putString("client_id", ((V.a)this).c());
            ((BaseBundle)f).putString("e2e", this.j());
            String s;
            if (this.j == Y1.B.r) {
                s = "token,signed_request,graph_domain,granted_scopes";
            }
            else {
                s = "token,signed_request,graph_domain";
            }
            ((BaseBundle)f).putString("response_type", s);
            ((BaseBundle)f).putString("return_scopes", "true");
            ((BaseBundle)f).putString("auth_type", this.i());
            ((BaseBundle)f).putString("login_behavior", this.i.name());
            if (this.k) {
                ((BaseBundle)f).putString("fx_app", this.j.toString());
            }
            if (this.l) {
                ((BaseBundle)f).putString("skip_dedupe", "true");
            }
            final V.b a = V.A;
            final Context d = ((V.a)this).d();
            if (d != null) {
                return a.d(d, "oauth", f, ((V.a)this).g(), this.j, ((V.a)this).e());
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
        }
        
        public final String i() {
            final String n = this.n;
            if (n != null) {
                return n;
            }
            Intrinsics.n("authType");
            throw null;
        }
        
        public final String j() {
            final String m = this.m;
            if (m != null) {
                return m;
            }
            Intrinsics.n("e2e");
            throw null;
        }
        
        public final a k(final String s) {
            Intrinsics.checkNotNullParameter(s, "authType");
            this.l(s);
            return this;
        }
        
        public final void l(final String n) {
            Intrinsics.checkNotNullParameter(n, "<set-?>");
            this.n = n;
        }
        
        public final a m(final String s) {
            Intrinsics.checkNotNullParameter(s, "e2e");
            this.n(s);
            return this;
        }
        
        public final void n(final String m) {
            Intrinsics.checkNotNullParameter(m, "<set-?>");
            this.m = m;
        }
        
        public final a o(final boolean k) {
            this.k = k;
            return this;
        }
        
        public final a p(final boolean b) {
            String h;
            if (b) {
                h = "fbconnect://chrome_os_success";
            }
            else {
                h = "fbconnect://success";
            }
            this.h = h;
            return this;
        }
        
        public final a q(final t i) {
            Intrinsics.checkNotNullParameter(i, "loginBehavior");
            this.i = i;
            return this;
        }
        
        public final a r(final B j) {
            Intrinsics.checkNotNullParameter(j, "targetApp");
            this.j = j;
            return this;
        }
        
        public final a s(final boolean l) {
            this.l = l;
            return this;
        }
    }
    
    public static final class c
    {
    }
}
