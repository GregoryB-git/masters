// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.Arrays;
import java.util.HashMap;
import androidx.annotation.NonNull;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.lang.reflect.Array;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;
import android.app.Application;
import android.app.Activity;
import android.content.Context;
import java.util.regex.Matcher;
import com.appsflyer.AFLogger;
import android.util.Base64;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.Scanner;

public final class AFa1rSDK
{
    public String AFInAppEventParameterName;
    public AFd1vSDK AFInAppEventType;
    String AFKeystoreWrapper;
    public String valueOf;
    private byte[] values;
    
    public AFa1rSDK() {
    }
    
    public AFa1rSDK(final String valueOf, final byte[] values, final String afKeystoreWrapper, final AFd1vSDK afInAppEventType) {
        this.valueOf = valueOf;
        this.values = values;
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.AFInAppEventType = afInAppEventType;
    }
    
    public AFa1rSDK(char[] trim) {
        final Scanner scanner = new Scanner(new String(trim));
        int int1 = 0;
        int int2 = 0;
        while (scanner.hasNextLine()) {
            final String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.valueOf = nextLine.substring(4).trim();
            }
            else if (nextLine.startsWith("version=")) {
                this.AFKeystoreWrapper = nextLine.substring(8).trim();
                final Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.AFKeystoreWrapper);
                if (!matcher.matches()) {
                    continue;
                }
                int1 = Integer.parseInt(matcher.group(1));
                int2 = Integer.parseInt(matcher.group(2));
            }
            else if (nextLine.startsWith("data=")) {
                final String trim2 = nextLine.substring(5).trim();
                byte[] values;
                if (int1 <= 4 && int2 < 11) {
                    values = trim2.getBytes(Charset.defaultCharset());
                }
                else {
                    values = Base64.decode(trim2, 2);
                }
                this.values = values;
            }
            else {
                if (!nextLine.startsWith("type=")) {
                    continue;
                }
                trim = (char[])(Object)nextLine.substring(5).trim();
                try {
                    this.AFInAppEventType = AFd1vSDK.valueOf((String)(Object)trim);
                }
                catch (Exception ex) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf((Object)trim)), ex);
                }
            }
        }
        scanner.close();
    }
    
    public static AFe1tSDK AFInAppEventParameterName(final Context context) {
        if (context instanceof Activity) {
            return AFe1tSDK.AFInAppEventType;
        }
        if (context instanceof Application) {
            return AFe1tSDK.AFInAppEventParameterName;
        }
        return AFe1tSDK.values;
    }
    
    private static Object AFInAppEventType(final Object o) {
        if (o == null) {
            return JSONObject.NULL;
        }
        Object null = o;
        if (o instanceof JSONArray) {
            return null;
        }
        if (o instanceof JSONObject) {
            return o;
        }
        if (o.equals(JSONObject.NULL)) {
            return o;
        }
        while (true) {
            while (true) {
                try {
                    if (o instanceof Collection) {
                        final JSONArray jsonArray = new JSONArray();
                        final Iterator<Object> iterator = (Iterator<Object>)((Collection)o).iterator();
                        while (iterator.hasNext()) {
                            jsonArray.put(AFInAppEventType(iterator.next()));
                        }
                        return jsonArray;
                    }
                    if (o.getClass().isArray()) {
                        final int length = Array.getLength(o);
                        final JSONArray jsonArray2 = new JSONArray();
                        for (int i = 0; i < length; ++i) {
                            jsonArray2.put(AFInAppEventType(Array.get(o, i)));
                        }
                        return jsonArray2;
                    }
                    if (o instanceof Map) {
                        return AFInAppEventType((Map<String, ?>)o);
                    }
                    Object string = o;
                    if (!(o instanceof Boolean)) {
                        string = o;
                        if (!(o instanceof Byte)) {
                            string = o;
                            if (!(o instanceof Character)) {
                                string = o;
                                if (!(o instanceof Double)) {
                                    string = o;
                                    if (!(o instanceof Float)) {
                                        string = o;
                                        if (!(o instanceof Integer)) {
                                            string = o;
                                            if (!(o instanceof Long)) {
                                                string = o;
                                                if (!(o instanceof Short)) {
                                                    if (o instanceof String) {
                                                        return o;
                                                    }
                                                    string = o.toString();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return string;
                    null = JSONObject.NULL;
                    return null;
                }
                catch (Exception ex) {}
                continue;
            }
        }
    }
    
    private static List<Object> AFInAppEventType(final JSONArray jsonArray) {
        final ArrayList<List> list = new ArrayList<List>();
        for (int i = 0; i < jsonArray.length(); ++i) {
            final Object value = jsonArray.get(i);
            Object o;
            if (value instanceof JSONArray) {
                o = AFInAppEventType((JSONArray)value);
            }
            else {
                o = value;
                if (value instanceof JSONObject) {
                    o = valueOf((JSONObject)value);
                }
            }
            list.add((List)o);
        }
        return (List<Object>)list;
    }
    
    public static JSONObject AFInAppEventType(Map<String, ?> iterator) {
        final JSONObject jsonObject = new JSONObject();
        iterator = ((Map<Object, Object>)iterator).entrySet().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                return jsonObject;
            }
            final Map.Entry<Object, Object> entry = iterator.next();
            final Object afInAppEventType = AFInAppEventType(entry.getValue());
            try {
                jsonObject.put((String)entry.getKey(), afInAppEventType);
                continue;
            }
            catch (JSONException ex) {}
        }
    }
    
    public static Map<String, Object> valueOf(@NonNull final JSONObject jsonObject) {
        final HashMap<String, List> hashMap = new HashMap<String, List>();
        final Iterator keys = jsonObject.keys();
        while (keys.hasNext()) {
            final String s = keys.next();
            final Object value = jsonObject.get(s);
            Object o;
            if (value instanceof JSONArray) {
                o = AFInAppEventType((JSONArray)value);
            }
            else {
                o = value;
                if (value instanceof JSONObject) {
                    o = valueOf((JSONObject)value);
                }
            }
            hashMap.put(s, (List)o);
        }
        return (Map<String, Object>)hashMap;
    }
    
    public static JSONObject valueOf(final String s) {
        if (s == null) {
            return null;
        }
        try {
            return new JSONObject(s);
        }
        catch (JSONException ex) {
            return null;
        }
    }
    
    public final byte[] AFInAppEventType() {
        return this.values;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (AFa1rSDK.class != o.getClass()) {
                return false;
            }
            final AFa1rSDK aFa1rSDK = (AFa1rSDK)o;
            final String afKeystoreWrapper = this.AFKeystoreWrapper;
            if (afKeystoreWrapper != null) {
                if (!afKeystoreWrapper.equals(aFa1rSDK.AFKeystoreWrapper)) {
                    return false;
                }
            }
            else if (aFa1rSDK.AFKeystoreWrapper != null) {
                return false;
            }
            if (!Arrays.equals(this.values, aFa1rSDK.values)) {
                return false;
            }
            final String valueOf = this.valueOf;
            if (valueOf != null) {
                if (!valueOf.equals(aFa1rSDK.valueOf)) {
                    return false;
                }
            }
            else if (aFa1rSDK.valueOf != null) {
                return false;
            }
            final String afInAppEventParameterName = this.AFInAppEventParameterName;
            if (afInAppEventParameterName != null) {
                if (!afInAppEventParameterName.equals(aFa1rSDK.AFInAppEventParameterName)) {
                    return false;
                }
            }
            else if (aFa1rSDK.AFInAppEventParameterName != null) {
                return false;
            }
            if (this.AFInAppEventType == aFa1rSDK.AFInAppEventType) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String afKeystoreWrapper = this.AFKeystoreWrapper;
        int hashCode = 0;
        int hashCode2;
        if (afKeystoreWrapper != null) {
            hashCode2 = afKeystoreWrapper.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int hashCode3 = Arrays.hashCode(this.values);
        final String valueOf = this.valueOf;
        int hashCode4;
        if (valueOf != null) {
            hashCode4 = valueOf.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final String afInAppEventParameterName = this.AFInAppEventParameterName;
        int hashCode5;
        if (afInAppEventParameterName != null) {
            hashCode5 = afInAppEventParameterName.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final AFd1vSDK afInAppEventType = this.AFInAppEventType;
        if (afInAppEventType != null) {
            hashCode = afInAppEventType.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
}
