// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum l
{
    A("INCLUDE_DWELL_DATA", 11, "include_dwell_data"), 
    B("INCLUDE_VIDEO_DATA", 12, "include_video_data"), 
    C("INSTALL_REFERRER", 13, "install_referrer"), 
    D("INSTALLER_PACKAGE", 14, "installer_package"), 
    E("RECEIPT_DATA", 15, "receipt_data"), 
    F("URL_SCHEMES", 16, "url_schemes"), 
    p("ANON_ID", 0, "anon_id"), 
    q("FB_LOGIN_ID", 1, "fb_login_id"), 
    r("MAD_ID", 2, "madid"), 
    s("PAGE_ID", 3, "page_id"), 
    t("PAGE_SCOPED_USER_ID", 4, "page_scoped_user_id"), 
    u("USER_DATA", 5, "ud"), 
    v("ADV_TE", 6, "advertiser_tracking_enabled"), 
    w("APP_TE", 7, "application_tracking_enabled"), 
    x("CONSIDER_VIEWS", 8, "consider_views"), 
    y("DEVICE_TOKEN", 9, "device_token"), 
    z("EXT_INFO", 10, "extInfo");
    
    public final String o;
    
    static {
        G = c();
    }
    
    public l(final String name, final int ordinal, final String o) {
        this.o = o;
    }
    
    public static final /* synthetic */ l[] c() {
        return new l[] { l.p, l.q, l.r, l.s, l.t, l.u, l.v, l.w, l.x, l.y, l.z, l.A, l.B, l.C, l.D, l.E, l.F };
    }
    
    public final String e() {
        return this.o;
    }
}
