package androidx.work;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Set;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class ContentUriTriggers
{
  private final Set<Trigger> mTriggers = new HashSet();
  
  public void add(@NonNull Uri paramUri, boolean paramBoolean)
  {
    paramUri = new Trigger(paramUri, paramBoolean);
    mTriggers.add(paramUri);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (ContentUriTriggers.class == paramObject.getClass()))
    {
      paramObject = (ContentUriTriggers)paramObject;
      return mTriggers.equals(mTriggers);
    }
    return false;
  }
  
  @NonNull
  public Set<Trigger> getTriggers()
  {
    return mTriggers;
  }
  
  public int hashCode()
  {
    return mTriggers.hashCode();
  }
  
  public int size()
  {
    return mTriggers.size();
  }
  
  public static final class Trigger
  {
    private final boolean mTriggerForDescendants;
    @NonNull
    private final Uri mUri;
    
    public Trigger(@NonNull Uri paramUri, boolean paramBoolean)
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
}

/* Location:
 * Qualified Name:     androidx.work.ContentUriTriggers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */