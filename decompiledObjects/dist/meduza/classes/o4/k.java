package o4;

import android.media.MediaCodec.CodecException;
import v5.e0;
import z3.f;

public class k
  extends f
{
  public final String a;
  
  public k(IllegalStateException paramIllegalStateException, l paraml)
  {
    super(localStringBuilder.toString(), paramIllegalStateException);
    paraml = (l)localObject;
    if (e0.a >= 21)
    {
      paraml = (l)localObject;
      if ((paramIllegalStateException instanceof MediaCodec.CodecException)) {
        paraml = ((MediaCodec.CodecException)paramIllegalStateException).getDiagnosticInfo();
      }
    }
    a = paraml;
  }
}

/* Location:
 * Qualified Name:     o4.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */