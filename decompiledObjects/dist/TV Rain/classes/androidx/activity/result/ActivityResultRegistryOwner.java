package androidx.activity.result;

import androidx.annotation.NonNull;

public abstract interface ActivityResultRegistryOwner
{
  @NonNull
  public abstract ActivityResultRegistry getActivityResultRegistry();
}

/* Location:
 * Qualified Name:     androidx.activity.result.ActivityResultRegistryOwner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */