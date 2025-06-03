package androidx.datastore.preferences.protobuf;

public abstract class q0$b
{
  public abstract String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract int b(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public final boolean c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    if (d(0, paramArrayOfByte, paramInt1, paramInt2) == 0) {
      bool = true;
    }
    return bool;
  }
  
  public abstract int d(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3);
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.q0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */