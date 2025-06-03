package e;

import android.content.Intent;
import b.j;
import ec.i;

public final class c
  extends a<Intent, d.a>
{
  public final Intent a(j paramj, Object paramObject)
  {
    paramObject = (Intent)paramObject;
    i.e(paramj, "context");
    i.e(paramObject, "input");
    return (Intent)paramObject;
  }
  
  public final Object c(int paramInt, Intent paramIntent)
  {
    return new d.a(paramInt, paramIntent);
  }
}

/* Location:
 * Qualified Name:     e.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */