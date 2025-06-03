package androidx.versionedparcelable;

import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class CustomVersionedParcelable
  implements VersionedParcelable
{
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void onPostParceling() {}
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void onPreParceling(boolean paramBoolean) {}
}

/* Location:
 * Qualified Name:     androidx.versionedparcelable.CustomVersionedParcelable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */