package com.appsflyer.deeplink;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class DeepLink
{
  public final JSONObject valueOf;
  
  private DeepLink(JSONObject paramJSONObject)
  {
    valueOf = paramJSONObject;
  }
  
  public static DeepLink AFKeystoreWrapper(Map<String, String> paramMap)
  {
    Object localObject = paramMap.keySet();
    ((Set)localObject).removeAll(Arrays.asList(new String[] { "install_time", "pid", "c", "af_prt", "af_mp", "clickid", "af_siteid", "af_sub_siteid", "af_click_lookback", "af_viewthrough_lookback", "af_keywords", "af_cost_model", "af_cost_currency", "af_cost_value", "af_r", "af_web_dp", "af_force_deeplink", "af_ref", "is_incentivized", "af_param_forwarding", "is_retargeting", "af_reengagement_window", "is_branded_link", "is_universal_link", "af_generated_clk", "transaction_id", "af_fp_lookback_window", "af_vt_fp_lookback_window", "af_fp_priority", "af_generate_clk", "af_inactivity_window", "af_ol_red", "af_attr", "af_ol_lp", "af_blank_red", "af_source", "af_lp_src", "af_src_browser", "af_tranid", "af_wrt_clk", "af_ua", "af_ip", "af_lang", "advertising_id", "sha1_advertising_id", "md5_advertising_id", "android_id", "sha1_android_id", "md5_android_id", "imei", "sha1_imei", "md5_imei", "oaid", "sha1_oaid", "md5_oaid", "af_android_url", "sha1_el", "fire_advertising_id", "sha1_fire_advertising_id", "idfa", "md5_idfa", "af_ios_url", "af_ios_fallback", "sha1_idfa", "mac", "sha1_mac", "af_banner", "af_slk_web_endpoint", "af_chrome_lp", "af_android_custom_url", "af_ios_custom_url", "af_enc_data", "engmnt_source", "redirect_response_data", "shortlink", "advertiserId", "sha1_advertiserId", "advertiser_id", "sha1_advertiser_id", "muid", "idfv", "md5_idfv", "sha1_idfv", "af_installpostback", "http_referrer", "af_model", "af_os", "md5_advertiserId", "af_video_total_length", "af_video_played_length", "af_playable_played_length", "af_ad_time_viewed", "af_ad_displayed_percent", "af_audio_total_length", "af_audio_played_length", "af_status", "af_web_id", "af_deeplink" }));
    HashMap localHashMap = new HashMap();
    localObject = ((Set)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      localHashMap.put(str, (String)paramMap.get(str));
    }
    return values(new JSONObject(localHashMap));
  }
  
  public static DeepLink values(JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = paramJSONObject.optJSONObject("custom_params");
    if (localJSONObject != null)
    {
      paramJSONObject.remove("custom_params");
      Iterator localIterator = localJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramJSONObject.put(str, localJSONObject.opt(str));
      }
    }
    return new DeepLink(paramJSONObject);
  }
  
  public String getAfSub1()
  {
    Object localObject1 = valueOf.opt("af_sub1");
    Object localObject2 = localObject1;
    if (localObject1 == JSONObject.NULL) {
      localObject2 = null;
    }
    return (String)localObject2;
  }
  
  public String getAfSub2()
  {
    Object localObject1 = valueOf.opt("af_sub2");
    Object localObject2 = localObject1;
    if (localObject1 == JSONObject.NULL) {
      localObject2 = null;
    }
    return (String)localObject2;
  }
  
  public String getAfSub3()
  {
    Object localObject1 = valueOf.opt("af_sub3");
    Object localObject2 = localObject1;
    if (localObject1 == JSONObject.NULL) {
      localObject2 = null;
    }
    return (String)localObject2;
  }
  
  public String getAfSub4()
  {
    Object localObject1 = valueOf.opt("af_sub4");
    Object localObject2 = localObject1;
    if (localObject1 == JSONObject.NULL) {
      localObject2 = null;
    }
    return (String)localObject2;
  }
  
  public String getAfSub5()
  {
    Object localObject1 = valueOf.opt("af_sub5");
    Object localObject2 = localObject1;
    if (localObject1 == JSONObject.NULL) {
      localObject2 = null;
    }
    return (String)localObject2;
  }
  
  public String getCampaign()
  {
    Object localObject1 = valueOf.opt("campaign");
    Object localObject2 = localObject1;
    if (localObject1 == JSONObject.NULL) {
      localObject2 = null;
    }
    return (String)localObject2;
  }
  
  public String getCampaignId()
  {
    Object localObject1 = valueOf.opt("campaign_id");
    Object localObject2 = localObject1;
    if (localObject1 == JSONObject.NULL) {
      localObject2 = null;
    }
    return (String)localObject2;
  }
  
  public JSONObject getClickEvent()
  {
    return valueOf;
  }
  
  public String getClickHttpReferrer()
  {
    Object localObject1 = valueOf.opt("click_http_referrer");
    Object localObject2 = localObject1;
    if (localObject1 == JSONObject.NULL) {
      localObject2 = null;
    }
    return (String)localObject2;
  }
  
  public String getDeepLinkValue()
  {
    Object localObject1 = valueOf.opt("deep_link_value");
    Object localObject2 = localObject1;
    if (localObject1 == JSONObject.NULL) {
      localObject2 = null;
    }
    return (String)localObject2;
  }
  
  public String getMatchType()
  {
    Object localObject1 = valueOf.opt("match_type");
    Object localObject2 = localObject1;
    if (localObject1 == JSONObject.NULL) {
      localObject2 = null;
    }
    return (String)localObject2;
  }
  
  public String getMediaSource()
  {
    Object localObject1 = valueOf.opt("media_source");
    Object localObject2 = localObject1;
    if (localObject1 == JSONObject.NULL) {
      localObject2 = null;
    }
    return (String)localObject2;
  }
  
  public String getStringValue(String paramString)
  {
    Object localObject = valueOf.opt(paramString);
    paramString = (String)localObject;
    if (localObject == JSONObject.NULL) {
      paramString = null;
    }
    if (paramString == null) {
      return null;
    }
    return String.valueOf(paramString);
  }
  
  public Boolean isDeferred()
  {
    Object localObject1 = valueOf.opt("is_deferred");
    Object localObject2 = localObject1;
    if (localObject1 == JSONObject.NULL) {
      localObject2 = null;
    }
    return (Boolean)localObject2;
  }
  
  public String toString()
  {
    return valueOf.toString();
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.deeplink.DeepLink
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */