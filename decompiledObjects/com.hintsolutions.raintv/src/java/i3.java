/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.RecommendationsResponse
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.interfaces.AddToFavoritesClickListener;
import com.hintsolutions.raintv.interfaces.ArticleListItemClickListener;
import com.hintsolutions.raintv.interfaces.TaskCallback;
import com.hintsolutions.raintv.news.NewsActivity;
import java.util.ArrayList;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.RecommendationsResponse;
import rx.functions.Action1;

public final class i3
implements ArticleListItemClickListener,
AddToFavoritesClickListener,
TaskCallback,
Action1 {
    public final int a;
    public final NewsActivity b;

    public /* synthetic */ i3(NewsActivity newsActivity, int n4) {
        this.a = n4;
        this.b = newsActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 9: {
                NewsActivity.E(this.b, (ResponseBody)object);
                return;
            }
            case 7: {
                NewsActivity.U(this.b, (Throwable)object);
                return;
            }
            case 6: {
                NewsActivity.K(this.b, (ArrayList)object);
                return;
            }
            case 5: {
                NewsActivity.G(this.b, (RecommendationsResponse)object);
                return;
            }
            case 4: {
                NewsActivity.I(this.b, (Throwable)object);
                return;
            }
        }
        NewsActivity.Q(this.b, (Throwable)object);
    }

    @Override
    public final void onActionCompleted() {
        switch (this.a) {
            default: 
        }
        NewsActivity.J(this.b);
    }

    @Override
    public final void onItemClicked(Article article) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                NewsActivity.z(this.b, article);
                return;
            }
        }
        NewsActivity.L(this.b, article);
    }

    @Override
    public final void onItemClicked(Article article, Runnable runnable) {
        NewsActivity.P(this.b, article, runnable);
    }
}

