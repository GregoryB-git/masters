package butterknife;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;

public abstract interface Setter<T extends View, V>
{
  @UiThread
  public abstract void set(@NonNull T paramT, @Nullable V paramV, int paramInt);
}

/* Location:
 * Qualified Name:     butterknife.Setter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */