package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class w
  extends n6.a
{
  public static final Parcelable.Creator<w> CREATOR = new v0();
  public final z a;
  public final o b;
  
  /* Error */
  public w(String paramString, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 27	n6/a:<init>	()V
    //   4: aload_1
    //   5: invokestatic 33	m6/j:i	(Ljava/lang/Object;)V
    //   8: aload_0
    //   9: aload_1
    //   10: invokestatic 39	b7/z:f	(Ljava/lang/String;)Lb7/z;
    //   13: putfield 41	b7/w:a	Lb7/z;
    //   16: iload_2
    //   17: invokestatic 47	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   20: invokestatic 33	m6/j:i	(Ljava/lang/Object;)V
    //   23: aload_0
    //   24: iload_2
    //   25: invokestatic 52	b7/o:a	(I)Lb7/o;
    //   28: putfield 54	b7/w:b	Lb7/o;
    //   31: return
    //   32: astore_1
    //   33: new 56	java/lang/IllegalArgumentException
    //   36: dup
    //   37: aload_1
    //   38: invokespecial 59	java/lang/IllegalArgumentException:<init>	(Ljava/lang/Throwable;)V
    //   41: athrow
    //   42: astore_1
    //   43: new 56	java/lang/IllegalArgumentException
    //   46: dup
    //   47: aload_1
    //   48: invokespecial 59	java/lang/IllegalArgumentException:<init>	(Ljava/lang/Throwable;)V
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	this	w
    //   0	52	1	paramString	String
    //   0	52	2	paramInt	int
    // Exception table:
    //   from	to	target	type
    //   23	31	32	b7/o$a
    //   8	16	42	b7/z$a
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof w)) {
      return false;
    }
    paramObject = (w)paramObject;
    return (a.equals(a)) && (b.equals(b));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = b.z.J(20293, paramParcel);
    a.getClass();
    b.z.F(paramParcel, 2, "public-key", false);
    b.z.B(paramParcel, 3, Integer.valueOf(b.a.f()));
    b.z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */