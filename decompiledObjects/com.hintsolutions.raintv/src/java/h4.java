/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.search.SearchCategory
 *  ru.tvrain.core.data.search.SearchPlaceholdersResponse
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.adapters.SearchCategoryAdapter;
import com.hintsolutions.raintv.adapters.SmallNewsListAdapter;
import com.hintsolutions.raintv.search.SearchActivity;
import com.hintsolutions.raintv.search.SearchSuggestionsAdapter;
import com.hintsolutions.raintv.utils.RecyclerViewPageUtils;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.search.SearchCategory;
import ru.tvrain.core.data.search.SearchPlaceholdersResponse;
import rx.functions.Action1;

public final class h4
implements Action1,
SearchCategoryAdapter.OnItemClickListener,
SmallNewsListAdapter.OnItemClickListener,
RecyclerViewPageUtils.GetNextPageListener,
SearchSuggestionsAdapter.OnClickListener {
    public final int a;
    public final SearchActivity b;

    public /* synthetic */ h4(SearchActivity searchActivity, int n4) {
        this.a = n4;
        this.b = searchActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 6: {
                SearchActivity.E(this.b, (Throwable)object);
                return;
            }
            case 1: {
                SearchActivity.J(this.b, (Throwable)object);
                return;
            }
            case 0: {
                SearchActivity.C(this.b, (SearchPlaceholdersResponse)object);
                return;
            }
        }
        SearchActivity.B(this.b, (Long)object);
    }

    @Override
    public final void onClick(String string) {
        SearchActivity.F(this.b, string);
    }

    @Override
    public final void onClick(Article article) {
        SearchActivity.G(this.b, article);
    }

    @Override
    public final void onClick(SearchCategory searchCategory) {
        SearchActivity.z(this.b, searchCategory);
    }

    @Override
    public final void onNext() {
        SearchActivity.A(this.b);
    }
}

