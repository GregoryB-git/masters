/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentActivity
 *  com.google.android.gms.cast.framework.CastContext
 *  com.google.android.gms.cast.framework.CastSession
 *  com.google.android.gms.cast.framework.media.RemoteMediaClient
 *  com.google.android.gms.cast.framework.media.RemoteMediaClient$Listener
 *  com.google.android.gms.cast.framework.media.uicontroller.UIMediaController
 *  com.hintsolutions.raintv.databinding.FragmentCastExpandedControlsBinding
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  tvrain.cast.ExpandedControlsFragment$RemoteMediaClientListener
 */
package tvrain.cast;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIMediaController;
import com.hintsolutions.raintv.databinding.FragmentCastExpandedControlsBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tvrain.cast.ExpandedControlsFragment;

@Metadata(d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\b\u0010 \u001a\u00020\u0015H\u0016J\u001a\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u0015H\u0002J\b\u0010'\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020\u0015H\u0002J\b\u0010)\u001a\u00020\u0015H\u0002J\b\u0010*\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006,"}, d2={"Ltvrain/cast/ExpandedControlsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/hintsolutions/raintv/databinding/FragmentCastExpandedControlsBinding;", "binding", "getBinding", "()Lcom/hintsolutions/raintv/databinding/FragmentCastExpandedControlsBinding;", "mPostRemoteMediaClientListener", "Ltvrain/cast/ExpandedControlsFragment$RemoteMediaClientListener;", "mUIMediaController", "Lcom/google/android/gms/cast/framework/media/uicontroller/UIMediaController;", "getMUIMediaController", "()Lcom/google/android/gms/cast/framework/media/uicontroller/UIMediaController;", "setMUIMediaController", "(Lcom/google/android/gms/cast/framework/media/uicontroller/UIMediaController;)V", "remoteMediaClient", "Lcom/google/android/gms/cast/framework/media/RemoteMediaClient;", "getRemoteMediaClient", "()Lcom/google/android/gms/cast/framework/media/RemoteMediaClient;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onViewCreated", "view", "setButtonBackgroundResource", "button", "Landroid/widget/ImageButton;", "setUpBackgroundImage", "setUpSeekbarControls", "setUpTransportControls", "updateSubtitle", "updateToolbarTitle", "RemoteMediaClientListener", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class ExpandedControlsFragment
extends Fragment {
    @Nullable
    private FragmentCastExpandedControlsBinding _binding;
    @NotNull
    private final RemoteMediaClientListener mPostRemoteMediaClientListener = new /* Unavailable Anonymous Inner Class!! */;
    public UIMediaController mUIMediaController;

    public static final /* synthetic */ FragmentCastExpandedControlsBinding access$getBinding(ExpandedControlsFragment expandedControlsFragment) {
        return expandedControlsFragment.getBinding();
    }

    public static final /* synthetic */ RemoteMediaClient access$getRemoteMediaClient(ExpandedControlsFragment expandedControlsFragment) {
        return expandedControlsFragment.getRemoteMediaClient();
    }

    public static final /* synthetic */ void access$updateSubtitle(ExpandedControlsFragment expandedControlsFragment) {
        expandedControlsFragment.updateSubtitle();
    }

    public static final /* synthetic */ void access$updateToolbarTitle(ExpandedControlsFragment expandedControlsFragment) {
        expandedControlsFragment.updateToolbarTitle();
    }

    private final FragmentCastExpandedControlsBinding getBinding() {
        FragmentCastExpandedControlsBinding fragmentCastExpandedControlsBinding = this._binding;
        Intrinsics.checkNotNull((Object)fragmentCastExpandedControlsBinding);
        return fragmentCastExpandedControlsBinding;
    }

    private final RemoteMediaClient getRemoteMediaClient() {
        Context context = this.getContext();
        Object var2_2 = null;
        if (context == null) {
            return null;
        }
        CastSession castSession = CastContext.getSharedInstance((Context)context).getSessionManager().getCurrentCastSession();
        context = var2_2;
        if (castSession != null) {
            context = var2_2;
            if (castSession.isConnected()) {
                context = castSession.getRemoteMediaClient();
            }
        }
        return context;
    }

    private final void setButtonBackgroundResource(ImageButton imageButton) {
        Object object = this.getActivity();
        object = object != null && (object = object.getTheme()) != null ? object.obtainStyledAttributes(new int[]{2130969676}) : null;
        if (object != null) {
            int n2 = object.getResourceId(0, 0);
            object.recycle();
            imageButton.setBackgroundResource(n2);
        }
    }

    private final void setUpBackgroundImage() {
        this.getMUIMediaController().bindImageViewToImageOfCurrentItem(this.getBinding().backgroundImageview, -1, 2131230726);
        this.getMUIMediaController().bindViewToLoadingIndicator((View)this.getBinding().loadingIndicator);
    }

    private final void setUpSeekbarControls() {
        this.getMUIMediaController().bindTextViewToStreamPosition(this.getBinding().startText, true);
        this.getMUIMediaController().bindTextViewToStreamDuration(this.getBinding().endText);
        this.getMUIMediaController().bindSeekBar(this.getBinding().seekbar);
    }

    private final void setUpTransportControls() {
        ImageButton imageButton = this.getBinding().playPauseImageButton;
        Intrinsics.checkNotNullExpressionValue((Object)imageButton, (String)"binding.playPauseImageButton");
        this.setButtonBackgroundResource(imageButton);
        Drawable drawable = this.getResources().getDrawable(2131231171);
        Drawable drawable2 = this.getResources().getDrawable(2131231175);
        imageButton.setImageDrawable(drawable2);
        UIMediaController uIMediaController = this.getMUIMediaController();
        Intrinsics.checkNotNull((Object)drawable2);
        Intrinsics.checkNotNull((Object)drawable);
        uIMediaController.bindImageViewToPlayPauseToggle((ImageView)imageButton, drawable2, drawable, drawable, null, false);
    }

    private final void updateSubtitle() {
        Context context = this.getContext();
        if (context == null) {
            return;
        }
        Object object = CastContext.getSharedInstance((Context)context).getSessionManager().getCurrentCastSession();
        context = null;
        FragmentCastExpandedControlsBinding fragmentCastExpandedControlsBinding = null;
        if (object != null && (object = object.getCastDevice()) != null) {
            object = object.getFriendlyName();
            Intrinsics.checkNotNullExpressionValue((Object)object, (String)"castDevice.friendlyName");
            if (!TextUtils.isEmpty((CharSequence)object)) {
                FragmentCastExpandedControlsBinding fragmentCastExpandedControlsBinding2 = this.getBinding();
                context = fragmentCastExpandedControlsBinding;
                if (fragmentCastExpandedControlsBinding2 != null) {
                    context = fragmentCastExpandedControlsBinding2.subtitle;
                }
                if (context != null) {
                    context.setText((CharSequence)this.getResources().getString(2131755084, new Object[]{object}));
                }
                return;
            }
        }
        if ((fragmentCastExpandedControlsBinding = this.getBinding()) != null) {
            context = fragmentCastExpandedControlsBinding.subtitle;
        }
        if (context != null) {
            context.setText((CharSequence)"");
        }
    }

    private final void updateToolbarTitle() {
        RemoteMediaClient remoteMediaClient = this.getRemoteMediaClient();
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && (remoteMediaClient = remoteMediaClient.getMediaInfo()) != null && (remoteMediaClient = remoteMediaClient.getMetadata()) != null) {
            FragmentActivity fragmentActivity = this.getActivity();
            Intrinsics.checkNotNull((Object)fragmentActivity, (String)"null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            fragmentActivity = ((AppCompatActivity)fragmentActivity).getSupportActionBar();
            Intrinsics.checkNotNull((Object)fragmentActivity);
            fragmentActivity.setTitle((CharSequence)remoteMediaClient.getString("com.google.android.gms.cast.metadata.TITLE"));
        }
    }

    @NotNull
    public final UIMediaController getMUIMediaController() {
        UIMediaController uIMediaController = this.mUIMediaController;
        if (uIMediaController != null) {
            return uIMediaController;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)"mUIMediaController");
        return null;
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.updateSubtitle();
        this.updateToolbarTitle();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = this.getContext();
        if (bundle == null) {
            return;
        }
        if (CastContext.getSharedInstance((Context)bundle).getSessionManager().getCurrentCastSession() == null && (bundle = this.getActivity()) != null) {
            bundle.finish();
        }
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter((Object)layoutInflater, (String)"inflater");
        this.setMUIMediaController(new UIMediaController((Activity)this.requireActivity()));
        this.getMUIMediaController().setPostRemoteMediaClientListener((RemoteMediaClient.Listener)this.mPostRemoteMediaClientListener);
        this._binding = FragmentCastExpandedControlsBinding.inflate((LayoutInflater)layoutInflater, (ViewGroup)viewGroup, (boolean)false);
        return this.getBinding().getRoot();
    }

    public void onDestroy() {
        this.getMUIMediaController().setPostRemoteMediaClientListener(null);
        this.getMUIMediaController().dispose();
        super.onDestroy();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter((Object)view, (String)"view");
        super.onViewCreated(view, bundle);
        this.setUpBackgroundImage();
        this.setUpSeekbarControls();
        this.setUpTransportControls();
    }

    public final void setMUIMediaController(@NotNull UIMediaController uIMediaController) {
        Intrinsics.checkNotNullParameter((Object)uIMediaController, (String)"<set-?>");
        this.mUIMediaController = uIMediaController;
    }
}

