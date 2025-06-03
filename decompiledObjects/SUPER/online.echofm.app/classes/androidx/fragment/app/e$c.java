package androidx.fragment.app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.c;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.t;
import androidx.lifecycle.u;

public class e$c
  extends k
  implements u, c, androidx.activity.result.d, r
{
  public e$c(e parame)
  {
    super(parame);
  }
  
  public void a(n paramn, Fragment paramFragment)
  {
    t.r(paramFragment);
  }
  
  public ActivityResultRegistry c()
  {
    return t.c();
  }
  
  public t d()
  {
    return t.d();
  }
  
  public View e(int paramInt)
  {
    return t.findViewById(paramInt);
  }
  
  public boolean f()
  {
    Window localWindow = t.getWindow();
    boolean bool;
    if ((localWindow != null) && (localWindow.peekDecorView() != null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public androidx.lifecycle.d g()
  {
    return t.z;
  }
  
  public OnBackPressedDispatcher j()
  {
    return t.j();
  }
  
  public LayoutInflater n()
  {
    return t.getLayoutInflater().cloneInContext(t);
  }
  
  public boolean o(Fragment paramFragment)
  {
    return t.isFinishing() ^ true;
  }
  
  public void q()
  {
    t.u();
  }
  
  public e r()
  {
    return t;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.e.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */