/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Process
 *  java.io.ByteArrayInputStream
 *  java.io.File
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.math.BigInteger
 *  java.security.MessageDigest
 *  java.security.cert.Certificate
 *  java.security.cert.CertificateFactory
 *  java.security.cert.X509Certificate
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Set
 *  java.util.TimeZone
 */
package com.appsflyer.internal;

import V5.a;
import W5.m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFc1nSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFc1vSDK;
import com.appsflyer.internal.AFc1zSDK;
import com.appsflyer.internal.g;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFa1fSDK
implements AFc1vSDK {
    @NotNull
    private final AFb1bSDK valueOf;

    public AFa1fSDK() {
    }

    public AFa1fSDK(AFb1bSDK aFb1bSDK) {
        Intrinsics.checkNotNullParameter(aFb1bSDK, "");
        this.valueOf = aFb1bSDK;
    }

    private File AFInAppEventParameterName() {
        Context context = this.valueOf.AFInAppEventType;
        if (context != null) {
            if (!(context = new File(context.getFilesDir(), "AFExceptionsCache")).exists()) {
                context.mkdirs();
            }
            return context;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long AFInAppEventType(Context context, String string2) {
        int n8;
        try {
            context = context.getPackageManager().getPackageInfo(string2, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return g.a((PackageInfo)context);
            }
            n8 = context.versionCode;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        return n8;
        AFLogger.afErrorLog(nameNotFoundException.getMessage(), (Throwable)nameNotFoundException);
        return 0L;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static Map<String, String> AFInAppEventType(Context var0, Map<String, String> var1_2, Uri var2_3) {
        var10_4 = var2_3.getQueryParameterNames().iterator();
        do {
            block15 : {
                block10 : {
                    block14 : {
                        block13 : {
                            block11 : {
                                block12 : {
                                    var5_7 = var10_4.hasNext();
                                    var8_8 = "media_source";
                                    var3_5 = 0;
                                    if (!var5_7) break;
                                    var9_9 = (String)var10_4.next();
                                    var11_10 = var2_3.getQueryParameter(var9_9);
                                    if (var1_2.containsKey((Object)var9_9)) break block10;
                                    var4_6 = var9_9.hashCode();
                                    if (var4_6 == -1420799080) break block11;
                                    if (var4_6 == 99) break block12;
                                    if (var4_6 != 110987 || !var9_9.equals((Object)"pid")) ** GOTO lbl-1000
                                    var3_5 = 1;
                                    break block13;
                                }
                                if (!var9_9.equals((Object)"c")) ** GOTO lbl-1000
                                break block13;
                            }
                            if (var9_9.equals((Object)"af_prt")) {
                                var3_5 = 2;
                            } else lbl-1000: // 3 sources:
                            {
                                var3_5 = -1;
                            }
                        }
                        if (var3_5 == 0) break block14;
                        if (var3_5 == 1) break block15;
                        if (var3_5 != 2) break block10;
                        var8_8 = "agency";
                        break block15;
                    }
                    var8_8 = "campaign";
                    break block15;
                }
                var8_8 = var9_9;
            }
            var1_2.put((Object)var8_8, (Object)var11_10);
        } while (true);
        try {
            if (!var1_2.containsKey((Object)"install_time")) {
                var8_8 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                var6_11 = var0.getPackageManager().getPackageInfo((String)var0.getPackageName(), (int)0).firstInstallTime;
                var8_8.setTimeZone(TimeZone.getTimeZone((String)"UTC"));
                var1_2.put((Object)"install_time", (Object)var8_8.format(new Date(var6_11)));
            }
        }
        catch (Exception var0_1) {
            AFLogger.afErrorLog("Could not fetch install time. ", (Throwable)var0_1);
        }
        if (var1_2.containsKey((Object)"af_deeplink") && !var1_2.containsKey((Object)"af_status")) {
            var1_2.put((Object)"af_status", (Object)"Non-organic");
        }
        if (var1_2.containsKey((Object)"agency")) {
            var1_2.remove((Object)"media_source");
        }
        if ((var0 = var2_3.getPath()) != null) {
            var1_2.put((Object)"path", var0);
        }
        if ((var0 = var2_3.getScheme()) != null) {
            var1_2.put((Object)"scheme", var0);
        }
        if ((var0 = var2_3.getHost()) == null) return var1_2;
        var1_2.put((Object)"host", var0);
        return var1_2;
    }

    public static String AFKeystoreWrapper(Context object, String string2) {
        try {
            object = object.getPackageManager().getPackageInfo((String)string2, (int)0).versionName;
            return object;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            AFLogger.afErrorLog(nameNotFoundException.getMessage(), (Throwable)nameNotFoundException);
            return "";
        }
    }

    private File afDebugLog() {
        File file = this.AFInAppEventParameterName();
        if (file != null) {
            if (!(file = new File(file, "6.12.2")).exists()) {
                file.mkdirs();
            }
            return file;
        }
        return null;
    }

    public static boolean valueOf() {
        return Build.BRAND.equals((Object)"OPPO");
    }

    @SuppressLint(value={"PackageManagerGetSignatures"})
    public static String values(PackageManager x509Certificate, String string2) {
        x509Certificate = x509Certificate.getPackageInfo((String)string2, (int)64).signatures;
        if (x509Certificate == null) {
            return null;
        }
        x509Certificate = (X509Certificate)CertificateFactory.getInstance((String)"X.509").generateCertificate((InputStream)new ByteArrayInputStream(x509Certificate[0].toByteArray()));
        string2 = MessageDigest.getInstance((String)"SHA256");
        string2.update(x509Certificate.getEncoded());
        return String.format((String)"%032X", (Object[])new Object[]{new BigInteger(1, string2.digest())});
    }

    public static boolean values(Context context, Intent intent) {
        if (context.getPackageManager().queryIntentServices(intent, 0).size() > 0) {
            return true;
        }
        return false;
    }

    public static boolean values(Context context, String string2) {
        int n8 = context.checkPermission(string2, Process.myPid(), Process.myUid());
        context = new StringBuilder("is Permission Available: ");
        context.append(string2);
        context.append("; res: ");
        context.append(n8);
        AFLogger.afRDLog(context.toString());
        if (n8 == 0) {
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final /* varargs */ boolean AFInAppEventParameterName(String ... var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[SIMPLE_IF_TAKEN]], but top level block is 1[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public final int AFInAppEventType() {
        Iterator iterator = ((Iterable)this.AFKeystoreWrapper()).iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            n8 += ((AFc1zSDK)iterator.next()).valueOf;
        }
        return n8;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NotNull
    @Override
    public final List<AFc1zSDK> AFKeystoreWrapper() {
        synchronized (this) {
            block13 : {
                var5_1 = this.afDebugLog();
                var4_2 = null;
                var3_3 = var4_2;
                if (var5_1 == null) break block13;
                var5_1 = var5_1.listFiles();
                var3_3 = var4_2;
                ** if (var5_1 == null) goto lbl-1000
lbl-1000: // 1 sources:
                {
                    Intrinsics.checkNotNullExpressionValue((Object)var5_1, "");
                    var3_3 = new ArrayList();
                    var2_6 = var5_1.length;
                    for (var1_7 = 0; var1_7 < var2_6; ++var1_7) {
                        var6_8 = var5_1[var1_7];
                        var7_9 = AFc1zSDK.AFInAppEventParameterName;
                        Intrinsics.checkNotNullExpressionValue(var6_8, "");
                        var6_8 = AFc1zSDK.AFa1xSDK.AFInAppEventParameterName(e6.g.d((File)var6_8, null, 1, null));
                        if (var6_8 == null) continue;
                        var3_3.add(var6_8);
                        continue;
                    }
                }
lbl-1000: // 1 sources:
                {
                    break block13;
                }
                {
                    catch (Throwable var3_4) {}
                    var5_1 = new StringBuilder("Could not get stored exceptions\n ");
                    var5_1.append(var3_4.getMessage());
                    var3_3 = var5_1.toString();
                    Intrinsics.checkNotNullParameter(var3_3, "");
                    AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf((Object)var3_3)));
                    var3_3 = var4_2;
                    break;
                }
            }
            var4_2 = var3_3;
            if (var3_3 != null) return var4_2;
            try {
                return m.f();
            }
            catch (Throwable var3_5) {
                ** continue;
            }
lbl42: // 1 sources:
            do {
                throw var3_5;
                break;
            } while (true);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final String values(Throwable object, String object2) {
        Intrinsics.checkNotNullParameter(object, "");
        Intrinsics.checkNotNullParameter(object2, "");
        // MONITORENTER : this
        Object object4 = this.afDebugLog();
        StringBuilder stringBuilder = null;
        Object object3 = stringBuilder;
        if (object4 == null) return object3;
        {
            Intrinsics.checkNotNullParameter(object, "");
            Intrinsics.checkNotNullParameter(object2, "");
            object3 = new StringBuilder();
            Intrinsics.checkNotNullParameter(object, "");
            String string2 = object.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            object3.append(string2);
            object3.append(": ");
            object3.append((String)object2);
            object2 = object3.toString();
            Intrinsics.checkNotNullParameter(object, "");
            Intrinsics.checkNotNullParameter(object, "");
            object3 = new StringBuilder();
            object3.append(object);
            object3.append('\n');
            object3.append(m.x((Iterable)AFc1nSDK.AFInAppEventParameterName((Throwable)object), "\n", null, null, 0, null, AFc1nSDK.AFKeystoreWrapper, 30, null));
            object2 = new AFc1zSDK((String)object2, AFc1uSDK.AFa1wSDK.AFInAppEventParameterName(object3.toString()), a.b((Throwable)object));
            object3 = object2.AFKeystoreWrapper;
            string2 = new File((File)object4, (String)object3);
            object = object2;
            if (string2.exists()) {
                object4 = AFc1zSDK.AFa1xSDK.AFInAppEventParameterName(e6.g.d((File)string2, null, 1, null));
                object = object2;
                if (object4 != null) {
                    ++object4.valueOf;
                    object = object4;
                }
            }
            object2 = new StringBuilder("label=");
            object2.append(AFc1uSDK.AFa1wSDK.valueOf(object.AFInAppEventType));
            object2.append("\nhashName=");
            object2.append(AFc1uSDK.AFa1wSDK.valueOf(object.AFKeystoreWrapper));
            object2.append("\nstackTrace=");
            object2.append(AFc1uSDK.AFa1wSDK.valueOf(object.values));
            object2.append("\nc=");
            object2.append(object.valueOf);
            e6.g.f((File)string2, object2.toString(), null, 2, null);
            return object3;
        }
        catch (Exception exception) {}
        object = new StringBuilder("Could not cache exception\n");
        object2 = new StringBuilder(" ");
        object2.append(exception.getMessage());
        object2 = object2.toString();
        Intrinsics.checkNotNullParameter(object2, "");
        object.append("[Exception Manager]: ".concat(String.valueOf((Object)object2)));
        AFLogger.afRDLog(object.toString());
        object3 = stringBuilder;
        // MONITOREXIT : this
        return object3;
    }

    @Override
    public final boolean values() {
        return this.AFInAppEventParameterName(new String[0]);
    }
}

