/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  ru.tvrain.core.data.Offerta
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.subscriptions.AgreementActivity;
import ru.tvrain.core.data.Offerta;
import rx.functions.Action1;

public final class i
implements Action1 {
    public final int a;
    public final AgreementActivity b;

    public /* synthetic */ i(AgreementActivity agreementActivity, int n4) {
        this.a = n4;
        this.b = agreementActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                AgreementActivity.A(this.b, (Offerta)object);
                return;
            }
        }
        AgreementActivity.z(this.b, (Throwable)object);
    }
}

