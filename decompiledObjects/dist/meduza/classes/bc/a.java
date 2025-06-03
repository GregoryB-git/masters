package bc;

import ec.i;
import java.io.ByteArrayOutputStream;

public final class a
  extends ByteArrayOutputStream
{
  public a()
  {
    super(8193);
  }
  
  public final byte[] f()
  {
    byte[] arrayOfByte = buf;
    i.d(arrayOfByte, "buf");
    return arrayOfByte;
  }
}

/* Location:
 * Qualified Name:     bc.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */