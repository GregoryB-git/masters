/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  okhttp3.ResponseBody
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.profile.RecoveryActivity;
import okhttp3.ResponseBody;
import rx.functions.Action1;

public final class a4
implements Action1 {
    public final int a;
    public final RecoveryActivity b;

    public /* synthetic */ a4(RecoveryActivity recoveryActivity, int n2) {
        this.a = n2;
        this.b = recoveryActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                RecoveryActivity.A(this.b, (ResponseBody)object);
                return;
            }
        }
        RecoveryActivity.z(this.b, (Throwable)object);
    }
}

