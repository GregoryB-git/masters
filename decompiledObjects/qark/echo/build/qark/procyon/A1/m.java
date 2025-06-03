// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public enum m
{
    A("PAYMENT_INFO_AVAILABLE", 10, "fb_payment_info_available"), 
    B("REGISTRATION_METHOD", 11, "fb_registration_method"), 
    C("SEARCH_STRING", 12, "fb_search_string"), 
    D("SUCCESS", 13, "fb_success"), 
    E("ORDER_ID", 14, "fb_order_id"), 
    F("AD_TYPE", 15, "ad_type"), 
    G("CURRENCY", 16, "fb_currency");
    
    public static final a p;
    
    q("EVENT_TIME", 0, "_logTime"), 
    r("EVENT_NAME", 1, "_eventName"), 
    s("VALUE_TO_SUM", 2, "_valueToSum"), 
    t("CONTENT_IDS", 3, "fb_content_id"), 
    u("CONTENTS", 4, "fb_content"), 
    v("CONTENT_TYPE", 5, "fb_content_type"), 
    w("DESCRIPTION", 6, "fb_description"), 
    x("LEVEL", 7, "fb_level"), 
    y("MAX_RATING_VALUE", 8, "fb_max_rating_value"), 
    z("NUM_ITEMS", 9, "fb_num_items");
    
    public final String o;
    
    static {
        H = c();
        p = new a(null);
    }
    
    public m(final String name, final int ordinal, final String o) {
        this.o = o;
    }
    
    public static final /* synthetic */ m[] c() {
        return new m[] { m.q, m.r, m.s, m.t, m.u, m.v, m.w, m.x, m.y, m.z, m.A, m.B, m.C, m.D, m.E, m.F, m.G };
    }
    
    public final String e() {
        return this.o;
    }
    
    public static final class a
    {
        public final m a(final String s) {
            Intrinsics.checkNotNullParameter(s, "rawValue");
            final m[] values = m.values();
            for (int length = values.length, i = 0; i < length; ++i) {
                final m m = values[i];
                if (Intrinsics.a(m.e(), s)) {
                    return m;
                }
            }
            return null;
        }
    }
}
