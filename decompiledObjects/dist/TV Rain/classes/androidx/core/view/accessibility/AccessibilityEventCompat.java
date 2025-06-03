package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class AccessibilityEventCompat
{
  public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = 4;
  public static final int CONTENT_CHANGE_TYPE_DRAG_CANCELLED = 512;
  public static final int CONTENT_CHANGE_TYPE_DRAG_DROPPED = 256;
  public static final int CONTENT_CHANGE_TYPE_DRAG_STARTED = 128;
  public static final int CONTENT_CHANGE_TYPE_PANE_APPEARED = 16;
  public static final int CONTENT_CHANGE_TYPE_PANE_DISAPPEARED = 32;
  public static final int CONTENT_CHANGE_TYPE_PANE_TITLE = 8;
  public static final int CONTENT_CHANGE_TYPE_STATE_DESCRIPTION = 64;
  public static final int CONTENT_CHANGE_TYPE_SUBTREE = 1;
  public static final int CONTENT_CHANGE_TYPE_TEXT = 2;
  public static final int CONTENT_CHANGE_TYPE_UNDEFINED = 0;
  public static final int TYPES_ALL_MASK = -1;
  public static final int TYPE_ANNOUNCEMENT = 16384;
  public static final int TYPE_ASSIST_READING_CONTEXT = 16777216;
  public static final int TYPE_GESTURE_DETECTION_END = 524288;
  public static final int TYPE_GESTURE_DETECTION_START = 262144;
  @Deprecated
  public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;
  @Deprecated
  public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;
  public static final int TYPE_TOUCH_INTERACTION_END = 2097152;
  public static final int TYPE_TOUCH_INTERACTION_START = 1048576;
  public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = 32768;
  public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = 65536;
  public static final int TYPE_VIEW_CONTEXT_CLICKED = 8388608;
  @Deprecated
  public static final int TYPE_VIEW_HOVER_ENTER = 128;
  @Deprecated
  public static final int TYPE_VIEW_HOVER_EXIT = 256;
  @Deprecated
  public static final int TYPE_VIEW_SCROLLED = 4096;
  @Deprecated
  public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;
  public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 131072;
  public static final int TYPE_WINDOWS_CHANGED = 4194304;
  @Deprecated
  public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;
  
  @Deprecated
  public static void appendRecord(AccessibilityEvent paramAccessibilityEvent, AccessibilityRecordCompat paramAccessibilityRecordCompat)
  {
    paramAccessibilityEvent.appendRecord((AccessibilityRecord)paramAccessibilityRecordCompat.getImpl());
  }
  
  @Deprecated
  public static AccessibilityRecordCompat asRecord(AccessibilityEvent paramAccessibilityEvent)
  {
    return new AccessibilityRecordCompat(paramAccessibilityEvent);
  }
  
  public static int getAction(@NonNull AccessibilityEvent paramAccessibilityEvent)
  {
    return Api16Impl.getAction(paramAccessibilityEvent);
  }
  
  public static int getContentChangeTypes(@NonNull AccessibilityEvent paramAccessibilityEvent)
  {
    return Api19Impl.getContentChangeTypes(paramAccessibilityEvent);
  }
  
  public static int getMovementGranularity(@NonNull AccessibilityEvent paramAccessibilityEvent)
  {
    return Api16Impl.getMovementGranularity(paramAccessibilityEvent);
  }
  
  @Deprecated
  public static AccessibilityRecordCompat getRecord(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    return new AccessibilityRecordCompat(paramAccessibilityEvent.getRecord(paramInt));
  }
  
  @Deprecated
  public static int getRecordCount(AccessibilityEvent paramAccessibilityEvent)
  {
    return paramAccessibilityEvent.getRecordCount();
  }
  
  public static void setAction(@NonNull AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    Api16Impl.setAction(paramAccessibilityEvent, paramInt);
  }
  
  public static void setContentChangeTypes(@NonNull AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    Api19Impl.setContentChangeTypes(paramAccessibilityEvent, paramInt);
  }
  
  public static void setMovementGranularity(@NonNull AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    Api16Impl.setMovementGranularity(paramAccessibilityEvent, paramInt);
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static int getAction(AccessibilityEvent paramAccessibilityEvent)
    {
      return paramAccessibilityEvent.getAction();
    }
    
    @DoNotInline
    public static int getMovementGranularity(AccessibilityEvent paramAccessibilityEvent)
    {
      return paramAccessibilityEvent.getMovementGranularity();
    }
    
    @DoNotInline
    public static void setAction(AccessibilityEvent paramAccessibilityEvent, int paramInt)
    {
      paramAccessibilityEvent.setAction(paramInt);
    }
    
    @DoNotInline
    public static void setMovementGranularity(AccessibilityEvent paramAccessibilityEvent, int paramInt)
    {
      paramAccessibilityEvent.setMovementGranularity(paramInt);
    }
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    @DoNotInline
    public static int getContentChangeTypes(AccessibilityEvent paramAccessibilityEvent)
    {
      return paramAccessibilityEvent.getContentChangeTypes();
    }
    
    @DoNotInline
    public static void setContentChangeTypes(AccessibilityEvent paramAccessibilityEvent, int paramInt)
    {
      paramAccessibilityEvent.setContentChangeTypes(paramInt);
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface ContentChangeType {}
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityEventCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */