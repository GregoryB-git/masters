// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import java.util.HashSet;
import java.util.HashMap;
import W5.C;
import V5.q;
import V5.m;
import org.json.JSONObject;
import kotlin.text.i;
import org.json.JSONArray;
import java.util.Set;
import x1.r;
import kotlin.jvm.internal.g;
import java.util.Map;

public final class j
{
    public static final a g;
    public static j h;
    public final Map a;
    public final Map b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;
    
    static {
        g = new a(null);
    }
    
    public j(final Map a, final Map b, final Map c, final String d, final String e, final String f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static final /* synthetic */ j a() {
        return j.h;
    }
    
    public static final /* synthetic */ void b(final j h) {
        j.h = h;
    }
    
    public final r.a c(final int n, final int i, final boolean b) {
        if (b) {
            return r.a.q;
        }
        final Map a = this.a;
        if (a != null && a.containsKey(n)) {
            final Set set = this.a.get(n);
            if (set == null || set.contains(i)) {
                return r.a.p;
            }
        }
        final Map c = this.c;
        if (c != null && c.containsKey(n)) {
            final Set set2 = this.c.get(n);
            if (set2 == null || set2.contains(i)) {
                return r.a.o;
            }
        }
        final Map b2 = this.b;
        if (b2 != null && b2.containsKey(n)) {
            final Set set3 = this.b.get(n);
            if (set3 == null || set3.contains(i)) {
                return r.a.q;
            }
        }
        return r.a.p;
    }
    
    public final String d(final r.a a) {
        int n;
        if (a == null) {
            n = -1;
        }
        else {
            n = j.b.a[a.ordinal()];
        }
        if (n == 1) {
            return this.d;
        }
        if (n == 2) {
            return this.f;
        }
        if (n != 3) {
            return null;
        }
        return this.e;
    }
    
    public static final class a
    {
        public final j a(final JSONArray jsonArray) {
            if (jsonArray == null) {
                return null;
            }
            final int length = jsonArray.length();
            Object d;
            Object d2;
            Map map;
            Object o3;
            Object o4;
            String s7;
            if (length > 0) {
                int n = 0;
                final String s;
                Object o = s = null;
                final String s3;
                final String s2 = s3 = s;
                String s5;
                String s4 = s5 = s3;
                String s6 = s3;
                d = s2;
                Object o2 = s;
                Object d3;
                String optString;
                String optString2;
                String optString3;
                while (true) {
                    final int n2 = n + 1;
                    final JSONObject optJSONObject = jsonArray.optJSONObject(n);
                    if (optJSONObject == null) {
                        d2 = o;
                        d3 = o2;
                        optString = s6;
                        optString2 = s5;
                        optString3 = s4;
                    }
                    else {
                        final String optString4 = optJSONObject.optString("name");
                        if (optString4 == null) {
                            d2 = o;
                            d3 = o2;
                            optString = s6;
                            optString2 = s5;
                            optString3 = s4;
                        }
                        else if (i.l(optString4, "other", true)) {
                            optString = optJSONObject.optString("recovery_message", (String)null);
                            d2 = this.d(optJSONObject);
                            d3 = o2;
                            optString2 = s5;
                            optString3 = s4;
                        }
                        else if (i.l(optString4, "transient", true)) {
                            optString2 = optJSONObject.optString("recovery_message", (String)null);
                            d3 = this.d(optJSONObject);
                            d2 = o;
                            optString = s6;
                            optString3 = s4;
                        }
                        else {
                            d2 = o;
                            d3 = o2;
                            optString = s6;
                            optString2 = s5;
                            optString3 = s4;
                            if (i.l(optString4, "login_recoverable", true)) {
                                optString3 = optJSONObject.optString("recovery_message", (String)null);
                                d = this.d(optJSONObject);
                                optString2 = s5;
                                optString = s6;
                                d3 = o2;
                                d2 = o;
                            }
                        }
                    }
                    if (n2 >= length) {
                        break;
                    }
                    n = n2;
                    o = d2;
                    o2 = d3;
                    s6 = optString;
                    s5 = optString2;
                    s4 = optString3;
                }
                map = (Map)d3;
                o3 = optString;
                o4 = optString2;
                s7 = optString3;
            }
            else {
                d2 = (map = null);
                final Map map3;
                final Map map2 = map3 = map;
                s7 = (String)(o4 = map3);
                o3 = map3;
                d = map2;
            }
            return new j((Map)d2, map, (Map)d, (String)o3, (String)o4, s7);
        }
        
        public final j b() {
            // monitorenter(this)
            while (true) {
                try {
                    if (j.a() == null) {
                        j.b(this.c());
                    }
                    final j a = j.a();
                    if (a != null) {
                        // monitorexit(this)
                        return a;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
                    // monitorexit(this)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        public final j c() {
            return new j(null, C.e(q.a(2, null), q.a(4, null), q.a(9, null), q.a(17, null), q.a(341, null)), C.e(q.a(102, null), q.a(190, null), q.a(412, null)), null, null, null);
        }
        
        public final Map d(JSONObject optJSONObject) {
            final JSONArray optJSONArray = optJSONObject.optJSONArray("items");
            if (optJSONArray == null) {
                return null;
            }
            if (optJSONArray.length() == 0) {
                return null;
            }
            final HashMap<Integer, Object> hashMap = new HashMap<Integer, Object>();
            final int length = optJSONArray.length();
            if (length > 0) {
                int n = 0;
                while (true) {
                    final int n2 = n + 1;
                    optJSONObject = optJSONArray.optJSONObject(n);
                    if (optJSONObject != null) {
                        final int optInt = optJSONObject.optInt("code");
                        if (optInt != 0) {
                            final JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                            Object o;
                            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                                final HashSet<Integer> set = new HashSet<Integer>();
                                final int length2 = optJSONArray2.length();
                                o = set;
                                if (length2 > 0) {
                                    int n3 = 0;
                                    while (true) {
                                        final int n4 = n3 + 1;
                                        final int optInt2 = optJSONArray2.optInt(n3);
                                        if (optInt2 != 0) {
                                            set.add(optInt2);
                                        }
                                        if (n4 >= length2) {
                                            break;
                                        }
                                        n3 = n4;
                                    }
                                    o = set;
                                }
                            }
                            else {
                                o = null;
                            }
                            hashMap.put(optInt, o);
                        }
                    }
                    if (n2 >= length) {
                        break;
                    }
                    n = n2;
                }
                return hashMap;
            }
            return hashMap;
        }
    }
}
