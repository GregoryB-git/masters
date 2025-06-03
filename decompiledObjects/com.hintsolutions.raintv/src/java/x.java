/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.Article
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.common.BaseActivity;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.Article;
import rx.functions.Action1;

public final class x
implements Action1 {
    public final int a;
    public final BaseActivity b;
    public final Article c;
    public final Runnable d;

    public /* synthetic */ x(BaseActivity baseActivity, Article article, Runnable runnable, int n4) {
        this.a = n4;
        this.b = baseActivity;
        this.c = article;
        this.d = runnable;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                BaseActivity.g(this.b, this.c, this.d, (ResponseBody)object);
                return;
            }
        }
        BaseActivity.k(this.b, this.c, this.d, (ResponseBody)object);
    }
}

