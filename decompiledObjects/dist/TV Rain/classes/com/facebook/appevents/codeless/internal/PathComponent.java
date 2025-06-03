package com.facebook.appevents.codeless.internal;

import org.json.JSONException;
import org.json.JSONObject;

public final class PathComponent
{
  private static final String PATH_CLASS_NAME_KEY = "class_name";
  private static final String PATH_DESCRIPTION_KEY = "description";
  private static final String PATH_HINT_KEY = "hint";
  private static final String PATH_ID_KEY = "id";
  private static final String PATH_INDEX_KEY = "index";
  private static final String PATH_MATCH_BITMASK_KEY = "match_bitmask";
  private static final String PATH_TAG_KEY = "tag";
  private static final String PATH_TEXT_KEY = "text";
  public final String className;
  public final String description;
  public final String hint;
  public final int id;
  public final int index;
  public final int matchBitmask;
  public final String tag;
  public final String text;
  
  public PathComponent(JSONObject paramJSONObject)
    throws JSONException
  {
    className = paramJSONObject.getString("class_name");
    index = paramJSONObject.optInt("index", -1);
    id = paramJSONObject.optInt("id");
    text = paramJSONObject.optString("text");
    tag = paramJSONObject.optString("tag");
    description = paramJSONObject.optString("description");
    hint = paramJSONObject.optString("hint");
    matchBitmask = paramJSONObject.optInt("match_bitmask");
  }
  
  public static enum MatchBitmaskType
  {
    private final int value;
    
    static
    {
      MatchBitmaskType localMatchBitmaskType1 = new MatchBitmaskType("ID", 0, 1);
      ID = localMatchBitmaskType1;
      MatchBitmaskType localMatchBitmaskType2 = new MatchBitmaskType("TEXT", 1, 2);
      TEXT = localMatchBitmaskType2;
      MatchBitmaskType localMatchBitmaskType3 = new MatchBitmaskType("TAG", 2, 4);
      TAG = localMatchBitmaskType3;
      MatchBitmaskType localMatchBitmaskType4 = new MatchBitmaskType("DESCRIPTION", 3, 8);
      DESCRIPTION = localMatchBitmaskType4;
      MatchBitmaskType localMatchBitmaskType5 = new MatchBitmaskType("HINT", 4, 16);
      HINT = localMatchBitmaskType5;
      $VALUES = new MatchBitmaskType[] { localMatchBitmaskType1, localMatchBitmaskType2, localMatchBitmaskType3, localMatchBitmaskType4, localMatchBitmaskType5 };
    }
    
    private MatchBitmaskType(int paramInt)
    {
      value = paramInt;
    }
    
    public int getValue()
    {
      return value;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.internal.PathComponent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */