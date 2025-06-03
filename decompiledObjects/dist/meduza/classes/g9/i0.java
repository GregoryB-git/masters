package g9;

import android.content.Context;
import com.google.firebase.firestore.g;
import i9.e;
import i9.i;
import i9.k1;
import i9.q;
import i9.q.a;
import i9.q.b;
import i9.v0;
import i9.y0;
import m9.c0;
import m9.e0;
import x6.b;

public final class i0
  extends b0
{
  public i0(g paramg)
  {
    super(paramg);
  }
  
  public final k1 b(f.a parama)
  {
    Object localObject = c;
    b.a0(localObject, "persistence not initialized yet", new Object[0]);
    localObject = g.d;
    n9.a locala = b;
    parama = h();
    localObject.getClass();
    return new q.a((q)localObject, locala, parama);
  }
  
  public final e c(f.a parama)
  {
    e9.a locala = c;
    b.a0(locala, "persistence not initialized yet", new Object[0]);
    return new e(locala, b, h());
  }
  
  public final e9.a e(f.a parama)
  {
    Object localObject = b.b;
    b.a0(localObject, "remoteSerializer not initialized yet", new Object[0]);
    localObject = new i((e0)localObject);
    q.b localb = new q.b(a.a());
    Context localContext = a;
    parama = c;
    return new y0(localContext, b, a, (i)localObject, localb);
  }
}

/* Location:
 * Qualified Name:     g9.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */