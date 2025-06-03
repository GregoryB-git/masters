package io.flutter.embedding.engine.systemchannels;

import f;
import org.json.JSONObject;

public class TextInputChannel$TextEditState
{
  public final int composingEnd;
  public final int composingStart;
  public final int selectionEnd;
  public final int selectionStart;
  public final String text;
  
  public TextInputChannel$TextEditState(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (((paramInt1 == -1) && (paramInt2 == -1)) || ((paramInt1 >= 0) && (paramInt2 >= 0)))
    {
      if (((paramInt3 == -1) && (paramInt4 == -1)) || ((paramInt3 >= 0) && (paramInt3 <= paramInt4)))
      {
        if (paramInt4 <= paramString.length())
        {
          if (paramInt1 <= paramString.length())
          {
            if (paramInt2 <= paramString.length())
            {
              text = paramString;
              selectionStart = paramInt1;
              selectionEnd = paramInt2;
              composingStart = paramInt3;
              composingEnd = paramInt4;
              return;
            }
            paramString = f.l("invalid selection end: ");
            paramString.append(String.valueOf(paramInt2));
            throw new IndexOutOfBoundsException(paramString.toString());
          }
          paramString = f.l("invalid selection start: ");
          paramString.append(String.valueOf(paramInt1));
          throw new IndexOutOfBoundsException(paramString.toString());
        }
        paramString = f.l("invalid composing start: ");
        paramString.append(String.valueOf(paramInt3));
        throw new IndexOutOfBoundsException(paramString.toString());
      }
      paramString = f.l("invalid composing range: (");
      paramString.append(String.valueOf(paramInt3));
      paramString.append(", ");
      paramString.append(String.valueOf(paramInt4));
      paramString.append(")");
      throw new IndexOutOfBoundsException(paramString.toString());
    }
    paramString = f.l("invalid selection: (");
    paramString.append(String.valueOf(paramInt1));
    paramString.append(", ");
    paramString.append(String.valueOf(paramInt2));
    paramString.append(")");
    throw new IndexOutOfBoundsException(paramString.toString());
  }
  
  public static TextEditState fromJson(JSONObject paramJSONObject)
  {
    return new TextEditState(paramJSONObject.getString("text"), paramJSONObject.getInt("selectionBase"), paramJSONObject.getInt("selectionExtent"), paramJSONObject.getInt("composingBase"), paramJSONObject.getInt("composingExtent"));
  }
  
  public boolean hasComposing()
  {
    int i = composingStart;
    boolean bool;
    if ((i >= 0) && (composingEnd > i)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean hasSelection()
  {
    boolean bool;
    if (selectionStart >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */