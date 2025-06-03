/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.preference.PreferenceManager
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.HashMap
 *  java.util.Map
 */
package com.vk.sdk;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.sdk.VKUIHelper;
import com.vk.sdk.util.VKStringJoiner;
import com.vk.sdk.util.VKUtil;
import java.util.HashMap;
import java.util.Map;

public class VKAccessToken {
    public static final String ACCESS_TOKEN = "access_token";
    public static final String CREATED = "created";
    public static final String EMAIL = "email";
    public static final String EXPIRES_IN = "expires_in";
    public static final String HTTPS_REQUIRED = "https_required";
    public static final String SCOPE = "scope";
    public static final String SECRET = "secret";
    public static final String SUCCESS = "success";
    public static final String USER_ID = "user_id";
    private static final String VK_SDK_ACCESS_TOKEN_PREF_KEY = "VK_SDK_ACCESS_TOKEN_PLEASE_DONT_TOUCH";
    private static volatile VKAccessToken sCurrentToken;
    public String accessToken = null;
    public long created = 0L;
    public String email = null;
    public int expiresIn = 0;
    public boolean httpsRequired = false;
    private Map<String, Boolean> scope = null;
    public String secret = null;
    public String userId = null;

    private VKAccessToken() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static VKAccessToken currentToken() {
        if (sCurrentToken != null) return sCurrentToken;
        Class<VKAccessToken> clazz = VKAccessToken.class;
        synchronized (VKAccessToken.class) {
            if (sCurrentToken != null) return sCurrentToken;
            sCurrentToken = VKAccessToken.tokenFromSharedPreferences(VKUIHelper.getApplicationContext(), VK_SDK_ACCESS_TOKEN_PREF_KEY);
            // ** MonitorExit[var1] (shouldn't be in output)
            return sCurrentToken;
        }
    }

    public static void removeTokenAtKey(Context context, String string2) {
        if (context == null) {
            return;
        }
        context = PreferenceManager.getDefaultSharedPreferences((Context)context).edit();
        context.remove(string2);
        context.apply();
    }

    public static VKAccessToken replaceToken(@NonNull Context context, @Nullable VKAccessToken vKAccessToken) {
        VKAccessToken vKAccessToken2 = sCurrentToken;
        sCurrentToken = vKAccessToken;
        if (sCurrentToken != null) {
            sCurrentToken.save();
        } else {
            VKAccessToken.removeTokenAtKey(context, VK_SDK_ACCESS_TOKEN_PREF_KEY);
        }
        return vKAccessToken2;
    }

    public static VKAccessToken tokenFromFile(String object) {
        try {
            object = VKAccessToken.tokenFromUrlString(VKUtil.fileToString((String)object));
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static VKAccessToken tokenFromParameters(@Nullable Map<String, String> object) {
        void var3_10;
        Object var4_3;
        Object var3_4 = var4_3 = null;
        if (object == null) return var3_10;
        if (object.size() == 0) {
            Object var3_5 = var4_3;
            return var3_10;
        }
        VKAccessToken vKAccessToken = new VKAccessToken();
        try {
            String[] stringArray;
            vKAccessToken.accessToken = (String)object.get((Object)ACCESS_TOKEN);
            vKAccessToken.userId = (String)object.get((Object)USER_ID);
            vKAccessToken.secret = (String)object.get((Object)SECRET);
            vKAccessToken.email = (String)object.get((Object)EMAIL);
            int n = 0;
            vKAccessToken.httpsRequired = false;
            if (object.get((Object)EXPIRES_IN) != null) {
                vKAccessToken.expiresIn = Integer.parseInt((String)((String)object.get((Object)EXPIRES_IN)));
            }
            if ((stringArray = (String[])object.get((Object)SCOPE)) != null) {
                HashMap hashMap = new HashMap();
                stringArray = stringArray.split(",");
                int n3 = stringArray.length;
                while (n < n3) {
                    hashMap.put((Object)stringArray[n], (Object)Boolean.TRUE);
                    ++n;
                }
                vKAccessToken.scope = hashMap;
            }
            if (object.containsKey((Object)HTTPS_REQUIRED)) {
                vKAccessToken.httpsRequired = ((String)object.get((Object)HTTPS_REQUIRED)).equals((Object)"1");
            } else if (vKAccessToken.secret == null) {
                vKAccessToken.httpsRequired = true;
            }
            vKAccessToken.created = object.containsKey((Object)CREATED) ? Long.parseLong((String)((String)object.get((Object)CREATED))) : System.currentTimeMillis();
            String string2 = vKAccessToken.accessToken;
            Object var3_8 = var4_3;
            if (string2 == null) return var3_10;
            VKAccessToken vKAccessToken2 = vKAccessToken;
            return var3_10;
        }
        catch (Exception exception) {
            Object var3_11 = var4_3;
            return var3_10;
        }
    }

    public static VKAccessToken tokenFromSharedPreferences(Context context, String string2) {
        return VKAccessToken.tokenFromUrlString(PreferenceManager.getDefaultSharedPreferences((Context)context).getString(string2, null));
    }

    public static VKAccessToken tokenFromUrlString(String string2) {
        if (string2 == null) {
            return null;
        }
        return VKAccessToken.tokenFromParameters(VKUtil.explodeQueryString(string2));
    }

    public VKAccessToken copyWithToken(@NonNull VKAccessToken vKAccessToken) {
        Map<String, String> map = this.tokenParams();
        map.putAll(vKAccessToken.tokenParams());
        return VKAccessToken.tokenFromParameters(map);
    }

    public boolean hasScope(String ... stringArray) {
        boolean bl;
        block2: {
            int n = stringArray.length;
            bl = false;
            for (int k = 0; k < n; ++k) {
                String string2 = stringArray[k];
                if (this.scope.get((Object)string2) != null) {
                    continue;
                }
                break block2;
            }
            bl = true;
        }
        return bl;
    }

    public boolean isExpired() {
        int n = this.expiresIn;
        boolean bl = n > 0 && (long)(n * 1000) + this.created < System.currentTimeMillis();
        return bl;
    }

    public void save() {
        this.saveTokenToSharedPreferences(VKUIHelper.getApplicationContext(), VK_SDK_ACCESS_TOKEN_PREF_KEY);
    }

    public void saveTokenToFile(String string2) {
        VKUtil.stringToFile(string2, this.serialize());
    }

    public void saveTokenToSharedPreferences(Context context, String string2) {
        if (context == null) {
            return;
        }
        context = PreferenceManager.getDefaultSharedPreferences((Context)context).edit();
        context.putString(string2, this.serialize());
        context.apply();
    }

    public String serialize() {
        return VKStringJoiner.joinParams(this.tokenParams());
    }

    public Map<String, String> tokenParams() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)ACCESS_TOKEN, (Object)this.accessToken);
        Object object = new Map<String, Boolean>();
        object.append("");
        object.append(this.expiresIn);
        hashMap.put((Object)EXPIRES_IN, (Object)object.toString());
        hashMap.put((Object)USER_ID, (Object)this.userId);
        object = new StringBuilder();
        object.append("");
        object.append(this.created);
        hashMap.put((Object)CREATED, (Object)object.toString());
        object = this.scope;
        if (object != null) {
            hashMap.put((Object)SCOPE, (Object)TextUtils.join((CharSequence)",", (Iterable)object.keySet()));
        }
        if ((object = this.secret) != null) {
            hashMap.put((Object)SECRET, object);
        }
        if (this.httpsRequired) {
            hashMap.put((Object)HTTPS_REQUIRED, (Object)"1");
        }
        if ((object = this.email) != null) {
            hashMap.put((Object)EMAIL, object);
        }
        return hashMap;
    }
}

