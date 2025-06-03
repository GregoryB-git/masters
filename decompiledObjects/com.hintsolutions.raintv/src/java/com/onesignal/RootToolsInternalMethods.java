/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.onesignal;

import java.io.File;

class RootToolsInternalMethods {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean isRooted() {
        int i = 0;
        while (i < 8) {
            try {
                String string2 = (new String[]{"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"})[i];
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("su");
                File file = new File(stringBuilder.toString());
                boolean bl = file.exists();
                if (bl) {
                    return true;
                }
                ++i;
            }
            catch (Throwable throwable) {
                return false;
            }
        }
        return false;
    }
}

