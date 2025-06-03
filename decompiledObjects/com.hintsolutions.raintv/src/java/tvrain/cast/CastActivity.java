/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  com.google.android.gms.cast.MediaInfo
 *  com.google.android.gms.cast.framework.CastContext
 *  com.google.android.gms.cast.framework.CastSession
 *  com.google.android.gms.cast.framework.CastStateListener
 *  com.google.android.gms.cast.framework.IntroductoryOverlay
 *  com.google.android.gms.cast.framework.IntroductoryOverlay$Builder
 *  com.google.android.gms.cast.framework.IntroductoryOverlay$OnOverlayDismissedListener
 *  com.google.android.gms.cast.framework.SessionManagerListener
 *  com.hintsolutions.raintv.common.BaseActivity
 *  e0
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  tvrain.cast.CastActivity$Companion
 *  tvrain.cast.CastActivity$MySessionManagerListener
 *  tvrain.cast.CastActivity$PlaybackLocation
 *  tvrain.cast.CastActivity$WhenMappings
 */
package tvrain.cast;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.CastStateListener;
import com.google.android.gms.cast.framework.IntroductoryOverlay;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.hintsolutions.raintv.common.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tvrain.cast.CastActivity;
import tvrain.cast.ExpandedControlsActivity;

@Metadata(d1={"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 62\u00020\u0001:\u0003678B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0004J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H$J\b\u0010$\u001a\u00020%H$J\u0012\u0010&\u001a\u00020\u001a2\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\u0012\u0010)\u001a\u00020\u001f2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u001aH\u0014J\b\u0010-\u001a\u00020\u001aH\u0014J\u0010\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u0018H\u0004J\b\u00100\u001a\u00020\u001aH\u0002J\b\u00101\u001a\u00020\u001aH$J\b\u00102\u001a\u00020\u001aH$J\u0010\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u000205H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00060\u0016R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2={"Ltvrain/cast/CastActivity;", "Lcom/hintsolutions/raintv/common/BaseActivity;", "()V", "castContext", "Lcom/google/android/gms/cast/framework/CastContext;", "getCastContext", "()Lcom/google/android/gms/cast/framework/CastContext;", "setCastContext", "(Lcom/google/android/gms/cast/framework/CastContext;)V", "castSession", "Lcom/google/android/gms/cast/framework/CastSession;", "getCastSession", "()Lcom/google/android/gms/cast/framework/CastSession;", "setCastSession", "(Lcom/google/android/gms/cast/framework/CastSession;)V", "mCastStateListener", "Lcom/google/android/gms/cast/framework/CastStateListener;", "mIntroductoryOverlay", "Lcom/google/android/gms/cast/framework/IntroductoryOverlay;", "mSelectedMedia", "Lcom/google/android/gms/cast/MediaInfo;", "mSessionManagerListener", "Ltvrain/cast/CastActivity$MySessionManagerListener;", "mediaRouteMenuItem", "Landroid/view/MenuItem;", "castMedia", "", "mediaInfo", "position", "", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "getCastLabel", "Landroid/widget/TextView;", "getCastLayout", "Landroid/widget/LinearLayout;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onPause", "onResume", "setMediaRouteMenuItem", "menuItem", "showIntroductoryOverlay", "startCast", "startVideo", "updatePlaybackLocation", "location", "Ltvrain/cast/CastActivity$PlaybackLocation;", "Companion", "MySessionManagerListener", "PlaybackLocation", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public abstract class CastActivity
extends BaseActivity {
    @NotNull
    public static final Companion Companion = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static PlaybackLocation playbackLocation = PlaybackLocation.IDLE;
    public CastContext castContext;
    @Nullable
    private CastSession castSession;
    private CastStateListener mCastStateListener;
    @Nullable
    private IntroductoryOverlay mIntroductoryOverlay;
    @Nullable
    private MediaInfo mSelectedMedia;
    @NotNull
    private MySessionManagerListener mSessionManagerListener = new /* Unavailable Anonymous Inner Class!! */;
    @Nullable
    private MenuItem mediaRouteMenuItem;

    public static /* synthetic */ void A(CastActivity castActivity) {
        CastActivity.showIntroductoryOverlay$lambda$2(castActivity);
    }

    public static /* synthetic */ void B(CastActivity castActivity, int n2) {
        CastActivity.onCreate$lambda$0(castActivity, n2);
    }

    public static final /* synthetic */ PlaybackLocation access$getPlaybackLocation$cp() {
        return playbackLocation;
    }

    public static final /* synthetic */ void access$setPlaybackLocation$cp(PlaybackLocation playbackLocation) {
        CastActivity.playbackLocation = playbackLocation;
    }

    public static final /* synthetic */ void access$updatePlaybackLocation(CastActivity castActivity, PlaybackLocation playbackLocation) {
        castActivity.updatePlaybackLocation(playbackLocation);
    }

    @NotNull
    public static final PlaybackLocation getPlaybackLocation() {
        return Companion.getPlaybackLocation();
    }

    private static final void onCreate$lambda$0(CastActivity castActivity, int n2) {
        Intrinsics.checkNotNullParameter((Object)((Object)castActivity), (String)"this$0");
        if (n2 != 1) {
            castActivity.showIntroductoryOverlay();
        }
    }

    public static final void setPlaybackLocation(@NotNull PlaybackLocation playbackLocation) {
        Companion.setPlaybackLocation(playbackLocation);
    }

    private final void showIntroductoryOverlay() {
        IntroductoryOverlay introductoryOverlay = this.mIntroductoryOverlay;
        if (introductoryOverlay != null) {
            introductoryOverlay.remove();
        }
        introductoryOverlay = this.mediaRouteMenuItem;
        boolean bl = true;
        if (introductoryOverlay == null || !introductoryOverlay.isVisible()) {
            bl = false;
        }
        if (bl) {
            new Handler().post((Runnable)new h0((Object)this, 9));
        }
    }

    private static final void showIntroductoryOverlay$lambda$2(CastActivity castActivity) {
        Intrinsics.checkNotNullParameter((Object)((Object)castActivity), (String)"this$0");
        MenuItem menuItem = castActivity.mediaRouteMenuItem;
        Intrinsics.checkNotNull((Object)menuItem);
        menuItem = new IntroductoryOverlay.Builder((Activity)castActivity, menuItem).setTitleText(castActivity.getString(2131755301)).setOverlayColor(2131099728).setSingleTime().setButtonText(castActivity.getString(2131755070)).setOnOverlayDismissedListener((IntroductoryOverlay.OnOverlayDismissedListener)new e0(castActivity)).build();
        castActivity.mIntroductoryOverlay = menuItem;
        if (menuItem != null) {
            menuItem.show();
        }
    }

    private static final void showIntroductoryOverlay$lambda$2$lambda$1(CastActivity castActivity) {
        Intrinsics.checkNotNullParameter((Object)((Object)castActivity), (String)"this$0");
        castActivity.mIntroductoryOverlay = null;
    }

    private final void updatePlaybackLocation(PlaybackLocation playbackLocation) {
        int[] nArray = WhenMappings.$EnumSwitchMapping$0;
        int n2 = nArray[playbackLocation.ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                this.getCastLayout().setVisibility(8);
            } else {
                this.getCastLayout().setVisibility(0);
                TextView textView = this.getCastLabel();
                Object object = this.castSession;
                object = object != null && (object = object.getCastDevice()) != null ? object.getFriendlyName() : null;
                textView.setText((CharSequence)this.getString(2131755132, new Object[]{object}));
            }
        } else {
            this.getCastLayout().setVisibility(8);
        }
        if (playbackLocation == CastActivity.playbackLocation && playbackLocation == PlaybackLocation.REMOTE) {
            return;
        }
        CastActivity.playbackLocation = playbackLocation;
        n2 = nArray[playbackLocation.ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                this.startVideo();
            } else {
                this.startCast();
            }
        } else {
            this.startVideo();
        }
    }

    public static /* synthetic */ void z(CastActivity castActivity) {
        CastActivity.showIntroductoryOverlay$lambda$2$lambda$1(castActivity);
    }

    public final void castMedia(@NotNull MediaInfo mediaInfo, int n2) {
        Intrinsics.checkNotNullParameter((Object)mediaInfo, (String)"mediaInfo");
        CastSession castSession = this.castSession;
        if (castSession == null) {
            return;
        }
        this.mSelectedMedia = mediaInfo;
        if (castSession != null && (mediaInfo = castSession.getRemoteMediaClient()) != null) {
            castSession = this.mSelectedMedia;
            Intrinsics.checkNotNull((Object)castSession);
            mediaInfo.load((MediaInfo)castSession, true, (long)n2);
            this.startActivity(new Intent((Context)this, ExpandedControlsActivity.class));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter((Object)keyEvent, (String)"event");
        boolean bl = false;
        try {
            if (this.getCastContext().onDispatchVolumeKeyEventBeforeJellyBean(keyEvent)) return true;
            boolean bl2 = super.dispatchKeyEvent(keyEvent);
            if (!bl2) return bl;
            return true;
        }
        catch (Throwable throwable) {
            return bl;
        }
    }

    @NotNull
    public final CastContext getCastContext() {
        CastContext castContext = this.castContext;
        if (castContext != null) {
            return castContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)"castContext");
        return null;
    }

    @NotNull
    public abstract TextView getCastLabel();

    @NotNull
    public abstract LinearLayout getCastLayout();

    @Nullable
    public final CastSession getCastSession() {
        return this.castSession;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mCastStateListener = new e0(this);
        try {
            bundle = CastContext.getSharedInstance((Context)this);
            Intrinsics.checkNotNullExpressionValue((Object)bundle, (String)"getSharedInstance(this)");
            this.setCastContext((CastContext)bundle);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public boolean onCreateOptionsMenu(@Nullable Menu menu) {
        this.showIntroductoryOverlay();
        return super.onCreateOptionsMenu(menu);
    }

    public void onPause() {
        block6: {
            CastStateListener castStateListener;
            CastContext castContext;
            block5: {
                CastStateListener castStateListener2;
                castContext = this.getCastContext();
                castStateListener = castStateListener2 = this.mCastStateListener;
                if (castStateListener2 != null) break block5;
                Intrinsics.throwUninitializedPropertyAccessException((String)"mCastStateListener");
                castStateListener = null;
            }
            castContext.removeCastStateListener(castStateListener);
            castStateListener = this.getCastContext().getSessionManager();
            if (castStateListener == null) break block6;
            try {
                castStateListener.removeSessionManagerListener((SessionManagerListener)this.mSessionManagerListener, CastSession.class);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        super.onPause();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onResume() {
        CastStateListener castStateListener;
        CastStateListener castStateListener2;
        Object var2_1 = null;
        try {
            CastContext castContext = this.getCastContext();
            castStateListener = castStateListener2 = this.mCastStateListener;
            if (castStateListener2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"mCastStateListener");
                castStateListener = null;
            }
            castContext.addCastStateListener(castStateListener);
            castStateListener = this.getCastContext().getSessionManager();
            if (castStateListener != null) {
                castStateListener.addSessionManagerListener((SessionManagerListener)this.mSessionManagerListener, CastSession.class);
            }
            if (this.castSession == null) {
                this.castSession = CastContext.getSharedInstance((Context)this).getSessionManager().getCurrentCastSession();
            }
        }
        catch (Exception exception) {}
        castStateListener2 = this.castSession;
        castStateListener = var2_1;
        if (castStateListener2 != null) {
            castStateListener = castStateListener2.getCastDevice();
        }
        if (castStateListener != null) {
            this.updatePlaybackLocation(PlaybackLocation.REMOTE);
        } else {
            this.updatePlaybackLocation(PlaybackLocation.LOCAL);
        }
        super.onResume();
    }

    public final void setCastContext(@NotNull CastContext castContext) {
        Intrinsics.checkNotNullParameter((Object)castContext, (String)"<set-?>");
        this.castContext = castContext;
    }

    public final void setCastSession(@Nullable CastSession castSession) {
        this.castSession = castSession;
    }

    public final void setMediaRouteMenuItem(@NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter((Object)menuItem, (String)"menuItem");
        this.mediaRouteMenuItem = menuItem;
    }

    public abstract void startCast();

    public abstract void startVideo();
}

