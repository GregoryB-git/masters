/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  androidx.window.extensions.WindowExtensionsProvider
 *  androidx.window.extensions.embedding.ActivityEmbeddingComponent
 *  androidx.window.extensions.embedding.EmbeddingRule
 *  java.lang.Integer
 *  java.lang.NoClassDefFoundError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Set
 *  java.util.function.Consumer
 */
package androidx.window.embedding;

import android.util.Log;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingAdapter;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.embedding.EmbeddingRule;
import androidx.window.embedding.EmbeddingTranslatingCallback;
import androidx.window.embedding.EmptyEmbeddingComponent;
import androidx.window.embedding.g;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class EmbeddingCompat
implements EmbeddingInterfaceCompat {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final boolean DEBUG = true;
    @NotNull
    private static final String TAG = "EmbeddingCompat";
    @NotNull
    private final EmbeddingAdapter adapter;
    @NotNull
    private final ActivityEmbeddingComponent embeddingExtension;

    public EmbeddingCompat() {
        this(Companion.embeddingComponent(), new EmbeddingAdapter());
    }

    public EmbeddingCompat(@NotNull ActivityEmbeddingComponent activityEmbeddingComponent, @NotNull EmbeddingAdapter embeddingAdapter) {
        Intrinsics.checkNotNullParameter((Object)activityEmbeddingComponent, "embeddingExtension");
        Intrinsics.checkNotNullParameter(embeddingAdapter, "adapter");
        this.embeddingExtension = activityEmbeddingComponent;
        this.adapter = embeddingAdapter;
    }

    @Override
    public void setEmbeddingCallback(@NotNull EmbeddingInterfaceCompat.EmbeddingCallbackInterface object) {
        Intrinsics.checkNotNullParameter(object, "embeddingCallback");
        object = new EmbeddingTranslatingCallback((EmbeddingInterfaceCompat.EmbeddingCallbackInterface)object, this.adapter);
        this.embeddingExtension.setSplitInfoCallback(g.a(object));
    }

    @Override
    public void setSplitRules(@NotNull Set<? extends EmbeddingRule> set) {
        Intrinsics.checkNotNullParameter(set, "rules");
        this.embeddingExtension.setEmbeddingRules(this.adapter.translate(set));
    }

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.g g8) {
            this();
        }

        @NotNull
        public final ActivityEmbeddingComponent embeddingComponent() {
            EmptyEmbeddingComponent emptyEmbeddingComponent;
            block1 : {
                block2 : {
                    block0 : {
                        if (!this.isEmbeddingAvailable()) break block0;
                        ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
                        emptyEmbeddingComponent = activityEmbeddingComponent;
                        if (activityEmbeddingComponent != null) break block1;
                        emptyEmbeddingComponent = new EmptyEmbeddingComponent();
                        break block2;
                    }
                    emptyEmbeddingComponent = new EmptyEmbeddingComponent();
                }
                emptyEmbeddingComponent = emptyEmbeddingComponent;
            }
            return emptyEmbeddingComponent;
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final Integer getExtensionApiLevel() {
            String string2;
            block3 : {
                int n8;
                try {
                    n8 = WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
                }
                catch (NoClassDefFoundError noClassDefFoundError) {}
                return n8;
                string2 = "Embedding extension version not found";
                break block3;
                catch (UnsupportedOperationException unsupportedOperationException) {}
                string2 = "Stub Extension";
            }
            Log.d((String)"EmbeddingCompat", (String)string2);
            return null;
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final boolean isEmbeddingAvailable() {
            String string2;
            block3 : {
                try {
                    ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
                    if (activityEmbeddingComponent == null) return false;
                    return true;
                }
                catch (NoClassDefFoundError noClassDefFoundError) {}
                string2 = "Embedding extension version not found";
                break block3;
                catch (UnsupportedOperationException unsupportedOperationException) {}
                string2 = "Stub Extension";
            }
            Log.d((String)"EmbeddingCompat", (String)string2);
            return false;
        }
    }

}

