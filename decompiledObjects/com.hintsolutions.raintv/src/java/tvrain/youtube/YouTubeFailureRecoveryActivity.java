/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.widget.Toast
 *  com.google.android.youtube.player.YouTubeBaseActivity
 *  com.google.android.youtube.player.YouTubeInitializationResult
 *  com.google.android.youtube.player.YouTubePlayer$OnInitializedListener
 *  com.google.android.youtube.player.YouTubePlayer$Provider
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.StringBuilder
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package tvrain.youtube;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH$J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u001c\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2={"Ltvrain/youtube/YouTubeFailureRecoveryActivity;", "Lcom/google/android/youtube/player/YouTubeBaseActivity;", "Lcom/google/android/youtube/player/YouTubePlayer$OnInitializedListener;", "()V", "RECOVERY_DIALOG_REQUEST", "", "getRECOVERY_DIALOG_REQUEST", "()I", "getYouTubePlayerProvider", "Lcom/google/android/youtube/player/YouTubePlayer$Provider;", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onInitializationFailure", "provider", "errorReason", "Lcom/google/android/youtube/player/YouTubeInitializationResult;", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public abstract class YouTubeFailureRecoveryActivity
extends YouTubeBaseActivity
implements YouTubePlayer.OnInitializedListener {
    private final int RECOVERY_DIALOG_REQUEST;

    public YouTubeFailureRecoveryActivity() {
        this.RECOVERY_DIALOG_REQUEST = 1;
    }

    public final int getRECOVERY_DIALOG_REQUEST() {
        return this.RECOVERY_DIALOG_REQUEST;
    }

    @NotNull
    public abstract YouTubePlayer.Provider getYouTubePlayerProvider();

    public void onActivityResult(int n2, int n3, @Nullable Intent intent) {
        if (n2 == this.RECOVERY_DIALOG_REQUEST) {
            this.getYouTubePlayerProvider().initialize(this.getString(2131755666), (YouTubePlayer.OnInitializedListener)this);
        }
    }

    public void onInitializationFailure(@Nullable YouTubePlayer.Provider provider, @Nullable YouTubeInitializationResult youTubeInitializationResult) {
        if (youTubeInitializationResult != null) {
            if (youTubeInitializationResult.isUserRecoverableError()) {
                youTubeInitializationResult.getErrorDialog((Activity)this, this.RECOVERY_DIALOG_REQUEST).show();
            } else {
                provider = new StringBuilder();
                provider.append(this.getString(2131755667));
                provider.append(": ");
                provider.append((Object)youTubeInitializationResult);
                Toast.makeText((Context)this, (CharSequence)provider.toString(), (int)1).show();
            }
        }
    }
}

