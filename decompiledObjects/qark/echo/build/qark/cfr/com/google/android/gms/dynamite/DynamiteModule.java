/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ProviderInfo
 *  android.database.Cursor
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Long
 *  java.lang.NoSuchFieldException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 */
package com.google.android.gms.dynamite;

import A2.m;
import A2.n;
import I2.i;
import I2.j;
import I2.k;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamite.c;
import com.google.android.gms.dynamite.d;
import com.google.android.gms.dynamite.e;
import com.google.android.gms.dynamite.f;
import com.google.android.gms.dynamite.g;
import com.google.android.gms.dynamite.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static Boolean h;
    public static String i;
    public static boolean j = false;
    public static int k = -1;
    public static Boolean l;
    public static final ThreadLocal m;
    public static final ThreadLocal n;
    public static final b.a o;
    public static final b p;
    public static j q;
    public static k r;
    public final Context a;

    static {
        m = new ThreadLocal();
        n = new I2.f();
        o = new com.google.android.gms.dynamite.a();
        b = new com.google.android.gms.dynamite.b();
        c = new c();
        d = new d();
        e = new e();
        f = new f();
        g = new g();
        p = new h();
    }

    public DynamiteModule(Context context) {
        n.i((Object)context);
        this.a = context;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static int a(Context object, String string2) {
        try {
            object = object.getApplicationContext().getClassLoader();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com.google.android.gms.dynamite.descriptors.");
            stringBuilder.append(string2);
            stringBuilder.append(".ModuleDescriptor");
            stringBuilder = object.loadClass(stringBuilder.toString());
            object = stringBuilder.getDeclaredField("MODULE_ID");
            stringBuilder = stringBuilder.getDeclaredField("MODULE_VERSION");
            if (m.a(object.get((Object)null), string2)) return stringBuilder.getInt((Object)null);
            object = String.valueOf((Object)object.get((Object)null));
            stringBuilder = new StringBuilder();
            stringBuilder.append("Module descriptor id '");
            stringBuilder.append((String)object);
            stringBuilder.append("' didn't match expected id '");
            stringBuilder.append(string2);
            stringBuilder.append("'");
            Log.e((String)"DynamiteModule", (String)stringBuilder.toString());
            return 0;
        }
        catch (ClassNotFoundException classNotFoundException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Local module descriptor class for ");
        stringBuilder.append(string2);
        stringBuilder.append(" not found.");
        Log.w((String)"DynamiteModule", (String)stringBuilder.toString());
        return 0;
        catch (Exception exception) {}
        Log.e((String)"DynamiteModule", (String)"Failed to load module descriptor class: ".concat(String.valueOf((Object)exception.getMessage())));
        return 0;
    }

    public static int b(Context context, String string2) {
        return DynamiteModule.e(context, string2, false);
    }

    /*
     * Exception decompiling
     */
    public static DynamiteModule d(Context var0, b var1_2, String var2_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[TRYBLOCK]], but top level block is 29[UNCONDITIONALDOLOOP]
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static int e(Context var0, String var1_1, boolean var2_7) {
        block61 : {
            block56 : {
                block58 : {
                    block57 : {
                        block51 : {
                            block60 : {
                                block55 : {
                                    block54 : {
                                        block53 : {
                                            try {
                                                var9_8 = DynamiteModule.h;
                                                var7_9 = null;
                                                var8_10 = null;
                                                var6_11 = null;
                                                var5_16 = var9_8;
                                                if (var9_8 != null) break block51;
                                                var10_23 = var0.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                                                var9_8 = var10_23.getDeclaringClass();
                                                // MONITORENTER : var9_8
                                            }
                                            catch (Throwable var1_2) {
                                                ** GOTO lbl154
                                            }
                                            try {
                                                block52 : {
                                                    block59 : {
                                                        var5_16 = (ClassLoader)var10_23.get((Object)null);
                                                        if (var5_16 == ClassLoader.getSystemClassLoader()) break block52;
                                                        if (var5_16 == null) break block59;
                                                        DynamiteModule.h((ClassLoader)var5_16);
                                                        ** GOTO lbl52
                                                        {
                                                            catch (a var5_22) {}
                                                        }
                                                    }
                                                    if (!DynamiteModule.j(var0)) {
                                                        // MONITOREXIT : var9_8
                                                        return 0;
                                                    }
                                                    if (DynamiteModule.j || (var4_24 = (var11_26 = Boolean.TRUE).equals((Object)null))) ** GOTO lbl50
                                                    var3_25 = DynamiteModule.f(var0, var1_1, var2_7, true);
                                                    var5_16 = DynamiteModule.i;
                                                    if (var5_16 == null) return var3_25;
                                                    if (var5_16.isEmpty()) {
                                                        return var3_25;
                                                    }
                                                    var5_16 = I2.d.a();
                                                    if (var5_16 == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            I2.b.a();
                                                            var5_16 = DynamiteModule.i;
                                                            n.i(var5_16);
                                                            var5_16 = I2.a.a((String)var5_16, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            var5_16 = DynamiteModule.i;
                                                            n.i(var5_16);
                                                            var5_16 = new I2.e((String)var5_16, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    DynamiteModule.h((ClassLoader)var5_16);
                                                    var10_23.set((Object)null, var5_16);
                                                    DynamiteModule.h = var11_26;
                                                    // MONITOREXIT : var9_8
                                                    return var3_25;
                                                    {
                                                        catch (a var5_18) {}
lbl50: // 1 sources:
                                                        var10_23.set((Object)null, (Object)ClassLoader.getSystemClassLoader());
                                                        break block52;
lbl52: // 2 sources:
                                                        var5_16 = Boolean.TRUE;
                                                        break block53;
                                                        ** try [egrp 11[TRYBLOCK] [30 : 291->324)] { 
lbl55: // 1 sources:
                                                        var10_23.set((Object)null, (Object)ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                var5_16 = Boolean.FALSE;
                                            }
lbl59: // 2 sources:
                                            catch (Throwable var5_17) {
                                                break block54;
                                            }
                                        }
                                        // MONITOREXIT : var9_8
                                        break block60;
                                    }
                                    ** try [egrp 13[TRYBLOCK] [36, 35, 34 : 324->327)] { 
lbl67: // 1 sources:
                                    throw var5_17;
lbl68: // 2 sources:
                                    catch (NoSuchFieldException var5_19) {
                                        break block55;
                                    }
lbl70: // 2 sources:
                                    catch (IllegalAccessException var5_20) {
                                        break block55;
                                    }
lbl72: // 2 sources:
                                    catch (ClassNotFoundException var5_21) {
                                        // empty catch block
                                    }
                                }
                                var5_16 = var5_16.toString();
                                var9_8 = new StringBuilder();
                                var9_8.append("Failed to load module via V2: ");
                                var9_8.append((String)var5_16);
                                Log.w((String)"DynamiteModule", (String)var9_8.toString());
                                var5_16 = Boolean.FALSE;
                            }
                            DynamiteModule.h = var5_16;
                            // MONITOREXIT : com.google.android.gms.dynamite.DynamiteModule.class
                        }
                        try {
                            var4_24 = var5_16.booleanValue();
                            if (var4_24) {
                                try {
                                    return DynamiteModule.f(var0, var1_1, var2_7, false);
                                }
                                catch (a var1_4) {
                                    var1_5 = var1_4.getMessage();
                                    var5_16 = new StringBuilder();
                                    var5_16.append("Failed to retrieve remote module version: ");
                                    var5_16.append(var1_5);
                                    Log.w((String)"DynamiteModule", (String)var5_16.toString());
                                    return 0;
                                }
                            }
                            var9_8 = DynamiteModule.k(var0);
                            if (var9_8 == null) {
                                return 0;
                            }
                            var5_16 = var8_10;
                        }
                        catch (Throwable var1_3) {}
                        var3_25 = var9_8.v();
                        if (var3_25 < 3) break block56;
                        var5_16 = var8_10;
                        var10_23 = (I2.h)DynamiteModule.m.get();
                        if (var10_23 != null) {
                            var5_16 = var8_10;
                            var10_23 = var10_23.a;
                            if (var10_23 != null) {
                                var5_16 = var8_10;
                                return var10_23.getInt(0);
                            }
                        }
                        var5_16 = var8_10;
                        var1_1 = (Cursor)H2.b.v(var9_8.e1(H2.b.Z0((Object)var0), var1_1, var2_7, (Long)DynamiteModule.n.get()));
                        if (var1_1 == null) break block57;
                        if (!var1_1.moveToFirst()) break block57;
                        var3_25 = var1_1.getInt(0);
                        if (var3_25 > 0 && (var2_7 = DynamiteModule.i((Cursor)var1_1))) {
                            var1_1 = var6_11;
                        }
                        if (var1_1 == null) return var3_25;
                        var1_1.close();
                        return var3_25;
                    }
                    try {
                        Log.w((String)"DynamiteModule", (String)"Failed to retrieve remote module version.");
                        if (var1_1 == null) return 0;
                    }
                    catch (Throwable var6_12) {
                        break block58;
                    }
                    catch (RemoteException var6_13) {
                        ** GOTO lbl157
                    }
                    var1_1.close();
                    return 0;
                }
                var5_16 = var1_1;
                var1_1 = var6_12;
                break block61;
            }
            if (var3_25 != 2) ** GOTO lbl149
            var5_16 = var8_10;
            Log.w((String)"DynamiteModule", (String)"IDynamite loader version = 2, no high precision latency measurement.");
            var5_16 = var8_10;
            return var9_8.a1(H2.b.Z0((Object)var0), var1_1, var2_7);
lbl149: // 1 sources:
            var5_16 = var8_10;
            Log.w((String)"DynamiteModule", (String)"IDynamite loader version < 2, falling back to getModuleVersion2");
            var5_16 = var8_10;
            return var9_8.Z0(H2.b.Z0((Object)var0), var1_1, var2_7);
lbl154: // 2 sources:
            throw var1_2;
            catch (RemoteException var6_14) {}
            var1_1 = var7_9;
lbl157: // 2 sources:
            var5_16 = var1_1;
            var6_15 = var6_15.getMessage();
            var5_16 = var1_1;
            var7_9 = new StringBuilder();
            var5_16 = var1_1;
            var7_9.append("Failed to retrieve remote module version: ");
            var5_16 = var1_1;
            var7_9.append(var6_15);
            var5_16 = var1_1;
            Log.w((String)"DynamiteModule", (String)var7_9.toString());
            if (var1_1 == null) return 0;
            var1_1.close();
            return 0;
            E2.g.a(var0, var1_3);
            throw var1_3;
            catch (Throwable var1_6) {}
        }
        if (var5_16 == null) throw var1_1;
        var5_16.close();
        throw var1_1;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static int f(Context var0, String var1_1, boolean var2_5, boolean var3_6) {
        block22 : {
            block24 : {
                block23 : {
                    block21 : {
                        var11_7 = null;
                        var8_9 = (Long)DynamiteModule.n.get();
                        var10_10 = var0.getContentResolver();
                        var0 = "api_force_staging";
                        var7_14 = true;
                        if (!var2_5) {
                            var0 = "api";
                        }
                        if ((var10_10 = var10_10.query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path((String)var0).appendPath(var1_1).appendQueryParameter("requestStartTime", String.valueOf((long)var8_9)).build(), null, null, null, null)) == null) break block21;
                        var0 = var10_10;
                        var1_1 = var10_10;
                        if (!var10_10.moveToFirst()) break block21;
                        var6_15 = false;
                        var2_5 = false;
                        var0 = var10_10;
                        var1_1 = var10_10;
                        var4_16 = var10_10.getInt(0);
                        var1_1 = var10_10;
                        if (var4_16 <= 0) break block22;
                        var0 = var10_10;
                        var1_1 = var10_10;
                        // MONITORENTER : com.google.android.gms.dynamite.DynamiteModule.class
                        try {
                            DynamiteModule.i = var10_10.getString(2);
                            var5_17 = var10_10.getColumnIndex("loaderVersion");
                            if (var5_17 >= 0) {
                                DynamiteModule.k = var10_10.getInt(var5_17);
                            }
                            if ((var5_17 = var10_10.getColumnIndex("disableStandaloneDynamiteLoader2")) >= 0) {
                                var2_5 = var10_10.getInt(var5_17) != 0 ? var7_14 : false;
                                DynamiteModule.j = var2_5;
                            }
                            // MONITOREXIT : com.google.android.gms.dynamite.DynamiteModule.class
                            var0 = var10_10;
                            var1_1 = var10_10;
                        }
                        catch (Throwable var11_8) {}
                        var7_14 = DynamiteModule.i((Cursor)var10_10);
                        var1_1 = var10_10;
                        var6_15 = var2_5;
                        if (var7_14) {
                            var1_1 = null;
                            var6_15 = var2_5;
                        }
                        break block22;
                    }
                    var0 = var10_10;
                    var1_1 = var10_10;
                    try {
                        ** try [egrp 7[TRYBLOCK] [23 : 324->351)] { 
lbl49: // 1 sources:
                        break block23;
                    }
                    catch (Throwable var1_2) {}
lbl51: // 3 sources:
                    catch (Exception var10_11) {}
                }
                Log.w((String)"DynamiteModule", (String)"Failed to retrieve remote module version.");
                var0 = var10_10;
                var1_1 = var10_10;
                throw new a("Failed to connect to dynamite module ContentResolver.", null);
                catch (Throwable var1_3) {
                    var0 = var11_7;
                    break block24;
                }
                catch (Exception var10_12) {
                    var1_1 = null;
                }
                var0 = var1_1;
                if (var10_13 instanceof a) {
                    var0 = var1_1;
                    throw var10_13;
                }
                var0 = var1_1;
                throw new a("V2 version check failed", (Throwable)var10_13, null);
                var0 = var10_10;
                var1_1 = var10_10;
                ** try [egrp 5[TRYBLOCK] [20, 19 : 276->293)] { 
lbl71: // 1 sources:
                throw var11_8;
lbl72: // 1 sources:
                ** finally { 
            }
            if (var0 == null) throw var1_4;
            var0.close();
            throw var1_4;
        }
        if (var3_6 && var6_15) {
            var0 = var1_1;
            throw new a("forcing fallback to container DynamiteLoader impl", null);
        }
        if (var1_1 == null) return var4_16;
        var1_1.close();
        return var4_16;
    }

    public static DynamiteModule g(Context context, String string2) {
        Log.i((String)"DynamiteModule", (String)"Selected local version of ".concat(String.valueOf((Object)string2)));
        return new DynamiteModule(context.getApplicationContext());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void h(ClassLoader object) {
        void var0_1;
        try {
            IInterface iInterface;
            object = (IBinder)object.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            object = object == null ? null : ((iInterface = object.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2")) instanceof k ? (k)iInterface : new k((IBinder)object));
            r = object;
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new a("Failed to instantiate dynamite loader", (Throwable)var0_1, null);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new a("Failed to instantiate dynamite loader", (Throwable)var0_1, null);
        }
        catch (InstantiationException instantiationException) {
            throw new a("Failed to instantiate dynamite loader", (Throwable)var0_1, null);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new a("Failed to instantiate dynamite loader", (Throwable)var0_1, null);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new a("Failed to instantiate dynamite loader", (Throwable)var0_1, null);
        }
    }

    public static boolean i(Cursor cursor) {
        I2.h h8 = (I2.h)m.get();
        if (h8 != null && h8.a == null) {
            h8.a = cursor;
            return true;
        }
        return false;
    }

    public static boolean j(Context context) {
        Boolean bl = Boolean.TRUE;
        if (bl.equals((Object)null)) {
            return true;
        }
        if (bl.equals((Object)l)) {
            return true;
        }
        bl = l;
        boolean bl2 = false;
        boolean bl3 = false;
        if (bl == null) {
            bl = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            boolean bl4 = bl3;
            if (x2.k.f().h(context, 10000000) == 0) {
                bl4 = bl3;
                if (bl != null) {
                    bl4 = bl3;
                    if ("com.google.android.gms".equals((Object)bl.packageName)) {
                        bl4 = true;
                    }
                }
            }
            l = bl4;
            bl2 = bl4;
            if (bl4) {
                bl2 = bl4;
                if (bl != null) {
                    context = bl.applicationInfo;
                    bl2 = bl4;
                    if (context != null) {
                        bl2 = bl4;
                        if ((context.flags & 129) == 0) {
                            Log.i((String)"DynamiteModule", (String)"Non-system-image GmsCore APK, forcing V1");
                            j = true;
                            bl2 = bl4;
                        }
                    }
                }
            }
        }
        if (!bl2) {
            Log.e((String)"DynamiteModule", (String)"Invalid GmsCore APK, remote loading disabled.");
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static j k(Context object) {
        // MONITORENTER : com.google.android.gms.dynamite.DynamiteModule.class
        j j8 = q;
        if (j8 != null) {
            // MONITOREXIT : com.google.android.gms.dynamite.DynamiteModule.class
            return j8;
        }
        try {
            object = (IBinder)object.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
            object = object == null ? null : ((j8 = object.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader")) instanceof j ? j8 : new j((IBinder)object));
            if (object == null) return null;
            {
                q = object;
            }
        }
        catch (Exception exception) {}
        {
            // MONITOREXIT : com.google.android.gms.dynamite.DynamiteModule.class
            return object;
        }
        String string2 = exception.getMessage();
        j8 = new StringBuilder();
        j8.append("Failed to load IDynamiteLoader from GmsCore: ");
        j8.append(string2);
        Log.e((String)"DynamiteModule", (String)j8.toString());
        // MONITOREXIT : com.google.android.gms.dynamite.DynamiteModule.class
        return null;
    }

    public IBinder c(String string2) {
        void var2_6;
        try {
            IBinder iBinder = (IBinder)this.a.getClassLoader().loadClass(string2).newInstance();
            return iBinder;
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InstantiationException instantiationException) {
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        throw new a("Failed to instantiate module class: ".concat(String.valueOf((Object)string2)), (Throwable)var2_6, null);
    }

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a
    extends Exception {
        public /* synthetic */ a(String string2, i i8) {
            super(string2);
        }

        public /* synthetic */ a(String string2, Throwable throwable, i i8) {
            super(string2, throwable);
        }
    }

    public static interface com.google.android.gms.dynamite.DynamiteModule$b {
        public b a(Context var1, String var2, a var3);

        public static interface a {
            public int a(Context var1, String var2);

            public int b(Context var1, String var2, boolean var3);
        }

        public static class b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

    }

}

