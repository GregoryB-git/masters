/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Message
 *  com.hintsolutions.raintv.subscriptions.PurchaseInfoActivity
 *  java.lang.Object
 *  tvrain.managers.UserManager
 */
import android.os.Handler;
import android.os.Message;
import com.hintsolutions.raintv.subscriptions.PurchaseInfoActivity;
import tvrain.managers.UserManager;

public final class y3
implements Handler.Callback {
    public final int a;

    public /* synthetic */ y3(int n) {
        this.a = n;
    }

    public final boolean handleMessage(Message message) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return PurchaseInfoActivity.D((Message)message);
            }
        }
        return UserManager.a((Message)message);
    }
}

