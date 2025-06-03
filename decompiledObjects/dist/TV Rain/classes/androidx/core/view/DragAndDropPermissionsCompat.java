package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

public final class DragAndDropPermissionsCompat
{
  private final DragAndDropPermissions mDragAndDropPermissions;
  
  private DragAndDropPermissionsCompat(DragAndDropPermissions paramDragAndDropPermissions)
  {
    mDragAndDropPermissions = paramDragAndDropPermissions;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static DragAndDropPermissionsCompat request(@NonNull Activity paramActivity, @NonNull DragEvent paramDragEvent)
  {
    paramActivity = Api24Impl.requestDragAndDropPermissions(paramActivity, paramDragEvent);
    if (paramActivity != null) {
      return new DragAndDropPermissionsCompat(paramActivity);
    }
    return null;
  }
  
  public void release()
  {
    Api24Impl.release(mDragAndDropPermissions);
  }
  
  @RequiresApi(24)
  public static class Api24Impl
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
}

/* Location:
 * Qualified Name:     androidx.core.view.DragAndDropPermissionsCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */