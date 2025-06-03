package androidx.core.content;

import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;

public abstract interface OnConfigurationChangedProvider
{
  public abstract void addOnConfigurationChangedListener(@NonNull Consumer<Configuration> paramConsumer);
  
  public abstract void removeOnConfigurationChangedListener(@NonNull Consumer<Configuration> paramConsumer);
}

/* Location:
 * Qualified Name:     androidx.core.content.OnConfigurationChangedProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */