package F1;

import O1.C0458v;
import O1.r;
import V5.h;
import V5.j;
import W5.K;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import x1.C2146B;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1968a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f1969b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f1970c;

    /* renamed from: d, reason: collision with root package name */
    public static HashSet f1971d;

    public static final class a extends l implements g6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final a f1972o = new a();

        public a() {
            super(0);
        }

        @Override // g6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashSet invoke() {
            HashSet c7;
            c7 = K.c("_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_category", "fb_content_ids", "fb_content_name", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_search_string", "fb_state_of_vehicle", "fb_status", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", "appVersion", "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "fb_post_attachment", "receipt_data", "ad_type", "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca");
            return c7;
        }
    }

    static {
        h a7;
        a7 = j.a(a.f1972o);
        f1970c = a7;
    }

    public static final void b() {
        if (T1.a.d(c.class)) {
            return;
        }
        try {
            f1969b = true;
            f1968a.d();
        } catch (Throwable th) {
            T1.a.b(th, c.class);
        }
    }

    public static final void e(Bundle bundle) {
        if (T1.a.d(c.class)) {
            return;
        }
        try {
            if (f1969b && bundle != null && !bundle.isEmpty() && f1971d != null) {
                ArrayList arrayList = new ArrayList();
                Set<String> keySet = bundle.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "parameters.keySet()");
                for (String param : keySet) {
                    HashSet hashSet = f1971d;
                    Intrinsics.b(hashSet);
                    if (!hashSet.contains(param)) {
                        Intrinsics.checkNotNullExpressionValue(param, "param");
                        arrayList.add(param);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
                bundle.putString("pm", "1");
            }
        } catch (Throwable th) {
            T1.a.b(th, c.class);
        }
    }

    public final HashSet a(JSONArray jSONArray) {
        if (!T1.a.d(this) && jSONArray != null) {
            try {
                if (jSONArray.length() != 0) {
                    HashSet hashSet = new HashSet();
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i7 = 0;
                        while (true) {
                            int i8 = i7 + 1;
                            String string = jSONArray.getString(i7);
                            Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                            hashSet.add(string);
                            if (i8 >= length) {
                                break;
                            }
                            i7 = i8;
                        }
                    }
                    return hashSet;
                }
            } catch (Throwable th) {
                T1.a.b(th, this);
            }
        }
        return null;
    }

    public final HashSet c() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return (HashSet) f1970c.getValue();
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final void d() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            C0458v c0458v = C0458v.f3949a;
            r q7 = C0458v.q(C2146B.m(), false);
            if (q7 == null) {
                return;
            }
            HashSet a7 = a(q7.g());
            if (a7 == null) {
                a7 = c();
            }
            f1971d = a7;
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
