// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import android.text.TextUtils;
import java.util.Arrays;
import x1.i;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import O1.Q;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import com.facebook.CustomTabMainActivity;
import android.content.Intent;
import android.content.Context;
import x1.B;
import androidx.fragment.app.e;
import M1.d;
import java.util.HashMap;
import x1.o;
import x1.a;
import W5.C;
import O1.P;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import android.os.Parcel;
import kotlin.jvm.internal.g;
import java.util.Map;
import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.NotNull;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class u implements Parcelable
{
    public static final c A;
    @NotNull
    public static final Parcelable$Creator<u> CREATOR;
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
    
    static {
        A = new c(null);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public u a(final Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new u(parcel);
            }
            
            public u[] b(final int n) {
                return new u[n];
            }
        };
    }
    
    public u(final Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        this.p = -1;
        Parcelable[] parcelableArray;
        if ((parcelableArray = parcel.readParcelableArray(A.class.getClassLoader())) == null) {
            parcelableArray = new Parcelable[0];
        }
        final ArrayList<A> list = new ArrayList<A>();
        final int length = parcelableArray.length;
        int n = 0;
        Map map;
        while (true) {
            map = null;
            final A a = null;
            if (n >= length) {
                break;
            }
            final Parcelable parcelable = parcelableArray[n];
            A a2 = a;
            if (parcelable instanceof A) {
                a2 = (A)parcelable;
            }
            if (a2 != null) {
                a2.m(this);
            }
            if (a2 != null) {
                list.add(a2);
            }
            ++n;
        }
        final A[] array = list.toArray(new A[0]);
        if (array != null) {
            this.o = array;
            this.p = parcel.readInt();
            this.u = (e)parcel.readParcelable(e.class.getClassLoader());
            final Map r0 = P.r0(parcel);
            Map o;
            if (r0 == null) {
                o = null;
            }
            else {
                o = C.o(r0);
            }
            this.v = o;
            final Map r2 = P.r0(parcel);
            Map o2;
            if (r2 == null) {
                o2 = map;
            }
            else {
                o2 = C.o(r2);
            }
            this.w = o2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
    
    public u(final Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.p = -1;
        this.x(fragment);
    }
    
    public final boolean A() {
        final A j = this.j();
        boolean b = false;
        if (j == null) {
            return false;
        }
        if (j.i() && !this.d()) {
            this.a("no_internet_permission", "1", false);
            return false;
        }
        final e u = this.u;
        if (u == null) {
            return false;
        }
        final int o = j.o(u);
        this.y = 0;
        final y n = this.n();
        final String b2 = u.b();
        if (o > 0) {
            final String f = j.f();
            String s;
            if (u.q()) {
                s = "foa_mobile_login_method_start";
            }
            else {
                s = "fb_mobile_login_method_start";
            }
            n.d(b2, f, s);
            this.z = o;
        }
        else {
            final String f2 = j.f();
            String s2;
            if (u.q()) {
                s2 = "foa_mobile_login_method_not_tried";
            }
            else {
                s2 = "fb_mobile_login_method_not_tried";
            }
            n.c(b2, f2, s2);
            this.a("not_tried", j.f(), true);
        }
        if (o > 0) {
            b = true;
        }
        return b;
    }
    
    public final void B() {
        final A j = this.j();
        if (j != null) {
            this.q(j.f(), "skipped", null, null, j.e());
        }
        final A[] o = this.o;
        while (o != null) {
            final int p = this.p;
            if (p >= o.length - 1) {
                break;
            }
            this.p = p + 1;
            if (this.A()) {
                return;
            }
        }
        if (this.u != null) {
            this.h();
        }
    }
    
    public final void C(f f) {
        Intrinsics.checkNotNullParameter(f, "pendingResult");
        while (true) {
            Label_0116: {
                if (f.p == null) {
                    break Label_0116;
                }
                final x1.a e = x1.a.z.e();
                final x1.a p = f.p;
                Label_0065: {
                    if (e == null) {
                        break Label_0065;
                    }
                    try {
                        if (Intrinsics.a(e.m(), p.m())) {
                            f = Y1.u.f.w.b(this.u, f.p, f.q);
                        }
                        else {
                            f = Y1.u.f.c.d(Y1.u.f.w, this.u, "User logged in as different Facebook user.", null, null, 8, null);
                        }
                        this.f(f);
                        return;
                        throw new o("Can't validate without a token");
                        final Exception ex;
                        this.f(Y1.u.f.c.d(Y1.u.f.w, this.u, "Caught exception", ex.getMessage(), null, 8, null));
                        return;
                    }
                    catch (Exception ex2) {}
                }
            }
            final Exception ex2;
            final Exception ex = ex2;
            continue;
        }
    }
    
    public final void a(final String s, final String str, final boolean b) {
        Map<String, String> v;
        if ((v = (Map<String, String>)this.v) == null) {
            v = new HashMap<String, String>();
        }
        if (this.v == null) {
            this.v = v;
        }
        String string = str;
        if (v.containsKey(s)) {
            string = str;
            if (b) {
                final StringBuilder sb = new StringBuilder();
                sb.append((Object)v.get(s));
                sb.append(',');
                sb.append(str);
                string = sb.toString();
            }
        }
        v.put(s, string);
    }
    
    public final void b(final e u) {
        if (u == null) {
            return;
        }
        if (this.u != null) {
            throw new o("Attempted to authorize while a request is pending.");
        }
        if (x1.a.z.g() && !this.d()) {
            return;
        }
        this.u = u;
        this.o = this.l(u);
        this.B();
    }
    
    public final void c() {
        final A j = this.j();
        if (j == null) {
            return;
        }
        j.b();
    }
    
    public final boolean d() {
        if (this.t) {
            return true;
        }
        if (this.e("android.permission.INTERNET") != 0) {
            final androidx.fragment.app.e i = this.i();
            String string = null;
            String string2;
            if (i == null) {
                string2 = null;
            }
            else {
                string2 = ((Context)i).getString(M1.d.c);
            }
            if (i != null) {
                string = ((Context)i).getString(M1.d.b);
            }
            this.f(f.c.d(f.w, this.u, string2, string, null, 8, null));
            return false;
        }
        return this.t = true;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public final int e(final String s) {
        Intrinsics.checkNotNullParameter(s, "permission");
        final androidx.fragment.app.e i = this.i();
        if (i == null) {
            return -1;
        }
        return ((Context)i).checkCallingOrSelfPermission(s);
    }
    
    public final void f(final f f) {
        Intrinsics.checkNotNullParameter(f, "outcome");
        final A j = this.j();
        if (j != null) {
            this.p(j.f(), f, j.e());
        }
        final Map v = this.v;
        if (v != null) {
            f.u = v;
        }
        final Map w = this.w;
        if (w != null) {
            f.v = w;
        }
        this.o = null;
        this.p = -1;
        this.u = null;
        this.v = null;
        this.y = 0;
        this.z = 0;
        this.u(f);
    }
    
    public final void g(final f f) {
        Intrinsics.checkNotNullParameter(f, "outcome");
        if (f.p != null && x1.a.z.g()) {
            this.C(f);
            return;
        }
        this.f(f);
    }
    
    public final void h() {
        this.f(f.c.d(f.w, this.u, "Login attempt failed.", null, null, 8, null));
    }
    
    public final androidx.fragment.app.e i() {
        final Fragment q = this.q;
        if (q == null) {
            return null;
        }
        return q.n();
    }
    
    public final A j() {
        final int p = this.p;
        A a = null;
        if (p >= 0) {
            final A[] o = this.o;
            if (o == null) {
                return null;
            }
            a = o[p];
        }
        return a;
    }
    
    public final Fragment k() {
        return this.q;
    }
    
    public A[] l(final e e) {
        Intrinsics.checkNotNullParameter(e, "request");
        final ArrayList<q> list = new ArrayList<q>();
        final t j = e.j();
        Label_0107: {
            D e2;
            if (e.r()) {
                if (B.s || !j.l()) {
                    break Label_0107;
                }
                e2 = new r(this);
            }
            else {
                if (j.j()) {
                    list.add(new q(this));
                }
                if (B.s || !j.m()) {
                    break Label_0107;
                }
                e2 = new s(this);
            }
            list.add((q)e2);
        }
        if (j.e()) {
            list.add((q)new Y1.c(this));
        }
        if (j.n()) {
            list.add((q)new G(this));
        }
        if (!e.r() && j.h()) {
            list.add((q)new n(this));
        }
        final A[] array = list.toArray(new A[0]);
        if (array != null) {
            return array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
    
    public final boolean m() {
        return this.u != null && this.p >= 0;
    }
    
    public final y n() {
        y x = this.x;
        if (x != null) {
            final String a = x.a();
            final e u = this.u;
            Object a2;
            if (u == null) {
                a2 = null;
            }
            else {
                a2 = u.a();
            }
            if (Intrinsics.a(a, a2)) {
                return x;
            }
        }
        Object o;
        if ((o = this.i()) == null) {
            o = B.l();
        }
        final e u2 = this.u;
        String s;
        if (u2 == null) {
            s = B.m();
        }
        else {
            s = u2.a();
        }
        x = new y((Context)o, s);
        this.x = x;
        return x;
    }
    
    public final e o() {
        return this.u;
    }
    
    public final void p(final String s, final f f, final Map map) {
        this.q(s, f.o.e(), f.r, f.s, map);
    }
    
    public final void q(final String s, final String s2, final String s3, final String s4, final Map map) {
        final e u = this.u;
        String s5 = "fb_mobile_login_method_complete";
        if (u == null) {
            this.n().e("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", s);
            return;
        }
        final y n = this.n();
        final String b = u.b();
        if (u.q()) {
            s5 = "foa_mobile_login_method_complete";
        }
        n.b(b, s, s2, s3, s4, map, s5);
    }
    
    public final void r() {
        final a s = this.s;
        if (s == null) {
            return;
        }
        s.a();
    }
    
    public final void t() {
        final a s = this.s;
        if (s == null) {
            return;
        }
        s.b();
    }
    
    public final void u(final f f) {
        final d r = this.r;
        if (r == null) {
            return;
        }
        r.a(f);
    }
    
    public final boolean v(final int n, final int n2, final Intent intent) {
        ++this.y;
        if (this.u != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.x, false)) {
                this.B();
                return false;
            }
            final A j = this.j();
            if (j != null && (!j.n() || intent != null || this.y >= this.z)) {
                return j.j(n, n2, intent);
            }
        }
        return false;
    }
    
    public final void w(final a s) {
        this.s = s;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeParcelableArray((Parcelable[])this.o, n);
        parcel.writeInt(this.p);
        parcel.writeParcelable((Parcelable)this.u, n);
        final P a = P.a;
        P.G0(parcel, this.v);
        P.G0(parcel, this.w);
    }
    
    public final void x(final Fragment q) {
        if (this.q == null) {
            this.q = q;
            return;
        }
        throw new o("Can't set fragment once it is already set.");
    }
    
    public final void y(final d r) {
        this.r = r;
    }
    
    public final void z(final e e) {
        if (!this.m()) {
            this.b(e);
        }
    }
    
    public interface a
    {
        void a();
        
        void b();
    }
    
    public static final class c
    {
        public final String a() {
            Object string = new JSONObject();
            while (true) {
                try {
                    ((JSONObject)string).put("init", System.currentTimeMillis());
                    string = ((JSONObject)string).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "e2e.toString()");
                    return (String)string;
                }
                catch (JSONException ex) {
                    continue;
                }
                break;
            }
        }
        
        public final int b() {
            return O1.d.p.e();
        }
    }
    
    public interface d
    {
        void a(final f p0);
    }
    
    public static final class e implements Parcelable
    {
        @NotNull
        public static final Parcelable$Creator<e> CREATOR;
        public static final b G;
        public boolean A;
        public boolean B;
        public final String C;
        public final String D;
        public final String E;
        public final a F;
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
        public final Y1.B z;
        
        static {
            G = new b(null);
            CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
                public e a(final Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "source");
                    return new e(parcel, null);
                }
                
                public e[] b(final int n) {
                    return new e[n];
                }
            };
        }
        
        public e(final Parcel parcel) {
            final Q a = Q.a;
            this.o = t.valueOf(Q.k(parcel.readString(), "loginBehavior"));
            final ArrayList<Object> c = new ArrayList<Object>();
            parcel.readStringList((List)c);
            this.p = new HashSet(c);
            final String string = parcel.readString();
            Y1.e q;
            if (string != null) {
                q = Y1.e.valueOf(string);
            }
            else {
                q = Y1.e.p;
            }
            this.q = q;
            this.r = Q.k(parcel.readString(), "applicationId");
            this.s = Q.k(parcel.readString(), "authId");
            final byte byte1 = parcel.readByte();
            final boolean b = true;
            this.t = (byte1 != 0);
            this.u = parcel.readString();
            this.v = Q.k(parcel.readString(), "authType");
            this.w = parcel.readString();
            this.x = parcel.readString();
            this.y = (parcel.readByte() != 0);
            final String string2 = parcel.readString();
            Y1.B z;
            if (string2 != null) {
                z = Y1.B.valueOf(string2);
            }
            else {
                z = Y1.B.q;
            }
            this.z = z;
            this.A = (parcel.readByte() != 0);
            this.B = (parcel.readByte() != 0 && b);
            this.C = Q.k(parcel.readString(), "nonce");
            this.D = parcel.readString();
            this.E = parcel.readString();
            final String string3 = parcel.readString();
            a value;
            if (string3 == null) {
                value = null;
            }
            else {
                value = Y1.a.valueOf(string3);
            }
            this.F = value;
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
        
        public final a e() {
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
        
        public final Y1.B k() {
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
            final Iterator<String> iterator = this.p.iterator();
            while (iterator.hasNext()) {
                if (Y1.z.a.c(iterator.next())) {
                    return true;
                }
            }
            return false;
        }
        
        public final boolean q() {
            return this.A;
        }
        
        public final boolean r() {
            return this.z == Y1.B.r;
        }
        
        public final boolean t() {
            return this.t;
        }
        
        public final void u(final Set p) {
            Intrinsics.checkNotNullParameter(p, "<set-?>");
            this.p = p;
        }
        
        public final boolean v() {
            return this.B;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.o.name());
            parcel.writeStringList((List)new ArrayList(this.p));
            parcel.writeString(this.q.name());
            parcel.writeString(this.r);
            parcel.writeString(this.s);
            parcel.writeByte((byte)(byte)(this.t ? 1 : 0));
            parcel.writeString(this.u);
            parcel.writeString(this.v);
            parcel.writeString(this.w);
            parcel.writeString(this.x);
            parcel.writeByte((byte)(byte)(this.y ? 1 : 0));
            parcel.writeString(this.z.name());
            parcel.writeByte((byte)(byte)(this.A ? 1 : 0));
            parcel.writeByte((byte)(byte)(this.B ? 1 : 0));
            parcel.writeString(this.C);
            parcel.writeString(this.D);
            parcel.writeString(this.E);
            final a f = this.F;
            String name;
            if (f == null) {
                name = null;
            }
            else {
                name = f.name();
            }
            parcel.writeString(name);
        }
        
        public static final class b
        {
        }
    }
    
    public static final class f implements Parcelable
    {
        @NotNull
        public static final Parcelable$Creator<f> CREATOR;
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
            CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
                public f a(final Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "source");
                    return new f(parcel, null);
                }
                
                public f[] b(final int n) {
                    return new f[n];
                }
            };
        }
        
        public f(final e e, final a a, final x1.a a2, final String s, final String s2) {
            Intrinsics.checkNotNullParameter(a, "code");
            this(e, a, a2, null, s, s2);
        }
        
        public f(final e t, final a o, final x1.a p6, final i q, final String r, final String s) {
            Intrinsics.checkNotNullParameter(o, "code");
            this.t = t;
            this.p = p6;
            this.q = q;
            this.r = r;
            this.o = o;
            this.s = s;
        }
        
        public f(final Parcel parcel) {
            String string;
            if ((string = parcel.readString()) == null) {
                string = "error";
            }
            this.o = a.valueOf(string);
            this.p = (x1.a)parcel.readParcelable(x1.a.class.getClassLoader());
            this.q = (i)parcel.readParcelable(i.class.getClassLoader());
            this.r = parcel.readString();
            this.s = parcel.readString();
            this.t = (e)parcel.readParcelable(e.class.getClassLoader());
            this.u = P.r0(parcel);
            this.v = P.r0(parcel);
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.o.name());
            parcel.writeParcelable((Parcelable)this.p, n);
            parcel.writeParcelable((Parcelable)this.q, n);
            parcel.writeString(this.r);
            parcel.writeString(this.s);
            parcel.writeParcelable((Parcelable)this.t, n);
            final P a = P.a;
            P.G0(parcel, this.u);
            P.G0(parcel, this.v);
        }
        
        public enum a
        {
            p("SUCCESS", 0, "success"), 
            q("CANCEL", 1, "cancel"), 
            r("ERROR", 2, "error");
            
            public final String o;
            
            static {
                s = c();
            }
            
            public a(final String name, final int ordinal, final String o) {
                this.o = o;
            }
            
            public static final /* synthetic */ a[] c() {
                return new a[] { a.p, a.q, a.r };
            }
            
            public final String e() {
                return this.o;
            }
        }
        
        public static final class c
        {
            public static /* synthetic */ f d(final c c, final e e, final String s, final String s2, String s3, final int n, final Object o) {
                if ((n & 0x8) != 0x0) {
                    s3 = null;
                }
                return c.c(e, s, s2, s3);
            }
            
            public final f a(final e e, final String s) {
                return new f(e, a.q, null, s, null);
            }
            
            public final f b(final e e, final x1.a a, final i i) {
                return new f(e, f.a.p, a, i, null, null);
            }
            
            public final f c(final e e, String join, final String e2, final String s) {
                final ArrayList<String> list = new ArrayList<String>();
                if (join != null) {
                    list.add(join);
                }
                if (e2 != null) {
                    list.add(e2);
                }
                join = TextUtils.join((CharSequence)": ", (Iterable)list);
                return new f(e, a.r, null, join, s);
            }
            
            public final f e(final e e, final x1.a a) {
                Intrinsics.checkNotNullParameter(a, "token");
                return new f(e, f.a.p, a, null, null);
            }
        }
    }
}
