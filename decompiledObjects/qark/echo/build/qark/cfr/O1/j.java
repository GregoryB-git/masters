/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package O1;

import V5.q;
import W5.C;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.r;

public final class j {
    public static final a g = new a(null);
    public static j h;
    public final Map a;
    public final Map b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;

    public j(Map map, Map map2, Map map3, String string2, String string3, String string4) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = string2;
        this.e = string3;
        this.f = string4;
    }

    public static final /* synthetic */ void b(j j8) {
        h = j8;
    }

    public final r.a c(int n8, int n9, boolean bl) {
        if (bl) {
            return r.a.q;
        }
        Map map = this.a;
        if (map != null && map.containsKey((Object)n8) && ((map = (Set)this.a.get((Object)n8)) == null || map.contains((Object)n9))) {
            return r.a.p;
        }
        map = this.c;
        if (map != null && map.containsKey((Object)n8) && ((map = (Set)this.c.get((Object)n8)) == null || map.contains((Object)n9))) {
            return r.a.o;
        }
        map = this.b;
        if (map != null && map.containsKey((Object)n8) && ((map = (Set)this.b.get((Object)n8)) == null || map.contains((Object)n9))) {
            return r.a.q;
        }
        return r.a.p;
    }

    public final String d(r.a a8) {
        int n8 = a8 == null ? -1 : b.a[a8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return null;
                }
                return this.e;
            }
            return this.f;
        }
        return this.d;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final j a(JSONArray jSONArray) {
            Object object;
            JSONArray jSONArray2;
            JSONArray jSONArray3;
            Object object2;
            JSONArray jSONArray4;
            block13 : {
                JSONArray jSONArray5;
                JSONArray jSONArray6;
                JSONArray jSONArray7;
                if (jSONArray == null) {
                    return null;
                }
                int n8 = jSONArray.length();
                if (n8 > 0) {
                    Object object3;
                    Object object4;
                    int n9 = 0;
                    JSONArray jSONArray8 = null;
                    Object object5 = object3 = (object4 = jSONArray8);
                    jSONArray4 = jSONArray2 = object5;
                    object2 = jSONArray2;
                    Object object6 = object5;
                    jSONArray3 = object3;
                    Object object7 = object4;
                    do {
                        int n10 = n9 + 1;
                        JSONObject jSONObject = jSONArray.optJSONObject(n9);
                        if (jSONObject == null) {
                            jSONArray2 = jSONArray8;
                            object = object7;
                            object4 = object6;
                            object3 = object2;
                            object5 = jSONArray4;
                        } else {
                            String string2 = jSONObject.optString("name");
                            if (string2 == null) {
                                jSONArray2 = jSONArray8;
                                object = object7;
                                object4 = object6;
                                object3 = object2;
                                object5 = jSONArray4;
                            } else if (i.l(string2, "other", true)) {
                                object4 = jSONObject.optString("recovery_message", null);
                                jSONArray2 = this.d(jSONObject);
                                object = object7;
                                object3 = object2;
                                object5 = jSONArray4;
                            } else if (i.l(string2, "transient", true)) {
                                object3 = jSONObject.optString("recovery_message", null);
                                object = this.d(jSONObject);
                                jSONArray2 = jSONArray8;
                                object4 = object6;
                                object5 = jSONArray4;
                            } else {
                                jSONArray2 = jSONArray8;
                                object = object7;
                                object4 = object6;
                                object3 = object2;
                                object5 = jSONArray4;
                                if (i.l(string2, "login_recoverable", true)) {
                                    object5 = jSONObject.optString("recovery_message", null);
                                    jSONArray3 = this.d(jSONObject);
                                    object3 = object2;
                                    object4 = object6;
                                    object = object7;
                                    jSONArray2 = jSONArray8;
                                }
                            }
                        }
                        if (n10 >= n8) {
                            jSONArray = object;
                            object = object4;
                            object2 = object3;
                            jSONArray4 = object5;
                            break block13;
                        }
                        n9 = n10;
                        jSONArray8 = jSONArray2;
                        object7 = object;
                        object6 = object4;
                        object2 = object3;
                        jSONArray4 = object5;
                    } while (true);
                }
                jSONArray4 = jSONArray5 = (jSONArray6 = (jSONArray7 = (jSONArray = (jSONArray2 = null))));
                object2 = jSONArray5;
                object = jSONArray6;
                jSONArray3 = jSONArray7;
            }
            return new j((Map)jSONArray2, (Map)jSONArray, (Map)jSONArray3, (String)object, (String)object2, (String)jSONArray4);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final j b() {
            synchronized (this) {
                Throwable throwable2;
                block5 : {
                    j j8;
                    try {
                        if (h == null) {
                            j.b(this.c());
                        }
                        if ((j8 = h) == null) break block5;
                    }
                    catch (Throwable throwable2) {}
                    return j8;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
                throw throwable2;
            }
        }

        public final j c() {
            return new j(null, (Map)C.e(q.a(2, null), q.a(4, null), q.a(9, null), q.a(17, null), q.a(341, null)), (Map)C.e(q.a(102, null), q.a(190, null), q.a(412, null)), null, null, null);
        }

        public final Map d(JSONObject jSONObject) {
            JSONArray jSONArray = jSONObject.optJSONArray("items");
            if (jSONArray != null) {
                if (jSONArray.length() == 0) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                int n8 = jSONArray.length();
                if (n8 > 0) {
                    int n9 = 0;
                    do {
                        int n10;
                        int n11 = n9 + 1;
                        jSONObject = jSONArray.optJSONObject(n9);
                        if (jSONObject != null && (n10 = jSONObject.optInt("code")) != 0) {
                            JSONArray jSONArray2 = jSONObject.optJSONArray("subcodes");
                            if (jSONArray2 != null && jSONArray2.length() > 0) {
                                HashSet hashSet = new HashSet();
                                int n12 = jSONArray2.length();
                                jSONObject = hashSet;
                                if (n12 > 0) {
                                    n9 = 0;
                                    do {
                                        int n13 = n9 + 1;
                                        if ((n9 = jSONArray2.optInt(n9)) != 0) {
                                            hashSet.add((Object)n9);
                                        }
                                        if (n13 >= n12) {
                                            jSONObject = hashSet;
                                            break;
                                        }
                                        n9 = n13;
                                    } while (true);
                                }
                            } else {
                                jSONObject = null;
                            }
                            hashMap.put((Object)n10, (Object)jSONObject);
                        }
                        if (n11 >= n8) {
                            return hashMap;
                        }
                        n9 = n11;
                    } while (true);
                }
                return hashMap;
            }
            return null;
        }
    }

    public abstract class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] arrn = new int[r.a.values().length];
            arrn[r.a.p.ordinal()] = 1;
            arrn[r.a.o.ordinal()] = 2;
            arrn[r.a.q.ordinal()] = 3;
            a = arrn;
        }
    }

}

