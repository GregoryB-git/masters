package d9;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.c;
import java.util.ArrayList;
import java.util.Map;
import k9.f;
import k9.m;
import r3.a0;

public final class a1
{
  public final FirebaseFirestore a;
  public final ArrayList<f> b = new ArrayList();
  public boolean c = false;
  
  public a1(FirebaseFirestore paramFirebaseFirestore)
  {
    a = paramFirebaseFirestore;
  }
  
  public final void a(c paramc, Map paramMap, t0 paramt0)
  {
    a.j(paramc);
    if (paramt0 != null)
    {
      b();
      if (a) {
        paramMap = a.h.d(paramMap, b);
      } else {
        paramMap = a.h.f(paramMap);
      }
      b.add(paramMap.r(a, m.c));
      return;
    }
    throw new NullPointerException("Provided options must not be null.");
  }
  
  public final void b()
  {
    if (!c) {
      return;
    }
    throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
  }
}

/* Location:
 * Qualified Name:     d9.a1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */