package androidx.core.app;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;

public abstract interface OnMultiWindowModeChangedProvider
{
  public abstract void addOnMultiWindowModeChangedListener(@NonNull Consumer<MultiWindowModeChangedInfo> paramConsumer);
  
  public abstract void removeOnMultiWindowModeChangedListener(@NonNull Consumer<MultiWindowModeChangedInfo> paramConsumer);
}

/* Location:
 * Qualified Name:     androidx.core.app.OnMultiWindowModeChangedProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */