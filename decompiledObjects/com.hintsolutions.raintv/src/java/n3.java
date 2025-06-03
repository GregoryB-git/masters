/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.Articles
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.adapters.NewsListAdapter;
import com.hintsolutions.raintv.news.NewsListActivity;
import com.hintsolutions.raintv.utils.RecyclerViewPageUtils;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Articles;
import rx.functions.Action1;

public final class n3
implements NewsListAdapter.OnItemClickListener,
RecyclerViewPageUtils.GetNextPageListener,
Action1 {
    public final int a;
    public final NewsListActivity b;

    public /* synthetic */ n3(NewsListActivity newsListActivity, int n4) {
        this.a = n4;
        this.b = newsListActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                NewsListActivity.A(this.b, (Articles)object);
                return;
            }
        }
        NewsListActivity.C(this.b, (Throwable)object);
    }

    @Override
    public final void onClick(Article article) {
        NewsListActivity.z(this.b, article);
    }

    @Override
    public final void onNext() {
        NewsListActivity.B(this.b);
    }
}

