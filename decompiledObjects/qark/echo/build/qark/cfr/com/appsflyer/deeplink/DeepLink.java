/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONObject
 */
package com.appsflyer.deeplink;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class DeepLink {
    public final JSONObject valueOf;

    private DeepLink(JSONObject jSONObject) {
        this.valueOf = jSONObject;
    }

    public static DeepLink AFKeystoreWrapper(Map<String, String> map) {
        Set set = map.keySet();
        set.removeAll((Collection)Arrays.asList((Object[])new String[]{"install_time", "pid", "c", "af_prt", "af_mp", "clickid", "af_siteid", "af_sub_siteid", "af_click_lookback", "af_viewthrough_lookback", "af_keywords", "af_cost_model", "af_cost_currency", "af_cost_value", "af_r", "af_web_dp", "af_force_deeplink", "af_ref", "is_incentivized", "af_param_forwarding", "is_retargeting", "af_reengagement_window", "is_branded_link", "is_universal_link", "af_generated_clk", "transaction_id", "af_fp_lookback_window", "af_vt_fp_lookback_window", "af_fp_priority", "af_generate_clk", "af_inactivity_window", "af_ol_red", "af_attr", "af_ol_lp", "af_blank_red", "af_source", "af_lp_src", "af_src_browser", "af_tranid", "af_wrt_clk", "af_ua", "af_ip", "af_lang", "advertising_id", "sha1_advertising_id", "md5_advertising_id", "android_id", "sha1_android_id", "md5_android_id", "imei", "sha1_imei", "md5_imei", "oaid", "sha1_oaid", "md5_oaid", "af_android_url", "sha1_el", "fire_advertising_id", "sha1_fire_advertising_id", "idfa", "md5_idfa", "af_ios_url", "af_ios_fallback", "sha1_idfa", "mac", "sha1_mac", "af_banner", "af_slk_web_endpoint", "af_chrome_lp", "af_android_custom_url", "af_ios_custom_url", "af_enc_data", "engmnt_source", "redirect_response_data", "shortlink", "advertiserId", "sha1_advertiserId", "advertiser_id", "sha1_advertiser_id", "muid", "idfv", "md5_idfv", "sha1_idfv", "af_installpostback", "http_referrer", "af_model", "af_os", "md5_advertiserId", "af_video_total_length", "af_video_played_length", "af_playable_played_length", "af_ad_time_viewed", "af_ad_displayed_percent", "af_audio_total_length", "af_audio_played_length", "af_status", "af_web_id", "af_deeplink"}));
        HashMap hashMap = new HashMap();
        for (String string2 : set) {
            hashMap.put((Object)string2, (Object)((String)map.get((Object)string2)));
        }
        return DeepLink.values(new JSONObject((Map)hashMap));
    }

    public static DeepLink values(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.optJSONObject("custom_params");
        if (jSONObject2 != null) {
            jSONObject.remove("custom_params");
            Iterator iterator = jSONObject2.keys();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                jSONObject.put(string2, jSONObject2.opt(string2));
            }
        }
        return new DeepLink(jSONObject);
    }

    public String getAfSub1() {
        Object object;
        Object object2 = object = this.valueOf.opt("af_sub1");
        if (object == JSONObject.NULL) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getAfSub2() {
        Object object;
        Object object2 = object = this.valueOf.opt("af_sub2");
        if (object == JSONObject.NULL) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getAfSub3() {
        Object object;
        Object object2 = object = this.valueOf.opt("af_sub3");
        if (object == JSONObject.NULL) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getAfSub4() {
        Object object;
        Object object2 = object = this.valueOf.opt("af_sub4");
        if (object == JSONObject.NULL) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getAfSub5() {
        Object object;
        Object object2 = object = this.valueOf.opt("af_sub5");
        if (object == JSONObject.NULL) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getCampaign() {
        Object object;
        Object object2 = object = this.valueOf.opt("campaign");
        if (object == JSONObject.NULL) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getCampaignId() {
        Object object;
        Object object2 = object = this.valueOf.opt("campaign_id");
        if (object == JSONObject.NULL) {
            object2 = null;
        }
        return (String)object2;
    }

    public JSONObject getClickEvent() {
        return this.valueOf;
    }

    public String getClickHttpReferrer() {
        Object object;
        Object object2 = object = this.valueOf.opt("click_http_referrer");
        if (object == JSONObject.NULL) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getDeepLinkValue() {
        Object object;
        Object object2 = object = this.valueOf.opt("deep_link_value");
        if (object == JSONObject.NULL) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getMatchType() {
        Object object;
        Object object2 = object = this.valueOf.opt("match_type");
        if (object == JSONObject.NULL) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getMediaSource() {
        Object object;
        Object object2 = object = this.valueOf.opt("media_source");
        if (object == JSONObject.NULL) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getStringValue(String object) {
        Object object2;
        object = object2 = this.valueOf.opt((String)object);
        if (object2 == JSONObject.NULL) {
            object = null;
        }
        if (object == null) {
            return null;
        }
        return String.valueOf((Object)object);
    }

    public Boolean isDeferred() {
        Object object;
        Object object2 = object = this.valueOf.opt("is_deferred");
        if (object == JSONObject.NULL) {
            object2 = null;
        }
        return (Boolean)object2;
    }

    public String toString() {
        return this.valueOf.toString();
    }
}

