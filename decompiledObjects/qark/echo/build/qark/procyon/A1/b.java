// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public enum b
{
    A("EXT_INFO", 10, "extInfo"), 
    B("INCLUDE_DWELL_DATA", 11, "include_dwell_data"), 
    C("INCLUDE_VIDEO_DATA", 12, "include_video_data"), 
    D("INSTALL_REFERRER", 13, "install_referrer"), 
    E("INSTALLER_PACKAGE", 14, "installer_package"), 
    F("RECEIPT_DATA", 15, "receipt_data"), 
    G("URL_SCHEMES", 16, "url_schemes");
    
    public static final a p;
    
    q("ANON_ID", 0, "anon_id"), 
    r("APP_USER_ID", 1, "app_user_id"), 
    s("ADVERTISER_ID", 2, "advertiser_id"), 
    t("PAGE_ID", 3, "page_id"), 
    u("PAGE_SCOPED_USER_ID", 4, "page_scoped_user_id"), 
    v("USER_DATA", 5, "ud"), 
    w("ADV_TE", 6, "advertiser_tracking_enabled"), 
    x("APP_TE", 7, "application_tracking_enabled"), 
    y("CONSIDER_VIEWS", 8, "consider_views"), 
    z("DEVICE_TOKEN", 9, "device_token");
    
    public final String o;
    
    static {
        H = c();
        p = new a(null);
    }
    
    public b(final String name, final int ordinal, final String o) {
        this.o = o;
    }
    
    public static final /* synthetic */ b[] c() {
        return new b[] { b.q, b.r, b.s, b.t, b.u, b.v, b.w, b.x, b.y, b.z, b.A, b.B, b.C, b.D, b.E, b.F, b.G };
    }
    
    public final String e() {
        return this.o;
    }
    
    public static final class a
    {
        public final b a(final String s) {
            Intrinsics.checkNotNullParameter(s, "rawValue");
            final b[] values = b.values();
            for (int length = values.length, i = 0; i < length; ++i) {
                final b b = values[i];
                if (Intrinsics.a(b.e(), s)) {
                    return b;
                }
            }
            return null;
        }
    }
}
