package com.devbrackets.android.exomedia;

public enum ExoMedia$RendererType
{
  static
  {
    RendererType localRendererType1 = new RendererType("AUDIO", 0);
    AUDIO = localRendererType1;
    RendererType localRendererType2 = new RendererType("VIDEO", 1);
    VIDEO = localRendererType2;
    RendererType localRendererType3 = new RendererType("CLOSED_CAPTION", 2);
    CLOSED_CAPTION = localRendererType3;
    RendererType localRendererType4 = new RendererType("METADATA", 3);
    METADATA = localRendererType4;
    $VALUES = new RendererType[] { localRendererType1, localRendererType2, localRendererType3, localRendererType4 };
  }
  
  private ExoMedia$RendererType() {}
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ExoMedia.RendererType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */