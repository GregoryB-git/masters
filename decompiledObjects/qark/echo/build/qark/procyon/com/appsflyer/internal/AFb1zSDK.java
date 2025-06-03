// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.AppsFlyerProperties;
import java.security.SecureRandom;
import java.nio.charset.Charset;
import java.io.IOException;
import com.appsflyer.AFLogger;
import java.io.RandomAccessFile;
import java.io.File;

public final class AFb1zSDK
{
    private static String values;
    
    private static String AFInAppEventType(File file) {
        Object b = null;
        final byte[] array = null;
        final IOException ex = null;
        Object o;
        try {
            try {
                o = new RandomAccessFile(file, "r");
                try {
                    b = new byte[(int)((RandomAccessFile)o).length()];
                    ((RandomAccessFile)o).readFully((byte[])b);
                    ((RandomAccessFile)o).close();
                    try {
                        ((RandomAccessFile)o).close();
                    }
                    catch (IOException ex2) {
                        AFLogger.afErrorLog("Exception while trying to close the InstallationFile", ex2);
                    }
                }
                catch (IOException ex) {}
                finally {
                    b = o;
                }
            }
            finally {}
        }
        catch (IOException ex) {
            file = null;
            o = array;
        }
        AFLogger.afErrorLog("Exception while reading InstallationFile: ", ex);
        if (o != null) {
            try {
                ((RandomAccessFile)o).close();
            }
            catch (IOException ex3) {
                AFLogger.afErrorLog("Exception while trying to close the InstallationFile", ex3);
            }
        }
        if (file == null) {
            file = (File)(Object)new byte[0];
        }
        return new String((byte[])(Object)file, Charset.defaultCharset());
        if (b != null) {
            try {
                ((RandomAccessFile)b).close();
            }
            catch (IOException ex4) {
                AFLogger.afErrorLog("Exception while trying to close the InstallationFile", ex4);
            }
        }
    }
    
    public static String valueOf(final AFb1bSDK aFb1bSDK, final AFb1dSDK aFb1dSDK) {
        // monitorenter(AFb1zSDK.class)
        while (true) {
            Label_0188: {
                try {
                    if (aFb1bSDK.AFInAppEventType == null) {
                        // monitorexit(AFb1zSDK.class)
                        return AFb1zSDK.values;
                    }
                }
                finally {
                    break Label_0188;
                }
                Label_0179: {
                    if (AFb1zSDK.values != null) {
                        break Label_0179;
                    }
                    final String values2 = aFb1dSDK.values("AF_INSTALLATION", null);
                    while (true) {
                        if (values2 != null) {
                            AFb1zSDK.values = values2;
                            break Label_0162;
                        }
                        try {
                            final AFb1bSDK aFb1bSDK2;
                            final File file = new File(aFb1bSDK2.AFInAppEventType.getFilesDir(), "AF_INSTALLATION");
                            if (!file.exists()) {
                                final long currentTimeMillis = System.currentTimeMillis();
                                final StringBuilder sb = new StringBuilder();
                                sb.append(currentTimeMillis);
                                sb.append("-");
                                sb.append(Math.abs(new SecureRandom().nextLong()));
                                AFb1zSDK.values = sb.toString();
                            }
                            else {
                                AFb1zSDK.values = AFInAppEventType(file);
                                file.delete();
                            }
                            aFb1dSDK.AFInAppEventParameterName("AF_INSTALLATION", AFb1zSDK.values);
                            if (AFb1zSDK.values != null) {
                                AppsFlyerProperties.getInstance().set("uid", AFb1zSDK.values);
                            }
                            // monitorexit(AFb1zSDK.class)
                            return AFb1zSDK.values;
                            // monitorexit(AFb1zSDK.class)
                            throw aFb1bSDK2;
                            final Exception ex;
                            AFLogger.afErrorLog("Error getting AF unique ID", ex);
                            continue;
                        }
                        catch (Exception ex2) {}
                        break;
                    }
                }
            }
            final Exception ex2;
            final Exception ex = ex2;
            continue;
        }
    }
}
