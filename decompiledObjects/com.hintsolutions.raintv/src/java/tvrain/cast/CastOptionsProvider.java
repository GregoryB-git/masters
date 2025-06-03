/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.android.gms.cast.MediaMetadata
 *  com.google.android.gms.cast.framework.CastOptions
 *  com.google.android.gms.cast.framework.CastOptions$Builder
 *  com.google.android.gms.cast.framework.OptionsProvider
 *  com.google.android.gms.cast.framework.SessionProvider
 *  com.google.android.gms.cast.framework.media.CastMediaOptions
 *  com.google.android.gms.cast.framework.media.CastMediaOptions$Builder
 *  com.google.android.gms.cast.framework.media.ImagePicker
 *  com.google.android.gms.cast.framework.media.NotificationOptions
 *  com.google.android.gms.cast.framework.media.NotificationOptions$Builder
 *  com.google.android.gms.common.images.WebImage
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package tvrain.cast;

import android.content.Context;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImagePicker;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.images.WebImage;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tvrain.cast.ExpandedControlsActivity;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u000b"}, d2={"Ltvrain/cast/CastOptionsProvider;", "Lcom/google/android/gms/cast/framework/OptionsProvider;", "()V", "getAdditionalSessionProviders", "", "Lcom/google/android/gms/cast/framework/SessionProvider;", "p0", "Landroid/content/Context;", "getCastOptions", "Lcom/google/android/gms/cast/framework/CastOptions;", "ImagePickerImpl", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class CastOptionsProvider
implements OptionsProvider {
    @Nullable
    public List<SessionProvider> getAdditionalSessionProviders(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"p0");
        return null;
    }

    @NotNull
    public CastOptions getCastOptions(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"p0");
        NotificationOptions notificationOptions = new NotificationOptions.Builder().setActions(Arrays.asList((Object[])new String[]{"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"}), new int[]{0, 1}).setTargetActivityClassName(ExpandedControlsActivity.class.getName()).build();
        Intrinsics.checkNotNullExpressionValue((Object)notificationOptions, (String)"Builder()\n              \u2026\n                .build()");
        notificationOptions = new CastMediaOptions.Builder().setImagePicker((ImagePicker)new ImagePickerImpl()).setNotificationOptions(notificationOptions).setExpandedControllerActivityClassName(ExpandedControlsActivity.class.getName()).build();
        Intrinsics.checkNotNullExpressionValue((Object)notificationOptions, (String)"Builder()\n              \u2026\n                .build()");
        context = new CastOptions.Builder().setReceiverApplicationId(context.getString(2131755083)).setCastMediaOptions((CastMediaOptions)notificationOptions).build();
        Intrinsics.checkNotNullExpressionValue((Object)context, (String)"Builder().setReceiverApp\u2026ons(mediaOptions).build()");
        return context;
    }

    @Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2={"Ltvrain/cast/CastOptionsProvider$ImagePickerImpl;", "Lcom/google/android/gms/cast/framework/media/ImagePicker;", "()V", "onPickImage", "Lcom/google/android/gms/common/images/WebImage;", "mediaMetadata", "Lcom/google/android/gms/cast/MediaMetadata;", "type", "", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
    public static final class ImagePickerImpl
    extends ImagePicker {
        @Nullable
        public WebImage onPickImage(@Nullable MediaMetadata mediaMetadata, int n2) {
            if (mediaMetadata != null && mediaMetadata.hasImages()) {
                mediaMetadata = mediaMetadata.getImages();
                Intrinsics.checkNotNullExpressionValue((Object)mediaMetadata, (String)"mediaMetadata.images");
                if (mediaMetadata.size() == 1) {
                    return (WebImage)mediaMetadata.get(0);
                }
                if (n2 == 0) {
                    return (WebImage)mediaMetadata.get(0);
                }
                return (WebImage)mediaMetadata.get(1);
            }
            return null;
        }
    }
}

