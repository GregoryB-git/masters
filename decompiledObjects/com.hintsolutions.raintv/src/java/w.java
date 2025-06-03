/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.Program
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.common.BaseActivity;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.Program;
import rx.functions.Action1;

public final class w
implements Action1 {
    public final int a;
    public final BaseActivity b;
    public final Program c;
    public final Runnable d;

    public /* synthetic */ w(BaseActivity baseActivity, Program program, Runnable runnable, int n4) {
        this.a = n4;
        this.b = baseActivity;
        this.c = program;
        this.d = runnable;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                BaseActivity.n(this.b, this.c, this.d, (ResponseBody)object);
                return;
            }
        }
        BaseActivity.l(this.b, this.c, this.d, (ResponseBody)object);
    }
}

