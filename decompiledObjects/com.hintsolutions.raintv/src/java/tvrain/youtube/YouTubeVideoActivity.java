/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  com.google.android.youtube.player.YouTubePlayer
 *  com.google.android.youtube.player.YouTubePlayer$OnInitializedListener
 *  com.google.android.youtube.player.YouTubePlayer$Provider
 *  com.hintsolutions.raintv.databinding.ActivityYoutubeBinding
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package tvrain.youtube;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.youtube.player.YouTubePlayer;
import com.hintsolutions.raintv.databinding.ActivityYoutubeBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tvrain.youtube.YouTubeFailureRecoveryActivity;

@Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J$\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2={"Ltvrain/youtube/YouTubeVideoActivity;", "Ltvrain/youtube/YouTubeFailureRecoveryActivity;", "()V", "binding", "Lcom/hintsolutions/raintv/databinding/ActivityYoutubeBinding;", "getYouTubePlayerProvider", "Lcom/google/android/youtube/player/YouTubePlayer$Provider;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onInitializationSuccess", "provider", "youTubePlayer", "Lcom/google/android/youtube/player/YouTubePlayer;", "p2", "", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class YouTubeVideoActivity
extends YouTubeFailureRecoveryActivity {
    private ActivityYoutubeBinding binding;

    @Override
    @NotNull
    public YouTubePlayer.Provider getYouTubePlayerProvider() {
        ActivityYoutubeBinding activityYoutubeBinding;
        ActivityYoutubeBinding activityYoutubeBinding2 = activityYoutubeBinding = this.binding;
        if (activityYoutubeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"binding");
            activityYoutubeBinding2 = null;
        }
        activityYoutubeBinding2 = activityYoutubeBinding2.youTubeView;
        Intrinsics.checkNotNullExpressionValue((Object)activityYoutubeBinding2, (String)"binding.youTubeView");
        return activityYoutubeBinding2;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityYoutubeBinding activityYoutubeBinding = ActivityYoutubeBinding.inflate((LayoutInflater)this.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue((Object)activityYoutubeBinding, (String)"inflate(layoutInflater)");
        this.binding = activityYoutubeBinding;
        Object var2_3 = null;
        bundle = activityYoutubeBinding;
        if (activityYoutubeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"binding");
            bundle = null;
        }
        bundle = bundle.getRoot();
        Intrinsics.checkNotNullExpressionValue((Object)bundle, (String)"binding.root");
        this.getWindow().setFlags(1024, 1024);
        this.setContentView((View)bundle);
        bundle = this.binding;
        if (bundle == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"binding");
            bundle = var2_3;
        }
        bundle.youTubeView.initialize(this.getString(2131755666), (YouTubePlayer.OnInitializedListener)this);
    }

    public void onInitializationSuccess(@Nullable YouTubePlayer.Provider provider, @Nullable YouTubePlayer youTubePlayer, boolean bl) {
        if (!bl && youTubePlayer != null) {
            youTubePlayer.cueVideo(this.getIntent().getStringExtra("youtube_id"));
        }
    }
}

