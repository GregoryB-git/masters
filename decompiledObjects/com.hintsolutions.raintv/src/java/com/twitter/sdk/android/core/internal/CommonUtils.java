/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  java.io.Closeable
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Scanner
 */
package com.twitter.sdk.android.core.internal;

import android.content.Context;
import android.content.res.Resources;
import com.twitter.sdk.android.core.Twitter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CommonUtils {
    public static final boolean TRACE_ENABLED_DEFAULT = false;
    public static final String TRACE_ENABLED_RESOURCE_NAME = "com.twitter.sdk.android.TRACE_ENABLED";
    private static Boolean clsTrace;

    public static void closeOrLog(Closeable closeable, String string2) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (IOException iOException) {
                Twitter.getLogger().e("Twitter", string2, iOException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void closeQuietly(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream, byte[] byArray) throws IOException {
        int n;
        while ((n = inputStream.read(byArray)) != -1) {
            outputStream.write(byArray, 0, n);
        }
    }

    public static boolean getBooleanResourceValue(Context context, String string2, boolean bl) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int n = CommonUtils.getResourcesIdentifier(context, string2, "bool");
            if (n > 0) {
                return resources.getBoolean(n);
            }
            n = CommonUtils.getResourcesIdentifier(context, string2, "string");
            if (n > 0) {
                return Boolean.parseBoolean((String)context.getString(n));
            }
        }
        return bl;
    }

    public static String getResourcePackageName(Context context) {
        int n = context.getApplicationContext().getApplicationInfo().icon;
        if (n > 0) {
            return context.getResources().getResourcePackageName(n);
        }
        return context.getPackageName();
    }

    public static int getResourcesIdentifier(Context context, String string2, String string3) {
        return context.getResources().getIdentifier(string2, string3, CommonUtils.getResourcePackageName(context));
    }

    public static String getStringResourceValue(Context context, String string2, String string3) {
        int n;
        Resources resources;
        if (context != null && (resources = context.getResources()) != null && (n = CommonUtils.getResourcesIdentifier(context, string2, "string")) > 0) {
            return resources.getString(n);
        }
        return string3;
    }

    public static boolean isClsTrace(Context context) {
        if (clsTrace == null) {
            clsTrace = CommonUtils.getBooleanResourceValue(context, TRACE_ENABLED_RESOURCE_NAME, false);
        }
        return clsTrace;
    }

    public static void logControlled(Context context, int n, String string2, String string3) {
        if (CommonUtils.isClsTrace(context)) {
            Twitter.getLogger().log(n, "Twitter", string3);
        }
    }

    public static void logControlled(Context context, String string2) {
        if (CommonUtils.isClsTrace(context)) {
            Twitter.getLogger().d("Twitter", string2);
        }
    }

    public static void logControlledError(Context context, String string2, Throwable throwable) {
        if (CommonUtils.isClsTrace(context)) {
            Twitter.getLogger().e("Twitter", string2);
        }
    }

    public static void logOrThrowIllegalStateException(String string2, String string3) {
        if (!Twitter.isDebug()) {
            Twitter.getLogger().w(string2, string3);
            return;
        }
        throw new IllegalStateException(string3);
    }

    public static String streamToString(InputStream object) throws IOException {
        object = (object = new Scanner(object).useDelimiter("\\A")).hasNext() ? object.next() : "";
        return object;
    }
}

