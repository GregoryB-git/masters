package d3;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x.a;
import java.security.GeneralSecurityException;
import k3.d.a;
import p3.G;
import p3.G.b;
import p3.H;

public class F$b
  extends d.a
{
  public F$b(F paramF, Class paramClass)
  {
    super(paramClass);
  }
  
  public G f(H paramH)
  {
    return (G)G.Z().y(paramH).z(b.k()).n();
  }
  
  public H g(h paramh)
  {
    return H.Z(paramh, p.b());
  }
  
  public void h(H paramH)
  {
    if ((!paramH.X().isEmpty()) && (paramH.Y())) {
      return;
    }
    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
  }
}

/* Location:
 * Qualified Name:     d3.F.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */