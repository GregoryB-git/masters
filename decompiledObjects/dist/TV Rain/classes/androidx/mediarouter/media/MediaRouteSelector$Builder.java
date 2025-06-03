package androidx.mediarouter.media;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class MediaRouteSelector$Builder
{
  private ArrayList<String> mControlCategories;
  
  public MediaRouteSelector$Builder() {}
  
  public MediaRouteSelector$Builder(@NonNull MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector != null)
    {
      paramMediaRouteSelector.ensureControlCategories();
      if (!mControlCategories.isEmpty()) {
        mControlCategories = new ArrayList(mControlCategories);
      }
      return;
    }
    throw new IllegalArgumentException("selector must not be null");
  }
  
  @NonNull
  public Builder addControlCategories(@NonNull Collection<String> paramCollection)
  {
    if (paramCollection != null)
    {
      if (!paramCollection.isEmpty())
      {
        paramCollection = paramCollection.iterator();
        while (paramCollection.hasNext()) {
          addControlCategory((String)paramCollection.next());
        }
      }
      return this;
    }
    throw new IllegalArgumentException("categories must not be null");
  }
  
  @NonNull
  public Builder addControlCategory(@NonNull String paramString)
  {
    if (paramString != null)
    {
      if (mControlCategories == null) {
        mControlCategories = new ArrayList();
      }
      if (!mControlCategories.contains(paramString)) {
        mControlCategories.add(paramString);
      }
      return this;
    }
    throw new IllegalArgumentException("category must not be null");
  }
  
  @NonNull
  public Builder addSelector(@NonNull MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector != null)
    {
      addControlCategories(paramMediaRouteSelector.getControlCategories());
      return this;
    }
    throw new IllegalArgumentException("selector must not be null");
  }
  
  @NonNull
  public MediaRouteSelector build()
  {
    if (mControlCategories == null) {
      return MediaRouteSelector.EMPTY;
    }
    Bundle localBundle = new Bundle();
    localBundle.putStringArrayList("controlCategories", mControlCategories);
    return new MediaRouteSelector(localBundle, mControlCategories);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteSelector.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */