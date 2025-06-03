package wc;

import com.google.android.gms.tasks.Task;
import ea.q.a.a;
import java.util.concurrent.CancellationException;
import nc.l;
import p2.m0;

public final class c
{
  public static final Object a(Task paramTask, q.a.a parama)
  {
    if (paramTask.isComplete())
    {
      parama = paramTask.getException();
      if (parama == null)
      {
        if (!paramTask.isCanceled())
        {
          paramTask = paramTask.getResult();
        }
        else
        {
          parama = new StringBuilder();
          parama.append("Task ");
          parama.append(paramTask);
          parama.append(" was cancelled normally.");
          throw new CancellationException(parama.toString());
        }
      }
      else {
        throw parama;
      }
    }
    else
    {
      parama = new l(1, m0.P(parama));
      parama.t();
      paramTask.addOnCompleteListener(a.a, new b(parama));
      paramTask = parama.s();
      parama = vb.a.a;
    }
    return paramTask;
  }
}

/* Location:
 * Qualified Name:     wc.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */