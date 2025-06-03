package butterknife;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;

public abstract interface Action<T extends View>
{
  @UiThread
  public abstract void apply(@NonNull T paramT, int paramInt);
}

/* Location:
 * Qualified Name:     butterknife.Action
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */