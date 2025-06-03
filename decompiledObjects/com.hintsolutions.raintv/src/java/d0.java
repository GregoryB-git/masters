/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.hintsolutions.raintv.news.NewsActivity
 *  com.hintsolutions.raintv.news.adapters.BestNewsAdapter
 *  com.hintsolutions.raintv.news.adapters.NewsRecommendationsAdapter
 *  com.hintsolutions.raintv.programs.adapters.ProgramsSectionedAdapter
 *  java.lang.Object
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.Program
 *  ru.tvrain.core.data.search.SearchCategory
 */
import android.view.View;
import com.hintsolutions.raintv.adapters.BigNewsListAdapter;
import com.hintsolutions.raintv.adapters.NewsListAdapter;
import com.hintsolutions.raintv.adapters.NewsSliderAdapter;
import com.hintsolutions.raintv.adapters.SavedVideosAdapter;
import com.hintsolutions.raintv.adapters.SearchCategoryAdapter;
import com.hintsolutions.raintv.adapters.SmallNewsListAdapter;
import com.hintsolutions.raintv.news.NewsActivity;
import com.hintsolutions.raintv.news.adapters.BestNewsAdapter;
import com.hintsolutions.raintv.news.adapters.NewsRecommendationsAdapter;
import com.hintsolutions.raintv.programs.adapters.ProgramsSectionedAdapter;
import com.hintsolutions.raintv.services.video.SavedVideoHolder;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Program;
import ru.tvrain.core.data.search.SearchCategory;

public final class d0
implements View.OnClickListener {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ d0(Object object, Object object2, int n) {
        this.a = n;
        this.c = object;
        this.b = object2;
    }

    public final void onClick(View view) {
        switch (this.a) {
            default: {
                break;
            }
            case 8: {
                NewsRecommendationsAdapter.a((NewsRecommendationsAdapter)((NewsRecommendationsAdapter)this.c), (Article)((Article)this.b), (View)view);
                return;
            }
            case 7: {
                BestNewsAdapter.c((BestNewsAdapter)((BestNewsAdapter)this.c), (Article)((Article)this.b), (View)view);
                return;
            }
            case 6: {
                NewsActivity.C((NewsActivity)((NewsActivity)this.c), (Article)((Article)this.b), (View)view);
                return;
            }
            case 5: {
                SmallNewsListAdapter.a((SmallNewsListAdapter)((Object)this.c), (Article)this.b, view);
                return;
            }
            case 4: {
                SearchCategoryAdapter.a((SearchCategoryAdapter)((Object)this.c), (SearchCategory)this.b, view);
                return;
            }
            case 3: {
                SavedVideosAdapter.b((SavedVideosAdapter)((Object)this.c), (SavedVideoHolder)this.b, view);
                return;
            }
            case 2: {
                NewsSliderAdapter.a((NewsSliderAdapter)((Object)this.c), (Article)this.b, view);
                return;
            }
            case 1: {
                NewsListAdapter.a((NewsListAdapter)((Object)this.c), (Article)this.b, view);
                return;
            }
            case 0: {
                BigNewsListAdapter.a((BigNewsListAdapter)((Object)this.c), (Article)this.b, view);
                return;
            }
        }
        ProgramsSectionedAdapter.a((ProgramsSectionedAdapter)((ProgramsSectionedAdapter)this.c), (Program)((Program)this.b), (View)view);
    }
}

