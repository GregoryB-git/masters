package s0;

import f;
import java.io.IOException;

public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
  implements o0
{
  public int memoizedHashCode = 0;
  
  public final g.e c()
  {
    try
    {
      localObject1 = (v)this;
      int i = ((v)localObject1).d();
      Object localObject2 = g.b;
      localObject2 = new byte[i];
      Object localObject3 = j.c;
      localObject3 = new s0/j$b;
      ((j.b)localObject3).<init>((byte[])localObject2, i);
      ((v)localObject1).g((j)localObject3);
      if (f - g == 0) {
        return new g.e((byte[])localObject2);
      }
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Did not write as much data as expected.");
      throw ((Throwable)localObject1);
    }
    catch (IOException localIOException)
    {
      Object localObject1 = f.l("Serializing ");
      ((StringBuilder)localObject1).append(getClass().getName());
      ((StringBuilder)localObject1).append(" to a ");
      ((StringBuilder)localObject1).append("ByteString");
      ((StringBuilder)localObject1).append(" threw an IOException (should never happen).");
      throw new RuntimeException(((StringBuilder)localObject1).toString(), localIOException);
    }
  }
  
  int h()
  {
    throw new UnsupportedOperationException();
  }
  
  public final int i(c1 paramc1)
  {
    int i = h();
    int j = i;
    if (i == -1)
    {
      j = paramc1.e(this);
      j(j);
    }
    return j;
  }
  
  void j(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public static abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
    implements o0.a
  {}
}

/* Location:
 * Qualified Name:     s0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */