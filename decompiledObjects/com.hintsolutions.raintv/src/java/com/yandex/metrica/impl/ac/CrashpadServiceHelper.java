/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.RequiresApi
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.yandex.metrica.impl.ac;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(value=21)
public class CrashpadServiceHelper {
    public static boolean a(String string) {
        boolean bl = CrashpadServiceHelper.markCrashCompleted(string) && CrashpadServiceHelper.deleteCompletedReports();
        return bl;
    }

    public static native void cancelSetUpServiceHelper();

    public static native boolean deleteCompletedReports();

    private static native boolean markCrashCompleted(String var0);

    public static native Bundle readCrash(String var0);

    public static native List<Bundle> readOldCrashes();

    public static native void setUpServiceHelper(String var0);
}

