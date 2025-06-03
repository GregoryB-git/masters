package h6;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f7150c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static b f7151d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f7152a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f7153b;

    public b(Context context) {
        this.f7153b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        m6.j.i(context);
        ReentrantLock reentrantLock = f7150c;
        reentrantLock.lock();
        try {
            if (f7151d == null) {
                f7151d = new b(context.getApplicationContext());
            }
            b bVar = f7151d;
            reentrantLock.unlock();
            return bVar;
        } catch (Throwable th) {
            f7150c.unlock();
            throw th;
        }
    }

    public static final String g(String str, String str2) {
        return defpackage.g.e(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String e10;
        String e11 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e11) && (e10 = e(g("googleSignInAccount", e11))) != null) {
            try {
                return GoogleSignInAccount.E(e10);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final GoogleSignInOptions c() {
        String e10;
        String e11 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e11) || (e10 = e(g("googleSignInOptions", e11))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.E(e10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        m6.j.i(googleSignInAccount);
        m6.j.i(googleSignInOptions);
        f("defaultGoogleSignInAccount", googleSignInAccount.f2769q);
        String str = googleSignInAccount.f2769q;
        String g10 = g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f2763b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f2764c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f2765d;
            if (str4 != null) {
                jSONObject.put(Constants.EMAIL, str4);
            }
            String str5 = googleSignInAccount.f2766e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f2771s;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.t;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f2767o;
            if (str8 != null) {
                jSONObject.put(Constants.SERVER_AUTH_CODE, str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f2768p);
            jSONObject.put("obfuscatedIdentifier", googleSignInAccount.f2769q);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f2770r;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: g6.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).f2811b.compareTo(((Scope) obj2).f2811b);
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f2811b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove(Constants.SERVER_AUTH_CODE);
            f(g10, jSONObject.toString());
            String g11 = g("googleSignInOptions", str);
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(googleSignInOptions.f2780b, GoogleSignInOptions.f2778z);
                Iterator it = googleSignInOptions.f2780b.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f2811b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f2781c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f2782d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f2783e);
                if (!TextUtils.isEmpty(googleSignInOptions.f2784o)) {
                    jSONObject2.put("serverClientId", googleSignInOptions.f2784o);
                }
                if (!TextUtils.isEmpty(googleSignInOptions.f2785p)) {
                    jSONObject2.put("hostedDomain", googleSignInOptions.f2785p);
                }
                f(g11, jSONObject2.toString());
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final String e(String str) {
        this.f7152a.lock();
        try {
            return this.f7153b.getString(str, null);
        } finally {
            this.f7152a.unlock();
        }
    }

    public final void f(String str, String str2) {
        this.f7152a.lock();
        try {
            this.f7153b.edit().putString(str, str2).apply();
        } finally {
            this.f7152a.unlock();
        }
    }
}
