// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E1;

import java.util.List;
import java.util.Collection;
import java.util.HashSet;
import x1.B;
import G1.i;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import java.util.HashMap;
import org.json.JSONObject;
import W5.C;
import kotlin.jvm.internal.Intrinsics;
import T1.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Map;
import java.util.Set;
import android.content.SharedPreferences;

public final class j
{
    public static final j a;
    public static SharedPreferences b;
    public static final Set c;
    public static final Map d;
    
    static {
        a = new j();
        c = new CopyOnWriteArraySet();
        d = new ConcurrentHashMap();
    }
    
    public static final boolean d() {
        if (T1.a.d(j.class)) {
            return false;
        }
        while (true) {
            try {
                j.a.g();
                final long n = System.currentTimeMillis() / 1000L;
                final SharedPreferences b = j.b;
                if (b == null) {
                    Intrinsics.n("sharedPreferences");
                    throw null;
                }
                final long long1 = b.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
                if (long1 != 0L && n - long1 < 86400) {
                    return false;
                }
                final SharedPreferences b2 = j.b;
                if (b2 != null) {
                    b2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", n).apply();
                    return true;
                }
                Intrinsics.n("sharedPreferences");
                throw null;
                final Throwable t;
                T1.a.b(t, j.class);
                return false;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final void e(final Map map, final Map map2) {
        if (T1.a.d(j.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(map, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(map2, "skuDetailsMap");
            final j a = j.a;
            a.g();
            a.f(a.c(a.a(map), map2));
        }
        finally {
            final Throwable t;
            T1.a.b(t, j.class);
        }
    }
    
    public final Map a(Map m) {
        if (T1.a.d(this)) {
            return null;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(m, "purchaseDetailsMap");
                final long lng = System.currentTimeMillis() / 1000L;
                Object o = C.m((Map)m).entrySet().iterator();
                while (true) {
                    Label_0182: {
                        if (!((Iterator)o).hasNext()) {
                            break Label_0182;
                        }
                        final Map.Entry<String, V> entry = ((Iterator<Map.Entry<String, V>>)o).next();
                        final String s = entry.getKey();
                        final JSONObject jsonObject = (JSONObject)entry.getValue();
                        try {
                            if (!jsonObject.has("purchaseToken")) {
                                continue;
                            }
                            final String string = jsonObject.getString("purchaseToken");
                            if (j.d.containsKey(string)) {
                                ((Map<?, ?>)m).remove(s);
                                continue;
                            }
                            final Set c = j.c;
                            final StringBuilder sb = new StringBuilder();
                            sb.append((Object)string);
                            sb.append(';');
                            sb.append(lng);
                            c.add(sb.toString());
                            continue;
                            T1.a.b(m, this);
                            return null;
                            Label_0223: {
                                Intrinsics.n("sharedPreferences");
                            }
                            throw null;
                            o = j.b;
                            // iftrue(Label_0223:, o == null)
                            ((SharedPreferences)o).edit().putStringSet("PURCHASE_DETAILS_SET", j.c).apply();
                            return new HashMap((Map)m);
                        }
                        catch (Exception ex) {}
                    }
                }
            }
            finally {}
            final Map<?, ?> map;
            m = (Throwable)map;
            continue;
        }
    }
    
    public final void b() {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                final long n = System.currentTimeMillis() / 1000L;
                final SharedPreferences b = j.b;
                if (b != null) {
                    final long long1 = b.getLong("LAST_CLEARED_TIME", 0L);
                    SharedPreferences$Editor sharedPreferences$Editor;
                    if (long1 == 0L) {
                        final SharedPreferences b2 = j.b;
                        if (b2 == null) {
                            Intrinsics.n("sharedPreferences");
                            throw null;
                        }
                        sharedPreferences$Editor = b2.edit().putLong("LAST_CLEARED_TIME", n);
                    }
                    else {
                        if (n - long1 <= 604800L) {
                            return;
                        }
                        for (final Map.Entry<String, V> entry : C.m(j.d).entrySet()) {
                            final String str = entry.getKey();
                            final long longValue = ((Number)entry.getValue()).longValue();
                            if (n - longValue > 86400L) {
                                final Set c = j.c;
                                final StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append(';');
                                sb.append(longValue);
                                c.remove(sb.toString());
                                j.d.remove(str);
                            }
                        }
                        final SharedPreferences b3 = j.b;
                        if (b3 == null) {
                            Intrinsics.n("sharedPreferences");
                            throw null;
                        }
                        sharedPreferences$Editor = b3.edit().putStringSet("PURCHASE_DETAILS_SET", j.c).putLong("LAST_CLEARED_TIME", n);
                    }
                    sharedPreferences$Editor.apply();
                    return;
                }
                Intrinsics.n("sharedPreferences");
                throw null;
                final Throwable t;
                T1.a.b(t, this);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final Map c(final Map p0, final Map p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     4: ifeq            9
        //     7: aconst_null    
        //     8: areturn        
        //     9: aload_1        
        //    10: ldc             "purchaseDetailsMap"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_2        
        //    16: ldc             "skuDetailsMap"
        //    18: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    21: invokestatic    java/lang/System.currentTimeMillis:()J
        //    24: ldc2_w          1000
        //    27: ldiv           
        //    28: lstore_3       
        //    29: new             Ljava/util/LinkedHashMap;
        //    32: dup            
        //    33: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    36: astore          6
        //    38: aload_1        
        //    39: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    44: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    49: astore_1       
        //    50: aload_1        
        //    51: invokeinterface java/util/Iterator.hasNext:()Z
        //    56: ifeq            201
        //    59: aload_1        
        //    60: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    65: checkcast       Ljava/util/Map$Entry;
        //    68: astore          8
        //    70: aload           8
        //    72: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    77: checkcast       Ljava/lang/String;
        //    80: astore          7
        //    82: aload           8
        //    84: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    89: checkcast       Lorg/json/JSONObject;
        //    92: astore          8
        //    94: aload_2        
        //    95: aload           7
        //    97: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   102: checkcast       Lorg/json/JSONObject;
        //   105: astore          7
        //   107: aload           8
        //   109: ifnull          50
        //   112: aload           8
        //   114: ldc             "purchaseTime"
        //   116: invokevirtual   org/json/JSONObject.has:(Ljava/lang/String;)Z
        //   119: istore          5
        //   121: iload           5
        //   123: ifeq            50
        //   126: lload_3        
        //   127: aload           8
        //   129: ldc             "purchaseTime"
        //   131: invokevirtual   org/json/JSONObject.getLong:(Ljava/lang/String;)J
        //   134: ldc2_w          1000
        //   137: ldiv           
        //   138: lsub           
        //   139: ldc2_w          86400
        //   142: lcmp           
        //   143: ifle            149
        //   146: goto            50
        //   149: aload           7
        //   151: ifnull          50
        //   154: aload           8
        //   156: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //   159: astore          8
        //   161: aload           8
        //   163: ldc             "purchaseDetail.toString()"
        //   165: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   168: aload           7
        //   170: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //   173: astore          7
        //   175: aload           7
        //   177: ldc             "skuDetail.toString()"
        //   179: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   182: aload           6
        //   184: aload           8
        //   186: aload           7
        //   188: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   193: pop            
        //   194: goto            50
        //   197: astore_1       
        //   198: goto            204
        //   201: aload           6
        //   203: areturn        
        //   204: aload_1        
        //   205: aload_0        
        //   206: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   209: aconst_null    
        //   210: areturn        
        //   211: astore          7
        //   213: goto            50
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  9      50     197    201    Any
        //  50     107    197    201    Any
        //  112    121    197    201    Any
        //  126    146    211    216    Ljava/lang/Exception;
        //  126    146    197    201    Any
        //  154    194    211    216    Ljava/lang/Exception;
        //  154    194    197    201    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0149:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    public final void f(final Map map) {
        if (T1.a.d(this)) {
            return;
        }
        Label_0081: {
            try {
                for (final Map.Entry<String, V> entry : map.entrySet()) {
                    final String s = entry.getKey();
                    final String s2 = (String)entry.getValue();
                    if (s != null && s2 != null) {
                        i.f(s, s2, false);
                    }
                }
            }
            finally {
                break Label_0081;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, this);
    }
    
    public final void g() {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                final SharedPreferences sharedPreferences = B.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
                final SharedPreferences sharedPreferences2 = B.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
                if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                    sharedPreferences.edit().clear().apply();
                    sharedPreferences2.edit().clear().apply();
                }
                final SharedPreferences sharedPreferences3 = B.l().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
                j.b = sharedPreferences3;
                final Set c = j.c;
                if (sharedPreferences3 != null) {
                    Set<String> stringSet;
                    if ((stringSet = (Set<String>)sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", (Set)new HashSet())) == null) {
                        stringSet = new HashSet<String>();
                    }
                    c.addAll(stringSet);
                    final Iterator<String> iterator = c.iterator();
                    while (iterator.hasNext()) {
                        final List v = kotlin.text.i.V(iterator.next(), new String[] { ";" }, false, 2, 2, null);
                        j.d.put(v.get(0), Long.parseLong(v.get(1)));
                    }
                    this.b();
                    return;
                }
                Intrinsics.n("sharedPreferences");
                throw null;
                final Throwable t;
                T1.a.b(t, this);
            }
            finally {
                continue;
            }
            break;
        }
    }
}
