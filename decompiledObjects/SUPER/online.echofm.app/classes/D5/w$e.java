package D5;

import org.json.JSONObject;

public class w$e
{
  public final String a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  
  public w$e(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
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
              a = paramString;
              b = paramInt1;
              c = paramInt2;
              d = paramInt3;
              e = paramInt4;
              return;
            }
            paramString = new StringBuilder();
            paramString.append("invalid selection end: ");
            paramString.append(String.valueOf(paramInt2));
            throw new IndexOutOfBoundsException(paramString.toString());
          }
          paramString = new StringBuilder();
          paramString.append("invalid selection start: ");
          paramString.append(String.valueOf(paramInt1));
          throw new IndexOutOfBoundsException(paramString.toString());
        }
        paramString = new StringBuilder();
        paramString.append("invalid composing start: ");
        paramString.append(String.valueOf(paramInt3));
        throw new IndexOutOfBoundsException(paramString.toString());
      }
      paramString = new StringBuilder();
      paramString.append("invalid composing range: (");
      paramString.append(String.valueOf(paramInt3));
      paramString.append(", ");
      paramString.append(String.valueOf(paramInt4));
      paramString.append(")");
      throw new IndexOutOfBoundsException(paramString.toString());
    }
    paramString = new StringBuilder();
    paramString.append("invalid selection: (");
    paramString.append(String.valueOf(paramInt1));
    paramString.append(", ");
    paramString.append(String.valueOf(paramInt2));
    paramString.append(")");
    throw new IndexOutOfBoundsException(paramString.toString());
  }
  
  public static e a(JSONObject paramJSONObject)
  {
    return new e(paramJSONObject.getString("text"), paramJSONObject.getInt("selectionBase"), paramJSONObject.getInt("selectionExtent"), paramJSONObject.getInt("composingBase"), paramJSONObject.getInt("composingExtent"));
  }
  
  public boolean b()
  {
    int i = d;
    boolean bool;
    if ((i >= 0) && (e > i)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean c()
  {
    boolean bool;
    if (b >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     D5.w.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */