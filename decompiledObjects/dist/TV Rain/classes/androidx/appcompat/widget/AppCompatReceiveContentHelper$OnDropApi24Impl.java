package androidx.appcompat.widget;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.ContentInfoCompat.Builder;
import androidx.core.view.ViewCompat;

@RequiresApi(24)
final class AppCompatReceiveContentHelper$OnDropApi24Impl
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

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatReceiveContentHelper.OnDropApi24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */