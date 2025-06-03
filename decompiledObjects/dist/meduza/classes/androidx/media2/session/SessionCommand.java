package androidx.media2.session;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import b2.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public final class SessionCommand
  implements e
{
  public int a;
  public String b;
  public Bundle c;
  
  static
  {
    SparseArray localSparseArray1 = new SparseArray();
    SparseArray localSparseArray2 = new SparseArray();
    localSparseArray1.put(1, Arrays.asList(new Integer[] { Integer.valueOf(10000), Integer.valueOf(10001), Integer.valueOf(10002), Integer.valueOf(10003), Integer.valueOf(10004), Integer.valueOf(11000), Integer.valueOf(11001), Integer.valueOf(11002) }));
    localSparseArray2.put(1, Arrays.asList(new Integer[] { Integer.valueOf(10005), Integer.valueOf(10006), Integer.valueOf(10007), Integer.valueOf(10008), Integer.valueOf(10009), Integer.valueOf(10010), Integer.valueOf(10011), Integer.valueOf(10012), Integer.valueOf(10013), Integer.valueOf(10014), Integer.valueOf(10015), Integer.valueOf(10016), Integer.valueOf(10017), Integer.valueOf(10018) }));
    localSparseArray2.put(2, Collections.singletonList(Integer.valueOf(10019)));
    new SparseArray().put(1, Arrays.asList(new Integer[] { Integer.valueOf(30000), Integer.valueOf(30001) }));
    localSparseArray1 = new SparseArray();
    localSparseArray1.put(1, Arrays.asList(new Integer[] { Integer.valueOf(40000), Integer.valueOf(40001), Integer.valueOf(40002), Integer.valueOf(40003), Integer.valueOf(40010) }));
    localSparseArray1.put(2, Collections.singletonList(Integer.valueOf(40011)));
    new SparseArray().put(1, Arrays.asList(new Integer[] { Integer.valueOf(50000), Integer.valueOf(50001), Integer.valueOf(50002), Integer.valueOf(50003), Integer.valueOf(50004), Integer.valueOf(50005), Integer.valueOf(50006) }));
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof SessionCommand;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (SessionCommand)paramObject;
    bool1 = bool2;
    if (a == a)
    {
      bool1 = bool2;
      if (TextUtils.equals(b, b)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { b, Integer.valueOf(a) });
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.SessionCommand
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */