package Y1;

import W5.I;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;

public abstract class z
{
  public static final a a;
  public static final Set b;
  public static final String c;
  
  static
  {
    Object localObject = new a(null);
    a = (a)localObject;
    b = a.a((a)localObject);
    localObject = z.class.toString();
    Intrinsics.checkNotNullExpressionValue(localObject, "LoginManager::class.java.toString()");
    c = (String)localObject;
  }
  
  public static final class a
  {
    public final Set b()
    {
      return I.f(new String[] { "ads_management", "create_event", "rsvp_event" });
    }
    
    public final boolean c(String paramString)
    {
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (paramString != null) {
        if ((!i.s(paramString, "publish", false, 2, null)) && (!i.s(paramString, "manage", false, 2, null)))
        {
          bool2 = bool1;
          if (!z.a().contains(paramString)) {}
        }
        else
        {
          bool2 = true;
        }
      }
      return bool2;
    }
  }
}

/* Location:
 * Qualified Name:     Y1.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */