package v5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import o7.l0;
import o7.t;
import o7.t.a;
import v3.g.a;

public final class b
{
  public static l0 a(g.a parama, ArrayList paramArrayList)
  {
    Object localObject = t.b;
    localObject = new t.a();
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      Bundle localBundle = (Bundle)paramArrayList.get(i);
      localBundle.getClass();
      ((t.a)localObject).c(parama.f(localBundle));
    }
    return ((t.a)localObject).e();
  }
}

/* Location:
 * Qualified Name:     v5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */