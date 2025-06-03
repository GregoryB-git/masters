/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  ru.tvrain.core.data.Article
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.interfaces.AddToFavoritesClickListener;
import com.hintsolutions.raintv.interfaces.ArticleListItemClickListener;
import com.hintsolutions.raintv.news.FavoritesFragment;
import ru.tvrain.core.data.Article;
import rx.functions.Action1;

public final class q1
implements Action1,
ArticleListItemClickListener,
AddToFavoritesClickListener {
    public final FavoritesFragment a;

    public /* synthetic */ q1(FavoritesFragment favoritesFragment) {
        this.a = favoritesFragment;
    }

    public final void call(Object object) {
        FavoritesFragment.f(this.a, (Throwable)object);
    }

    @Override
    public final void onItemClicked(Article article) {
        FavoritesFragment.b(this.a, article);
    }

    @Override
    public final void onItemClicked(Article article, Runnable runnable) {
        FavoritesFragment.h(this.a, article, runnable);
    }
}

