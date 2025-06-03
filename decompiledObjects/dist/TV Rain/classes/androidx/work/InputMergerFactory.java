package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

public abstract class InputMergerFactory
{
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static InputMergerFactory getDefaultInputMergerFactory()
  {
    new InputMergerFactory()
    {
      @Nullable
      public InputMerger createInputMerger(@NonNull String paramAnonymousString)
      {
        return null;
      }
    };
  }
  
  @Nullable
  public abstract InputMerger createInputMerger(@NonNull String paramString);
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public final InputMerger createInputMergerWithDefaultFallback(@NonNull String paramString)
  {
    InputMerger localInputMerger1 = createInputMerger(paramString);
    InputMerger localInputMerger2 = localInputMerger1;
    if (localInputMerger1 == null) {
      localInputMerger2 = InputMerger.fromClassName(paramString);
    }
    return localInputMerger2;
  }
}

/* Location:
 * Qualified Name:     androidx.work.InputMergerFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */