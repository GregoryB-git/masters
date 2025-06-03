/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.hintsolutions.raintv.news.BaseArticlesListFragment
 *  java.lang.Object
 *  java.lang.Override
 *  ru.tvrain.core.data.Article
 */
import com.hintsolutions.raintv.adapters.BigNewsListAdapter;
import com.hintsolutions.raintv.adapters.NewsSliderAdapter;
import com.hintsolutions.raintv.adapters.SmallNewsListAdapter;
import com.hintsolutions.raintv.news.BaseArticlesListFragment;
import com.hintsolutions.raintv.utils.RecyclerViewPageUtils;
import ru.tvrain.core.data.Article;

public final class b0
implements RecyclerViewPageUtils.GetNextPageListener,
BigNewsListAdapter.OnItemClickListener,
NewsSliderAdapter.OnItemClickListener,
SmallNewsListAdapter.OnItemClickListener {
    public final int a;
    public final BaseArticlesListFragment b;

    public /* synthetic */ b0(BaseArticlesListFragment baseArticlesListFragment, int n) {
        this.a = n;
        this.b = baseArticlesListFragment;
    }

    @Override
    public final void onClick(Article article) {
        switch (this.a) {
            default: 
        }
        this.b.onItemClick(article);
    }

    @Override
    public final void onNext() {
        BaseArticlesListFragment.b((BaseArticlesListFragment)this.b);
    }
}

