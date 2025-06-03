package gb;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class w$d
  implements w.f<ByteBuffer>
{
  public final int a(u2 paramu2, int paramInt1, Object paramObject, int paramInt2)
  {
    paramObject = (ByteBuffer)paramObject;
    paramInt2 = ((Buffer)paramObject).limit();
    ((Buffer)paramObject).limit(((Buffer)paramObject).position() + paramInt1);
    paramu2.v0((ByteBuffer)paramObject);
    ((Buffer)paramObject).limit(paramInt2);
    return 0;
  }
}

/* Location:
 * Qualified Name:     gb.w.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */