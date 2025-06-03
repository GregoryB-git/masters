package go;

import f;
import java.lang.ref.PhantomReference;

class Seq$GoRef
  extends PhantomReference<Seq.GoObject>
{
  public final int refnum;
  
  public Seq$GoRef(int paramInt, Seq.GoObject paramGoObject, Seq.GoRefQueue paramGoRefQueue)
  {
    super(paramGoObject, paramGoRefQueue);
    if (paramInt <= 0)
    {
      refnum = paramInt;
      return;
    }
    throw new RuntimeException(f.h("GoRef instantiated with a Java refnum ", paramInt));
  }
}

/* Location:
 * Qualified Name:     go.Seq.GoRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */