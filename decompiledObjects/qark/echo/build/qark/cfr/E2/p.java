/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Process
 *  android.os.WorkSource
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 */
package E2;

import E2.l;
import G2.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

public abstract class p {
    public static final int a;
    public static final Method b;
    public static final Method c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Method g;
    public static final Method h;
    public static final Method i;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Method method;
        Object var2_2;
        Method method2;
        block27 : {
            block26 : {
                block25 : {
                    block24 : {
                        block23 : {
                            block22 : {
                                block21 : {
                                    a = Process.myUid();
                                    method2 = null;
                                    var2_2 = null;
                                    try {
                                        method = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
                                        break block21;
                                    }
                                    catch (Exception exception) {}
                                    method = null;
                                }
                                b = method;
                                if (l.c()) {
                                    try {
                                        method = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
                                        break block22;
                                    }
                                    catch (Exception exception) {}
                                }
                                method = null;
                            }
                            c = method;
                            try {
                                method = WorkSource.class.getMethod("size", new Class[0]);
                                break block23;
                            }
                            catch (Exception exception) {}
                            method = null;
                        }
                        d = method;
                        try {
                            method = WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
                            break block24;
                        }
                        catch (Exception exception) {}
                        method = null;
                    }
                    e = method;
                    if (l.c()) {
                        try {
                            method = WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
                            break block25;
                        }
                        catch (Exception exception) {}
                    }
                    method = null;
                }
                f = method;
                if (l.i()) {
                    try {
                        method = WorkSource.class.getMethod("createWorkChain", new Class[0]);
                        break block26;
                    }
                    catch (Exception exception) {
                        Log.w((String)"WorkSourceUtil", (String)"Missing WorkChain API createWorkChain", (Throwable)exception);
                    }
                }
                method = null;
            }
            g = method;
            if (l.i()) {
                try {
                    method = Class.forName((String)"android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
                    break block27;
                }
                catch (Exception exception) {
                    Log.w((String)"WorkSourceUtil", (String)"Missing WorkChain class", (Throwable)exception);
                }
            }
            method = null;
        }
        h = method;
        method = var2_2;
        if (l.i()) {
            method = method2;
            try {
                method = method2 = WorkSource.class.getMethod("isEmpty", new Class[0]);
                method2.setAccessible(true);
                method = method2;
            }
            catch (Exception exception) {}
        }
        i = method;
    }

    public static void a(WorkSource workSource, int n8, String string2) {
        Method method = c;
        if (method != null) {
            String string3 = string2;
            if (string2 == null) {
                string3 = "";
            }
            try {
                method.invoke((Object)workSource, new Object[]{n8, string3});
                return;
            }
            catch (Exception exception) {
                Log.wtf((String)"WorkSourceUtil", (String)"Unable to assign blame through WorkSource", (Throwable)exception);
                return;
            }
        }
        string2 = b;
        if (string2 != null) {
            try {
                string2.invoke((Object)workSource, new Object[]{n8});
                return;
            }
            catch (Exception exception) {
                Log.wtf((String)"WorkSourceUtil", (String)"Unable to assign blame through WorkSource", (Throwable)exception);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static WorkSource b(Context object, String string2) {
        block3 : {
            int n8;
            if (object == null) return null;
            if (object.getPackageManager() == null) return null;
            if (string2 == null) return null;
            try {
                object = d.a((Context)object).c(string2, 0);
                if (object == null) {
                    object = "Could not get applicationInfo from package: ";
                    break block3;
                }
                n8 = object.uid;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            object = new WorkSource();
            p.a((WorkSource)object, n8, string2);
            return object;
            object = "Could not find package: ";
        }
        Log.e((String)"WorkSourceUtil", (String)object.concat(string2));
        return null;
    }

    public static boolean c(Context context) {
        if (context == null) {
            return false;
        }
        if (context.getPackageManager() == null) {
            return false;
        }
        if (d.a(context).b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }
}

