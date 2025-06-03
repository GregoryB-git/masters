package nc;

import dc.l;
import java.util.concurrent.CancellationException;
import kc.b;
import rb.h;
import ub.e;
import ub.h.b;
import ub.h.c;
import uc.a;

public abstract interface j1
  extends h.b
{
  public abstract o attachChild(q paramq);
  
  public abstract void cancel(CancellationException paramCancellationException);
  
  public abstract CancellationException getCancellationException();
  
  public abstract b<j1> getChildren();
  
  public abstract a getOnJoin();
  
  public abstract j1 getParent();
  
  public abstract t0 invokeOnCompletion(l<? super Throwable, h> paraml);
  
  public abstract t0 invokeOnCompletion(boolean paramBoolean1, boolean paramBoolean2, l<? super Throwable, h> paraml);
  
  public abstract boolean isActive();
  
  public abstract boolean isCancelled();
  
  public abstract boolean isCompleted();
  
  public abstract Object join(e<? super h> parame);
  
  public abstract j1 plus(j1 paramj1);
  
  public abstract boolean start();
  
  public static final class a {}
  
  public static final class b
    implements h.c<j1>
  {}
}

/* Location:
 * Qualified Name:     nc.j1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */