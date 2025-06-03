/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  androidx.window.extensions.embedding.SplitInfo
 *  java.lang.Object
 *  java.util.List
 *  java.util.function.Consumer
 */
package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingAdapter;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.embedding.SplitInfo;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@SuppressLint(value={"NewApi"})
@ExperimentalWindowApi
public final class EmbeddingTranslatingCallback
implements Consumer<List<? extends androidx.window.extensions.embedding.SplitInfo>> {
    @NotNull
    private final EmbeddingAdapter adapter;
    @NotNull
    private final EmbeddingInterfaceCompat.EmbeddingCallbackInterface callback;

    public EmbeddingTranslatingCallback(@NotNull EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface, @NotNull EmbeddingAdapter embeddingAdapter) {
        Intrinsics.checkNotNullParameter(embeddingCallbackInterface, "callback");
        Intrinsics.checkNotNullParameter(embeddingAdapter, "adapter");
        this.callback = embeddingCallbackInterface;
        this.adapter = embeddingAdapter;
    }

    public void accept(@NotNull List<? extends androidx.window.extensions.embedding.SplitInfo> list) {
        Intrinsics.checkNotNullParameter(list, "splitInfoList");
        this.callback.onSplitInfoChanged(this.adapter.translate(list));
    }
}

