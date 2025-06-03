/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.ContentBlock
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.adapters.BigNewsListAdapter;
import com.hintsolutions.raintv.news.ContentBlockFragment;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.ContentBlock;
import rx.functions.Action1;

public final class o0
implements BigNewsListAdapter.OnItemClickListener,
Action1 {
    public final ContentBlockFragment a;

    public /* synthetic */ o0(ContentBlockFragment contentBlockFragment) {
        this.a = contentBlockFragment;
    }

    public final void call(Object object) {
        ContentBlockFragment.c(this.a, (ContentBlock)object);
    }

    @Override
    public final void onClick(Article article) {
        ContentBlockFragment.b(this.a, article);
    }
}

