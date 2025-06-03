package v0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.d;
import androidx.emoji2.text.f;

public final class e
  implements KeyListener
{
  public final KeyListener a;
  public final a b;
  
  public e(KeyListener paramKeyListener)
  {
    a = paramKeyListener;
    b = locala;
  }
  
  public final void clearMetaKeyState(View paramView, Editable paramEditable, int paramInt)
  {
    a.clearMetaKeyState(paramView, paramEditable, paramInt);
  }
  
  public final int getInputType()
  {
    return a.getInputType();
  }
  
  public final boolean onKeyDown(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent)
  {
    b.getClass();
    Object localObject = d.i;
    boolean bool1 = false;
    boolean bool2;
    if (paramInt != 67)
    {
      if (paramInt != 112) {
        bool2 = false;
      } else {
        bool2 = f.a(paramEditable, paramKeyEvent, true);
      }
    }
    else {
      bool2 = f.a(paramEditable, paramKeyEvent, false);
    }
    int i;
    if (bool2)
    {
      MetaKeyKeyListener.adjustMetaAfterKeypress(paramEditable);
      i = 1;
    }
    else
    {
      i = 0;
    }
    if (i == 0)
    {
      bool2 = bool1;
      if (!a.onKeyDown(paramView, paramEditable, paramInt, paramKeyEvent)) {}
    }
    else
    {
      bool2 = true;
    }
    return bool2;
  }
  
  public final boolean onKeyOther(View paramView, Editable paramEditable, KeyEvent paramKeyEvent)
  {
    return a.onKeyOther(paramView, paramEditable, paramKeyEvent);
  }
  
  public final boolean onKeyUp(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent)
  {
    return a.onKeyUp(paramView, paramEditable, paramInt, paramKeyEvent);
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     v0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */