package io.flutter.plugin.editing;

import io.flutter.Log;
import org.json.JSONException;
import org.json.JSONObject;

public final class TextEditingDelta
{
  private static final String TAG = "TextEditingDelta";
  private int deltaEnd;
  private int deltaStart;
  private CharSequence deltaText;
  private int newComposingEnd;
  private int newComposingStart;
  private int newSelectionEnd;
  private int newSelectionStart;
  private CharSequence oldText;
  
  public TextEditingDelta(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    newSelectionStart = paramInt1;
    newSelectionEnd = paramInt2;
    newComposingStart = paramInt3;
    newComposingEnd = paramInt4;
    setDeltas(paramCharSequence, "", -1, -1);
  }
  
  public TextEditingDelta(CharSequence paramCharSequence1, int paramInt1, int paramInt2, CharSequence paramCharSequence2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    newSelectionStart = paramInt3;
    newSelectionEnd = paramInt4;
    newComposingStart = paramInt5;
    newComposingEnd = paramInt6;
    setDeltas(paramCharSequence1, paramCharSequence2.toString(), paramInt1, paramInt2);
  }
  
  private void setDeltas(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt1, int paramInt2)
  {
    oldText = paramCharSequence1;
    deltaText = paramCharSequence2;
    deltaStart = paramInt1;
    deltaEnd = paramInt2;
  }
  
  public int getDeltaEnd()
  {
    return deltaEnd;
  }
  
  public int getDeltaStart()
  {
    return deltaStart;
  }
  
  public CharSequence getDeltaText()
  {
    return deltaText;
  }
  
  public int getNewComposingEnd()
  {
    return newComposingEnd;
  }
  
  public int getNewComposingStart()
  {
    return newComposingStart;
  }
  
  public int getNewSelectionEnd()
  {
    return newSelectionEnd;
  }
  
  public int getNewSelectionStart()
  {
    return newSelectionStart;
  }
  
  public CharSequence getOldText()
  {
    return oldText;
  }
  
  public JSONObject toJSON()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("oldText", oldText.toString());
      localJSONObject.put("deltaText", deltaText.toString());
      localJSONObject.put("deltaStart", deltaStart);
      localJSONObject.put("deltaEnd", deltaEnd);
      localJSONObject.put("selectionBase", newSelectionStart);
      localJSONObject.put("selectionExtent", newSelectionEnd);
      localJSONObject.put("composingBase", newComposingStart);
      localJSONObject.put("composingExtent", newComposingEnd);
    }
    catch (JSONException localJSONException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("unable to create JSONObject: ");
      localStringBuilder.append(localJSONException);
      Log.e("TextEditingDelta", localStringBuilder.toString());
    }
    return localJSONObject;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.TextEditingDelta
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */