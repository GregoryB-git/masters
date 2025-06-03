package w;

import I.f;
import I.f.a;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.d.c;
import androidx.lifecycle.i;
import androidx.lifecycle.q;

public abstract class e
  extends Activity
  implements androidx.lifecycle.h, f.a
{
  public t.h o = new t.h();
  public i p = new i(this);
  
  public boolean b(KeyEvent paramKeyEvent)
  {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    View localView = getWindow().getDecorView();
    if ((localView != null) && (f.d(localView, paramKeyEvent))) {
      return true;
    }
    return f.e(this, localView, this, paramKeyEvent);
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    View localView = getWindow().getDecorView();
    if ((localView != null) && (f.d(localView, paramKeyEvent))) {
      return true;
    }
    return super.dispatchKeyShortcutEvent(paramKeyEvent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    q.g(this);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    p.j(d.c.q);
    super.onSaveInstanceState(paramBundle);
  }
}

/* Location:
 * Qualified Name:     w.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */