/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  ru.tvrain.core.data.Articles
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.news.PopularArticlesInProgramFragment;
import ru.tvrain.core.data.Articles;
import rx.functions.Action1;

public final class t3
implements Action1 {
    public final int a;
    public final PopularArticlesInProgramFragment b;

    public /* synthetic */ t3(PopularArticlesInProgramFragment popularArticlesInProgramFragment, int n4) {
        this.a = n4;
        this.b = popularArticlesInProgramFragment;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                PopularArticlesInProgramFragment.d(this.b, (Articles)object);
                return;
            }
        }
        PopularArticlesInProgramFragment.c(this.b, (Throwable)object);
    }
}

