/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.os.Bundle
 *  android.os.Parcel
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Collection
 *  java.util.List
 *  java.util.Set
 */
package Y1;

import O1.H;
import O1.P;
import V5.t;
import W5.m;
import Y1.A;
import Y1.C;
import Y1.c;
import Y1.u;
import Y1.x;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import x1.a;
import x1.h;
import x1.i;
import x1.o;
import x1.r;

public abstract class D
extends A {
    public final h r;

    public D(u u8) {
        Intrinsics.checkNotNullParameter(u8, "loginClient");
        super(u8);
        this.r = h.q;
    }

    public D(Parcel parcel) {
        Intrinsics.checkNotNullParameter((Object)parcel, "source");
        super(parcel);
        this.r = h.q;
    }

    public static final void A(D d8, u.e e8, Bundle bundle) {
        x1.D d92;
        block3 : {
            Intrinsics.checkNotNullParameter(d8, "this$0");
            Intrinsics.checkNotNullParameter(e8, "$request");
            Intrinsics.checkNotNullParameter((Object)bundle, "$extras");
            try {
                d8.x(e8, d8.k(e8, bundle));
                return;
            }
            catch (o o8) {
            }
            catch (x1.D d92) {
                break block3;
            }
            d8.w(e8, null, o8.getMessage(), null);
            return;
        }
        r r8 = d92.c();
        d8.w(e8, r8.d(), r8.c(), String.valueOf((int)r8.b()));
    }

    public static /* synthetic */ void p(D d8, u.e e8, Bundle bundle) {
        D.A(d8, e8, bundle);
    }

    public boolean B(Intent object, int n8) {
        if (object != null) {
            if (!this.y((Intent)object)) {
                return false;
            }
            Object object2 = this.d().k();
            boolean bl = object2 instanceof x;
            Object var5_5 = null;
            object2 = bl ? (x)object2 : null;
            if (object2 == null) {
                object = var5_5;
            } else if ((object2 = object2.M1()) == null) {
                object = var5_5;
            } else {
                object2.a(object);
                object = t.a;
            }
            if (object == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean j(int n8, int n9, Intent object) {
        u.e e8;
        block9 : {
            block8 : {
                block7 : {
                    e8 = this.d().o();
                    if (object != null) break block7;
                    object = u.f.w.a(e8, "Operation canceled");
                    break block8;
                }
                if (n9 == 0) {
                    this.v(e8, (Intent)object);
                    return true;
                }
                if (n9 == -1) break block9;
                object = u.f.c.d(u.f.w, e8, "Unexpected resultCode from authorization.", null, null, 8, null);
            }
            this.q((u.f)object);
            return true;
        }
        Bundle bundle = object.getExtras();
        if (bundle == null) {
            this.q(u.f.c.d(u.f.w, e8, "Unexpected null from returned authorization data.", null, null, 8, null));
            return true;
        }
        String string2 = this.r(bundle);
        object = bundle.get("error_code");
        object = object == null ? null : object.toString();
        String string3 = this.t(bundle);
        String string4 = bundle.getString("e2e");
        if (!P.c0(string4)) {
            this.h(string4);
        }
        if (string2 == null && object == null && string3 == null && e8 != null) {
            this.z(e8, bundle);
            return true;
        }
        this.w(e8, string2, string3, (String)object);
        return true;
    }

    public final void q(u.f f8) {
        if (f8 != null) {
            this.d().g(f8);
            return;
        }
        this.d().B();
    }

    public String r(Bundle bundle) {
        String string2 = bundle == null ? null : bundle.getString("error");
        if (string2 == null) {
            if (bundle == null) {
                return null;
            }
            return bundle.getString("error_type");
        }
        return string2;
    }

    public String t(Bundle bundle) {
        String string2 = bundle == null ? null : bundle.getString("error_message");
        if (string2 == null) {
            if (bundle == null) {
                return null;
            }
            return bundle.getString("error_description");
        }
        return string2;
    }

    public h u() {
        return this.r;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void v(u.e object, Intent object2) {
        Object object3;
        void var1_3;
        String string2;
        Intrinsics.checkNotNullParameter(string2, "data");
        Object object4 = string2.getExtras();
        String string3 = this.r((Bundle)object4);
        string2 = null;
        if (object4 != null && (object3 = object4.get("error_code")) != null) {
            string2 = object3.toString();
        }
        if (Intrinsics.a(H.c(), string2)) {
            object4 = this.t((Bundle)object4);
            u.f f8 = u.f.w.c((u.e)object, string3, (String)object4, string2);
        } else {
            u.f f9 = u.f.w.a((u.e)object, string3);
        }
        this.q((u.f)var1_3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void w(u.e object, String string2, String string3, String string4) {
        void var2_5;
        void var1_3;
        block7 : {
            block6 : {
                block5 : {
                    if (var2_5 == null || !Intrinsics.a(var2_5, "logged_out")) break block5;
                    c.z = true;
                    break block6;
                }
                if (!m.o((Iterable)H.d(), var2_5)) break block7;
            }
            this.q(null);
            return;
        }
        if (m.o((Iterable)H.e(), var2_5)) {
            u.f f8 = u.f.w.a((u.e)object, null);
        } else {
            void var3_6;
            void var4_7;
            u.f f9 = u.f.w.c((u.e)object, (String)var2_5, (String)var3_6, (String)var4_7);
        }
        this.q((u.f)var1_3);
    }

    public void x(u.e e8, Bundle object) {
        Intrinsics.checkNotNullParameter(e8, "request");
        Intrinsics.checkNotNullParameter(object, "extras");
        try {
            A.a a8 = A.q;
            a a9 = a8.b((Collection)e8.n(), (Bundle)object, this.u(), e8.a());
            object = a8.d((Bundle)object, e8.m());
            this.q(u.f.w.b(e8, a9, (i)object));
            return;
        }
        catch (o o8) {
            this.q(u.f.c.d(u.f.w, e8, null, o8.getMessage(), null, 8, null));
            return;
        }
    }

    public final boolean y(Intent intent) {
        intent = B.l().getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue((Object)intent, "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return ((Collection)intent).isEmpty() ^ true;
    }

    public final void z(u.e e8, Bundle bundle) {
        if (bundle.containsKey("code")) {
            P p8 = P.a;
            if (!P.c0(bundle.getString("code"))) {
                B.t().execute((Runnable)new C(this, e8, bundle));
                return;
            }
        }
        this.x(e8, bundle);
    }
}

