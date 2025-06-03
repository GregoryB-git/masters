/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.constraintlayout.core.state.Interpolator
 *  androidx.constraintlayout.core.state.Transition
 *  com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener
 *  com.google.android.exoplayer2.extractor.Extractor
 *  com.google.android.exoplayer2.extractor.ExtractorsFactory
 *  com.google.android.exoplayer2.extractor.amr.AmrExtractor
 *  com.google.android.exoplayer2.extractor.flv.FlvExtractor
 *  com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor
 *  com.google.android.exoplayer2.extractor.mp3.Mp3Extractor
 *  com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor
 *  com.google.android.exoplayer2.extractor.mp4.Mp4Extractor
 *  com.google.android.exoplayer2.extractor.ogg.OggExtractor
 *  com.google.android.exoplayer2.extractor.ts.Ac3Extractor
 *  com.google.android.exoplayer2.extractor.ts.AdtsExtractor
 *  com.google.android.exoplayer2.extractor.ts.PsExtractor
 *  com.google.android.exoplayer2.extractor.ts.TsExtractor
 *  com.google.android.exoplayer2.extractor.wav.WavExtractor
 *  com.google.android.exoplayer2.metadata.id3.Id3Decoder
 *  com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate
 *  com.google.android.exoplayer2.upstream.DataSpec
 *  com.google.android.exoplayer2.upstream.HttpDataSource
 *  com.google.android.exoplayer2.upstream.cache.CacheKeyFactory
 *  com.google.android.exoplayer2.upstream.cache.CacheUtil
 *  com.google.android.exoplayer2.util.EventDispatcher$Event
 *  com.google.android.exoplayer2.util.Predicate
 *  com.google.android.gms.cast.framework.CastStateListener
 *  com.google.firebase.FirebaseCommonRegistrar
 *  com.google.firebase.platforminfo.LibraryVersionComponent$VersionExtractor
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  okhttp3.ResponseBody
 *  rx.functions.Action1
 *  tvrain.analytics.AnalyticsManager
 *  tvrain.cast.CastHelper
 *  tvrain.utils.CurrentlyOnAirGetter
 */
import android.content.Context;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import com.devbrackets.android.exomedia.listener.OnErrorListener;
import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.extractor.flv.FlvExtractor;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.ogg.OggExtractor;
import com.google.android.exoplayer2.extractor.ts.Ac3Extractor;
import com.google.android.exoplayer2.extractor.ts.AdtsExtractor;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.extractor.wav.WavExtractor;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import com.google.android.exoplayer2.upstream.cache.CacheUtil;
import com.google.android.exoplayer2.util.EventDispatcher;
import com.google.android.exoplayer2.util.Predicate;
import com.google.android.gms.cast.framework.CastStateListener;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.hintsolutions.raintv.subscriptions.PurchaseInfoActivity;
import com.hintsolutions.raintv.video.LiveActivity;
import com.hintsolutions.raintv.video.LocalVideoActivity;
import com.hintsolutions.raintv.video.VideoActivity;
import okhttp3.ResponseBody;
import rx.functions.Action1;
import tvrain.analytics.AnalyticsManager;
import tvrain.cast.CastHelper;
import tvrain.utils.CurrentlyOnAirGetter;

public final class z3
implements Action1,
OnErrorListener,
CastStateListener,
Interpolator,
EventDispatcher.Event,
ExtractorsFactory,
Id3Decoder.FramePredicate,
Predicate,
CacheKeyFactory,
LibraryVersionComponent.VersionExtractor {
    public final int a;

    public /* synthetic */ z3(int n4) {
        this.a = n4;
    }

    public String buildCacheKey(DataSpec dataSpec) {
        return CacheUtil.getKey((DataSpec)dataSpec);
    }

    public void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 11: {
                AnalyticsManager.a((Throwable)((Throwable)object));
                return;
            }
            case 10: {
                ((Throwable)object).printStackTrace();
                return;
            }
            case 9: {
                ((Throwable)object).printStackTrace();
                return;
            }
            case 7: {
                VideoActivity.L((Throwable)object);
                return;
            }
            case 6: {
                VideoActivity.I((ResponseBody)object);
                return;
            }
            case 5: {
                ((Throwable)object).printStackTrace();
                return;
            }
            case 3: {
                LiveActivity.G((Throwable)object);
                return;
            }
            case 2: {
                ((Throwable)object).printStackTrace();
                return;
            }
            case 1: {
                ((Throwable)object).printStackTrace();
                return;
            }
            case 0: {
                PurchaseInfoActivity.C((Throwable)object);
                return;
            }
        }
        CurrentlyOnAirGetter.b((Throwable)((Throwable)object));
    }

    public Extractor[] createExtractors() {
        switch (this.a) {
            default: {
                break;
            }
            case 23: {
                return TsExtractor.a();
            }
            case 22: {
                return PsExtractor.a();
            }
            case 21: {
                return AdtsExtractor.a();
            }
            case 20: {
                return Ac3Extractor.a();
            }
            case 19: {
                return OggExtractor.a();
            }
            case 18: {
                return Mp4Extractor.a();
            }
            case 17: {
                return FragmentedMp4Extractor.a();
            }
            case 15: {
                return Mp3Extractor.a();
            }
            case 14: {
                return MatroskaExtractor.a();
            }
            case 13: {
                return FlvExtractor.a();
            }
            case 12: {
                return AmrExtractor.a();
            }
        }
        return WavExtractor.a();
    }

    public boolean evaluate(int n4, int n5, int n6, int n7, int n8) {
        switch (this.a) {
            default: {
                break;
            }
            case 16: {
                return Mp3Extractor.b((int)n4, (int)n5, (int)n6, (int)n7, (int)n8);
            }
        }
        return Id3Decoder.a((int)n4, (int)n5, (int)n6, (int)n7, (int)n8);
    }

    public boolean evaluate(Object object) {
        return HttpDataSource.a((String)((String)object));
    }

    public String extract(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 28: {
                return FirebaseCommonRegistrar.b((Context)((Context)object));
            }
        }
        return FirebaseCommonRegistrar.c((Context)((Context)object));
    }

    public float getInterpolation(float f2) {
        switch (this.a) {
            default: {
                break;
            }
            case 5: {
                return Transition.h((float)f2);
            }
            case 4: {
                return Transition.g((float)f2);
            }
            case 3: {
                return Transition.b((float)f2);
            }
            case 2: {
                return Transition.a((float)f2);
            }
            case 1: {
                return Transition.d((float)f2);
            }
            case 0: {
                return Transition.c((float)f2);
            }
        }
        return Transition.e((float)f2);
    }

    public void onCastStateChanged(int n4) {
        CastHelper.a((int)n4);
    }

    @Override
    public boolean onError(Exception exception) {
        switch (this.a) {
            default: {
                break;
            }
            case 4: {
                return LocalVideoActivity.I(exception);
            }
        }
        return VideoActivity.H(exception);
    }

    public void sendTo(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 10: {
                ((DefaultDrmSessionEventListener)object).onDrmSessionReleased();
                return;
            }
            case 9: {
                ((DefaultDrmSessionEventListener)object).onDrmKeysLoaded();
                return;
            }
            case 8: {
                ((DefaultDrmSessionEventListener)object).onDrmKeysRestored();
                return;
            }
            case 7: {
                ((DefaultDrmSessionEventListener)object).onDrmSessionAcquired();
                return;
            }
        }
        ((DefaultDrmSessionEventListener)object).onDrmKeysRestored();
    }
}

