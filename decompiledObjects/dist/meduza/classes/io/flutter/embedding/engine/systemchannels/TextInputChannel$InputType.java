package io.flutter.embedding.engine.systemchannels;

import org.json.JSONObject;

public class TextInputChannel$InputType
{
  public final boolean isDecimal;
  public final boolean isSigned;
  public final TextInputChannel.TextInputType type;
  
  public TextInputChannel$InputType(TextInputChannel.TextInputType paramTextInputType, boolean paramBoolean1, boolean paramBoolean2)
  {
    type = paramTextInputType;
    isSigned = paramBoolean1;
    isDecimal = paramBoolean2;
  }
  
  public static InputType fromJson(JSONObject paramJSONObject)
  {
    return new InputType(TextInputChannel.TextInputType.fromValue(paramJSONObject.getString("name")), paramJSONObject.optBoolean("signed", false), paramJSONObject.optBoolean("decimal", false));
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.TextInputChannel.InputType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */