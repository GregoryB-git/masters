/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.IVideo
 *  ru.tvrain.core.data.UserInfo
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.interfaces.TaskCallback;
import com.hintsolutions.raintv.news.NewsActivity;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.IVideo;
import ru.tvrain.core.data.UserInfo;
import rx.functions.Action1;

public final class z
implements Action1,
NewsActivity.HlsStreamsReadyListener {
    public final boolean a;
    public final BaseActivity b;
    public final Object c;

    public /* synthetic */ z(BaseActivity baseActivity, boolean bl, TaskCallback taskCallback) {
        this.b = baseActivity;
        this.a = bl;
        this.c = taskCallback;
    }

    public /* synthetic */ z(NewsActivity newsActivity, Article article, boolean bl) {
        this.b = newsActivity;
        this.c = article;
        this.a = bl;
    }

    public final void call(Object object) {
        BaseActivity.f(this.b, this.a, (TaskCallback)this.c, (UserInfo)object);
    }

    @Override
    public final void onReady(IVideo iVideo) {
        NewsActivity.T((NewsActivity)this.b, (Article)this.c, this.a, iVideo);
    }
}

