package w2;

import V2.k;
import android.os.Bundle;
import android.util.Log;

public abstract class t
{
  public final int a;
  public final k b = new k();
  public final int c;
  public final Bundle d;
  
  public t(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    a = paramInt1;
    c = paramInt2;
    d = paramBundle;
  }
  
  public abstract void a(Bundle paramBundle);
  
  public abstract boolean b();
  
  public final void c(u paramu)
  {
    if (Log.isLoggable("MessengerIpcClient", 3))
    {
      String str1 = String.valueOf(this);
      String str2 = String.valueOf(paramu);
      StringBuilder localStringBuilder = new StringBuilder(str1.length() + 14 + str2.length());
      localStringBuilder.append("Failing ");
      localStringBuilder.append(str1);
      localStringBuilder.append(" with ");
      localStringBuilder.append(str2);
      Log.d("MessengerIpcClient", localStringBuilder.toString());
    }
    b.b(paramu);
  }
  
  public final void d(Object paramObject)
  {
    if (Log.isLoggable("MessengerIpcClient", 3))
    {
      String str1 = String.valueOf(this);
      String str2 = String.valueOf(paramObject);
      StringBuilder localStringBuilder = new StringBuilder(str1.length() + 16 + str2.length());
      localStringBuilder.append("Finishing ");
      localStringBuilder.append(str1);
      localStringBuilder.append(" with ");
      localStringBuilder.append(str2);
      Log.d("MessengerIpcClient", localStringBuilder.toString());
    }
    b.c(paramObject);
  }
  
  public final String toString()
  {
    int i = c;
    int j = a;
    StringBuilder localStringBuilder = new StringBuilder(55);
    localStringBuilder.append("Request { what=");
    localStringBuilder.append(i);
    localStringBuilder.append(" id=");
    localStringBuilder.append(j);
    localStringBuilder.append(" oneWay=");
    localStringBuilder.append(b());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     w2.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */