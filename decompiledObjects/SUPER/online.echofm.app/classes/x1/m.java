package x1;

import kotlin.jvm.internal.Intrinsics;

public final class m
  extends o
{
  public static final a r = new a(null);
  public static final long serialVersionUID = 1L;
  public final int p;
  public final String q;
  
  public m(String paramString1, int paramInt, String paramString2)
  {
    super(paramString1);
    p = paramInt;
    q = paramString2;
  }
  
  public String toString()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("{FacebookDialogException: ");
    ((StringBuilder)localObject).append("errorCode: ");
    ((StringBuilder)localObject).append(p);
    ((StringBuilder)localObject).append(", message: ");
    ((StringBuilder)localObject).append(getMessage());
    ((StringBuilder)localObject).append(", url: ");
    ((StringBuilder)localObject).append(q);
    ((StringBuilder)localObject).append("}");
    localObject = ((StringBuilder)localObject).toString();
    Intrinsics.checkNotNullExpressionValue(localObject, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
    return (String)localObject;
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     x1.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */