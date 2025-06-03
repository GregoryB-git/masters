package O1;

import java.util.Arrays;
import x1.C2146B;

/* renamed from: O1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0441d {
    Login(0),
    Share(1),
    Message(2),
    Like(3),
    GameRequest(4),
    AppGroupCreate(5),
    AppGroupJoin(6),
    AppInvite(7),
    DeviceShare(8),
    GamingFriendFinder(9),
    GamingGroupIntegration(10),
    Referral(11),
    GamingContextCreate(12),
    GamingContextSwitch(13),
    GamingContextChoose(14),
    TournamentShareDialog(15),
    TournamentJoinDialog(16);


    /* renamed from: o, reason: collision with root package name */
    public final int f3838o;

    EnumC0441d(int i7) {
        this.f3838o = i7;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0441d[] valuesCustom() {
        EnumC0441d[] valuesCustom = values();
        return (EnumC0441d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final int e() {
        return C2146B.q() + this.f3838o;
    }
}
