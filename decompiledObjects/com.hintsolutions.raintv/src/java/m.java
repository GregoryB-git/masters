/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter
 *  java.lang.Object
 *  ru.tvrain.core.data.Article
 */
import android.view.View;
import com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter;
import ru.tvrain.core.data.Article;

public final class m
implements View.OnClickListener {
    public final int a;
    public final Article b;

    public /* synthetic */ m(Article article, int n) {
        this.a = n;
        this.b = article;
    }

    public final void onClick(View view) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                AllNewsSectionedAdapter.f((Article)this.b, (View)view);
                return;
            }
        }
        AllNewsSectionedAdapter.a((Article)this.b, (View)view);
    }
}

