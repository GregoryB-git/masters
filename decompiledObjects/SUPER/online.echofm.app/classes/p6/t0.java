package p6;

public class t0
  extends x0
  implements x
{
  public final boolean q;
  
  public t0(q0 paramq0)
  {
    super(true);
    e0(paramq0);
    q = G0();
  }
  
  public final boolean G0()
  {
    Object localObject = a0();
    if ((localObject instanceof s)) {
      localObject = (s)localObject;
    } else {
      localObject = null;
    }
    if (localObject != null)
    {
      x0 localx0 = ((w0)localObject).w();
      localObject = localx0;
      if (localx0 != null) {
        do
        {
          if (((x0)localObject).X()) {
            return true;
          }
          localObject = ((x0)localObject).a0();
          if ((localObject instanceof s)) {
            localObject = (s)localObject;
          } else {
            localObject = null;
          }
          if (localObject == null) {
            break;
          }
          localx0 = ((w0)localObject).w();
          localObject = localx0;
        } while (localx0 != null);
      }
    }
    return false;
  }
  
  public boolean X()
  {
    return q;
  }
  
  public boolean Y()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     p6.t0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */