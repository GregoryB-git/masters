package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
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
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class AFc1nSDK {
    public final AFc1lSDK AFKeystoreWrapper;
    public final ExecutorService valueOf;

    @Metadata
    public static final class AFa1wSDK extends kotlin.jvm.internal.l implements g6.l {
        public static final AFa1wSDK AFKeystoreWrapper = new AFa1wSDK();

        public AFa1wSDK() {
            super(1);
        }

        @Override // g6.l
        public final /* synthetic */ Object invoke(Object obj) {
            StackTraceElement stackTraceElement = (StackTraceElement) obj;
            Intrinsics.checkNotNullParameter(stackTraceElement, "");
            return "at ".concat(String.valueOf(stackTraceElement));
        }
    }

    public AFc1nSDK() {
    }

    public AFc1nSDK(AFc1lSDK aFc1lSDK, ExecutorService executorService) {
        this.AFKeystoreWrapper = aFc1lSDK;
        this.valueOf = executorService;
    }

    @NotNull
    public static final List<StackTraceElement> AFInAppEventParameterName(@NotNull Throwable th) {
        boolean s7;
        Intrinsics.checkNotNullParameter(th, "");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            s7 = kotlin.text.r.s(className, "com.appsflyer", false, 2, null);
            if (!s7) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        return arrayList;
    }

    public static String AFInAppEventType(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return values(messageDigest.digest());
        } catch (Exception e7) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA-256");
            AFLogger.afErrorLog(sb.toString(), e7);
            return null;
        }
    }

    public static boolean AFKeystoreWrapper(Map<String, Object> map, String[] strArr, AFb1gSDK aFb1gSDK) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        String str2 = (String) map.remove("sig");
        if (str2 == null) {
            return false;
        }
        String valueOf = AFb1gSDK.valueOf();
        StringBuilder sb = new StringBuilder();
        sb.append(new JSONObject(map));
        sb.append(valueOf);
        return valueOf(sb.toString(), AFb1zSDK.valueOf(aFb1gSDK.valueOf, aFb1gSDK.AFInAppEventType)).equals(str2);
    }

    public static String valueOf(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return values(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
        } catch (InvalidKeyException | NoSuchAlgorithmException e7) {
            AFLogger.afErrorLog(e7.getMessage(), e7, true);
            return e7.getMessage();
        }
    }

    private static String values(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b7 : bArr) {
            sb.append(Integer.toString((b7 & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }
}
