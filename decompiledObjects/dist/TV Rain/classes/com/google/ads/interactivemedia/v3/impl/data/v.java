package com.google.ads.interactivemedia.v3.impl.data;

final class v
  extends ao
{
  private Float volume;
  
  public final ap build()
  {
    Float localFloat = volume;
    String str = "";
    if (localFloat == null) {
      str = "".concat(" volume");
    }
    if (!str.isEmpty())
    {
      if (str.length() != 0) {
        str = "Missing required properties:".concat(str);
      } else {
        str = new String("Missing required properties:");
      }
      throw new IllegalStateException(str);
    }
    return new w(volume.floatValue(), null);
  }
  
  public final ao volume(float paramFloat)
  {
    volume = Float.valueOf(paramFloat);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */