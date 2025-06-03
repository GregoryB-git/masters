package l6;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class a1
{
  public final int a;
  
  public a1(int paramInt)
  {
    a = paramInt;
  }
  
  public static Status e(RemoteException paramRemoteException)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramRemoteException.getClass().getSimpleName());
    localStringBuilder.append(": ");
    localStringBuilder.append(paramRemoteException.getLocalizedMessage());
    return new Status(19, localStringBuilder.toString(), null, null);
  }
  
  public abstract void a(Status paramStatus);
  
  public abstract void b(RuntimeException paramRuntimeException);
  
  public abstract void c(d0 paramd0);
  
  public abstract void d(u paramu, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     l6.a1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */