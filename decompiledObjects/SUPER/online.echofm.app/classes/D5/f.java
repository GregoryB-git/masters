package D5;

import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import E5.q;
import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w5.a;

public class f
{
  public final k a;
  public final k.c b;
  
  public f(a parama)
  {
    a locala = new a();
    b = locala;
    parama = new k(parama, "flutter/backgesture", q.b);
    a = parama;
    parama.e(locala);
  }
  
  public final Map a(BackEvent paramBackEvent)
  {
    HashMap localHashMap = new HashMap(3);
    float f1 = b.a(paramBackEvent);
    float f2 = c.a(paramBackEvent);
    List localList;
    if ((!Float.isNaN(f1)) && (!Float.isNaN(f2))) {
      localList = Arrays.asList(new Float[] { Float.valueOf(f1), Float.valueOf(f2) });
    } else {
      localList = null;
    }
    localHashMap.put("touchOffset", localList);
    localHashMap.put("progress", Float.valueOf(d.a(paramBackEvent)));
    localHashMap.put("swipeEdge", Integer.valueOf(e.a(paramBackEvent)));
    return localHashMap;
  }
  
  public void b()
  {
    t5.b.f("BackGestureChannel", "Sending message to cancel back gesture");
    a.c("cancelBackGesture", null);
  }
  
  public void c()
  {
    t5.b.f("BackGestureChannel", "Sending message to commit back gesture");
    a.c("commitBackGesture", null);
  }
  
  public void d(BackEvent paramBackEvent)
  {
    t5.b.f("BackGestureChannel", "Sending message to start back gesture");
    a.c("startBackGesture", a(paramBackEvent));
  }
  
  public void e(BackEvent paramBackEvent)
  {
    t5.b.f("BackGestureChannel", "Sending message to update back gesture progress");
    a.c("updateBackGestureProgress", a(paramBackEvent));
  }
  
  public class a
    implements k.c
  {
    public a() {}
    
    public void onMethodCall(j paramj, k.d paramd)
    {
      paramd.a(null);
    }
  }
}

/* Location:
 * Qualified Name:     D5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */