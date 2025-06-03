package eb;

import n7.g;
import n7.g.a;

public abstract class x0<ReqT, RespT>
  extends e<ReqT, RespT>
{
  public void a(String paramString, Throwable paramThrowable)
  {
    f().a(paramString, paramThrowable);
  }
  
  public void b()
  {
    f().b();
  }
  
  public final void c(int paramInt)
  {
    f().c(paramInt);
  }
  
  public abstract e<?, ?> f();
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(f(), "delegate");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     eb.x0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */