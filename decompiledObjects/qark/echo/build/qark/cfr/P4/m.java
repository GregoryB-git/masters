/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package P4;

import C3.z;
import P4.c;
import P4.d;
import P4.e;
import P4.f;
import P4.g;
import P4.h;
import P4.i;
import P4.j;
import P4.k;
import P4.l;
import P4.q;
import P4.s;
import P4.x;
import V2.b;
import android.content.Context;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t3.a;

public class m {
    public static final byte[] m = new byte[0];
    public final Context a;
    public final s3.e b;
    public final t3.c c;
    public final Executor d;
    public final Q4.e e;
    public final Q4.e f;
    public final Q4.e g;
    public final com.google.firebase.remoteconfig.internal.c h;
    public final Q4.l i;
    public final com.google.firebase.remoteconfig.internal.d j;
    public final s4.i k;
    public final Q4.m l;

    public m(Context context, s3.e e8, s4.i i8, t3.c c8, Executor executor, Q4.e e9, Q4.e e10, Q4.e e11, com.google.firebase.remoteconfig.internal.c c9, Q4.l l8, com.google.firebase.remoteconfig.internal.d d8, Q4.m m8) {
        this.a = context;
        this.b = e8;
        this.k = i8;
        this.c = c8;
        this.d = executor;
        this.e = e9;
        this.f = e10;
        this.g = e11;
        this.h = c9;
        this.i = l8;
        this.j = d8;
        this.l = m8;
    }

    public static List C(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); ++i8) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i8);
            Iterator iterator = jSONObject.keys();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                hashMap.put((Object)string2, (Object)jSONObject.getString(string2));
            }
            arrayList.add((Object)hashMap);
        }
        return arrayList;
    }

    public static /* synthetic */ Void a(m m8, s s8) {
        return m8.u(s8);
    }

    public static /* synthetic */ boolean b(m m8, V2.j j8) {
        return m8.w(j8);
    }

    public static /* synthetic */ V2.j c(com.google.firebase.remoteconfig.internal.b b8) {
        return m.v(b8);
    }

    public static /* synthetic */ q d(V2.j j8, V2.j j9) {
        return m.r(j8, j9);
    }

    public static /* synthetic */ V2.j e(c.a a8) {
        return m.s(a8);
    }

    public static /* synthetic */ V2.j f(m m8, Void void_) {
        return m8.t(void_);
    }

    public static /* synthetic */ V2.j g(m m8, V2.j j8, V2.j j9, V2.j j10) {
        return m8.q(j8, j9, j10);
    }

    public static m o(s3.e e8) {
        return ((x)e8.k(x.class)).f();
    }

    public static boolean p(com.google.firebase.remoteconfig.internal.b b8, com.google.firebase.remoteconfig.internal.b b9) {
        if (b9 != null && b8.g().equals((Object)b9.g())) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ q r(V2.j j8, V2.j j9) {
        return (q)j8.j();
    }

    public static /* synthetic */ V2.j s(c.a a8) {
        return V2.m.e(null);
    }

    public static /* synthetic */ V2.j v(com.google.firebase.remoteconfig.internal.b b8) {
        return V2.m.e(null);
    }

    public final V2.j A(Map object) {
        try {
            object = com.google.firebase.remoteconfig.internal.b.j().b((Map)object).a();
        }
        catch (JSONException jSONException) {
            Log.e((String)"FirebaseRemoteConfig", (String)"The provided defaults map could not be processed.", (Throwable)jSONException);
            return V2.m.e(null);
        }
        return this.g.k((com.google.firebase.remoteconfig.internal.b)object).p(z.a(), new g());
    }

    public void B() {
        this.f.e();
        this.g.e();
        this.e.e();
    }

    public void D(JSONArray jSONArray) {
        JSONException jSONException2;
        block4 : {
            if (this.c == null) {
                return;
            }
            try {
                jSONArray = m.C(jSONArray);
                this.c.m((List)jSONArray);
                return;
            }
            catch (a a8) {
            }
            catch (JSONException jSONException2) {
                break block4;
            }
            Log.w((String)"FirebaseRemoteConfig", (String)"Could not update ABT experiments.", (Throwable)a8);
            return;
        }
        Log.e((String)"FirebaseRemoteConfig", (String)"Could not parse ABT experiments from the JSON response.", (Throwable)jSONException2);
    }

    public V2.j h() {
        V2.j j8 = this.e.e();
        V2.j j9 = this.f.e();
        return V2.m.i(j8, j9).h(this.d, new f(this, j8, j9));
    }

    public d i(c c8) {
        return this.l.b(c8);
    }

    public V2.j j() {
        V2.j j8 = this.f.e();
        V2.j j9 = this.g.e();
        V2.j j10 = this.e.e();
        V2.j j11 = V2.m.c(this.d, new i(this));
        return V2.m.i(j8, j9, j10, j11, this.k.a(), this.k.b(false)).g(this.d, new j(j11));
    }

    public V2.j k() {
        return this.h.i().p(z.a(), new k());
    }

    public V2.j l() {
        return this.k().p(this.d, new e(this));
    }

    public Map m() {
        return this.i.d();
    }

    public q n() {
        return this.j.c();
    }

    public final /* synthetic */ V2.j q(V2.j object, V2.j j8, V2.j j9) {
        if (object.n() && object.j() != null) {
            object = (com.google.firebase.remoteconfig.internal.b)object.j();
            if (j8.n() && !m.p((com.google.firebase.remoteconfig.internal.b)object, (com.google.firebase.remoteconfig.internal.b)j8.j())) {
                return V2.m.e((Object)Boolean.FALSE);
            }
            return this.f.k((com.google.firebase.remoteconfig.internal.b)object).g(this.d, new l(this));
        }
        return V2.m.e((Object)Boolean.FALSE);
    }

    public final /* synthetic */ V2.j t(Void void_) {
        return this.h();
    }

    public final /* synthetic */ Void u(s s8) {
        this.j.l(s8);
        return null;
    }

    public final boolean w(V2.j j8) {
        if (j8.n()) {
            this.e.d();
            if (j8.j() != null) {
                this.D(((com.google.firebase.remoteconfig.internal.b)j8.j()).d());
            } else {
                Log.e((String)"FirebaseRemoteConfig", (String)"Activated configs written to disk are null.");
            }
            return true;
        }
        return false;
    }

    public V2.j x(s s8) {
        return V2.m.c(this.d, new h(this, s8));
    }

    public void y(boolean bl) {
        this.l.e(bl);
    }

    public V2.j z(Map map) {
        HashMap hashMap = new HashMap();
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Object object = (Map.Entry)map.next();
            Object object2 = object.getValue();
            boolean bl = object2 instanceof byte[];
            object = (String)object.getKey();
            if (bl) {
                hashMap.put(object, (Object)new String((byte[])object2));
                continue;
            }
            hashMap.put(object, (Object)object2.toString());
        }
        return this.A((Map)hashMap);
    }
}

