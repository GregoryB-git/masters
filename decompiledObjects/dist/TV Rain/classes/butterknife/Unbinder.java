package butterknife;

import androidx.annotation.UiThread;
import t4;

public abstract interface Unbinder
{
  public static final Unbinder EMPTY = new t4();
  
  @UiThread
  public abstract void unbind();
}

/* Location:
 * Qualified Name:     butterknife.Unbinder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */