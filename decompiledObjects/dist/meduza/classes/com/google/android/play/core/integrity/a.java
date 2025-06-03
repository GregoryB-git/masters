package com.google.android.play.core.integrity;

final class a
  extends ap
{
  private String a;
  private y b;
  
  public final ap a(y paramy)
  {
    b = paramy;
    return this;
  }
  
  public final ap b(String paramString)
  {
    a = paramString;
    return this;
  }
  
  public final aq c()
  {
    Object localObject = a;
    if (localObject != null)
    {
      y localy = b;
      if (localy != null) {
        return new aq((String)localObject, localy);
      }
    }
    localObject = new StringBuilder();
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
 * Qualified Name:     com.google.android.play.core.integrity.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */