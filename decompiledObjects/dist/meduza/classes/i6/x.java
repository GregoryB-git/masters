package i6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class x
{
  public final int a;
  public final TaskCompletionSource b = new TaskCompletionSource();
  public final int c;
  public final Bundle d;
  
  public x(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    a = paramInt1;
    c = paramInt2;
    d = paramBundle;
  }
  
  public abstract void a(Bundle paramBundle);
  
  public abstract boolean b();
  
  public final void c(z3.f paramf)
  {
    if (Log.isLoggable("MessengerIpcClient", 3))
    {
      String str1 = toString();
      String str2 = paramf.toString();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failing ");
      localStringBuilder.append(str1);
      localStringBuilder.append(" with ");
      localStringBuilder.append(str2);
      Log.d("MessengerIpcClient", localStringBuilder.toString());
    }
    b.setException(paramf);
  }
  
  public final void d(Bundle paramBundle)
  {
    if (Log.isLoggable("MessengerIpcClient", 3))
    {
      String str1 = toString();
      String str2 = String.valueOf(paramBundle);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Finishing ");
      localStringBuilder.append(str1);
      localStringBuilder.append(" with ");
      localStringBuilder.append(str2);
      Log.d("MessengerIpcClient", localStringBuilder.toString());
    }
    b.setResult(paramBundle);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Request { what=");
    localStringBuilder.append(c);
    localStringBuilder.append(" id=");
    localStringBuilder.append(a);
    localStringBuilder.append(" oneWay=");
    localStringBuilder.append(b());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     i6.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */