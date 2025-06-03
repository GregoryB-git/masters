package com.google.android.exoplayer2.util;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

public final class ReusableBufferedOutputStream
  extends BufferedOutputStream
{
  private boolean closed;
  
  public ReusableBufferedOutputStream(OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }
  
  public ReusableBufferedOutputStream(OutputStream paramOutputStream, int paramInt)
  {
    super(paramOutputStream, paramInt);
  }
  
  /* Error */
  public void close()
    throws java.io.IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield 20	com/google/android/exoplayer2/util/ReusableBufferedOutputStream:closed	Z
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
    //   37: ifnull +7 -> 44
    //   40: aload_2
    //   41: invokestatic 37	com/google/android/exoplayer2/util/Util:sneakyThrow	(Ljava/lang/Throwable;)V
    //   44: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	ReusableBufferedOutputStream
    //   10	1	1	localObject1	Object
    //   14	17	1	localObject2	Object
    //   23	18	2	localObject3	Object
    //   27	8	3	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   5	9	14	finally
    //   15	22	27	finally
  }
  
  public void reset(OutputStream paramOutputStream)
  {
    Assertions.checkState(closed);
    out = paramOutputStream;
    count = 0;
    closed = false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.ReusableBufferedOutputStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */