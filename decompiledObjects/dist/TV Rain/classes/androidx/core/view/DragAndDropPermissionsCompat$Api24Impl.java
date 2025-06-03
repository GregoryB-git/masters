package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
class DragAndDropPermissionsCompat$Api24Impl
{
  @DoNotInline
  public static void release(DragAndDropPermissions paramDragAndDropPermissions)
  {
    paramDragAndDropPermissions.release();
  }
  
  @DoNotInline
  public static DragAndDropPermissions requestDragAndDropPermissions(Activity paramActivity, DragEvent paramDragEvent)
  {
    return paramActivity.requestDragAndDropPermissions(paramDragEvent);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.DragAndDropPermissionsCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */