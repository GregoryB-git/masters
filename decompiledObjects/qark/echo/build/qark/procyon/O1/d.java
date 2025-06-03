// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import x1.B;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum d
{
    A("Referral", 11, 11), 
    B("GamingContextCreate", 12, 12), 
    C("GamingContextSwitch", 13, 13), 
    D("GamingContextChoose", 14, 14), 
    E("TournamentShareDialog", 15, 15), 
    F("TournamentJoinDialog", 16, 16), 
    p("Login", 0, 0), 
    q("Share", 1, 1), 
    r("Message", 2, 2), 
    s("Like", 3, 3), 
    t("GameRequest", 4, 4), 
    u("AppGroupCreate", 5, 5), 
    v("AppGroupJoin", 6, 6), 
    w("AppInvite", 7, 7), 
    x("DeviceShare", 8, 8), 
    y("GamingFriendFinder", 9, 9), 
    z("GamingGroupIntegration", 10, 10);
    
    public final int o;
    
    static {
        G = c();
    }
    
    public d(final String name, final int ordinal, final int o) {
        this.o = o;
    }
    
    public static final /* synthetic */ d[] c() {
        return new d[] { d.p, d.q, d.r, d.s, d.t, d.u, d.v, d.w, d.x, d.y, d.z, d.A, d.B, d.C, d.D, d.E, d.F };
    }
    
    public final int e() {
        return x1.B.q() + this.o;
    }
}
