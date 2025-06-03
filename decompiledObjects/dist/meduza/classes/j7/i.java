package j7;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class i
{
  public static final HashMap a;
  
  static
  {
    new HashSet(Arrays.asList(new String[] { "native", "unity" }));
    a = new HashMap();
    int i = Process.myUid();
    int j = Process.myPid();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("UID: [");
    localStringBuilder.append(i);
    localStringBuilder.append("]  PID: [");
    localStringBuilder.append(j);
    localStringBuilder.append("] ");
    localStringBuilder.toString().concat("PlayCoreVersion");
  }
}

/* Location:
 * Qualified Name:     j7.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */