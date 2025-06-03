package q0;

import android.content.Context;
import dc.a;
import ec.i;
import ec.j;
import java.io.File;

public final class b
  extends j
  implements a<File>
{
  public b(Context paramContext, c paramc)
  {
    super(0);
  }
  
  public final Object invoke()
  {
    Context localContext = a;
    i.d(localContext, "applicationContext");
    String str = b.a;
    i.e(str, "name");
    str = i.h(".preferences_pb", str);
    i.e(str, "fileName");
    return new File(localContext.getApplicationContext().getFilesDir(), i.h(str, "datastore/"));
  }
}

/* Location:
 * Qualified Name:     q0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */