package androidx.window.embedding;

import android.util.Log;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class EmbeddingCompat
  implements EmbeddingInterfaceCompat
{
  @NotNull
  public static final Companion Companion = new Companion(null);
  public static final boolean DEBUG = true;
  @NotNull
  private static final String TAG = "EmbeddingCompat";
  @NotNull
  private final EmbeddingAdapter adapter;
  @NotNull
  private final ActivityEmbeddingComponent embeddingExtension;
  
  public EmbeddingCompat()
  {
    this(Companion.embeddingComponent(), new EmbeddingAdapter());
  }
  
  public EmbeddingCompat(@NotNull ActivityEmbeddingComponent paramActivityEmbeddingComponent, @NotNull EmbeddingAdapter paramEmbeddingAdapter)
  {
    embeddingExtension = paramActivityEmbeddingComponent;
    adapter = paramEmbeddingAdapter;
  }
  
  public void setEmbeddingCallback(@NotNull EmbeddingInterfaceCompat.EmbeddingCallbackInterface paramEmbeddingCallbackInterface)
  {
    Intrinsics.checkNotNullParameter(paramEmbeddingCallbackInterface, "embeddingCallback");
    paramEmbeddingCallbackInterface = new EmbeddingTranslatingCallback(paramEmbeddingCallbackInterface, adapter);
    embeddingExtension.setSplitInfoCallback(g.a(paramEmbeddingCallbackInterface));
  }
  
  public void setSplitRules(@NotNull Set<? extends EmbeddingRule> paramSet)
  {
    Intrinsics.checkNotNullParameter(paramSet, "rules");
    embeddingExtension.setEmbeddingRules(adapter.translate(paramSet));
  }
  
  @Metadata
  public static final class Companion
  {
    @NotNull
    public final ActivityEmbeddingComponent embeddingComponent()
    {
      if (isEmbeddingAvailable())
      {
        ActivityEmbeddingComponent localActivityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
        localObject = localActivityEmbeddingComponent;
        if (localActivityEmbeddingComponent != null) {
          return localObject;
        }
        localObject = new EmptyEmbeddingComponent();
      }
      else
      {
        localObject = new EmptyEmbeddingComponent();
      }
      Object localObject = (ActivityEmbeddingComponent)localObject;
      return (ActivityEmbeddingComponent)localObject;
    }
    
    public final Integer getExtensionApiLevel()
    {
      Object localObject1 = null;
      String str;
      try
      {
        Integer localInteger = Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        Object localObject2 = "Stub Extension";
        Log.d("EmbeddingCompat", (String)localObject2);
        localObject2 = localObject1;
      }
      catch (NoClassDefFoundError localNoClassDefFoundError)
      {
        for (;;)
        {
          str = "Embedding extension version not found";
        }
      }
      return str;
    }
    
    public final boolean isEmbeddingAvailable()
    {
      boolean bool = false;
      try
      {
        ActivityEmbeddingComponent localActivityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
        if (localActivityEmbeddingComponent != null) {
          bool = true;
        }
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        String str1 = "Stub Extension";
        Log.d("EmbeddingCompat", str1);
      }
      catch (NoClassDefFoundError localNoClassDefFoundError)
      {
        for (;;)
        {
          String str2 = "Embedding extension version not found";
        }
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.EmbeddingCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */