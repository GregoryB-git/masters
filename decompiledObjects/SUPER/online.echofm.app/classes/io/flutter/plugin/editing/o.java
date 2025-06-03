package io.flutter.plugin.editing;

import org.json.JSONException;
import org.json.JSONObject;
import t5.b;

public final class o
{
  public CharSequence a;
  public CharSequence b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  
  public o(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    e = paramInt1;
    f = paramInt2;
    g = paramInt3;
    h = paramInt4;
    a(paramCharSequence, "", -1, -1);
  }
  
  public o(CharSequence paramCharSequence1, int paramInt1, int paramInt2, CharSequence paramCharSequence2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    e = paramInt3;
    f = paramInt4;
    g = paramInt5;
    h = paramInt6;
    a(paramCharSequence1, paramCharSequence2.toString(), paramInt1, paramInt2);
  }
  
  public final void a(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt1, int paramInt2)
  {
    a = paramCharSequence1;
    b = paramCharSequence2;
    c = paramInt1;
    d = paramInt2;
  }
  
  public JSONObject b()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("oldText", a.toString());
      localJSONObject.put("deltaText", b.toString());
      localJSONObject.put("deltaStart", c);
      localJSONObject.put("deltaEnd", d);
      localJSONObject.put("selectionBase", e);
      localJSONObject.put("selectionExtent", f);
      localJSONObject.put("composingBase", g);
      localJSONObject.put("composingExtent", h);
    }
    catch (JSONException localJSONException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("unable to create JSONObject: ");
      localStringBuilder.append(localJSONException);
      b.b("TextEditingDelta", localStringBuilder.toString());
    }
    return localJSONObject;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */