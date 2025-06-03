// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P4;

import java.util.concurrent.Callable;
import t3.a;
import org.json.JSONException;
import android.util.Log;
import C3.z;
import java.util.Map;
import com.google.firebase.remoteconfig.internal.b;
import V2.j;
import java.util.Iterator;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import s4.i;
import com.google.firebase.remoteconfig.internal.d;
import Q4.l;
import java.util.concurrent.Executor;
import t3.c;
import s3.e;
import android.content.Context;

public class m
{
    public static final byte[] m;
    public final Context a;
    public final e b;
    public final c c;
    public final Executor d;
    public final Q4.e e;
    public final Q4.e f;
    public final Q4.e g;
    public final com.google.firebase.remoteconfig.internal.c h;
    public final l i;
    public final d j;
    public final i k;
    public final Q4.m l;
    
    static {
        m = new byte[0];
    }
    
    public m(final Context a, final e b, final i k, final c c, final Executor d, final Q4.e e, final Q4.e f, final Q4.e g, final com.google.firebase.remoteconfig.internal.c h, final l i, final d j, final Q4.m l) {
        this.a = a;
        this.b = b;
        this.k = k;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.l = l;
    }
    
    public static List C(final JSONArray jsonArray) {
        final ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < jsonArray.length(); ++i) {
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            final JSONObject jsonObject = jsonArray.getJSONObject(i);
            final Iterator keys = jsonObject.keys();
            while (keys.hasNext()) {
                final String s = keys.next();
                hashMap.put(s, jsonObject.getString(s));
            }
            list.add(hashMap);
        }
        return list;
    }
    
    public static m o(final e e) {
        return ((x)e.k(x.class)).f();
    }
    
    public static boolean p(final b b, final b b2) {
        return b2 == null || !b.g().equals(b2.g());
    }
    
    public final j A(final Map map) {
        try {
            return this.g.k(com.google.firebase.remoteconfig.internal.b.j().b(map).a()).p(z.a(), new g());
        }
        catch (JSONException ex) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", (Throwable)ex);
            return V2.m.e(null);
        }
    }
    
    public void B() {
        this.f.e();
        this.g.e();
        this.e.e();
    }
    
    public void D(final JSONArray jsonArray) {
        if (this.c == null) {
            return;
        }
        Label_0040: {
            try {
                this.c.m(C(jsonArray));
                return;
            }
            catch (a a) {}
            catch (JSONException ex) {
                break Label_0040;
            }
            final a a;
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", (Throwable)a);
            return;
        }
        final JSONException ex;
        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", (Throwable)ex);
    }
    
    public j h() {
        final j e = this.e.e();
        final j e2 = this.f.e();
        return V2.m.i(e, e2).h(this.d, new f(this, e, e2));
    }
    
    public P4.d i(final P4.c c) {
        return this.l.b(c);
    }
    
    public j j() {
        final j e = this.f.e();
        final j e2 = this.g.e();
        final j e3 = this.e.e();
        final j c = V2.m.c(this.d, new P4.i(this));
        return V2.m.i(e, e2, e3, c, this.k.a(), this.k.b(false)).g(this.d, new P4.j(c));
    }
    
    public j k() {
        return this.h.i().p(z.a(), new k());
    }
    
    public j l() {
        return this.k().p(this.d, new P4.e(this));
    }
    
    public Map m() {
        return this.i.d();
    }
    
    public q n() {
        return this.j.c();
    }
    
    public final boolean w(final j j) {
        if (j.n()) {
            this.e.d();
            if (j.j() != null) {
                this.D(((b)j.j()).d());
            }
            else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            return true;
        }
        return false;
    }
    
    public j x(final s s) {
        return V2.m.c(this.d, new h(this, s));
    }
    
    public void y(final boolean b) {
        this.l.e(b);
    }
    
    public j z(final Map map) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        for (final Map.Entry<K, Object> entry : map.entrySet()) {
            final byte[] value = entry.getValue();
            final boolean b = value instanceof byte[];
            final String s = (String)entry.getKey();
            if (b) {
                hashMap.put(s, new String(value));
            }
            else {
                hashMap.put(s, value.toString());
            }
        }
        return this.A(hashMap);
    }
}
