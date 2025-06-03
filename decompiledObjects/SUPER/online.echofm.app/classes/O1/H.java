package O1;

import W5.m;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import x1.B;

public final class H
{
  public static final H a = new H();
  public static final String b = H.class.getName();
  
  public static final String a()
  {
    return "v16.0";
  }
  
  public static final String b()
  {
    Object localObject = x.a;
    localObject = String.format("m.%s", Arrays.copyOf(new Object[] { B.u() }, 1));
    Intrinsics.checkNotNullExpressionValue(localObject, "java.lang.String.format(format, *args)");
    return (String)localObject;
  }
  
  public static final String c()
  {
    return "CONNECTION_FAILURE";
  }
  
  public static final Collection d()
  {
    return (Collection)m.i(new String[] { "service_disabled", "AndroidAuthKillSwitchException" });
  }
  
  public static final Collection e()
  {
    return (Collection)m.i(new String[] { "access_denied", "OAuthAccessDeniedException" });
  }
  
  public static final String f()
  {
    Object localObject = x.a;
    localObject = String.format("https://graph.%s", Arrays.copyOf(new Object[] { B.u() }, 1));
    Intrinsics.checkNotNullExpressionValue(localObject, "java.lang.String.format(format, *args)");
    return (String)localObject;
  }
  
  public static final String g()
  {
    Object localObject = x.a;
    localObject = String.format("%s", Arrays.copyOf(new Object[] { B.v() }, 1));
    Intrinsics.checkNotNullExpressionValue(localObject, "java.lang.String.format(format, *args)");
    return (String)localObject;
  }
  
  public static final String h()
  {
    Object localObject = x.a;
    localObject = String.format("https://graph.%s", Arrays.copyOf(new Object[] { B.x() }, 1));
    Intrinsics.checkNotNullExpressionValue(localObject, "java.lang.String.format(format, *args)");
    return (String)localObject;
  }
  
  public static final String i(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "subdomain");
    x localx = x.a;
    paramString = String.format("https://graph.%s", Arrays.copyOf(new Object[] { paramString }, 1));
    Intrinsics.checkNotNullExpressionValue(paramString, "java.lang.String.format(format, *args)");
    return paramString;
  }
  
  public static final String j()
  {
    Object localObject = x.a;
    localObject = String.format("https://graph-video.%s", Arrays.copyOf(new Object[] { B.x() }, 1));
    Intrinsics.checkNotNullExpressionValue(localObject, "java.lang.String.format(format, *args)");
    return (String)localObject;
  }
  
  public static final String k()
  {
    Object localObject = x.a;
    localObject = String.format("m.%s", Arrays.copyOf(new Object[] { B.y() }, 1));
    Intrinsics.checkNotNullExpressionValue(localObject, "java.lang.String.format(format, *args)");
    return (String)localObject;
  }
}

/* Location:
 * Qualified Name:     O1.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */