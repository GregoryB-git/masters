package e2;

import android.util.SparseArray;

public enum p
{
  public static final SparseArray v;
  public final int o;
  
  static
  {
    p localp1 = new p("DEFAULT", 0, 0);
    p = localp1;
    p localp2 = new p("UNMETERED_ONLY", 1, 1);
    q = localp2;
    p localp3 = new p("UNMETERED_OR_DAILY", 2, 2);
    r = localp3;
    p localp4 = new p("FAST_IF_RADIO_AWAKE", 3, 3);
    s = localp4;
    p localp5 = new p("NEVER", 4, 4);
    t = localp5;
    p localp6 = new p("UNRECOGNIZED", 5, -1);
    u = localp6;
    w = new p[] { localp1, localp2, localp3, localp4, localp5, localp6 };
    SparseArray localSparseArray = new SparseArray();
    v = localSparseArray;
    localSparseArray.put(0, localp1);
    localSparseArray.put(1, localp2);
    localSparseArray.put(2, localp3);
    localSparseArray.put(3, localp4);
    localSparseArray.put(4, localp5);
    localSparseArray.put(-1, localp6);
  }
  
  public p(int paramInt1)
  {
    o = paramInt1;
  }
}

/* Location:
 * Qualified Name:     e2.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */