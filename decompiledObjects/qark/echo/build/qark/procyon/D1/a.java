// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D1;

import y1.e;
import java.util.Iterator;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import java.util.Map;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

public final class a
{
    public static final a a;
    public static boolean b;
    public static final List c;
    public static final Set d;
    
    static {
        a = new a();
        c = new ArrayList();
        d = new HashSet();
    }
    
    public static final void a() {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            D1.a.b = true;
            D1.a.a.b();
        }
        finally {
            final Throwable t;
            T1.a.b(t, a.class);
        }
    }
    
    public static final void c(final Map map, final String s) {
        if (T1.a.d(a.class)) {
            return;
        }
        Label_0158: {
            try {
                Intrinsics.checkNotNullParameter(map, "parameters");
                Intrinsics.checkNotNullParameter(s, "eventName");
                if (!D1.a.b) {
                    return;
                }
                final ArrayList<String> list = (ArrayList<String>)new ArrayList<Object>(map.keySet());
                for (final a a : new ArrayList<a>(D1.a.c)) {
                    if (!Intrinsics.a(a.b(), s)) {
                        continue;
                    }
                    for (final String s2 : list) {
                        if (a.a().contains(s2)) {
                            map.remove(s2);
                        }
                    }
                }
            }
            finally {
                break Label_0158;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, a.class);
    }
    
    public static final void d(final List list) {
        if (T1.a.d(a.class)) {
            return;
        }
        Label_0077: {
            try {
                Intrinsics.checkNotNullParameter(list, "events");
                if (!D1.a.b) {
                    return;
                }
                final Iterator<e> iterator = list.iterator();
                while (iterator.hasNext()) {
                    if (D1.a.d.contains(iterator.next().f())) {
                        iterator.remove();
                    }
                }
            }
            finally {
                break Label_0077;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, a.class);
    }
    
    public final void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     6: istore_1       
        //     7: iload_1        
        //     8: ifeq            14
        //    11: aload_0        
        //    12: monitorexit    
        //    13: return         
        //    14: getstatic       O1/v.a:LO1/v;
        //    17: astore_2       
        //    18: invokestatic    x1/B.m:()Ljava/lang/String;
        //    21: iconst_0       
        //    22: invokestatic    O1/v.q:(Ljava/lang/String;Z)LO1/r;
        //    25: astore_2       
        //    26: aload_2        
        //    27: ifnonnull       33
        //    30: aload_0        
        //    31: monitorexit    
        //    32: return         
        //    33: aload_2        
        //    34: invokevirtual   O1/r.i:()Ljava/lang/String;
        //    37: astore_2       
        //    38: aload_2        
        //    39: ifnull          216
        //    42: aload_2        
        //    43: invokeinterface java/lang/CharSequence.length:()I
        //    48: ifle            216
        //    51: new             Lorg/json/JSONObject;
        //    54: dup            
        //    55: aload_2        
        //    56: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //    59: astore_2       
        //    60: getstatic       D1/a.c:Ljava/util/List;
        //    63: invokeinterface java/util/List.clear:()V
        //    68: aload_2        
        //    69: invokevirtual   org/json/JSONObject.keys:()Ljava/util/Iterator;
        //    72: astore_3       
        //    73: aload_3        
        //    74: invokeinterface java/util/Iterator.hasNext:()Z
        //    79: ifeq            216
        //    82: aload_3        
        //    83: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    88: checkcast       Ljava/lang/String;
        //    91: astore          4
        //    93: aload_2        
        //    94: aload           4
        //    96: invokevirtual   org/json/JSONObject.getJSONObject:(Ljava/lang/String;)Lorg/json/JSONObject;
        //    99: astore          5
        //   101: aload           5
        //   103: ifnull          73
        //   106: aload           5
        //   108: ldc             "is_deprecated_event"
        //   110: invokevirtual   org/json/JSONObject.optBoolean:(Ljava/lang/String;)Z
        //   113: ifeq            141
        //   116: getstatic       D1/a.d:Ljava/util/Set;
        //   119: astore          5
        //   121: aload           4
        //   123: ldc             "key"
        //   125: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   128: aload           5
        //   130: aload           4
        //   132: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   137: pop            
        //   138: goto            73
        //   141: aload           5
        //   143: ldc             "deprecated_param"
        //   145: invokevirtual   org/json/JSONObject.optJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
        //   148: astore          5
        //   150: aload           4
        //   152: ldc             "key"
        //   154: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   157: new             LD1/a$a;
        //   160: dup            
        //   161: aload           4
        //   163: new             Ljava/util/ArrayList;
        //   166: dup            
        //   167: invokespecial   java/util/ArrayList.<init>:()V
        //   170: invokespecial   D1/a$a.<init>:(Ljava/lang/String;Ljava/util/List;)V
        //   173: astore          4
        //   175: aload           5
        //   177: ifnull          190
        //   180: aload           4
        //   182: aload           5
        //   184: invokestatic    O1/P.m:(Lorg/json/JSONArray;)Ljava/util/List;
        //   187: invokevirtual   D1/a$a.c:(Ljava/util/List;)V
        //   190: getstatic       D1/a.c:Ljava/util/List;
        //   193: aload           4
        //   195: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   200: pop            
        //   201: goto            73
        //   204: aload_2        
        //   205: aload_0        
        //   206: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   209: aload_0        
        //   210: monitorexit    
        //   211: return         
        //   212: astore_2       
        //   213: goto            219
        //   216: aload_0        
        //   217: monitorexit    
        //   218: return         
        //   219: aload_0        
        //   220: monitorexit    
        //   221: aload_2        
        //   222: athrow         
        //   223: astore_2       
        //   224: goto            216
        //   227: astore_2       
        //   228: goto            204
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      7      212    216    Any
        //  14     26     223    227    Ljava/lang/Exception;
        //  14     26     227    212    Any
        //  33     38     223    227    Ljava/lang/Exception;
        //  33     38     227    212    Any
        //  42     73     223    227    Ljava/lang/Exception;
        //  42     73     227    212    Any
        //  73     101    223    227    Ljava/lang/Exception;
        //  73     101    227    212    Any
        //  106    138    223    227    Ljava/lang/Exception;
        //  106    138    227    212    Any
        //  141    175    223    227    Ljava/lang/Exception;
        //  141    175    227    212    Any
        //  180    190    223    227    Ljava/lang/Exception;
        //  180    190    227    212    Any
        //  190    201    223    227    Ljava/lang/Exception;
        //  190    201    227    212    Any
        //  204    209    212    216    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0014:
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
    
    public static final class a
    {
        public String a;
        public List b;
        
        public a(final String a, final List b) {
            Intrinsics.checkNotNullParameter(a, "eventName");
            Intrinsics.checkNotNullParameter(b, "deprecateParams");
            this.a = a;
            this.b = b;
        }
        
        public final List a() {
            return this.b;
        }
        
        public final String b() {
            return this.a;
        }
        
        public final void c(final List b) {
            Intrinsics.checkNotNullParameter(b, "<set-?>");
            this.b = b;
        }
    }
}
