/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.util.Log
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.ThreadGroup
 *  java.lang.Throwable
 *  java.lang.Void
 */
package I2;

import I2.c;
import android.os.Looper;
import android.util.Log;

public abstract class d {
    public static volatile ClassLoader a;
    public static volatile Thread b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ClassLoader a() {
        synchronized (d.class) {
            try {
                if (a != null) return a;
                a = d.b();
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
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
    public static ClassLoader b() {
        Throwable throwable2;
        block12 : {
            Thread thread;
            Thread thread2;
            block11 : {
                // MONITORENTER : I2.d.class
                thread2 = b;
                thread = null;
                if (thread2 != null || (thread2 = (d.b = d.c())) != null) break block11;
                return null;
            }
            Thread thread3 = b;
            // MONITORENTER : thread3
            thread2 = b.getContextClassLoader();
            return thread2;
            catch (Throwable throwable2) {
                break block12;
            }
            catch (SecurityException securityException) {
                String string2 = securityException.getMessage();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to get thread context classloader ");
                stringBuilder.append(string2);
                Log.w((String)"DynamiteLoaderV2CL", (String)stringBuilder.toString());
            }
            // MONITOREXIT : thread3
            // MONITOREXIT : I2.d.class
            return thread;
        }
        throw throwable2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static Thread c() {
        synchronized (d.class) {
            block25 : {
                var6 = Looper.getMainLooper().getThread().getThreadGroup();
                if (var6 != null) break block25;
                return null;
            }
            ** synchronized (Void.class)
lbl-1000: // 1 sources:
            {
                var2_2 = var6.activeGroupCount();
                var5_3 = new ThreadGroup[var2_2];
                var6.enumerate((ThreadGroup[])var5_3);
                var1_6 = 0;
                for (var0_7 = 0; var0_7 < var2_2; ++var0_7) {
                    block27 : {
                        block26 : {
                            var4_8 = var5_3[var0_7];
                            if (!"dynamiteLoader".equals((Object)var4_8.getName())) continue;
lbl18: // 2 sources:
                            var5_3 = var4_8;
                            if (var4_8 == null) {
                                var5_3 = new ThreadGroup((ThreadGroup)var6, "dynamiteLoader");
                            }
                            var2_2 = var5_3.activeCount();
                            var6 = new Thread[var2_2];
                            var5_3.enumerate((Thread[])var6);
                            for (var0_7 = var1_6; var0_7 < var2_2; ++var0_7) {
                                var4_8 = var6[var0_7];
                                var3_11 = "GmsDynamite".equals((Object)var4_8.getName());
                                ** if (var3_11) goto lbl-1000
lbl-1000: // 1 sources:
                                {
                                    continue;
                                }
lbl-1000: // 1 sources:
                                {
                                    break block26;
                                }
                            }
                            var4_8 = null;
                        }
                        var6 = var4_8;
                        if (var4_8 != null) break block27;
                        var5_3 = new c((ThreadGroup)var5_3, "GmsDynamite");
                        try {
                            var5_3.setContextClassLoader(null);
                            var5_3.start();
                            var4_8 = var5_3;
                        }
                        catch (SecurityException var6_1) {
                            var4_8 = var5_3;
                            var5_3 = var6_1;
                            ** GOTO lbl53
                        }
lbl42: // 2 sources:
                        do {
                            var6 = var4_8;
                            break block27;
                            break;
                        } while (true);
                        catch (SecurityException var5_4) {
                            ** GOTO lbl53
                        }
lbl51: // 1 sources:
                        do {
                            var4_8 = null;
lbl53: // 3 sources:
                            var5_3 = var5_3.getMessage();
                            var6 = new StringBuilder();
                            var6.append("Failed to enumerate thread/threadgroup ");
                            var6.append((String)var5_3);
                            Log.w((String)"DynamiteLoaderV2CL", (String)var6.toString());
                            ** continue;
                            break;
                        } while (true);
                    }
                    return var6;
                    try {
                        // MONITOREXIT [17, 8, 10, 11] lbl62 : MonitorExitStatement: MONITOREXIT : java.lang.Void.class
                    }
                    catch (Throwable var4_9) {
                    }
                    throw var4_9;
                    catch (SecurityException var5_5) {
                        ** continue;
                    }
                }
                var4_8 = null;
                ** GOTO lbl18
            }
        }
    }
}

