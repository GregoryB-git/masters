package F1;

import O1.r;
import O1.v;
import V5.h;
import V5.i;
import W5.I;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import x1.B;

public final class c
{
  public static final c a = new c();
  public static boolean b;
  public static final h c = i.a(a.o);
  public static HashSet d;
  
  public static final void b()
  {
    if (T1.a.d(c.class)) {
      return;
    }
    try
    {
      b = true;
      a.d();
      return;
    }
    finally
    {
      T1.a.b(localThrowable, c.class);
    }
  }
  
  public static final void e(Bundle paramBundle)
  {
    if (T1.a.d(c.class)) {
      return;
    }
    try
    {
      Object localObject1;
      if ((b) && (paramBundle != null) && (!paramBundle.isEmpty()) && (d != null))
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        Object localObject2 = paramBundle.keySet();
        Intrinsics.checkNotNullExpressionValue(localObject2, "parameters.keySet()");
        Iterator localIterator = ((Iterable)localObject2).iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (String)localIterator.next();
          HashSet localHashSet = d;
          Intrinsics.b(localHashSet);
          if (!localHashSet.contains(localObject2))
          {
            Intrinsics.checkNotNullExpressionValue(localObject2, "param");
            ((List)localObject1).add(localObject2);
          }
        }
      }
      label161:
      return;
    }
    finally
    {
      break label161;
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        paramBundle.remove((String)((Iterator)localObject1).next());
      }
      paramBundle.putString("pm", "1");
      return;
      T1.a.b(paramBundle, c.class);
    }
  }
  
  public final HashSet a(JSONArray paramJSONArray)
  {
    if (T1.a.d(this)) {
      return null;
    }
    if (paramJSONArray != null) {
      try
      {
        HashSet localHashSet;
        if (paramJSONArray.length() != 0)
        {
          localHashSet = new java/util/HashSet;
          localHashSet.<init>();
          int i = paramJSONArray.length();
          if (i > 0)
          {
            int k;
            for (int j = 0;; j = k)
            {
              k = j + 1;
              String str = paramJSONArray.getString(j);
              Intrinsics.checkNotNullExpressionValue(str, "jsonArray.getString(i)");
              localHashSet.add(str);
              if (k >= i) {
                break;
              }
            }
          }
        }
        label93:
        return null;
      }
      finally
      {
        break label93;
        return localHashSet;
        T1.a.b(paramJSONArray, this);
      }
    }
  }
  
  public final HashSet c()
  {
    if (T1.a.d(this)) {
      return null;
    }
    try
    {
      HashSet localHashSet = (HashSet)c.getValue();
      return localHashSet;
    }
    finally
    {
      T1.a.b(localThrowable, this);
    }
    return null;
  }
  
  public final void d()
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      Object localObject = v.a;
      localObject = v.q(B.m(), false);
      if (localObject == null) {
        return;
      }
      HashSet localHashSet = a(((r)localObject).g());
      localObject = localHashSet;
      if (localHashSet == null) {
        localObject = c();
      }
    }
    finally
    {
      break label57;
    }
    d = localThrowable;
    return;
    label57:
    T1.a.b(localThrowable, this);
  }
  
  public static final class a
    extends l
    implements g6.a
  {
    public static final a o = new a();
    
    public a()
    {
      super();
    }
    
    public final HashSet a()
    {
      return I.c(new String[] { "_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_category", "fb_content_ids", "fb_content_name", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_search_string", "fb_state_of_vehicle", "fb_status", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", "appVersion", "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "fb_post_attachment", "receipt_data", "ad_type", "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca" });
    }
  }
}

/* Location:
 * Qualified Name:     F1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */