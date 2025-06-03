package androidx.datastore.preferences.protobuf;

public enum t$b
{
  public final boolean o;
  
  static
  {
    b localb1 = new b("SCALAR", 0, false);
    p = localb1;
    b localb2 = new b("VECTOR", 1, true);
    q = localb2;
    b localb3 = new b("PACKED_VECTOR", 2, true);
    r = localb3;
    b localb4 = new b("MAP", 3, false);
    s = localb4;
    t = new b[] { localb1, localb2, localb3, localb4 };
  }
  
  public t$b(boolean paramBoolean)
  {
    o = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.t.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */