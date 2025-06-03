/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.Menu
 *  android.view.MenuItem
 *  androidx.appcompat.app.AppCompatActivity
 *  com.google.android.gms.cast.framework.CastButtonFactory
 *  com.google.android.gms.cast.framework.CastContext
 *  com.google.android.gms.cast.framework.CastSession
 *  com.google.android.gms.cast.framework.CastStateListener
 *  com.google.android.gms.cast.framework.SessionManagerListener
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  tvrain.cast.CastHelper$SessionListener
 */
package tvrain.cast;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.cast.framework.CastButtonFactory;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.CastStateListener;
import com.google.android.gms.cast.framework.SessionManagerListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tvrain.cast.CastHelper;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001eB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u0004\u0018\u00010\fJ\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2={"Ltvrain/cast/CastHelper;", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "savedInstanceState", "Landroid/os/Bundle;", "(Landroidx/appcompat/app/AppCompatActivity;Landroid/os/Bundle;)V", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "setActivity", "(Landroidx/appcompat/app/AppCompatActivity;)V", "mCastContext", "Lcom/google/android/gms/cast/framework/CastContext;", "mCastSession", "Lcom/google/android/gms/cast/framework/CastSession;", "mCastStateListener", "Lcom/google/android/gms/cast/framework/CastStateListener;", "mSessionManagerListener", "Ltvrain/cast/CastHelper$SessionListener;", "mediaRouteMenuItem", "Landroid/view/MenuItem;", "destroy", "", "getCastContext", "getCurrentSession", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onPause", "onResume", "SessionListener", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class CastHelper {
    @Nullable
    private AppCompatActivity activity;
    @Nullable
    private CastContext mCastContext;
    @Nullable
    private CastSession mCastSession;
    @Nullable
    private CastStateListener mCastStateListener;
    @NotNull
    private final SessionListener mSessionManagerListener;
    @Nullable
    private MenuItem mediaRouteMenuItem;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CastHelper(@Nullable AppCompatActivity appCompatActivity, @Nullable Bundle object) {
        this.activity = appCompatActivity;
        this.mSessionManagerListener = new /* Unavailable Anonymous Inner Class!! */;
        appCompatActivity = this.activity;
        if (appCompatActivity == null) return;
        try {
            z3 z32 = new z3(12);
            this.mCastStateListener = z32;
            Intrinsics.checkNotNull((Object)appCompatActivity);
            this.mCastContext = CastContext.getSharedInstance((Context)appCompatActivity);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static /* synthetic */ void a(int n3) {
        CastHelper.lambda$1$lambda$0(n3);
    }

    public static final /* synthetic */ CastSession access$getMCastSession$p(CastHelper castHelper) {
        return castHelper.mCastSession;
    }

    public static final /* synthetic */ void access$setMCastSession$p(CastHelper castHelper, CastSession castSession) {
        castHelper.mCastSession = castSession;
    }

    private static final void lambda$1$lambda$0(int n3) {
    }

    public final void destroy() {
        this.activity = null;
    }

    @Nullable
    public final AppCompatActivity getActivity() {
        return this.activity;
    }

    @Nullable
    public final CastContext getCastContext() {
        return this.mCastContext;
    }

    @Nullable
    public final CastSession getCurrentSession() {
        return this.mCastSession;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter((Object)menu, (String)"menu");
        try {
            AppCompatActivity appCompatActivity = this.activity;
            Intrinsics.checkNotNull((Object)appCompatActivity);
            this.mediaRouteMenuItem = CastButtonFactory.setUpMediaRouteButton((Context)appCompatActivity.getApplicationContext(), (Menu)menu, (int)2131296850);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onPause() {
        try {
            CastContext castContext = this.mCastContext;
            if (castContext != null) {
                CastStateListener castStateListener = this.mCastStateListener;
                Intrinsics.checkNotNull((Object)castStateListener);
                castContext.removeCastStateListener(castStateListener);
            }
            if ((castContext = this.mCastContext) == null) return;
            if ((castContext = castContext.getSessionManager()) == null) return;
            castContext.removeSessionManagerListener((SessionManagerListener)this.mSessionManagerListener, CastSession.class);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onResume() {
        if (this.activity == null) return;
        try {
            CastContext castContext = this.mCastContext;
            if (castContext != null) {
                CastStateListener castStateListener = this.mCastStateListener;
                Intrinsics.checkNotNull((Object)castStateListener);
                castContext.addCastStateListener(castStateListener);
            }
            if ((castContext = this.mCastContext) != null && (castContext = castContext.getSessionManager()) != null) {
                castContext.addSessionManagerListener((SessionManagerListener)this.mSessionManagerListener, CastSession.class);
            }
            if (this.mCastSession != null) return;
            castContext = this.activity;
            Intrinsics.checkNotNull((Object)castContext);
            this.mCastSession = CastContext.getSharedInstance((Context)castContext).getSessionManager().getCurrentCastSession();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void setActivity(@Nullable AppCompatActivity appCompatActivity) {
        this.activity = appCompatActivity;
    }
}

