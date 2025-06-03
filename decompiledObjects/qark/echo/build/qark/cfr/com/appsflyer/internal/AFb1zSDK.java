/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.io.IOException
 *  java.io.RandomAccessFile
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.security.SecureRandom
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1dSDK;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.SecureRandom;

public final class AFb1zSDK {
    private static String values;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static String AFInAppEventType(File arrby) {
        byte[] arrby2;
        void var0_4;
        block14 : {
            block16 : {
                byte[] arrby3;
                block15 : {
                    arrby2 = null;
                    Object var4_8 = null;
                    Object var3_9 = null;
                    arrby3 = new byte[]((File)arrby, "r");
                    arrby = var3_9;
                    arrby2 = new byte[(int)arrby3.length()];
                    arrby = arrby2;
                    arrby3.readFully(arrby2);
                    arrby = arrby2;
                    arrby3.close();
                    try {
                        arrby3.close();
                        arrby = arrby2;
                    }
                    catch (IOException iOException) {
                        AFLogger.afErrorLog("Exception while trying to close the InstallationFile", (Throwable)iOException);
                        arrby = arrby2;
                    }
                    break block16;
                    catch (Throwable throwable) {
                        arrby2 = arrby3;
                        break block14;
                    }
                    catch (IOException iOException) {
                        break block15;
                    }
                    catch (Throwable throwable) {
                        break block14;
                    }
                    catch (IOException iOException) {
                        arrby = null;
                        arrby3 = var4_8;
                    }
                }
                arrby2 = arrby3;
                {
                    void var3_12;
                    AFLogger.afErrorLog("Exception while reading InstallationFile: ", (Throwable)var3_12);
                    if (arrby3 == null) break block16;
                }
                try {
                    arrby3.close();
                }
                catch (IOException iOException) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", (Throwable)iOException);
                }
            }
            if (arrby != null) {
                return new String(arrby, Charset.defaultCharset());
            }
            arrby = new byte[]{};
            return new String(arrby, Charset.defaultCharset());
        }
        if (arrby2 == null) throw var0_4;
        try {
            arrby2.close();
            throw var0_4;
        }
        catch (IOException iOException) {
            AFLogger.afErrorLog("Exception while trying to close the InstallationFile", (Throwable)iOException);
        }
        throw var0_4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static String valueOf(AFb1bSDK var0, AFb1dSDK var1_3) {
        block13 : {
            block12 : {
                block11 : {
                    // MONITORENTER : com.appsflyer.internal.AFb1zSDK.class
                    if (var0.AFInAppEventType != null) break block11;
                    var0 = AFb1zSDK.values;
                    return var0;
                }
                if (AFb1zSDK.values == null) {
                    var4_4 = var1_3.values("AF_INSTALLATION", null);
                    if (var4_4 == null) break block12;
                    AFb1zSDK.values = var4_4;
                    break block13;
                }
                ** GOTO lbl35
            }
            var0 = new File(var0.AFInAppEventType.getFilesDir(), "AF_INSTALLATION");
            if (!var0.exists()) {
                var2_5 = System.currentTimeMillis();
                var0 = new StringBuilder();
                var0.append(var2_5);
                var0.append("-");
                var0.append(Math.abs((long)new SecureRandom().nextLong()));
                AFb1zSDK.values = var0.toString();
            } else {
                AFb1zSDK.values = AFb1zSDK.AFInAppEventType((File)var0);
                var0.delete();
            }
            var1_3.AFInAppEventParameterName("AF_INSTALLATION", AFb1zSDK.values);
        }
lbl32: // 2 sources:
        do {
            if (AFb1zSDK.values != null) {
                AppsFlyerProperties.getInstance().set("uid", AFb1zSDK.values);
            }
lbl35: // 4 sources:
            var0 = AFb1zSDK.values;
            // MONITOREXIT : com.appsflyer.internal.AFb1zSDK.class
            return var0;
            break;
        } while (true);
        catch (Exception var0_2) {}
        AFLogger.afErrorLog("Error getting AF unique ID", (Throwable)var0_2);
        ** while (true)
    }
}

