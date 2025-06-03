// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A1;

import java.util.Arrays;
import kotlin.jvm.internal.g;
import java.util.Collection;
import java.util.Iterator;
import V5.a;
import x1.N;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.List;
import O1.P;
import kotlin.jvm.internal.Intrinsics;
import java.util.ArrayList;
import W5.C;
import V5.m;
import V5.q;
import java.util.Map;

public final class e
{
    public static final e a;
    public static final Map b;
    public static final Map c;
    public static final Map d;
    
    static {
        a = new e();
        final A1.b q = A1.b.q;
        final k p = k.p;
        final m a2 = V5.q.a(q, new c(p, l.p));
        final m a3 = V5.q.a(A1.b.r, new c(p, l.q));
        final m a4 = V5.q.a(A1.b.s, new c(p, l.r));
        final m a5 = V5.q.a(A1.b.t, new c(p, l.s));
        final m a6 = V5.q.a(A1.b.u, new c(p, l.t));
        final A1.b w = A1.b.w;
        final k q2 = k.q;
        b = C.f(a2, a3, a4, a5, a6, V5.q.a(w, new c(q2, l.v)), V5.q.a(A1.b.x, new c(q2, l.w)), V5.q.a(A1.b.y, new c(q2, l.x)), V5.q.a(A1.b.z, new c(q2, l.y)), V5.q.a(A1.b.A, new c(q2, l.z)), V5.q.a(A1.b.B, new c(q2, l.A)), V5.q.a(A1.b.C, new c(q2, l.B)), V5.q.a(A1.b.D, new c(q2, l.C)), V5.q.a(A1.b.E, new c(q2, l.D)), V5.q.a(A1.b.F, new c(q2, l.E)), V5.q.a(A1.b.G, new c(q2, l.F)), V5.q.a(A1.b.v, new c(p, null)));
        final m a7 = V5.q.a(A1.m.q, new b(null, i.q));
        final m a8 = V5.q.a(A1.m.r, new b(null, i.r));
        final A1.m s = A1.m.s;
        final k r = k.r;
        c = C.f(a7, a8, V5.q.a(s, new b(r, i.p)), V5.q.a(A1.m.t, new b(r, i.s)), V5.q.a(A1.m.u, new b(r, i.t)), V5.q.a(A1.m.v, new b(r, i.u)), V5.q.a(A1.m.G, new b(r, i.F)), V5.q.a(A1.m.w, new b(r, i.v)), V5.q.a(A1.m.x, new b(r, i.w)), V5.q.a(A1.m.y, new b(r, i.x)), V5.q.a(A1.m.z, new b(r, i.y)), V5.q.a(A1.m.A, new b(r, i.z)), V5.q.a(A1.m.B, new b(r, i.A)), V5.q.a(A1.m.C, new b(r, i.B)), V5.q.a(A1.m.D, new b(r, i.C)), V5.q.a(A1.m.E, new b(r, i.D)), V5.q.a(A1.m.F, new b(r, i.E)));
        d = C.f(V5.q.a("fb_mobile_achievement_unlocked", j.p), V5.q.a("fb_mobile_activate_app", j.q), V5.q.a("fb_mobile_add_payment_info", j.r), V5.q.a("fb_mobile_add_to_cart", j.s), V5.q.a("fb_mobile_add_to_wishlist", j.t), V5.q.a("fb_mobile_complete_registration", j.u), V5.q.a("fb_mobile_content_view", j.v), V5.q.a("fb_mobile_initiated_checkout", j.w), V5.q.a("fb_mobile_level_achieved", j.x), V5.q.a("fb_mobile_purchase", j.y), V5.q.a("fb_mobile_rate", j.z), V5.q.a("fb_mobile_search", j.A), V5.q.a("fb_mobile_spent_credits", j.B), V5.q.a("fb_mobile_tutorial_completion", j.C));
    }
    
    public static final ArrayList k(String o) {
        Intrinsics.checkNotNullParameter(o, "appEvents");
        Object iterator = new ArrayList<Map<?, ?>>();
        while (true) {
            Label_0532: {
                try {
                    final P a = P.a;
                    for (final Object o2 : P.m(new JSONArray((String)o))) {
                        final Object a2 = P.a;
                        ((ArrayList<Map<?, ?>>)iterator).add(P.n(new JSONObject((String)o2)));
                    }
                }
                catch (JSONException list) {
                    break Label_0532;
                }
            Label_0110_Outer:
                while (true) {
                    Label_0492: {
                        Label_0086: {
                            break Label_0086;
                            final Iterator<Object> iterator3;
                            while (iterator3.hasNext()) {
                                o = iterator3.next();
                                final A1.m a3 = A1.m.p.a((String)o);
                                final b b = e.c.get(a3);
                                if (a3 != null) {
                                    if (b == null) {
                                        continue Label_0110_Outer;
                                    }
                                    final k b2 = b.b();
                                    if (b2 == null) {
                                        break Label_0492;
                                    }
                                    if (b2 != k.r) {
                                        continue Label_0110_Outer;
                                    }
                                    final String e = b.a().e();
                                    final Object o2;
                                    final Object value = ((Map<K, Object>)o2).get(o);
                                    if (value == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    final Object l = l((String)o, value);
                                    if (l == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    final Object a2;
                                    ((Map<String, Object>)a2).put(e, l);
                                }
                            }
                            break Label_0492;
                        }
                        if (((ArrayList)iterator).isEmpty()) {
                            return null;
                        }
                        final ArrayList<LinkedHashMap<String, Object>> list = new ArrayList<LinkedHashMap<String, Object>>();
                        iterator = ((Iterable<Object>)iterator).iterator();
                    Label_0520_Outer:
                        while (true) {
                            if (((Iterator)iterator).hasNext()) {
                                final Object o2 = ((Iterator<Map<?, ?>>)iterator).next();
                                final Object a2 = new LinkedHashMap<String, Object>();
                                final LinkedHashMap<String, Object> e2 = new LinkedHashMap<String, Object>();
                                final Iterator<Object> iterator3 = (Iterator<Object>)((Map)o2).keySet().iterator();
                                continue Label_0110_Outer;
                            }
                            return list;
                            try {
                                final b b;
                                final String e3 = b.a().e();
                                final Object o2;
                                final A1.m a3;
                                if (a3 == A1.m.r && ((Map<K, Integer>)o2).get(o) != null) {
                                    final e a4 = e.a;
                                    final Integer value2 = ((Map<K, Integer>)o2).get(o);
                                    if (value2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    o = a4.j((String)value2);
                                }
                                else {
                                    if (a3 != A1.m.q || ((Map<K, Integer>)o2).get(o) == null) {
                                        continue Label_0110_Outer;
                                    }
                                    final Object value3 = ((Map<K, Object>)o2).get(o);
                                    if (value3 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    o = l((String)o, value3);
                                    if (o == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                }
                                final LinkedHashMap<String, Object> e2;
                                e2.put(e3, o);
                                continue Label_0110_Outer;
                                O1.C.e.c(N.s, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", o, list);
                                return null;
                                while (true) {
                                    list.add(e2);
                                    continue Label_0520_Outer;
                                    Block_22: {
                                        break Block_22;
                                        final ClassCastException ex;
                                        O1.C.e.c(N.s, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", V5.a.b(ex));
                                        continue Label_0110_Outer;
                                    }
                                    final Object a2;
                                    e2.put(k.r.e(), a2);
                                    continue;
                                }
                            }
                            // iftrue(Label_0520:, !a2.isEmpty() ^ true)
                            catch (ClassCastException ex2) {}
                            break;
                        }
                    }
                    break;
                }
            }
            final ClassCastException ex2;
            final ClassCastException ex = ex2;
            continue;
        }
    }
    
    public static final Object l(final String p0, final Object p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_3       
        //     2: aload_0        
        //     3: ldc_w           "field"
        //     6: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     9: aload_1        
        //    10: ldc_w           "value"
        //    13: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    16: getstatic       A1/e$d.o:LA1/e$d$a;
        //    19: aload_0        
        //    20: invokevirtual   A1/e$d$a.a:(Ljava/lang/String;)LA1/e$d;
        //    23: astore          6
        //    25: aload_1        
        //    26: instanceof      Ljava/lang/String;
        //    29: istore          4
        //    31: aconst_null    
        //    32: astore          5
        //    34: iload           4
        //    36: ifeq            47
        //    39: aload_1        
        //    40: checkcast       Ljava/lang/String;
        //    43: astore_0       
        //    44: goto            49
        //    47: aconst_null    
        //    48: astore_0       
        //    49: aload           6
        //    51: ifnull          280
        //    54: aload_0        
        //    55: ifnonnull       60
        //    58: aload_1        
        //    59: areturn        
        //    60: getstatic       A1/e$e.a:[I
        //    63: aload           6
        //    65: invokevirtual   java/lang/Enum.ordinal:()I
        //    68: iaload         
        //    69: istore_2       
        //    70: iload_2        
        //    71: iconst_1       
        //    72: if_icmpeq       129
        //    75: iload_2        
        //    76: iconst_2       
        //    77: if_icmpeq       101
        //    80: iload_2        
        //    81: iconst_3       
        //    82: if_icmpne       93
        //    85: aload_1        
        //    86: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    89: invokestatic    kotlin/text/i.f:(Ljava/lang/String;)Ljava/lang/Integer;
        //    92: areturn        
        //    93: new             LV5/l;
        //    96: dup            
        //    97: invokespecial   V5/l.<init>:()V
        //   100: athrow         
        //   101: aload_0        
        //   102: invokestatic    kotlin/text/i.f:(Ljava/lang/String;)Ljava/lang/Integer;
        //   105: astore_1       
        //   106: aload           5
        //   108: astore_0       
        //   109: aload_1        
        //   110: ifnull          127
        //   113: aload_1        
        //   114: invokevirtual   java/lang/Integer.intValue:()I
        //   117: ifeq            122
        //   120: iconst_1       
        //   121: istore_3       
        //   122: iload_3        
        //   123: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   126: astore_0       
        //   127: aload_0        
        //   128: areturn        
        //   129: getstatic       O1/P.a:LO1/P;
        //   132: astore          5
        //   134: new             Lorg/json/JSONArray;
        //   137: dup            
        //   138: aload_0        
        //   139: invokespecial   org/json/JSONArray.<init>:(Ljava/lang/String;)V
        //   142: invokestatic    O1/P.m:(Lorg/json/JSONArray;)Ljava/util/List;
        //   145: astore_0       
        //   146: new             Ljava/util/ArrayList;
        //   149: dup            
        //   150: invokespecial   java/util/ArrayList.<init>:()V
        //   153: astore          6
        //   155: aload_0        
        //   156: checkcast       Ljava/lang/Iterable;
        //   159: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   164: astore          7
        //   166: aload           7
        //   168: invokeinterface java/util/Iterator.hasNext:()Z
        //   173: ifeq            246
        //   176: aload           7
        //   178: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   183: checkcast       Ljava/lang/String;
        //   186: astore_0       
        //   187: getstatic       O1/P.a:LO1/P;
        //   190: astore          5
        //   192: new             Lorg/json/JSONObject;
        //   195: dup            
        //   196: aload_0        
        //   197: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   200: invokestatic    O1/P.n:(Lorg/json/JSONObject;)Ljava/util/Map;
        //   203: astore          5
        //   205: aload           5
        //   207: astore_0       
        //   208: goto            232
        //   211: getstatic       O1/P.a:LO1/P;
        //   214: astore          5
        //   216: new             Lorg/json/JSONArray;
        //   219: dup            
        //   220: aload_0        
        //   221: invokespecial   org/json/JSONArray.<init>:(Ljava/lang/String;)V
        //   224: invokestatic    O1/P.m:(Lorg/json/JSONArray;)Ljava/util/List;
        //   227: astore          5
        //   229: aload           5
        //   231: astore_0       
        //   232: aload           6
        //   234: aload_0        
        //   235: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   238: pop            
        //   239: goto            166
        //   242: astore_0       
        //   243: goto            249
        //   246: aload           6
        //   248: areturn        
        //   249: getstatic       O1/C.e:LO1/C$a;
        //   252: getstatic       x1/N.s:Lx1/N;
        //   255: ldc_w           "AppEventsConversionsAPITransformer"
        //   258: ldc_w           "\n transformEvents JSONException: \n%s\n%s"
        //   261: iconst_2       
        //   262: anewarray       Ljava/lang/Object;
        //   265: dup            
        //   266: iconst_0       
        //   267: aload_1        
        //   268: aastore        
        //   269: dup            
        //   270: iconst_1       
        //   271: aload_0        
        //   272: aastore        
        //   273: invokevirtual   O1/C$a.c:(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   276: getstatic       V5/t.a:LV5/t;
        //   279: areturn        
        //   280: aload_1        
        //   281: areturn        
        //   282: astore          5
        //   284: goto            211
        //   287: astore          5
        //   289: goto            232
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  129    166    242    246    Lorg/json/JSONException;
        //  166    187    242    246    Lorg/json/JSONException;
        //  187    205    282    292    Lorg/json/JSONException;
        //  211    229    287    292    Lorg/json/JSONException;
        //  232    239    242    246    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 146 out of bounds for length 146
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final List a(final A1.a a, Map d, final Map map, final Map map2, final List list, final Object o) {
        Intrinsics.checkNotNullParameter(a, "eventType");
        Intrinsics.checkNotNullParameter(d, "userData");
        Intrinsics.checkNotNullParameter(map, "appData");
        Intrinsics.checkNotNullParameter(map2, "restOfData");
        Intrinsics.checkNotNullParameter(list, "customEvents");
        d = this.d(d, map, map2);
        final int n = e.c[a.ordinal()];
        if (n == 1) {
            return this.c(d, o);
        }
        if (n != 2) {
            return null;
        }
        return this.b(d, list);
    }
    
    public final List b(final Map map, final List list) {
        if (list.isEmpty()) {
            return null;
        }
        final ArrayList<LinkedHashMap> list2 = new ArrayList<LinkedHashMap>();
        for (final Map map2 : (List<Map>)list) {
            final LinkedHashMap e = new LinkedHashMap();
            e.putAll(map);
            e.putAll(map2);
            list2.add(e);
        }
        return list2;
    }
    
    public final List c(final Map map, final Object o) {
        if (o == null) {
            return null;
        }
        final LinkedHashMap<String, String> linkedHashMap = (LinkedHashMap<String, String>)new LinkedHashMap<String, Object>();
        linkedHashMap.putAll((Map<?, ?>)map);
        linkedHashMap.put(i.r.e(), n.s.e());
        linkedHashMap.put(i.q.e(), (String)o);
        return W5.m.b(linkedHashMap);
    }
    
    public final Map d(final Map map, final Map map2, final Map map3) {
        Intrinsics.checkNotNullParameter(map, "userData");
        Intrinsics.checkNotNullParameter(map2, "appData");
        Intrinsics.checkNotNullParameter(map3, "restOfData");
        final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put(n.q.e(), n.r.e());
        linkedHashMap.put(k.p.e(), (String)map);
        linkedHashMap.put(k.q.e(), (String)map2);
        linkedHashMap.putAll((Map<?, ?>)map3);
        return linkedHashMap;
    }
    
    public final List e(final Map map) {
        Intrinsics.checkNotNullParameter(map, "parameters");
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        final ArrayList list = new ArrayList();
        final LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        final A1.a f = this.f(map, linkedHashMap, linkedHashMap2, list, linkedHashMap3);
        if (f == A1.a.r) {
            return null;
        }
        return this.a(f, linkedHashMap, linkedHashMap2, linkedHashMap3, list, map.get(n.t.e()));
    }
    
    public final A1.a f(final Map map, final Map map2, final Map map3, final ArrayList list, final Map map4) {
        final String value = map.get(n.p.e());
        final A1.a.a o = A1.a.o;
        if (value == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        final A1.a a = o.a(value);
        if (a == A1.a.r) {
            return a;
        }
        for (final Map.Entry<K, String> entry : map.entrySet()) {
            final String s = (String)entry.getKey();
            final String value2 = entry.getValue();
            final A1.b a2 = A1.b.p.a(s);
            if (a2 != null) {
                e.a.g(map2, map3, a2, value2);
            }
            else {
                final boolean a3 = Intrinsics.a(s, k.s.e());
                final boolean b = value2 instanceof String;
                if (a == A1.a.q && a3 && b) {
                    final ArrayList k = k(value2);
                    if (k == null) {
                        continue;
                    }
                    list.addAll(k);
                }
                else {
                    if (A1.e.a.p.a(s) == null) {
                        continue;
                    }
                    map4.put(s, value2);
                }
            }
        }
        return a;
    }
    
    public final void g(final Map map, final Map map2, final A1.b b, final Object o) {
        Intrinsics.checkNotNullParameter(map, "userData");
        Intrinsics.checkNotNullParameter(map2, "appData");
        Intrinsics.checkNotNullParameter(b, "field");
        Intrinsics.checkNotNullParameter(o, "value");
        final c c = e.b.get(b);
        if (c == null) {
            return;
        }
        final int n = e.b[c.b().ordinal()];
        if (n == 1) {
            this.h(map2, b, o);
            return;
        }
        if (n != 2) {
            return;
        }
        this.i(map, b, o);
    }
    
    public final void h(final Map map, final A1.b b, final Object o) {
        final c c = e.b.get(b);
        l a;
        if (c == null) {
            a = null;
        }
        else {
            a = c.a();
        }
        if (a == null) {
            return;
        }
        map.put(a.e(), o);
    }
    
    public final void i(final Map map, final A1.b b, final Object o) {
        if (b == b.v) {
            try {
                final P a = P.a;
                map.putAll(P.n(new JSONObject((String)o)));
                return;
            }
            catch (JSONException ex) {
                O1.C.e.c(N.s, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", o, ex);
                return;
            }
        }
        final c c = e.b.get(b);
        l a2;
        if (c == null) {
            a2 = null;
        }
        else {
            a2 = c.a();
        }
        if (a2 == null) {
            return;
        }
        map.put(a2.e(), o);
    }
    
    public final String j(final String s) {
        final Map d = e.d;
        String e = s;
        if (d.containsKey(s)) {
            final j j = d.get(s);
            if (j == null) {
                return "";
            }
            e = j.e();
        }
        return e;
    }
    
    public enum a
    {
        public static final a p;
        
        q("OPTIONS", 0, "data_processing_options"), 
        r("COUNTRY", 1, "data_processing_options_country"), 
        s("STATE", 2, "data_processing_options_state");
        
        public final String o;
        
        static {
            t = c();
            p = new a(null);
        }
        
        public a(final String name, final int ordinal, final String o) {
            this.o = o;
        }
        
        public static final /* synthetic */ a[] c() {
            return new a[] { a.q, a.r, a.s };
        }
        
        public final String e() {
            return this.o;
        }
        
        public static final class a
        {
            public final A1.e.a a(final String s) {
                Intrinsics.checkNotNullParameter(s, "rawValue");
                final A1.e.a[] values = A1.e.a.values();
                for (int length = values.length, i = 0; i < length; ++i) {
                    final A1.e.a a = values[i];
                    if (Intrinsics.a(a.e(), s)) {
                        return a;
                    }
                }
                return null;
            }
        }
    }
    
    public static final class b
    {
        public k a;
        public i b;
        
        public b(final k a, final i b) {
            Intrinsics.checkNotNullParameter(b, "field");
            this.a = a;
            this.b = b;
        }
        
        public final i a() {
            return this.b;
        }
        
        public final k b() {
            return this.a;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return this.a == b.a && this.b == b.b;
        }
        
        @Override
        public int hashCode() {
            final k a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode * 31 + this.b.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("SectionCustomEventFieldMapping(section=");
            sb.append(this.a);
            sb.append(", field=");
            sb.append(this.b);
            sb.append(')');
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public k a;
        public l b;
        
        public c(final k a, final l b) {
            Intrinsics.checkNotNullParameter(a, "section");
            this.a = a;
            this.b = b;
        }
        
        public final l a() {
            return this.b;
        }
        
        public final k b() {
            return this.a;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return this.a == c.a && this.b == c.b;
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.a.hashCode();
            final l b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            return hashCode * 31 + hashCode2;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("SectionFieldMapping(section=");
            sb.append(this.a);
            sb.append(", field=");
            sb.append(this.b);
            sb.append(')');
            return sb.toString();
        }
    }
    
    public enum d
    {
        public static final a o;
        
        p("ARRAY", 0), 
        q("BOOL", 1), 
        r("INT", 2);
        
        static {
            s = c();
            o = new a(null);
        }
        
        public d(final String name, final int ordinal) {
        }
        
        public static final /* synthetic */ d[] c() {
            return new d[] { d.p, d.q, d.r };
        }
        
        public static final class a
        {
            public final d a(final String s) {
                Intrinsics.checkNotNullParameter(s, "rawValue");
                if (!Intrinsics.a(s, A1.b.A.e())) {
                    if (!Intrinsics.a(s, A1.b.G.e())) {
                        if (!Intrinsics.a(s, A1.m.t.e())) {
                            if (!Intrinsics.a(s, A1.m.u.e())) {
                                if (!Intrinsics.a(s, A1.e.a.q.e())) {
                                    if (Intrinsics.a(s, A1.b.w.e()) || Intrinsics.a(s, A1.b.x.e())) {
                                        return d.q;
                                    }
                                    if (Intrinsics.a(s, A1.m.q.e())) {
                                        return d.r;
                                    }
                                    return null;
                                }
                            }
                        }
                    }
                }
                return d.p;
            }
        }
    }
}
