package D6;

public final class d
{
  public final byte[] a;
  public int b;
  public int c;
  public boolean d;
  public boolean e;
  public d f;
  public d g;
  
  public d()
  {
    a = new byte[' '];
    e = true;
    d = false;
  }
  
  public d(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramArrayOfByte;
    b = paramInt1;
    c = paramInt2;
    d = paramBoolean1;
    e = paramBoolean2;
  }
  
  public final d a()
  {
    d locald1 = f;
    d locald2;
    if (locald1 != this) {
      locald2 = locald1;
    } else {
      locald2 = null;
    }
    d locald3 = g;
    f = locald1;
    f.g = locald3;
    f = null;
    g = null;
    return locald2;
  }
  
  public final d b(d paramd)
  {
    g = this;
    f = f;
    f.g = paramd;
    f = paramd;
    return paramd;
  }
  
  public final d c()
  {
    d = true;
    return new d(a, b, c, true, false);
  }
}

/* Location:
 * Qualified Name:     D6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */