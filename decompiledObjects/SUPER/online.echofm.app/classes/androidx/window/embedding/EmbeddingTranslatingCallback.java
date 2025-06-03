package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@SuppressLint({"NewApi"})
@ExperimentalWindowApi
public final class EmbeddingTranslatingCallback
  implements Consumer<List<? extends SplitInfo>>
{
  @NotNull
  private final EmbeddingAdapter adapter;
  @NotNull
  private final EmbeddingInterfaceCompat.EmbeddingCallbackInterface callback;
  
  public EmbeddingTranslatingCallback(@NotNull EmbeddingInterfaceCompat.EmbeddingCallbackInterface paramEmbeddingCallbackInterface, @NotNull EmbeddingAdapter paramEmbeddingAdapter)
  {
    callback = paramEmbeddingCallbackInterface;
    adapter = paramEmbeddingAdapter;
  }
  
  public void accept(@NotNull List<? extends SplitInfo> paramList)
  {
    Intrinsics.checkNotNullParameter(paramList, "splitInfoList");
    callback.onSplitInfoChanged(adapter.translate(paramList));
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.EmbeddingTranslatingCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */