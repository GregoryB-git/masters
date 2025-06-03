// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum h
{
    A("INSTAGRAM_WEB_VIEW", 11, true), 
    p("NONE", 0, false), 
    q("FACEBOOK_APPLICATION_WEB", 1, true), 
    r("FACEBOOK_APPLICATION_NATIVE", 2, true), 
    s("FACEBOOK_APPLICATION_SERVICE", 3, true), 
    t("WEB_VIEW", 4, true), 
    u("CHROME_CUSTOM_TAB", 5, true), 
    v("TEST_USER", 6, true), 
    w("CLIENT_TOKEN", 7, true), 
    x("DEVICE_AUTH", 8, true), 
    y("INSTAGRAM_APPLICATION_WEB", 9, true), 
    z("INSTAGRAM_CUSTOM_CHROME_TAB", 10, true);
    
    public final boolean o;
    
    static {
        B = c();
    }
    
    public h(final String name, final int ordinal, final boolean o) {
        this.o = o;
    }
    
    public static final /* synthetic */ h[] c() {
        return new h[] { h.p, h.q, h.r, h.s, h.t, h.u, h.v, h.w, h.x, h.y, h.z, h.A };
    }
    
    public final boolean e() {
        return this.o;
    }
}
