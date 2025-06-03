/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.net.Uri
 *  android.provider.DocumentsContract
 *  android.provider.MediaStore$Images$Media
 *  android.text.TextUtils
 *  android.webkit.MimeTypeMap
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.twitter.sdk.android.tweetcomposer;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;

class FileUtils {
    private static final String MEDIA_SCHEME = "com.android.providers.media.documents";

    public static String getExtension(String string2) {
        if (string2 == null) {
            return null;
        }
        int n = string2.lastIndexOf(".");
        string2 = n < 0 ? "" : string2.substring(n + 1);
        return string2;
    }

    public static String getMimeType(File object) {
        if (!TextUtils.isEmpty((CharSequence)(object = FileUtils.getExtension(object.getName())))) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension((String)object);
        }
        return "application/octet-stream";
    }

    @TargetApi(value=19)
    public static String getPath(Context context, Uri stringArray) {
        if (FileUtils.isMediaDocumentAuthority((Uri)stringArray)) {
            if ("image".equals((Object)(stringArray = DocumentsContract.getDocumentId((Uri)stringArray).split(":"))[0])) {
                return FileUtils.resolveFilePath(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{stringArray[1]});
            }
            return null;
        }
        if (FileUtils.isContentScheme((Uri)stringArray)) {
            return FileUtils.resolveFilePath(context, (Uri)stringArray, null, null);
        }
        if (FileUtils.isFileScheme((Uri)stringArray)) {
            return stringArray.getPath();
        }
        return null;
    }

    public static boolean isContentScheme(Uri uri) {
        return "content".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean isFileScheme(Uri uri) {
        return "file".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean isMediaDocumentAuthority(Uri uri) {
        return MEDIA_SCHEME.equalsIgnoreCase(uri.getAuthority());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String resolveFilePath(Context object, Uri uri, String string2, String[] stringArray) {
        void var0_3;
        block7: {
            block6: {
                Object var4_7 = null;
                try {
                    uri = object.getContentResolver().query(uri, new String[]{"_data"}, string2, stringArray, null);
                    if (uri == null) break block6;
                }
                catch (Throwable throwable) {
                    uri = var4_7;
                    break block7;
                }
                try {
                    if (!uri.moveToFirst()) break block6;
                    object = uri.getString(uri.getColumnIndexOrThrow("_data"));
                }
                catch (Throwable throwable) {
                    break block7;
                }
                uri.close();
                return object;
            }
            if (uri != null) {
                uri.close();
            }
            return null;
        }
        if (uri != null) {
            uri.close();
        }
        throw var0_3;
    }
}

