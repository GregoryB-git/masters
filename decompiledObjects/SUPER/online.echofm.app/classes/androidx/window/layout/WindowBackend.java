package androidx.window.layout;

import H.a;
import android.app.Activity;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public abstract interface WindowBackend
{
  public abstract void registerLayoutChangeCallback(@NotNull Activity paramActivity, @NotNull Executor paramExecutor, @NotNull a parama);
  
  public abstract void unregisterLayoutChangeCallback(@NotNull a parama);
}

/* Location:
 * Qualified Name:     androidx.window.layout.WindowBackend
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */