package M5;

import E5.d.b;
import P4.b;
import P4.c;
import P4.o;
import android.os.Handler;
import java.util.ArrayList;

public class e$a
  implements c
{
  public e$a(e parame, d.b paramb) {}
  
  public void a(o paramo)
  {
    a.b("firebase_remote_config", paramo.getMessage(), null);
  }
  
  public void b(b paramb)
  {
    paramb = new ArrayList(paramb.b());
    e.f(b).post(new d(a, paramb));
  }
}

/* Location:
 * Qualified Name:     M5.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */