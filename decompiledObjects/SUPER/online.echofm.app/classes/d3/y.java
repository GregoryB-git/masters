package d3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.a;

public final class y
  extends b
{
  public final A a;
  public final r3.b b;
  public final a c;
  public final Integer d;
  
  public y(A paramA, r3.b paramb, a parama, Integer paramInteger)
  {
    a = paramA;
    b = paramb;
    c = parama;
    d = paramInteger;
  }
  
  public static y a(A.a parama, r3.b paramb, Integer paramInteger)
  {
    A.a locala = A.a.d;
    if ((parama != locala) && (paramInteger == null))
    {
      paramb = new StringBuilder();
      paramb.append("For given Variant ");
      paramb.append(parama);
      paramb.append(" the value of idRequirement must be non-null");
      throw new GeneralSecurityException(paramb.toString());
    }
    if ((parama == locala) && (paramInteger != null)) {
      throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
    }
    if (paramb.b() == 32)
    {
      parama = A.a(parama);
      return new y(parama, paramb, b(parama, paramInteger), paramInteger);
    }
    parama = new StringBuilder();
    parama.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
    parama.append(paramb.b());
    throw new GeneralSecurityException(parama.toString());
  }
  
  public static a b(A paramA, Integer paramInteger)
  {
    if (paramA.b() == A.a.d) {
      return a.a(new byte[0]);
    }
    if (paramA.b() == A.a.c) {
      return a.a(ByteBuffer.allocate(5).put((byte)0).putInt(paramInteger.intValue()).array());
    }
    if (paramA.b() == A.a.b) {
      return a.a(ByteBuffer.allocate(5).put((byte)1).putInt(paramInteger.intValue()).array());
    }
    paramInteger = new StringBuilder();
    paramInteger.append("Unknown Variant: ");
    paramInteger.append(paramA.b());
    throw new IllegalStateException(paramInteger.toString());
  }
}

/* Location:
 * Qualified Name:     d3.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */