package R2;

import A2.n;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.Y1.a;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Y3.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f6
{
  public com.google.android.gms.internal.measurement.Y1 a;
  public Long b;
  public long c;
  
  public f6(b6 paramb6) {}
  
  public final com.google.android.gms.internal.measurement.Y1 a(String paramString, com.google.android.gms.internal.measurement.Y1 paramY1)
  {
    Object localObject1 = paramY1.b0();
    List localList = paramY1.c0();
    d.o();
    Long localLong = (Long)N5.e0(paramY1, "_eid");
    int i;
    if (localLong != null) {
      i = 1;
    } else {
      i = 0;
    }
    long l;
    if ((i != 0) && (((String)localObject1).equals("_ep")))
    {
      n.i(localLong);
      d.o();
      localObject2 = (String)N5.e0(paramY1, "_en");
      if (TextUtils.isEmpty((CharSequence)localObject2))
      {
        d.j().I().b("Extra parameter without an event name. eventId", localLong);
        return null;
      }
      if ((a == null) || (b == null) || (localLong.longValue() != b.longValue()))
      {
        localObject1 = d.q().L(paramString, localLong);
        if (localObject1 != null)
        {
          localObject3 = first;
          if (localObject3 != null)
          {
            a = ((com.google.android.gms.internal.measurement.Y1)localObject3);
            c = ((Long)second).longValue();
            d.o();
            b = ((Long)N5.e0(a, "_eid"));
          }
        }
      }
      else
      {
        l = c - 1L;
        c = l;
        if (l <= 0L)
        {
          localObject1 = d.q();
          ((m3)localObject1).n();
          ((m3)localObject1).j().K().b("Clearing complex main event info. appId", paramString);
          try
          {
            ((p)localObject1).B().execSQL("delete from main_event_params where app_id=?", new String[] { paramString });
          }
          catch (SQLiteException paramString)
          {
            ((m3)localObject1).j().G().b("Error clearing complex main event", paramString);
          }
        }
        else
        {
          d.q().j0(paramString, localLong, c, a);
        }
        localObject3 = new ArrayList();
        localObject1 = a.c0().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          paramString = (com.google.android.gms.internal.measurement.a2)((Iterator)localObject1).next();
          d.o();
          if (N5.G(paramY1, paramString.c0()) == null) {
            ((List)localObject3).add(paramString);
          }
        }
        if (!((List)localObject3).isEmpty())
        {
          ((List)localObject3).addAll(localList);
          break label604;
        }
        localObject1 = d.j().I();
        paramString = "No unique parameters in main event. eventName";
      }
    }
    for (;;)
    {
      ((a2)localObject1).b(paramString, localObject2);
      localObject3 = localList;
      break label604;
      d.j().I().c("Extra parameter without existing main event. eventName, eventId", localObject2, localLong);
      return null;
      localObject2 = localObject1;
      localObject3 = localList;
      if (i == 0) {
        break label604;
      }
      b = localLong;
      a = paramY1;
      d.o();
      localObject3 = Long.valueOf(0L);
      localObject2 = N5.e0(paramY1, "_epc");
      if (localObject2 == null) {
        localObject2 = localObject3;
      }
      l = ((Long)localObject2).longValue();
      c = l;
      if (l > 0L) {
        break;
      }
      localObject3 = d.j().I();
      paramString = "Complex event with zero extra param count. eventName";
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
    d.q().j0(paramString, (Long)n.i(localLong), c, paramY1);
    Object localObject3 = localList;
    Object localObject2 = localObject1;
    label604:
    return (com.google.android.gms.internal.measurement.Y1)((Y1.a)paramY1.x()).E((String)localObject2).J().D((Iterable)localObject3).p();
  }
}

/* Location:
 * Qualified Name:     R2.f6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */