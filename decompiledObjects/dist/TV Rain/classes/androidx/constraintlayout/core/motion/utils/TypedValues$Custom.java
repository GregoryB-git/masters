package androidx.constraintlayout.core.motion.utils;

public abstract interface TypedValues$Custom
{
  public static final String[] KEY_WORDS = { "float", "color", "string", "boolean", "dimension", "refrence" };
  public static final String NAME = "Custom";
  public static final String S_BOOLEAN = "boolean";
  public static final String S_COLOR = "color";
  public static final String S_DIMENSION = "dimension";
  public static final String S_FLOAT = "float";
  public static final String S_INT = "integer";
  public static final String S_REFERENCE = "refrence";
  public static final String S_STRING = "string";
  public static final int TYPE_BOOLEAN = 904;
  public static final int TYPE_COLOR = 902;
  public static final int TYPE_DIMENSION = 905;
  public static final int TYPE_FLOAT = 901;
  public static final int TYPE_INT = 900;
  public static final int TYPE_REFERENCE = 906;
  public static final int TYPE_STRING = 903;
  
  public static int getId(String paramString)
  {
    paramString.getClass();
    switch (paramString.hashCode())
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  i = -1;
                  break;
                } while (!paramString.equals("integer"));
                i = 6;
                break;
              } while (!paramString.equals("float"));
              i = 5;
              break;
            } while (!paramString.equals("color"));
            i = 4;
            break;
          } while (!paramString.equals("boolean"));
          i = 3;
          break;
        } while (!paramString.equals("refrence"));
        i = 2;
        break;
      } while (!paramString.equals("string"));
      i = 1;
      break;
    } while (!paramString.equals("dimension"));
    int i = 0;
    switch (i)
    {
    default: 
      return -1;
    case 6: 
      return 900;
    case 5: 
      return 901;
    case 4: 
      return 902;
    case 3: 
      return 904;
    case 2: 
      return 906;
    case 1: 
      return 903;
    }
    return 905;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TypedValues.Custom
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */