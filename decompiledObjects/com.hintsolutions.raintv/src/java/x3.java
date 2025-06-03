/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.UserInfo
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.subscriptions.PurchaseInfoActivity;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.UserInfo;
import rx.functions.Action1;

public final class x3
implements Action1 {
    public final int a;
    public final PurchaseInfoActivity b;

    public /* synthetic */ x3(PurchaseInfoActivity purchaseInfoActivity, int n4) {
        this.a = n4;
        this.b = purchaseInfoActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                PurchaseInfoActivity.z(this.b, (Throwable)object);
                return;
            }
            case 0: {
                PurchaseInfoActivity.A(this.b, (ResponseBody)object);
                return;
            }
        }
        PurchaseInfoActivity.B(this.b, (UserInfo)object);
    }
}

