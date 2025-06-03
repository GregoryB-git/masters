package pa;

import android.support.v4.media.session.MediaSessionCompat.a;
import java.util.HashMap;
import v3.e;

public final class b$b
  extends MediaSessionCompat.a
{
  public b$b(b paramb) {}
  
  public final void u0(long paramLong)
  {
    b localb = f;
    Object localObject = c;
    if (localObject != null) {
      ((e)localObject).T(5, paramLong);
    }
    localObject = new HashMap();
    ((HashMap)localObject).put("event", "seek");
    ((HashMap)localObject).put("position", Long.valueOf(paramLong));
    d.success(localObject);
  }
}

/* Location:
 * Qualified Name:     pa.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */