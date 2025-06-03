// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import W5.m;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import android.os.Process;
import android.content.Intent;
import android.annotation.SuppressLint;
import android.content.pm.Signature;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Iterator;
import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import android.net.Uri;
import java.util.Map;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import com.appsflyer.AFLogger;
import android.os.Build$VERSION;
import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class AFa1fSDK implements AFc1vSDK
{
    @NotNull
    private final AFb1bSDK valueOf;
    
    public AFa1fSDK() {
    }
    
    public AFa1fSDK(final AFb1bSDK valueOf) {
        Intrinsics.checkNotNullParameter(valueOf, "");
        this.valueOf = valueOf;
    }
    
    private File AFInAppEventParameterName() {
        final Context afInAppEventType = this.valueOf.AFInAppEventType;
        if (afInAppEventType != null) {
            final File file = new File(afInAppEventType.getFilesDir(), "AFExceptionsCache");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
        return null;
    }
    
    public static long AFInAppEventType(final Context context, final String s) {
        while (true) {
            try {
                final PackageInfo packageInfo = context.getPackageManager().getPackageInfo(s, 0);
                if (Build$VERSION.SDK_INT >= 28) {
                    return g.a(packageInfo);
                }
                return packageInfo.versionCode;
                final PackageManager$NameNotFoundException ex;
                AFLogger.afErrorLog(((Throwable)ex).getMessage(), (Throwable)ex);
                return 0L;
            }
            catch (PackageManager$NameNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    public static Map<String, String> AFInAppEventType(final Context context, final Map<String, String> map, final Uri uri) {
        final Iterator iterator = uri.getQueryParameterNames().iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            String s = "media_source";
            int n = 0;
            if (!hasNext) {
                break;
            }
            final String s2 = iterator.next();
            final String queryParameter = uri.getQueryParameter(s2);
            Label_0173: {
                if (!map.containsKey(s2)) {
                    final int hashCode = s2.hashCode();
                    Label_0138: {
                        if (hashCode != -1420799080) {
                            if (hashCode != 99) {
                                if (hashCode == 110987) {
                                    if (s2.equals("pid")) {
                                        n = 1;
                                        break Label_0138;
                                    }
                                }
                            }
                            else if (s2.equals("c")) {
                                break Label_0138;
                            }
                        }
                        else if (s2.equals("af_prt")) {
                            n = 2;
                            break Label_0138;
                        }
                        n = -1;
                    }
                    if (n == 0) {
                        s = "campaign";
                        break Label_0173;
                    }
                    if (n == 1) {
                        break Label_0173;
                    }
                    if (n == 2) {
                        s = "agency";
                        break Label_0173;
                    }
                }
                s = s2;
            }
            map.put(s, queryParameter);
        }
        try {
            if (!map.containsKey("install_time")) {
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                final long firstInstallTime = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                map.put("install_time", simpleDateFormat.format(new Date(firstInstallTime)));
            }
        }
        catch (Exception ex) {
            AFLogger.afErrorLog("Could not fetch install time. ", ex);
        }
        if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
            map.put("af_status", "Non-organic");
        }
        if (map.containsKey("agency")) {
            map.remove("media_source");
        }
        final String path = uri.getPath();
        if (path != null) {
            map.put("path", path);
        }
        final String scheme = uri.getScheme();
        if (scheme != null) {
            map.put("scheme", scheme);
        }
        final String host = uri.getHost();
        if (host != null) {
            map.put("host", host);
        }
        return map;
    }
    
    public static String AFKeystoreWrapper(final Context context, final String s) {
        try {
            return context.getPackageManager().getPackageInfo(s, 0).versionName;
        }
        catch (PackageManager$NameNotFoundException ex) {
            AFLogger.afErrorLog(((Throwable)ex).getMessage(), (Throwable)ex);
            return "";
        }
    }
    
    private File afDebugLog() {
        final File afInAppEventParameterName = this.AFInAppEventParameterName();
        if (afInAppEventParameterName != null) {
            final File file = new File(afInAppEventParameterName, "6.12.2");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
        return null;
    }
    
    public static boolean valueOf() {
        return Build.BRAND.equals("OPPO");
    }
    
    @SuppressLint({ "PackageManagerGetSignatures" })
    public static String values(final PackageManager packageManager, final String s) {
        final Signature[] signatures = packageManager.getPackageInfo(s, 64).signatures;
        if (signatures == null) {
            return null;
        }
        final X509Certificate x509Certificate = (X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatures[0].toByteArray()));
        final MessageDigest instance = MessageDigest.getInstance("SHA256");
        instance.update(x509Certificate.getEncoded());
        return String.format("%032X", new BigInteger(1, instance.digest()));
    }
    
    public static boolean values(final Context context, final Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }
    
    public static boolean values(final Context context, final String str) {
        final int checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        final StringBuilder sb = new StringBuilder("is Permission Available: ");
        sb.append(str);
        sb.append("; res: ");
        sb.append(checkPermission);
        AFLogger.afRDLog(sb.toString());
        return checkPermission == 0;
    }
    
    @Override
    public final boolean AFInAppEventParameterName(final String... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             ""
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0        
        //     7: monitorenter   
        //     8: aload_0        
        //     9: invokespecial   com/appsflyer/internal/AFa1fSDK.AFInAppEventParameterName:()Ljava/io/File;
        //    12: astore          6
        //    14: iconst_1       
        //    15: istore          5
        //    17: iload           5
        //    19: istore          4
        //    21: aload           6
        //    23: ifnull          330
        //    26: aload_1        
        //    27: arraylength    
        //    28: ifne            61
        //    31: ldc_w           "delete all exceptions"
        //    34: ldc             ""
        //    36: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    39: ldc_w           "[Exception Manager]: "
        //    42: ldc_w           "delete all exceptions"
        //    45: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    48: invokestatic    com/appsflyer/AFLogger.afRDLog:(Ljava/lang/String;)V
        //    51: aload           6
        //    53: invokestatic    e6/g.j:(Ljava/io/File;)Z
        //    56: istore          4
        //    58: goto            330
        //    61: new             Ljava/lang/StringBuilder;
        //    64: dup            
        //    65: ldc_w           "delete all exceptions except for: "
        //    68: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    71: astore          7
        //    73: aload           7
        //    75: aload_1        
        //    76: ldc_w           ", "
        //    79: aconst_null    
        //    80: aconst_null    
        //    81: iconst_0       
        //    82: aconst_null    
        //    83: aconst_null    
        //    84: bipush          62
        //    86: aconst_null    
        //    87: invokestatic    W5/g.p:([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lg6/l;ILjava/lang/Object;)Ljava/lang/String;
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: pop            
        //    94: aload           7
        //    96: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    99: astore          7
        //   101: aload           7
        //   103: ldc             ""
        //   105: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //   108: ldc_w           "[Exception Manager]: "
        //   111: aload           7
        //   113: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   116: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   119: invokestatic    com/appsflyer/AFLogger.afRDLog:(Ljava/lang/String;)V
        //   122: aload           6
        //   124: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //   127: astore          7
        //   129: iload           5
        //   131: istore          4
        //   133: aload           7
        //   135: ifnull          330
        //   138: aload           7
        //   140: ldc             ""
        //   142: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   145: new             Ljava/util/ArrayList;
        //   148: dup            
        //   149: invokespecial   java/util/ArrayList.<init>:()V
        //   152: astore          6
        //   154: aload           7
        //   156: arraylength    
        //   157: istore_3       
        //   158: iconst_0       
        //   159: istore_2       
        //   160: iload_2        
        //   161: iload_3        
        //   162: if_icmpge       196
        //   165: aload           7
        //   167: iload_2        
        //   168: aaload         
        //   169: astore          8
        //   171: aload_1        
        //   172: aload           8
        //   174: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   177: invokestatic    W5/g.h:([Ljava/lang/Object;Ljava/lang/Object;)Z
        //   180: ifne            343
        //   183: aload           6
        //   185: aload           8
        //   187: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   192: pop            
        //   193: goto            343
        //   196: new             Ljava/util/ArrayList;
        //   199: dup            
        //   200: aload           6
        //   202: bipush          10
        //   204: invokestatic    W5/m.l:(Ljava/lang/Iterable;I)I
        //   207: invokespecial   java/util/ArrayList.<init>:(I)V
        //   210: astore_1       
        //   211: aload           6
        //   213: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   218: astore          6
        //   220: aload           6
        //   222: invokeinterface java/util/Iterator.hasNext:()Z
        //   227: ifeq            267
        //   230: aload           6
        //   232: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   237: checkcast       Ljava/io/File;
        //   240: astore          7
        //   242: aload           7
        //   244: ldc             ""
        //   246: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   249: aload_1        
        //   250: aload           7
        //   252: invokestatic    e6/g.j:(Ljava/io/File;)Z
        //   255: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   258: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   263: pop            
        //   264: goto            220
        //   267: aload_1        
        //   268: invokestatic    W5/m.J:(Ljava/lang/Iterable;)Ljava/util/Set;
        //   271: astore          6
        //   273: aload           6
        //   275: astore_1       
        //   276: aload           6
        //   278: invokeinterface java/util/Collection.isEmpty:()Z
        //   283: ifeq            293
        //   286: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   289: invokestatic    W5/I.a:(Ljava/lang/Object;)Ljava/util/Set;
        //   292: astore_1       
        //   293: aload_1        
        //   294: invokeinterface java/util/Set.size:()I
        //   299: iconst_1       
        //   300: if_icmpne       327
        //   303: aload_1        
        //   304: invokestatic    W5/m.q:(Ljava/lang/Iterable;)Ljava/lang/Object;
        //   307: checkcast       Ljava/lang/Boolean;
        //   310: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   313: istore          4
        //   315: iload           4
        //   317: ifeq            327
        //   320: iload           5
        //   322: istore          4
        //   324: goto            330
        //   327: iconst_0       
        //   328: istore          4
        //   330: aload_0        
        //   331: monitorexit    
        //   332: iload           4
        //   334: ireturn        
        //   335: aload_0        
        //   336: monitorexit    
        //   337: aload_1        
        //   338: athrow         
        //   339: astore_1       
        //   340: goto            335
        //   343: iload_2        
        //   344: iconst_1       
        //   345: iadd           
        //   346: istore_2       
        //   347: goto            160
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  8      14     339    343    Any
        //  26     58     339    343    Any
        //  61     129    339    343    Any
        //  138    158    339    343    Any
        //  171    193    339    343    Any
        //  196    220    339    343    Any
        //  220    264    339    343    Any
        //  267    273    339    343    Any
        //  276    293    339    343    Any
        //  293    315    339    343    Any
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
    
    @Override
    public final int AFInAppEventType() {
        final Iterator<AFc1zSDK> iterator = this.AFKeystoreWrapper().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += iterator.next().valueOf;
        }
        return n;
    }
    
    @NotNull
    @Override
    public final List<AFc1zSDK> AFKeystoreWrapper() {
        // monitorenter(this)
        while (true) {
            try {
                final File afDebugLog = this.afDebugLog();
                ArrayList<AFc1zSDK> list2;
                final ArrayList<AFc1zSDK> list = list2 = null;
                Label_0175: {
                    if (afDebugLog != null) {
                        while (true) {
                            Label_0112: {
                                try {
                                    final File[] listFiles = afDebugLog.listFiles();
                                    if (listFiles != null) {
                                        Intrinsics.checkNotNullExpressionValue(listFiles, "");
                                        list2 = new ArrayList<AFc1zSDK>();
                                        final int length = listFiles.length;
                                        final int n = 0;
                                        if (n < length) {
                                            final File file = listFiles[n];
                                            final AFc1zSDK.AFa1xSDK afInAppEventParameterName = AFc1zSDK.AFInAppEventParameterName;
                                            Intrinsics.checkNotNullExpressionValue(file, "");
                                            final AFc1zSDK afInAppEventParameterName2 = AFc1zSDK.AFa1xSDK.AFInAppEventParameterName(e6.g.d(file, null, 1, null));
                                            if (afInAppEventParameterName2 != null) {
                                                list2.add(afInAppEventParameterName2);
                                            }
                                            break Label_0112;
                                        }
                                    }
                                }
                                finally {
                                    final StringBuilder sb = new StringBuilder("Could not get stored exceptions\n ");
                                    final Throwable t;
                                    sb.append(t.getMessage());
                                    final String string = sb.toString();
                                    Intrinsics.checkNotNullParameter(string, "");
                                    AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(string)));
                                    list2 = list;
                                    break Label_0175;
                                    final int n = n + 1;
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                }
                List<AFc1zSDK> f;
                if ((f = list2) == null) {
                    f = (List<AFc1zSDK>)m.f();
                }
                // monitorexit(this)
                return f;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final String values(final Throwable p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             ""
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2        
        //     7: ldc             ""
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0        
        //    13: monitorenter   
        //    14: aload_0        
        //    15: invokespecial   com/appsflyer/internal/AFa1fSDK.afDebugLog:()Ljava/io/File;
        //    18: astore          5
        //    20: aconst_null    
        //    21: astore          4
        //    23: aload           4
        //    25: astore_3       
        //    26: aload           5
        //    28: ifnull          407
        //    31: aload_1        
        //    32: ldc             ""
        //    34: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    37: aload_2        
        //    38: ldc             ""
        //    40: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    43: new             Ljava/lang/StringBuilder;
        //    46: dup            
        //    47: invokespecial   java/lang/StringBuilder.<init>:()V
        //    50: astore_3       
        //    51: aload_1        
        //    52: ldc             ""
        //    54: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    57: aload_1        
        //    58: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    61: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    64: astore          6
        //    66: aload           6
        //    68: ldc             ""
        //    70: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    73: aload_3        
        //    74: aload           6
        //    76: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    79: pop            
        //    80: aload_3        
        //    81: ldc_w           ": "
        //    84: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    87: pop            
        //    88: aload_3        
        //    89: aload_2        
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: pop            
        //    94: aload_3        
        //    95: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    98: astore_2       
        //    99: aload_1        
        //   100: ldc             ""
        //   102: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //   105: aload_1        
        //   106: ldc             ""
        //   108: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //   111: new             Ljava/lang/StringBuilder;
        //   114: dup            
        //   115: invokespecial   java/lang/StringBuilder.<init>:()V
        //   118: astore_3       
        //   119: aload_3        
        //   120: aload_1        
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   124: pop            
        //   125: aload_3        
        //   126: bipush          10
        //   128: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   131: pop            
        //   132: aload_3        
        //   133: aload_1        
        //   134: invokestatic    com/appsflyer/internal/AFc1nSDK.AFInAppEventParameterName:(Ljava/lang/Throwable;)Ljava/util/List;
        //   137: checkcast       Ljava/lang/Iterable;
        //   140: ldc_w           "\n"
        //   143: aconst_null    
        //   144: aconst_null    
        //   145: iconst_0       
        //   146: aconst_null    
        //   147: getstatic       com/appsflyer/internal/AFc1nSDK$AFa1wSDK.AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1nSDK$AFa1wSDK;
        //   150: bipush          30
        //   152: aconst_null    
        //   153: invokestatic    W5/m.x:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lg6/l;ILjava/lang/Object;)Ljava/lang/String;
        //   156: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   159: pop            
        //   160: new             Lcom/appsflyer/internal/AFc1zSDK;
        //   163: dup            
        //   164: aload_2        
        //   165: aload_3        
        //   166: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   169: invokestatic    com/appsflyer/internal/AFc1uSDK$AFa1wSDK.AFInAppEventParameterName:(Ljava/lang/String;)Ljava/lang/String;
        //   172: aload_1        
        //   173: invokestatic    V5/a.b:(Ljava/lang/Throwable;)Ljava/lang/String;
        //   176: invokespecial   com/appsflyer/internal/AFc1zSDK.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   179: astore_2       
        //   180: aload_2        
        //   181: getfield        com/appsflyer/internal/AFc1zSDK.AFKeystoreWrapper:Ljava/lang/String;
        //   184: astore_3       
        //   185: new             Ljava/io/File;
        //   188: dup            
        //   189: aload           5
        //   191: aload_3        
        //   192: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   195: astore          6
        //   197: aload_2        
        //   198: astore_1       
        //   199: aload           6
        //   201: invokevirtual   java/io/File.exists:()Z
        //   204: ifeq            245
        //   207: aload           6
        //   209: aconst_null    
        //   210: iconst_1       
        //   211: aconst_null    
        //   212: invokestatic    e6/g.d:(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
        //   215: invokestatic    com/appsflyer/internal/AFc1zSDK$AFa1xSDK.AFInAppEventParameterName:(Ljava/lang/String;)Lcom/appsflyer/internal/AFc1zSDK;
        //   218: astore          5
        //   220: aload_2        
        //   221: astore_1       
        //   222: aload           5
        //   224: ifnull          245
        //   227: aload           5
        //   229: aload           5
        //   231: getfield        com/appsflyer/internal/AFc1zSDK.valueOf:I
        //   234: iconst_1       
        //   235: iadd           
        //   236: putfield        com/appsflyer/internal/AFc1zSDK.valueOf:I
        //   239: aload           5
        //   241: astore_1       
        //   242: goto            245
        //   245: new             Ljava/lang/StringBuilder;
        //   248: dup            
        //   249: ldc_w           "label="
        //   252: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   255: astore_2       
        //   256: aload_2        
        //   257: aload_1        
        //   258: getfield        com/appsflyer/internal/AFc1zSDK.AFInAppEventType:Ljava/lang/String;
        //   261: invokestatic    com/appsflyer/internal/AFc1uSDK$AFa1wSDK.valueOf:(Ljava/lang/String;)Ljava/lang/String;
        //   264: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   267: pop            
        //   268: aload_2        
        //   269: ldc_w           "\nhashName="
        //   272: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   275: pop            
        //   276: aload_2        
        //   277: aload_1        
        //   278: getfield        com/appsflyer/internal/AFc1zSDK.AFKeystoreWrapper:Ljava/lang/String;
        //   281: invokestatic    com/appsflyer/internal/AFc1uSDK$AFa1wSDK.valueOf:(Ljava/lang/String;)Ljava/lang/String;
        //   284: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   287: pop            
        //   288: aload_2        
        //   289: ldc_w           "\nstackTrace="
        //   292: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   295: pop            
        //   296: aload_2        
        //   297: aload_1        
        //   298: getfield        com/appsflyer/internal/AFc1zSDK.values:Ljava/lang/String;
        //   301: invokestatic    com/appsflyer/internal/AFc1uSDK$AFa1wSDK.valueOf:(Ljava/lang/String;)Ljava/lang/String;
        //   304: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   307: pop            
        //   308: aload_2        
        //   309: ldc_w           "\nc="
        //   312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   315: pop            
        //   316: aload_2        
        //   317: aload_1        
        //   318: getfield        com/appsflyer/internal/AFc1zSDK.valueOf:I
        //   321: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   324: pop            
        //   325: aload           6
        //   327: aload_2        
        //   328: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   331: aconst_null    
        //   332: iconst_2       
        //   333: aconst_null    
        //   334: invokestatic    e6/g.f:(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V
        //   337: goto            407
        //   340: new             Ljava/lang/StringBuilder;
        //   343: dup            
        //   344: ldc_w           "Could not cache exception\n"
        //   347: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   350: astore_1       
        //   351: new             Ljava/lang/StringBuilder;
        //   354: dup            
        //   355: ldc_w           " "
        //   358: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   361: astore_2       
        //   362: aload_2        
        //   363: aload_3        
        //   364: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   367: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   370: pop            
        //   371: aload_2        
        //   372: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   375: astore_2       
        //   376: aload_2        
        //   377: ldc             ""
        //   379: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //   382: aload_1        
        //   383: ldc_w           "[Exception Manager]: "
        //   386: aload_2        
        //   387: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   390: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   393: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   396: pop            
        //   397: aload_1        
        //   398: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   401: invokestatic    com/appsflyer/AFLogger.afRDLog:(Ljava/lang/String;)V
        //   404: aload           4
        //   406: astore_3       
        //   407: aload_0        
        //   408: monitorexit    
        //   409: aload_3        
        //   410: areturn        
        //   411: aload_0        
        //   412: monitorexit    
        //   413: aload_1        
        //   414: athrow         
        //   415: astore_1       
        //   416: goto            411
        //   419: astore_3       
        //   420: goto            340
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  14     20     415    419    Any
        //  31     197    419    407    Ljava/lang/Exception;
        //  31     197    415    419    Any
        //  199    220    419    407    Ljava/lang/Exception;
        //  199    220    415    419    Any
        //  227    239    419    407    Ljava/lang/Exception;
        //  227    239    415    419    Any
        //  245    337    419    407    Ljava/lang/Exception;
        //  245    337    415    419    Any
        //  340    404    415    419    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0245:
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
    
    @Override
    public final boolean values() {
        return this.AFInAppEventParameterName(new String[0]);
    }
}
