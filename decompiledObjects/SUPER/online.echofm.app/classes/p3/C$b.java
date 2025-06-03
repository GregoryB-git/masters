package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.util.Collections;
import java.util.List;

public final class C$b
  extends x.a
  implements P
{
  public C$b()
  {
    super(C.U());
  }
  
  public int A()
  {
    return ((C)p).a0();
  }
  
  public List B()
  {
    return Collections.unmodifiableList(((C)p).b0());
  }
  
  public b C(int paramInt)
  {
    s();
    C.V((C)p, paramInt);
    return this;
  }
  
  public b y(C.c paramc)
  {
    s();
    C.W((C)p, paramc);
    return this;
  }
  
  public C.c z(int paramInt)
  {
    return ((C)p).Z(paramInt);
  }
}

/* Location:
 * Qualified Name:     p3.C.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */