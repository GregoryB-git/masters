package a2;

import a0.j;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import f;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import w.k;
import x.d.a;

public final class c
{
  public static Animator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, AnimatorSet paramAnimatorSet, int paramInt)
  {
    int i = paramXmlResourceParser.getDepth();
    Object localObject1 = null;
    Object localObject2 = null;
    int m;
    for (;;)
    {
      int j = paramXmlResourceParser.next();
      int k = 3;
      m = 0;
      int n = 0;
      if (((j == 3) && (paramXmlResourceParser.getDepth() <= i)) || (j == 1)) {
        break label1486;
      }
      int i1 = 2;
      if (j == 2)
      {
        Object localObject3 = paramXmlResourceParser.getName();
        if (((String)localObject3).equals("objectAnimator"))
        {
          localObject3 = new ObjectAnimator();
          e(paramContext, paramResources, paramTheme, paramAttributeSet, (ObjectAnimator)localObject3, paramXmlResourceParser);
        }
        else
        {
          if (!((String)localObject3).equals("animator")) {
            break label133;
          }
          localObject3 = e(paramContext, paramResources, paramTheme, paramAttributeSet, null, paramXmlResourceParser);
        }
        break label1402;
        label133:
        if (((String)localObject3).equals("set"))
        {
          localObject3 = new AnimatorSet();
          localObject4 = k.f(paramResources, paramTheme, paramAttributeSet, a.h);
          a(paramContext, paramResources, paramTheme, paramXmlResourceParser, paramAttributeSet, (AnimatorSet)localObject3, k.c((TypedArray)localObject4, paramXmlResourceParser, "ordering", 0, 0));
          ((TypedArray)localObject4).recycle();
        }
        else
        {
          String str1 = "propertyValuesHolder";
          if (!((String)localObject3).equals("propertyValuesHolder")) {
            break;
          }
          AttributeSet localAttributeSet = Xml.asAttributeSet(paramXmlResourceParser);
          localObject4 = null;
          m = 1;
          n = 0;
          for (;;)
          {
            j = paramXmlResourceParser.getEventType();
            if ((j == k) || (j == m)) {
              break;
            }
            if (j != i1)
            {
              paramXmlResourceParser.next();
            }
            else
            {
              if (paramXmlResourceParser.getName().equals(str1))
              {
                TypedArray localTypedArray1 = k.f(paramResources, paramTheme, localAttributeSet, a.i);
                String str2 = k.d(localTypedArray1, paramXmlResourceParser, "propertyName", k);
                int i2 = k.c(localTypedArray1, paramXmlResourceParser, "valueType", i1, 4);
                localObject5 = null;
                n = i2;
                m = i;
                Object localObject6;
                float f1;
                for (;;)
                {
                  localObject6 = paramTheme;
                  Resources localResources = paramResources;
                  i = paramXmlResourceParser.next();
                  if ((i == k) || (i == 1)) {
                    break;
                  }
                  if (paramXmlResourceParser.getName().equals("keyframe"))
                  {
                    i = n;
                    if (n == 4)
                    {
                      TypedArray localTypedArray2 = k.f(localResources, (Resources.Theme)localObject6, Xml.asAttributeSet(paramXmlResourceParser), a.j);
                      if (!k.e(paramXmlResourceParser, "value")) {
                        localObject3 = null;
                      } else {
                        localObject3 = localTypedArray2.peekValue(0);
                      }
                      if (localObject3 != null) {
                        i = 1;
                      } else {
                        i = 0;
                      }
                      if ((i != 0) && (d(type))) {
                        i = k;
                      } else {
                        i = 0;
                      }
                      localTypedArray2.recycle();
                    }
                    localObject6 = k.f(localResources, (Resources.Theme)localObject6, Xml.asAttributeSet(paramXmlResourceParser), a.j);
                    f1 = k.b((TypedArray)localObject6, paramXmlResourceParser, "fraction", 3, -1.0F);
                    if (!k.e(paramXmlResourceParser, "value")) {
                      localObject3 = null;
                    } else {
                      localObject3 = ((TypedArray)localObject6).peekValue(0);
                    }
                    if (localObject3 != null) {
                      k = 1;
                    } else {
                      k = 0;
                    }
                    if (i == 4)
                    {
                      if ((k != 0) && (d(type))) {
                        n = 3;
                      } else {
                        n = 0;
                      }
                    }
                    else {
                      n = i;
                    }
                    if (k != 0)
                    {
                      if (n != 0)
                      {
                        if ((n != 1) && (n != 3)) {
                          localObject3 = null;
                        } else {
                          localObject3 = Keyframe.ofInt(f1, k.c((TypedArray)localObject6, paramXmlResourceParser, "value", 0, 0));
                        }
                      }
                      else {
                        localObject3 = Keyframe.ofFloat(f1, k.b((TypedArray)localObject6, paramXmlResourceParser, "value", 0, 0.0F));
                      }
                    }
                    else if (n == 0) {
                      localObject3 = Keyframe.ofFloat(f1);
                    } else {
                      localObject3 = Keyframe.ofInt(f1);
                    }
                    if (!k.e(paramXmlResourceParser, "interpolator")) {
                      n = 0;
                    } else {
                      n = ((TypedArray)localObject6).getResourceId(1, 0);
                    }
                    if (n > 0) {
                      ((Keyframe)localObject3).setInterpolator(AnimationUtils.loadInterpolator(paramContext, n));
                    }
                    ((TypedArray)localObject6).recycle();
                    localObject6 = localObject5;
                    if (localObject3 != null)
                    {
                      localObject6 = localObject5;
                      if (localObject5 == null) {
                        localObject6 = new ArrayList();
                      }
                      ((ArrayList)localObject6).add(localObject3);
                    }
                    paramXmlResourceParser.next();
                    localObject5 = localObject6;
                  }
                  else
                  {
                    i = n;
                  }
                  k = 3;
                  n = i;
                }
                i1 = m;
                if (localObject5 != null)
                {
                  m = ((ArrayList)localObject5).size();
                  if (m > 0)
                  {
                    localObject6 = (Keyframe)((ArrayList)localObject5).get(0);
                    localObject3 = (Keyframe)((ArrayList)localObject5).get(m - 1);
                    f1 = ((Keyframe)localObject3).getFraction();
                    i = m;
                    if (f1 < 1.0F) {
                      if (f1 < 0.0F)
                      {
                        ((Keyframe)localObject3).setFraction(1.0F);
                        i = m;
                      }
                      else
                      {
                        ((ArrayList)localObject5).add(((ArrayList)localObject5).size(), b((Keyframe)localObject3, 1.0F));
                        i = m + 1;
                      }
                    }
                    f1 = ((Keyframe)localObject6).getFraction();
                    m = i;
                    if (f1 != 0.0F) {
                      if (f1 < 0.0F)
                      {
                        ((Keyframe)localObject6).setFraction(0.0F);
                        m = i;
                      }
                      else
                      {
                        ((ArrayList)localObject5).add(0, b((Keyframe)localObject6, 0.0F));
                        m = i + 1;
                      }
                    }
                    localObject3 = new Keyframe[m];
                    ((ArrayList)localObject5).toArray((Object[])localObject3);
                    i = 0;
                    while (i < m)
                    {
                      localObject5 = localObject3[i];
                      float f2 = ((Keyframe)localObject5).getFraction();
                      f1 = 0.0F;
                      k = m;
                      if (f2 < 0.0F)
                      {
                        if (i != 0)
                        {
                          i3 = m - 1;
                          f1 = 1.0F;
                          if (i != i3) {}
                        }
                        else
                        {
                          ((Keyframe)localObject5).setFraction(f1);
                          k = m;
                        }
                      }
                      else {
                        break label1131;
                      }
                      k = i + 1;
                      j = i;
                      while ((k < i3) && (localObject3[k].getFraction() < 0.0F))
                      {
                        j = k;
                        k++;
                      }
                      f1 = (localObject3[(j + 1)].getFraction() - localObject3[(i - 1)].getFraction()) / (j - i + 2);
                      for (int i3 = i;; i3++)
                      {
                        k = m;
                        if (i3 > j) {
                          break;
                        }
                        localObject3[i3].setFraction(localObject3[(i3 - 1)].getFraction() + f1);
                      }
                      label1131:
                      i++;
                      m = k;
                    }
                    localObject5 = PropertyValuesHolder.ofKeyframe(str2, (Keyframe[])localObject3);
                    localObject3 = localObject5;
                    if (n != 3) {
                      break label1178;
                    }
                    ((PropertyValuesHolder)localObject5).setEvaluator(d.a);
                    localObject3 = localObject5;
                    break label1178;
                  }
                }
                localObject3 = null;
                label1178:
                localObject5 = localObject3;
                if (localObject3 == null) {
                  localObject5 = c(localTypedArray1, i2, 0, 1, str2);
                }
                localObject3 = localObject4;
                if (localObject5 != null)
                {
                  localObject3 = localObject4;
                  if (localObject4 == null) {
                    localObject3 = new ArrayList();
                  }
                  ((ArrayList)localObject3).add(localObject5);
                }
                localTypedArray1.recycle();
                j = 2;
                k = 3;
                n = 0;
                m = 1;
                i = i1;
              }
              else
              {
                localObject3 = localObject4;
                j = i1;
              }
              paramXmlResourceParser.next();
              i1 = j;
              localObject4 = localObject3;
            }
          }
          k = i;
          if (localObject4 != null)
          {
            i = ((ArrayList)localObject4).size();
            localObject3 = new PropertyValuesHolder[i];
            for (;;)
            {
              localObject5 = localObject3;
              if (n >= i) {
                break;
              }
              localObject3[n] = ((PropertyValuesHolder)((ArrayList)localObject4).get(n));
              n++;
            }
          }
          Object localObject5 = null;
          localObject3 = localObject1;
          n = m;
          i = k;
          if (localObject5 != null)
          {
            localObject3 = localObject1;
            n = m;
            i = k;
            if ((localObject1 instanceof ValueAnimator))
            {
              ((ValueAnimator)localObject1).setValues((PropertyValuesHolder[])localObject5);
              i = k;
              n = m;
              localObject3 = localObject1;
            }
          }
        }
        label1402:
        Object localObject4 = localObject2;
        if (paramAnimatorSet != null)
        {
          localObject4 = localObject2;
          if (n == 0)
          {
            localObject4 = localObject2;
            if (localObject2 == null) {
              localObject4 = new ArrayList();
            }
            ((ArrayList)localObject4).add(localObject3);
          }
        }
        localObject1 = localObject3;
        localObject2 = localObject4;
      }
    }
    paramContext = f.l("Unknown animator name: ");
    paramContext.append(paramXmlResourceParser.getName());
    throw new RuntimeException(paramContext.toString());
    label1486:
    if ((paramAnimatorSet != null) && (localObject2 != null))
    {
      paramContext = new Animator[((ArrayList)localObject2).size()];
      paramResources = ((ArrayList)localObject2).iterator();
      for (i = m; paramResources.hasNext(); i++) {
        paramContext[i] = ((Animator)paramResources.next());
      }
      if (paramInt == 0) {
        paramAnimatorSet.playTogether(paramContext);
      } else {
        paramAnimatorSet.playSequentially(paramContext);
      }
    }
    return (Animator)localObject1;
  }
  
  public static Keyframe b(Keyframe paramKeyframe, float paramFloat)
  {
    if (paramKeyframe.getType() == Float.TYPE) {
      paramKeyframe = Keyframe.ofFloat(paramFloat);
    } else if (paramKeyframe.getType() == Integer.TYPE) {
      paramKeyframe = Keyframe.ofInt(paramFloat);
    } else {
      paramKeyframe = Keyframe.ofObject(paramFloat);
    }
    return paramKeyframe;
  }
  
  public static PropertyValuesHolder c(TypedArray paramTypedArray, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    Object localObject1 = paramTypedArray.peekValue(paramInt2);
    int i;
    if (localObject1 != null) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (i != 0) {
      j = type;
    } else {
      j = 0;
    }
    localObject1 = paramTypedArray.peekValue(paramInt3);
    int k;
    if (localObject1 != null) {
      k = 1;
    } else {
      k = 0;
    }
    int m;
    if (k != 0) {
      m = type;
    } else {
      m = 0;
    }
    int n = paramInt1;
    if (paramInt1 == 4) {
      if (((i != 0) && (d(j))) || ((k != 0) && (d(m)))) {
        n = 3;
      } else {
        n = 0;
      }
    }
    if (n == 0) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    localObject1 = null;
    d.a[] arrayOfa1 = null;
    Object localObject2;
    if (n == 2)
    {
      localObject2 = paramTypedArray.getString(paramInt2);
      String str = paramTypedArray.getString(paramInt3);
      d.a[] arrayOfa2 = x.d.c((String)localObject2);
      arrayOfa1 = x.d.c(str);
      if (arrayOfa2 == null)
      {
        paramTypedArray = (TypedArray)localObject1;
        if (arrayOfa1 == null) {}
      }
      else if (arrayOfa2 != null)
      {
        paramTypedArray = new a();
        if (arrayOfa1 != null)
        {
          if (x.d.a(arrayOfa2, arrayOfa1)) {
            paramTypedArray = PropertyValuesHolder.ofObject(paramString, paramTypedArray, new Object[] { arrayOfa2, arrayOfa1 });
          } else {
            throw new InflateException(j.k(" Can't morph from ", (String)localObject2, " to ", str));
          }
        }
        else {
          paramTypedArray = PropertyValuesHolder.ofObject(paramString, paramTypedArray, new Object[] { arrayOfa2 });
        }
      }
      else
      {
        paramTypedArray = (TypedArray)localObject1;
        if (arrayOfa1 != null) {
          paramTypedArray = PropertyValuesHolder.ofObject(paramString, new a(), new Object[] { arrayOfa1 });
        }
      }
    }
    else
    {
      if (n == 3) {
        localObject2 = d.a;
      } else {
        localObject2 = null;
      }
      if (paramInt1 != 0)
      {
        float f1;
        if (i != 0)
        {
          if (j == 5) {
            f1 = paramTypedArray.getDimension(paramInt2, 0.0F);
          } else {
            f1 = paramTypedArray.getFloat(paramInt2, 0.0F);
          }
          if (k != 0)
          {
            float f2;
            if (m == 5) {
              f2 = paramTypedArray.getDimension(paramInt3, 0.0F);
            } else {
              f2 = paramTypedArray.getFloat(paramInt3, 0.0F);
            }
            paramTypedArray = PropertyValuesHolder.ofFloat(paramString, new float[] { f1, f2 });
          }
          else
          {
            paramTypedArray = PropertyValuesHolder.ofFloat(paramString, new float[] { f1 });
          }
        }
        else
        {
          if (m == 5) {
            f1 = paramTypedArray.getDimension(paramInt3, 0.0F);
          } else {
            f1 = paramTypedArray.getFloat(paramInt3, 0.0F);
          }
          paramTypedArray = PropertyValuesHolder.ofFloat(paramString, new float[] { f1 });
        }
      }
      else if (i != 0)
      {
        if (j == 5) {
          paramInt1 = (int)paramTypedArray.getDimension(paramInt2, 0.0F);
        } else if (d(j)) {
          paramInt1 = paramTypedArray.getColor(paramInt2, 0);
        } else {
          paramInt1 = paramTypedArray.getInt(paramInt2, 0);
        }
        if (k != 0)
        {
          if (m == 5) {
            paramInt2 = (int)paramTypedArray.getDimension(paramInt3, 0.0F);
          } else if (d(m)) {
            paramInt2 = paramTypedArray.getColor(paramInt3, 0);
          } else {
            paramInt2 = paramTypedArray.getInt(paramInt3, 0);
          }
          paramTypedArray = PropertyValuesHolder.ofInt(paramString, new int[] { paramInt1, paramInt2 });
        }
        else
        {
          paramTypedArray = PropertyValuesHolder.ofInt(paramString, new int[] { paramInt1 });
        }
      }
      else
      {
        localObject1 = arrayOfa1;
        if (k == 0) {
          break label670;
        }
        if (m == 5) {
          paramInt1 = (int)paramTypedArray.getDimension(paramInt3, 0.0F);
        } else if (d(m)) {
          paramInt1 = paramTypedArray.getColor(paramInt3, 0);
        } else {
          paramInt1 = paramTypedArray.getInt(paramInt3, 0);
        }
        paramTypedArray = PropertyValuesHolder.ofInt(paramString, new int[] { paramInt1 });
      }
      localObject1 = paramTypedArray;
      label670:
      paramTypedArray = (TypedArray)localObject1;
      if (localObject1 != null)
      {
        paramTypedArray = (TypedArray)localObject1;
        if (localObject2 != null)
        {
          ((PropertyValuesHolder)localObject1).setEvaluator((TypeEvaluator)localObject2);
          paramTypedArray = (TypedArray)localObject1;
        }
      }
    }
    return paramTypedArray;
  }
  
  public static boolean d(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 28) && (paramInt <= 31)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static ValueAnimator e(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, ObjectAnimator paramObjectAnimator, XmlResourceParser paramXmlResourceParser)
  {
    TypedArray localTypedArray1 = k.f(paramResources, paramTheme, paramAttributeSet, a.g);
    TypedArray localTypedArray2 = k.f(paramResources, paramTheme, paramAttributeSet, a.k);
    if (paramObjectAnimator == null) {
      paramResources = new ValueAnimator();
    } else {
      paramResources = paramObjectAnimator;
    }
    long l1 = k.c(localTypedArray1, paramXmlResourceParser, "duration", 1, 300);
    int i = 0;
    long l2 = k.c(localTypedArray1, paramXmlResourceParser, "startOffset", 2, 0);
    int j = k.c(localTypedArray1, paramXmlResourceParser, "valueType", 7, 4);
    int m;
    int n;
    if ((k.e(paramXmlResourceParser, "valueFrom")) && (k.e(paramXmlResourceParser, "valueTo")))
    {
      k = j;
      if (j == 4)
      {
        paramTheme = localTypedArray1.peekValue(5);
        if (paramTheme != null) {
          k = 1;
        } else {
          k = 0;
        }
        if (k != 0) {
          j = type;
        } else {
          j = 0;
        }
        paramTheme = localTypedArray1.peekValue(6);
        if (paramTheme != null) {
          m = 1;
        } else {
          m = 0;
        }
        if (m != 0) {
          n = type;
        } else {
          n = 0;
        }
        if (((k != 0) && (d(j))) || ((m != 0) && (d(n)))) {
          k = 3;
        } else {
          k = 0;
        }
      }
      paramTheme = c(localTypedArray1, k, 5, 6, "");
      if (paramTheme != null) {
        paramResources.setValues(new PropertyValuesHolder[] { paramTheme });
      }
    }
    paramResources.setDuration(l1);
    paramResources.setStartDelay(l2);
    paramResources.setRepeatCount(k.c(localTypedArray1, paramXmlResourceParser, "repeatCount", 3, 0));
    paramResources.setRepeatMode(k.c(localTypedArray1, paramXmlResourceParser, "repeatMode", 4, 1));
    if (localTypedArray2 != null)
    {
      paramObjectAnimator = (ObjectAnimator)paramResources;
      paramAttributeSet = k.d(localTypedArray2, paramXmlResourceParser, "pathData", 1);
      if (paramAttributeSet != null)
      {
        paramTheme = k.d(localTypedArray2, paramXmlResourceParser, "propertyXName", 2);
        String str = k.d(localTypedArray2, paramXmlResourceParser, "propertyYName", 3);
        if ((paramTheme == null) && (str == null))
        {
          paramContext = new StringBuilder();
          paramContext.append(localTypedArray2.getPositionDescription());
          paramContext.append(" propertyXName or propertyYName is needed for PathData");
          throw new InflateException(paramContext.toString());
        }
        paramAttributeSet = x.d.d(paramAttributeSet);
        Object localObject = new PathMeasure(paramAttributeSet, false);
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(Float.valueOf(0.0F));
        float f1 = 0.0F;
        float f2;
        do
        {
          f2 = f1 + ((PathMeasure)localObject).getLength();
          localArrayList.add(Float.valueOf(f2));
          f1 = f2;
        } while (((PathMeasure)localObject).nextContour());
        PathMeasure localPathMeasure = new PathMeasure(paramAttributeSet, false);
        k = Math.min(100, (int)(f2 / 0.5F) + 1);
        float[] arrayOfFloat1 = new float[k];
        localObject = new float[k];
        float[] arrayOfFloat2 = new float[2];
        f2 /= (k - 1);
        m = 0;
        f1 = 0.0F;
        j = i;
        for (;;)
        {
          paramAttributeSet = null;
          if (j >= k) {
            break;
          }
          localPathMeasure.getPosTan(f1 - ((Float)localArrayList.get(m)).floatValue(), arrayOfFloat2, null);
          arrayOfFloat1[j] = arrayOfFloat2[0];
          localObject[j] = arrayOfFloat2[1];
          f1 += f2;
          i = m + 1;
          n = m;
          if (i < localArrayList.size())
          {
            n = m;
            if (f1 > ((Float)localArrayList.get(i)).floatValue())
            {
              localPathMeasure.nextContour();
              n = i;
            }
          }
          j++;
          m = n;
        }
        if (paramTheme != null) {
          paramTheme = PropertyValuesHolder.ofFloat(paramTheme, arrayOfFloat1);
        } else {
          paramTheme = null;
        }
        if (str != null) {
          paramAttributeSet = PropertyValuesHolder.ofFloat(str, (float[])localObject);
        }
        if (paramTheme == null) {
          paramObjectAnimator.setValues(new PropertyValuesHolder[] { paramAttributeSet });
        } else if (paramAttributeSet == null) {
          paramObjectAnimator.setValues(new PropertyValuesHolder[] { paramTheme });
        } else {
          paramObjectAnimator.setValues(new PropertyValuesHolder[] { paramTheme, paramAttributeSet });
        }
      }
      else
      {
        paramObjectAnimator.setPropertyName(k.d(localTypedArray2, paramXmlResourceParser, "propertyName", 0));
      }
    }
    int k = 0;
    if (k.e(paramXmlResourceParser, "interpolator")) {
      k = localTypedArray1.getResourceId(0, 0);
    }
    if (k > 0) {
      paramResources.setInterpolator(AnimationUtils.loadInterpolator(paramContext, k));
    }
    localTypedArray1.recycle();
    if (localTypedArray2 != null) {
      localTypedArray2.recycle();
    }
    return paramResources;
  }
  
  public static final class a
    implements TypeEvaluator<d.a[]>
  {
    public d.a[] a;
    
    public final Object evaluate(float paramFloat, Object paramObject1, Object paramObject2)
    {
      paramObject1 = (d.a[])paramObject1;
      d.a[] arrayOfa = (d.a[])paramObject2;
      if (x.d.a((d.a[])paramObject1, arrayOfa))
      {
        if (!x.d.a(a, (d.a[])paramObject1)) {
          a = x.d.e((d.a[])paramObject1);
        }
        for (int i = 0; i < paramObject1.length; i++)
        {
          d.a locala = a[i];
          Object localObject = paramObject1[i];
          paramObject2 = arrayOfa[i];
          locala.getClass();
          a = ((char)a);
          for (int j = 0;; j++)
          {
            float[] arrayOfFloat1 = b;
            if (j >= arrayOfFloat1.length) {
              break;
            }
            float[] arrayOfFloat2 = b;
            float f = arrayOfFloat1[j];
            arrayOfFloat2[j] = (b[j] * paramFloat + (1.0F - paramFloat) * f);
          }
        }
        return a;
      }
      throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
  }
}

/* Location:
 * Qualified Name:     a2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */