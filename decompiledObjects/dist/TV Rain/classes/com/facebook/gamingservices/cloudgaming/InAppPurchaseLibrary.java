package com.facebook.gamingservices.cloudgaming;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import org.json.JSONObject;

public class InAppPurchaseLibrary
{
  public static final String DEVELOPER_PAYLOAD = "developerPayload";
  public static final String PRODUCT_ID = "productID";
  public static final String PURCHASE_TOKEN = "purchaseToken";
  
  public static void consumePurchase(Context paramContext, JSONObject paramJSONObject, DaemonRequest.Callback paramCallback)
  {
    DaemonRequest.executeAsync(paramContext, paramJSONObject, paramCallback, SDKMessageEnum.CONSUME_PURCHASE);
  }
  
  public static void getCatalog(Context paramContext, @Nullable JSONObject paramJSONObject, DaemonRequest.Callback paramCallback)
  {
    DaemonRequest.executeAsync(paramContext, paramJSONObject, paramCallback, SDKMessageEnum.GET_CATALOG);
  }
  
  public static void getPurchases(Context paramContext, @Nullable JSONObject paramJSONObject, DaemonRequest.Callback paramCallback)
  {
    DaemonRequest.executeAsync(paramContext, paramJSONObject, paramCallback, SDKMessageEnum.GET_PURCHASES);
  }
  
  public static void onReady(Context paramContext, @Nullable JSONObject paramJSONObject, DaemonRequest.Callback paramCallback)
  {
    DaemonRequest.executeAsync(paramContext, paramJSONObject, paramCallback, SDKMessageEnum.ON_READY);
  }
  
  public static void purchase(Context paramContext, JSONObject paramJSONObject, DaemonRequest.Callback paramCallback)
  {
    DaemonRequest.executeAsync(paramContext, paramJSONObject, paramCallback, SDKMessageEnum.PURCHASE);
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.cloudgaming.InAppPurchaseLibrary
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */