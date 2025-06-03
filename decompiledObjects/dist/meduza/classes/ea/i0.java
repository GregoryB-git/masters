package ea;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import dc.p;
import fa.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import nc.d0;
import p2.m0;
import sb.j;
import sb.q;

@wb.e(c="com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f="SessionLifecycleClient.kt", l={151}, m="invokeSuspend")
public final class i0
  extends wb.i
  implements p<d0, ub.e<? super rb.h>, Object>
{
  public int a;
  
  public i0(h0 paramh0, List<Message> paramList, ub.e<? super i0> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
  {
    return new i0(b, c, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((i0)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = vb.a.a;
    int i = a;
    if (i != 0)
    {
      if (i == 1) {
        rb.f.b(paramObject);
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      rb.f.b(paramObject);
      paramObject = fa.a.a;
      a = 1;
      localObject2 = ((fa.a)paramObject).b(this);
      paramObject = localObject2;
      if (localObject2 == localObject1) {
        return localObject1;
      }
    }
    paramObject = (Map)paramObject;
    if (((Map)paramObject).isEmpty())
    {
      paramObject = "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.";
    }
    else
    {
      paramObject = ((Map)paramObject).values();
      if ((!(paramObject instanceof Collection)) || (!((Collection)paramObject).isEmpty()))
      {
        paramObject = ((Iterable)paramObject).iterator();
        while (((Iterator)paramObject).hasNext()) {
          if (((b)((Iterator)paramObject).next()).b())
          {
            i = 0;
            break label152;
          }
        }
      }
      i = 1;
      label152:
      if (i == 0) {
        break label169;
      }
      paramObject = "Data Collection is disabled for all subscribers. Skipping this Event";
    }
    Log.d("SessionLifecycleClient", (String)paramObject);
    break label506;
    label169:
    Object localObject2 = q.m(new ArrayList(new sb.h(new Message[] { h0.a(b, c, 2), h0.a(b, c, 1) }, true)));
    paramObject = new a();
    if (((ArrayList)localObject2).size() <= 1)
    {
      paramObject = q.u((Iterable)localObject2);
    }
    else
    {
      localObject2 = ((ArrayList)localObject2).toArray(new Object[0]);
      ec.i.e(localObject2, "<this>");
      if (localObject2.length > 1) {
        Arrays.sort((Object[])localObject2, (Comparator)paramObject);
      }
      paramObject = j.j((Object[])localObject2);
    }
    localObject2 = b;
    localObject1 = ((Iterable)paramObject).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Message localMessage = (Message)((Iterator)localObject1).next();
      if (b != null)
      {
        try
        {
          paramObject = new java/lang/StringBuilder;
          ((StringBuilder)paramObject).<init>();
          ((StringBuilder)paramObject).append("Sending lifecycle ");
          ((StringBuilder)paramObject).append(what);
          ((StringBuilder)paramObject).append(" to service");
          Log.d("SessionLifecycleClient", ((StringBuilder)paramObject).toString());
          paramObject = b;
          if (paramObject == null) {
            continue;
          }
          ((Messenger)paramObject).send(localMessage);
        }
        catch (RemoteException localRemoteException)
        {
          paramObject = f.l("Unable to deliver message: ");
          ((StringBuilder)paramObject).append(what);
          Log.w("SessionLifecycleClient", ((StringBuilder)paramObject).toString(), localRemoteException);
        }
      }
      else
      {
        if (c.offer(localMessage))
        {
          paramObject = f.l("Queued message ");
          ((StringBuilder)paramObject).append(what);
          ((StringBuilder)paramObject).append(". Queue size ");
          ((StringBuilder)paramObject).append(c.size());
        }
        else
        {
          paramObject = f.l("Failed to enqueue message ");
          ((StringBuilder)paramObject).append(what);
          ((StringBuilder)paramObject).append(". Dropping.");
        }
        Log.d("SessionLifecycleClient", ((StringBuilder)paramObject).toString());
      }
    }
    label506:
    return rb.h.a;
  }
  
  public static final class a<T>
    implements Comparator
  {
    public final int compare(T paramT1, T paramT2)
    {
      return m0.s(Long.valueOf(((Message)paramT1).getWhen()), Long.valueOf(((Message)paramT2).getWhen()));
    }
  }
}

/* Location:
 * Qualified Name:     ea.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */