package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class MultiWindowModeChangedInfo
{
  private final boolean mIsInMultiWindowMode;
  private final Configuration mNewConfig;
  
  public MultiWindowModeChangedInfo(boolean paramBoolean)
  {
    mIsInMultiWindowMode = paramBoolean;
    mNewConfig = null;
  }
  
  @RequiresApi(26)
  public MultiWindowModeChangedInfo(boolean paramBoolean, @NonNull Configuration paramConfiguration)
  {
    mIsInMultiWindowMode = paramBoolean;
    mNewConfig = paramConfiguration;
  }
  
  @NonNull
  @RequiresApi(26)
  public Configuration getNewConfig()
  {
    Configuration localConfiguration = mNewConfig;
    if (localConfiguration != null) {
      return localConfiguration;
    }
    throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
  }
  
  public boolean isInMultiWindowMode()
  {
    return mIsInMultiWindowMode;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.MultiWindowModeChangedInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */