package l;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public abstract class f
{
  public static InputConnection a(InputConnection paramInputConnection, EditorInfo paramEditorInfo, View paramView)
  {
    if ((paramInputConnection != null) && (hintText == null)) {
      for (paramEditorInfo = paramView.getParent(); (paramEditorInfo instanceof View); paramEditorInfo = paramEditorInfo.getParent()) {}
    }
    return paramInputConnection;
  }
}

/* Location:
 * Qualified Name:     l.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */