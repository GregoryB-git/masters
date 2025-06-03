package j6;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import m6.b0;
import m6.j;

public abstract class u
  extends zzz
{
  public final int a;
  
  public u(byte[] paramArrayOfByte)
  {
    boolean bool;
    if (paramArrayOfByte.length == 25) {
      bool = true;
    } else {
      bool = false;
    }
    j.b(bool);
    a = Arrays.hashCode(paramArrayOfByte);
  }
  
  public static byte[] g(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("ISO-8859-1");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new AssertionError(paramString);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof b0))) {
      try
      {
        paramObject = (b0)paramObject;
        if (((b0)paramObject).zzc() != a) {
          return false;
        }
        paramObject = ((b0)paramObject).zzd();
        if (paramObject != null)
        {
          paramObject = (byte[])ObjectWrapper.unwrap((IObjectWrapper)paramObject);
          boolean bool = Arrays.equals(r(), (byte[])paramObject);
          return bool;
        }
        return false;
      }
      catch (RemoteException paramObject)
      {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)paramObject);
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a;
  }
  
  public abstract byte[] r();
  
  public final int zzc()
  {
    return a;
  }
  
  public final IObjectWrapper zzd()
  {
    return ObjectWrapper.wrap(r());
  }
}

/* Location:
 * Qualified Name:     j6.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */