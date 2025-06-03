package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1rSDK {
    public String AFInAppEventParameterName;
    public AFd1vSDK AFInAppEventType;
    String AFKeystoreWrapper;
    public String valueOf;
    private byte[] values;

    public AFa1rSDK() {
    }

    public AFa1rSDK(String str, byte[] bArr, String str2, AFd1vSDK aFd1vSDK) {
        this.valueOf = str;
        this.values = bArr;
        this.AFKeystoreWrapper = str2;
        this.AFInAppEventType = aFd1vSDK;
    }

    public static AFe1tSDK AFInAppEventParameterName(Context context) {
        return context instanceof Activity ? AFe1tSDK.activity : context instanceof Application ? AFe1tSDK.application : AFe1tSDK.other;
    }

    private static Object AFInAppEventType(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(AFInAppEventType(it.next()));
                }
                return jSONArray;
            }
            if (!obj.getClass().isArray()) {
                return obj instanceof Map ? AFInAppEventType((Map<String, ?>) obj) : ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
            int length = Array.getLength(obj);
            JSONArray jSONArray2 = new JSONArray();
            for (int i7 = 0; i7 < length; i7++) {
                jSONArray2.put(AFInAppEventType(Array.get(obj, i7)));
            }
            return jSONArray2;
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static Map<String, Object> valueOf(@NonNull JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = AFInAppEventType((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = valueOf((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFa1rSDK.class == obj.getClass()) {
            AFa1rSDK aFa1rSDK = (AFa1rSDK) obj;
            String str = this.AFKeystoreWrapper;
            if (str == null ? aFa1rSDK.AFKeystoreWrapper != null : !str.equals(aFa1rSDK.AFKeystoreWrapper)) {
                return false;
            }
            if (!Arrays.equals(this.values, aFa1rSDK.values)) {
                return false;
            }
            String str2 = this.valueOf;
            if (str2 == null ? aFa1rSDK.valueOf != null : !str2.equals(aFa1rSDK.valueOf)) {
                return false;
            }
            String str3 = this.AFInAppEventParameterName;
            if (str3 == null ? aFa1rSDK.AFInAppEventParameterName != null : !str3.equals(aFa1rSDK.AFInAppEventParameterName)) {
                return false;
            }
            if (this.AFInAppEventType == aFa1rSDK.AFInAppEventType) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.AFKeystoreWrapper;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.values)) * 31;
        String str2 = this.valueOf;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.AFInAppEventParameterName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFd1vSDK aFd1vSDK = this.AFInAppEventType;
        return hashCode3 + (aFd1vSDK != null ? aFd1vSDK.hashCode() : 0);
    }

    public AFa1rSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i7 = 0;
        int i8 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.valueOf = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.AFKeystoreWrapper = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.AFKeystoreWrapper);
                if (matcher.matches()) {
                    i7 = Integer.parseInt(matcher.group(1));
                    i8 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.values = (i7 > 4 || i8 >= 11) ? Base64.decode(trim, 2) : trim.getBytes(Charset.defaultCharset());
            } else if (nextLine.startsWith("type=")) {
                String trim2 = nextLine.substring(5).trim();
                try {
                    this.AFInAppEventType = AFd1vSDK.valueOf(trim2);
                } catch (Exception e7) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(trim2)), e7);
                }
            }
        }
        scanner.close();
    }

    private static List<Object> AFInAppEventType(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj instanceof JSONArray) {
                obj = AFInAppEventType((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = valueOf((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static JSONObject valueOf(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONObject AFInAppEventType(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), AFInAppEventType(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final byte[] AFInAppEventType() {
        return this.values;
    }
}
