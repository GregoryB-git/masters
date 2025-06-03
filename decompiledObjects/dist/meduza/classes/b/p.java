package b;

import dc.a;
import ec.i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import rb.h;

public abstract class p
{
  private final CopyOnWriteArrayList<c> cancellables;
  private a<h> enabledChangedCallback;
  private boolean isEnabled;
  
  public p(boolean paramBoolean)
  {
    isEnabled = paramBoolean;
    cancellables = new CopyOnWriteArrayList();
  }
  
  public final void addCancellable(c paramc)
  {
    i.e(paramc, "cancellable");
    cancellables.add(paramc);
  }
  
  public final a<h> getEnabledChangedCallback$activity_release()
  {
    return enabledChangedCallback;
  }
  
  public void handleOnBackCancelled() {}
  
  public abstract void handleOnBackPressed();
  
  public void handleOnBackProgressed(b paramb)
  {
    i.e(paramb, "backEvent");
  }
  
  public void handleOnBackStarted(b paramb)
  {
    i.e(paramb, "backEvent");
  }
  
  public final boolean isEnabled()
  {
    return isEnabled;
  }
  
  public final void remove()
  {
    Iterator localIterator = cancellables.iterator();
    while (localIterator.hasNext()) {
      ((c)localIterator.next()).cancel();
    }
  }
  
  public final void removeCancellable(c paramc)
  {
    i.e(paramc, "cancellable");
    cancellables.remove(paramc);
  }
  
  public final void setEnabled(boolean paramBoolean)
  {
    isEnabled = paramBoolean;
    a locala = enabledChangedCallback;
    if (locala != null) {
      locala.invoke();
    }
  }
  
  public final void setEnabledChangedCallback$activity_release(a<h> parama)
  {
    enabledChangedCallback = parama;
  }
}

/* Location:
 * Qualified Name:     b.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */