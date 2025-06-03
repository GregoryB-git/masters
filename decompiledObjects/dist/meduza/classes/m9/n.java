package m9;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e9.a;
import eb.b;
import eb.b.a;
import eb.b.b;
import eb.s0;
import eb.s0.a;
import eb.s0.b;
import eb.s0.d;
import java.util.BitSet;
import java.util.concurrent.Executor;
import n9.f;

public final class n
  extends b
{
  public static final s0.b c;
  public static final s0.b d;
  public final a a;
  public final a b;
  
  static
  {
    s0.a locala = s0.d;
    BitSet localBitSet = s0.d.d;
    c = new s0.b("Authorization", locala);
    d = new s0.b("x-firebase-appcheck", locala);
  }
  
  public n(a parama1, a parama2)
  {
    a = parama1;
    b = parama2;
  }
  
  public final void a(b.b paramb, Executor paramExecutor, b.a parama)
  {
    paramb = a.s();
    paramExecutor = b.s();
    Tasks.whenAll(new Task[] { paramb, paramExecutor }).addOnCompleteListener(f.b, new m(paramb, parama, paramExecutor));
  }
}

/* Location:
 * Qualified Name:     m9.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */