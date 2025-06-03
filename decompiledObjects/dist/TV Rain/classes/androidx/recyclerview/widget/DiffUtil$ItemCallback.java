package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class DiffUtil$ItemCallback<T>
{
  public abstract boolean areContentsTheSame(@NonNull T paramT1, @NonNull T paramT2);
  
  public abstract boolean areItemsTheSame(@NonNull T paramT1, @NonNull T paramT2);
  
  @Nullable
  public Object getChangePayload(@NonNull T paramT1, @NonNull T paramT2)
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DiffUtil.ItemCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */