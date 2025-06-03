package androidx.work;

import android.net.Uri;
import androidx.annotation.NonNull;

public final class ContentUriTriggers$Trigger
{
  private final boolean mTriggerForDescendants;
  @NonNull
  private final Uri mUri;
  
  public ContentUriTriggers$Trigger(@NonNull Uri paramUri, boolean paramBoolean)
  {
    mUri = paramUri;
    mTriggerForDescendants = paramBoolean;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (Trigger.class == paramObject.getClass()))
    {
      paramObject = (Trigger)paramObject;
      if ((mTriggerForDescendants != mTriggerForDescendants) || (!mUri.equals(mUri))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  @NonNull
  public Uri getUri()
  {
    return mUri;
  }
  
  public int hashCode()
  {
    return mUri.hashCode() * 31 + mTriggerForDescendants;
  }
  
  public boolean shouldTriggerForDescendants()
  {
    return mTriggerForDescendants;
  }
}

/* Location:
 * Qualified Name:     androidx.work.ContentUriTriggers.Trigger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */