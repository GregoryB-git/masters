package x2;

import A2.n;
import A2.p0;
import A2.q0;
import H2.a;
import H2.b;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class A
  extends p0
{
  public final int b;
  
  public A(byte[] paramArrayOfByte)
  {
    boolean bool;
    if (paramArrayOfByte.length == 25) {
      bool = true;
    } else {
      bool = false;
    }
    n.a(bool);
    b = Arrays.hashCode(paramArrayOfByte);
  }
  
  public static byte[] v(String paramString)
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
  
  public abstract byte[] Z0();
  
  public final int c()
  {
    return b;
  }
  
  public final a d()
  {
    return b.Z0(Z0());
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof q0))) {
      try
      {
        paramObject = (q0)paramObject;
        if (((q0)paramObject).c() != b) {
          return false;
        }
        paramObject = ((q0)paramObject).d();
        if (paramObject == null) {
          return false;
        }
        paramObject = (byte[])b.v((a)paramObject);
        boolean bool = Arrays.equals(Z0(), (byte[])paramObject);
        return bool;
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
    return b;
  }
}

/* Location:
 * Qualified Name:     x2.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */