/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.Signature
 *  androidx.annotation.Nullable
 *  java.io.BufferedReader
 *  java.io.BufferedWriter
 *  java.io.FileReader
 *  java.io.FileWriter
 *  java.io.IOException
 *  java.io.Reader
 *  java.io.Writer
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.BigInteger
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.HashMap
 *  java.util.LinkedHashMap
 *  java.util.Map
 */
package com.vk.sdk.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.Nullable;
import com.vk.sdk.api.VKParameters;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class VKUtil {
    public static final boolean $assertionsDisabled = false;

    @Nullable
    public static Map<String, String> explodeQueryString(@Nullable String stringArray) {
        if (stringArray == null) {
            return null;
        }
        String[] stringArray2 = stringArray.split("&");
        HashMap hashMap = new HashMap(stringArray2.length);
        int n = stringArray2.length;
        for (int k = 0; k < n; ++k) {
            stringArray = stringArray2[k].split("=");
            hashMap.put((Object)stringArray[0], (Object)stringArray[1]);
        }
        return hashMap;
    }

    public static String fileToString(String string2) throws IOException {
        String string3;
        BufferedReader bufferedReader = new BufferedReader((Reader)new FileReader(string2));
        string2 = new StringBuilder();
        while ((string3 = bufferedReader.readLine()) != null) {
            string2.append(string3);
        }
        bufferedReader.close();
        return string2.toString();
    }

    public static String getApplicationName(Context object) {
        block5: {
            block4: {
                PackageManager packageManager;
                try {
                    packageManager = object.getApplicationContext().getPackageManager();
                    object = packageManager.getApplicationInfo(object.getPackageName(), 0);
                    if (object == null) break block4;
                }
                catch (Exception exception) {
                    return null;
                }
                object = packageManager.getApplicationLabel((ApplicationInfo)object);
                break block5;
            }
            object = "(unknown)";
        }
        object = (String)object;
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String[] getCertificateFingerprint(Context context, String signatureArray) {
        int n4;
        int n3;
        int n;
        String[] stringArray;
        if (context == null) return null;
        try {
            if (context.getPackageManager() == null) {
                return null;
            }
            signatureArray = context.getPackageManager().getPackageInfo((String)signatureArray, (int)64).signatures;
            stringArray = new String[signatureArray.length];
            n = signatureArray.length;
            n3 = 0;
            n4 = 0;
        }
        catch (Exception exception) {
            return null;
        }
        while (n3 < n) {
            Signature signature = signatureArray[n3];
            {
                context = MessageDigest.getInstance((String)"SHA");
                context.update(signature.toByteArray());
                stringArray[n4] = VKUtil.toHex(context.digest());
                ++n3;
                ++n4;
            }
        }
        return stringArray;
    }

    public static String getHost(String string2) {
        if (string2 != null && string2.length() != 0) {
            int n = string2.indexOf("//");
            int n3 = n == -1 ? 0 : n + 2;
            n = string2.indexOf(47, n3);
            if (n < 0) {
                n = string2.length();
            }
            int n4 = string2.indexOf(58, n3);
            int n5 = n;
            if (n4 > 0) {
                n5 = n;
                if (n4 < n) {
                    n5 = n4;
                }
            }
            return string2.substring(n3, n5);
        }
        return "";
    }

    public static boolean isAppInstalled(Context context, String string2) {
        context = context.getPackageManager();
        boolean bl = true;
        try {
            context.getPackageInfo(string2, 1);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            bl = false;
        }
        return bl;
    }

    public static boolean isIntentAvailable(Context context, String string2) {
        boolean bl = context.getPackageManager().queryIntentActivities(new Intent(string2), 65536).size() > 0;
        return bl;
    }

    public static Map<String, Object> mapFrom(Object ... objectArray) {
        int n;
        int n3 = objectArray.length;
        LinkedHashMap linkedHashMap = new LinkedHashMap(objectArray.length / 2);
        n3 = 0;
        while ((n = n3 + 1) < objectArray.length) {
            Object object;
            Object object2 = objectArray[n3];
            if (object2 != null && (object = objectArray[n]) != null && object2 instanceof String) {
                linkedHashMap.put((Object)((String)object2), object);
            }
            n3 += 2;
        }
        return linkedHashMap;
    }

    public static String md5(String string2) {
        MessageDigest messageDigest = MessageDigest.getInstance((String)"MD5");
        messageDigest.update(string2.getBytes());
        byte[] byArray = messageDigest.digest();
        messageDigest = new StringBuilder();
        int n = byArray.length;
        for (int k = 0; k < n; ++k) {
            string2 = Integer.toHexString((int)(byArray[k] & 0xFF));
            while (string2.length() < 2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("0");
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
            }
            messageDigest.append(string2);
            continue;
        }
        try {
            string2 = messageDigest.toString();
            return string2;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return "";
        }
    }

    public static VKParameters paramsFrom(Object ... objectArray) {
        return new VKParameters(VKUtil.mapFrom(objectArray));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void stringToFile(String string2, String string3) {
        try {
            FileWriter fileWriter = new FileWriter(string2);
            BufferedWriter bufferedWriter = new BufferedWriter((Writer)fileWriter);
            bufferedWriter.write(string3);
            bufferedWriter.flush();
            bufferedWriter.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static String toHex(byte[] byArray) {
        BigInteger bigInteger = new BigInteger(1, byArray);
        return String.format((String)z2.q(z2.t("%0"), byArray.length << 1, "X"), (Object[])new Object[]{bigInteger});
    }
}

