package androidx.window.embedding;

import android.util.Log;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ExperimentalWindowApi
@Metadata
/* loaded from: classes.dex */
public final class EmbeddingCompat implements EmbeddingInterfaceCompat {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final boolean DEBUG = true;

    @NotNull
    private static final String TAG = "EmbeddingCompat";

    @NotNull
    private final EmbeddingAdapter adapter;

    @NotNull
    private final ActivityEmbeddingComponent embeddingExtension;

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
            this();
        }

        @NotNull
        public final ActivityEmbeddingComponent embeddingComponent() {
            EmptyEmbeddingComponent emptyEmbeddingComponent;
            if (isEmbeddingAvailable()) {
                ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
                if (activityEmbeddingComponent != null) {
                    return activityEmbeddingComponent;
                }
                emptyEmbeddingComponent = new EmptyEmbeddingComponent();
            } else {
                emptyEmbeddingComponent = new EmptyEmbeddingComponent();
            }
            return emptyEmbeddingComponent;
        }

        public final Integer getExtensionApiLevel() {
            String str;
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError unused) {
                str = "Embedding extension version not found";
                Log.d(EmbeddingCompat.TAG, str);
                return null;
            } catch (UnsupportedOperationException unused2) {
                str = "Stub Extension";
                Log.d(EmbeddingCompat.TAG, str);
                return null;
            }
        }

        public final boolean isEmbeddingAvailable() {
            String str;
            try {
                return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
            } catch (NoClassDefFoundError unused) {
                str = "Embedding extension version not found";
                Log.d(EmbeddingCompat.TAG, str);
                return false;
            } catch (UnsupportedOperationException unused2) {
                str = "Stub Extension";
                Log.d(EmbeddingCompat.TAG, str);
                return false;
            }
        }
    }

    public EmbeddingCompat() {
        this(Companion.embeddingComponent(), new EmbeddingAdapter());
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setEmbeddingCallback(@NotNull EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallback) {
        Intrinsics.checkNotNullParameter(embeddingCallback, "embeddingCallback");
        this.embeddingExtension.setSplitInfoCallback(g.a(new EmbeddingTranslatingCallback(embeddingCallback, this.adapter)));
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setSplitRules(@NotNull Set<? extends EmbeddingRule> rules) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.embeddingExtension.setEmbeddingRules(this.adapter.translate(rules));
    }

    public EmbeddingCompat(@NotNull ActivityEmbeddingComponent embeddingExtension, @NotNull EmbeddingAdapter adapter) {
        Intrinsics.checkNotNullParameter(embeddingExtension, "embeddingExtension");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.embeddingExtension = embeddingExtension;
        this.adapter = adapter;
    }
}
