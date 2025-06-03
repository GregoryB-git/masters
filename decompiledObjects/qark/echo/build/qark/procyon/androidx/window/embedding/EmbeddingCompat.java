// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.embedding;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import org.jetbrains.annotations.NotNull;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

@Metadata
@ExperimentalWindowApi
public final class EmbeddingCompat implements EmbeddingInterfaceCompat
{
    @NotNull
    public static final Companion Companion;
    public static final boolean DEBUG = true;
    @NotNull
    private static final String TAG = "EmbeddingCompat";
    @NotNull
    private final EmbeddingAdapter adapter;
    @NotNull
    private final ActivityEmbeddingComponent embeddingExtension;
    
    static {
        Companion = new Companion(null);
    }
    
    public EmbeddingCompat() {
        this(EmbeddingCompat.Companion.embeddingComponent(), new EmbeddingAdapter());
    }
    
    public EmbeddingCompat(@NotNull final ActivityEmbeddingComponent embeddingExtension, @NotNull final EmbeddingAdapter adapter) {
        Intrinsics.checkNotNullParameter(embeddingExtension, "embeddingExtension");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.embeddingExtension = embeddingExtension;
        this.adapter = adapter;
    }
    
    @Override
    public void setEmbeddingCallback(@NotNull final EmbeddingCallbackInterface embeddingCallbackInterface) {
        Intrinsics.checkNotNullParameter(embeddingCallbackInterface, "embeddingCallback");
        this.embeddingExtension.setSplitInfoCallback(androidx.window.embedding.g.a((Object)new EmbeddingTranslatingCallback(embeddingCallbackInterface, this.adapter)));
    }
    
    @Override
    public void setSplitRules(@NotNull final Set<? extends EmbeddingRule> set) {
        Intrinsics.checkNotNullParameter(set, "rules");
        this.embeddingExtension.setEmbeddingRules((Set)this.adapter.translate(set));
    }
    
    @Metadata
    public static final class Companion
    {
        private Companion() {
        }
        
        @NotNull
        public final ActivityEmbeddingComponent embeddingComponent() {
            EmptyEmbeddingComponent emptyEmbeddingComponent;
            if (this.isEmbeddingAvailable()) {
                final ActivityEmbeddingComponent activityEmbeddingComponent;
                if ((activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent()) != null) {
                    return activityEmbeddingComponent;
                }
                emptyEmbeddingComponent = new EmptyEmbeddingComponent();
            }
            else {
                emptyEmbeddingComponent = new EmptyEmbeddingComponent();
            }
            return (ActivityEmbeddingComponent)emptyEmbeddingComponent;
        }
        
        public final Integer getExtensionApiLevel() {
        Label_0014_Outer:
            while (true) {
                while (true) {
                    while (true) {
                        try {
                            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
                            while (true) {
                                String s = null;
                                Log.d("EmbeddingCompat", s);
                                return null;
                                s = "Stub Extension";
                                continue Label_0014_Outer;
                                s = "Embedding extension version not found";
                                continue Label_0014_Outer;
                            }
                        }
                        catch (NoClassDefFoundError noClassDefFoundError) {
                            continue;
                        }
                        catch (UnsupportedOperationException ex) {}
                        break;
                    }
                    continue;
                }
            }
        }
        
        public final boolean isEmbeddingAvailable() {
            while (true) {
                while (true) {
                    try {
                        return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
                        Log.d("EmbeddingCompat", "Stub Extension");
                        return false;
                    }
                    catch (NoClassDefFoundError noClassDefFoundError) {}
                    catch (UnsupportedOperationException ex) {}
                    continue;
                }
            }
        }
    }
}
