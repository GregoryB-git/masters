package io.flutter.plugins.firebase.messaging;

import android.app.Service;
import android.content.Intent;

public final class a$d
  implements a.f
{
  public final Intent a;
  public final int b;
  
  public a$d(a parama, Intent paramIntent, int paramInt)
  {
    a = paramIntent;
    b = paramInt;
  }
  
  public void a()
  {
    c.stopSelf(b);
  }
  
  public Intent getIntent()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */