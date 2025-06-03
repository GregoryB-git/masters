/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  okhttp3.ResponseBody
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.programs.TeleshowFragment;
import okhttp3.ResponseBody;
import rx.functions.Action1;

public final class p4
implements Action1 {
    public final int a;
    public final TeleshowFragment b;

    public /* synthetic */ p4(TeleshowFragment teleshowFragment, int n4) {
        this.a = n4;
        this.b = teleshowFragment;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                TeleshowFragment.c(this.b, (ResponseBody)object);
                return;
            }
        }
        TeleshowFragment.b(this.b, (Throwable)object);
    }
}

