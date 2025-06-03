/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.util.Base64
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Array
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Scanner
 *  java.util.Set
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFe1tSDK;
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
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFa1rSDK {
    public String AFInAppEventParameterName;
    public AFd1vSDK AFInAppEventType;
    String AFKeystoreWrapper;
    public String valueOf;
    private byte[] values;

    public AFa1rSDK() {
    }

    public AFa1rSDK(String string2, byte[] arrby, String string3, AFd1vSDK aFd1vSDK) {
        this.valueOf = string2;
        this.values = arrby;
        this.AFKeystoreWrapper = string3;
        this.AFInAppEventType = aFd1vSDK;
    }

    public AFa1rSDK(char[] object) {
        Scanner scanner = new Scanner(new String((char[])object));
        int n8 = 0;
        int n9 = 0;
        while (scanner.hasNextLine()) {
            object = scanner.nextLine();
            if (object.startsWith("url=")) {
                this.valueOf = object.substring(4).trim();
                continue;
            }
            if (object.startsWith("version=")) {
                this.AFKeystoreWrapper = object.substring(8).trim();
                object = Pattern.compile((String)"^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher((CharSequence)this.AFKeystoreWrapper);
                if (!object.matches()) continue;
                n8 = Integer.parseInt((String)object.group(1));
                n9 = Integer.parseInt((String)object.group(2));
                continue;
            }
            if (object.startsWith("data=")) {
                object = object.substring(5).trim();
                object = n8 <= 4 && n9 < 11 ? object.getBytes(Charset.defaultCharset()) : Base64.decode((String)object, (int)2);
                this.values = object;
                continue;
            }
            if (!object.startsWith("type=")) continue;
            object = object.substring(5).trim();
            try {
                this.AFInAppEventType = AFd1vSDK.valueOf((String)object);
            }
            catch (Exception exception) {
                AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf((Object)object)), (Throwable)exception);
            }
        }
        scanner.close();
    }

    public static AFe1tSDK AFInAppEventParameterName(Context context) {
        if (context instanceof Activity) {
            return AFe1tSDK.AFInAppEventType;
        }
        if (context instanceof Application) {
            return AFe1tSDK.AFInAppEventParameterName;
        }
        return AFe1tSDK.values;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Object AFInAppEventType(Object object) {
        Object object2;
        block14 : {
            if (object == null) {
                return JSONObject.NULL;
            }
            object2 = object;
            if (object instanceof JSONArray) return object2;
            if (object instanceof JSONObject) {
                return object;
            }
            if (object.equals(JSONObject.NULL)) {
                return object;
            }
            if (object instanceof Collection) {
                object2 = new JSONArray();
                object = ((Collection)object).iterator();
                while (object.hasNext()) {
                    object2.put(AFa1rSDK.AFInAppEventType(object.next()));
                }
                return object2;
            }
            if (!object.getClass().isArray()) break block14;
            int n8 = Array.getLength((Object)object);
            object2 = new JSONArray();
            int n9 = 0;
            while (n9 < n8) {
                object2.put(AFa1rSDK.AFInAppEventType(Array.get((Object)object, (int)n9)));
                ++n9;
            }
            return object2;
        }
        try {
            if (object instanceof Map) {
                return AFa1rSDK.AFInAppEventType((Map)object);
            }
            object2 = object;
        }
        catch (Exception exception) {
            return JSONObject.NULL;
        }
        if (object instanceof Boolean) return object2;
        object2 = object;
        if (object instanceof Byte) return object2;
        object2 = object;
        if (object instanceof Character) return object2;
        object2 = object;
        if (object instanceof Double) return object2;
        object2 = object;
        if (object instanceof Float) return object2;
        object2 = object;
        if (object instanceof Integer) return object2;
        object2 = object;
        if (object instanceof Long) return object2;
        object2 = object;
        if (object instanceof Short) return object2;
        if (object instanceof String) {
            return object;
        }
        return object.toString();
    }

    private static List<Object> AFInAppEventType(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); ++i8) {
            List<Object> list;
            List<Object> list2 = jSONArray.get(i8);
            if (list2 instanceof JSONArray) {
                list = AFa1rSDK.AFInAppEventType((JSONArray)list2);
            } else {
                list = list2;
                if (list2 instanceof JSONObject) {
                    list = AFa1rSDK.valueOf((JSONObject)list2);
                }
            }
            arrayList.add(list);
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static JSONObject AFInAppEventType(Map<String, ?> iterator) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : iterator.entrySet()) {
            Object object = AFa1rSDK.AFInAppEventType(entry.getValue());
            try {
                jSONObject.put((String)entry.getKey(), object);
            }
            catch (JSONException jSONException) {}
        }
        return jSONObject;
    }

    public static Map<String, Object> valueOf(@NonNull JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            List<Object> list;
            String string2 = (String)iterator.next();
            List<Object> list2 = jSONObject.get(string2);
            if (list2 instanceof JSONArray) {
                list = AFa1rSDK.AFInAppEventType((JSONArray)list2);
            } else {
                list = list2;
                if (list2 instanceof JSONObject) {
                    list = AFa1rSDK.valueOf((JSONObject)list2);
                }
            }
            hashMap.put((Object)string2, list);
        }
        return hashMap;
    }

    public static JSONObject valueOf(String string2) {
        if (string2 == null) {
            return null;
        }
        try {
            string2 = new JSONObject(string2);
            return string2;
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    public final byte[] AFInAppEventType() {
        return this.values;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (AFa1rSDK.class != object.getClass()) {
                return false;
            }
            object = (AFa1rSDK)object;
            String string2 = this.AFKeystoreWrapper;
            if (string2 != null ? !string2.equals((Object)object.AFKeystoreWrapper) : object.AFKeystoreWrapper != null) {
                return false;
            }
            if (!Arrays.equals((byte[])this.values, (byte[])object.values)) {
                return false;
            }
            string2 = this.valueOf;
            if (string2 != null ? !string2.equals((Object)object.valueOf) : object.valueOf != null) {
                return false;
            }
            string2 = this.AFInAppEventParameterName;
            if (string2 != null ? !string2.equals((Object)object.AFInAppEventParameterName) : object.AFInAppEventParameterName != null) {
                return false;
            }
            if (this.AFInAppEventType == object.AFInAppEventType) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object object = this.AFKeystoreWrapper;
        int n8 = 0;
        int n9 = object != null ? object.hashCode() : 0;
        int n10 = Arrays.hashCode((byte[])this.values);
        object = this.valueOf;
        int n11 = object != null ? object.hashCode() : 0;
        object = this.AFInAppEventParameterName;
        int n12 = object != null ? object.hashCode() : 0;
        object = this.AFInAppEventType;
        if (object != null) {
            n8 = object.hashCode();
        }
        return (((n9 * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n8;
    }
}

