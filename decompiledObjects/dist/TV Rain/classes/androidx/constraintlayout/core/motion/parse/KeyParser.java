package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLContainer;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import java.io.PrintStream;

public class KeyParser
{
  public static void main(String[] paramArrayOfString)
  {
    parseAttributes("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
  }
  
  private static TypedBundle parse(String paramString, Ids paramIds, DataType paramDataType)
  {
    localTypedBundle = new TypedBundle();
    try
    {
      paramString = CLParser.parse(paramString);
      int i = paramString.size();
      for (int j = 0; j < i; j++)
      {
        Object localObject1 = (CLKey)paramString.get(j);
        String str = ((CLElement)localObject1).content();
        localObject1 = ((CLKey)localObject1).getValue();
        int k = paramIds.get(str);
        Object localObject2;
        if (k == -1)
        {
          localObject1 = System.err;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("unknown type ");
          ((StringBuilder)localObject2).append(str);
          ((PrintStream)localObject1).println(((StringBuilder)localObject2).toString());
        }
        else
        {
          int m = paramDataType.get(k);
          if (m != 1)
          {
            Object localObject3;
            if (m != 2)
            {
              if (m != 4)
              {
                if (m == 8)
                {
                  localTypedBundle.add(k, ((CLElement)localObject1).content());
                  localObject3 = System.out;
                  localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>();
                  ((StringBuilder)localObject2).append("parse ");
                  ((StringBuilder)localObject2).append(str);
                  ((StringBuilder)localObject2).append(" STRING_MASK > ");
                  ((StringBuilder)localObject2).append(((CLElement)localObject1).content());
                  ((PrintStream)localObject3).println(((StringBuilder)localObject2).toString());
                }
              }
              else
              {
                localTypedBundle.add(k, ((CLElement)localObject1).getFloat());
                localObject2 = System.out;
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                ((StringBuilder)localObject3).append("parse ");
                ((StringBuilder)localObject3).append(str);
                ((StringBuilder)localObject3).append(" FLOAT_MASK > ");
                ((StringBuilder)localObject3).append(((CLElement)localObject1).getFloat());
                ((PrintStream)localObject2).println(((StringBuilder)localObject3).toString());
              }
            }
            else
            {
              localTypedBundle.add(k, ((CLElement)localObject1).getInt());
              localObject2 = System.out;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              ((StringBuilder)localObject3).append("parse ");
              ((StringBuilder)localObject3).append(str);
              ((StringBuilder)localObject3).append(" INT_MASK > ");
              ((StringBuilder)localObject3).append(((CLElement)localObject1).getInt());
              ((PrintStream)localObject2).println(((StringBuilder)localObject3).toString());
            }
          }
          else
          {
            localTypedBundle.add(k, paramString.getBoolean(j));
          }
        }
      }
      return localTypedBundle;
    }
    catch (CLParsingException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public static TypedBundle parseAttributes(String paramString)
  {
    return parse(paramString, new a(), new a());
  }
  
  public static abstract interface DataType
  {
    public abstract int get(int paramInt);
  }
  
  public static abstract interface Ids
  {
    public abstract int get(String paramString);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.parse.KeyParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */