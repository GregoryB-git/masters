package Q3;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class c
{
  public static final Map d;
  public static final Map e;
  public final int a;
  public final String b;
  public final String c;
  
  static
  {
    HashMap localHashMap = new HashMap();
    d = localHashMap;
    Integer localInteger1 = Integer.valueOf(-1);
    localHashMap.put(localInteger1, "The transaction needs to be run again with current data");
    Integer localInteger2 = Integer.valueOf(-2);
    localHashMap.put(localInteger2, "The server indicated that this operation failed");
    Integer localInteger3 = Integer.valueOf(-3);
    localHashMap.put(localInteger3, "This client does not have permission to perform this operation");
    Integer localInteger4 = Integer.valueOf(-4);
    localHashMap.put(localInteger4, "The operation had to be aborted due to a network disconnect");
    Integer localInteger5 = Integer.valueOf(-6);
    localHashMap.put(localInteger5, "The supplied auth token has expired");
    Integer localInteger6 = Integer.valueOf(-7);
    localHashMap.put(localInteger6, "The supplied auth token was invalid");
    Integer localInteger7 = Integer.valueOf(-8);
    localHashMap.put(localInteger7, "The transaction had too many retries");
    Integer localInteger8 = Integer.valueOf(-9);
    localHashMap.put(localInteger8, "The transaction was overridden by a subsequent set");
    Integer localInteger9 = Integer.valueOf(-10);
    localHashMap.put(localInteger9, "The service is unavailable");
    localHashMap.put(Integer.valueOf(-11), "User code called from the Firebase Database runloop threw an exception:\n");
    Integer localInteger10 = Integer.valueOf(-24);
    localHashMap.put(localInteger10, "The operation could not be performed due to a network error");
    Integer localInteger11 = Integer.valueOf(-25);
    localHashMap.put(localInteger11, "The write was canceled by the user.");
    localHashMap.put(Integer.valueOf(64537), "An unknown error occurred");
    localHashMap = new HashMap();
    e = localHashMap;
    localHashMap.put("datastale", localInteger1);
    localHashMap.put("failure", localInteger2);
    localHashMap.put("permission_denied", localInteger3);
    localHashMap.put("disconnected", localInteger4);
    localHashMap.put("expired_token", localInteger5);
    localHashMap.put("invalid_token", localInteger6);
    localHashMap.put("maxretries", localInteger7);
    localHashMap.put("overriddenbyset", localInteger8);
    localHashMap.put("unavailable", localInteger9);
    localHashMap.put("network_error", localInteger10);
    localHashMap.put("write_canceled", localInteger11);
  }
  
  public c(int paramInt, String paramString)
  {
    this(paramInt, paramString, null);
  }
  
  public c(int paramInt, String paramString1, String paramString2)
  {
    a = paramInt;
    b = paramString1;
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "";
    }
    c = paramString1;
  }
  
  public static c a(int paramInt)
  {
    Object localObject = d;
    if (((Map)localObject).containsKey(Integer.valueOf(paramInt))) {
      return new c(paramInt, (String)((Map)localObject).get(Integer.valueOf(paramInt)), null);
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Invalid Firebase Database error code: ");
    ((StringBuilder)localObject).append(paramInt);
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public static c b(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    paramThrowable = new StringBuilder();
    paramThrowable.append((String)d.get(Integer.valueOf(-11)));
    paramThrowable.append(localStringWriter.toString());
    return new c(-11, paramThrowable.toString());
  }
  
  public static c c(String paramString)
  {
    return d(paramString, null);
  }
  
  public static c d(String paramString1, String paramString2)
  {
    return e(paramString1, paramString2, null);
  }
  
  public static c e(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = (Integer)e.get(paramString1.toLowerCase(Locale.US));
    paramString1 = (String)localObject;
    if (localObject == null) {
      paramString1 = Integer.valueOf(64537);
    }
    localObject = paramString2;
    if (paramString2 == null) {
      localObject = (String)d.get(paramString1);
    }
    return new c(paramString1.intValue(), (String)localObject, paramString3);
  }
  
  public int f()
  {
    return a;
  }
  
  public String g()
  {
    return c;
  }
  
  public String h()
  {
    return b;
  }
  
  public d i()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Firebase Database error: ");
    localStringBuilder.append(b);
    return new d(localStringBuilder.toString());
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DatabaseError: ");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     Q3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */