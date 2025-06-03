package com.yandex.metrica;

import java.util.Map;

@Deprecated
public abstract interface IIdentifierCallback
{
  public static final String APP_METRICA_DEVICE_ID_HASH = "appmetrica_device_id_hash";
  public static final String YANDEX_MOBILE_METRICA_DEVICE_ID = "yandex_mobile_metrica_device_id";
  public static final String YANDEX_MOBILE_METRICA_GET_AD_URL = "yandex_mobile_metrica_get_ad_url";
  public static final String YANDEX_MOBILE_METRICA_REPORT_AD_URL = "yandex_mobile_metrica_report_ad_url";
  public static final String YANDEX_MOBILE_METRICA_UUID = "yandex_mobile_metrica_uuid";
  
  public abstract void onReceive(Map<String, String> paramMap);
  
  public abstract void onRequestError(Reason paramReason);
  
  public static enum Reason
  {
    static
    {
      NETWORK = new Reason("NETWORK", 1);
      INVALID_RESPONSE = new Reason("INVALID_RESPONSE", 2);
    }
    
    private Reason() {}
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.IIdentifierCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */