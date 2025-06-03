package androidx.core.app;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;

public abstract interface OnPictureInPictureModeChangedProvider
{
  public abstract void addOnPictureInPictureModeChangedListener(@NonNull Consumer<PictureInPictureModeChangedInfo> paramConsumer);
  
  public abstract void removeOnPictureInPictureModeChangedListener(@NonNull Consumer<PictureInPictureModeChangedInfo> paramConsumer);
}

/* Location:
 * Qualified Name:     androidx.core.app.OnPictureInPictureModeChangedProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */