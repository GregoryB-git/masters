package androidx.startup;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

public abstract interface Initializer<T>
{
  @NonNull
  public abstract T create(@NonNull Context paramContext);
  
  @NonNull
  public abstract List<Class<? extends Initializer<?>>> dependencies();
}

/* Location:
 * Qualified Name:     androidx.startup.Initializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */