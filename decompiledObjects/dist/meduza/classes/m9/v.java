package m9;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import eb.s0;
import eb.s0.a;
import eb.s0.b;
import eb.s0.d;
import eb.t0;
import java.io.Serializable;
import java.util.BitSet;
import ma.w;
import q0.g;
import t9.b;
import u7.j;

public final class v
{
  public static final s0.b g;
  public static final s0.b h;
  public static final s0.b i;
  public static volatile String j = "gl-java/";
  public final n9.a a;
  public final e9.a b;
  public final e9.a c;
  public final y d;
  public final String e;
  public final z f;
  
  static
  {
    s0.a locala = s0.d;
    BitSet localBitSet = s0.d.d;
    g = new s0.b("x-goog-api-client", locala);
    h = new s0.b("google-cloud-resource-prefix", locala);
    i = new s0.b("x-goog-request-params", locala);
  }
  
  public v(n9.a parama, e9.a parama1, e9.a parama2, j9.f paramf, z paramz, y paramy)
  {
    a = parama;
    f = paramz;
    b = parama1;
    c = parama2;
    d = paramy;
    e = String.format("projects/%s/databases/%s", new Object[] { a, b });
  }
  
  public final s0 a()
  {
    s0 locals0 = new s0();
    locals0.f(g, String.format("%s fire/%s grpc/", new Object[] { j, "25.1.2" }));
    locals0.f(h, e);
    locals0.f(i, e);
    Object localObject = f;
    if (localObject != null)
    {
      localObject = (l)localObject;
      if ((a.get() != null) && (b.get() != null))
      {
        int k = g.c(((q9.f)a.get()).b());
        if (k != 0) {
          locals0.f(l.d, Integer.toString(k));
        }
        locals0.f(l.e, ((ca.f)b.get()).a());
        localObject = c;
        if (localObject != null)
        {
          localObject = b;
          if (((String)localObject).length() != 0) {
            locals0.f(l.f, (Serializable)localObject);
          }
        }
      }
    }
    return locals0;
  }
  
  public final Task b(t0 paramt0, w paramw)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    d.a(paramt0).addOnCompleteListener(a.a, new q(this, localTaskCompletionSource, paramw, 0));
    return localTaskCompletionSource.getTask();
  }
  
  public static abstract class a<T> {}
}

/* Location:
 * Qualified Name:     m9.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */