/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.Story
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.adapters.BigNewsListAdapter;
import com.hintsolutions.raintv.news.StoryFragment;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Story;
import rx.functions.Action1;

public final class m4
implements BigNewsListAdapter.OnItemClickListener,
Action1 {
    public final StoryFragment a;

    public /* synthetic */ m4(StoryFragment storyFragment) {
        this.a = storyFragment;
    }

    public final void call(Object object) {
        StoryFragment.d(this.a, (Story)object);
    }

    @Override
    public final void onClick(Article article) {
        StoryFragment.b(this.a, article);
    }
}

