// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J1;

import O1.r;
import O1.P;
import x1.B;
import O1.v;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

public final class a
{
    public static final a a;
    public static boolean b;
    public static final String c;
    public static final List d;
    public static final Set e;
    
    static {
        a = new a();
        c = a.class.getCanonicalName();
        d = new ArrayList();
        e = new CopyOnWriteArraySet();
    }
    
    public static final void a() {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            J1.a.b = true;
            J1.a.a.c();
        }
        finally {
            final Throwable t;
            T1.a.b(t, a.class);
        }
    }
    
    public static final String e(final String s) {
        if (T1.a.d(a.class)) {
            return null;
        }
        final Throwable t;
        Label_0041: {
            try {
                Intrinsics.checkNotNullParameter(s, "eventName");
                if (J1.a.b && J1.a.a.d(s)) {
                    return "_removed_";
                }
            }
            finally {
                break Label_0041;
            }
            return (String)t;
        }
        T1.a.b(t, a.class);
        return null;
    }
    
    public static final void f(final Map map, final String s) {
        if (T1.a.d(a.class)) {
            return;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(map, "parameters");
                Intrinsics.checkNotNullParameter(s, "eventName");
                if (!J1.a.b) {
                    return;
                }
                final HashMap<String, String> hashMap = (HashMap<String, String>)new HashMap<Object, Object>();
                for (final String s2 : new ArrayList<String>(map.keySet())) {
                    final String b = J1.a.a.b(s, s2);
                    if (b != null) {
                        hashMap.put(s2, b);
                        map.remove(s2);
                    }
                }
                if (!(hashMap.isEmpty() ^ true)) {
                    return;
                }
                try {
                    final JSONObject jsonObject = new JSONObject();
                    for (final Map.Entry<String, String> entry : hashMap.entrySet()) {
                        jsonObject.put((String)entry.getKey(), (Object)entry.getValue());
                    }
                    map.put("_restrictedParams", jsonObject.toString());
                    return;
                    final Throwable t;
                    T1.a.b(t, a.class);
                    return;
                }
                catch (JSONException ex) {
                    return;
                }
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public final String b(String s, final String s2) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            try {
                for (final a a : new ArrayList<a>(J1.a.d)) {
                    if (a == null) {
                        continue;
                    }
                    if (!Intrinsics.a(s, a.a())) {
                        continue;
                    }
                    for (final String s3 : a.b().keySet()) {
                        if (Intrinsics.a(s2, s3)) {
                            return (String)a.b().get(s3);
                        }
                    }
                }
                return null;
                final a a;
                final String s3;
                s = (String)a.b().get(s3);
                return s;
            }
            finally {}
        }
        catch (Exception ex) {
            Log.w(J1.a.c, "getMatchedRuleType failed", (Throwable)ex);
        }
        return null;
        final Throwable t;
        T1.a.b(t, this);
        return null;
    }
    
    public final void c() {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                final v a = v.a;
                final r q = v.q(B.m(), false);
                if (q == null) {
                    return;
                }
                final String i = q.i();
                if (i == null) {
                    return;
                }
                if (i.length() == 0) {
                    return;
                }
                final JSONObject jsonObject = new JSONObject(i);
                J1.a.d.clear();
                J1.a.e.clear();
                final Iterator keys = jsonObject.keys();
                while (keys.hasNext()) {
                    final String s = keys.next();
                    final JSONObject jsonObject2 = jsonObject.getJSONObject(s);
                    if (jsonObject2 != null) {
                        final JSONObject optJSONObject = jsonObject2.optJSONObject("restrictive_param");
                        Intrinsics.checkNotNullExpressionValue(s, "key");
                        final a a2 = new a(s, new HashMap());
                        if (optJSONObject != null) {
                            a2.c(P.o(optJSONObject));
                            J1.a.d.add(a2);
                        }
                        if (!jsonObject2.has("process_event_name")) {
                            continue;
                        }
                        J1.a.e.add(a2.a());
                    }
                }
                return;
                final Throwable t;
                T1.a.b(t, this);
                return;
            }
            catch (Exception ex) {
                return;
            }
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public final boolean d(final String s) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return J1.a.e.contains(s);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return false;
        }
    }
    
    public static final class a
    {
        public String a;
        public Map b;
        
        public a(final String a, final Map b) {
            Intrinsics.checkNotNullParameter(a, "eventName");
            Intrinsics.checkNotNullParameter(b, "restrictiveParams");
            this.a = a;
            this.b = b;
        }
        
        public final String a() {
            return this.a;
        }
        
        public final Map b() {
            return this.b;
        }
        
        public final void c(final Map b) {
            Intrinsics.checkNotNullParameter(b, "<set-?>");
            this.b = b;
        }
    }
}
