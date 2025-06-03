/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package Y1;

import O1.P;
import O1.V;
import O1.i;
import Y1.A;
import Y1.B;
import Y1.F;
import Y1.t;
import Y1.u;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import x1.h;
import x1.o;

public class G
extends F {
    @NotNull
    public static final Parcelable.Creator<G> CREATOR;
    public static final c x;
    public V t;
    public String u;
    public final String v;
    public final h w;

    static {
        x = new c(null);
        CREATOR = new Parcelable.Creator(){

            public G a(Parcel parcel) {
                Intrinsics.checkNotNullParameter((Object)parcel, "source");
                return new G(parcel);
            }

            public G[] b(int n8) {
                return new G[n8];
            }
        };
    }

    public G(u u8) {
        Intrinsics.checkNotNullParameter(u8, "loginClient");
        super(u8);
        this.v = "web_view";
        this.w = h.t;
    }

    public G(Parcel parcel) {
        Intrinsics.checkNotNullParameter((Object)parcel, "source");
        super(parcel);
        this.v = "web_view";
        this.w = h.t;
        this.u = parcel.readString();
    }

    @Override
    public void b() {
        V v8 = this.t;
        if (v8 != null) {
            if (v8 != null) {
                v8.cancel();
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
    public int o(u.e object) {
        Intrinsics.checkNotNullParameter(object, "request");
        Object object2 = this.q((u.e)object);
        V.d d8 = new V.d((u.e)object){
            public final /* synthetic */ u.e b;
            {
                this.b = e8;
            }

            @Override
            public void a(Bundle bundle, o o8) {
                this.x(this.b, bundle, o8);
            }
        };
        Object object3 = u.A.a();
        this.u = object3;
        this.a("e2e", object3);
        object3 = this.d().i();
        if (object3 == null) {
            return 0;
        }
        boolean bl = P.W((Context)object3);
        object2 = new a((Context)object3, object.a(), (Bundle)object2);
        String string2 = this.u;
        if (string2 != null) {
            this.t = object2.m(string2).p(bl).k(object.c()).q(object.j()).r(object.k()).o(object.q()).s(object.v()).h(d8).a();
            object = new i();
            object.D1(true);
            object.b2(this.t);
            object.T1(object3.n(), "FacebookDialogFragment");
            return 1;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override
    public h t() {
        return this.w;
    }

    @Override
    public void writeToParcel(Parcel parcel, int n8) {
        Intrinsics.checkNotNullParameter((Object)parcel, "dest");
        A.super.writeToParcel(parcel, n8);
        parcel.writeString(this.u);
    }

    public final void x(u.e e8, Bundle bundle, o o8) {
        Intrinsics.checkNotNullParameter(e8, "request");
        super.v(e8, bundle, o8);
    }

    public final class a
    extends V.a {
        public String h;
        public t i;
        public B j;
        public boolean k;
        public boolean l;
        public String m;
        public String n;

        public a(Context context, String string2, Bundle bundle) {
            Intrinsics.checkNotNullParameter(G.this, "this$0");
            Intrinsics.checkNotNullParameter((Object)context, "context");
            Intrinsics.checkNotNullParameter(string2, "applicationId");
            Intrinsics.checkNotNullParameter((Object)bundle, "parameters");
            super(context, string2, "oauth", bundle);
            this.h = "fbconnect://success";
            this.i = t.v;
            this.j = B.q;
        }

        @Override
        public V a() {
            Bundle bundle = this.f();
            if (bundle != null) {
                bundle.putString("redirect_uri", this.h);
                bundle.putString("client_id", this.c());
                bundle.putString("e2e", this.j());
                Object object = this.j == B.r ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain";
                bundle.putString("response_type", (String)object);
                bundle.putString("return_scopes", "true");
                bundle.putString("auth_type", this.i());
                bundle.putString("login_behavior", this.i.name());
                if (this.k) {
                    bundle.putString("fx_app", this.j.toString());
                }
                if (this.l) {
                    bundle.putString("skip_dedupe", "true");
                }
                object = V.A;
                Context context = this.d();
                if (context != null) {
                    return object.d(context, "oauth", bundle, this.g(), this.j, this.e());
                }
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
        }

        public final String i() {
            String string2 = this.n;
            if (string2 != null) {
                return string2;
            }
            Intrinsics.n("authType");
            throw null;
        }

        public final String j() {
            String string2 = this.m;
            if (string2 != null) {
                return string2;
            }
            Intrinsics.n("e2e");
            throw null;
        }

        public final a k(String string2) {
            Intrinsics.checkNotNullParameter(string2, "authType");
            this.l(string2);
            return this;
        }

        public final void l(String string2) {
            Intrinsics.checkNotNullParameter(string2, "<set-?>");
            this.n = string2;
        }

        public final a m(String string2) {
            Intrinsics.checkNotNullParameter(string2, "e2e");
            this.n(string2);
            return this;
        }

        public final void n(String string2) {
            Intrinsics.checkNotNullParameter(string2, "<set-?>");
            this.m = string2;
        }

        public final a o(boolean bl) {
            this.k = bl;
            return this;
        }

        public final a p(boolean bl) {
            String string2 = bl ? "fbconnect://chrome_os_success" : "fbconnect://success";
            this.h = string2;
            return this;
        }

        public final a q(t t8) {
            Intrinsics.checkNotNullParameter((Object)t8, "loginBehavior");
            this.i = t8;
            return this;
        }

        public final a r(B b8) {
            Intrinsics.checkNotNullParameter((Object)b8, "targetApp");
            this.j = b8;
            return this;
        }

        public final a s(boolean bl) {
            this.l = bl;
            return this;
        }
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(g g8) {
            this();
        }
    }

}

