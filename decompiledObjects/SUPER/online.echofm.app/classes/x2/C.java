package x2;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class C
  extends A
{
  public static final WeakReference d = new WeakReference(null);
  public WeakReference c = d;
  
  public C(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
  }
  
  public final byte[] Z0()
  {
    try
    {
      Object localObject1 = (byte[])c.get();
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = a1();
        localObject1 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject1).<init>(localObject2);
        c = ((WeakReference)localObject1);
      }
    }
    finally
    {
      break label49;
    }
    return arrayOfByte;
    label49:
    throw arrayOfByte;
  }
  
  public abstract byte[] a1();
}

/* Location:
 * Qualified Name:     x2.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */