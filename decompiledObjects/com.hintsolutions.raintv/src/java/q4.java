/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.Articles
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.adapters.SmallNewsListAdapter;
import com.hintsolutions.raintv.programs.TeleshowTabFragment;
import com.hintsolutions.raintv.utils.RecyclerViewPageUtils;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Articles;
import rx.functions.Action1;

public final class q4
implements Action1,
SmallNewsListAdapter.OnItemClickListener,
RecyclerViewPageUtils.GetNextPageListener {
    public final int a;
    public final TeleshowTabFragment b;

    public /* synthetic */ q4(TeleshowTabFragment teleshowTabFragment, int n4) {
        this.a = n4;
        this.b = teleshowTabFragment;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                TeleshowTabFragment.c(this.b, (Throwable)object);
                return;
            }
            case 0: {
                TeleshowTabFragment.b(this.b, (Articles)object);
                return;
            }
        }
        TeleshowTabFragment.g(this.b, (ResponseBody)object);
    }

    @Override
    public final void onClick(Article article) {
        TeleshowTabFragment.d(this.b, article);
    }

    @Override
    public final void onNext() {
        TeleshowTabFragment.e(this.b);
    }
}

