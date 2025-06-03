package m9;

import com.google.android.gms.tasks.Task;
import eb.e;
import eb.x;
import eb.x0;
import n9.a;
import x6.b;

public final class s
  extends x<Object, Object>
{
  public s(v paramv, e[] paramArrayOfe, Task paramTask) {}
  
  public final void b()
  {
    if (a[0] == null) {
      b.addOnSuccessListener(c.a.a, new w3.v(20));
    } else {
      super.b();
    }
  }
  
  public final e<Object, Object> f()
  {
    boolean bool;
    if (a[0] != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("ClientCall used before onOpen() callback", bool, new Object[0]);
    return a[0];
  }
}

/* Location:
 * Qualified Name:     m9.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */