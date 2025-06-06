package androidx.mediarouter.app;

import androidx.annotation.NonNull;

public class MediaRouteDialogFactory
{
  private static final MediaRouteDialogFactory sDefault = new MediaRouteDialogFactory();
  
  @NonNull
  public static MediaRouteDialogFactory getDefault()
  {
    return sDefault;
  }
  
  @NonNull
  public MediaRouteChooserDialogFragment onCreateChooserDialogFragment()
  {
    return new MediaRouteChooserDialogFragment();
  }
  
  @NonNull
  public MediaRouteControllerDialogFragment onCreateControllerDialogFragment()
  {
    return new MediaRouteControllerDialogFragment();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDialogFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */