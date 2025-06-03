/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  androidx.appcompat.app.AppCompatActivity
 *  com.google.android.gms.cast.framework.CastButtonFactory
 *  com.google.android.gms.cast.framework.CastContext
 *  com.google.android.gms.cast.framework.CastSession
 *  com.google.android.gms.cast.framework.SessionManagerListener
 *  com.hintsolutions.raintv.databinding.ActivityExpandedControlsBinding
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  tvrain.cast.ExpandedControlsActivity$SessionManagerListenerImpl
 */
package tvrain.cast;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.cast.framework.CastButtonFactory;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.hintsolutions.raintv.databinding.ActivityExpandedControlsBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tvrain.cast.ExpandedControlsActivity;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0014J\b\u0010\u0013\u001a\u00020\bH\u0014J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2={"Ltvrain/cast/ExpandedControlsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/hintsolutions/raintv/databinding/ActivityExpandedControlsBinding;", "mSessionManagerListener", "Ltvrain/cast/ExpandedControlsActivity$SessionManagerListenerImpl;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onWindowFocusChanged", "hasFocus", "setImmersive", "SessionManagerListenerImpl", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class ExpandedControlsActivity
extends AppCompatActivity {
    private ActivityExpandedControlsBinding binding;
    @NotNull
    private final SessionManagerListenerImpl mSessionManagerListener = new /* Unavailable Anonymous Inner Class!! */;

    @TargetApi(value=11)
    private final void setImmersive() {
        int n2 = this.getWindow().getDecorView().getSystemUiVisibility();
        this.getWindow().getDecorView().setSystemUiVisibility(n2 ^ 0x1000);
        this.setImmersive(true);
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityExpandedControlsBinding activityExpandedControlsBinding = ActivityExpandedControlsBinding.inflate((LayoutInflater)this.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue((Object)activityExpandedControlsBinding, (String)"inflate(layoutInflater)");
        this.binding = activityExpandedControlsBinding;
        Object var2_3 = null;
        bundle = activityExpandedControlsBinding;
        if (activityExpandedControlsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"binding");
            bundle = null;
        }
        bundle = bundle.getRoot();
        Intrinsics.checkNotNullExpressionValue((Object)bundle, (String)"binding.root");
        this.setContentView((View)bundle);
        bundle = this.binding;
        if (bundle == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"binding");
            bundle = var2_3;
        }
        this.setSupportActionBar(bundle.toolbar);
        bundle = this.getSupportActionBar();
        if (bundle != null) {
            bundle.setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter((Object)menu, (String)"menu");
        super.onCreateOptionsMenu(menu);
        this.getMenuInflater().inflate(2131558400, menu);
        CastButtonFactory.setUpMediaRouteButton((Context)this, (Menu)menu, (int)2131296850);
        return true;
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter((Object)menuItem, (String)"item");
        if (menuItem.getItemId() == 16908332) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        CastContext.getSharedInstance((Context)this).getSessionManager().removeSessionManagerListener((SessionManagerListener)this.mSessionManagerListener);
        super.onPause();
    }

    public void onResume() {
        CastContext.getSharedInstance((Context)this).getSessionManager().addSessionManagerListener((SessionManagerListener)this.mSessionManagerListener);
        CastSession castSession = CastContext.getSharedInstance((Context)this).getSessionManager().getCurrentCastSession();
        if (castSession == null || !castSession.isConnected() && !castSession.isConnecting()) {
            this.finish();
        }
        super.onResume();
    }

    public void onWindowFocusChanged(boolean bl) {
        super.onWindowFocusChanged(bl);
        if (bl) {
            this.setImmersive();
        }
    }
}

