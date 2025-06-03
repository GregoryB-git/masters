package com.google.android.play.core.integrity;

final class b
  extends bq
{
  private String a;
  private y b;
  
  public final bq a(y paramy)
  {
    b = paramy;
    return this;
  }
  
  public final bq b(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return this;
    }
    throw new NullPointerException("Null token");
  }
  
  public final br c()
  {
    String str = a;
    if (str != null)
    {
      localObject = b;
      if (localObject != null) {
        return new br(str, (y)localObject);
      }
    }
    Object localObject = new StringBuilder();
    if (a == null) {
      ((StringBuilder)localObject).append(" token");
    }
    if (b == null) {
      ((StringBuilder)localObject).append(" integrityDialogWrapper");
    }
    throw new IllegalStateException("Missing required properties:".concat(localObject.toString()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */