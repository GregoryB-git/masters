package D5;

import E5.j;
import E5.k.c;
import E5.k.d;
import java.util.HashMap;
import t5.b;

public class m$a
  implements k.c
{
  public m$a(m paramm) {}
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    if (m.a(a) == null) {
      return;
    }
    String str = a;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Received '");
    localStringBuilder.append(str);
    localStringBuilder.append("' message.");
    b.f("MouseCursorChannel", localStringBuilder.toString());
    try
    {
      if ((str.hashCode() == -1307105544) && (str.equals("activateSystemCursor"))) {
        paramj = (String)((HashMap)b).get("kind");
      }
      return;
    }
    catch (Exception localException1)
    {
      try
      {
        m.a(a).a(paramj);
        paramd.a(Boolean.TRUE);
      }
      catch (Exception localException2)
      {
        paramj = new java/lang/StringBuilder;
        paramj.<init>();
        paramj.append("Error when setting cursors: ");
        paramj.append(localException2.getMessage());
        paramd.b("error", paramj.toString(), null);
      }
      localException1 = localException1;
      paramj = new StringBuilder();
      paramj.append("Unhandled error: ");
      paramj.append(localException2.getMessage());
      paramd.b("error", paramj.toString(), null);
    }
  }
}

/* Location:
 * Qualified Name:     D5.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */