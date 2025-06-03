// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.util.Locale;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import org.json.JSONObject;
import java.util.Map;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.text.i;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

@Metadata
public final class AFc1nSDK
{
    public final AFc1lSDK AFKeystoreWrapper;
    public final ExecutorService valueOf;
    
    public AFc1nSDK() {
    }
    
    public AFc1nSDK(final AFc1lSDK afKeystoreWrapper, final ExecutorService valueOf) {
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.valueOf = valueOf;
    }
    
    @NotNull
    public static final List<StackTraceElement> AFInAppEventParameterName(@NotNull final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "");
        final StackTraceElement[] stackTrace = t.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        final ArrayList<StackTraceElement> list = new ArrayList<StackTraceElement>();
        for (int length = stackTrace.length, i = 0; i < length; ++i) {
            StackTraceElement stackTraceElement = stackTrace[i];
            final String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            if (!i.s(className, "com.appsflyer", false, 2, null)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                list.add(stackTraceElement);
            }
        }
        return list;
    }
    
    public static String AFInAppEventType(final String s) {
        try {
            final MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(s.getBytes(Charset.defaultCharset()));
            return values(instance.digest());
        }
        catch (Exception ex) {
            final StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(s.substring(0, 6));
            sb.append(".. to SHA-256");
            AFLogger.afErrorLog(sb.toString(), ex);
            return null;
        }
    }
    
    public static boolean AFKeystoreWrapper(final Map<String, Object> map, final String[] array, final AFb1gSDK aFb1gSDK) {
        if (map == null) {
            return false;
        }
        if (map.isEmpty()) {
            return false;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            if (!map.containsKey(array[i])) {
                return false;
            }
        }
        final String obj = map.remove("sig");
        if (obj == null) {
            return false;
        }
        final String value = AFb1gSDK.valueOf();
        final StringBuilder sb = new StringBuilder();
        sb.append(new JSONObject((Map)map));
        sb.append(value);
        return valueOf(sb.toString(), AFb1zSDK.valueOf(aFb1gSDK.valueOf, aFb1gSDK.AFInAppEventType)).equals(obj);
    }
    
    public static String valueOf(String lowerCase, final String s) {
        try {
            final Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(s.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            lowerCase = values(instance.doFinal(((String)lowerCase).getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
            return (String)lowerCase;
        }
        catch (InvalidKeyException lowerCase) {}
        catch (NoSuchAlgorithmException ex) {}
        AFLogger.afErrorLog(((Throwable)lowerCase).getMessage(), (Throwable)lowerCase, true);
        return ((Throwable)lowerCase).getMessage();
    }
    
    private static String values(final byte[] array) {
        final StringBuilder sb = new StringBuilder();
        for (int length = array.length, i = 0; i < length; ++i) {
            sb.append(Integer.toString((array[i] & 0xFF) + 256, 16).substring(1));
        }
        return sb.toString();
    }
}
