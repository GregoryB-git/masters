package m9;

import com.google.firebase.firestore.f.a;
import java.util.Arrays;
import java.util.HashSet;
import n9.a;

public final class j
{
  public static final HashSet d = new HashSet(Arrays.asList(new String[] { "date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace" }));
  public final e0 a;
  public final a b;
  public final v c;
  
  public j(a parama, e0 parame0, v paramv)
  {
    b = parama;
    a = parame0;
    c = paramv;
  }
  
  public static boolean a(f.a parama)
  {
    switch (parama.ordinal())
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown gRPC status code: ");
      localStringBuilder.append(parama);
      throw new IllegalArgumentException(localStringBuilder.toString());
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 15: 
      return true;
    case 1: 
    case 2: 
    case 4: 
    case 8: 
    case 13: 
    case 14: 
    case 16: 
      return false;
    }
    throw new IllegalArgumentException("Treated status OK as error");
  }
}

/* Location:
 * Qualified Name:     m9.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */