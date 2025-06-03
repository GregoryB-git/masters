/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.swiperefreshlayout.widget.SwipeRefreshLayout$OnRefreshListener
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  ru.tvrain.core.data.Article
 *  rx.functions.Action1
 */
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hintsolutions.raintv.interfaces.AddToFavoritesClickListener;
import com.hintsolutions.raintv.news.MainFragment;
import java.util.ArrayList;
import ru.tvrain.core.data.Article;
import rx.functions.Action1;

public final class y2
implements Action1,
AddToFavoritesClickListener,
SwipeRefreshLayout.OnRefreshListener {
    public final int a;
    public final MainFragment b;

    public /* synthetic */ y2(MainFragment mainFragment, int n4) {
        this.a = n4;
        this.b = mainFragment;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                MainFragment.b(this.b, (ArrayList)object);
                return;
            }
        }
        MainFragment.d(this.b, (Throwable)object);
    }

    @Override
    public final void onItemClicked(Article article, Runnable runnable) {
        MainFragment.c(this.b, article, runnable);
    }

    public final void onRefresh() {
        MainFragment.e(this.b);
    }
}

