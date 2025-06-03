package u1;

import A.g;
import A.g.b;
import android.animation.Animator;
import android.animation.AnimatorInflater;
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
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import z.k;

public abstract class d
{
  public static Animator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, float paramFloat)
  {
    return b(paramContext, paramResources, paramTheme, paramXmlPullParser, Xml.asAttributeSet(paramXmlPullParser), null, 0, paramFloat);
  }
  
  public static Animator b(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, AnimatorSet paramAnimatorSet, int paramInt, float paramFloat)
  {
    int i = paramXmlPullParser.getDepth();
    Object localObject1 = null;
    Object localObject2 = null;
    int k;
    int m;
    for (;;)
    {
      int j = paramXmlPullParser.next();
      k = 0;
      m = 0;
      if (((j == 3) && (paramXmlPullParser.getDepth() <= i)) || (j == 1)) {
        break label330;
      }
      if (j == 2)
      {
        Object localObject3 = paramXmlPullParser.getName();
        if (((String)localObject3).equals("objectAnimator")) {
          localObject3 = n(paramContext, paramResources, paramTheme, paramAttributeSet, paramFloat, paramXmlPullParser);
        }
        for (;;)
        {
          break;
          if (((String)localObject3).equals("animator"))
          {
            localObject3 = l(paramContext, paramResources, paramTheme, paramAttributeSet, null, paramFloat, paramXmlPullParser);
          }
          else if (((String)localObject3).equals("set"))
          {
            localObject3 = new AnimatorSet();
            localObject1 = k.k(paramResources, paramTheme, paramAttributeSet, a.h);
            b(paramContext, paramResources, paramTheme, paramXmlPullParser, paramAttributeSet, (AnimatorSet)localObject3, k.g((TypedArray)localObject1, paramXmlPullParser, "ordering", 0, 0), paramFloat);
            ((TypedArray)localObject1).recycle();
          }
          else
          {
            if (!((String)localObject3).equals("propertyValuesHolder")) {
              break label292;
            }
            localObject3 = p(paramContext, paramResources, paramTheme, paramXmlPullParser, Xml.asAttributeSet(paramXmlPullParser));
            if ((localObject3 != null) && ((localObject1 instanceof ValueAnimator))) {
              ((ValueAnimator)localObject1).setValues((PropertyValuesHolder[])localObject3);
            }
            m = 1;
            localObject3 = localObject1;
          }
        }
        localObject1 = localObject3;
        if (paramAnimatorSet != null)
        {
          localObject1 = localObject3;
          if (m == 0)
          {
            Object localObject4 = localObject2;
            if (localObject2 == null) {
              localObject4 = new ArrayList();
            }
            ((ArrayList)localObject4).add(localObject3);
            localObject1 = localObject3;
            localObject2 = localObject4;
          }
        }
      }
    }
    label292:
    paramContext = new StringBuilder();
    paramContext.append("Unknown animator name: ");
    paramContext.append(paramXmlPullParser.getName());
    throw new RuntimeException(paramContext.toString());
    label330:
    if ((paramAnimatorSet != null) && (localObject2 != null))
    {
      paramContext = new Animator[((ArrayList)localObject2).size()];
      paramResources = ((ArrayList)localObject2).iterator();
      for (m = k; paramResources.hasNext(); m++) {
        paramContext[m] = ((Animator)paramResources.next());
      }
      if (paramInt == 0) {
        paramAnimatorSet.playTogether(paramContext);
      } else {
        paramAnimatorSet.playSequentially(paramContext);
      }
    }
    return (Animator)localObject1;
  }
  
  public static Keyframe c(Keyframe paramKeyframe, float paramFloat)
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
  
  public static void d(Keyframe[] paramArrayOfKeyframe, float paramFloat, int paramInt1, int paramInt2)
  {
    paramFloat /= (paramInt2 - paramInt1 + 2);
    while (paramInt1 <= paramInt2)
    {
      paramArrayOfKeyframe[paramInt1].setFraction(paramArrayOfKeyframe[(paramInt1 - 1)].getFraction() + paramFloat);
      paramInt1++;
    }
  }
  
  public static PropertyValuesHolder e(TypedArray paramTypedArray, int paramInt1, int paramInt2, int paramInt3, String paramString)
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
      if (((i != 0) && (h(j))) || ((k != 0) && (h(m)))) {
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
    String str = null;
    Object localObject2;
    if (n == 2)
    {
      localObject2 = paramTypedArray.getString(paramInt2);
      str = paramTypedArray.getString(paramInt3);
      g.b[] arrayOfb1 = g.d((String)localObject2);
      g.b[] arrayOfb2 = g.d(str);
      if (arrayOfb1 == null)
      {
        paramTypedArray = (TypedArray)localObject1;
        if (arrayOfb2 == null) {}
      }
      else
      {
        if (arrayOfb1 != null)
        {
          paramTypedArray = new a();
          if (arrayOfb2 != null) {
            if (!g.b(arrayOfb1, arrayOfb2)) {}
          }
          for (paramTypedArray = PropertyValuesHolder.ofObject(paramString, paramTypedArray, new Object[] { arrayOfb1, arrayOfb2 });; paramTypedArray = PropertyValuesHolder.ofObject(paramString, paramTypedArray, new Object[] { arrayOfb1 }))
          {
            break;
            paramTypedArray = new StringBuilder();
            paramTypedArray.append(" Can't morph from ");
            paramTypedArray.append((String)localObject2);
            paramTypedArray.append(" to ");
            paramTypedArray.append(str);
            throw new InflateException(paramTypedArray.toString());
          }
        }
        paramTypedArray = (TypedArray)localObject1;
        if (arrayOfb2 != null) {
          paramTypedArray = PropertyValuesHolder.ofObject(paramString, new a(), new Object[] { arrayOfb2 });
        }
      }
    }
    else
    {
      if (n == 3) {
        localObject2 = e.a();
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
        }
        for (;;)
        {
          localObject1 = paramTypedArray;
          break;
          paramTypedArray = PropertyValuesHolder.ofFloat(paramString, new float[] { f1 });
          continue;
          if (m == 5) {
            f1 = paramTypedArray.getDimension(paramInt3, 0.0F);
          } else {
            f1 = paramTypedArray.getFloat(paramInt3, 0.0F);
          }
          paramTypedArray = PropertyValuesHolder.ofFloat(paramString, new float[] { f1 });
        }
      }
      if (i != 0)
      {
        if (j == 5) {
          paramInt1 = (int)paramTypedArray.getDimension(paramInt2, 0.0F);
        } else if (h(j)) {
          paramInt1 = paramTypedArray.getColor(paramInt2, 0);
        } else {
          paramInt1 = paramTypedArray.getInt(paramInt2, 0);
        }
        if (k != 0)
        {
          if (m == 5) {
            paramInt2 = (int)paramTypedArray.getDimension(paramInt3, 0.0F);
          } else if (h(m)) {
            paramInt2 = paramTypedArray.getColor(paramInt3, 0);
          } else {
            paramInt2 = paramTypedArray.getInt(paramInt3, 0);
          }
          localObject1 = PropertyValuesHolder.ofInt(paramString, new int[] { paramInt1, paramInt2 });
        }
        else
        {
          localObject1 = PropertyValuesHolder.ofInt(paramString, new int[] { paramInt1 });
        }
      }
      else
      {
        localObject1 = str;
        if (k != 0)
        {
          if (m == 5) {
            paramInt1 = (int)paramTypedArray.getDimension(paramInt3, 0.0F);
          } else if (h(m)) {
            paramInt1 = paramTypedArray.getColor(paramInt3, 0);
          } else {
            paramInt1 = paramTypedArray.getInt(paramInt3, 0);
          }
          localObject1 = PropertyValuesHolder.ofInt(paramString, new int[] { paramInt1 });
        }
      }
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
  
  public static int f(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    TypedValue localTypedValue = paramTypedArray.peekValue(paramInt1);
    int i = 1;
    int j = 0;
    if (localTypedValue != null) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    int k;
    if (paramInt1 != 0) {
      k = type;
    } else {
      k = 0;
    }
    paramTypedArray = paramTypedArray.peekValue(paramInt2);
    if (paramTypedArray != null) {
      paramInt2 = i;
    } else {
      paramInt2 = 0;
    }
    if (paramInt2 != 0) {
      i = type;
    } else {
      i = 0;
    }
    if ((paramInt1 == 0) || (!h(k)))
    {
      paramInt1 = j;
      if (paramInt2 != 0)
      {
        paramInt1 = j;
        if (!h(i)) {}
      }
    }
    else
    {
      paramInt1 = 3;
    }
    return paramInt1;
  }
  
  public static int g(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, XmlPullParser paramXmlPullParser)
  {
    paramResources = k.k(paramResources, paramTheme, paramAttributeSet, a.j);
    int i = 0;
    paramTheme = k.l(paramResources, paramXmlPullParser, "value", 0);
    int j = i;
    if (paramTheme != null)
    {
      j = i;
      if (h(type)) {
        j = 3;
      }
    }
    paramResources.recycle();
    return j;
  }
  
  public static boolean h(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 28) && (paramInt <= 31)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static Animator i(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      paramContext = AnimatorInflater.loadAnimator(paramContext, paramInt);
    } else {
      paramContext = j(paramContext, paramContext.getResources(), paramContext.getTheme(), paramInt);
    }
    return paramContext;
  }
  
  public static Animator j(Context paramContext, Resources paramResources, Resources.Theme paramTheme, int paramInt)
  {
    return k(paramContext, paramResources, paramTheme, paramInt, 1.0F);
  }
  
  /* Error */
  public static Animator k(Context paramContext, Resources paramResources, Resources.Theme paramTheme, int paramInt, float paramFloat)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: aconst_null
    //   7: astore 7
    //   9: aload_1
    //   10: iload_3
    //   11: invokevirtual 296	android/content/res/Resources:getAnimation	(I)Landroid/content/res/XmlResourceParser;
    //   14: astore 8
    //   16: aload 8
    //   18: astore 7
    //   20: aload 8
    //   22: astore 5
    //   24: aload 8
    //   26: astore 6
    //   28: aload_0
    //   29: aload_1
    //   30: aload_2
    //   31: aload 8
    //   33: fload 4
    //   35: invokestatic 298	u1/d:a	(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;F)Landroid/animation/Animator;
    //   38: astore_0
    //   39: aload 8
    //   41: ifnull +10 -> 51
    //   44: aload 8
    //   46: invokeinterface 303 1 0
    //   51: aload_0
    //   52: areturn
    //   53: astore_0
    //   54: goto +165 -> 219
    //   57: astore_1
    //   58: goto +7 -> 65
    //   61: astore_2
    //   62: goto +80 -> 142
    //   65: aload 5
    //   67: astore 7
    //   69: new 305	android/content/res/Resources$NotFoundException
    //   72: astore_2
    //   73: aload 5
    //   75: astore 7
    //   77: new 101	java/lang/StringBuilder
    //   80: astore_0
    //   81: aload 5
    //   83: astore 7
    //   85: aload_0
    //   86: invokespecial 102	java/lang/StringBuilder:<init>	()V
    //   89: aload 5
    //   91: astore 7
    //   93: aload_0
    //   94: ldc_w 307
    //   97: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload 5
    //   103: astore 7
    //   105: aload_0
    //   106: iload_3
    //   107: invokestatic 310	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   110: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload 5
    //   116: astore 7
    //   118: aload_2
    //   119: aload_0
    //   120: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: invokespecial 311	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   126: aload 5
    //   128: astore 7
    //   130: aload_2
    //   131: aload_1
    //   132: invokevirtual 317	java/lang/Throwable:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   135: pop
    //   136: aload 5
    //   138: astore 7
    //   140: aload_2
    //   141: athrow
    //   142: aload 6
    //   144: astore 7
    //   146: new 305	android/content/res/Resources$NotFoundException
    //   149: astore_1
    //   150: aload 6
    //   152: astore 7
    //   154: new 101	java/lang/StringBuilder
    //   157: astore_0
    //   158: aload 6
    //   160: astore 7
    //   162: aload_0
    //   163: invokespecial 102	java/lang/StringBuilder:<init>	()V
    //   166: aload 6
    //   168: astore 7
    //   170: aload_0
    //   171: ldc_w 307
    //   174: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: aload 6
    //   180: astore 7
    //   182: aload_0
    //   183: iload_3
    //   184: invokestatic 310	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   187: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: pop
    //   191: aload 6
    //   193: astore 7
    //   195: aload_1
    //   196: aload_0
    //   197: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   200: invokespecial 311	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   203: aload 6
    //   205: astore 7
    //   207: aload_1
    //   208: aload_2
    //   209: invokevirtual 317	java/lang/Throwable:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   212: pop
    //   213: aload 6
    //   215: astore 7
    //   217: aload_1
    //   218: athrow
    //   219: aload 7
    //   221: ifnull +10 -> 231
    //   224: aload 7
    //   226: invokeinterface 303 1 0
    //   231: aload_0
    //   232: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	233	0	paramContext	Context
    //   0	233	1	paramResources	Resources
    //   0	233	2	paramTheme	Resources.Theme
    //   0	233	3	paramInt	int
    //   0	233	4	paramFloat	float
    //   1	136	5	localObject1	Object
    //   4	210	6	localObject2	Object
    //   7	218	7	localObject3	Object
    //   14	31	8	localXmlResourceParser	android.content.res.XmlResourceParser
    // Exception table:
    //   from	to	target	type
    //   9	16	53	finally
    //   28	39	53	finally
    //   69	73	53	finally
    //   77	81	53	finally
    //   85	89	53	finally
    //   93	101	53	finally
    //   105	114	53	finally
    //   118	126	53	finally
    //   130	136	53	finally
    //   140	142	53	finally
    //   146	150	53	finally
    //   154	158	53	finally
    //   162	166	53	finally
    //   170	178	53	finally
    //   182	191	53	finally
    //   195	203	53	finally
    //   207	213	53	finally
    //   217	219	53	finally
    //   9	16	57	java/io/IOException
    //   28	39	57	java/io/IOException
    //   9	16	61	org/xmlpull/v1/XmlPullParserException
    //   28	39	61	org/xmlpull/v1/XmlPullParserException
  }
  
  public static ValueAnimator l(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, ValueAnimator paramValueAnimator, float paramFloat, XmlPullParser paramXmlPullParser)
  {
    TypedArray localTypedArray = k.k(paramResources, paramTheme, paramAttributeSet, a.g);
    paramTheme = k.k(paramResources, paramTheme, paramAttributeSet, a.k);
    paramResources = paramValueAnimator;
    if (paramValueAnimator == null) {
      paramResources = new ValueAnimator();
    }
    q(paramResources, localTypedArray, paramTheme, paramFloat, paramXmlPullParser);
    int i = k.h(localTypedArray, paramXmlPullParser, "interpolator", 0, 0);
    if (i > 0) {
      paramResources.setInterpolator(c.a(paramContext, i));
    }
    localTypedArray.recycle();
    if (paramTheme != null) {
      paramTheme.recycle();
    }
    return paramResources;
  }
  
  public static Keyframe m(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int paramInt, XmlPullParser paramXmlPullParser)
  {
    paramTheme = k.k(paramResources, paramTheme, paramAttributeSet, a.j);
    float f = k.f(paramTheme, paramXmlPullParser, "fraction", 3, -1.0F);
    paramResources = k.l(paramTheme, paramXmlPullParser, "value", 0);
    int i;
    if (paramResources != null) {
      i = 1;
    } else {
      i = 0;
    }
    int j = paramInt;
    if (paramInt == 4) {
      if ((i != 0) && (h(type))) {
        j = 3;
      } else {
        j = 0;
      }
    }
    if (i != 0)
    {
      if (j != 0)
      {
        if ((j != 1) && (j != 3)) {
          paramResources = null;
        } else {
          paramResources = Keyframe.ofInt(f, k.g(paramTheme, paramXmlPullParser, "value", 0, 0));
        }
      }
      else {
        paramResources = Keyframe.ofFloat(f, k.f(paramTheme, paramXmlPullParser, "value", 0, 0.0F));
      }
    }
    else if (j == 0) {
      paramResources = Keyframe.ofFloat(f);
    } else {
      paramResources = Keyframe.ofInt(f);
    }
    paramInt = k.h(paramTheme, paramXmlPullParser, "interpolator", 1, 0);
    if (paramInt > 0) {
      paramResources.setInterpolator(c.a(paramContext, paramInt));
    }
    paramTheme.recycle();
    return paramResources;
  }
  
  public static ObjectAnimator n(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, float paramFloat, XmlPullParser paramXmlPullParser)
  {
    ObjectAnimator localObjectAnimator = new ObjectAnimator();
    l(paramContext, paramResources, paramTheme, paramAttributeSet, localObjectAnimator, paramFloat, paramXmlPullParser);
    return localObjectAnimator;
  }
  
  public static PropertyValuesHolder o(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, String paramString, int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i = paramInt;
    for (;;)
    {
      paramInt = paramXmlPullParser.next();
      if ((paramInt == 3) || (paramInt == 1)) {
        break;
      }
      if (paramXmlPullParser.getName().equals("keyframe"))
      {
        paramInt = i;
        if (i == 4) {
          paramInt = g(paramResources, paramTheme, Xml.asAttributeSet(paramXmlPullParser), paramXmlPullParser);
        }
        Keyframe localKeyframe = m(paramContext, paramResources, paramTheme, Xml.asAttributeSet(paramXmlPullParser), paramInt, paramXmlPullParser);
        Object localObject3 = localObject2;
        if (localKeyframe != null)
        {
          localObject3 = localObject2;
          if (localObject2 == null) {
            localObject3 = new ArrayList();
          }
          ((ArrayList)localObject3).add(localKeyframe);
        }
        paramXmlPullParser.next();
        localObject2 = localObject3;
        i = paramInt;
      }
    }
    paramContext = (Context)localObject1;
    if (localObject2 != null)
    {
      int j = ((ArrayList)localObject2).size();
      paramContext = (Context)localObject1;
      if (j > 0)
      {
        int k = 0;
        paramContext = (Keyframe)((ArrayList)localObject2).get(0);
        paramResources = (Keyframe)((ArrayList)localObject2).get(j - 1);
        float f = paramResources.getFraction();
        paramInt = j;
        if (f < 1.0F) {
          if (f < 0.0F)
          {
            paramResources.setFraction(1.0F);
            paramInt = j;
          }
          else
          {
            ((ArrayList)localObject2).add(((ArrayList)localObject2).size(), c(paramResources, 1.0F));
            paramInt = j + 1;
          }
        }
        f = paramContext.getFraction();
        j = paramInt;
        if (f != 0.0F) {
          if (f < 0.0F)
          {
            paramContext.setFraction(0.0F);
            j = paramInt;
          }
          else
          {
            ((ArrayList)localObject2).add(0, c(paramContext, 0.0F));
            j = paramInt + 1;
          }
        }
        paramContext = new Keyframe[j];
        ((ArrayList)localObject2).toArray(paramContext);
        for (paramInt = k; paramInt < j; paramInt++)
        {
          paramResources = paramContext[paramInt];
          if (paramResources.getFraction() < 0.0F) {
            if (paramInt == 0)
            {
              paramResources.setFraction(0.0F);
            }
            else
            {
              int m = j - 1;
              if (paramInt == m)
              {
                paramResources.setFraction(1.0F);
              }
              else
              {
                k = paramInt + 1;
                int n = paramInt;
                while ((k < m) && (paramContext[k].getFraction() < 0.0F))
                {
                  n = k;
                  k++;
                }
                d(paramContext, paramContext[(n + 1)].getFraction() - paramContext[(paramInt - 1)].getFraction(), paramInt, n);
              }
            }
          }
        }
        paramResources = PropertyValuesHolder.ofKeyframe(paramString, paramContext);
        paramContext = paramResources;
        if (i == 3)
        {
          paramResources.setEvaluator(e.a());
          paramContext = paramResources;
        }
      }
    }
    return paramContext;
  }
  
  public static PropertyValuesHolder[] p(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i = paramXmlPullParser.getEventType();
    int j = 0;
    if ((i != 3) && (i != 1))
    {
      if (i != 2) {}
      for (;;)
      {
        paramXmlPullParser.next();
        break;
        if (paramXmlPullParser.getName().equals("propertyValuesHolder"))
        {
          TypedArray localTypedArray = k.k(paramResources, paramTheme, paramAttributeSet, a.i);
          String str = k.i(localTypedArray, paramXmlPullParser, "propertyName", 3);
          j = k.g(localTypedArray, paramXmlPullParser, "valueType", 2, 4);
          Object localObject3 = o(paramContext, paramResources, paramTheme, paramXmlPullParser, str, j);
          Object localObject4 = localObject3;
          if (localObject3 == null) {
            localObject4 = e(localTypedArray, j, 0, 1, str);
          }
          localObject3 = localObject2;
          if (localObject4 != null)
          {
            localObject3 = localObject2;
            if (localObject2 == null) {
              localObject3 = new ArrayList();
            }
            ((ArrayList)localObject3).add(localObject4);
          }
          localTypedArray.recycle();
          localObject2 = localObject3;
        }
      }
    }
    paramContext = (Context)localObject1;
    if (localObject2 != null)
    {
      i = ((ArrayList)localObject2).size();
      paramResources = new PropertyValuesHolder[i];
      for (;;)
      {
        paramContext = paramResources;
        if (j >= i) {
          break;
        }
        paramResources[j] = ((PropertyValuesHolder)((ArrayList)localObject2).get(j));
        j++;
      }
    }
    return paramContext;
  }
  
  public static void q(ValueAnimator paramValueAnimator, TypedArray paramTypedArray1, TypedArray paramTypedArray2, float paramFloat, XmlPullParser paramXmlPullParser)
  {
    long l1 = k.g(paramTypedArray1, paramXmlPullParser, "duration", 1, 300);
    long l2 = k.g(paramTypedArray1, paramXmlPullParser, "startOffset", 2, 0);
    int i = k.g(paramTypedArray1, paramXmlPullParser, "valueType", 7, 4);
    int j = i;
    if (k.j(paramXmlPullParser, "valueFrom"))
    {
      j = i;
      if (k.j(paramXmlPullParser, "valueTo"))
      {
        int k = i;
        if (i == 4) {
          k = f(paramTypedArray1, 5, 6);
        }
        PropertyValuesHolder localPropertyValuesHolder = e(paramTypedArray1, k, 5, 6, "");
        j = k;
        if (localPropertyValuesHolder != null)
        {
          paramValueAnimator.setValues(new PropertyValuesHolder[] { localPropertyValuesHolder });
          j = k;
        }
      }
    }
    paramValueAnimator.setDuration(l1);
    paramValueAnimator.setStartDelay(l2);
    paramValueAnimator.setRepeatCount(k.g(paramTypedArray1, paramXmlPullParser, "repeatCount", 3, 0));
    paramValueAnimator.setRepeatMode(k.g(paramTypedArray1, paramXmlPullParser, "repeatMode", 4, 1));
    if (paramTypedArray2 != null) {
      r(paramValueAnimator, paramTypedArray2, j, paramFloat, paramXmlPullParser);
    }
  }
  
  public static void r(ValueAnimator paramValueAnimator, TypedArray paramTypedArray, int paramInt, float paramFloat, XmlPullParser paramXmlPullParser)
  {
    paramValueAnimator = (ObjectAnimator)paramValueAnimator;
    String str1 = k.i(paramTypedArray, paramXmlPullParser, "pathData", 1);
    if (str1 != null)
    {
      String str2 = k.i(paramTypedArray, paramXmlPullParser, "propertyXName", 2);
      paramXmlPullParser = k.i(paramTypedArray, paramXmlPullParser, "propertyYName", 3);
      if ((paramInt == 2) || ((str2 == null) && (paramXmlPullParser == null)))
      {
        paramValueAnimator = new StringBuilder();
        paramValueAnimator.append(paramTypedArray.getPositionDescription());
        paramValueAnimator.append(" propertyXName or propertyYName is needed for PathData");
        throw new InflateException(paramValueAnimator.toString());
      }
      s(g.e(str1), paramValueAnimator, paramFloat * 0.5F, str2, paramXmlPullParser);
    }
    else
    {
      paramValueAnimator.setPropertyName(k.i(paramTypedArray, paramXmlPullParser, "propertyName", 0));
    }
  }
  
  public static void s(Path paramPath, ObjectAnimator paramObjectAnimator, float paramFloat, String paramString1, String paramString2)
  {
    PathMeasure localPathMeasure1 = new PathMeasure(paramPath, false);
    ArrayList localArrayList = new ArrayList();
    float f1 = 0.0F;
    localArrayList.add(Float.valueOf(0.0F));
    float f2 = 0.0F;
    float f3;
    do
    {
      f3 = f2 + localPathMeasure1.getLength();
      localArrayList.add(Float.valueOf(f3));
      f2 = f3;
    } while (localPathMeasure1.nextContour());
    PathMeasure localPathMeasure2 = new PathMeasure(paramPath, false);
    int i = Math.min(100, (int)(f3 / paramFloat) + 1);
    paramPath = new float[i];
    float[] arrayOfFloat1 = new float[i];
    float[] arrayOfFloat2 = new float[2];
    f2 = f3 / (i - 1);
    int j = 0;
    int k = j;
    paramFloat = f1;
    for (;;)
    {
      localPathMeasure1 = null;
      if (j >= i) {
        break;
      }
      localPathMeasure2.getPosTan(paramFloat - ((Float)localArrayList.get(k)).floatValue(), arrayOfFloat2, null);
      paramPath[j] = arrayOfFloat2[0];
      arrayOfFloat1[j] = arrayOfFloat2[1];
      paramFloat += f2;
      int m = k + 1;
      int n = k;
      if (m < localArrayList.size())
      {
        n = k;
        if (paramFloat > ((Float)localArrayList.get(m)).floatValue())
        {
          localPathMeasure2.nextContour();
          n = m;
        }
      }
      j++;
      k = n;
    }
    if (paramString1 != null) {
      paramPath = PropertyValuesHolder.ofFloat(paramString1, paramPath);
    } else {
      paramPath = null;
    }
    paramString1 = localPathMeasure1;
    if (paramString2 != null) {
      paramString1 = PropertyValuesHolder.ofFloat(paramString2, arrayOfFloat1);
    }
    if (paramPath == null) {
      paramObjectAnimator.setValues(new PropertyValuesHolder[] { paramString1 });
    } else if (paramString1 == null) {
      paramObjectAnimator.setValues(new PropertyValuesHolder[] { paramPath });
    } else {
      paramObjectAnimator.setValues(new PropertyValuesHolder[] { paramPath, paramString1 });
    }
  }
  
  public static class a
    implements TypeEvaluator
  {
    public g.b[] a;
    
    public g.b[] a(float paramFloat, g.b[] paramArrayOfb1, g.b[] paramArrayOfb2)
    {
      if (g.b(paramArrayOfb1, paramArrayOfb2))
      {
        if (!g.b(a, paramArrayOfb1)) {
          a = g.f(paramArrayOfb1);
        }
        for (int i = 0; i < paramArrayOfb1.length; i++) {
          a[i].d(paramArrayOfb1[i], paramArrayOfb2[i], paramFloat);
        }
        return a;
      }
      throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
  }
}

/* Location:
 * Qualified Name:     u1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */