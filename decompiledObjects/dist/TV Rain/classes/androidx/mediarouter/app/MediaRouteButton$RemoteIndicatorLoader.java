package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.AsyncTask;
import android.util.SparseArray;
import androidx.appcompat.content.res.AppCompatResources;

final class MediaRouteButton$RemoteIndicatorLoader
  extends AsyncTask<Void, Void, Drawable>
{
  private final Context mContext;
  private final int mResId;
  
  public MediaRouteButton$RemoteIndicatorLoader(MediaRouteButton paramMediaRouteButton, int paramInt, Context paramContext)
  {
    mResId = paramInt;
    mContext = paramContext;
  }
  
  private void cacheAndReset(Drawable paramDrawable)
  {
    if (paramDrawable != null) {
      MediaRouteButton.sRemoteIndicatorCache.put(mResId, paramDrawable.getConstantState());
    }
    this$0.mRemoteIndicatorLoader = null;
  }
  
  public Drawable doInBackground(Void... paramVarArgs)
  {
    if ((Drawable.ConstantState)MediaRouteButton.sRemoteIndicatorCache.get(mResId) == null) {
      return AppCompatResources.getDrawable(mContext, mResId);
    }
    return null;
  }
  
  public void onCancelled(Drawable paramDrawable)
  {
    cacheAndReset(paramDrawable);
  }
  
  public void onPostExecute(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      cacheAndReset(paramDrawable);
    }
    else
    {
      Drawable.ConstantState localConstantState = (Drawable.ConstantState)MediaRouteButton.sRemoteIndicatorCache.get(mResId);
      if (localConstantState != null) {
        paramDrawable = localConstantState.newDrawable();
      }
      this$0.mRemoteIndicatorLoader = null;
    }
    this$0.setRemoteIndicatorDrawableInternal(paramDrawable);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteButton.RemoteIndicatorLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */