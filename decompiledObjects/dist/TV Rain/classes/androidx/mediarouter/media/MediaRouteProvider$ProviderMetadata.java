package androidx.mediarouter.media;

import android.content.ComponentName;
import androidx.annotation.NonNull;
import z2;

public final class MediaRouteProvider$ProviderMetadata
{
  private final ComponentName mComponentName;
  
  public MediaRouteProvider$ProviderMetadata(ComponentName paramComponentName)
  {
    if (paramComponentName != null)
    {
      mComponentName = paramComponentName;
      return;
    }
    throw new IllegalArgumentException("componentName must not be null");
  }
  
  @NonNull
  public ComponentName getComponentName()
  {
    return mComponentName;
  }
  
  @NonNull
  public String getPackageName()
  {
    return mComponentName.getPackageName();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("ProviderMetadata{ componentName=");
    localStringBuilder.append(mComponentName.flattenToShortString());
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProvider.ProviderMetadata
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */