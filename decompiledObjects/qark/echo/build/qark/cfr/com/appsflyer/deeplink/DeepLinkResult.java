/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.deeplink;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import org.json.JSONException;
import org.json.JSONObject;

public class DeepLinkResult {
    private final DeepLink deepLink;
    private final Error error;
    @NonNull
    private final Status status;

    /*
     * Enabled aggressive block sorting
     */
    public DeepLinkResult(DeepLink object, Error error) {
        this.deepLink = object;
        this.error = error;
        object = error != null ? Status.ERROR : (object != null ? Status.FOUND : Status.NOT_FOUND);
        this.status = object;
    }

    public DeepLink getDeepLink() {
        return this.deepLink;
    }

    public Error getError() {
        return this.error;
    }

    @NonNull
    public Status getStatus() {
        return this.status;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deepLink", (Object)this.deepLink);
            jSONObject.put("error", (Object)this.error);
            jSONObject.put("status", (Object)this.status);
        }
        catch (JSONException jSONException) {
            AFLogger.afErrorLogForExcManagerOnly("error while creating deep link json", (Throwable)jSONException);
        }
        return jSONObject.toString();
    }

    public static final class Error
    extends Enum<Error> {
        private static final /* synthetic */ Error[] AFKeystoreWrapper;
        public static final /* enum */ Error DEVELOPER_ERROR;
        public static final /* enum */ Error HTTP_STATUS_CODE;
        public static final /* enum */ Error NETWORK;
        public static final /* enum */ Error TIMEOUT;
        public static final /* enum */ Error UNEXPECTED;

        static {
            Error error;
            Error error2;
            Error error3;
            Error error4;
            Error error5;
            TIMEOUT = error4 = new Error();
            NETWORK = error = new Error();
            HTTP_STATUS_CODE = error3 = new Error();
            UNEXPECTED = error5 = new Error();
            DEVELOPER_ERROR = error2 = new Error();
            AFKeystoreWrapper = new Error[]{error4, error, error3, error5, error2};
        }

        private Error() {
        }

        public static Error valueOf(String string2) {
            return (Error)Enum.valueOf(Error.class, (String)string2);
        }

        public static Error[] values() {
            return (Error[])AFKeystoreWrapper.clone();
        }
    }

    public static final class Status
    extends Enum<Status> {
        private static final /* synthetic */ Status[] AFInAppEventType;
        public static final /* enum */ Status ERROR;
        public static final /* enum */ Status FOUND;
        public static final /* enum */ Status NOT_FOUND;

        static {
            Status status;
            Status status2;
            Status status3;
            FOUND = status = new Status();
            NOT_FOUND = status3 = new Status();
            ERROR = status2 = new Status();
            AFInAppEventType = new Status[]{status, status3, status2};
        }

        private Status() {
        }

        public static Status valueOf(String string2) {
            return (Status)Enum.valueOf(Status.class, (String)string2);
        }

        public static Status[] values() {
            return (Status[])AFInAppEventType.clone();
        }
    }

}

