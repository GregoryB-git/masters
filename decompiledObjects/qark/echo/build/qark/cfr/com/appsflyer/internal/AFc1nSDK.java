/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.security.InvalidKeyException
 *  java.security.Key
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.concurrent.ExecutorService
 *  javax.crypto.Mac
 *  javax.crypto.spec.SecretKeySpec
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1zSDK;
import com.appsflyer.internal.AFc1lSDK;
import g6.l;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
public final class AFc1nSDK {
    public final AFc1lSDK AFKeystoreWrapper;
    public final ExecutorService valueOf;

    public AFc1nSDK() {
    }

    public AFc1nSDK(AFc1lSDK aFc1lSDK, ExecutorService executorService) {
        this.AFKeystoreWrapper = aFc1lSDK;
        this.valueOf = executorService;
    }

    @NotNull
    public static final List<StackTraceElement> AFInAppEventParameterName(@NotNull Throwable throwable2) {
        Intrinsics.checkNotNullParameter((Object)throwable2, "");
        StackTraceElement[] arrstackTraceElement = throwable2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(arrstackTraceElement, "");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : arrstackTraceElement) {
            void var0_4;
            String string2 = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (!i.s(string2, "com.appsflyer", false, 2, null)) {
                Object var0_3 = null;
            }
            if (var0_4 == null) continue;
            arrayList.add((Object)var0_4);
        }
        return arrayList;
    }

    public static String AFInAppEventType(String string2) {
        try {
            Object object = MessageDigest.getInstance((String)"SHA-256");
            object.update(string2.getBytes(Charset.defaultCharset()));
            object = AFc1nSDK.values(object.digest());
            return object;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder("Error turning ");
            stringBuilder.append(string2.substring(0, 6));
            stringBuilder.append(".. to SHA-256");
            AFLogger.afErrorLog(stringBuilder.toString(), (Throwable)exception);
            return null;
        }
    }

    public static boolean AFKeystoreWrapper(Map<String, Object> map, String[] object, AFb1gSDK aFb1gSDK) {
        if (map != null) {
            if (map.isEmpty()) {
                return false;
            }
            int n8 = object.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (map.containsKey((Object)object[i8])) continue;
                return false;
            }
            object = (String)map.remove((Object)"sig");
            if (object == null) {
                return false;
            }
            String string2 = AFb1gSDK.valueOf();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((Object)new JSONObject(map));
            stringBuilder.append(string2);
            return AFc1nSDK.valueOf(stringBuilder.toString(), AFb1zSDK.valueOf(aFb1gSDK.valueOf, aFb1gSDK.AFInAppEventType)).equals(object);
        }
        return false;
    }

    public static String valueOf(String string2, String string3) {
        void var0_3;
        try {
            Mac mac = Mac.getInstance((String)"HmacSHA256");
            mac.init((Key)new SecretKeySpec(string3.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            string2 = AFc1nSDK.values(mac.doFinal(string2.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
            return string2;
        }
        catch (InvalidKeyException invalidKeyException) {
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            // empty catch block
        }
        AFLogger.afErrorLog(var0_3.getMessage(), (Throwable)var0_3, true);
        return var0_3.getMessage();
    }

    private static String values(byte[] arrby) {
        StringBuilder stringBuilder = new StringBuilder();
        int n8 = arrby.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            stringBuilder.append(Integer.toString((int)((arrby[i8] & 255) + 256), (int)16).substring(1));
        }
        return stringBuilder.toString();
    }

}

