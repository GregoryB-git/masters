package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ContentInfoCompat.Builder;
import androidx.core.view.ViewCompat;

final class AppCompatReceiveContentHelper
{
  private static final String LOG_TAG = "ReceiveContent";
  
  public static boolean maybeHandleDragEventViaPerformReceiveContent(@NonNull View paramView, @NonNull DragEvent paramDragEvent)
  {
    if ((Build.VERSION.SDK_INT < 31) && (paramDragEvent.getLocalState() == null) && (ViewCompat.getOnReceiveContentMimeTypes(paramView) != null))
    {
      Activity localActivity = tryGetActivity(paramView);
      if (localActivity == null)
      {
        paramDragEvent = new StringBuilder();
        paramDragEvent.append("Can't handle drop: no activity: view=");
        paramDragEvent.append(paramView);
        Log.i("ReceiveContent", paramDragEvent.toString());
        return false;
      }
      if (paramDragEvent.getAction() == 1) {
        return paramView instanceof TextView ^ true;
      }
      if (paramDragEvent.getAction() == 3)
      {
        boolean bool;
        if ((paramView instanceof TextView)) {
          bool = OnDropApi24Impl.onDropForTextView(paramDragEvent, (TextView)paramView, localActivity);
        } else {
          bool = OnDropApi24Impl.onDropForView(paramDragEvent, paramView, localActivity);
        }
        return bool;
      }
    }
    return false;
  }
  
  public static boolean maybeHandleMenuActionViaPerformReceiveContent(@NonNull TextView paramTextView, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 0;
    if ((i < 31) && (ViewCompat.getOnReceiveContentMimeTypes(paramTextView) != null) && ((paramInt == 16908322) || (paramInt == 16908337)))
    {
      Object localObject = (ClipboardManager)paramTextView.getContext().getSystemService("clipboard");
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = ((ClipboardManager)localObject).getPrimaryClip();
      }
      if ((localObject != null) && (((ClipData)localObject).getItemCount() > 0))
      {
        localObject = new ContentInfoCompat.Builder((ClipData)localObject, 1);
        if (paramInt == 16908322) {
          paramInt = j;
        } else {
          paramInt = 1;
        }
        ViewCompat.performReceiveContent(paramTextView, ((ContentInfoCompat.Builder)localObject).setFlags(paramInt).build());
      }
      return true;
    }
    return false;
  }
  
  @Nullable
  public static Activity tryGetActivity(@NonNull View paramView)
  {
    for (paramView = paramView.getContext(); (paramView instanceof ContextWrapper); paramView = ((ContextWrapper)paramView).getBaseContext()) {
      if ((paramView instanceof Activity)) {
        return (Activity)paramView;
      }
    }
    return null;
  }
  
  @RequiresApi(24)
  public static final class OnDropApi24Impl
  {
    @DoNotInline
    public static boolean onDropForTextView(@NonNull DragEvent paramDragEvent, @NonNull TextView paramTextView, @NonNull Activity paramActivity)
    {
      paramActivity.requestDragAndDropPermissions(paramDragEvent);
      int i = paramTextView.getOffsetForPosition(paramDragEvent.getX(), paramDragEvent.getY());
      paramTextView.beginBatchEdit();
      try
      {
        Selection.setSelection((Spannable)paramTextView.getText(), i);
        paramActivity = new androidx/core/view/ContentInfoCompat$Builder;
        paramActivity.<init>(paramDragEvent.getClipData(), 3);
        ViewCompat.performReceiveContent(paramTextView, paramActivity.build());
        return true;
      }
      finally
      {
        paramTextView.endBatchEdit();
      }
    }
    
    @DoNotInline
    public static boolean onDropForView(@NonNull DragEvent paramDragEvent, @NonNull View paramView, @NonNull Activity paramActivity)
    {
      paramActivity.requestDragAndDropPermissions(paramDragEvent);
      ViewCompat.performReceiveContent(paramView, new ContentInfoCompat.Builder(paramDragEvent.getClipData(), 3).build());
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatReceiveContentHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */