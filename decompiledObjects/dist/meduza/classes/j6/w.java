package j6;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class w
  extends u
{
  public static final WeakReference c = new WeakReference(null);
  public WeakReference b = c;
  
  public w(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
  }
  
  public abstract byte[] d3();
  
  public final byte[] r()
  {
    try
    {
      Object localObject1 = (byte[])b.get();
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = d3();
        localObject1 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject1).<init>(localObject2);
        b = ((WeakReference)localObject1);
      }
      return (byte[])localObject2;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     j6.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */