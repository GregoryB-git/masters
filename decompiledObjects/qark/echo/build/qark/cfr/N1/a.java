/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.nsd.NsdManager
 *  android.net.nsd.NsdManager$RegistrationListener
 *  android.net.nsd.NsdServiceInfo
 *  android.os.Build
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.EnumSet
 *  java.util.HashMap
 *  java.util.Map
 *  org.json.JSONObject
 */
package N1;

import O1.I;
import O1.P;
import O1.v;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONObject;
import x1.B;

public final class a {
    public static final a a = new a();
    public static final String b = a.class.getCanonicalName();
    public static final HashMap c = new HashMap();

    public static final void a(String string2) {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            a.b(string2);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, a.class);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public static final Bitmap c(String var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 8[UNCONDITIONALDOLOOP]
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
     * Lifted jumps to return sites
     */
    public static final String d(Map var0) {
        if (T1.a.d(a.class)) {
            return null;
        }
        var1_2 = var0;
        if (var0 != null) ** GOTO lbl7
        try {
            var1_2 = new HashMap();
lbl7: // 2 sources:
            var0 = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(var0, "DEVICE");
            var1_2.put((Object)"device", var0);
            var0 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(var0, "MODEL");
            var1_2.put((Object)"model", var0);
            var0 = new JSONObject((Map)var1_2).toString();
            Intrinsics.checkNotNullExpressionValue(var0, "JSONObject(deviceInfo as Map<*, *>).toString()");
            return var0;
        }
        catch (Throwable var0_1) {}
        T1.a.b(var0_1, a.class);
        return null;
    }

    public static final boolean e() {
        Throwable throwable2;
        block6 : {
            block5 : {
                Object object;
                if (T1.a.d(a.class)) {
                    return false;
                }
                try {
                    object = v.a;
                    object = v.f(B.m());
                    if (object == null) break block5;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                boolean bl = object.l().contains((Object)I.s);
                if (bl) {
                    return true;
                }
            }
            return false;
        }
        T1.a.b(throwable2, a.class);
        return false;
    }

    public static final boolean f(String string2) {
        Throwable throwable2;
        block4 : {
            if (T1.a.d(a.class)) {
                return false;
            }
            try {
                if (a.e()) {
                    boolean bl = a.g(string2);
                    return bl;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            return false;
        }
        T1.a.b(throwable2, a.class);
        return false;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void b(String string2) {
        Throwable throwable2222;
        block6 : {
            block5 : {
                Object object;
                if (T1.a.d(this)) {
                    return;
                }
                try {
                    NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener)c.get((Object)string2);
                    if (registrationListener == null) return;
                    object = B.l().getSystemService("servicediscovery");
                    if (object == null) throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                    object = (NsdManager)object;
                    object.unregisterService(registrationListener);
                    break block5;
                }
                catch (Throwable throwable2222) {
                    break block6;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    object = P.a;
                    P.i0(b, (Exception)illegalArgumentException);
                }
            }
            c.remove((Object)string2);
            return;
        }
        T1.a.b(throwable2222, this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean g(String string2) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            HashMap hashMap = c;
            if (hashMap.containsKey((Object)string2)) {
                return true;
            }
            String string3 = Intrinsics.i("android-", i.p(B.B(), '.', '|', false, 4, null));
            Object object = new StringBuilder();
            object.append("fbsdk_");
            object.append(string3);
            object.append('_');
            object.append((Object)string2);
            object = object.toString();
            string3 = new NsdServiceInfo();
            string3.setServiceType("_fb._tcp.");
            string3.setServiceName((String)object);
            string3.setPort(80);
            Object object2 = B.l().getSystemService("servicediscovery");
            if (object2 != null) {
                object2 = (NsdManager)object2;
                object = new NsdManager.RegistrationListener((String)object, string2){
                    public final /* synthetic */ String a;
                    public final /* synthetic */ String b;
                    {
                        this.a = string2;
                        this.b = string3;
                    }

                    public void onRegistrationFailed(NsdServiceInfo object, int n8) {
                        Intrinsics.checkNotNullParameter(object, "serviceInfo");
                        object = a.a;
                        a.a(this.b);
                    }

                    public void onServiceRegistered(NsdServiceInfo object) {
                        Intrinsics.checkNotNullParameter(object, "NsdServiceInfo");
                        if (!Intrinsics.a(this.a, object.getServiceName())) {
                            object = a.a;
                            a.a(this.b);
                        }
                    }

                    public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
                        Intrinsics.checkNotNullParameter((Object)nsdServiceInfo, "serviceInfo");
                    }

                    public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int n8) {
                        Intrinsics.checkNotNullParameter((Object)nsdServiceInfo, "serviceInfo");
                    }
                };
                hashMap.put((Object)string2, object);
                object2.registerService((NsdServiceInfo)string3, 1, (NsdManager.RegistrationListener)object);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
        return false;
    }

}

