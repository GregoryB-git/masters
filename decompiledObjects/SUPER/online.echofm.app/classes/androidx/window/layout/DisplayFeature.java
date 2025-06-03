package androidx.window.layout;

import android.graphics.Rect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public abstract interface DisplayFeature
{
  @NotNull
  public abstract Rect getBounds();
}

/* Location:
 * Qualified Name:     androidx.window.layout.DisplayFeature
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */