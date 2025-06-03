/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  ru.tvrain.core.data.IVideo
 */
import com.hintsolutions.raintv.news.NewsActivity;
import ru.tvrain.core.data.IVideo;

public final class k3
implements NewsActivity.HlsStreamsReadyListener {
    public final NewsActivity a;
    public final long b;

    public /* synthetic */ k3(NewsActivity newsActivity, long l4) {
        this.a = newsActivity;
        this.b = l4;
    }

    @Override
    public final void onReady(IVideo iVideo) {
        NewsActivity.M(this.a, this.b, iVideo);
    }
}

