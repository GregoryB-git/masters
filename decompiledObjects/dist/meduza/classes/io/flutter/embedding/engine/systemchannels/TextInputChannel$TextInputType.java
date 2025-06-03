package io.flutter.embedding.engine.systemchannels;

import g;

public enum TextInputChannel$TextInputType
{
  private final String encodedName;
  
  static
  {
    DATETIME = new TextInputType("DATETIME", 1, "TextInputType.datetime");
    NAME = new TextInputType("NAME", 2, "TextInputType.name");
    POSTAL_ADDRESS = new TextInputType("POSTAL_ADDRESS", 3, "TextInputType.address");
    NUMBER = new TextInputType("NUMBER", 4, "TextInputType.number");
    PHONE = new TextInputType("PHONE", 5, "TextInputType.phone");
    MULTILINE = new TextInputType("MULTILINE", 6, "TextInputType.multiline");
    EMAIL_ADDRESS = new TextInputType("EMAIL_ADDRESS", 7, "TextInputType.emailAddress");
    URL = new TextInputType("URL", 8, "TextInputType.url");
    VISIBLE_PASSWORD = new TextInputType("VISIBLE_PASSWORD", 9, "TextInputType.visiblePassword");
    NONE = new TextInputType("NONE", 10, "TextInputType.none");
    WEB_SEARCH = new TextInputType("WEB_SEARCH", 11, "TextInputType.webSearch");
    TWITTER = new TextInputType("TWITTER", 12, "TextInputType.twitter");
  }
  
  private TextInputChannel$TextInputType(String paramString)
  {
    encodedName = paramString;
  }
  
  public static TextInputType fromValue(String paramString)
  {
    for (TextInputType localTextInputType : ) {
      if (encodedName.equals(paramString)) {
        return localTextInputType;
      }
    }
    throw new NoSuchFieldException(g.d("No such TextInputType: ", paramString));
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */