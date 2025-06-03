package androidx.window.embedding;

import V5.t;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class ExtensionEmbeddingBackend$Companion
{
  private final EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension()
  {
    Object localObject1 = null;
    Object localObject4;
    try
    {
      EmbeddingCompat.Companion localCompanion = EmbeddingCompat.Companion;
      Object localObject2 = localObject1;
      if (isExtensionVersionSupported(localCompanion.getExtensionApiLevel()))
      {
        localObject2 = localObject1;
        if (localCompanion.isEmbeddingAvailable())
        {
          localObject2 = new androidx/window/embedding/EmbeddingCompat;
          ((EmbeddingCompat)localObject2).<init>();
        }
      }
    }
    finally
    {
      Log.d("EmbeddingBackend", Intrinsics.i("Failed to load embedding extension: ", localObject3));
      localObject4 = localObject1;
    }
    if (localObject4 == null) {
      Log.d("EmbeddingBackend", "No supported embedding extension found");
    }
    return (EmbeddingInterfaceCompat)localObject4;
  }
  
  @NotNull
  public final ExtensionEmbeddingBackend getInstance()
  {
    if (ExtensionEmbeddingBackend.access$getGlobalInstance$cp() == null)
    {
      localObject1 = ExtensionEmbeddingBackend.access$getGlobalLock$cp();
      ((Lock)localObject1).lock();
      try
      {
        if (ExtensionEmbeddingBackend.access$getGlobalInstance$cp() == null)
        {
          EmbeddingInterfaceCompat localEmbeddingInterfaceCompat = ExtensionEmbeddingBackend.Companion.initAndVerifyEmbeddingExtension();
          ExtensionEmbeddingBackend localExtensionEmbeddingBackend = new androidx/window/embedding/ExtensionEmbeddingBackend;
          localExtensionEmbeddingBackend.<init>(localEmbeddingInterfaceCompat);
          ExtensionEmbeddingBackend.access$setGlobalInstance$cp(localExtensionEmbeddingBackend);
        }
      }
      finally
      {
        break label62;
      }
      t localt = t.a;
      ((Lock)localObject1).unlock();
      break label70;
      label62:
      ((Lock)localObject1).unlock();
      throw localt;
    }
    label70:
    Object localObject1 = ExtensionEmbeddingBackend.access$getGlobalInstance$cp();
    Intrinsics.b(localObject1);
    return (ExtensionEmbeddingBackend)localObject1;
  }
  
  public final boolean isExtensionVersionSupported(Integer paramInteger)
  {
    boolean bool = false;
    if (paramInteger == null) {
      return false;
    }
    if (paramInteger.intValue() >= 1) {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.ExtensionEmbeddingBackend.Companion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */