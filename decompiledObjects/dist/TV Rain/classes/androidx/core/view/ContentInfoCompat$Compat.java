package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

abstract interface ContentInfoCompat$Compat
{
  @NonNull
  public abstract ClipData getClip();
  
  @Nullable
  public abstract Bundle getExtras();
  
  public abstract int getFlags();
  
  @Nullable
  public abstract Uri getLinkUri();
  
  public abstract int getSource();
  
  @Nullable
  public abstract ContentInfo getWrapped();
}

/* Location:
 * Qualified Name:     androidx.core.view.ContentInfoCompat.Compat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */