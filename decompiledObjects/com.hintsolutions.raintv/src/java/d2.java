/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  ru.tvrain.core.data.InviteLinkResponse
 *  ru.tvrain.core.data.InviteStatsResponse
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.promos.GiftSubscriptionActivity;
import ru.tvrain.core.data.InviteLinkResponse;
import ru.tvrain.core.data.InviteStatsResponse;
import rx.functions.Action1;

public final class d2
implements Action1 {
    public final int a;
    public final GiftSubscriptionActivity b;

    public /* synthetic */ d2(GiftSubscriptionActivity giftSubscriptionActivity, int n4) {
        this.a = n4;
        this.b = giftSubscriptionActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                GiftSubscriptionActivity.B(this.b, (Throwable)object);
                return;
            }
            case 0: {
                GiftSubscriptionActivity.A(this.b, (InviteLinkResponse)object);
                return;
            }
        }
        GiftSubscriptionActivity.C(this.b, (InviteStatsResponse)object);
    }
}

