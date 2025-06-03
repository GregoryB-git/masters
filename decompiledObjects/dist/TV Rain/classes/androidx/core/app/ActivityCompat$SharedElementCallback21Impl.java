package androidx.core.app;

import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.RequiresApi;
import java.util.List;
import java.util.Map;

@RequiresApi(21)
class ActivityCompat$SharedElementCallback21Impl
  extends android.app.SharedElementCallback
{
  private final SharedElementCallback mCallback;
  
  public ActivityCompat$SharedElementCallback21Impl(SharedElementCallback paramSharedElementCallback)
  {
    mCallback = paramSharedElementCallback;
  }
  
  public Parcelable onCaptureSharedElementSnapshot(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    return mCallback.onCaptureSharedElementSnapshot(paramView, paramMatrix, paramRectF);
  }
  
  public View onCreateSnapshotView(Context paramContext, Parcelable paramParcelable)
  {
    return mCallback.onCreateSnapshotView(paramContext, paramParcelable);
  }
  
  public void onMapSharedElements(List<String> paramList, Map<String, View> paramMap)
  {
    mCallback.onMapSharedElements(paramList, paramMap);
  }
  
  public void onRejectSharedElements(List<View> paramList)
  {
    mCallback.onRejectSharedElements(paramList);
  }
  
  public void onSharedElementEnd(List<String> paramList, List<View> paramList1, List<View> paramList2)
  {
    mCallback.onSharedElementEnd(paramList, paramList1, paramList2);
  }
  
  public void onSharedElementStart(List<String> paramList, List<View> paramList1, List<View> paramList2)
  {
    mCallback.onSharedElementStart(paramList, paramList1, paramList2);
  }
  
  @RequiresApi(23)
  public void onSharedElementsArrived(List<String> paramList, List<View> paramList1, SharedElementCallback.OnSharedElementsReadyListener paramOnSharedElementsReadyListener)
  {
    mCallback.onSharedElementsArrived(paramList, paramList1, new a(paramOnSharedElementsReadyListener));
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityCompat.SharedElementCallback21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */