// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum i
{
    A("REGISTRATION_METHOD", 11, "registration_method"), 
    B("SEARCH_STRING", 12, "search_string"), 
    C("SUCCESS", 13, "success"), 
    D("ORDER_ID", 14, "order_id"), 
    E("AD_TYPE", 15, "ad_type"), 
    F("CURRENCY", 16, "currency"), 
    p("VALUE_TO_SUM", 0, "value"), 
    q("EVENT_TIME", 1, "event_time"), 
    r("EVENT_NAME", 2, "event_name"), 
    s("CONTENT_IDS", 3, "content_ids"), 
    t("CONTENTS", 4, "contents"), 
    u("CONTENT_TYPE", 5, "content_type"), 
    v("DESCRIPTION", 6, "description"), 
    w("LEVEL", 7, "level"), 
    x("MAX_RATING_VALUE", 8, "max_rating_value"), 
    y("NUM_ITEMS", 9, "num_items"), 
    z("PAYMENT_INFO_AVAILABLE", 10, "payment_info_available");
    
    public final String o;
    
    static {
        G = c();
    }
    
    public i(final String name, final int ordinal, final String o) {
        this.o = o;
    }
    
    public static final /* synthetic */ i[] c() {
        return new i[] { i.p, i.q, i.r, i.s, i.t, i.u, i.v, i.w, i.x, i.y, i.z, i.A, i.B, i.C, i.D, i.E, i.F };
    }
    
    public final String e() {
        return this.o;
    }
}
