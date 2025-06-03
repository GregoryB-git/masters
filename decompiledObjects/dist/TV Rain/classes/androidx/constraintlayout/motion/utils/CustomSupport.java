package androidx.constraintlayout.motion.utils;

import a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import z2;

public class CustomSupport
{
  private static final String TAG = "CustomSupport";
  
  private static int clamp(int paramInt)
  {
    paramInt = (paramInt & paramInt >> 31) - 255;
    return (paramInt & paramInt >> 31) + 255;
  }
  
  public static void setInterpolatedValue(ConstraintAttribute paramConstraintAttribute, View paramView, float[] paramArrayOfFloat)
  {
    Object localObject1 = paramView.getClass();
    Object localObject2 = z2.t("set");
    ((StringBuilder)localObject2).append(paramConstraintAttribute.getName());
    localObject2 = ((StringBuilder)localObject2).toString();
    try
    {
      int i = 1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType[paramConstraintAttribute.getType().ordinal()];
      boolean bool = true;
      int j;
      int k;
      switch (i)
      {
      default: 
        break;
      case 7: 
        ((Class)localObject1).getMethod((String)localObject2, new Class[] { Float.TYPE }).invoke(paramView, new Object[] { Float.valueOf(paramArrayOfFloat[0]) });
        break;
      case 6: 
        paramConstraintAttribute = ((Class)localObject1).getMethod((String)localObject2, new Class[] { Boolean.TYPE });
        if (paramArrayOfFloat[0] <= 0.5F) {
          bool = false;
        }
        paramConstraintAttribute.invoke(paramView, new Object[] { Boolean.valueOf(bool) });
        break;
      case 5: 
        paramArrayOfFloat = new java/lang/RuntimeException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("unable to interpolate strings ");
        ((StringBuilder)localObject1).append(paramConstraintAttribute.getName());
        paramArrayOfFloat.<init>(((StringBuilder)localObject1).toString());
        throw paramArrayOfFloat;
      case 4: 
        paramConstraintAttribute = ((Class)localObject1).getMethod((String)localObject2, new Class[] { Integer.TYPE });
        j = clamp((int)((float)Math.pow(paramArrayOfFloat[0], 0.45454545454545453D) * 255.0F));
        i = clamp((int)((float)Math.pow(paramArrayOfFloat[1], 0.45454545454545453D) * 255.0F));
        k = clamp((int)((float)Math.pow(paramArrayOfFloat[2], 0.45454545454545453D) * 255.0F));
        paramConstraintAttribute.invoke(paramView, new Object[] { Integer.valueOf(j << 16 | clamp((int)(paramArrayOfFloat[3] * 255.0F)) << 24 | i << 8 | k) });
        break;
      case 3: 
        paramConstraintAttribute = ((Class)localObject1).getMethod((String)localObject2, new Class[] { Drawable.class });
        int m = clamp((int)((float)Math.pow(paramArrayOfFloat[0], 0.45454545454545453D) * 255.0F));
        k = clamp((int)((float)Math.pow(paramArrayOfFloat[1], 0.45454545454545453D) * 255.0F));
        j = clamp((int)((float)Math.pow(paramArrayOfFloat[2], 0.45454545454545453D) * 255.0F));
        i = clamp((int)(paramArrayOfFloat[3] * 255.0F));
        paramArrayOfFloat = new android/graphics/drawable/ColorDrawable;
        paramArrayOfFloat.<init>();
        paramArrayOfFloat.setColor(m << 16 | i << 24 | k << 8 | j);
        paramConstraintAttribute.invoke(paramView, new Object[] { paramArrayOfFloat });
        break;
      case 2: 
        ((Class)localObject1).getMethod((String)localObject2, new Class[] { Float.TYPE }).invoke(paramView, new Object[] { Float.valueOf(paramArrayOfFloat[0]) });
        break;
      case 1: 
        ((Class)localObject1).getMethod((String)localObject2, new Class[] { Integer.TYPE }).invoke(paramView, new Object[] { Integer.valueOf((int)paramArrayOfFloat[0]) });
      }
    }
    catch (InvocationTargetException paramConstraintAttribute)
    {
      paramConstraintAttribute.printStackTrace();
    }
    catch (IllegalAccessException paramConstraintAttribute)
    {
      paramArrayOfFloat = a.s("cannot access method ", (String)localObject2, " on View \"");
      paramArrayOfFloat.append(Debug.getName(paramView));
      paramArrayOfFloat.append("\"");
      Log.e("CustomSupport", paramArrayOfFloat.toString());
      paramConstraintAttribute.printStackTrace();
    }
    catch (NoSuchMethodException paramConstraintAttribute)
    {
      paramArrayOfFloat = a.s("no method ", (String)localObject2, " on View \"");
      paramArrayOfFloat.append(Debug.getName(paramView));
      paramArrayOfFloat.append("\"");
      Log.e("CustomSupport", paramArrayOfFloat.toString());
      paramConstraintAttribute.printStackTrace();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.utils.CustomSupport
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */