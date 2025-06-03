// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import android.os.BaseBundle;
import x1.B;
import android.util.Patterns;
import kotlin.text.Regex;
import java.util.Iterator;
import java.util.Set;
import z1.d;
import O1.P;
import java.util.Map;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import android.util.Log;
import T1.a;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.SharedPreferences;

public final class L
{
    public static final L a;
    public static final String b;
    public static SharedPreferences c;
    public static final AtomicBoolean d;
    public static final ConcurrentHashMap e;
    public static final ConcurrentHashMap f;
    
    static {
        a = new L();
        b = L.class.getSimpleName();
        d = new AtomicBoolean(false);
        e = new ConcurrentHashMap();
        f = new ConcurrentHashMap();
    }
    
    public static final void d() {
        if (T1.a.d(L.class)) {
            return;
        }
        try {
            F.b.b().execute(new J());
        }
        finally {
            final Throwable t;
            T1.a.b(t, L.class);
        }
    }
    
    public static final void e() {
        if (T1.a.d(L.class)) {
            return;
        }
        while (true) {
            try {
                if (!L.d.get()) {
                    Log.w(L.b, "initStore should have been called before calling setUserData");
                    L.a.h();
                }
                L.e.clear();
                final SharedPreferences c = L.c;
                if (c != null) {
                    c.edit().putString("com.facebook.appevents.UserDataStore.userData", (String)null).apply();
                    return;
                }
                Intrinsics.n("sharedPreferences");
                throw null;
                final Throwable t;
                T1.a.b(t, L.class);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final String f() {
        if (T1.a.d(L.class)) {
            return null;
        }
        while (true) {
            try {
                if (!L.d.get()) {
                    L.a.h();
                }
                final HashMap hashMap = new HashMap();
                hashMap.putAll(L.e);
                hashMap.putAll(L.a.g());
                return P.l0(hashMap);
                final Throwable t;
                T1.a.b(t, L.class);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final void i() {
        if (T1.a.d(L.class)) {
            return;
        }
        try {
            if (L.d.get()) {
                return;
            }
            L.a.h();
        }
        finally {
            final Throwable t;
            T1.a.b(t, L.class);
        }
    }
    
    public static final void l(final Map p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     5: ifeq            9
        //     8: return         
        //     9: aload_0        
        //    10: ldc             "ud"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: getstatic       y1/L.d:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    18: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //    21: ifne            33
        //    24: getstatic       y1/L.a:Ly1/L;
        //    27: invokevirtual   y1/L.h:()V
        //    30: goto            33
        //    33: aload_0        
        //    34: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    39: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    44: astore          7
        //    46: aload           7
        //    48: invokeinterface java/util/Iterator.hasNext:()Z
        //    53: ifeq            431
        //    56: aload           7
        //    58: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    63: checkcast       Ljava/util/Map$Entry;
        //    66: astore_0       
        //    67: aload_0        
        //    68: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    73: checkcast       Ljava/lang/String;
        //    76: astore          8
        //    78: aload_0        
        //    79: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    84: checkcast       Ljava/lang/String;
        //    87: astore_0       
        //    88: getstatic       O1/P.a:LO1/P;
        //    91: astore          6
        //    93: getstatic       y1/L.a:Ly1/L;
        //    96: astore          6
        //    98: aload_0        
        //    99: invokeinterface java/lang/CharSequence.length:()I
        //   104: istore_1       
        //   105: iconst_1       
        //   106: istore          5
        //   108: iload_1        
        //   109: iconst_1       
        //   110: isub           
        //   111: istore_1       
        //   112: iconst_0       
        //   113: istore_2       
        //   114: iload_2        
        //   115: istore_3       
        //   116: goto            465
        //   119: aload_0        
        //   120: iload           4
        //   122: invokeinterface java/lang/CharSequence.charAt:(I)C
        //   127: bipush          32
        //   129: invokestatic    kotlin/jvm/internal/Intrinsics.d:(II)I
        //   132: ifgt            486
        //   135: iconst_1       
        //   136: istore          4
        //   138: goto            489
        //   141: aload           6
        //   143: aload           8
        //   145: aload_0        
        //   146: iload_2        
        //   147: iload_1        
        //   148: iconst_1       
        //   149: iadd           
        //   150: invokeinterface java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
        //   155: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   158: invokevirtual   y1/L.k:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   161: invokestatic    O1/P.F0:(Ljava/lang/String;)Ljava/lang/String;
        //   164: astore          9
        //   166: getstatic       y1/L.f:Ljava/util/concurrent/ConcurrentHashMap;
        //   169: astore_0       
        //   170: aload_0        
        //   171: aload           8
        //   173: invokevirtual   java/util/concurrent/ConcurrentHashMap.containsKey:(Ljava/lang/Object;)Z
        //   176: ifeq            417
        //   179: aload_0        
        //   180: aload           8
        //   182: invokevirtual   java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   185: checkcast       Ljava/lang/String;
        //   188: astore          10
        //   190: aconst_null    
        //   191: astore_0       
        //   192: aload           10
        //   194: ifnonnull       200
        //   197: goto            249
        //   200: new             Lkotlin/text/Regex;
        //   203: dup            
        //   204: ldc             ","
        //   206: invokespecial   kotlin/text/Regex.<init>:(Ljava/lang/String;)V
        //   209: aload           10
        //   211: iconst_0       
        //   212: invokevirtual   kotlin/text/Regex.c:(Ljava/lang/CharSequence;I)Ljava/util/List;
        //   215: astore          6
        //   217: aload           6
        //   219: ifnonnull       225
        //   222: goto            249
        //   225: aload           6
        //   227: checkcast       Ljava/util/Collection;
        //   230: iconst_0       
        //   231: anewarray       Ljava/lang/String;
        //   234: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   239: astore_0       
        //   240: aload_0        
        //   241: ifnull          406
        //   244: aload_0        
        //   245: checkcast       [Ljava/lang/String;
        //   248: astore_0       
        //   249: aload_0        
        //   250: astore          6
        //   252: aload_0        
        //   253: ifnonnull       262
        //   256: iconst_0       
        //   257: anewarray       Ljava/lang/String;
        //   260: astore          6
        //   262: aload           6
        //   264: aload           6
        //   266: arraylength    
        //   267: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   270: invokestatic    W5/I.d:([Ljava/lang/Object;)Ljava/util/Set;
        //   273: astore_0       
        //   274: aload_0        
        //   275: aload           9
        //   277: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   282: ifeq            286
        //   285: return         
        //   286: new             Ljava/lang/StringBuilder;
        //   289: dup            
        //   290: invokespecial   java/lang/StringBuilder.<init>:()V
        //   293: astore          11
        //   295: aload           6
        //   297: arraylength    
        //   298: ifne            312
        //   301: aload           11
        //   303: aload           9
        //   305: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   308: pop            
        //   309: goto            387
        //   312: iload           5
        //   314: istore_1       
        //   315: aload           6
        //   317: arraylength    
        //   318: iconst_5       
        //   319: if_icmpge       341
        //   322: aload           11
        //   324: aload           10
        //   326: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   329: pop            
        //   330: aload           11
        //   332: ldc             ","
        //   334: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   337: pop            
        //   338: goto            301
        //   341: iload_1        
        //   342: iconst_1       
        //   343: iadd           
        //   344: istore_2       
        //   345: aload           11
        //   347: aload           6
        //   349: iload_1        
        //   350: aaload         
        //   351: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   354: pop            
        //   355: aload           11
        //   357: ldc             ","
        //   359: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   362: pop            
        //   363: iload_2        
        //   364: iconst_5       
        //   365: if_icmplt       525
        //   368: aload           11
        //   370: aload           9
        //   372: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   375: pop            
        //   376: aload_0        
        //   377: aload           6
        //   379: iconst_0       
        //   380: aaload         
        //   381: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //   386: pop            
        //   387: getstatic       y1/L.f:Ljava/util/concurrent/ConcurrentHashMap;
        //   390: aload           8
        //   392: aload           11
        //   394: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   397: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   402: pop            
        //   403: goto            46
        //   406: new             Ljava/lang/NullPointerException;
        //   409: dup            
        //   410: ldc_w           "null cannot be cast to non-null type kotlin.Array<T>"
        //   413: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   416: athrow         
        //   417: aload_0        
        //   418: aload           8
        //   420: aload           9
        //   422: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   427: pop            
        //   428: goto            46
        //   431: getstatic       y1/L.a:Ly1/L;
        //   434: astore_0       
        //   435: getstatic       O1/P.a:LO1/P;
        //   438: astore          6
        //   440: aload_0        
        //   441: ldc_w           "com.facebook.appevents.UserDataStore.internalUserData"
        //   444: getstatic       y1/L.f:Ljava/util/concurrent/ConcurrentHashMap;
        //   447: invokestatic    O1/P.l0:(Ljava/util/Map;)Ljava/lang/String;
        //   450: invokevirtual   y1/L.q:(Ljava/lang/String;Ljava/lang/String;)V
        //   453: return         
        //   454: aload_0        
        //   455: ldc             Ly1/L;.class
        //   457: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   460: return         
        //   461: astore_0       
        //   462: goto            454
        //   465: iload_2        
        //   466: iload_1        
        //   467: if_icmpgt       141
        //   470: iload_3        
        //   471: ifne            480
        //   474: iload_2        
        //   475: istore          4
        //   477: goto            119
        //   480: iload_1        
        //   481: istore          4
        //   483: goto            119
        //   486: iconst_0       
        //   487: istore          4
        //   489: iload_3        
        //   490: ifne            510
        //   493: iload           4
        //   495: ifne            503
        //   498: iconst_1       
        //   499: istore_3       
        //   500: goto            465
        //   503: iload_2        
        //   504: iconst_1       
        //   505: iadd           
        //   506: istore_2       
        //   507: goto            465
        //   510: iload           4
        //   512: ifne            518
        //   515: goto            141
        //   518: iload_1        
        //   519: iconst_1       
        //   520: isub           
        //   521: istore_1       
        //   522: goto            465
        //   525: iload_2        
        //   526: istore_1       
        //   527: goto            341
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  9      30     461    465    Any
        //  33     46     461    465    Any
        //  46     105    461    465    Any
        //  119    135    461    465    Any
        //  141    190    461    465    Any
        //  200    217    461    465    Any
        //  225    240    461    465    Any
        //  244    249    461    465    Any
        //  256    262    461    465    Any
        //  262    285    461    465    Any
        //  286    301    461    465    Any
        //  301    309    461    465    Any
        //  315    338    461    465    Any
        //  345    363    461    465    Any
        //  368    387    461    465    Any
        //  387    403    461    465    Any
        //  406    417    461    465    Any
        //  417    428    461    465    Any
        //  431    453    461    465    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    public static final void m(final Bundle bundle) {
        if (T1.a.d(L.class)) {
            return;
        }
        try {
            F.b.b().execute(new I(bundle));
        }
        finally {
            final Throwable t;
            T1.a.b(t, L.class);
        }
    }
    
    public static final void n(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final String s8, final String s9, final String s10) {
        if (T1.a.d(L.class)) {
            return;
        }
        while (true) {
            try {
                final Bundle bundle = new Bundle();
                if (s != null) {
                    ((BaseBundle)bundle).putString("em", s);
                }
                if (s2 != null) {
                    ((BaseBundle)bundle).putString("fn", s2);
                }
                if (s3 != null) {
                    ((BaseBundle)bundle).putString("ln", s3);
                }
                if (s4 != null) {
                    ((BaseBundle)bundle).putString("ph", s4);
                }
                if (s5 != null) {
                    ((BaseBundle)bundle).putString("db", s5);
                }
                if (s6 != null) {
                    ((BaseBundle)bundle).putString("ge", s6);
                }
                if (s7 != null) {
                    ((BaseBundle)bundle).putString("ct", s7);
                }
                if (s8 != null) {
                    ((BaseBundle)bundle).putString("st", s8);
                }
                if (s9 != null) {
                    ((BaseBundle)bundle).putString("zp", s9);
                }
                if (s10 != null) {
                    ((BaseBundle)bundle).putString("country", s10);
                }
                m(bundle);
                return;
                final Throwable t;
                T1.a.b(t, L.class);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final void o(final Bundle bundle) {
        if (T1.a.d(L.class)) {
            return;
        }
        while (true) {
            try {
                if (!L.d.get()) {
                    Log.w(L.b, "initStore should have been called before calling setUserData");
                    L.a.h();
                }
                final L a = L.a;
                a.p(bundle);
                final P a2 = P.a;
                a.q("com.facebook.appevents.UserDataStore.userData", P.l0(L.e));
                a.q("com.facebook.appevents.UserDataStore.internalUserData", P.l0(L.f));
                return;
                final Throwable t;
                T1.a.b(t, L.class);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final void r(final String s, final String s2) {
        if (T1.a.d(L.class)) {
            return;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(s, "$key");
                Intrinsics.checkNotNullParameter(s2, "$value");
                if (!L.d.get()) {
                    L.a.h();
                }
                final SharedPreferences c = L.c;
                if (c != null) {
                    c.edit().putString(s, s2).apply();
                    return;
                }
                Intrinsics.n("sharedPreferences");
                throw null;
                final Throwable t;
                T1.a.b(t, L.class);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final Map g() {
        if (T1.a.d(this)) {
            return null;
        }
        final Throwable t;
        Label_0095: {
            try {
                final HashMap<String, Object> hashMap = new HashMap<String, Object>();
                final Set b = z1.d.d.b();
                for (final String s : L.f.keySet()) {
                    if (b.contains(s)) {
                        hashMap.put(s, L.f.get(s));
                    }
                }
            }
            finally {
                break Label_0095;
            }
            return (Map)t;
        }
        T1.a.b(t, this);
        return null;
    }
    
    public final void h() {
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
        //    14: getstatic       y1/L.d:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    17: astore          5
        //    19: aload           5
        //    21: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //    24: istore_1       
        //    25: iload_1        
        //    26: ifeq            32
        //    29: aload_0        
        //    30: monitorexit    
        //    31: return         
        //    32: invokestatic    x1/B.l:()Landroid/content/Context;
        //    35: invokestatic    android/preference/PreferenceManager.getDefaultSharedPreferences:(Landroid/content/Context;)Landroid/content/SharedPreferences;
        //    38: astore_2       
        //    39: aload_2        
        //    40: ldc_w           "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())"
        //    43: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    46: aload_2        
        //    47: putstatic       y1/L.c:Landroid/content/SharedPreferences;
        //    50: aload_2        
        //    51: ifnull          149
        //    54: aload_2        
        //    55: ldc             "com.facebook.appevents.UserDataStore.userData"
        //    57: ldc_w           ""
        //    60: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    65: astore_3       
        //    66: aload_3        
        //    67: astore_2       
        //    68: aload_3        
        //    69: ifnonnull       79
        //    72: ldc_w           ""
        //    75: astore_2       
        //    76: goto            79
        //    79: getstatic       y1/L.c:Landroid/content/SharedPreferences;
        //    82: astore_3       
        //    83: aload_3        
        //    84: ifnull          142
        //    87: aload_3        
        //    88: ldc_w           "com.facebook.appevents.UserDataStore.internalUserData"
        //    91: ldc_w           ""
        //    94: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    99: astore          4
        //   101: aload           4
        //   103: astore_3       
        //   104: aload           4
        //   106: ifnonnull       113
        //   109: ldc_w           ""
        //   112: astore_3       
        //   113: getstatic       y1/L.e:Ljava/util/concurrent/ConcurrentHashMap;
        //   116: aload_2        
        //   117: invokestatic    O1/P.h0:(Ljava/lang/String;)Ljava/util/Map;
        //   120: invokevirtual   java/util/concurrent/ConcurrentHashMap.putAll:(Ljava/util/Map;)V
        //   123: getstatic       y1/L.f:Ljava/util/concurrent/ConcurrentHashMap;
        //   126: aload_3        
        //   127: invokestatic    O1/P.h0:(Ljava/lang/String;)Ljava/util/Map;
        //   130: invokevirtual   java/util/concurrent/ConcurrentHashMap.putAll:(Ljava/util/Map;)V
        //   133: aload           5
        //   135: iconst_1       
        //   136: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   139: aload_0        
        //   140: monitorexit    
        //   141: return         
        //   142: ldc             "sharedPreferences"
        //   144: invokestatic    kotlin/jvm/internal/Intrinsics.n:(Ljava/lang/String;)V
        //   147: aconst_null    
        //   148: athrow         
        //   149: ldc             "sharedPreferences"
        //   151: invokestatic    kotlin/jvm/internal/Intrinsics.n:(Ljava/lang/String;)V
        //   154: aconst_null    
        //   155: athrow         
        //   156: aload_2        
        //   157: aload_0        
        //   158: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   161: aload_0        
        //   162: monitorexit    
        //   163: return         
        //   164: astore_2       
        //   165: aload_0        
        //   166: monitorexit    
        //   167: aload_2        
        //   168: athrow         
        //   169: astore_2       
        //   170: goto            156
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      7      164    169    Any
        //  14     25     169    164    Any
        //  32     50     169    164    Any
        //  54     66     169    164    Any
        //  79     83     169    164    Any
        //  87     101    169    164    Any
        //  113    139    169    164    Any
        //  142    149    169    164    Any
        //  149    156    169    164    Any
        //  156    161    164    169    Any
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
    
    public final boolean j(final String s) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return new Regex("[A-Fa-f0-9]{64}").b(s);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return false;
        }
    }
    
    public final String k(String substring, String input) {
        if (T1.a.d(this)) {
            return null;
        }
        while (true) {
            while (true) {
                Label_0329: {
                    while (true) {
                        try {
                            int n = input.length() - 1;
                            int n2;
                            int i = n2 = 0;
                            while (i <= n) {
                                int n3;
                                if (n2 == 0) {
                                    n3 = i;
                                }
                                else {
                                    n3 = n;
                                }
                                final boolean b = Intrinsics.d(input.charAt(n3), 32) <= 0;
                                if (n2 == 0) {
                                    if (!b) {
                                        n2 = 1;
                                    }
                                    else {
                                        ++i;
                                    }
                                }
                                else {
                                    if (!b) {
                                        break;
                                    }
                                    --n;
                                }
                            }
                            input = input.subSequence(i, n + 1).toString();
                            if (input == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            input = input.toLowerCase();
                            Intrinsics.checkNotNullExpressionValue(input, "(this as java.lang.String).toLowerCase()");
                            final Throwable t;
                            if (Intrinsics.a("em", substring)) {
                                if (Patterns.EMAIL_ADDRESS.matcher(input).matches()) {
                                    return input;
                                }
                                Log.e(L.b, "Setting email failure: this is not a valid email address");
                                return "";
                            }
                            else {
                                if (Intrinsics.a("ph", substring)) {
                                    return new Regex("[^0-9]").replace(input, "");
                                }
                                if (!Intrinsics.a("ge", substring)) {
                                    return input;
                                }
                                if (input.length() <= 0) {
                                    break Label_0329;
                                }
                                if (input == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                }
                                substring = input.substring(0, 1);
                                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                                if (!Intrinsics.a("f", substring) && !Intrinsics.a("m", substring)) {
                                    Log.e(L.b, "Setting gender failure: the supported value for gender is f or m");
                                    return "";
                                }
                                return (String)t;
                            }
                            T1.a.b(t, this);
                            return null;
                        }
                        finally {}
                        final Throwable t2;
                        final Throwable t = t2;
                        continue;
                    }
                }
                substring = "";
                continue;
            }
        }
    }
    
    public final void p(final Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        if (bundle == null) {
            return;
        }
        while (true) {
            try {
                for (final String s : ((BaseBundle)bundle).keySet()) {
                    final Object value = ((BaseBundle)bundle).get(s);
                    if (value == null) {
                        continue;
                    }
                    final String string = value.toString();
                    ConcurrentHashMap concurrentHashMap;
                    String s2;
                    if (this.j(string)) {
                        concurrentHashMap = L.e;
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        s2 = string.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(s2, "(this as java.lang.String).toLowerCase()");
                    }
                    else {
                        final P a = P.a;
                        Intrinsics.checkNotNullExpressionValue(s, "key");
                        s2 = P.F0(this.k(s, string));
                        if (s2 == null) {
                            continue;
                        }
                        concurrentHashMap = L.e;
                    }
                    concurrentHashMap.put(s, s2);
                }
                return;
                final Throwable t;
                T1.a.b(t, this);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void q(final String s, final String s2) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            B.t().execute(new K(s, s2));
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
}
