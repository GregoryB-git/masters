// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.embedding;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import androidx.window.core.ExperimentalWindowApi;
import android.annotation.SuppressLint;
import kotlin.Metadata;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.function.Consumer;

@Metadata
@SuppressLint({ "NewApi" })
@ExperimentalWindowApi
public final class EmbeddingTranslatingCallback implements Consumer<List<? extends SplitInfo>>
{
    @NotNull
    private final EmbeddingAdapter adapter;
    @NotNull
    private final EmbeddingInterfaceCompat.EmbeddingCallbackInterface callback;
    
    public EmbeddingTranslatingCallback(@NotNull final EmbeddingInterfaceCompat.EmbeddingCallbackInterface callback, @NotNull final EmbeddingAdapter adapter) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.callback = callback;
        this.adapter = adapter;
    }
    
    @Override
    public void accept(@NotNull final List<? extends SplitInfo> list) {
        Intrinsics.checkNotNullParameter(list, "splitInfoList");
        this.callback.onSplitInfoChanged(this.adapter.translate(list));
    }
}
