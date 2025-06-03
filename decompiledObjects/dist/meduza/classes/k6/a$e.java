package k6;

import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.List;

public abstract class a$e<T extends a.b, O>
{
  public static final int API_PRIORITY_GAMES = 1;
  public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
  public static final int API_PRIORITY_PLUS = 2;
  
  public List<Scope> getImpliedScopes(O paramO)
  {
    return Collections.emptyList();
  }
  
  public int getPriority()
  {
    return Integer.MAX_VALUE;
  }
}

/* Location:
 * Qualified Name:     k6.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */