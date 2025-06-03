/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.ads.interactivemedia.v3.api.AdsLoader$AdsLoadedListener
 *  com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
 *  java.lang.Object
 */
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.hintsolutions.raintv.video.ExoVideoView;

public final class l1
implements AdsLoader.AdsLoadedListener {
    public final ExoVideoView a;

    public /* synthetic */ l1(ExoVideoView exoVideoView) {
        this.a = exoVideoView;
    }

    public final void onAdsManagerLoaded(AdsManagerLoadedEvent adsManagerLoadedEvent) {
        ExoVideoView.e(this.a, adsManagerLoadedEvent);
    }
}

