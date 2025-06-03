/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.text.TextUtils
 *  android.webkit.CookieSyncManager
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Collection
 *  java.util.Set
 */
package Y1;

import O1.P;
import Y1.A;
import Y1.B;
import Y1.e;
import Y1.t;
import Y1.u;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import x1.D;
import x1.a;
import x1.h;
import x1.i;
import x1.o;
import x1.q;
import x1.r;

public abstract class F
extends A {
    public static final a s = new a(null);
    public String r;

    public F(u u8) {
        Intrinsics.checkNotNullParameter(u8, "loginClient");
        super(u8);
    }

    public F(Parcel parcel) {
        Intrinsics.checkNotNullParameter((Object)parcel, "source");
        super(parcel);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Bundle p(Bundle bundle, u.e e8) {
        Intrinsics.checkNotNullParameter((Object)bundle, "parameters");
        Intrinsics.checkNotNullParameter(e8, "request");
        bundle.putString("redirect_uri", this.g());
        Object object = e8.r() ? "app_id" : "client_id";
        bundle.putString((String)object, e8.a());
        bundle.putString("e2e", u.A.a());
        if (e8.r()) {
            object = "token,signed_request,graph_domain,granted_scopes";
        } else {
            if (e8.n().contains((Object)"openid")) {
                bundle.putString("nonce", e8.m());
            }
            object = "id_token,token,signed_request,graph_domain";
        }
        bundle.putString("response_type", (String)object);
        bundle.putString("code_challenge", e8.d());
        object = e8.e();
        object = object == null ? null : object.name();
        bundle.putString("code_challenge_method", (String)object);
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", e8.c());
        bundle.putString("login_behavior", e8.j().name());
        bundle.putString("sdk", Intrinsics.i("android-", x1.B.B()));
        if (this.r() != null) {
            bundle.putString("sso", this.r());
        }
        boolean bl = x1.B.q;
        String string2 = "0";
        object = bl ? "1" : "0";
        bundle.putString("cct_prefetching", (String)object);
        if (e8.q()) {
            bundle.putString("fx_app", e8.k().toString());
        }
        if (e8.v()) {
            bundle.putString("skip_dedupe", "true");
        }
        if (e8.l() != null) {
            bundle.putString("messenger_page_id", e8.l());
            object = string2;
            if (e8.o()) {
                object = "1";
            }
            bundle.putString("reset_messenger_state", (String)object);
        }
        return bundle;
    }

    public Bundle q(u.e object) {
        Intrinsics.checkNotNullParameter(object, "request");
        Bundle bundle = new Bundle();
        Object object2 = P.a;
        if (!P.d0((Collection)object.n())) {
            object2 = TextUtils.join((CharSequence)",", (Iterable)object.n());
            bundle.putString("scope", (String)object2);
            this.a("scope", object2);
        }
        e e8 = object.g();
        object2 = e8;
        if (e8 == null) {
            object2 = e.p;
        }
        bundle.putString("default_audience", object2.e());
        bundle.putString("state", this.c(object.b()));
        object = x1.a.z.e();
        object = object == null ? null : object.l();
        object2 = "0";
        if (object != null && Intrinsics.a(object, this.u())) {
            bundle.putString("access_token", (String)object);
            this.a("access_token", "1");
        } else {
            object = this.d().i();
            if (object != null) {
                P.i((Context)object);
            }
            this.a("access_token", "0");
        }
        bundle.putString("cbt", String.valueOf((long)System.currentTimeMillis()));
        object = object2;
        if (x1.B.p()) {
            object = "1";
        }
        bundle.putString("ies", (String)object);
        return bundle;
    }

    public String r() {
        return null;
    }

    public abstract h t();

    public final String u() {
        androidx.fragment.app.e e8;
        androidx.fragment.app.e e9 = e8 = this.d().i();
        if (e8 == null) {
            e9 = x1.B.l();
        }
        return e9.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void v(u.e object, Bundle object2, o object3) {
        u u8;
        block13 : {
            block14 : {
                Intrinsics.checkNotNullParameter(object, "request");
                u8 = this.d();
                this.r = null;
                if (object2 != null) {
                    if (object2.containsKey("e2e")) {
                        this.r = object2.getString("e2e");
                    }
                    Object object4 = A.q;
                    object3 = object4.b((Collection)object.n(), (Bundle)object2, this.t(), object.a());
                    object = object4.d((Bundle)object2, object.m());
                    object2 = u.f.w.b(u8.o(), (x1.a)object3, (i)object);
                    object4 = u8.i();
                    object = object2;
                    if (object4 == null) break block13;
                    CookieSyncManager.createInstance((Context)u8.i()).sync();
                    break block14;
                }
                if (object3 instanceof q) {
                    object = u.f.w.a(u8.o(), "User canceled log in.");
                } else {
                    this.r = null;
                    object = object3 == null ? null : object3.getMessage();
                    if (object3 instanceof D) {
                        object = ((D)((Object)object3)).c();
                        object2 = String.valueOf((int)object.b());
                        object = object.toString();
                    } else {
                        object2 = null;
                    }
                    object = u.f.w.c(u8.o(), null, (String)object, (String)object2);
                }
                break block13;
                catch (Exception exception) {}
            }
            object = object2;
            if (object3 != null) {
                this.w(object3.l());
                object = object2;
            }
            break block13;
            catch (o o8) {
                object = u.f.c.d(u.f.w, u8.o(), null, o8.getMessage(), null, 8, null);
            }
        }
        object2 = P.a;
        if (!P.c0(this.r)) {
            this.h(this.r);
        }
        u8.g((u.f)object);
    }

    public final void w(String string2) {
        androidx.fragment.app.e e8;
        androidx.fragment.app.e e9 = e8 = this.d().i();
        if (e8 == null) {
            e9 = x1.B.l();
        }
        e9.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", string2).apply();
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

