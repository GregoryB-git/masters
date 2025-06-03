package u5;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import v5.a.a;
import x6.b;

public final class o
  extends BufferedOutputStream
{
  public boolean a;
  
  public o(FileOutputStream paramFileOutputStream, int paramInt)
  {
    super(paramFileOutputStream, paramInt);
  }
  
  public o(a.a parama)
  {
    super(parama);
  }
  
  /* Error */
  public final void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield 20	u5/o:a	Z
    //   5: aload_0
    //   6: invokevirtual 25	java/io/OutputStream:flush	()V
    //   9: aconst_null
    //   10: astore_1
    //   11: goto +4 -> 15
    //   14: astore_1
    //   15: aload_0
    //   16: getfield 29	java/io/BufferedOutputStream:out	Ljava/io/OutputStream;
    //   19: invokevirtual 31	java/io/OutputStream:close	()V
    //   22: aload_1
    //   23: astore_2
    //   24: goto +12 -> 36
    //   27: astore_3
    //   28: aload_1
    //   29: astore_2
    //   30: aload_1
    //   31: ifnonnull +5 -> 36
    //   34: aload_3
    //   35: astore_2
    //   36: aload_2
    //   37: ifnonnull +4 -> 41
    //   40: return
    //   41: getstatic 36	v5/e0:a	I
    //   44: istore 4
    //   46: aload_2
    //   47: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	o
    //   10	1	1	localObject1	Object
    //   14	17	1	localObject2	Object
    //   23	24	2	localObject3	Object
    //   27	8	3	localObject4	Object
    //   44	1	4	i	int
    // Exception table:
    //   from	to	target	type
    //   5	9	14	finally
    //   15	22	27	finally
  }
  
  public final void f(OutputStream paramOutputStream)
  {
    b.H(a);
    out = paramOutputStream;
    count = 0;
    a = false;
  }
}

/* Location:
 * Qualified Name:     u5.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */