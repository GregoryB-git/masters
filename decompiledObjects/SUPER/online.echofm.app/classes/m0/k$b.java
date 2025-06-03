package m0;

public final class k$b
{
  public boolean a;
  public boolean b;
  public boolean c;
  
  public k d()
  {
    if ((!a) && ((b) || (c))) {
      throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
    return new k(this, null);
  }
  
  public b e(boolean paramBoolean)
  {
    a = paramBoolean;
    return this;
  }
  
  public b f(boolean paramBoolean)
  {
    b = paramBoolean;
    return this;
  }
  
  public b g(boolean paramBoolean)
  {
    c = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     m0.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */