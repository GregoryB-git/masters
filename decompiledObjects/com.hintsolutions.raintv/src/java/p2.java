/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  ru.tvrain.core.data.RainUser
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.subscriptions.LinkActivity;
import ru.tvrain.core.data.RainUser;
import rx.functions.Action1;

public final class p2
implements Action1 {
    public final int a;
    public final LinkActivity b;

    public /* synthetic */ p2(LinkActivity linkActivity, int n4) {
        this.a = n4;
        this.b = linkActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                LinkActivity.C(this.b, (RainUser)object);
                return;
            }
        }
        LinkActivity.B(this.b, (Throwable)object);
    }
}

