// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E1;

import android.os.BaseBundle;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.Arrays;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import android.content.SharedPreferences$Editor;
import kotlin.jvm.internal.Intrinsics;
import T1.a;
import android.os.IBinder;
import android.content.Context;
import x1.B;
import android.content.SharedPreferences;
import java.util.HashMap;

public final class i
{
    public static final i a;
    public static final HashMap b;
    public static final HashMap c;
    public static final String d;
    public static final SharedPreferences e;
    public static final SharedPreferences f;
    
    static {
        a = new i();
        b = new HashMap();
        c = new HashMap();
        d = B.l().getPackageName();
        e = B.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
        f = B.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
    }
    
    public static final Object a(final Context context, final IBinder binder) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            return i.a.n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[] { binder });
        }
        finally {
            final Throwable t;
            T1.a.b(t, i.class);
            return null;
        }
    }
    
    public static final void b() {
        if (T1.a.d(i.class)) {
            return;
        }
        while (true) {
            try {
                final long n = System.currentTimeMillis() / 1000L;
                final SharedPreferences e = i.e;
                final long long1 = e.getLong("LAST_CLEARED_TIME", 0L);
                SharedPreferences$Editor sharedPreferences$Editor;
                if (long1 == 0L) {
                    sharedPreferences$Editor = e.edit().putLong("LAST_CLEARED_TIME", n);
                }
                else {
                    if (n - long1 <= 604800) {
                        return;
                    }
                    sharedPreferences$Editor = e.edit().clear().putLong("LAST_CLEARED_TIME", n);
                }
                sharedPreferences$Editor.apply();
                return;
                final Throwable t;
                T1.a.b(t, i.class);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final ArrayList g(final Context context, final Object o) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            final ArrayList list = new ArrayList();
            if (o == null) {
                return list;
            }
            final i a = i.a;
            final Class d = a.d(context, "com.android.vending.billing.IInAppBillingService");
            if (d == null) {
                return list;
            }
            if (a.e(d, "getPurchaseHistory") == null) {
                return list;
            }
            return a.c(a.f(context, o, "inapp"));
        }
        finally {
            final Throwable t;
            T1.a.b(t, i.class);
            return null;
        }
    }
    
    public static final ArrayList i(final Context context, final Object o) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            final i a = i.a;
            return a.c(a.h(context, o, "inapp"));
        }
        finally {
            final Throwable t;
            T1.a.b(t, i.class);
            return null;
        }
    }
    
    public static final ArrayList j(final Context context, final Object o) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            final i a = i.a;
            return a.c(a.h(context, o, "subs"));
        }
        finally {
            final Throwable t;
            T1.a.b(t, i.class);
            return null;
        }
    }
    
    public static final Map k(final Context context, final ArrayList list, final Object o, final boolean b) {
        if (T1.a.d(i.class)) {
            return null;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(list, "skuList");
                final Map p4 = i.a.p(list);
                final ArrayList<String> list2 = new ArrayList<String>();
                for (final String e : list) {
                    if (!p4.containsKey(e)) {
                        list2.add(e);
                    }
                }
                p4.putAll(i.a.l(context, list2, o, b));
                return p4;
                final Throwable t;
                T1.a.b(t, i.class);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final ArrayList c(final ArrayList p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     4: ifeq            9
        //     7: aconst_null    
        //     8: areturn        
        //     9: new             Ljava/util/ArrayList;
        //    12: dup            
        //    13: invokespecial   java/util/ArrayList.<init>:()V
        //    16: astore          6
        //    18: getstatic       E1/i.f:Landroid/content/SharedPreferences;
        //    21: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //    26: astore          7
        //    28: invokestatic    java/lang/System.currentTimeMillis:()J
        //    31: ldc2_w          1000
        //    34: ldiv           
        //    35: lstore_2       
        //    36: aload_1        
        //    37: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    40: astore_1       
        //    41: aload_1        
        //    42: invokeinterface java/util/Iterator.hasNext:()Z
        //    47: ifeq            167
        //    50: aload_1        
        //    51: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    56: checkcast       Ljava/lang/String;
        //    59: astore          8
        //    61: new             Lorg/json/JSONObject;
        //    64: dup            
        //    65: aload           8
        //    67: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //    70: astore          10
        //    72: aload           10
        //    74: ldc             "productId"
        //    76: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    79: astore          9
        //    81: aload           10
        //    83: ldc             "purchaseTime"
        //    85: invokevirtual   org/json/JSONObject.getLong:(Ljava/lang/String;)J
        //    88: lstore          4
        //    90: aload           10
        //    92: ldc             "purchaseToken"
        //    94: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    97: astore          10
        //    99: lload_2        
        //   100: lload           4
        //   102: ldc2_w          1000
        //   105: ldiv           
        //   106: lsub           
        //   107: ldc2_w          86400
        //   110: lcmp           
        //   111: ifle            117
        //   114: goto            41
        //   117: getstatic       E1/i.f:Landroid/content/SharedPreferences;
        //   120: aload           9
        //   122: ldc             ""
        //   124: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   129: aload           10
        //   131: invokestatic    kotlin/jvm/internal/Intrinsics.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   134: ifeq            140
        //   137: goto            41
        //   140: aload           7
        //   142: aload           9
        //   144: aload           10
        //   146: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //   151: pop            
        //   152: aload           6
        //   154: aload           8
        //   156: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   159: pop            
        //   160: goto            41
        //   163: astore_1       
        //   164: goto            177
        //   167: aload           7
        //   169: invokeinterface android/content/SharedPreferences$Editor.apply:()V
        //   174: aload           6
        //   176: areturn        
        //   177: aload_1        
        //   178: aload_0        
        //   179: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   182: aconst_null    
        //   183: areturn        
        //   184: astore          8
        //   186: goto            41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  9      41     163    167    Any
        //  41     61     163    167    Any
        //  61     114    184    189    Lorg/json/JSONException;
        //  61     114    163    167    Any
        //  117    137    184    189    Lorg/json/JSONException;
        //  117    137    163    167    Any
        //  140    160    184    189    Lorg/json/JSONException;
        //  140    160    163    167    Any
        //  167    174    163    167    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0117:
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
    
    public final Class d(final Context context, final String key) {
        if (T1.a.d(this)) {
            return null;
        }
        final Throwable t;
        Label_0058: {
            try {
                final HashMap c = i.c;
                final Class clazz = c.get(key);
                if (clazz != null) {
                    return clazz;
                }
                final Class b = m.b(context, key);
                if (b != null) {
                    c.put(key, b);
                    return b;
                }
            }
            finally {
                break Label_0058;
            }
            return (Class)t;
        }
        T1.a.b(t, this);
        return null;
    }
    
    public final Method e(final Class clazz, final String key) {
        if (T1.a.d(this)) {
            return null;
        }
        while (true) {
            while (true) {
                Label_0416: {
                    while (true) {
                        try {
                            final HashMap b = i.b;
                            final Method method = b.get(key);
                            if (method != null) {
                                return method;
                            }
                            Class[] original = null;
                            switch (key.hashCode()) {
                                default: {
                                    break Label_0416;
                                }
                                case -573310373: {
                                    if (!key.equals("getSkuDetails")) {
                                        break Label_0416;
                                    }
                                    original = new Class[4];
                                    final Class<Integer> type = Integer.TYPE;
                                    Intrinsics.checkNotNullExpressionValue(type, "TYPE");
                                    original[0] = type;
                                    original[2] = (original[1] = String.class);
                                    original[3] = Bundle.class;
                                    break;
                                }
                                case -594356707: {
                                    if (!key.equals("getPurchaseHistory")) {
                                        break Label_0416;
                                    }
                                    original = new Class[5];
                                    final Class<Integer> type2 = Integer.TYPE;
                                    Intrinsics.checkNotNullExpressionValue(type2, "TYPE");
                                    original[0] = type2;
                                    original[1] = String.class;
                                    original[3] = (original[2] = String.class);
                                    original[4] = Bundle.class;
                                    break;
                                }
                                case -1123215065: {
                                    if (!key.equals("asInterface")) {
                                        break Label_0416;
                                    }
                                    original = new Class[] { IBinder.class };
                                    break;
                                }
                                case -1450694211: {
                                    if (!key.equals("isBillingSupported")) {
                                        break Label_0416;
                                    }
                                    original = new Class[3];
                                    final Class<Integer> type3 = Integer.TYPE;
                                    Intrinsics.checkNotNullExpressionValue(type3, "TYPE");
                                    original[0] = type3;
                                    original[2] = (original[1] = String.class);
                                    break;
                                }
                                case -1801122596: {
                                    if (!key.equals("getPurchases")) {
                                        break Label_0416;
                                    }
                                    original = new Class[4];
                                    final Class<Integer> type4 = Integer.TYPE;
                                    Intrinsics.checkNotNullExpressionValue(type4, "TYPE");
                                    original[0] = type4;
                                    original[1] = String.class;
                                    original[3] = (original[2] = String.class);
                                    break;
                                }
                            }
                            Method method2;
                            if (original == null) {
                                method2 = m.c(clazz, key, null);
                            }
                            else {
                                final m a = m.a;
                                method2 = m.c(clazz, key, (Class[])Arrays.copyOf(original, original.length));
                            }
                            if (method2 != null) {
                                b.put(key, method2);
                            }
                            return method2;
                            T1.a.b((Throwable)clazz, this);
                            return null;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                Class[] original = null;
                continue;
            }
        }
    }
    
    public final ArrayList f(final Context p0, final Object p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     4: ifeq            9
        //     7: aconst_null    
        //     8: areturn        
        //     9: new             Ljava/util/ArrayList;
        //    12: dup            
        //    13: invokespecial   java/util/ArrayList.<init>:()V
        //    16: astore          10
        //    18: aload_0        
        //    19: aload_1        
        //    20: aload_2        
        //    21: aload_3        
        //    22: invokevirtual   E1/i.o:(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;)Z
        //    25: ifeq            266
        //    28: aconst_null    
        //    29: astore          9
        //    31: iconst_0       
        //    32: istore          5
        //    34: iload           5
        //    36: istore          4
        //    38: aload_0        
        //    39: aload_1        
        //    40: ldc             "com.android.vending.billing.IInAppBillingService"
        //    42: ldc             "getPurchaseHistory"
        //    44: aload_2        
        //    45: iconst_5       
        //    46: anewarray       Ljava/lang/Object;
        //    49: dup            
        //    50: iconst_0       
        //    51: bipush          6
        //    53: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    56: aastore        
        //    57: dup            
        //    58: iconst_1       
        //    59: getstatic       E1/i.d:Ljava/lang/String;
        //    62: aastore        
        //    63: dup            
        //    64: iconst_2       
        //    65: aload_3        
        //    66: aastore        
        //    67: dup            
        //    68: iconst_3       
        //    69: aload           9
        //    71: aastore        
        //    72: dup            
        //    73: iconst_4       
        //    74: new             Landroid/os/Bundle;
        //    77: dup            
        //    78: invokespecial   android/os/Bundle.<init>:()V
        //    81: aastore        
        //    82: invokevirtual   E1/i.n:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    85: astore          9
        //    87: aload           9
        //    89: ifnull          238
        //    92: invokestatic    java/lang/System.currentTimeMillis:()J
        //    95: ldc2_w          1000
        //    98: ldiv           
        //    99: lstore          7
        //   101: aload           9
        //   103: checkcast       Landroid/os/Bundle;
        //   106: astore          9
        //   108: aload           9
        //   110: ldc_w           "RESPONSE_CODE"
        //   113: invokevirtual   android/os/BaseBundle.getInt:(Ljava/lang/String;)I
        //   116: ifne            238
        //   119: aload           9
        //   121: ldc_w           "INAPP_PURCHASE_DATA_LIST"
        //   124: invokevirtual   android/os/Bundle.getStringArrayList:(Ljava/lang/String;)Ljava/util/ArrayList;
        //   127: astore          11
        //   129: aload           11
        //   131: ifnonnull       137
        //   134: goto            238
        //   137: aload           11
        //   139: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   142: astore          11
        //   144: iload           4
        //   146: istore          6
        //   148: aload           11
        //   150: invokeinterface java/util/Iterator.hasNext:()Z
        //   155: ifeq            225
        //   158: aload           11
        //   160: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   165: checkcast       Ljava/lang/String;
        //   168: astore          12
        //   170: lload           7
        //   172: new             Lorg/json/JSONObject;
        //   175: dup            
        //   176: aload           12
        //   178: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   181: ldc             "purchaseTime"
        //   183: invokevirtual   org/json/JSONObject.getLong:(Ljava/lang/String;)J
        //   186: ldc2_w          1000
        //   189: ldiv           
        //   190: lsub           
        //   191: ldc2_w          1200
        //   194: lcmp           
        //   195: ifle            204
        //   198: iconst_1       
        //   199: istore          6
        //   201: goto            225
        //   204: aload           10
        //   206: aload           12
        //   208: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   211: pop            
        //   212: iload           5
        //   214: iconst_1       
        //   215: iadd           
        //   216: istore          5
        //   218: goto            144
        //   221: astore_1       
        //   222: goto            269
        //   225: aload           9
        //   227: ldc_w           "INAPP_CONTINUATION_TOKEN"
        //   230: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   233: astore          9
        //   235: goto            245
        //   238: aconst_null    
        //   239: astore          9
        //   241: iload           4
        //   243: istore          6
        //   245: iload           5
        //   247: bipush          30
        //   249: if_icmpge       266
        //   252: aload           9
        //   254: ifnull          266
        //   257: iload           6
        //   259: istore          4
        //   261: iload           6
        //   263: ifeq            38
        //   266: aload           10
        //   268: areturn        
        //   269: aload_1        
        //   270: aload_0        
        //   271: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   274: aconst_null    
        //   275: areturn        
        //   276: astore          12
        //   278: goto            144
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  9      28     221    225    Any
        //  38     87     221    225    Any
        //  92     129    221    225    Any
        //  137    144    221    225    Any
        //  148    170    221    225    Any
        //  170    198    276    281    Lorg/json/JSONException;
        //  170    198    221    225    Any
        //  204    212    276    281    Lorg/json/JSONException;
        //  204    212    221    225    Any
        //  225    235    221    225    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0204:
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
    
    public final ArrayList h(final Context context, final Object o, final String s) {
        if (T1.a.d(this)) {
            return null;
        }
        Label_0175: {
            ArrayList list;
            while (true) {
                while (true) {
                    int n = 0;
                    Object o3 = null;
                    Label_0156: {
                        try {
                            list = new ArrayList();
                            if (o == null) {
                                return list;
                            }
                            if (!this.o(context, o, s)) {
                                break;
                            }
                            final Object o2 = null;
                            n = 0;
                            o3 = this.n(context, "com.android.vending.billing.IInAppBillingService", "getPurchases", o, new Object[] { 3, i.d, s, o2 });
                            if (o3 != null) {
                                o3 = o3;
                                if (((BaseBundle)o3).getInt("RESPONSE_CODE") == 0) {
                                    final ArrayList stringArrayList = ((Bundle)o3).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                    if (stringArrayList != null) {
                                        n += stringArrayList.size();
                                        list.addAll(stringArrayList);
                                        o3 = ((BaseBundle)o3).getString("INAPP_CONTINUATION_TOKEN");
                                        break Label_0156;
                                    }
                                    break;
                                }
                            }
                        }
                        finally {
                            break Label_0175;
                        }
                        o3 = null;
                    }
                    Object o2;
                    if (n >= 30 || (o2 = o3) == null) {
                        break;
                    }
                    continue;
                }
            }
            return list;
        }
        T1.a.b((Throwable)context, this);
        return null;
    }
    
    public final Map l(Context stringArrayList, final ArrayList list, Object value, final boolean b) {
        if (T1.a.d(this)) {
            return null;
        }
    Label_0162_Outer:
        while (true) {
            while (true) {
                int n4 = 0;
            Label_0246:
                while (true) {
                    Label_0239: {
                        while (true) {
                            try {
                                final LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
                                if (value != null) {
                                    if (list.isEmpty()) {
                                        return linkedHashMap;
                                    }
                                    final Bundle bundle = new Bundle();
                                    bundle.putStringArrayList("ITEM_ID_LIST", list);
                                    final int n = 0;
                                    final String d = i.d;
                                    if (!b) {
                                        break Label_0239;
                                    }
                                    final String s = "subs";
                                    final Object n2 = this.n(stringArrayList, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", value, new Object[] { 3, d, s, bundle });
                                    if (n2 != null) {
                                        final Bundle bundle2 = (Bundle)n2;
                                        if (((BaseBundle)bundle2).getInt("RESPONSE_CODE") == 0) {
                                            stringArrayList = (Context)bundle2.getStringArrayList("DETAILS_LIST");
                                            if (stringArrayList != null && list.size() == ((ArrayList)stringArrayList).size()) {
                                                final int n3 = list.size() - 1;
                                                if (n3 >= 0) {
                                                    n4 = n + 1;
                                                    value = list.get(n);
                                                    Intrinsics.checkNotNullExpressionValue(value, "skuList[i]");
                                                    final Object value2 = ((ArrayList<Object>)stringArrayList).get(n);
                                                    Intrinsics.checkNotNullExpressionValue(value2, "skuDetailsList[i]");
                                                    linkedHashMap.put(value, value2);
                                                    if (n4 <= n3) {
                                                        break Label_0246;
                                                    }
                                                }
                                            }
                                            this.q(linkedHashMap);
                                        }
                                    }
                                }
                                return linkedHashMap;
                                T1.a.b((Throwable)stringArrayList, this);
                                return null;
                            }
                            finally {
                                continue;
                            }
                            break;
                        }
                    }
                    final String s = "inapp";
                    continue Label_0162_Outer;
                }
                final int n = n4;
                continue;
            }
        }
    }
    
    public final boolean m(String s) {
        if (T1.a.d(this)) {
            return false;
        }
        Label_0054: {
            try {
                Intrinsics.checkNotNullParameter(s, "skuDetail");
                final String s2 = s;
                final JSONObject jsonObject = new JSONObject(s2);
                final String s3 = "freeTrialPeriod";
                final String s4 = jsonObject.optString(s3);
                final String s5;
                s = (s5 = s4);
                if (s5 == null) {
                    return false;
                }
                final String s6 = s;
                final int length = s6.length();
                final int length2 = length;
                if (length2 > 0) {
                    return true;
                }
                return false;
            }
            finally {
                final Object o;
                final Throwable t = (Throwable)o;
                break Label_0054;
            }
            try {
                final String s2 = s;
                final JSONObject jsonObject = new JSONObject(s2);
                final String s3 = "freeTrialPeriod";
                final String s4 = jsonObject.optString(s3);
                final String s5;
                s = (s5 = s4);
                if (s5 != null) {
                    final String s6 = s;
                    final int length2;
                    final int length = length2 = s6.length();
                    if (length2 > 0) {
                        return true;
                    }
                }
                return false;
                final Throwable t;
                T1.a.b(t, this);
                return false;
            }
            catch (JSONException ex) {
                return false;
            }
        }
    }
    
    public final Object n(final Context context, final String s, final String s2, final Object o, final Object[] original) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            final Class d = this.d(context, s);
            if (d == null) {
                return null;
            }
            final Method e = this.e(d, s2);
            if (e == null) {
                return null;
            }
            final m a = m.a;
            return m.e(d, e, o, Arrays.copyOf(original, original.length));
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public final boolean o(final Context context, final Object o, final String s) {
        if (T1.a.d(this)) {
            return false;
        }
        if (o == null) {
            return false;
        }
        Label_0074: {
            try {
                final Object n = this.n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", o, new Object[] { 3, i.d, s });
                if (n != null && (int)n == 0) {
                    return true;
                }
            }
            finally {
                break Label_0074;
            }
            return false;
        }
        final Throwable t;
        T1.a.b(t, this);
        return false;
    }
    
    public final Map p(final ArrayList list) {
        if (T1.a.d(this)) {
            return null;
        }
        Label_0149: {
            LinkedHashMap<String, String> linkedHashMap;
            try {
                linkedHashMap = new LinkedHashMap<String, String>();
                final long n = System.currentTimeMillis() / 1000L;
                for (final String s : list) {
                    final String string = i.e.getString(s, (String)null);
                    if (string != null) {
                        final List v = kotlin.text.i.V(string, new String[] { ";" }, false, 2, 2, null);
                        if (n - Long.parseLong(v.get(0)) >= 43200L) {
                            continue;
                        }
                        Intrinsics.checkNotNullExpressionValue(s, "sku");
                        linkedHashMap.put(s, v.get(1));
                    }
                }
            }
            finally {
                break Label_0149;
            }
            return linkedHashMap;
        }
        final Throwable t;
        T1.a.b(t, this);
        return null;
    }
    
    public final void q(final Map map) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                final long lng = System.currentTimeMillis() / 1000L;
                final SharedPreferences$Editor edit = i.e.edit();
                for (final Map.Entry<String, V> entry : map.entrySet()) {
                    final String s = entry.getKey();
                    final String str = (String)entry.getValue();
                    final StringBuilder sb = new StringBuilder();
                    sb.append(lng);
                    sb.append(';');
                    sb.append(str);
                    edit.putString(s, sb.toString());
                }
                edit.apply();
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
}
