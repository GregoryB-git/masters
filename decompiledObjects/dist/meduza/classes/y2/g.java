package y2;

import a0.j;
import android.os.Build.VERSION;
import androidx.work.impl.WorkDatabase;
import ec.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o2.c;
import o2.q;
import p2.y;
import sb.h;
import x2.s;
import x2.t;

public final class g
{
  public static final void a(WorkDatabase paramWorkDatabase, androidx.work.a parama, y paramy)
  {
    i.e(parama, "configuration");
    i.e(paramy, "continuation");
    if (Build.VERSION.SDK_INT < 24) {
      return;
    }
    paramy = new ArrayList(new h(new y[] { paramy }, true));
    int i = 0;
    while ((paramy.isEmpty() ^ true)) {
      if (!paramy.isEmpty())
      {
        Object localObject1 = (y)paramy.remove(va.a.d(paramy));
        Object localObject2 = e;
        i.d(localObject2, "current.work");
        if (((Collection)localObject2).isEmpty())
        {
          j = 0;
        }
        else
        {
          localObject2 = ((Iterable)localObject2).iterator();
          k = 0;
          do
          {
            do
            {
              j = k;
              if (!((Iterator)localObject2).hasNext()) {
                break;
              }
            } while (!nextb.j.a());
            k++;
          } while (k >= 0);
          throw new ArithmeticException("Count overflow has happened.");
        }
        k = i + j;
        localObject1 = h;
        i = k;
        if (localObject1 != null)
        {
          paramy.addAll((Collection)localObject1);
          i = k;
        }
      }
      else
      {
        throw new NoSuchElementException("List is empty.");
      }
    }
    if (i == 0) {
      return;
    }
    int k = paramWorkDatabase.u().A();
    int j = i;
    if (k + i <= j) {
      return;
    }
    paramWorkDatabase = new StringBuilder();
    paramWorkDatabase.append("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ");
    paramWorkDatabase.append(j);
    paramWorkDatabase.append(";\nalready enqueued count: ");
    paramWorkDatabase.append(k);
    paramWorkDatabase.append(";\ncurrent enqueue operation count: ");
    throw new IllegalArgumentException(j.m(paramWorkDatabase, i, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
  }
}

/* Location:
 * Qualified Name:     y2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */