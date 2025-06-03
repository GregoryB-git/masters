package y1;

import O1.P;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import x1.C2146B;

/* renamed from: y1.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2243L {

    /* renamed from: c, reason: collision with root package name */
    public static SharedPreferences f21343c;

    /* renamed from: a, reason: collision with root package name */
    public static final C2243L f21341a = new C2243L();

    /* renamed from: b, reason: collision with root package name */
    public static final String f21342b = C2243L.class.getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f21344d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f21345e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap f21346f = new ConcurrentHashMap();

    public static final void d() {
        if (T1.a.d(C2243L.class)) {
            return;
        }
        try {
            C2237F.f21324b.b().execute(new Runnable() { // from class: y1.J
                @Override // java.lang.Runnable
                public final void run() {
                    C2243L.e();
                }
            });
        } catch (Throwable th) {
            T1.a.b(th, C2243L.class);
        }
    }

    public static final void e() {
        if (T1.a.d(C2243L.class)) {
            return;
        }
        try {
            if (!f21344d.get()) {
                Log.w(f21342b, "initStore should have been called before calling setUserData");
                f21341a.h();
            }
            f21345e.clear();
            SharedPreferences sharedPreferences = f21343c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("com.facebook.appevents.UserDataStore.userData", null).apply();
            } else {
                Intrinsics.n("sharedPreferences");
                throw null;
            }
        } catch (Throwable th) {
            T1.a.b(th, C2243L.class);
        }
    }

    public static final String f() {
        if (T1.a.d(C2243L.class)) {
            return null;
        }
        try {
            if (!f21344d.get()) {
                f21341a.h();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f21345e);
            hashMap.putAll(f21341a.g());
            return P.l0(hashMap);
        } catch (Throwable th) {
            T1.a.b(th, C2243L.class);
            return null;
        }
    }

    public static final void i() {
        if (T1.a.d(C2243L.class)) {
            return;
        }
        try {
            if (f21344d.get()) {
                return;
            }
            f21341a.h();
        } catch (Throwable th) {
            T1.a.b(th, C2243L.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
    
        r4 = new java.lang.String[0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.C2243L.l(java.util.Map):void");
    }

    public static final void m(final Bundle bundle) {
        if (T1.a.d(C2243L.class)) {
            return;
        }
        try {
            C2237F.f21324b.b().execute(new Runnable() { // from class: y1.I
                @Override // java.lang.Runnable
                public final void run() {
                    C2243L.o(bundle);
                }
            });
        } catch (Throwable th) {
            T1.a.b(th, C2243L.class);
        }
    }

    public static final void n(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (T1.a.d(C2243L.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString("em", str);
            }
            if (str2 != null) {
                bundle.putString("fn", str2);
            }
            if (str3 != null) {
                bundle.putString("ln", str3);
            }
            if (str4 != null) {
                bundle.putString("ph", str4);
            }
            if (str5 != null) {
                bundle.putString("db", str5);
            }
            if (str6 != null) {
                bundle.putString("ge", str6);
            }
            if (str7 != null) {
                bundle.putString("ct", str7);
            }
            if (str8 != null) {
                bundle.putString("st", str8);
            }
            if (str9 != null) {
                bundle.putString("zp", str9);
            }
            if (str10 != null) {
                bundle.putString("country", str10);
            }
            m(bundle);
        } catch (Throwable th) {
            T1.a.b(th, C2243L.class);
        }
    }

    public static final void o(Bundle bundle) {
        if (T1.a.d(C2243L.class)) {
            return;
        }
        try {
            if (!f21344d.get()) {
                Log.w(f21342b, "initStore should have been called before calling setUserData");
                f21341a.h();
            }
            C2243L c2243l = f21341a;
            c2243l.p(bundle);
            P p7 = P.f3756a;
            c2243l.q("com.facebook.appevents.UserDataStore.userData", P.l0(f21345e));
            c2243l.q("com.facebook.appevents.UserDataStore.internalUserData", P.l0(f21346f));
        } catch (Throwable th) {
            T1.a.b(th, C2243L.class);
        }
    }

    public static final void r(String key, String value) {
        if (T1.a.d(C2243L.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(key, "$key");
            Intrinsics.checkNotNullParameter(value, "$value");
            if (!f21344d.get()) {
                f21341a.h();
            }
            SharedPreferences sharedPreferences = f21343c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(key, value).apply();
            } else {
                Intrinsics.n("sharedPreferences");
                throw null;
            }
        } catch (Throwable th) {
            T1.a.b(th, C2243L.class);
        }
    }

    public final Map g() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set b7 = z1.d.f21628d.b();
            for (String str : f21346f.keySet()) {
                if (b7.contains(str)) {
                    hashMap.put(str, f21346f.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final synchronized void h() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f21344d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C2146B.l());
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
            f21343c = defaultSharedPreferences;
            if (defaultSharedPreferences == null) {
                Intrinsics.n("sharedPreferences");
                throw null;
            }
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences = f21343c;
            if (sharedPreferences == null) {
                Intrinsics.n("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            f21345e.putAll(P.h0(string));
            f21346f.putAll(P.h0(string2));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final boolean j(String str) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return new Regex("[A-Fa-f0-9]{64}").b(str);
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final String k(String str, String str2) {
        String str3;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i7 = 0;
            boolean z7 = false;
            while (i7 <= length) {
                boolean z8 = Intrinsics.d(str2.charAt(!z7 ? i7 : length), 32) <= 0;
                if (z7) {
                    if (!z8) {
                        break;
                    }
                    length--;
                } else if (z8) {
                    i7++;
                } else {
                    z7 = true;
                }
            }
            String obj = str2.subSequence(i7, length + 1).toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (Intrinsics.a("em", str)) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                Log.e(f21342b, "Setting email failure: this is not a valid email address");
                return "";
            }
            if (Intrinsics.a("ph", str)) {
                return new Regex("[^0-9]").replace(lowerCase, "");
            }
            if (!Intrinsics.a("ge", str)) {
                return lowerCase;
            }
            if (lowerCase.length() <= 0) {
                str3 = "";
            } else {
                if (lowerCase == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                str3 = lowerCase.substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            if (!Intrinsics.a("f", str3) && !Intrinsics.a("m", str3)) {
                Log.e(f21342b, "Setting gender failure: the supported value for gender is f or m");
                return "";
            }
            return str3;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final void p(Bundle bundle) {
        ConcurrentHashMap concurrentHashMap;
        String lowerCase;
        if (T1.a.d(this) || bundle == null) {
            return;
        }
        try {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (obj != null) {
                    String obj2 = obj.toString();
                    if (j(obj2)) {
                        concurrentHashMap = f21345e;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        lowerCase = obj2.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                    } else {
                        P p7 = P.f3756a;
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        lowerCase = P.F0(k(key, obj2));
                        if (lowerCase != null) {
                            concurrentHashMap = f21345e;
                        }
                    }
                    concurrentHashMap.put(key, lowerCase);
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void q(final String str, final String str2) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            C2146B.t().execute(new Runnable() { // from class: y1.K
                @Override // java.lang.Runnable
                public final void run() {
                    C2243L.r(str, str2);
                }
            });
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
