package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import v.a;
import w.d;
import w.d.b;
import w.f.e;
import x.e;
import x.l;
import x6.b;

public final class z0
{
  public final Context a;
  public final TypedArray b;
  public TypedValue c;
  
  public z0(Context paramContext, TypedArray paramTypedArray)
  {
    a = paramContext;
    b = paramTypedArray;
  }
  
  public static z0 m(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt, int paramInt)
  {
    return new z0(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, paramInt, 0));
  }
  
  public final boolean a(int paramInt, boolean paramBoolean)
  {
    return b.getBoolean(paramInt, paramBoolean);
  }
  
  public final ColorStateList b(int paramInt)
  {
    if (b.hasValue(paramInt))
    {
      int i = b.getResourceId(paramInt, 0);
      if (i != 0)
      {
        ColorStateList localColorStateList = a.getColorStateList(a, i);
        if (localColorStateList != null) {
          return localColorStateList;
        }
      }
    }
    return b.getColorStateList(paramInt);
  }
  
  public final int c(int paramInt1, int paramInt2)
  {
    return b.getDimensionPixelOffset(paramInt1, paramInt2);
  }
  
  public final int d(int paramInt1, int paramInt2)
  {
    return b.getDimensionPixelSize(paramInt1, paramInt2);
  }
  
  public final Drawable e(int paramInt)
  {
    if (b.hasValue(paramInt))
    {
      int i = b.getResourceId(paramInt, 0);
      if (i != 0) {
        return b.X(a, i);
      }
    }
    return b.getDrawable(paramInt);
  }
  
  public final Drawable f(int paramInt)
  {
    if (b.hasValue(paramInt))
    {
      paramInt = b.getResourceId(paramInt, 0);
      if (paramInt != 0)
      {
        j localj = j.a();
        Object localObject1 = a;
        try
        {
          localObject1 = a.g((Context)localObject1, paramInt, true);
          return (Drawable)localObject1;
        }
        finally
        {
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
      }
    }
    return null;
  }
  
  public final Typeface g(int paramInt1, int paramInt2, b0.a parama)
  {
    paramInt1 = b.getResourceId(paramInt1, 0);
    Object localObject1 = null;
    if (paramInt1 == 0) {
      return null;
    }
    if (c == null) {
      c = new TypedValue();
    }
    Context localContext = a;
    TypedValue localTypedValue = c;
    Object localObject2 = w.f.a;
    Object localObject3;
    if (localContext.isRestricted())
    {
      parama = (b0.a)localObject1;
    }
    else
    {
      localObject3 = localContext.getResources();
      ((Resources)localObject3).getValue(paramInt1, localTypedValue, true);
      localObject2 = string;
      if (localObject2 == null) {
        break label389;
      }
      String str = ((CharSequence)localObject2).toString();
      if (str.startsWith("res/"))
      {
        int i = assetCookie;
        r.f localf = e.b;
        localObject2 = (Typeface)localf.get(e.b((Resources)localObject3, paramInt1, str, i, paramInt2));
        if (localObject2 != null)
        {
          parama.b((Typeface)localObject2);
          parama = (b0.a)localObject2;
        }
        for (;;)
        {
          break label387;
          try
          {
            if (str.toLowerCase().endsWith(".xml"))
            {
              localObject2 = d.a(((Resources)localObject3).getXml(paramInt1), (Resources)localObject3);
              if (localObject2 == null)
              {
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                parama.a();
                parama = (b0.a)localObject1;
              }
              else
              {
                localObject2 = e.a(localContext, (d.b)localObject2, (Resources)localObject3, paramInt1, str, assetCookie, paramInt2, parama);
                parama = (b0.a)localObject2;
              }
            }
            else
            {
              i = assetCookie;
              localObject2 = e.a.d(localContext, (Resources)localObject3, paramInt1, str, paramInt2);
              if (localObject2 != null) {
                localf.put(e.b((Resources)localObject3, paramInt1, str, i, paramInt2), localObject2);
              }
              if (localObject2 != null)
              {
                parama.b((Typeface)localObject2);
                parama = (b0.a)localObject2;
                continue;
              }
              parama.a();
              parama = (b0.a)localObject2;
            }
          }
          catch (IOException localIOException)
          {
            localObject2 = new StringBuilder();
            localObject3 = "Failed to read xml resource ";
          }
          catch (XmlPullParserException localXmlPullParserException)
          {
            localObject2 = new StringBuilder();
            localObject3 = "Failed to parse xml resource ";
          }
        }
        ((StringBuilder)localObject2).append((String)localObject3);
        ((StringBuilder)localObject2).append(str);
        Log.e("ResourcesCompat", ((StringBuilder)localObject2).toString(), localXmlPullParserException);
      }
      parama.a();
      parama = (b0.a)localObject1;
    }
    label387:
    return parama;
    label389:
    parama = f.l("Resource \"");
    parama.append(((Resources)localObject3).getResourceName(paramInt1));
    parama.append("\" (");
    parama.append(Integer.toHexString(paramInt1));
    parama.append(") is not a Font: ");
    parama.append(localXmlPullParserException);
    throw new Resources.NotFoundException(parama.toString());
  }
  
  public final int h(int paramInt1, int paramInt2)
  {
    return b.getInt(paramInt1, paramInt2);
  }
  
  public final int i(int paramInt1, int paramInt2)
  {
    return b.getResourceId(paramInt1, paramInt2);
  }
  
  public final String j(int paramInt)
  {
    return b.getString(paramInt);
  }
  
  public final CharSequence k(int paramInt)
  {
    return b.getText(paramInt);
  }
  
  public final boolean l(int paramInt)
  {
    return b.hasValue(paramInt);
  }
  
  public final void n()
  {
    b.recycle();
  }
}

/* Location:
 * Qualified Name:     l.z0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */