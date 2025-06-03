/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.ClassLoader
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package Y1;

import O1.P;
import O1.Q;
import W5.C;
import Y1.A;
import Y1.B;
import Y1.G;
import Y1.n;
import Y1.q;
import Y1.r;
import Y1.s;
import Y1.t;
import Y1.y;
import Y1.z;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import x1.a;
import x1.i;
import x1.o;

public class u
implements Parcelable {
    public static final c A = new c(null);
    @NotNull
    public static final Parcelable.Creator<u> CREATOR = new Parcelable.Creator(){

        public u a(Parcel parcel) {
            Intrinsics.checkNotNullParameter((Object)parcel, "source");
            return new u(parcel);
        }

        public u[] b(int n8) {
            return new u[n8];
        }
    };
    public A[] o;
    public int p;
    public Fragment q;
    public d r;
    public a s;
    public boolean t;
    public e u;
    public Map v;
    public Map w;
    public y x;
    public int y;
    public int z;

    public u(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "source");
        this.p = -1;
        Object object2 = object.readParcelableArray(A.class.getClassLoader());
        Object[] arrobject = object2;
        if (object2 == null) {
            arrobject = new Parcelable[]{};
        }
        ArrayList arrayList = new ArrayList();
        int n8 = arrobject.length;
        int n9 = 0;
        do {
            object2 = null;
            Object var6_7 = null;
            if (n9 >= n8) break;
            Parcelable parcelable = arrobject[n9];
            object2 = var6_7;
            if (parcelable instanceof A) {
                object2 = (A)parcelable;
            }
            if (object2 != null) {
                object2.m(this);
            }
            if (object2 != null) {
                arrayList.add(object2);
            }
            ++n9;
        } while (true);
        arrobject = arrayList.toArray((Object[])new A[0]);
        if (arrobject != null) {
            this.o = (A[])arrobject;
            this.p = object.readInt();
            this.u = (e)object.readParcelable(e.class.getClassLoader());
            arrobject = P.r0((Parcel)object);
            arrobject = arrobject == null ? null : C.o((Map)arrobject);
            this.v = arrobject;
            object = P.r0((Parcel)object);
            object = object == null ? object2 : C.o((Map)object);
            this.w = object;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public u(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.p = -1;
        this.x(fragment);
    }

    public final boolean A() {
        Object object = this.j();
        boolean bl = false;
        if (object == null) {
            return false;
        }
        if (object.i() && !this.d()) {
            this.a("no_internet_permission", "1", false);
            return false;
        }
        Object object2 = this.u;
        if (object2 == null) {
            return false;
        }
        int n8 = object.o((e)object2);
        this.y = 0;
        y y8 = this.n();
        String string2 = object2.b();
        if (n8 > 0) {
            object = object.f();
            object2 = object2.q() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
            y8.d(string2, (String)object, (String)object2);
            this.z = n8;
        } else {
            String string3 = object.f();
            object2 = object2.q() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
            y8.c(string2, string3, (String)object2);
            this.a("not_tried", object.f(), true);
        }
        if (n8 > 0) {
            bl = true;
        }
        return bl;
    }

    public final void B() {
        int n8;
        A[] arra = this.j();
        if (arra != null) {
            this.q(arra.f(), "skipped", null, null, arra.e());
        }
        arra = this.o;
        while (arra != null && (n8 = this.p) < arra.length - 1) {
            this.p = n8 + 1;
            if (!this.A()) continue;
            return;
        }
        if (this.u != null) {
            this.h();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void C(f var1_1) {
        Intrinsics.checkNotNullParameter(var1_1, "pendingResult");
        if (var1_1.p == null) throw new o("Can't validate without a token");
        var2_3 = x1.a.z.e();
        var3_4 = var1_1.p;
        if (var2_3 == null) ** GOTO lbl-1000
        try {
            if (Intrinsics.a(var2_3.m(), var3_4.m())) {
                var1_1 = f.w.b(this.u, var1_1.p, var1_1.q);
            } else lbl-1000: // 2 sources:
            {
                var1_1 = f.c.d(f.w, this.u, "User logged in as different Facebook user.", null, null, 8, null);
            }
            this.f(var1_1);
            return;
        }
        catch (Exception var1_2) {}
        this.f(f.c.d(f.w, this.u, "Caught exception", var1_2.getMessage(), null, 8, null));
    }

    public final void a(String string2, String string3, boolean bl) {
        Object object = this.v;
        Map map = object;
        if (object == null) {
            map = new HashMap();
        }
        if (this.v == null) {
            this.v = map;
        }
        object = string3;
        if (map.containsKey((Object)string2)) {
            object = string3;
            if (bl) {
                object = new StringBuilder();
                object.append(map.get((Object)string2));
                object.append(',');
                object.append(string3);
                object = object.toString();
            }
        }
        map.put((Object)string2, object);
    }

    public final void b(e e8) {
        if (e8 == null) {
            return;
        }
        if (this.u == null) {
            if (x1.a.z.g() && !this.d()) {
                return;
            }
            this.u = e8;
            this.o = this.l(e8);
            this.B();
            return;
        }
        throw new o("Attempted to authorize while a request is pending.");
    }

    public final void c() {
        A a8 = this.j();
        if (a8 == null) {
            return;
        }
        a8.b();
    }

    public final boolean d() {
        if (this.t) {
            return true;
        }
        if (this.e("android.permission.INTERNET") != 0) {
            androidx.fragment.app.e e8 = this.i();
            String string2 = null;
            String string3 = e8 == null ? null : e8.getString(M1.d.c);
            if (e8 != null) {
                string2 = e8.getString(M1.d.b);
            }
            this.f(f.c.d(f.w, this.u, string3, string2, null, 8, null));
            return false;
        }
        this.t = true;
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public final int e(String string2) {
        Intrinsics.checkNotNullParameter(string2, "permission");
        androidx.fragment.app.e e8 = this.i();
        if (e8 == null) {
            return -1;
        }
        return e8.checkCallingOrSelfPermission(string2);
    }

    public final void f(f f8) {
        Intrinsics.checkNotNullParameter(f8, "outcome");
        A a8 = this.j();
        if (a8 != null) {
            this.p(a8.f(), f8, a8.e());
        }
        if ((a8 = this.v) != null) {
            f8.u = a8;
        }
        if ((a8 = this.w) != null) {
            f8.v = a8;
        }
        this.o = null;
        this.p = -1;
        this.u = null;
        this.v = null;
        this.y = 0;
        this.z = 0;
        this.u(f8);
    }

    public final void g(f f8) {
        Intrinsics.checkNotNullParameter(f8, "outcome");
        if (f8.p != null && x1.a.z.g()) {
            this.C(f8);
            return;
        }
        this.f(f8);
    }

    public final void h() {
        this.f(f.c.d(f.w, this.u, "Login attempt failed.", null, null, 8, null));
    }

    public final androidx.fragment.app.e i() {
        Fragment fragment = this.q;
        if (fragment == null) {
            return null;
        }
        return fragment.n();
    }

    public final A j() {
        int n8 = this.p;
        A[] arra = null;
        if (n8 >= 0) {
            arra = this.o;
            if (arra == null) {
                return null;
            }
            arra = arra[n8];
        }
        return arra;
    }

    public final Fragment k() {
        return this.q;
    }

    /*
     * Enabled aggressive block sorting
     */
    public A[] l(e arrobject) {
        ArrayList arrayList;
        t t8;
        block9 : {
            void var2_5;
            block10 : {
                block8 : {
                    Intrinsics.checkNotNullParameter(arrobject, "request");
                    arrayList = new ArrayList();
                    t8 = arrobject.j();
                    if (!arrobject.r()) break block8;
                    if (x1.B.s || !t8.l()) break block9;
                    r r8 = new r(this);
                    break block10;
                }
                if (t8.j()) {
                    arrayList.add((Object)new q(this));
                }
                if (x1.B.s || !t8.m()) break block9;
                s s8 = new s(this);
            }
            arrayList.add((Object)var2_5);
        }
        if (t8.e()) {
            arrayList.add((Object)new Y1.c(this));
        }
        if (t8.n()) {
            arrayList.add((Object)new G(this));
        }
        if (!arrobject.r() && t8.h()) {
            arrayList.add((Object)new n(this));
        }
        if ((arrobject = arrayList.toArray((Object[])new A[0])) != null) {
            return (A[])arrobject;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final boolean m() {
        if (this.u != null && this.p >= 0) {
            return true;
        }
        return false;
    }

    public final y n() {
        Object object;
        block5 : {
            Object object2;
            block4 : {
                object = this.x;
                if (object == null) break block4;
                String string2 = object.a();
                object2 = this.u;
                object2 = object2 == null ? null : object2.a();
                if (Intrinsics.a(string2, object2)) break block5;
            }
            object2 = object = this.i();
            if (object == null) {
                object2 = x1.B.l();
            }
            object = (object = this.u) == null ? x1.B.m() : object.a();
            this.x = object = new y((Context)object2, (String)object);
        }
        return object;
    }

    public final e o() {
        return this.u;
    }

    public final void p(String string2, f f8, Map map) {
        this.q(string2, f8.o.e(), f8.r, f8.s, map);
    }

    public final void q(String string2, String string3, String string4, String string5, Map map) {
        e e8 = this.u;
        String string6 = "fb_mobile_login_method_complete";
        if (e8 == null) {
            this.n().e("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", string2);
            return;
        }
        y y8 = this.n();
        String string7 = e8.b();
        if (e8.q()) {
            string6 = "foa_mobile_login_method_complete";
        }
        y8.b(string7, string2, string3, string4, string5, map, string6);
    }

    public final void r() {
        a a8 = this.s;
        if (a8 == null) {
            return;
        }
        a8.a();
    }

    public final void t() {
        a a8 = this.s;
        if (a8 == null) {
            return;
        }
        a8.b();
    }

    public final void u(f f8) {
        d d8 = this.r;
        if (d8 == null) {
            return;
        }
        d8.a(f8);
    }

    public final boolean v(int n8, int n9, Intent intent) {
        ++this.y;
        if (this.u != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.x, false)) {
                this.B();
                return false;
            }
            A a8 = this.j();
            if (!(a8 == null || a8.n() && intent == null && this.y < this.z)) {
                return a8.j(n8, n9, intent);
            }
        }
        return false;
    }

    public final void w(a a8) {
        this.s = a8;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        Intrinsics.checkNotNullParameter((Object)parcel, "dest");
        parcel.writeParcelableArray((Parcelable[])this.o, n8);
        parcel.writeInt(this.p);
        parcel.writeParcelable((Parcelable)this.u, n8);
        P p8 = P.a;
        P.G0(parcel, this.v);
        P.G0(parcel, this.w);
    }

    public final void x(Fragment fragment) {
        if (this.q == null) {
            this.q = fragment;
            return;
        }
        throw new o("Can't set fragment once it is already set.");
    }

    public final void y(d d8) {
        this.r = d8;
    }

    public final void z(e e8) {
        if (!this.m()) {
            this.b(e8);
        }
    }

    public static interface a {
        public void a();

        public void b();
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(g g8) {
            this();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final String a() {
            Object object;
            object = new JSONObject();
            try {
                object.put("init", System.currentTimeMillis());
            }
            catch (JSONException jSONException) {}
            object = object.toString();
            Intrinsics.checkNotNullExpressionValue(object, "e2e.toString()");
            return object;
        }

        public final int b() {
            return O1.d.p.e();
        }
    }

    public static interface d {
        public void a(f var1);
    }

    public static final class e
    implements Parcelable {
        @NotNull
        public static final Parcelable.Creator<e> CREATOR;
        public static final b G;
        public boolean A;
        public boolean B;
        public final String C;
        public final String D;
        public final String E;
        public final Y1.a F;
        public final t o;
        public Set p;
        public final Y1.e q;
        public final String r;
        public String s;
        public boolean t;
        public String u;
        public String v;
        public String w;
        public String x;
        public boolean y;
        public final B z;

        static {
            G = new b(null);
            CREATOR = new Parcelable.Creator(){

                public e a(Parcel parcel) {
                    Intrinsics.checkNotNullParameter((Object)parcel, "source");
                    return new e(parcel, null);
                }

                public e[] b(int n8) {
                    return new e[n8];
                }
            };
        }

        public e(Parcel object) {
            Object object2 = Q.a;
            this.o = t.valueOf(Q.k(object.readString(), "loginBehavior"));
            object2 = new ArrayList();
            object.readStringList((List)object2);
            this.p = new HashSet((Collection)object2);
            object2 = object.readString();
            object2 = object2 != null ? Y1.e.valueOf((String)object2) : Y1.e.p;
            this.q = object2;
            this.r = Q.k(object.readString(), "applicationId");
            this.s = Q.k(object.readString(), "authId");
            byte by = object.readByte();
            boolean bl = true;
            boolean bl2 = by != 0;
            this.t = bl2;
            this.u = object.readString();
            this.v = Q.k(object.readString(), "authType");
            this.w = object.readString();
            this.x = object.readString();
            bl2 = object.readByte() != 0;
            this.y = bl2;
            object2 = object.readString();
            object2 = object2 != null ? B.valueOf((String)object2) : B.q;
            this.z = object2;
            bl2 = object.readByte() != 0;
            this.A = bl2;
            bl2 = object.readByte() != 0 ? bl : false;
            this.B = bl2;
            this.C = Q.k(object.readString(), "nonce");
            this.D = object.readString();
            this.E = object.readString();
            object = object.readString();
            object = object == null ? null : Y1.a.valueOf((String)object);
            this.F = object;
        }

        public /* synthetic */ e(Parcel parcel, g g8) {
            this(parcel);
        }

        public final String a() {
            return this.r;
        }

        public final String b() {
            return this.s;
        }

        public final String c() {
            return this.v;
        }

        public final String d() {
            return this.E;
        }

        public int describeContents() {
            return 0;
        }

        public final Y1.a e() {
            return this.F;
        }

        public final String f() {
            return this.D;
        }

        public final Y1.e g() {
            return this.q;
        }

        public final String h() {
            return this.w;
        }

        public final String i() {
            return this.u;
        }

        public final t j() {
            return this.o;
        }

        public final B k() {
            return this.z;
        }

        public final String l() {
            return this.x;
        }

        public final String m() {
            return this.C;
        }

        public final Set n() {
            return this.p;
        }

        public final boolean o() {
            return this.y;
        }

        public final boolean p() {
            for (String string2 : this.p) {
                if (!z.a.c(string2)) continue;
                return true;
            }
            return false;
        }

        public final boolean q() {
            return this.A;
        }

        public final boolean r() {
            if (this.z == B.r) {
                return true;
            }
            return false;
        }

        public final boolean t() {
            return this.t;
        }

        public final void u(Set set) {
            Intrinsics.checkNotNullParameter((Object)set, "<set-?>");
            this.p = set;
        }

        public final boolean v() {
            return this.B;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            Intrinsics.checkNotNullParameter((Object)parcel, "dest");
            parcel.writeString(this.o.name());
            parcel.writeStringList((List)new ArrayList((Collection)this.p));
            parcel.writeString(this.q.name());
            parcel.writeString(this.r);
            parcel.writeString(this.s);
            parcel.writeByte((byte)(this.t ? 1 : 0));
            parcel.writeString(this.u);
            parcel.writeString(this.v);
            parcel.writeString(this.w);
            parcel.writeString(this.x);
            parcel.writeByte((byte)(this.y ? 1 : 0));
            parcel.writeString(this.z.name());
            parcel.writeByte((byte)(this.A ? 1 : 0));
            parcel.writeByte((byte)(this.B ? 1 : 0));
            parcel.writeString(this.C);
            parcel.writeString(this.D);
            parcel.writeString(this.E);
            Object object = this.F;
            object = object == null ? null : object.name();
            parcel.writeString((String)object);
        }

        public static final class b {
            public b() {
            }

            public /* synthetic */ b(g g8) {
                this();
            }
        }

    }

    public static final class f
    implements Parcelable {
        @NotNull
        public static final Parcelable.Creator<f> CREATOR;
        public static final c w;
        public final a o;
        public final x1.a p;
        public final i q;
        public final String r;
        public final String s;
        public final e t;
        public Map u;
        public Map v;

        static {
            w = new c(null);
            CREATOR = new Parcelable.Creator(){

                public f a(Parcel parcel) {
                    Intrinsics.checkNotNullParameter((Object)parcel, "source");
                    return new f(parcel, null);
                }

                public f[] b(int n8) {
                    return new f[n8];
                }
            };
        }

        public f(e e8, a a8, x1.a a9, String string2, String string3) {
            Intrinsics.checkNotNullParameter((Object)a8, "code");
            this(e8, a8, a9, null, string2, string3);
        }

        public f(e e8, a a8, x1.a a9, i i8, String string2, String string3) {
            Intrinsics.checkNotNullParameter((Object)a8, "code");
            this.t = e8;
            this.p = a9;
            this.q = i8;
            this.r = string2;
            this.o = a8;
            this.s = string3;
        }

        public f(Parcel parcel) {
            String string2;
            String string3 = string2 = parcel.readString();
            if (string2 == null) {
                string3 = "error";
            }
            this.o = a.valueOf(string3);
            this.p = (x1.a)parcel.readParcelable(x1.a.class.getClassLoader());
            this.q = (i)parcel.readParcelable(i.class.getClassLoader());
            this.r = parcel.readString();
            this.s = parcel.readString();
            this.t = (e)parcel.readParcelable(e.class.getClassLoader());
            this.u = P.r0(parcel);
            this.v = P.r0(parcel);
        }

        public /* synthetic */ f(Parcel parcel, g g8) {
            this(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            Intrinsics.checkNotNullParameter((Object)parcel, "dest");
            parcel.writeString(this.o.name());
            parcel.writeParcelable((Parcelable)this.p, n8);
            parcel.writeParcelable((Parcelable)this.q, n8);
            parcel.writeString(this.r);
            parcel.writeString(this.s);
            parcel.writeParcelable((Parcelable)this.t, n8);
            P p8 = P.a;
            P.G0(parcel, this.u);
            P.G0(parcel, this.v);
        }

        public static final class a
        extends Enum {
            public static final /* enum */ a p = new a("success");
            public static final /* enum */ a q = new a("cancel");
            public static final /* enum */ a r = new a("error");
            public static final /* synthetic */ a[] s;
            public final String o;

            static {
                s = a.c();
            }

            public a(String string3) {
                this.o = string3;
            }

            public static final /* synthetic */ a[] c() {
                return new a[]{p, q, r};
            }

            public static a valueOf(String string2) {
                Intrinsics.checkNotNullParameter(string2, "value");
                return (a)Enum.valueOf(a.class, (String)string2);
            }

            public static a[] values() {
                a[] arra = s;
                return (a[])Arrays.copyOf((Object[])arra, (int)arra.length);
            }

            public final String e() {
                return this.o;
            }
        }

        public static final class c {
            public c() {
            }

            public /* synthetic */ c(g g8) {
                this();
            }

            public static /* synthetic */ f d(c c8, e e8, String string2, String string3, String string4, int n8, Object object) {
                if ((n8 & 8) != 0) {
                    string4 = null;
                }
                return c8.c(e8, string2, string3, string4);
            }

            public final f a(e e8, String string2) {
                return new f(e8, a.q, null, string2, null);
            }

            public final f b(e e8, x1.a a8, i i8) {
                return new f(e8, a.p, a8, i8, null, null);
            }

            public final f c(e e8, String string2, String string3, String string4) {
                ArrayList arrayList = new ArrayList();
                if (string2 != null) {
                    arrayList.add((Object)string2);
                }
                if (string3 != null) {
                    arrayList.add((Object)string3);
                }
                string2 = TextUtils.join((CharSequence)": ", (Iterable)arrayList);
                return new f(e8, a.r, null, string2, string4);
            }

            public final f e(e e8, x1.a a8) {
                Intrinsics.checkNotNullParameter(a8, "token");
                return new f(e8, a.p, a8, null, null);
            }
        }

    }

}

