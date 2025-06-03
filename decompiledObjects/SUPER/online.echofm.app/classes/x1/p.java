package x1;

import kotlin.jvm.internal.Intrinsics;

public final class p
  extends o
{
  public final K p;
  
  public p(K paramK, String paramString)
  {
    super(paramString);
    p = paramK;
  }
  
  public String toString()
  {
    Object localObject = p;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((K)localObject).b();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{FacebookGraphResponseException: ");
    String str = getMessage();
    if (str != null)
    {
      localStringBuilder.append(str);
      localStringBuilder.append(" ");
    }
    if (localObject != null)
    {
      localStringBuilder.append("httpResponseCode: ");
      localStringBuilder.append(((r)localObject).f());
      localStringBuilder.append(", facebookErrorCode: ");
      localStringBuilder.append(((r)localObject).b());
      localStringBuilder.append(", facebookErrorType: ");
      localStringBuilder.append(((r)localObject).d());
      localStringBuilder.append(", message: ");
      localStringBuilder.append(((r)localObject).c());
      localStringBuilder.append("}");
    }
    localObject = localStringBuilder.toString();
    Intrinsics.checkNotNullExpressionValue(localObject, "errorStringBuilder.toString()");
    return (String)localObject;
  }
}

/* Location:
 * Qualified Name:     x1.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */