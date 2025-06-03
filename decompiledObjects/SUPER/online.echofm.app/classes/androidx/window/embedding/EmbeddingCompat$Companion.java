package androidx.window.embedding;

import android.util.Log;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class EmbeddingCompat$Companion
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

/* Location:
 * Qualified Name:     androidx.window.embedding.EmbeddingCompat.Companion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */