package androidx.lifecycle;

public abstract class LiveData$c
{
  public final m o;
  public boolean p;
  public int q = -1;
  
  public LiveData$c(LiveData paramLiveData, m paramm)
  {
    o = paramm;
  }
  
  public void b(boolean paramBoolean)
  {
    if (paramBoolean == p) {
      return;
    }
    p = paramBoolean;
    LiveData localLiveData = r;
    int i;
    if (paramBoolean) {
      i = 1;
    } else {
      i = -1;
    }
    localLiveData.b(i);
    if (p) {
      r.d(this);
    }
  }
  
  public void c() {}
  
  public abstract boolean d();
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LiveData.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */