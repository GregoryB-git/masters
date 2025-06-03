/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Map
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api;

import android.net.Uri;
import com.vk.sdk.VKObject;
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.util.VKJsonHelper;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class VKError
extends VKObject {
    private static final String ERROR_DESCRIPTION = "error_description";
    private static final String ERROR_REASON = "error_reason";
    private static final String FAIL = "fail";
    public static final int VK_API_ERROR = -101;
    public static final int VK_CANCELED = -102;
    public static final int VK_JSON_FAILED = -104;
    public static final int VK_REQUEST_HTTP_FAILED = -105;
    public static final int VK_REQUEST_NOT_PREPARED = -103;
    public VKError apiError;
    public String captchaImg;
    public String captchaSid;
    public int errorCode;
    public String errorMessage;
    public String errorReason;
    public Exception httpError;
    public String redirectUri;
    public VKRequest request;
    public ArrayList<Map<String, String>> requestParams;

    public VKError(int n) {
        this.errorCode = n;
    }

    public VKError(Map<String, String> map) {
        this.errorCode = -101;
        this.errorReason = (String)map.get((Object)ERROR_REASON);
        this.errorMessage = Uri.decode((String)((String)map.get((Object)ERROR_DESCRIPTION)));
        if (map.containsKey((Object)FAIL)) {
            this.errorReason = "Action failed";
        }
        if (map.containsKey((Object)"cancel")) {
            this.errorCode = -102;
            this.errorReason = "User canceled request";
        }
    }

    public VKError(JSONObject jSONObject) throws JSONException {
        VKError vKError = new VKError(jSONObject.getInt("error_code"));
        vKError.errorMessage = jSONObject.getString("error_msg");
        vKError.requestParams = (ArrayList)VKJsonHelper.toList(jSONObject.getJSONArray("request_params"));
        if (vKError.errorCode == 14) {
            vKError.captchaImg = jSONObject.getString("captcha_img");
            vKError.captchaSid = jSONObject.getString("captcha_sid");
        }
        if (vKError.errorCode == 17) {
            vKError.redirectUri = jSONObject.getString("redirect_uri");
        }
        this.errorCode = -101;
        this.apiError = vKError;
    }

    private void appendFields(StringBuilder stringBuilder) {
        String string2 = this.errorReason;
        if (string2 != null) {
            stringBuilder.append(String.format((String)"; %s", (Object[])new Object[]{string2}));
        }
        if ((string2 = this.errorMessage) != null) {
            stringBuilder.append(String.format((String)"; %s", (Object[])new Object[]{string2}));
        }
    }

    public static VKError getRegisteredError(long l) {
        return (VKError)VKObject.getRegisteredObject(l);
    }

    public void answerCaptcha(String string2) {
        VKParameters vKParameters = new VKParameters();
        vKParameters.put("captcha_sid", this.captchaSid);
        vKParameters.put("captcha_key", string2);
        this.request.addExtraParameters(vKParameters);
        this.request.repeat();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("VKError (");
        int n = this.errorCode;
        switch (n) {
            default: {
                stringBuilder.append(String.format((String)"code: %d; ", (Object[])new Object[]{n}));
                break;
            }
            case -101: {
                stringBuilder.append("API error");
                VKError vKError = this.apiError;
                if (vKError == null) break;
                stringBuilder.append(vKError.toString());
                break;
            }
            case -102: {
                stringBuilder.append("Canceled");
                break;
            }
            case -103: {
                stringBuilder.append("Request wasn't prepared");
                break;
            }
            case -104: {
                stringBuilder.append("JSON failed");
                break;
            }
            case -105: {
                stringBuilder.append("HTTP failed");
            }
        }
        this.appendFields(stringBuilder);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

