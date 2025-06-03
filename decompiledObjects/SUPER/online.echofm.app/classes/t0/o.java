package t0;

import android.media.MediaCodec.CodecException;
import g0.M;
import j0.h;

public class o
  extends h
{
  public final p o;
  public final String p;
  public final int q;
  
  public o(Throwable paramThrowable, p paramp)
  {
    super(localStringBuilder.toString(), paramThrowable);
    o = paramp;
    int i = M.a;
    paramp = (p)localObject;
    if (i >= 21) {
      paramp = a(paramThrowable);
    }
    p = paramp;
    if (i >= 23) {
      i = b(paramThrowable);
    } else {
      i = M.X(paramp);
    }
    q = i;
  }
  
  public static String a(Throwable paramThrowable)
  {
    if ((paramThrowable instanceof MediaCodec.CodecException)) {
      return ((MediaCodec.CodecException)paramThrowable).getDiagnosticInfo();
    }
    return null;
  }
  
  public static int b(Throwable paramThrowable)
  {
    if ((paramThrowable instanceof MediaCodec.CodecException)) {
      return ((MediaCodec.CodecException)paramThrowable).getErrorCode();
    }
    return 0;
  }
}

/* Location:
 * Qualified Name:     t0.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */