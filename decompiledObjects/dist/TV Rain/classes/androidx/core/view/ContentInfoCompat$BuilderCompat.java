package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

abstract interface ContentInfoCompat$BuilderCompat
{
  @NonNull
  public abstract ContentInfoCompat build();
  
  public abstract void setClip(@NonNull ClipData paramClipData);
  
  public abstract void setExtras(@Nullable Bundle paramBundle);
  
  public abstract void setFlags(int paramInt);
  
  public abstract void setLinkUri(@Nullable Uri paramUri);
  
  public abstract void setSource(int paramInt);
}

/* Location:
 * Qualified Name:     androidx.core.view.ContentInfoCompat.BuilderCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */