package io.flutter.embedding.engine.systemchannels;

import g;

public enum TextInputChannel$TextCapitalization
{
  private final String encodedName;
  
  static
  {
    SENTENCES = new TextCapitalization("SENTENCES", 2, "TextCapitalization.sentences");
    NONE = new TextCapitalization("NONE", 3, "TextCapitalization.none");
  }
  
  private TextInputChannel$TextCapitalization(String paramString)
  {
    encodedName = paramString;
  }
  
  public static TextCapitalization fromValue(String paramString)
  {
    for (TextCapitalization localTextCapitalization : ) {
      if (encodedName.equals(paramString)) {
        return localTextCapitalization;
      }
    }
    throw new NoSuchFieldException(g.d("No such TextCapitalization: ", paramString));
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */