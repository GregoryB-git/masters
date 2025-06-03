package butterknife;

import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.util.List;

public final class ViewCollections
{
  @UiThread
  public static <T extends View> void run(@NonNull T paramT, @NonNull Action<? super T> paramAction)
  {
    paramAction.apply(paramT, 0);
  }
  
  @SafeVarargs
  @UiThread
  public static <T extends View> void run(@NonNull T paramT, @NonNull Action<? super T>... paramVarArgs)
  {
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++) {
      paramVarArgs[j].apply(paramT, 0);
    }
  }
  
  @UiThread
  public static <T extends View> void run(@NonNull List<T> paramList, @NonNull Action<? super T> paramAction)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      paramAction.apply((View)paramList.get(j), j);
    }
  }
  
  @SafeVarargs
  @UiThread
  public static <T extends View> void run(@NonNull List<T> paramList, @NonNull Action<? super T>... paramVarArgs)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      int k = paramVarArgs.length;
      for (int m = 0; m < k; m++) {
        paramVarArgs[m].apply((View)paramList.get(j), j);
      }
    }
  }
  
  @UiThread
  public static <T extends View> void run(@NonNull T[] paramArrayOfT, @NonNull Action<? super T> paramAction)
  {
    int i = paramArrayOfT.length;
    for (int j = 0; j < i; j++) {
      paramAction.apply(paramArrayOfT[j], j);
    }
  }
  
  @SafeVarargs
  @UiThread
  public static <T extends View> void run(@NonNull T[] paramArrayOfT, @NonNull Action<? super T>... paramVarArgs)
  {
    int i = paramArrayOfT.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramVarArgs.length;
      for (int m = 0; m < k; m++) {
        paramVarArgs[m].apply(paramArrayOfT[j], j);
      }
    }
  }
  
  @UiThread
  public static <T extends View, V> void set(@NonNull T paramT, @NonNull Property<? super T, V> paramProperty, @Nullable V paramV)
  {
    paramProperty.set(paramT, paramV);
  }
  
  @UiThread
  public static <T extends View, V> void set(@NonNull T paramT, @NonNull Setter<? super T, V> paramSetter, @Nullable V paramV)
  {
    paramSetter.set(paramT, paramV, 0);
  }
  
  @UiThread
  public static <T extends View, V> void set(@NonNull List<T> paramList, @NonNull Property<? super T, V> paramProperty, @Nullable V paramV)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      paramProperty.set(paramList.get(j), paramV);
    }
  }
  
  @UiThread
  public static <T extends View, V> void set(@NonNull List<T> paramList, @NonNull Setter<? super T, V> paramSetter, @Nullable V paramV)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      paramSetter.set((View)paramList.get(j), paramV, j);
    }
  }
  
  @UiThread
  public static <T extends View, V> void set(@NonNull T[] paramArrayOfT, @NonNull Property<? super T, V> paramProperty, @Nullable V paramV)
  {
    int i = paramArrayOfT.length;
    for (int j = 0; j < i; j++) {
      paramProperty.set(paramArrayOfT[j], paramV);
    }
  }
  
  @UiThread
  public static <T extends View, V> void set(@NonNull T[] paramArrayOfT, @NonNull Setter<? super T, V> paramSetter, @Nullable V paramV)
  {
    int i = paramArrayOfT.length;
    for (int j = 0; j < i; j++) {
      paramSetter.set(paramArrayOfT[j], paramV, j);
    }
  }
}

/* Location:
 * Qualified Name:     butterknife.ViewCollections
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */