package l;

import android.app.Activity;
import android.os.Build.VERSION;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import b0.f;
import e0.c.a;
import e0.c.b;
import e0.c.c;
import e0.d0;

public final class v
{
  public static boolean a(DragEvent paramDragEvent, TextView paramTextView, Activity paramActivity)
  {
    f.f(paramActivity, paramDragEvent);
    int i = paramTextView.getOffsetForPosition(paramDragEvent.getX(), paramDragEvent.getY());
    paramTextView.beginBatchEdit();
    try
    {
      Selection.setSelection((Spannable)paramTextView.getText(), i);
      paramActivity = paramDragEvent.getClipData();
      if (Build.VERSION.SDK_INT >= 31)
      {
        paramDragEvent = new e0/c$a;
        paramDragEvent.<init>(paramActivity, 3);
      }
      else
      {
        paramDragEvent = new c.c(paramActivity, 3);
      }
      d0.f(paramTextView, paramDragEvent.build());
      return true;
    }
    finally
    {
      paramTextView.endBatchEdit();
    }
  }
  
  public static boolean b(DragEvent paramDragEvent, View paramView, Activity paramActivity)
  {
    f.f(paramActivity, paramDragEvent);
    paramDragEvent = paramDragEvent.getClipData();
    if (Build.VERSION.SDK_INT >= 31) {
      paramDragEvent = new c.a(paramDragEvent, 3);
    } else {
      paramDragEvent = new c.c(paramDragEvent, 3);
    }
    d0.f(paramView, paramDragEvent.build());
    return true;
  }
}

/* Location:
 * Qualified Name:     l.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */