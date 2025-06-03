package io.flutter.view;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings.Global;

public class i$c
  extends ContentObserver
{
  public i$c(i parami, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public void onChange(boolean paramBoolean)
  {
    onChange(paramBoolean, null);
  }
  
  public void onChange(boolean paramBoolean, Uri paramUri)
  {
    if (i.k(a)) {
      return;
    }
    paramUri = Settings.Global.getString(i.d(a), "transition_animation_scale");
    if ((paramUri != null) && (paramUri.equals("0"))) {
      i.f(a, ro);
    } else {
      i.e(a, ro);
    }
    i.g(a);
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.i.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */