package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class PictureInPictureModeChangedInfo
{
  private final boolean mIsInPictureInPictureMode;
  private final Configuration mNewConfig;
  
  public PictureInPictureModeChangedInfo(boolean paramBoolean)
  {
    mIsInPictureInPictureMode = paramBoolean;
    mNewConfig = null;
  }
  
  @RequiresApi(26)
  public PictureInPictureModeChangedInfo(boolean paramBoolean, @NonNull Configuration paramConfiguration)
  {
    mIsInPictureInPictureMode = paramBoolean;
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
    throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
  }
  
  public boolean isInPictureInPictureMode()
  {
    return mIsInPictureInPictureMode;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.PictureInPictureModeChangedInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */