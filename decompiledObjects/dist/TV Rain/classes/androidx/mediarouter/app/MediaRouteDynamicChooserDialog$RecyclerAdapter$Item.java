package androidx.mediarouter.app;

import android.util.Log;
import androidx.mediarouter.media.MediaRouter.RouteInfo;

class MediaRouteDynamicChooserDialog$RecyclerAdapter$Item
{
  private final Object mData;
  private final int mType;
  
  public MediaRouteDynamicChooserDialog$RecyclerAdapter$Item(MediaRouteDynamicChooserDialog.RecyclerAdapter paramRecyclerAdapter, Object paramObject)
  {
    mData = paramObject;
    if ((paramObject instanceof String))
    {
      mType = 1;
    }
    else if ((paramObject instanceof MediaRouter.RouteInfo))
    {
      mType = 2;
    }
    else
    {
      mType = 0;
      Log.w("RecyclerAdapter", "Wrong type of data passed to Item constructor");
    }
  }
  
  public Object getData()
  {
    return mData;
  }
  
  public int getType()
  {
    return mType;
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicChooserDialog.RecyclerAdapter.Item
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */