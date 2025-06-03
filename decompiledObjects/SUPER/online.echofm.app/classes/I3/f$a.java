package I3;

import java.io.InputStream;

public class f$a
  implements e.d
{
  public f$a(f paramf, byte[] paramArrayOfByte, int[] paramArrayOfInt) {}
  
  public void a(InputStream paramInputStream, int paramInt)
  {
    try
    {
      paramInputStream.read(a, b[0], paramInt);
      int[] arrayOfInt = b;
      arrayOfInt[0] += paramInt;
      return;
    }
    finally
    {
      paramInputStream.close();
    }
  }
}

/* Location:
 * Qualified Name:     I3.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */