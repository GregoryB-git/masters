/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Set
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package Y1;

import O1.F;
import O1.P;
import W5.I;
import W5.m;
import Y1.A;
import Y1.o;
import Y1.p;
import Y1.u;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.a;
import x1.h;
import x1.i;

public final class q
extends A {
    @NotNull
    public static final Parcelable.Creator<q> CREATOR;
    public static final b t;
    public o r;
    public final String s;

    static {
        t = new b(null);
        CREATOR = new Parcelable.Creator(){

            public q a(Parcel parcel) {
                Intrinsics.checkNotNullParameter((Object)parcel, "source");
                return new q(parcel);
            }

            public q[] b(int n8) {
                return new q[n8];
            }
        };
    }

    public q(u u8) {
        Intrinsics.checkNotNullParameter(u8, "loginClient");
        super(u8);
        this.s = "get_token";
    }

    public q(Parcel parcel) {
        Intrinsics.checkNotNullParameter((Object)parcel, "source");
        super(parcel);
        this.s = "get_token";
    }

    public static /* synthetic */ void p(q q8, u.e e8, Bundle bundle) {
        q.u(q8, e8, bundle);
    }

    public static final void u(q q8, u.e e8, Bundle bundle) {
        Intrinsics.checkNotNullParameter(q8, "this$0");
        Intrinsics.checkNotNullParameter(e8, "$request");
        q8.r(e8, bundle);
    }

    @Override
    public void b() {
        o o8 = this.r;
        if (o8 == null) {
            return;
        }
        o8.b();
        o8.g(null);
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
    public int o(u.e object) {
        Intrinsics.checkNotNullParameter(object, "request");
        e e8 = this.d().i();
        Object object2 = e8;
        if (e8 == null) {
            object2 = B.l();
        }
        this.r = object2 = new o((Context)object2, (u.e)object);
        if (Intrinsics.a(object2.h(), (Object)Boolean.FALSE)) {
            return 0;
        }
        this.d().r();
        object = new p(this, (u.e)object);
        object2 = this.r;
        if (object2 != null) {
            object2.g((F.b)object);
        }
        return 1;
    }

    public final void q(final u.e e8, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(e8, "request");
        Intrinsics.checkNotNullParameter((Object)bundle, "result");
        String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string2 != null && string2.length() != 0) {
            this.t(e8, bundle);
            return;
        }
        this.d().r();
        string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 != null) {
            P p8 = P.a;
            P.G(string2, new P.a(){

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                @Override
                public void a(JSONObject object) {
                    try {
                        Bundle bundle2 = bundle;
                        object = object == null ? null : object.getString("id");
                        bundle2.putString("com.facebook.platform.extra.USER_ID", (String)object);
                        this.t(e8, bundle);
                        return;
                    }
                    catch (JSONException jSONException) {
                        this.d().f(u.f.c.d(u.f.w, this.d().o(), "Caught exception", jSONException.getMessage(), null, 8, null));
                        return;
                    }
                }

                @Override
                public void b(x1.o object) {
                    u u8 = this.d();
                    u.f.c c8 = u.f.w;
                    u.e e82 = this.d().o();
                    object = object == null ? null : object.getMessage();
                    u8.f(u.f.c.d(c8, e82, "Caught exception", (String)object, null, 8, null));
                }
            });
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void r(u.e e8, Bundle bundle) {
        Intrinsics.checkNotNullParameter(e8, "request");
        o o8 = this.r;
        if (o8 != null) {
            o8.g(null);
        }
        this.r = null;
        this.d().t();
        if (bundle != null) {
            ArrayList arrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            o8 = arrayList;
            if (arrayList == null) {
                o8 = m.f();
            }
            Object object2 = e8.n();
            arrayList = object2;
            if (object2 == null) {
                arrayList = I.b();
            }
            object2 = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (!arrayList.contains((Object)"openid") || object2 != null && object2.length() != 0) {
                if (o8.containsAll((Collection)arrayList)) {
                    this.q(e8, bundle);
                    return;
                }
                bundle = new HashSet();
                for (Object object2 : arrayList) {
                    if (o8.contains(object2)) continue;
                    bundle.add(object2);
                }
                if (bundle.isEmpty() ^ true) {
                    this.a("new_permissions", TextUtils.join((CharSequence)",", (Iterable)bundle));
                }
                e8.u((Set)bundle);
            }
        }
        this.d().B();
    }

    public final void t(u.e object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "request");
        Intrinsics.checkNotNullParameter(object2, "result");
        try {
            A.a a8 = A.q;
            a a9 = a8.a((Bundle)object2, h.s, object.a());
            object2 = a8.c((Bundle)object2, object.m());
            object = u.f.w.b((u.e)object, a9, (i)object2);
        }
        catch (x1.o o8) {
            object = u.f.c.d(u.f.w, this.d().o(), null, o8.getMessage(), null, 8, null);
        }
        this.d().g((u.f)object);
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }
    }

}

