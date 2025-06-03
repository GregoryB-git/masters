package androidx.activity.contextaware;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract interface ContextAware
{
  public abstract void addOnContextAvailableListener(@NonNull OnContextAvailableListener paramOnContextAvailableListener);
  
  @Nullable
  public abstract Context peekAvailableContext();
  
  public abstract void removeOnContextAvailableListener(@NonNull OnContextAvailableListener paramOnContextAvailableListener);
}

/* Location:
 * Qualified Name:     androidx.activity.contextaware.ContextAware
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */