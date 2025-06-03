package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

class AppCompatHintHelper
{
  public static InputConnection onCreateInputConnection(InputConnection paramInputConnection, EditorInfo paramEditorInfo, View paramView)
  {
    if ((paramInputConnection != null) && (hintText == null)) {
      for (paramView = paramView.getParent(); (paramView instanceof View); paramView = paramView.getParent()) {
        if ((paramView instanceof WithHint))
        {
          hintText = ((WithHint)paramView).getHint();
          break;
        }
      }
    }
    return paramInputConnection;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatHintHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */