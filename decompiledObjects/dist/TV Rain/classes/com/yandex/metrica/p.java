package com.yandex.metrica;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.L2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

public final class p
{
  private static final List<String> a = Arrays.asList(new String[] { "yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url" });
  
  public static void a(Context paramContext, IIdentifierCallback paramIIdentifierCallback)
  {
    a(paramContext, paramIIdentifierCallback, a);
  }
  
  public static void a(Context paramContext, IIdentifierCallback paramIIdentifierCallback, @NonNull List<String> paramList)
  {
    L2.a(paramContext, paramIIdentifierCallback, new ArrayList(paramList));
  }
  
  public static void a(Context paramContext, IIdentifierCallback paramIIdentifierCallback, @NonNull String... paramVarArgs)
  {
    a(paramContext, paramIIdentifierCallback, Arrays.asList(paramVarArgs));
  }
  
  @Deprecated
  @NonNull
  public static YandexMetricaConfig cpcwh(YandexMetricaConfig paramYandexMetricaConfig, String paramString)
  {
    return L2.a(paramYandexMetricaConfig, paramString);
  }
  
  @NonNull
  public static String gcni(@NonNull Context paramContext)
  {
    return L2.a(paramContext);
  }
  
  @Nullable
  public static String gdid(@NonNull Context paramContext)
  {
    return L2.b(paramContext);
  }
  
  @NonNull
  public static String gmsvn(int paramInt)
  {
    return L2.a(paramInt);
  }
  
  public static void guc(@NonNull Ucc paramUcc, boolean paramBoolean)
  {
    L2.a(paramUcc, paramBoolean);
  }
  
  @Nullable
  public static String guid(@NonNull Context paramContext)
  {
    return L2.d(paramContext);
  }
  
  @Deprecated(since="Use ModulesFacade.isActivatedForApp")
  public static boolean iifa()
  {
    return ModulesFacade.isActivatedForApp();
  }
  
  @NonNull
  public static String mpn(Context paramContext)
  {
    return L2.c(paramContext);
  }
  
  @Nullable
  public static String pgai()
  {
    try
    {
      String str = (String)L2.a().get();
      return str;
    }
    finally {}
    return null;
  }
  
  @Nullable
  public static Boolean plat()
  {
    try
    {
      Boolean localBoolean = (Boolean)L2.b().get();
      return localBoolean;
    }
    finally {}
    return null;
  }
  
  @Deprecated(since="Use ModulesFacade.reportEvent")
  public static void rce(int paramInt, String paramString1, String paramString2, Map<String, String> paramMap)
  {
    ModulesFacade.reportEvent(paramInt, paramString1, paramString2, paramMap);
  }
  
  public static void rlse(@NonNull Context paramContext, @Nullable Map<String, Object> paramMap)
  {
    L2.a(paramContext, paramMap);
  }
  
  @Deprecated(since="Use ModulesFacade.sendEventsBuffer")
  public static void seb() {}
  
  @Deprecated(since="Will be removed in next major release")
  public static void slte(Context paramContext, boolean paramBoolean)
  {
    L2.a(paramContext, paramBoolean);
  }
  
  @NonNull
  public static String u(@NonNull String paramString)
  {
    return L2.a(paramString);
  }
  
  public static abstract interface Ucc
  {
    public abstract void onError(@NonNull String paramString);
    
    public abstract void onResult(@NonNull JSONObject paramJSONObject);
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */