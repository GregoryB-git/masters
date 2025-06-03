package j3;

import android.util.SparseArray;

public enum x
{
  static
  {
    x localx1 = new x("DEFAULT", 0);
    a = localx1;
    x localx2 = new x("UNMETERED_ONLY", 1);
    x localx3 = new x("UNMETERED_OR_DAILY", 2);
    x localx4 = new x("FAST_IF_RADIO_AWAKE", 3);
    x localx5 = new x("NEVER", 4);
    x localx6 = new x("UNRECOGNIZED", 5);
    b = new x[] { localx1, localx2, localx3, localx4, localx5, localx6 };
    SparseArray localSparseArray = new SparseArray();
    localSparseArray.put(0, localx1);
    localSparseArray.put(1, localx2);
    localSparseArray.put(2, localx3);
    localSparseArray.put(3, localx4);
    localSparseArray.put(4, localx5);
    localSparseArray.put(-1, localx6);
  }
}

/* Location:
 * Qualified Name:     j3.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */