package O1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;

public final class z
{
  public static final z a = new z();
  public static volatile String b;
  
  public static final String a()
  {
    return b;
  }
  
  public static final boolean b()
  {
    String str = b;
    Boolean localBoolean = null;
    if (str != null) {
      localBoolean = Boolean.valueOf(i.s(str, "Unity.", false, 2, null));
    }
    return Intrinsics.a(localBoolean, Boolean.TRUE);
  }
}

/* Location:
 * Qualified Name:     O1.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */