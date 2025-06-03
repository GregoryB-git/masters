package androidx.core.app;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;

public abstract interface OnNewIntentProvider
{
  public abstract void addOnNewIntentListener(@NonNull Consumer<Intent> paramConsumer);
  
  public abstract void removeOnNewIntentListener(@NonNull Consumer<Intent> paramConsumer);
}

/* Location:
 * Qualified Name:     androidx.core.app.OnNewIntentProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */