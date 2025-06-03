// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import android.os.BaseBundle;
import java.util.TimeZone;
import android.telephony.TelephonyManager;
import java.io.FilenameFilter;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.Charset;
import kotlin.text.b;
import java.security.MessageDigest;
import android.os.StatFs;
import android.os.Environment;
import android.database.Cursor;
import java.util.Date;
import java.util.regex.Pattern;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.ApplicationInfo;
import java.math.BigInteger;
import java.util.Random;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.Closeable;
import android.util.Log;
import java.util.HashMap;
import java.util.ArrayList;
import android.net.Uri$Builder;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.io.File;
import kotlin.text.Regex;
import android.os.Build;
import android.view.autofill.AutofillManager;
import android.os.Build$VERSION;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import kotlin.jvm.internal.x;
import android.content.Intent;
import java.lang.reflect.InvocationTargetException;
import x1.o;
import org.json.JSONArray;
import org.json.JSONTokener;
import java.util.Arrays;
import java.lang.reflect.Method;
import x1.K;
import java.util.Iterator;
import java.util.Map;
import android.os.Parcel;
import x1.F;
import kotlin.text.i;
import y1.L;
import android.content.Context;
import org.json.JSONException;
import T1.a;
import org.json.JSONObject;
import x1.B;
import kotlin.jvm.internal.Intrinsics;
import java.util.Locale;

public final class P
{
    public static final P a;
    public static int b;
    public static long c;
    public static long d;
    public static long e;
    public static String f;
    public static String g;
    public static String h;
    public static String i;
    public static Locale j;
    
    static {
        a = new P();
        P.c = -1L;
        P.d = -1L;
        P.e = -1L;
        P.f = "";
        P.g = "";
        P.h = "NoCarrier";
        P.i = "";
    }
    
    public static final Locale A() {
        Locale locale;
        if ((locale = N()) == null) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return locale;
    }
    
    public static final void B0(final Runnable runnable) {
        try {
            B.t().execute(runnable);
        }
        catch (Exception ex) {}
    }
    
    public static final JSONObject C() {
        if (T1.a.d(P.class)) {
            return null;
        }
        Label_0049: {
            String string;
            try {
                string = B.l().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", (String)null);
                if (string != null) {
                    final String s = string;
                    final JSONObject jsonObject = new JSONObject(s);
                    return jsonObject;
                }
                break Label_0049;
            }
            finally {
                final Object o2;
                final Object o = o2;
                break Label_0049;
            }
            try {
                final String s = string;
                final JSONObject jsonObject2;
                final JSONObject jsonObject = jsonObject2 = new JSONObject(s);
                return jsonObject2;
                final Object o;
                T1.a.b((Throwable)o, P.class);
                return null;
                return null;
            }
            catch (JSONException ex) {
                return null;
            }
        }
    }
    
    public static final void C0(final JSONObject jsonObject, final O1.a a, String f, final boolean b, final Context context) {
        Intrinsics.checkNotNullParameter(jsonObject, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        final n a2 = n.a;
        final n.b p5 = n.b.P;
        if (!n.g(p5)) {
            jsonObject.put("anon_id", (Object)f);
        }
        jsonObject.put("application_tracking_enabled", b ^ true);
        jsonObject.put("advertiser_id_collection_enabled", B.k());
        if (a != null) {
            if (n.g(p5)) {
                P.a.c(jsonObject, a, f, context);
            }
            if (a.j() != null) {
                if (n.g(p5)) {
                    P.a.d(jsonObject, a, context);
                }
                else {
                    jsonObject.put("attribution", (Object)a.j());
                }
            }
            if (a.h() != null) {
                jsonObject.put("advertiser_id", (Object)a.h());
                jsonObject.put("advertiser_tracking_enabled", a.k() ^ true);
            }
            if (!a.k()) {
                f = L.f();
                if (f.length() != 0) {
                    jsonObject.put("ud", (Object)f);
                }
            }
            if (a.i() != null) {
                jsonObject.put("installer_package", (Object)a.i());
            }
        }
    }
    
    public static final void D0(final JSONObject p0, final Context p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "params"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1        
        //     7: ldc             "appContext"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: new             Lorg/json/JSONArray;
        //    15: dup            
        //    16: invokespecial   org/json/JSONArray.<init>:()V
        //    19: astore          14
        //    21: aload           14
        //    23: ldc             "a2"
        //    25: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //    28: pop            
        //    29: getstatic       O1/P.a:LO1/P;
        //    32: aload_1        
        //    33: invokevirtual   O1/P.y0:(Landroid/content/Context;)V
        //    36: aload_1        
        //    37: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    40: astore          11
        //    42: iconst_0       
        //    43: istore          8
        //    45: iconst_0       
        //    46: istore          9
        //    48: iconst_0       
        //    49: istore          7
        //    51: iconst_m1      
        //    52: istore          6
        //    54: iload           6
        //    56: istore          5
        //    58: aload_1        
        //    59: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    62: aload           11
        //    64: iconst_0       
        //    65: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //    68: astore          12
        //    70: aload           12
        //    72: ifnonnull       76
        //    75: return         
        //    76: iload           6
        //    78: istore          5
        //    80: aload           12
        //    82: getfield        android/content/pm/PackageInfo.versionCode:I
        //    85: istore          6
        //    87: iload           6
        //    89: istore          5
        //    91: aload           12
        //    93: getfield        android/content/pm/PackageInfo.versionName:Ljava/lang/String;
        //    96: putstatic       O1/P.i:Ljava/lang/String;
        //    99: iload           6
        //   101: istore          5
        //   103: aload           14
        //   105: aload           11
        //   107: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   110: pop            
        //   111: aload           14
        //   113: iload           5
        //   115: invokevirtual   org/json/JSONArray.put:(I)Lorg/json/JSONArray;
        //   118: pop            
        //   119: aload           14
        //   121: getstatic       O1/P.i:Ljava/lang/String;
        //   124: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   127: pop            
        //   128: aload           14
        //   130: getstatic       android/os/Build$VERSION.RELEASE:Ljava/lang/String;
        //   133: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   136: pop            
        //   137: aload           14
        //   139: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //   142: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   145: pop            
        //   146: aload_1        
        //   147: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   150: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //   153: getfield        android/content/res/Configuration.locale:Ljava/util/Locale;
        //   156: astore          11
        //   158: goto            166
        //   161: invokestatic    java/util/Locale.getDefault:()Ljava/util/Locale;
        //   164: astore          11
        //   166: aload           11
        //   168: putstatic       O1/P.j:Ljava/util/Locale;
        //   171: new             Ljava/lang/StringBuilder;
        //   174: dup            
        //   175: invokespecial   java/lang/StringBuilder.<init>:()V
        //   178: astore          15
        //   180: getstatic       O1/P.j:Ljava/util/Locale;
        //   183: astore          11
        //   185: ldc             ""
        //   187: astore          12
        //   189: aload           11
        //   191: ifnonnull       201
        //   194: ldc             ""
        //   196: astore          11
        //   198: goto            220
        //   201: aload           11
        //   203: invokevirtual   java/util/Locale.getLanguage:()Ljava/lang/String;
        //   206: astore          13
        //   208: aload           13
        //   210: astore          11
        //   212: aload           13
        //   214: ifnonnull       220
        //   217: goto            194
        //   220: aload           15
        //   222: aload           11
        //   224: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   227: pop            
        //   228: aload           15
        //   230: bipush          95
        //   232: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   235: pop            
        //   236: getstatic       O1/P.j:Ljava/util/Locale;
        //   239: astore          11
        //   241: aload           11
        //   243: ifnonnull       253
        //   246: aload           12
        //   248: astore          11
        //   250: goto            272
        //   253: aload           11
        //   255: invokevirtual   java/util/Locale.getCountry:()Ljava/lang/String;
        //   258: astore          11
        //   260: aload           11
        //   262: ifnonnull       272
        //   265: aload           12
        //   267: astore          11
        //   269: goto            272
        //   272: aload           15
        //   274: aload           11
        //   276: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   279: pop            
        //   280: aload           14
        //   282: aload           15
        //   284: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   287: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   290: pop            
        //   291: aload           14
        //   293: getstatic       O1/P.f:Ljava/lang/String;
        //   296: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   299: pop            
        //   300: aload           14
        //   302: getstatic       O1/P.h:Ljava/lang/String;
        //   305: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   308: pop            
        //   309: dconst_0       
        //   310: dstore_2       
        //   311: aload_1        
        //   312: ldc_w           "display"
        //   315: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   318: astore_1       
        //   319: aload_1        
        //   320: instanceof      Landroid/hardware/display/DisplayManager;
        //   323: istore          10
        //   325: aconst_null    
        //   326: astore          11
        //   328: iload           10
        //   330: ifeq            538
        //   333: aload_1        
        //   334: checkcast       Landroid/hardware/display/DisplayManager;
        //   337: astore_1       
        //   338: goto            540
        //   341: aload_1        
        //   342: iconst_0       
        //   343: invokevirtual   android/hardware/display/DisplayManager.getDisplay:(I)Landroid/view/Display;
        //   346: astore_1       
        //   347: aload_1        
        //   348: ifnull          410
        //   351: new             Landroid/util/DisplayMetrics;
        //   354: dup            
        //   355: invokespecial   android/util/DisplayMetrics.<init>:()V
        //   358: astore          11
        //   360: aload_1        
        //   361: aload           11
        //   363: invokevirtual   android/view/Display.getMetrics:(Landroid/util/DisplayMetrics;)V
        //   366: aload           11
        //   368: getfield        android/util/DisplayMetrics.widthPixels:I
        //   371: istore          8
        //   373: iload           9
        //   375: istore          5
        //   377: aload           11
        //   379: getfield        android/util/DisplayMetrics.heightPixels:I
        //   382: istore          6
        //   384: iload           6
        //   386: istore          5
        //   388: aload           11
        //   390: getfield        android/util/DisplayMetrics.density:F
        //   393: fstore          4
        //   395: fload           4
        //   397: f2d            
        //   398: dstore_2       
        //   399: iload           6
        //   401: istore          5
        //   403: iload           8
        //   405: istore          6
        //   407: goto            417
        //   410: iconst_0       
        //   411: istore          5
        //   413: iload           8
        //   415: istore          6
        //   417: aload           14
        //   419: iload           6
        //   421: invokevirtual   org/json/JSONArray.put:(I)Lorg/json/JSONArray;
        //   424: pop            
        //   425: aload           14
        //   427: iload           5
        //   429: invokevirtual   org/json/JSONArray.put:(I)Lorg/json/JSONArray;
        //   432: pop            
        //   433: aload           14
        //   435: new             Ljava/text/DecimalFormat;
        //   438: dup            
        //   439: ldc_w           "#.##"
        //   442: invokespecial   java/text/DecimalFormat.<init>:(Ljava/lang/String;)V
        //   445: dload_2        
        //   446: invokevirtual   java/text/NumberFormat.format:(D)Ljava/lang/String;
        //   449: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   452: pop            
        //   453: aload           14
        //   455: getstatic       O1/P.a:LO1/P;
        //   458: invokevirtual   O1/P.v0:()I
        //   461: invokevirtual   org/json/JSONArray.put:(I)Lorg/json/JSONArray;
        //   464: pop            
        //   465: aload           14
        //   467: getstatic       O1/P.d:J
        //   470: invokevirtual   org/json/JSONArray.put:(J)Lorg/json/JSONArray;
        //   473: pop            
        //   474: aload           14
        //   476: getstatic       O1/P.e:J
        //   479: invokevirtual   org/json/JSONArray.put:(J)Lorg/json/JSONArray;
        //   482: pop            
        //   483: aload           14
        //   485: getstatic       O1/P.g:Ljava/lang/String;
        //   488: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //   491: pop            
        //   492: aload_0        
        //   493: ldc_w           "extinfo"
        //   496: aload           14
        //   498: invokevirtual   org/json/JSONArray.toString:()Ljava/lang/String;
        //   501: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   504: pop            
        //   505: return         
        //   506: astore          12
        //   508: goto            103
        //   511: astore          11
        //   513: goto            161
        //   516: astore_1       
        //   517: goto            528
        //   520: astore_1       
        //   521: iload           8
        //   523: istore          6
        //   525: goto            407
        //   528: iconst_0       
        //   529: istore          6
        //   531: iload           7
        //   533: istore          5
        //   535: goto            407
        //   538: aconst_null    
        //   539: astore_1       
        //   540: aload_1        
        //   541: ifnonnull       341
        //   544: aload           11
        //   546: astore_1       
        //   547: goto            347
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  58     70     506    511    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  80     87     506    511    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  91     99     506    511    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  146    158    511    166    Ljava/lang/Exception;
        //  311    325    516    520    Ljava/lang/Exception;
        //  333    338    516    520    Ljava/lang/Exception;
        //  341    347    516    520    Ljava/lang/Exception;
        //  351    373    516    520    Ljava/lang/Exception;
        //  377    384    520    528    Ljava/lang/Exception;
        //  388    395    520    528    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 260 out of bounds for length 260
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
    
    public static final String E(String s) {
        final String u = B.u();
        if (s == null) {
            return u;
        }
        if (Intrinsics.a(s, "gaming")) {
            s = "fb.gg";
        }
        else {
            if (!Intrinsics.a(s, "instagram")) {
                return u;
            }
            s = "instagram.com";
        }
        return kotlin.text.i.q(u, "facebook.com", s, false, 4, null);
    }
    
    public static final String E0(final byte[] array) {
        Intrinsics.checkNotNullParameter(array, "bytes");
        return P.a.S("SHA-1", array);
    }
    
    public static final String F0(final String s) {
        if (s == null) {
            return null;
        }
        return P.a.R("SHA-256", s);
    }
    
    public static final void G(final String s, final a a) {
        Intrinsics.checkNotNullParameter(s, "accessToken");
        Intrinsics.checkNotNullParameter(a, "callback");
        final JSONObject a2 = G.a(s);
        if (a2 != null) {
            a.a(a2);
            return;
        }
        final N n = new N(a, s);
        final F f = P.a.F(s);
        f.C((F.b)n);
        f.l();
    }
    
    public static final void G0(final Parcel parcel, final Map map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final String s = entry.getKey();
            final String s2 = (String)entry.getValue();
            parcel.writeString(s);
            parcel.writeString(s2);
        }
    }
    
    public static final void H(final a a, final String s, final K k) {
        Intrinsics.checkNotNullParameter(a, "$callback");
        Intrinsics.checkNotNullParameter(s, "$accessToken");
        Intrinsics.checkNotNullParameter(k, "response");
        if (k.b() != null) {
            a.b(k.b().e());
            return;
        }
        final G a2 = G.a;
        final JSONObject d = k.d();
        if (d != null) {
            G.b(s, d);
            a.a(k.d());
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
    
    public static final void H0(final Parcel parcel, final Map map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final String s = entry.getKey();
            final String s2 = (String)entry.getValue();
            parcel.writeString(s);
            parcel.writeString(s2);
        }
    }
    
    public static final String J(final Context context) {
        Q.j(context, "context");
        return B.m();
    }
    
    public static final Method K(final Class clazz, final String name, final Class... original) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(name, "methodName");
        Intrinsics.checkNotNullParameter(original, "parameterTypes");
        try {
            return clazz.getMethod(name, (Class[])Arrays.copyOf(original, original.length));
        }
        catch (NoSuchMethodException ex) {
            return null;
        }
    }
    
    public static final Method L(final String className, final String s, final Class... original) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(s, "methodName");
        Intrinsics.checkNotNullParameter(original, "parameterTypes");
        try {
            final Class<?> forName = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(forName, "clazz");
            return K(forName, s, (Class[])Arrays.copyOf(original, original.length));
        }
        catch (ClassNotFoundException ex) {
            return null;
        }
    }
    
    public static final Locale N() {
        try {
            return B.l().getResources().getConfiguration().locale;
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static final Object O(final JSONObject jsonObject, final String s, final String s2) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Object o2;
        final Object o = o2 = jsonObject.opt(s);
        if (o != null) {
            o2 = o;
            if (o instanceof String) {
                o2 = new JSONTokener((String)o).nextValue();
            }
        }
        if (o2 == null || o2 instanceof JSONObject || o2 instanceof JSONArray) {
            return o2;
        }
        if (s2 != null) {
            final JSONObject jsonObject2 = new JSONObject();
            jsonObject2.putOpt(s2, o2);
            return jsonObject2;
        }
        throw new o("Got an unexpected non-JSON object.");
    }
    
    public static final Object T(Object invoke, final Method method, final Object... original) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(original, "args");
        try {
            invoke = method.invoke(invoke, Arrays.copyOf(original, original.length));
            return invoke;
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }
    
    public static final boolean U() {
        try {
            final Intent intent = new Intent("android.intent.action.VIEW");
            final x a = x.a;
            final String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[] { B.m() }, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            final Context l = B.l();
            final PackageManager packageManager = l.getPackageManager();
            final String packageName = l.getPackageName();
            final List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            final Iterator<ResolveInfo> iterator = queryIntentActivities.iterator();
            while (iterator.hasNext()) {
                if (Intrinsics.a(packageName, iterator.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    public static final boolean V(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = false;
        if (sdk_INT < 26) {
            return false;
        }
        final AutofillManager a = O1.K.a(context.getSystemService(J.a()));
        boolean b2 = b;
        if (a != null) {
            b2 = b;
            if (O1.L.a(a)) {
                b2 = b;
                if (M.a(a)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public static final boolean W(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build$VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        final String device = Build.DEVICE;
        if (device != null) {
            Intrinsics.checkNotNullExpressionValue(device, "DEVICE");
            if (new Regex(".+_cheets|cheets_.+").b(device)) {
                return true;
            }
        }
        return false;
    }
    
    public static final boolean X(final Uri uri) {
        return uri != null && kotlin.text.i.l("content", uri.getScheme(), true);
    }
    
    public static final boolean Y(final x1.a a) {
        return a != null && Intrinsics.a(a, x1.a.z.e());
    }
    
    public static final boolean Z() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     5: ifeq            10
        //     8: iconst_0       
        //     9: ireturn        
        //    10: invokestatic    O1/P.C:()Lorg/json/JSONObject;
        //    13: astore          4
        //    15: aload           4
        //    17: ifnonnull       22
        //    20: iconst_0       
        //    21: ireturn        
        //    22: aload           4
        //    24: ldc             "data_processing_options"
        //    26: invokevirtual   org/json/JSONObject.getJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
        //    29: astore          4
        //    31: aload           4
        //    33: invokevirtual   org/json/JSONArray.length:()I
        //    36: istore_2       
        //    37: iload_2        
        //    38: ifle            110
        //    41: iconst_0       
        //    42: istore_0       
        //    43: iload_0        
        //    44: iconst_1       
        //    45: iadd           
        //    46: istore_1       
        //    47: aload           4
        //    49: iload_0        
        //    50: invokevirtual   org/json/JSONArray.getString:(I)Ljava/lang/String;
        //    53: astore          5
        //    55: aload           5
        //    57: ldc_w           "options.getString(i)"
        //    60: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    63: aload           5
        //    65: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //    68: astore          5
        //    70: aload           5
        //    72: ldc_w           "(this as java.lang.String).toLowerCase()"
        //    75: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    78: aload           5
        //    80: ldc_w           "ldu"
        //    83: invokestatic    kotlin/jvm/internal/Intrinsics.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    86: istore_3       
        //    87: iload_3        
        //    88: ifeq            93
        //    91: iconst_1       
        //    92: ireturn        
        //    93: iload_1        
        //    94: iload_2        
        //    95: if_icmplt       100
        //    98: iconst_0       
        //    99: ireturn        
        //   100: iload_1        
        //   101: istore_0       
        //   102: goto            43
        //   105: astore          4
        //   107: goto            112
        //   110: iconst_0       
        //   111: ireturn        
        //   112: aload           4
        //   114: ldc             LO1/P;.class
        //   116: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   119: iconst_0       
        //   120: ireturn        
        //   121: astore          4
        //   123: iconst_0       
        //   124: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  10     15     105    110    Any
        //  22     37     121    125    Ljava/lang/Exception;
        //  22     37     105    110    Any
        //  47     87     121    125    Ljava/lang/Exception;
        //  47     87     105    110    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0022:
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
    
    public static final boolean a0(final Uri uri) {
        return uri != null && kotlin.text.i.l("file", uri.getScheme(), true);
    }
    
    public static final boolean c0(final String s) {
        return s == null || s.length() == 0;
    }
    
    public static final boolean d0(final Collection collection) {
        return collection == null || collection.isEmpty();
    }
    
    public static final boolean e(final Object o, final Object o2) {
        if (o == null) {
            return o2 == null;
        }
        return Intrinsics.a(o, o2);
    }
    
    public static final boolean e0(final Uri uri) {
        if (uri != null) {
            final String scheme = uri.getScheme();
            boolean b = true;
            if (kotlin.text.i.l("http", scheme, true)) {
                return b;
            }
            b = b;
            if (kotlin.text.i.l("https", uri.getScheme(), true)) {
                return b;
            }
            if (kotlin.text.i.l("fbstaging", uri.getScheme(), true)) {
                return true;
            }
        }
        return false;
    }
    
    public static final JSONObject f(final String s) {
        Intrinsics.checkNotNullParameter(s, "accessToken");
        final JSONObject a = G.a(s);
        if (a != null) {
            return a;
        }
        final K k = P.a.F(s).k();
        if (k.b() != null) {
            return null;
        }
        return k.d();
    }
    
    public static final Set f0(final JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        final HashSet<String> set = new HashSet<String>();
        final int length = jsonArray.length();
        if (length > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                final String string = jsonArray.getString(n);
                Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                set.add(string);
                if (n2 >= length) {
                    break;
                }
                n = n2;
            }
            return set;
        }
        return set;
    }
    
    public static final Uri g(final String s, String s2, final Bundle bundle) {
        final Uri$Builder uri$Builder = new Uri$Builder();
        uri$Builder.scheme("https");
        uri$Builder.authority(s);
        uri$Builder.path(s2);
        if (bundle != null) {
            final Iterator<String> iterator = ((BaseBundle)bundle).keySet().iterator();
            while (iterator.hasNext()) {
                s2 = iterator.next();
                final Object value = ((BaseBundle)bundle).get(s2);
                if (value instanceof String) {
                    uri$Builder.appendQueryParameter(s2, (String)value);
                }
            }
        }
        final Uri build = uri$Builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }
    
    public static final List g0(final JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        final ArrayList<String> list = new ArrayList<String>();
        final int length = jsonArray.length();
        if (length > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                list.add(jsonArray.getString(n));
                if (n2 >= length) {
                    break;
                }
                n = n2;
            }
            return list;
        }
        return list;
    }
    
    public static final Map h0(final String s) {
        Intrinsics.checkNotNullParameter(s, "str");
        if (s.length() == 0) {
            return new HashMap();
        }
        try {
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            final JSONObject jsonObject = new JSONObject(s);
            final Iterator keys = jsonObject.keys();
            while (keys.hasNext()) {
                final String s2 = keys.next();
                Intrinsics.checkNotNullExpressionValue(s2, "key");
                final String string = jsonObject.getString(s2);
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                hashMap.put(s2, string);
            }
            return hashMap;
        }
        catch (JSONException ex) {
            return new HashMap();
        }
    }
    
    public static final void i(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            final P a = P.a;
            a.h(context, "facebook.com");
            a.h(context, ".facebook.com");
            a.h(context, "https://facebook.com");
            a.h(context, "https://.facebook.com");
        }
        catch (Exception ex) {}
    }
    
    public static final void i0(final String s, final Exception ex) {
        if (B.D() && s != null && ex != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(ex.getClass().getSimpleName());
            sb.append(": ");
            sb.append((Object)ex.getMessage());
            Log.d(s, sb.toString());
        }
    }
    
    public static final void j(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (IOException ex) {}
    }
    
    public static final void j0(final String s, final String s2) {
        if (B.D() && s != null && s2 != null) {
            Log.d(s, s2);
        }
    }
    
    public static final String k(final String s, final String s2) {
        String s3 = s;
        if (c0(s)) {
            s3 = s2;
        }
        return s3;
    }
    
    public static final void k0(final String s, final String s2, final Throwable t) {
        if (B.D() && !c0(s)) {
            Log.d(s, s2, t);
        }
    }
    
    public static final String l0(final Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        final boolean empty = map.isEmpty();
        final String s = "";
        if (empty) {
            return "";
        }
        while (true) {
            try {
                final JSONObject jsonObject = new JSONObject();
                for (final Map.Entry<String, V> entry : map.entrySet()) {
                    jsonObject.put((String)entry.getKey(), (Object)entry.getValue());
                }
                final String string = jsonObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
                return string;
            }
            catch (JSONException ex) {
                final String string = s;
                continue;
            }
            break;
        }
    }
    
    public static final List m(final JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        while (true) {
            try {
                final ArrayList<String> list = new ArrayList<String>();
                final int length = jsonArray.length();
                ArrayList<String> list2 = list;
                if (length > 0) {
                    int n = 0;
                    while (true) {
                        final int n2 = n + 1;
                        final String string = jsonArray.getString(n);
                        Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                        list.add(string);
                        if (n2 >= length) {
                            break;
                        }
                        n = n2;
                    }
                    return list;
                }
                return list2;
                list2 = new ArrayList<String>();
                return list2;
            }
            catch (JSONException ex) {}
            continue;
        }
    }
    
    public static final String m0(final String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        return P.a.R("MD5", s);
    }
    
    public static final Map n(final JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        final JSONArray names = jsonObject.names();
        if (names == null) {
            return hashMap;
        }
        final int length = names.length();
        if (length <= 0) {
            return hashMap;
        }
        int n = 0;
    Label_0112_Outer:
        while (true) {
            final int n2 = n + 1;
            while (true) {
                try {
                    final String string = names.getString(n);
                    Intrinsics.checkNotNullExpressionValue(string, "keys.getString(i)");
                    Object o2;
                    final Object o = o2 = jsonObject.get(string);
                    if (o instanceof JSONObject) {
                        o2 = n((JSONObject)o);
                    }
                    Intrinsics.checkNotNullExpressionValue(o2, "value");
                    hashMap.put(string, o2);
                    if (n2 >= length) {
                        return hashMap;
                    }
                    n = n2;
                    continue Label_0112_Outer;
                }
                catch (JSONException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public static final boolean n0(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return V(context);
    }
    
    public static final Map o(final JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final Iterator keys = jsonObject.keys();
        while (keys.hasNext()) {
            final String s = keys.next();
            final String optString = jsonObject.optString(s);
            if (optString != null) {
                Intrinsics.checkNotNullExpressionValue(s, "key");
                hashMap.put(s, optString);
            }
        }
        return hashMap;
    }
    
    public static final Bundle o0(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   android/os/Bundle.<init>:()V
        //     7: astore          4
        //     9: aload_0        
        //    10: invokestatic    O1/P.c0:(Ljava/lang/String;)Z
        //    13: ifne            245
        //    16: aload_0        
        //    17: ifnull          231
        //    20: aload_0        
        //    21: iconst_1       
        //    22: anewarray       Ljava/lang/String;
        //    25: dup            
        //    26: iconst_0       
        //    27: ldc_w           "&"
        //    30: aastore        
        //    31: iconst_0       
        //    32: iconst_0       
        //    33: bipush          6
        //    35: aconst_null    
        //    36: invokestatic    kotlin/text/i.V:(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
        //    39: checkcast       Ljava/util/Collection;
        //    42: iconst_0       
        //    43: anewarray       Ljava/lang/String;
        //    46: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //    51: astore_0       
        //    52: aload_0        
        //    53: ifnull          220
        //    56: aload_0        
        //    57: checkcast       [Ljava/lang/String;
        //    60: astore_0       
        //    61: aload_0        
        //    62: arraylength    
        //    63: istore_3       
        //    64: iconst_0       
        //    65: istore_1       
        //    66: iload_1        
        //    67: iload_3        
        //    68: if_icmpge       245
        //    71: aload_0        
        //    72: iload_1        
        //    73: aaload         
        //    74: astore          5
        //    76: iload_1        
        //    77: iconst_1       
        //    78: iadd           
        //    79: istore_2       
        //    80: aload           5
        //    82: iconst_1       
        //    83: anewarray       Ljava/lang/String;
        //    86: dup            
        //    87: iconst_0       
        //    88: ldc_w           "="
        //    91: aastore        
        //    92: iconst_0       
        //    93: iconst_0       
        //    94: bipush          6
        //    96: aconst_null    
        //    97: invokestatic    kotlin/text/i.V:(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
        //   100: checkcast       Ljava/util/Collection;
        //   103: iconst_0       
        //   104: anewarray       Ljava/lang/String;
        //   107: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   112: astore          5
        //   114: aload           5
        //   116: ifnull          209
        //   119: aload           5
        //   121: checkcast       [Ljava/lang/String;
        //   124: astore          5
        //   126: aload           5
        //   128: arraylength    
        //   129: istore_1       
        //   130: iload_1        
        //   131: iconst_2       
        //   132: if_icmpne       165
        //   135: aload           4
        //   137: aload           5
        //   139: iconst_0       
        //   140: aaload         
        //   141: ldc_w           "UTF-8"
        //   144: invokestatic    java/net/URLDecoder.decode:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   147: aload           5
        //   149: iconst_1       
        //   150: aaload         
        //   151: ldc_w           "UTF-8"
        //   154: invokestatic    java/net/URLDecoder.decode:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   157: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   160: iload_2        
        //   161: istore_1       
        //   162: goto            66
        //   165: iload_2        
        //   166: istore_1       
        //   167: aload           5
        //   169: arraylength    
        //   170: iconst_1       
        //   171: if_icmpne       66
        //   174: aload           4
        //   176: aload           5
        //   178: iconst_0       
        //   179: aaload         
        //   180: ldc_w           "UTF-8"
        //   183: invokestatic    java/net/URLDecoder.decode:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   186: ldc             ""
        //   188: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   191: iload_2        
        //   192: istore_1       
        //   193: goto            66
        //   196: ldc_w           "FacebookSDK"
        //   199: aload           5
        //   201: invokestatic    O1/P.i0:(Ljava/lang/String;Ljava/lang/Exception;)V
        //   204: iload_2        
        //   205: istore_1       
        //   206: goto            66
        //   209: new             Ljava/lang/NullPointerException;
        //   212: dup            
        //   213: ldc_w           "null cannot be cast to non-null type kotlin.Array<T>"
        //   216: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   219: athrow         
        //   220: new             Ljava/lang/NullPointerException;
        //   223: dup            
        //   224: ldc_w           "null cannot be cast to non-null type kotlin.Array<T>"
        //   227: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   230: athrow         
        //   231: new             Ljava/lang/IllegalStateException;
        //   234: dup            
        //   235: ldc_w           "Required value was null."
        //   238: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   241: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   244: athrow         
        //   245: aload           4
        //   247: areturn        
        //   248: astore          5
        //   250: goto            196
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  126    130    248    209    Ljava/io/UnsupportedEncodingException;
        //  135    160    248    209    Ljava/io/UnsupportedEncodingException;
        //  167    191    248    209    Ljava/io/UnsupportedEncodingException;
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
    
    public static final int p(final InputStream in, final OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        final BufferedInputStream bufferedInputStream = null;
        BufferedInputStream bufferedInputStream4 = null;
        Label_0091: {
            try {
                final BufferedInputStream bufferedInputStream2 = new BufferedInputStream(in);
                int n;
                try {
                    final byte[] array = new byte[8192];
                    n = 0;
                    while (true) {
                        final int read = bufferedInputStream2.read(array);
                        if (read == -1) {
                            break;
                        }
                        outputStream.write(array, 0, read);
                        n += read;
                    }
                }
                finally {
                    break Label_0091;
                }
                final BufferedInputStream bufferedInputStream3;
                bufferedInputStream3.close();
                if (in == null) {
                    return n;
                }
                in.close();
                return n;
            }
            finally {
                bufferedInputStream4 = bufferedInputStream;
            }
        }
        if (bufferedInputStream4 != null) {
            bufferedInputStream4.close();
        }
        if (in != null) {
            in.close();
        }
    }
    
    public static final boolean p0(final Bundle bundle, final String s, final Object o) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (o == null) {
            bundle.remove(s);
        }
        else if (o instanceof Boolean) {
            ((BaseBundle)bundle).putBoolean(s, (boolean)o);
        }
        else if (o instanceof boolean[]) {
            ((BaseBundle)bundle).putBooleanArray(s, (boolean[])o);
        }
        else if (o instanceof Double) {
            ((BaseBundle)bundle).putDouble(s, ((Number)o).doubleValue());
        }
        else if (o instanceof double[]) {
            ((BaseBundle)bundle).putDoubleArray(s, (double[])o);
        }
        else if (o instanceof Integer) {
            ((BaseBundle)bundle).putInt(s, ((Number)o).intValue());
        }
        else if (o instanceof int[]) {
            ((BaseBundle)bundle).putIntArray(s, (int[])o);
        }
        else if (o instanceof Long) {
            ((BaseBundle)bundle).putLong(s, ((Number)o).longValue());
        }
        else if (o instanceof long[]) {
            ((BaseBundle)bundle).putLongArray(s, (long[])o);
        }
        else {
            String s2;
            if (o instanceof String) {
                s2 = (String)o;
            }
            else if (o instanceof JSONArray) {
                s2 = ((JSONArray)o).toString();
            }
            else {
                if (!(o instanceof JSONObject)) {
                    return false;
                }
                s2 = ((JSONObject)o).toString();
            }
            ((BaseBundle)bundle).putString(s, s2);
        }
        return true;
    }
    
    public static final void q(final URLConnection urlConnection) {
        if (urlConnection != null && urlConnection instanceof HttpURLConnection) {
            ((HttpURLConnection)urlConnection).disconnect();
        }
    }
    
    public static final void q0(final Bundle bundle, final String s, final String s2) {
        Intrinsics.checkNotNullParameter(bundle, "b");
        if (!c0(s2)) {
            ((BaseBundle)bundle).putString(s, s2);
        }
    }
    
    public static final Map r0(final Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        final int int1 = parcel.readInt();
        if (int1 < 0) {
            return null;
        }
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        if (int1 > 0) {
            int n = 0;
            int n2;
            do {
                n2 = n + 1;
                final String string = parcel.readString();
                final String string2 = parcel.readString();
                if (string != null && string2 != null) {
                    hashMap.put(string, string2);
                }
            } while ((n = n2) < int1);
        }
        return hashMap;
    }
    
    public static final String s(final int n) {
        final String string = new BigInteger(n * 5, new Random()).toString(32);
        Intrinsics.checkNotNullExpressionValue(string, "BigInteger(length * 5, r).toString(32)");
        return string;
    }
    
    public static final String s0(final InputStream p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //     8: astore_3       
        //     9: new             Ljava/io/InputStreamReader;
        //    12: dup            
        //    13: aload_3        
        //    14: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    17: astore_2       
        //    18: new             Ljava/lang/StringBuilder;
        //    21: dup            
        //    22: invokespecial   java/lang/StringBuilder.<init>:()V
        //    25: astore_0       
        //    26: sipush          2048
        //    29: newarray        C
        //    31: astore          4
        //    33: aload_2        
        //    34: aload           4
        //    36: invokevirtual   java/io/Reader.read:([C)I
        //    39: istore_1       
        //    40: iload_1        
        //    41: iconst_m1      
        //    42: if_icmpeq       57
        //    45: aload_0        
        //    46: aload           4
        //    48: iconst_0       
        //    49: iload_1        
        //    50: invokevirtual   java/lang/StringBuilder.append:([CII)Ljava/lang/StringBuilder;
        //    53: pop            
        //    54: goto            33
        //    57: aload_0        
        //    58: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    61: astore_0       
        //    62: aload_0        
        //    63: ldc_w           "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }"
        //    66: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    69: aload_3        
        //    70: invokestatic    O1/P.j:(Ljava/io/Closeable;)V
        //    73: aload_2        
        //    74: invokestatic    O1/P.j:(Ljava/io/Closeable;)V
        //    77: aload_0        
        //    78: areturn        
        //    79: astore_0       
        //    80: aconst_null    
        //    81: astore_2       
        //    82: goto            90
        //    85: astore_0       
        //    86: aconst_null    
        //    87: astore_3       
        //    88: aload_3        
        //    89: astore_2       
        //    90: aload_3        
        //    91: invokestatic    O1/P.j:(Ljava/io/Closeable;)V
        //    94: aload_2        
        //    95: invokestatic    O1/P.j:(Ljava/io/Closeable;)V
        //    98: aload_0        
        //    99: athrow         
        //   100: astore_0       
        //   101: goto            90
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      9      85     90     Any
        //  9      18     79     85     Any
        //  18     33     100    104    Any
        //  33     40     100    104    Any
        //  45     54     100    104    Any
        //  57     69     100    104    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0033:
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
    
    public static final String t(final Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        final String simpleName = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }
    
    public static final Map t0(final Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        final int int1 = parcel.readInt();
        if (int1 < 0) {
            return null;
        }
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        if (int1 > 0) {
            int n = 0;
            int n2;
            do {
                n2 = n + 1;
                hashMap.put(parcel.readString(), parcel.readString());
            } while ((n = n2) < int1);
        }
        return hashMap;
    }
    
    public static final String u(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            final String n = B.n();
            if (n != null) {
                return n;
            }
            final ApplicationInfo applicationInfo = context.getApplicationInfo();
            final int labelRes = applicationInfo.labelRes;
            if (labelRes == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            final String string = context.getString(labelRes);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringId)");
            return string;
        }
        catch (Exception ex) {
            return "";
        }
    }
    
    public static final String v() {
        final Context l = B.l();
        if (l == null) {
            return null;
        }
        final String packageName = l.getPackageName();
        try {
            final PackageInfo packageInfo = l.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public static final boolean w0(final File file, final String input) {
        return Pattern.matches("cpu[0-9]+", input);
    }
    
    public static final Date x(final Bundle bundle, final String s, final Date date) {
        Intrinsics.checkNotNullParameter(date, "dateBase");
        if (bundle == null) {
            return null;
        }
        final Object value = ((BaseBundle)bundle).get(s);
        Label_0052: {
            if (value instanceof Long) {
                final long n = ((Number)value).longValue();
                break Label_0052;
            }
            Label_0087: {
                if (!(value instanceof String)) {
                    break Label_0087;
                }
                try {
                    final long n = Long.parseLong((String)value);
                    if (n == 0L) {
                        return new Date(Long.MAX_VALUE);
                    }
                    return new Date(date.getTime() + n * 1000L);
                    return null;
                }
                catch (NumberFormatException ex) {
                    return null;
                }
            }
        }
    }
    
    public static final long z(final Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "contentUri");
        Cursor cursor = null;
        try {
            final Cursor query = B.l().getContentResolver().query(uri, (String[])null, (String)null, (String[])null, (String)null);
            if (query == null) {
                return 0L;
            }
            cursor = query;
            final int columnIndex = query.getColumnIndex("_size");
            cursor = query;
            query.moveToFirst();
            cursor = query;
            final long long1 = query.getLong(columnIndex);
            query.close();
            return long1;
        }
        finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
    
    public final void A0() {
        try {
            if (this.r()) {
                final StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                P.d = statFs.getBlockCount() * (long)statFs.getBlockSize();
            }
            P.d = this.l((double)P.d);
        }
        catch (Exception ex) {}
    }
    
    public final String B() {
        final x1.a e = x1.a.z.e();
        if (e != null && e.h() != null) {
            return e.h();
        }
        return "facebook";
    }
    
    public final String D() {
        return P.g;
    }
    
    public final F F(final String s) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("fields", this.M(this.B()));
        ((BaseBundle)bundle).putString("access_token", s);
        final F y = F.n.y(null, null);
        y.G(bundle);
        y.F(x1.L.o);
        return y;
    }
    
    public final Locale I() {
        return P.j;
    }
    
    public final String M(final String s) {
        if (Intrinsics.a(s, "instagram")) {
            return "id,name,profile_picture";
        }
        return "id,name,first_name,middle_name,last_name";
    }
    
    public final String P() {
        return P.i;
    }
    
    public final String Q(final MessageDigest messageDigest, final byte[] input) {
        messageDigest.update(input);
        final byte[] digest = messageDigest.digest();
        final StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNullExpressionValue(digest, "digest");
        final int length = digest.length;
        int i = 0;
        while (i < length) {
            final byte b = digest[i];
            ++i;
            sb.append(Integer.toHexString(b >> 4 & 0xF));
            sb.append(Integer.toHexString(b & 0xF));
        }
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }
    
    public final String R(final String s, final String s2) {
        final Charset b = kotlin.text.b.b;
        if (s2 != null) {
            final byte[] bytes = s2.getBytes(b);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return this.S(s, bytes);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
    
    public final String S(final String algorithm, final byte[] array) {
        try {
            final MessageDigest instance = MessageDigest.getInstance(algorithm);
            Intrinsics.checkNotNullExpressionValue(instance, "hash");
            return this.Q(instance, array);
        }
        catch (NoSuchAlgorithmException ex) {
            return null;
        }
    }
    
    public final boolean b0(final Context context) {
        final Method l = L("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (l == null) {
            return false;
        }
        final Object t = T(null, l, context);
        return t instanceof Integer && Intrinsics.a(t, 0);
    }
    
    public final void c(final JSONObject jsonObject, final O1.a a, final String s, final Context context) {
        if (Build$VERSION.SDK_INT < 31 || !this.b0(context) || !a.k()) {
            jsonObject.put("anon_id", (Object)s);
        }
    }
    
    public final void d(final JSONObject jsonObject, final O1.a a, final Context context) {
        if (Build$VERSION.SDK_INT < 31 || !this.b0(context) || !a.k()) {
            jsonObject.put("attribution", (Object)a.j());
        }
    }
    
    public final void h(final Context context, final String s) {
        CookieSyncManager.createInstance(context).sync();
        final CookieManager instance = CookieManager.getInstance();
        final String cookie = instance.getCookie(s);
        if (cookie == null) {
            return;
        }
        final Object[] array = kotlin.text.i.V(cookie, new String[] { ";" }, false, 0, 6, null).toArray(new String[0]);
        if (array != null) {
            final String[] array2 = (String[])array;
            final int length = array2.length;
            int i = 0;
            while (i < length) {
                final String s2 = array2[i];
                final int n = i + 1;
                final Object[] array3 = kotlin.text.i.V(s2, new String[] { "=" }, false, 0, 6, null).toArray(new String[0]);
                if (array3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                final String[] array4 = (String[])array3;
                i = n;
                if (array4.length <= 0) {
                    continue;
                }
                final String s3 = array4[0];
                int n2 = s3.length() - 1;
                int n3;
                int j = n3 = 0;
                while (j <= n2) {
                    int n4;
                    if (n3 == 0) {
                        n4 = j;
                    }
                    else {
                        n4 = n2;
                    }
                    final boolean b = Intrinsics.d(s3.charAt(n4), 32) <= 0;
                    if (n3 == 0) {
                        if (!b) {
                            n3 = 1;
                        }
                        else {
                            ++j;
                        }
                    }
                    else {
                        if (!b) {
                            break;
                        }
                        --n2;
                    }
                }
                instance.setCookie(s, Intrinsics.i(s3.subSequence(j, n2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
                i = n;
            }
            instance.removeExpiredCookie();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
    
    public final long l(final double n) {
        return Math.round(n / 1.073741824E9);
    }
    
    public final boolean r() {
        return Intrinsics.a("mounted", Environment.getExternalStorageState());
    }
    
    public final void u0() {
        try {
            if (this.r()) {
                final StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                P.e = statFs.getAvailableBlocks() * (long)statFs.getBlockSize();
            }
            P.e = this.l((double)P.e);
        }
        catch (Exception ex) {}
    }
    
    public final int v0() {
        final int b = P.b;
        if (b > 0) {
            return b;
        }
        while (true) {
            try {
                final File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new O());
                if (listFiles != null) {
                    P.b = listFiles.length;
                }
                if (P.b <= 0) {
                    P.b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
                }
                return P.b;
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public final long w() {
        return P.e;
    }
    
    public final void x0(final Context context) {
        if (!Intrinsics.a(P.h, "NoCarrier")) {
            return;
        }
        try {
            final Object systemService = context.getSystemService("phone");
            if (systemService != null) {
                final String networkOperatorName = ((TelephonyManager)systemService).getNetworkOperatorName();
                Intrinsics.checkNotNullExpressionValue(networkOperatorName, "telephonyManager.networkOperatorName");
                P.h = networkOperatorName;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        }
        catch (Exception ex) {}
    }
    
    public final String y() {
        return P.h;
    }
    
    public final void y0(final Context context) {
        if (P.c == -1L || System.currentTimeMillis() - P.c >= 1800000L) {
            P.c = System.currentTimeMillis();
            this.z0();
            this.x0(context);
            this.A0();
            this.u0();
        }
    }
    
    public final void z0() {
        try {
            final TimeZone default1 = TimeZone.getDefault();
            final String displayName = default1.getDisplayName(default1.inDaylightTime(new Date()), 0);
            Intrinsics.checkNotNullExpressionValue(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            P.f = displayName;
            final String id = default1.getID();
            Intrinsics.checkNotNullExpressionValue(id, "tz.id");
            P.g = id;
        }
        catch (AssertionError | Exception assertionError) {}
    }
    
    public interface a
    {
        void a(final JSONObject p0);
        
        void b(final o p0);
    }
}
