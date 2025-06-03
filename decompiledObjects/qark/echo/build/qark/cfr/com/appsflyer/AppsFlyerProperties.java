/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1dSDK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerProperties {
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    public static final String AF_STORE_FROM_API = "api_store_value";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_OAID = "collectOAID";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_NETWORK_DATA = "disableCollectNetworkData";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String DPM = "disableProxy";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String EXTENSION = "sdkExtension";
    public static final String HTTP_CACHE = "http_cache";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String NEW_REFERRER_SENT = "newGPReferrerSent";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String ONELINK_VERSION = "onelinkVersion";
    public static final String USER_EMAILS = "userEmails";
    public static final String USE_HTTP_FALLBACK = "useHttpFallback";
    private static final AppsFlyerProperties valueOf = new AppsFlyerProperties();
    public boolean AFInAppEventParameterName;
    private final Map<String, Object> AFInAppEventType = new HashMap();
    public String AFKeystoreWrapper;
    private boolean values = false;

    private AppsFlyerProperties() {
    }

    private boolean AFKeystoreWrapper() {
        return this.values;
    }

    public static AppsFlyerProperties getInstance() {
        return valueOf;
    }

    public final boolean AFInAppEventType() {
        return this.AFInAppEventParameterName;
    }

    public boolean getBoolean(String string2, boolean bl) {
        if ((string2 = this.getString(string2)) == null) {
            return bl;
        }
        return Boolean.parseBoolean((String)string2);
    }

    public int getInt(String string2, int n8) {
        if ((string2 = this.getString(string2)) == null) {
            return n8;
        }
        return Integer.parseInt((String)string2);
    }

    public long getLong(String string2, long l8) {
        if ((string2 = this.getString(string2)) == null) {
            return l8;
        }
        return Long.parseLong((String)string2);
    }

    public Object getObject(String object) {
        synchronized (this) {
            object = this.AFInAppEventType.get(object);
            return object;
        }
    }

    public String getReferrer(AFb1dSDK aFb1dSDK) {
        String string2 = this.AFKeystoreWrapper;
        if (string2 != null) {
            return string2;
        }
        if (this.getString("AF_REFERRER") != null) {
            return this.getString("AF_REFERRER");
        }
        return aFb1dSDK.values("referrer", null);
    }

    public String getString(String string2) {
        synchronized (this) {
            string2 = (String)this.AFInAppEventType.get((Object)string2);
            return string2;
        }
    }

    public boolean isEnableLog() {
        AFLogger.LogLevel logLevel = AFLogger.LogLevel.NONE;
        if (this.getInt("logLevel", logLevel.getLevel()) > logLevel.getLevel()) {
            return true;
        }
        return false;
    }

    public boolean isLogsDisabledCompletely() {
        return this.getBoolean("disableLogs", false);
    }

    public boolean isOtherSdkStringDisabled() {
        return this.getBoolean("disableOtherSdk", false);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void loadProperties(AFb1dSDK aFb1dSDK) {
        block11 : {
            block12 : {
                block10 : {
                    // MONITORENTER : this
                    boolean bl = this.AFKeystoreWrapper();
                    if (!bl) break block10;
                    // MONITOREXIT : this
                    return;
                }
                String string2 = aFb1dSDK.values("savedProperties", null);
                if (string2 == null) break block11;
                AFLogger.afDebugLog("Loading properties..");
                string2 = new JSONObject(string2);
                Iterator iterator = string2.keys();
                while (iterator.hasNext()) {
                    String string3 = (String)iterator.next();
                    if (this.AFInAppEventType.get((Object)string3) != null) continue;
                    this.AFInAppEventType.put((Object)string3, (Object)string2.getString(string3));
                }
                for (int i8 = 0; i8 < 3; ++i8) {
                    string2 = new String[]{"AppsFlyerKey", "custom_host", "custom_host_prefix"}[i8];
                    this.AFInAppEventType.remove((Object)string2);
                }
                this.saveProperties(aFb1dSDK);
                this.values = true;
                break block12;
                catch (JSONException jSONException) {}
                AFLogger.afErrorLog("Failed loading properties", (Throwable)jSONException);
            }
            aFb1dSDK = new StringBuilder("Done loading properties: ");
            aFb1dSDK.append(this.values);
            AFLogger.afDebugLog(aFb1dSDK.toString());
        }
        // MONITOREXIT : this
    }

    public void remove(String string2) {
        synchronized (this) {
            this.AFInAppEventType.remove((Object)string2);
            return;
        }
    }

    public void saveProperties(AFb1dSDK aFb1dSDK) {
        synchronized (this) {
            this.AFInAppEventType.remove((Object)"AppsFlyerKey");
            aFb1dSDK.AFInAppEventParameterName("savedProperties", new JSONObject(this.AFInAppEventType).toString());
            return;
        }
    }

    public void set(String string2, int n8) {
        synchronized (this) {
            this.AFInAppEventType.put((Object)string2, (Object)Integer.toString((int)n8));
            return;
        }
    }

    public void set(String string2, long l8) {
        synchronized (this) {
            this.AFInAppEventType.put((Object)string2, (Object)Long.toString((long)l8));
            return;
        }
    }

    public void set(String string2, String string3) {
        synchronized (this) {
            this.AFInAppEventType.put((Object)string2, (Object)string3);
            return;
        }
    }

    public void set(String string2, boolean bl) {
        synchronized (this) {
            this.AFInAppEventType.put((Object)string2, (Object)Boolean.toString((boolean)bl));
            return;
        }
    }

    public void set(String string2, String[] arrstring) {
        synchronized (this) {
            this.AFInAppEventType.put((Object)string2, (Object)arrstring);
            return;
        }
    }

    public void setCustomData(String string2) {
        synchronized (this) {
            this.AFInAppEventType.put((Object)"additionalCustomData", (Object)string2);
            return;
        }
    }

    public void setUserEmails(String string2) {
        synchronized (this) {
            this.AFInAppEventType.put((Object)"userEmails", (Object)string2);
            return;
        }
    }

    public static final class EmailsCryptType
    extends Enum<EmailsCryptType> {
        public static final /* enum */ EmailsCryptType NONE;
        public static final /* enum */ EmailsCryptType SHA256;
        private static final /* synthetic */ EmailsCryptType[] valueOf;
        private final int AFInAppEventType;

        static {
            EmailsCryptType emailsCryptType;
            EmailsCryptType emailsCryptType2;
            NONE = emailsCryptType2 = new EmailsCryptType(0);
            SHA256 = emailsCryptType = new EmailsCryptType(3);
            valueOf = new EmailsCryptType[]{emailsCryptType2, emailsCryptType};
        }

        private EmailsCryptType(int n9) {
            this.AFInAppEventType = n9;
        }

        public static EmailsCryptType valueOf(String string2) {
            return (EmailsCryptType)Enum.valueOf(EmailsCryptType.class, (String)string2);
        }

        public static EmailsCryptType[] values() {
            return (EmailsCryptType[])valueOf.clone();
        }

        public final int getValue() {
            return this.AFInAppEventType;
        }
    }

}

