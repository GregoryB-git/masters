package Y1;

import O1.EnumC0441d;
import O1.P;
import O1.Q;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;
import x1.C2148a;
import x1.C2156i;
import x1.C2162o;

/* loaded from: classes.dex */
public class u implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    public static final c f7470A = new c(null);

    @NotNull
    public static final Parcelable.Creator<u> CREATOR = new b();

    /* renamed from: o, reason: collision with root package name */
    public A[] f7471o;

    /* renamed from: p, reason: collision with root package name */
    public int f7472p;

    /* renamed from: q, reason: collision with root package name */
    public Fragment f7473q;

    /* renamed from: r, reason: collision with root package name */
    public d f7474r;

    /* renamed from: s, reason: collision with root package name */
    public a f7475s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7476t;

    /* renamed from: u, reason: collision with root package name */
    public e f7477u;

    /* renamed from: v, reason: collision with root package name */
    public Map f7478v;

    /* renamed from: w, reason: collision with root package name */
    public Map f7479w;

    /* renamed from: x, reason: collision with root package name */
    public y f7480x;

    /* renamed from: y, reason: collision with root package name */
    public int f7481y;

    /* renamed from: z, reason: collision with root package name */
    public int f7482z;

    public interface a {
        void a();

        void b();
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new u(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u[] newArray(int i7) {
            return new u[i7];
        }
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "e2e.toString()");
            return jSONObject2;
        }

        public final int b() {
            return EnumC0441d.Login.e();
        }
    }

    public interface d {
        void a(f fVar);
    }

    public static final class e implements Parcelable {

        /* renamed from: A, reason: collision with root package name */
        public boolean f7484A;

        /* renamed from: B, reason: collision with root package name */
        public boolean f7485B;

        /* renamed from: C, reason: collision with root package name */
        public final String f7486C;

        /* renamed from: D, reason: collision with root package name */
        public final String f7487D;

        /* renamed from: E, reason: collision with root package name */
        public final String f7488E;

        /* renamed from: F, reason: collision with root package name */
        public final EnumC0708a f7489F;

        /* renamed from: o, reason: collision with root package name */
        public final t f7490o;

        /* renamed from: p, reason: collision with root package name */
        public Set f7491p;

        /* renamed from: q, reason: collision with root package name */
        public final EnumC0712e f7492q;

        /* renamed from: r, reason: collision with root package name */
        public final String f7493r;

        /* renamed from: s, reason: collision with root package name */
        public String f7494s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f7495t;

        /* renamed from: u, reason: collision with root package name */
        public String f7496u;

        /* renamed from: v, reason: collision with root package name */
        public String f7497v;

        /* renamed from: w, reason: collision with root package name */
        public String f7498w;

        /* renamed from: x, reason: collision with root package name */
        public String f7499x;

        /* renamed from: y, reason: collision with root package name */
        public boolean f7500y;

        /* renamed from: z, reason: collision with root package name */
        public final B f7501z;

        /* renamed from: G, reason: collision with root package name */
        public static final b f7483G = new b(null);

        @NotNull
        public static final Parcelable.Creator<e> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new e(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i7) {
                return new e[i7];
            }
        }

        public static final class b {
            public b() {
            }

            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public e(Parcel parcel) {
            Q q7 = Q.f3766a;
            this.f7490o = t.valueOf(Q.k(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f7491p = new HashSet(arrayList);
            String readString = parcel.readString();
            this.f7492q = readString != null ? EnumC0712e.valueOf(readString) : EnumC0712e.NONE;
            this.f7493r = Q.k(parcel.readString(), "applicationId");
            this.f7494s = Q.k(parcel.readString(), "authId");
            this.f7495t = parcel.readByte() != 0;
            this.f7496u = parcel.readString();
            this.f7497v = Q.k(parcel.readString(), "authType");
            this.f7498w = parcel.readString();
            this.f7499x = parcel.readString();
            this.f7500y = parcel.readByte() != 0;
            String readString2 = parcel.readString();
            this.f7501z = readString2 != null ? B.valueOf(readString2) : B.FACEBOOK;
            this.f7484A = parcel.readByte() != 0;
            this.f7485B = parcel.readByte() != 0;
            this.f7486C = Q.k(parcel.readString(), "nonce");
            this.f7487D = parcel.readString();
            this.f7488E = parcel.readString();
            String readString3 = parcel.readString();
            this.f7489F = readString3 == null ? null : EnumC0708a.valueOf(readString3);
        }

        public final String a() {
            return this.f7493r;
        }

        public final String b() {
            return this.f7494s;
        }

        public final String c() {
            return this.f7497v;
        }

        public final String d() {
            return this.f7488E;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final EnumC0708a e() {
            return this.f7489F;
        }

        public final String f() {
            return this.f7487D;
        }

        public final EnumC0712e g() {
            return this.f7492q;
        }

        public final String h() {
            return this.f7498w;
        }

        public final String i() {
            return this.f7496u;
        }

        public final t j() {
            return this.f7490o;
        }

        public final B k() {
            return this.f7501z;
        }

        public final String l() {
            return this.f7499x;
        }

        public final String m() {
            return this.f7486C;
        }

        public final Set n() {
            return this.f7491p;
        }

        public final boolean o() {
            return this.f7500y;
        }

        public final boolean p() {
            Iterator it = this.f7491p.iterator();
            while (it.hasNext()) {
                if (z.f7532a.c((String) it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final boolean q() {
            return this.f7484A;
        }

        public final boolean r() {
            return this.f7501z == B.INSTAGRAM;
        }

        public final boolean t() {
            return this.f7495t;
        }

        public final void u(Set set) {
            Intrinsics.checkNotNullParameter(set, "<set-?>");
            this.f7491p = set;
        }

        public final boolean v() {
            return this.f7485B;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i7) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f7490o.name());
            dest.writeStringList(new ArrayList(this.f7491p));
            dest.writeString(this.f7492q.name());
            dest.writeString(this.f7493r);
            dest.writeString(this.f7494s);
            dest.writeByte(this.f7495t ? (byte) 1 : (byte) 0);
            dest.writeString(this.f7496u);
            dest.writeString(this.f7497v);
            dest.writeString(this.f7498w);
            dest.writeString(this.f7499x);
            dest.writeByte(this.f7500y ? (byte) 1 : (byte) 0);
            dest.writeString(this.f7501z.name());
            dest.writeByte(this.f7484A ? (byte) 1 : (byte) 0);
            dest.writeByte(this.f7485B ? (byte) 1 : (byte) 0);
            dest.writeString(this.f7486C);
            dest.writeString(this.f7487D);
            dest.writeString(this.f7488E);
            EnumC0708a enumC0708a = this.f7489F;
            dest.writeString(enumC0708a == null ? null : enumC0708a.name());
        }

        public /* synthetic */ e(Parcel parcel, kotlin.jvm.internal.g gVar) {
            this(parcel);
        }
    }

    public static final class f implements Parcelable {

        /* renamed from: o, reason: collision with root package name */
        public final a f7503o;

        /* renamed from: p, reason: collision with root package name */
        public final C2148a f7504p;

        /* renamed from: q, reason: collision with root package name */
        public final C2156i f7505q;

        /* renamed from: r, reason: collision with root package name */
        public final String f7506r;

        /* renamed from: s, reason: collision with root package name */
        public final String f7507s;

        /* renamed from: t, reason: collision with root package name */
        public final e f7508t;

        /* renamed from: u, reason: collision with root package name */
        public Map f7509u;

        /* renamed from: v, reason: collision with root package name */
        public Map f7510v;

        /* renamed from: w, reason: collision with root package name */
        public static final c f7502w = new c(null);

        @NotNull
        public static final Parcelable.Creator<f> CREATOR = new b();

        public enum a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");


            /* renamed from: o, reason: collision with root package name */
            public final String f7515o;

            a(String str) {
                this.f7515o = str;
            }

            /* renamed from: values, reason: to resolve conflict with enum method */
            public static a[] valuesCustom() {
                a[] valuesCustom = values();
                return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
            }

            public final String e() {
                return this.f7515o;
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new f(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i7) {
                return new f[i7];
            }
        }

        public static final class c {
            public c() {
            }

            public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
                this();
            }

            public static /* synthetic */ f d(c cVar, e eVar, String str, String str2, String str3, int i7, Object obj) {
                if ((i7 & 8) != 0) {
                    str3 = null;
                }
                return cVar.c(eVar, str, str2, str3);
            }

            public final f a(e eVar, String str) {
                return new f(eVar, a.CANCEL, null, str, null);
            }

            public final f b(e eVar, C2148a c2148a, C2156i c2156i) {
                return new f(eVar, a.SUCCESS, c2148a, c2156i, null, null);
            }

            public final f c(e eVar, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new f(eVar, a.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }

            public final f e(e eVar, C2148a token) {
                Intrinsics.checkNotNullParameter(token, "token");
                return new f(eVar, a.SUCCESS, token, null, null);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(e eVar, a code, C2148a c2148a, String str, String str2) {
            this(eVar, code, c2148a, null, str, str2);
            Intrinsics.checkNotNullParameter(code, "code");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i7) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f7503o.name());
            dest.writeParcelable(this.f7504p, i7);
            dest.writeParcelable(this.f7505q, i7);
            dest.writeString(this.f7506r);
            dest.writeString(this.f7507s);
            dest.writeParcelable(this.f7508t, i7);
            P p7 = P.f3756a;
            P.G0(dest, this.f7509u);
            P.G0(dest, this.f7510v);
        }

        public f(e eVar, a code, C2148a c2148a, C2156i c2156i, String str, String str2) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f7508t = eVar;
            this.f7504p = c2148a;
            this.f7505q = c2156i;
            this.f7506r = str;
            this.f7503o = code;
            this.f7507s = str2;
        }

        public f(Parcel parcel) {
            String readString = parcel.readString();
            this.f7503o = a.valueOf(readString == null ? "error" : readString);
            this.f7504p = (C2148a) parcel.readParcelable(C2148a.class.getClassLoader());
            this.f7505q = (C2156i) parcel.readParcelable(C2156i.class.getClassLoader());
            this.f7506r = parcel.readString();
            this.f7507s = parcel.readString();
            this.f7508t = (e) parcel.readParcelable(e.class.getClassLoader());
            this.f7509u = P.r0(parcel);
            this.f7510v = P.r0(parcel);
        }

        public /* synthetic */ f(Parcel parcel, kotlin.jvm.internal.g gVar) {
            this(parcel);
        }
    }

    public u(Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7472p = -1;
        Parcelable[] readParcelableArray = source.readParcelableArray(A.class.getClassLoader());
        readParcelableArray = readParcelableArray == null ? new Parcelable[0] : readParcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = readParcelableArray.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            Parcelable parcelable = readParcelableArray[i7];
            A a7 = parcelable instanceof A ? (A) parcelable : null;
            if (a7 != null) {
                a7.m(this);
            }
            if (a7 != null) {
                arrayList.add(a7);
            }
            i7++;
        }
        Object[] array = arrayList.toArray(new A[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.f7471o = (A[]) array;
        this.f7472p = source.readInt();
        this.f7477u = (e) source.readParcelable(e.class.getClassLoader());
        Map r02 = P.r0(source);
        this.f7478v = r02 == null ? null : W5.F.o(r02);
        Map r03 = P.r0(source);
        this.f7479w = r03 != null ? W5.F.o(r03) : null;
    }

    public final boolean A() {
        A j7 = j();
        if (j7 == null) {
            return false;
        }
        if (j7.i() && !d()) {
            a("no_internet_permission", "1", false);
            return false;
        }
        e eVar = this.f7477u;
        if (eVar == null) {
            return false;
        }
        int o7 = j7.o(eVar);
        this.f7481y = 0;
        y n7 = n();
        String b7 = eVar.b();
        if (o7 > 0) {
            n7.d(b7, j7.f(), eVar.q() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start");
            this.f7482z = o7;
        } else {
            n7.c(b7, j7.f(), eVar.q() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried");
            a("not_tried", j7.f(), true);
        }
        return o7 > 0;
    }

    public final void B() {
        A j7 = j();
        if (j7 != null) {
            q(j7.f(), "skipped", null, null, j7.e());
        }
        A[] aArr = this.f7471o;
        while (aArr != null) {
            int i7 = this.f7472p;
            if (i7 >= aArr.length - 1) {
                break;
            }
            this.f7472p = i7 + 1;
            if (A()) {
                return;
            }
        }
        if (this.f7477u != null) {
            h();
        }
    }

    public final void C(f pendingResult) {
        f b7;
        Intrinsics.checkNotNullParameter(pendingResult, "pendingResult");
        if (pendingResult.f7504p == null) {
            throw new C2162o("Can't validate without a token");
        }
        C2148a e7 = C2148a.f21014z.e();
        C2148a c2148a = pendingResult.f7504p;
        if (e7 != null) {
            try {
                if (Intrinsics.a(e7.m(), c2148a.m())) {
                    b7 = f.f7502w.b(this.f7477u, pendingResult.f7504p, pendingResult.f7505q);
                    f(b7);
                }
            } catch (Exception e8) {
                f(f.c.d(f.f7502w, this.f7477u, "Caught exception", e8.getMessage(), null, 8, null));
                return;
            }
        }
        b7 = f.c.d(f.f7502w, this.f7477u, "User logged in as different Facebook user.", null, null, 8, null);
        f(b7);
    }

    public final void a(String str, String str2, boolean z7) {
        Map map = this.f7478v;
        if (map == null) {
            map = new HashMap();
        }
        if (this.f7478v == null) {
            this.f7478v = map;
        }
        if (map.containsKey(str) && z7) {
            str2 = map.get(str) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final void b(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f7477u != null) {
            throw new C2162o("Attempted to authorize while a request is pending.");
        }
        if (!C2148a.f21014z.g() || d()) {
            this.f7477u = eVar;
            this.f7471o = l(eVar);
            B();
        }
    }

    public final void c() {
        A j7 = j();
        if (j7 == null) {
            return;
        }
        j7.b();
    }

    public final boolean d() {
        if (this.f7476t) {
            return true;
        }
        if (e("android.permission.INTERNET") == 0) {
            this.f7476t = true;
            return true;
        }
        androidx.fragment.app.e i7 = i();
        f(f.c.d(f.f7502w, this.f7477u, i7 == null ? null : i7.getString(M1.d.f3493c), i7 != null ? i7.getString(M1.d.f3492b) : null, null, 8, null));
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e(String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        androidx.fragment.app.e i7 = i();
        if (i7 == null) {
            return -1;
        }
        return i7.checkCallingOrSelfPermission(permission);
    }

    public final void f(f outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        A j7 = j();
        if (j7 != null) {
            p(j7.f(), outcome, j7.e());
        }
        Map map = this.f7478v;
        if (map != null) {
            outcome.f7509u = map;
        }
        Map map2 = this.f7479w;
        if (map2 != null) {
            outcome.f7510v = map2;
        }
        this.f7471o = null;
        this.f7472p = -1;
        this.f7477u = null;
        this.f7478v = null;
        this.f7481y = 0;
        this.f7482z = 0;
        u(outcome);
    }

    public final void g(f outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (outcome.f7504p == null || !C2148a.f21014z.g()) {
            f(outcome);
        } else {
            C(outcome);
        }
    }

    public final void h() {
        f(f.c.d(f.f7502w, this.f7477u, "Login attempt failed.", null, null, 8, null));
    }

    public final androidx.fragment.app.e i() {
        Fragment fragment = this.f7473q;
        if (fragment == null) {
            return null;
        }
        return fragment.n();
    }

    public final A j() {
        A[] aArr;
        int i7 = this.f7472p;
        if (i7 < 0 || (aArr = this.f7471o) == null) {
            return null;
        }
        return aArr[i7];
    }

    public final Fragment k() {
        return this.f7473q;
    }

    public A[] l(e request) {
        A sVar;
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = new ArrayList();
        t j7 = request.j();
        if (!request.r()) {
            if (j7.j()) {
                arrayList.add(new q(this));
            }
            if (!C2146B.f20880s && j7.m()) {
                sVar = new s(this);
                arrayList.add(sVar);
            }
        } else if (!C2146B.f20880s && j7.l()) {
            sVar = new r(this);
            arrayList.add(sVar);
        }
        if (j7.e()) {
            arrayList.add(new C0710c(this));
        }
        if (j7.n()) {
            arrayList.add(new G(this));
        }
        if (!request.r() && j7.h()) {
            arrayList.add(new n(this));
        }
        Object[] array = arrayList.toArray(new A[0]);
        if (array != null) {
            return (A[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final boolean m() {
        return this.f7477u != null && this.f7472p >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r1, r2 == null ? null : r2.a()) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Y1.y n() {
        /*
            r3 = this;
            Y1.y r0 = r3.f7480x
            if (r0 == 0) goto L18
            java.lang.String r1 = r0.a()
            Y1.u$e r2 = r3.f7477u
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            java.lang.String r2 = r2.a()
        L12:
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r1, r2)
            if (r1 != 0) goto L36
        L18:
            Y1.y r0 = new Y1.y
            androidx.fragment.app.e r1 = r3.i()
            if (r1 != 0) goto L24
            android.content.Context r1 = x1.C2146B.l()
        L24:
            Y1.u$e r2 = r3.f7477u
            if (r2 != 0) goto L2d
            java.lang.String r2 = x1.C2146B.m()
            goto L31
        L2d:
            java.lang.String r2 = r2.a()
        L31:
            r0.<init>(r1, r2)
            r3.f7480x = r0
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.u.n():Y1.y");
    }

    public final e o() {
        return this.f7477u;
    }

    public final void p(String str, f fVar, Map map) {
        q(str, fVar.f7503o.e(), fVar.f7506r, fVar.f7507s, map);
    }

    public final void q(String str, String str2, String str3, String str4, Map map) {
        e eVar = this.f7477u;
        if (eVar == null) {
            n().e("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            n().b(eVar.b(), str, str2, str3, str4, map, eVar.q() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    public final void r() {
        a aVar = this.f7475s;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public final void t() {
        a aVar = this.f7475s;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public final void u(f fVar) {
        d dVar = this.f7474r;
        if (dVar == null) {
            return;
        }
        dVar.a(fVar);
    }

    public final boolean v(int i7, int i8, Intent intent) {
        this.f7481y++;
        if (this.f7477u != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f10223x, false)) {
                B();
                return false;
            }
            A j7 = j();
            if (j7 != null && (!j7.n() || intent != null || this.f7481y >= this.f7482z)) {
                return j7.j(i7, i8, intent);
            }
        }
        return false;
    }

    public final void w(a aVar) {
        this.f7475s = aVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelableArray(this.f7471o, i7);
        dest.writeInt(this.f7472p);
        dest.writeParcelable(this.f7477u, i7);
        P p7 = P.f3756a;
        P.G0(dest, this.f7478v);
        P.G0(dest, this.f7479w);
    }

    public final void x(Fragment fragment) {
        if (this.f7473q != null) {
            throw new C2162o("Can't set fragment once it is already set.");
        }
        this.f7473q = fragment;
    }

    public final void y(d dVar) {
        this.f7474r = dVar;
    }

    public final void z(e eVar) {
        if (m()) {
            return;
        }
        b(eVar);
    }

    public u(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f7472p = -1;
        x(fragment);
    }
}
