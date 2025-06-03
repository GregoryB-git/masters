package pa;

import ec.i;
import java.util.HashMap;
import v3.d0;
import v3.f1.c;
import v3.i0;
import v3.n;

public final class e
  implements f1.c
{
  public e(b paramb) {}
  
  public final void N(int paramInt)
  {
    Object localObject1;
    Object localObject4;
    if (paramInt != 2)
    {
      if (paramInt != 3)
      {
        if (paramInt != 4) {
          return;
        }
        localObject1 = new HashMap();
        ((HashMap)localObject1).put("event", "completed");
        ((HashMap)localObject1).put("key", a.h);
        break label417;
      }
      b localb = a;
      if (!f)
      {
        f = true;
        HashMap localHashMap = new HashMap();
        localHashMap.put("event", "initialized");
        localHashMap.put("key", h);
        localObject1 = c;
        long l;
        if (localObject1 != null) {
          l = ((d0)localObject1).getDuration();
        } else {
          l = 0L;
        }
        localHashMap.put("duration", Long.valueOf(l));
        localObject1 = c;
        Object localObject2 = null;
        if (localObject1 != null)
        {
          ((d0)localObject1).u0();
          localObject1 = P;
        }
        else
        {
          localObject1 = null;
        }
        if (localObject1 != null)
        {
          localObject1 = c;
          ((d0)localObject1).u0();
          Object localObject3 = P;
          if (localObject3 != null) {
            localObject1 = Integer.valueOf(y);
          } else {
            localObject1 = null;
          }
          if (localObject3 != null) {
            localObject4 = Integer.valueOf(z);
          } else {
            localObject4 = null;
          }
          if (localObject3 != null) {
            localObject3 = Integer.valueOf(B);
          } else {
            localObject3 = null;
          }
          if (((localObject3 != null) && (((Integer)localObject3).intValue() == 90)) || ((localObject3 != null) && (((Integer)localObject3).intValue() == 270)))
          {
            localObject1 = c;
            ((d0)localObject1).u0();
            localObject1 = P;
            if (localObject1 != null) {
              localObject1 = Integer.valueOf(z);
            } else {
              localObject1 = null;
            }
            localObject4 = c;
            ((d0)localObject4).u0();
            localObject3 = P;
            localObject4 = localObject2;
            if (localObject3 != null) {
              localObject4 = Integer.valueOf(y);
            }
          }
          localHashMap.put("width", localObject1);
          localHashMap.put("height", localObject4);
        }
        d.success(localHashMap);
      }
      localObject1 = new HashMap();
      localObject4 = "bufferingEnd";
    }
    else
    {
      a.d(true);
      localObject1 = new HashMap();
      localObject4 = "bufferingStart";
    }
    ((HashMap)localObject1).put("event", localObject4);
    label417:
    a.d.success(localObject1);
  }
  
  public final void a0(n paramn)
  {
    i.e(paramn, "error");
    k localk = a.d;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Video player had error ");
    localStringBuilder.append(paramn);
    localk.error("VideoError", localStringBuilder.toString(), "");
  }
}

/* Location:
 * Qualified Name:     pa.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */