package d2;

import a0.j;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

public final class e0
  implements WebMessagePayloadBoundaryInterface
{
  public final int a;
  public final String b;
  public final byte[] c;
  
  public e0(String paramString)
  {
    a = 0;
    b = paramString;
    c = null;
  }
  
  public e0(byte[] paramArrayOfByte)
  {
    a = 1;
    b = null;
    c = paramArrayOfByte;
  }
  
  public final void a(int paramInt)
  {
    if (a == paramInt) {
      return;
    }
    StringBuilder localStringBuilder = j.n("Expected ", paramInt, ", but type is ");
    localStringBuilder.append(a);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public final byte[] getAsArrayBuffer()
  {
    a(1);
    byte[] arrayOfByte = c;
    Objects.requireNonNull(arrayOfByte);
    return (byte[])arrayOfByte;
  }
  
  public final String getAsString()
  {
    a(0);
    return b;
  }
  
  public final String[] getSupportedFeatures()
  {
    return new String[0];
  }
  
  public final int getType()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     d2.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */