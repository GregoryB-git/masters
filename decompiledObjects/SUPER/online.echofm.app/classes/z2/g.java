package z2;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public abstract interface g
{
  public abstract void a(String paramString, LifecycleCallback paramLifecycleCallback);
  
  public abstract LifecycleCallback b(String paramString, Class paramClass);
  
  public abstract Activity c();
  
  public abstract void startActivityForResult(Intent paramIntent, int paramInt);
}

/* Location:
 * Qualified Name:     z2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */