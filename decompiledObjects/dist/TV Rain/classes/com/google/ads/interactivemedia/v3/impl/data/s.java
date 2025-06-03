package com.google.ads.interactivemedia.v3.impl.data;

final class s
  extends aj
{
  private Boolean attached;
  private y bounds;
  private Boolean hidden;
  private String type;
  
  public final aj attached(boolean paramBoolean)
  {
    attached = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final aj bounds(y paramy)
  {
    if (paramy != null)
    {
      bounds = paramy;
      return this;
    }
    throw new NullPointerException("Null bounds");
  }
  
  public final ak build()
  {
    Object localObject1 = attached;
    Object localObject2 = "";
    if (localObject1 == null) {
      localObject2 = "".concat(" attached");
    }
    localObject1 = localObject2;
    if (bounds == null) {
      localObject1 = String.valueOf(localObject2).concat(" bounds");
    }
    localObject2 = localObject1;
    if (hidden == null) {
      localObject2 = String.valueOf(localObject1).concat(" hidden");
    }
    localObject1 = localObject2;
    if (type == null) {
      localObject1 = String.valueOf(localObject2).concat(" type");
    }
    if (!((String)localObject1).isEmpty())
    {
      if (((String)localObject1).length() != 0) {
        localObject1 = "Missing required properties:".concat((String)localObject1);
      } else {
        localObject1 = new String("Missing required properties:");
      }
      throw new IllegalStateException((String)localObject1);
    }
    return new p(attached.booleanValue(), bounds, hidden.booleanValue(), type, null);
  }
  
  public final aj hidden(boolean paramBoolean)
  {
    hidden = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final aj type(String paramString)
  {
    if (paramString != null)
    {
      type = paramString;
      return this;
    }
    throw new NullPointerException("Null type");
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */