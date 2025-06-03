// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N1;

import android.net.nsd.NsdServiceInfo;
import kotlin.text.i;
import O1.P;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager$RegistrationListener;
import O1.r;
import O1.I;
import x1.B;
import O1.v;
import org.json.JSONObject;
import kotlin.jvm.internal.Intrinsics;
import android.os.Build;
import java.util.Map;
import android.graphics.Bitmap;
import java.util.HashMap;

public final class a
{
    public static final a a;
    public static final String b;
    public static final HashMap c;
    
    static {
        a = new a();
        b = a.class.getCanonicalName();
        c = new HashMap();
    }
    
    public static final void a(final String s) {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            N1.a.a.b(s);
        }
        finally {
            final Throwable t;
            T1.a.b(t, a.class);
        }
    }
    
    public static final Bitmap c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     5: istore          8
        //     7: aconst_null    
        //     8: astore          9
        //    10: iload           8
        //    12: ifeq            17
        //    15: aconst_null    
        //    16: areturn        
        //    17: new             Ljava/util/EnumMap;
        //    20: dup            
        //    21: ldc             LV4/c;.class
        //    23: invokespecial   java/util/EnumMap.<init>:(Ljava/lang/Class;)V
        //    26: astore          10
        //    28: aload           10
        //    30: getstatic       V4/c.t:LV4/c;
        //    33: iconst_2       
        //    34: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    37: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    42: pop            
        //    43: new             LV4/e;
        //    46: dup            
        //    47: invokespecial   V4/e.<init>:()V
        //    50: aload_0        
        //    51: getstatic       V4/a.z:LV4/a;
        //    54: sipush          200
        //    57: sipush          200
        //    60: aload           10
        //    62: invokevirtual   V4/e.a:(Ljava/lang/String;LV4/a;IILjava/util/Map;)LY4/b;
        //    65: astore_0       
        //    66: aload_0        
        //    67: invokevirtual   Y4/b.g:()I
        //    70: istore          6
        //    72: aload_0        
        //    73: invokevirtual   Y4/b.j:()I
        //    76: istore          7
        //    78: iload           6
        //    80: iload           7
        //    82: imul           
        //    83: newarray        I
        //    85: astore          10
        //    87: iload           6
        //    89: ifle            117
        //    92: iconst_0       
        //    93: istore_1       
        //    94: goto            167
        //    97: iload_2        
        //    98: iconst_1       
        //    99: iadd           
        //   100: istore          5
        //   102: aload_0        
        //   103: iload_2        
        //   104: iload_1        
        //   105: invokevirtual   Y4/b.f:(II)Z
        //   108: ifeq            182
        //   111: ldc             -16777216
        //   113: istore_3       
        //   114: goto            184
        //   117: iload           7
        //   119: iload           6
        //   121: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //   124: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //   127: astore_0       
        //   128: aload_0        
        //   129: aload           10
        //   131: iconst_0       
        //   132: iload           7
        //   134: iconst_0       
        //   135: iconst_0       
        //   136: iload           7
        //   138: iload           6
        //   140: invokevirtual   android/graphics/Bitmap.setPixels:([IIIIIII)V
        //   143: aload_0        
        //   144: areturn        
        //   145: aload_0        
        //   146: areturn        
        //   147: aload_0        
        //   148: ldc             LN1/a;.class
        //   150: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   153: aconst_null    
        //   154: areturn        
        //   155: astore_0       
        //   156: aload           9
        //   158: astore_0       
        //   159: goto            145
        //   162: astore          9
        //   164: goto            145
        //   167: iload_1        
        //   168: iconst_1       
        //   169: iadd           
        //   170: istore          4
        //   172: iload           7
        //   174: ifle            214
        //   177: iconst_0       
        //   178: istore_2       
        //   179: goto            97
        //   182: iconst_m1      
        //   183: istore_3       
        //   184: aload           10
        //   186: iload_1        
        //   187: iload           7
        //   189: imul           
        //   190: iload_2        
        //   191: iadd           
        //   192: iload_3        
        //   193: iastore        
        //   194: iload           5
        //   196: iload           7
        //   198: if_icmplt       204
        //   201: goto            214
        //   204: iload           5
        //   206: istore_2       
        //   207: goto            97
        //   210: astore_0       
        //   211: goto            147
        //   214: iload           4
        //   216: iload           6
        //   218: if_icmplt       224
        //   221: goto            117
        //   224: iload           4
        //   226: istore_1       
        //   227: goto            167
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type  
        //  -----  -----  -----  -----  ------
        //  17     43     210    155    Any
        //  43     87     155    162    LV4/h;
        //  43     87     210    155    Any
        //  102    111    155    162    LV4/h;
        //  102    111    210    155    Any
        //  117    128    155    162    LV4/h;
        //  117    128    210    155    Any
        //  128    143    162    167    LV4/h;
        //  128    143    210    155    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0145:
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
    
    public static final String d(final Map map) {
        if (T1.a.d(a.class)) {
            return null;
        }
        Label_0027: {
            Map<String, String> map2;
            if ((map2 = (Map<String, String>)map) != null) {
                break Label_0027;
            }
            while (true) {
                try {
                    map2 = new HashMap<String, String>();
                    final String device = Build.DEVICE;
                    Intrinsics.checkNotNullExpressionValue(device, "DEVICE");
                    map2.put("device", device);
                    final String model = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(model, "MODEL");
                    map2.put("model", model);
                    final String string = new JSONObject((Map)map2).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "JSONObject(deviceInfo as Map<*, *>).toString()");
                    return string;
                    final Throwable t;
                    T1.a.b(t, a.class);
                    return null;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
    
    public static final boolean e() {
        if (T1.a.d(a.class)) {
            return false;
        }
        Label_0048: {
            try {
                final v a = v.a;
                final r f = v.f(B.m());
                if (f != null && f.l().contains(I.s)) {
                    return true;
                }
            }
            finally {
                break Label_0048;
            }
            return false;
        }
        final Throwable t;
        T1.a.b(t, a.class);
        return false;
    }
    
    public static final boolean f(final String s) {
        if (T1.a.d(a.class)) {
            return false;
        }
        Label_0032: {
            try {
                if (e()) {
                    return N1.a.a.g(s);
                }
            }
            finally {
                break Label_0032;
            }
            return false;
        }
        final Throwable t;
        T1.a.b(t, a.class);
        return false;
    }
    
    public final void b(String s) {
        if (T1.a.d(this)) {
            return;
        }
        Label_0085: {
            Label_0065: {
                NsdManager$RegistrationListener nsdManager$RegistrationListener;
                NsdManager nsdManager;
                try {
                    nsdManager$RegistrationListener = N1.a.c.get(s);
                    if (nsdManager$RegistrationListener == null) {
                        return;
                    }
                    final Object systemService = B.l().getSystemService("servicediscovery");
                    if (systemService != null) {
                        final NsdManager nsdManager2;
                        nsdManager = (nsdManager2 = (NsdManager)systemService);
                        final NsdManager$RegistrationListener nsdManager$RegistrationListener2 = nsdManager$RegistrationListener;
                        nsdManager2.unregisterService(nsdManager$RegistrationListener2);
                        break Label_0065;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                }
                finally {
                    final String s2;
                    s = s2;
                    break Label_0085;
                }
                try {
                    final NsdManager nsdManager2 = nsdManager;
                    final NsdManager$RegistrationListener nsdManager$RegistrationListener2 = nsdManager$RegistrationListener;
                    nsdManager2.unregisterService(nsdManager$RegistrationListener2);
                }
                catch (IllegalArgumentException ex) {
                    final P a = P.a;
                    P.i0(N1.a.b, ex);
                }
            }
            N1.a.c.remove(s);
            return;
        }
        T1.a.b((Throwable)s, this);
    }
    
    public final boolean g(final String s) {
        if (T1.a.d(this)) {
            return false;
        }
        while (true) {
            try {
                final HashMap c = N1.a.c;
                if (c.containsKey(s)) {
                    return true;
                }
                final String i = Intrinsics.i("android-", kotlin.text.i.p(B.B(), '.', '|', false, 4, null));
                final StringBuilder sb = new StringBuilder();
                sb.append("fbsdk_");
                sb.append(i);
                sb.append('_');
                sb.append((Object)s);
                final String string = sb.toString();
                final NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
                nsdServiceInfo.setServiceType("_fb._tcp.");
                nsdServiceInfo.setServiceName(string);
                nsdServiceInfo.setPort(80);
                final Object systemService = B.l().getSystemService("servicediscovery");
                if (systemService != null) {
                    final NsdManager nsdManager = (NsdManager)systemService;
                    final NsdManager$RegistrationListener nsdManager$RegistrationListener = (NsdManager$RegistrationListener)new NsdManager$RegistrationListener() {
                        public void onRegistrationFailed(final NsdServiceInfo nsdServiceInfo, final int n) {
                            Intrinsics.checkNotNullParameter(nsdServiceInfo, "serviceInfo");
                            final a a = N1.a.a;
                            N1.a.a(s);
                        }
                        
                        public void onServiceRegistered(final NsdServiceInfo nsdServiceInfo) {
                            Intrinsics.checkNotNullParameter(nsdServiceInfo, "NsdServiceInfo");
                            if (!Intrinsics.a(string, nsdServiceInfo.getServiceName())) {
                                final a a = N1.a.a;
                                N1.a.a(s);
                            }
                        }
                        
                        public void onServiceUnregistered(final NsdServiceInfo nsdServiceInfo) {
                            Intrinsics.checkNotNullParameter(nsdServiceInfo, "serviceInfo");
                        }
                        
                        public void onUnregistrationFailed(final NsdServiceInfo nsdServiceInfo, final int n) {
                            Intrinsics.checkNotNullParameter(nsdServiceInfo, "serviceInfo");
                        }
                    };
                    c.put(s, nsdManager$RegistrationListener);
                    nsdManager.registerService(nsdServiceInfo, 1, (NsdManager$RegistrationListener)nsdManager$RegistrationListener);
                    return true;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                final Throwable t;
                T1.a.b(t, this);
                return false;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
