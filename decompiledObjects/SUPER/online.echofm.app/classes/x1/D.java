package x1;

import kotlin.jvm.internal.Intrinsics;

public final class D
  extends o
{
  public static final a q = new a(null);
  private static final long serialVersionUID = 1L;
  public final r p;
  
  public D(r paramr, String paramString)
  {
    super(paramString);
    p = paramr;
  }
  
  public final r c()
  {
    return p;
  }
  
  public String toString()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("{FacebookServiceException: ");
    ((StringBuilder)localObject).append("httpResponseCode: ");
    ((StringBuilder)localObject).append(p.f());
    ((StringBuilder)localObject).append(", facebookErrorCode: ");
    ((StringBuilder)localObject).append(p.b());
    ((StringBuilder)localObject).append(", facebookErrorType: ");
    ((StringBuilder)localObject).append(p.d());
    ((StringBuilder)localObject).append(", message: ");
    ((StringBuilder)localObject).append(p.c());
    ((StringBuilder)localObject).append("}");
    localObject = ((StringBuilder)localObject).toString();
    Intrinsics.checkNotNullExpressionValue(localObject, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
    return (String)localObject;
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     x1.D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */