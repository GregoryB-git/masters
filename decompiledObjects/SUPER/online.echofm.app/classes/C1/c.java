package C1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class c
{
  public static final a i = new a(null);
  public final String a;
  public final int b;
  public final int c;
  public final String d;
  public final String e;
  public final String f;
  public final String g;
  public final int h;
  
  public c(JSONObject paramJSONObject)
  {
    String str = paramJSONObject.getString("class_name");
    Intrinsics.checkNotNullExpressionValue(str, "component.getString(PATH_CLASS_NAME_KEY)");
    a = str;
    b = paramJSONObject.optInt("index", -1);
    c = paramJSONObject.optInt("id");
    str = paramJSONObject.optString("text");
    Intrinsics.checkNotNullExpressionValue(str, "component.optString(PATH_TEXT_KEY)");
    d = str;
    str = paramJSONObject.optString("tag");
    Intrinsics.checkNotNullExpressionValue(str, "component.optString(PATH_TAG_KEY)");
    e = str;
    str = paramJSONObject.optString("description");
    Intrinsics.checkNotNullExpressionValue(str, "component.optString(PATH_DESCRIPTION_KEY)");
    f = str;
    str = paramJSONObject.optString("hint");
    Intrinsics.checkNotNullExpressionValue(str, "component.optString(PATH_HINT_KEY)");
    g = str;
    h = paramJSONObject.optInt("match_bitmask");
  }
  
  public final String a()
  {
    return a;
  }
  
  public final String b()
  {
    return f;
  }
  
  public final String c()
  {
    return g;
  }
  
  public final int d()
  {
    return c;
  }
  
  public final int e()
  {
    return b;
  }
  
  public final int f()
  {
    return h;
  }
  
  public final String g()
  {
    return e;
  }
  
  public final String h()
  {
    return d;
  }
  
  public static final class a {}
  
  public static enum b
  {
    public final int o;
    
    public b(int paramInt1)
    {
      o = paramInt1;
    }
    
    public final int e()
    {
      return o;
    }
  }
}

/* Location:
 * Qualified Name:     C1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */