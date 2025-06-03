/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 *  java.util.Set
 */
package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingRule;
import androidx.window.embedding.SplitInfo;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public interface EmbeddingInterfaceCompat {
    public void setEmbeddingCallback(@NotNull EmbeddingCallbackInterface var1);

    public void setSplitRules(@NotNull Set<? extends EmbeddingRule> var1);

    @Metadata
    public static interface EmbeddingCallbackInterface {
        public void onSplitInfoChanged(@NotNull List<SplitInfo> var1);
    }

}

