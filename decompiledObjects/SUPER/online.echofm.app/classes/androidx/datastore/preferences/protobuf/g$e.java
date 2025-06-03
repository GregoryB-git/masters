package androidx.datastore.preferences.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

public final class g$e
  extends g.i
{
  private static final long serialVersionUID = 1L;
  public final int t;
  public final int u;
  
  public g$e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    g.g(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    t = paramInt1;
    u = paramInt2;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
  }
  
  public byte D(int paramInt)
  {
    return s[(t + paramInt)];
  }
  
  public byte d(int paramInt)
  {
    g.f(paramInt, size());
    return s[(t + paramInt)];
  }
  
  public int f0()
  {
    return t;
  }
  
  public void s(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(s, f0() + paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  public int size()
  {
    return u;
  }
  
  public Object writeReplace()
  {
    return g.b0(W());
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.g.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */