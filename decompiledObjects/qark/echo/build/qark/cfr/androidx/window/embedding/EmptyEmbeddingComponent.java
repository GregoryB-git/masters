/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  androidx.window.extensions.embedding.ActivityEmbeddingComponent
 *  androidx.window.extensions.embedding.EmbeddingRule
 *  androidx.window.extensions.embedding.SplitInfo
 *  java.lang.Object
 *  java.util.List
 *  java.util.Set
 *  java.util.function.Consumer
 */
package androidx.window.embedding;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
final class EmptyEmbeddingComponent
implements ActivityEmbeddingComponent {
    public void setEmbeddingRules(@NotNull Set<EmbeddingRule> set) {
        Intrinsics.checkNotNullParameter(set, "splitRules");
    }

    public void setSplitInfoCallback(@NotNull Consumer<List<SplitInfo>> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
    }
}

