package io.flutter.plugins.firebase.messaging;

import android.content.ComponentName;
import android.content.Intent;

public abstract class a$i
{
  public final ComponentName a;
  public boolean b;
  public int c;
  
  public a$i(ComponentName paramComponentName)
  {
    a = paramComponentName;
  }
  
  public abstract void a(Intent paramIntent);
  
  public void b(int paramInt)
  {
    if (!b)
    {
      b = true;
      c = paramInt;
    }
    else
    {
      if (c != paramInt) {
        break label29;
      }
    }
    return;
    label29:
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Given job ID ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" is different than previous ");
    localStringBuilder.append(c);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public void c() {}
  
  public void d() {}
  
  public void e() {}
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.a.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */