package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b.z;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g6.e;
import g6.f;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import k6.a;
import m6.j;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInOptions extends n6.a implements a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions t;

    /* renamed from: u, reason: collision with root package name */
    public static final GoogleSignInOptions f2773u;

    /* renamed from: v, reason: collision with root package name */
    public static final Scope f2774v;

    /* renamed from: w, reason: collision with root package name */
    public static final Scope f2775w;

    /* renamed from: x, reason: collision with root package name */
    public static final Scope f2776x;

    /* renamed from: y, reason: collision with root package name */
    public static final Scope f2777y;

    /* renamed from: z, reason: collision with root package name */
    public static final e f2778z;

    /* renamed from: a, reason: collision with root package name */
    public final int f2779a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2780b;

    /* renamed from: c, reason: collision with root package name */
    public Account f2781c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2782d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2783e;
    public final boolean f;

    /* renamed from: o, reason: collision with root package name */
    public String f2784o;

    /* renamed from: p, reason: collision with root package name */
    public String f2785p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2786q;

    /* renamed from: r, reason: collision with root package name */
    public String f2787r;

    /* renamed from: s, reason: collision with root package name */
    public Map f2788s;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public HashSet f2789a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2790b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2791c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2792d;

        /* renamed from: e, reason: collision with root package name */
        public String f2793e;
        public Account f;

        /* renamed from: g, reason: collision with root package name */
        public String f2794g;

        /* renamed from: h, reason: collision with root package name */
        public HashMap f2795h;

        /* renamed from: i, reason: collision with root package name */
        public String f2796i;

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f2789a = new HashSet();
            this.f2795h = new HashMap();
            j.i(googleSignInOptions);
            this.f2789a = new HashSet(googleSignInOptions.f2780b);
            this.f2790b = googleSignInOptions.f2783e;
            this.f2791c = googleSignInOptions.f;
            this.f2792d = googleSignInOptions.f2782d;
            this.f2793e = googleSignInOptions.f2784o;
            this.f = googleSignInOptions.f2781c;
            this.f2794g = googleSignInOptions.f2785p;
            this.f2795h = GoogleSignInOptions.F(googleSignInOptions.f2786q);
            this.f2796i = googleSignInOptions.f2787r;
        }

        public final GoogleSignInOptions a() {
            if (this.f2789a.contains(GoogleSignInOptions.f2777y)) {
                HashSet hashSet = this.f2789a;
                Scope scope = GoogleSignInOptions.f2776x;
                if (hashSet.contains(scope)) {
                    this.f2789a.remove(scope);
                }
            }
            if (this.f2792d && (this.f == null || !this.f2789a.isEmpty())) {
                this.f2789a.add(GoogleSignInOptions.f2775w);
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f2789a), this.f, this.f2792d, this.f2790b, this.f2791c, this.f2793e, this.f2794g, this.f2795h, this.f2796i);
        }

        public final void b(Scope scope, Scope... scopeArr) {
            this.f2789a.add(scope);
            this.f2789a.addAll(Arrays.asList(scopeArr));
        }
    }

    static {
        Scope scope = new Scope(1, "profile");
        f2774v = new Scope(1, Constants.EMAIL);
        Scope scope2 = new Scope(1, "openid");
        f2775w = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f2776x = scope3;
        f2777y = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f2777y)) {
            Scope scope4 = f2776x;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        t = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f2777y)) {
            Scope scope5 = f2776x;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        f2773u = new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new f();
        f2778z = new e(0);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f2779a = i10;
        this.f2780b = arrayList;
        this.f2781c = account;
        this.f2782d = z10;
        this.f2783e = z11;
        this.f = z12;
        this.f2784o = str;
        this.f2785p = str2;
        this.f2786q = new ArrayList(map.values());
        this.f2788s = map;
        this.f2787r = str3;
    }

    public static GoogleSignInOptions E(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap F(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                h6.a aVar = (h6.a) it.next();
                hashMap.put(Integer.valueOf(aVar.f7148b), aVar);
            }
        }
        return hashMap;
    }

    public final ArrayList<Scope> D() {
        return new ArrayList<>(this.f2780b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0043, code lost:
    
        if (r1.equals(r4.f2781c) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r1 = r3.f2786q     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L7f
            java.util.ArrayList r1 = r4.f2786q     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L17
            goto L7f
        L17:
            java.util.ArrayList r1 = r3.f2780b     // Catch: java.lang.ClassCastException -> L7f
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r2 = r4.D()     // Catch: java.lang.ClassCastException -> L7f
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            java.util.ArrayList r1 = r3.f2780b     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r2 = r4.D()     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L34
            goto L7f
        L34:
            android.accounts.Account r1 = r3.f2781c     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L3d
            android.accounts.Account r1 = r4.f2781c     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L7f
            goto L45
        L3d:
            android.accounts.Account r2 = r4.f2781c     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L7f
        L45:
            java.lang.String r1 = r3.f2784o     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L56
            java.lang.String r1 = r4.f2784o     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L7f
            goto L61
        L56:
            java.lang.String r1 = r3.f2784o     // Catch: java.lang.ClassCastException -> L7f
            java.lang.String r2 = r4.f2784o     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L61
            goto L7f
        L61:
            boolean r1 = r3.f     // Catch: java.lang.ClassCastException -> L7f
            boolean r2 = r4.f     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            boolean r1 = r3.f2782d     // Catch: java.lang.ClassCastException -> L7f
            boolean r2 = r4.f2782d     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            boolean r1 = r3.f2783e     // Catch: java.lang.ClassCastException -> L7f
            boolean r2 = r4.f2783e     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            java.lang.String r1 = r3.f2787r     // Catch: java.lang.ClassCastException -> L7f
            java.lang.String r4 = r4.f2787r     // Catch: java.lang.ClassCastException -> L7f
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L7f
            if (r4 == 0) goto L7f
            r4 = 1
            return r4
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f2780b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).f2811b);
        }
        Collections.sort(arrayList);
        int hashCode = arrayList.hashCode() + (1 * 31);
        Account account = this.f2781c;
        int hashCode2 = (hashCode * 31) + (account == null ? 0 : account.hashCode());
        String str = this.f2784o;
        int hashCode3 = (((((((hashCode2 * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.f ? 1 : 0)) * 31) + (this.f2782d ? 1 : 0)) * 31) + (this.f2783e ? 1 : 0);
        String str2 = this.f2787r;
        return (hashCode3 * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f2779a;
        int J = z.J(20293, parcel);
        z.z(parcel, 1, i11);
        z.I(parcel, 2, D(), false);
        z.E(parcel, 3, this.f2781c, i10, false);
        z.t(parcel, 4, this.f2782d);
        z.t(parcel, 5, this.f2783e);
        z.t(parcel, 6, this.f);
        z.F(parcel, 7, this.f2784o, false);
        z.F(parcel, 8, this.f2785p, false);
        z.I(parcel, 9, this.f2786q, false);
        z.F(parcel, 10, this.f2787r, false);
        z.L(J, parcel);
    }
}
