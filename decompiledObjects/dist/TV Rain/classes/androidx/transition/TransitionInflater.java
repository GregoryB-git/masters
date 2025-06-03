package androidx.transition;

import a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.TypedArrayUtils;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z2;

public class TransitionInflater
{
  private static final ArrayMap<String, Constructor<?>> CONSTRUCTORS = new ArrayMap();
  private static final Class<?>[] CONSTRUCTOR_SIGNATURE = { Context.class, AttributeSet.class };
  private final Context mContext;
  
  private TransitionInflater(@NonNull Context paramContext)
  {
    mContext = paramContext;
  }
  
  private Object createCustom(AttributeSet paramAttributeSet, Class<?> paramClass, String paramString)
  {
    String str = paramAttributeSet.getAttributeValue(null, "class");
    if (str != null) {
      try
      {
        synchronized (CONSTRUCTORS)
        {
          Constructor localConstructor = (Constructor)???.get(str);
          paramString = localConstructor;
          if (localConstructor == null)
          {
            Class localClass = Class.forName(str, false, mContext.getClassLoader()).asSubclass(paramClass);
            paramString = localConstructor;
            if (localClass != null)
            {
              paramString = localClass.getConstructor(CONSTRUCTOR_SIGNATURE);
              paramString.setAccessible(true);
              ???.put(str, paramString);
            }
          }
          paramAttributeSet = paramString.newInstance(new Object[] { mContext, paramAttributeSet });
          return paramAttributeSet;
        }
        throw new InflateException(z2.o(paramString, " tag must have a 'class' attribute"));
      }
      catch (Exception paramAttributeSet)
      {
        paramString = new StringBuilder();
        paramString.append("Could not instantiate ");
        paramString.append(paramClass);
        paramString.append(" class ");
        paramString.append(str);
        throw new InflateException(paramString.toString(), paramAttributeSet);
      }
    }
  }
  
  private Transition createTransitionFromXml(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Transition paramTransition)
    throws XmlPullParserException, IOException
  {
    int i = paramXmlPullParser.getDepth();
    TransitionSet localTransitionSet;
    if ((paramTransition instanceof TransitionSet)) {
      localTransitionSet = (TransitionSet)paramTransition;
    } else {
      localTransitionSet = null;
    }
    Object localObject1 = null;
    for (;;)
    {
      int j = paramXmlPullParser.next();
      if (((j == 3) && (paramXmlPullParser.getDepth() <= i)) || (j == 1)) {
        break label630;
      }
      if (j == 2)
      {
        Object localObject2 = paramXmlPullParser.getName();
        if ("fade".equals(localObject2))
        {
          localObject2 = new Fade(mContext, paramAttributeSet);
        }
        else if ("changeBounds".equals(localObject2))
        {
          localObject2 = new ChangeBounds(mContext, paramAttributeSet);
        }
        else if ("slide".equals(localObject2))
        {
          localObject2 = new Slide(mContext, paramAttributeSet);
        }
        else if ("explode".equals(localObject2))
        {
          localObject2 = new Explode(mContext, paramAttributeSet);
        }
        else if ("changeImageTransform".equals(localObject2))
        {
          localObject2 = new ChangeImageTransform(mContext, paramAttributeSet);
        }
        else if ("changeTransform".equals(localObject2))
        {
          localObject2 = new ChangeTransform(mContext, paramAttributeSet);
        }
        else if ("changeClipBounds".equals(localObject2))
        {
          localObject2 = new ChangeClipBounds(mContext, paramAttributeSet);
        }
        else if ("autoTransition".equals(localObject2))
        {
          localObject2 = new AutoTransition(mContext, paramAttributeSet);
        }
        else if ("changeScroll".equals(localObject2))
        {
          localObject2 = new ChangeScroll(mContext, paramAttributeSet);
        }
        else if ("transitionSet".equals(localObject2))
        {
          localObject2 = new TransitionSet(mContext, paramAttributeSet);
        }
        else if ("transition".equals(localObject2))
        {
          localObject2 = (Transition)createCustom(paramAttributeSet, Transition.class, "transition");
        }
        else if ("targets".equals(localObject2))
        {
          getTargetIds(paramXmlPullParser, paramAttributeSet, paramTransition);
          localObject2 = localObject1;
        }
        else if ("arcMotion".equals(localObject2))
        {
          if (paramTransition != null)
          {
            paramTransition.setPathMotion(new ArcMotion(mContext, paramAttributeSet));
            localObject2 = localObject1;
          }
          else
          {
            throw new RuntimeException("Invalid use of arcMotion element");
          }
        }
        else if ("pathMotion".equals(localObject2))
        {
          if (paramTransition != null)
          {
            paramTransition.setPathMotion((PathMotion)createCustom(paramAttributeSet, PathMotion.class, "pathMotion"));
            localObject2 = localObject1;
          }
          else
          {
            throw new RuntimeException("Invalid use of pathMotion element");
          }
        }
        else
        {
          if (!"patternPathMotion".equals(localObject2)) {
            break label601;
          }
          if (paramTransition == null) {
            break label591;
          }
          paramTransition.setPathMotion(new PatternPathMotion(mContext, paramAttributeSet));
          localObject2 = localObject1;
        }
        localObject1 = localObject2;
        if (localObject2 != null)
        {
          if (!paramXmlPullParser.isEmptyElementTag()) {
            createTransitionFromXml(paramXmlPullParser, paramAttributeSet, (Transition)localObject2);
          }
          if (localTransitionSet != null)
          {
            localTransitionSet.addTransition((Transition)localObject2);
            break;
          }
          if (paramTransition != null) {
            break label581;
          }
          localObject1 = localObject2;
        }
      }
    }
    label581:
    throw new InflateException("Could not add transition to another transition.");
    label591:
    throw new RuntimeException("Invalid use of patternPathMotion element");
    label601:
    paramAttributeSet = z2.t("Unknown scene name: ");
    paramAttributeSet.append(paramXmlPullParser.getName());
    throw new RuntimeException(paramAttributeSet.toString());
    label630:
    return (Transition)localObject1;
  }
  
  private TransitionManager createTransitionManagerFromXml(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, ViewGroup paramViewGroup)
    throws XmlPullParserException, IOException
  {
    int i = paramXmlPullParser.getDepth();
    TransitionManager localTransitionManager = null;
    for (;;)
    {
      int j = paramXmlPullParser.next();
      if (((j == 3) && (paramXmlPullParser.getDepth() <= i)) || (j == 1)) {
        break label138;
      }
      if (j == 2)
      {
        String str = paramXmlPullParser.getName();
        if (str.equals("transitionManager"))
        {
          localTransitionManager = new TransitionManager();
        }
        else
        {
          if ((!str.equals("transition")) || (localTransitionManager == null)) {
            break;
          }
          loadTransition(paramAttributeSet, paramXmlPullParser, paramViewGroup, localTransitionManager);
        }
      }
    }
    paramAttributeSet = z2.t("Unknown scene name: ");
    paramAttributeSet.append(paramXmlPullParser.getName());
    throw new RuntimeException(paramAttributeSet.toString());
    label138:
    return localTransitionManager;
  }
  
  public static TransitionInflater from(Context paramContext)
  {
    return new TransitionInflater(paramContext);
  }
  
  @SuppressLint({"RestrictedApi"})
  private void getTargetIds(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Transition paramTransition)
    throws XmlPullParserException, IOException
  {
    int i = paramXmlPullParser.getDepth();
    for (;;)
    {
      int j = paramXmlPullParser.next();
      if (((j == 3) && (paramXmlPullParser.getDepth() <= i)) || (j == 1)) {
        return;
      }
      if (j == 2) {
        if (paramXmlPullParser.getName().equals("target"))
        {
          TypedArray localTypedArray = mContext.obtainStyledAttributes(paramAttributeSet, Styleable.TRANSITION_TARGET);
          j = TypedArrayUtils.getNamedResourceId(localTypedArray, paramXmlPullParser, "targetId", 1, 0);
          Object localObject;
          String str;
          if (j != 0)
          {
            paramTransition.addTarget(j);
          }
          else
          {
            j = TypedArrayUtils.getNamedResourceId(localTypedArray, paramXmlPullParser, "excludeId", 2, 0);
            if (j != 0)
            {
              paramTransition.excludeTarget(j, true);
            }
            else
            {
              localObject = TypedArrayUtils.getNamedString(localTypedArray, paramXmlPullParser, "targetName", 4);
              if (localObject != null)
              {
                paramTransition.addTarget((String)localObject);
              }
              else
              {
                localObject = TypedArrayUtils.getNamedString(localTypedArray, paramXmlPullParser, "excludeName", 5);
                if (localObject != null)
                {
                  paramTransition.excludeTarget((String)localObject, true);
                }
                else
                {
                  str = TypedArrayUtils.getNamedString(localTypedArray, paramXmlPullParser, "excludeClass", 3);
                  if (str != null) {
                    localObject = str;
                  }
                }
              }
            }
          }
          try
          {
            paramTransition.excludeTarget(Class.forName(str), true);
            break label258;
            localObject = str;
            str = TypedArrayUtils.getNamedString(localTypedArray, paramXmlPullParser, "targetClass", 0);
            if (str != null)
            {
              localObject = str;
              paramTransition.addTarget(Class.forName(str));
            }
            label258:
            localTypedArray.recycle();
          }
          catch (ClassNotFoundException paramXmlPullParser)
          {
            localTypedArray.recycle();
            throw new RuntimeException(z2.o("Could not create ", (String)localObject), paramXmlPullParser);
          }
        }
      }
    }
    paramAttributeSet = z2.t("Unknown scene name: ");
    paramAttributeSet.append(paramXmlPullParser.getName());
    throw new RuntimeException(paramAttributeSet.toString());
  }
  
  @SuppressLint({"RestrictedApi"})
  private void loadTransition(AttributeSet paramAttributeSet, XmlPullParser paramXmlPullParser, ViewGroup paramViewGroup, TransitionManager paramTransitionManager)
    throws Resources.NotFoundException
  {
    TypedArray localTypedArray = mContext.obtainStyledAttributes(paramAttributeSet, Styleable.TRANSITION_MANAGER);
    int i = TypedArrayUtils.getNamedResourceId(localTypedArray, paramXmlPullParser, "transition", 2, -1);
    int j = TypedArrayUtils.getNamedResourceId(localTypedArray, paramXmlPullParser, "fromScene", 0, -1);
    Object localObject = null;
    if (j < 0) {
      paramAttributeSet = null;
    } else {
      paramAttributeSet = Scene.getSceneForLayout(paramViewGroup, j, mContext);
    }
    j = TypedArrayUtils.getNamedResourceId(localTypedArray, paramXmlPullParser, "toScene", 1, -1);
    if (j < 0) {
      paramXmlPullParser = (XmlPullParser)localObject;
    } else {
      paramXmlPullParser = Scene.getSceneForLayout(paramViewGroup, j, mContext);
    }
    if (i >= 0)
    {
      paramViewGroup = inflateTransition(i);
      if (paramViewGroup != null) {
        if (paramXmlPullParser != null)
        {
          if (paramAttributeSet == null) {
            paramTransitionManager.setTransition(paramXmlPullParser, paramViewGroup);
          } else {
            paramTransitionManager.setTransition(paramAttributeSet, paramXmlPullParser, paramViewGroup);
          }
        }
        else {
          throw new RuntimeException(a.f("No toScene for transition ID ", i));
        }
      }
    }
    localTypedArray.recycle();
  }
  
  /* Error */
  public Transition inflateTransition(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	androidx/transition/TransitionInflater:mContext	Landroid/content/Context;
    //   4: invokevirtual 375	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   7: iload_1
    //   8: invokevirtual 381	android/content/res/Resources:getXml	(I)Landroid/content/res/XmlResourceParser;
    //   11: astore_2
    //   12: aload_0
    //   13: aload_2
    //   14: aload_2
    //   15: invokestatic 387	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   18: aconst_null
    //   19: invokespecial 238	androidx/transition/TransitionInflater:createTransitionFromXml	(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroidx/transition/Transition;)Landroidx/transition/Transition;
    //   22: astore_3
    //   23: aload_2
    //   24: invokeinterface 392 1 0
    //   29: aload_3
    //   30: areturn
    //   31: astore_3
    //   32: goto +83 -> 115
    //   35: astore 4
    //   37: new 100	android/view/InflateException
    //   40: astore_3
    //   41: new 86	java/lang/StringBuilder
    //   44: astore 5
    //   46: aload 5
    //   48: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   51: aload 5
    //   53: aload_2
    //   54: invokeinterface 395 1 0
    //   59: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: aload 5
    //   65: ldc_w 397
    //   68: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload 5
    //   74: aload 4
    //   76: invokevirtual 402	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   79: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: pop
    //   83: aload_3
    //   84: aload 5
    //   86: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   89: aload 4
    //   91: invokespecial 107	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   94: aload_3
    //   95: athrow
    //   96: astore 4
    //   98: new 100	android/view/InflateException
    //   101: astore_3
    //   102: aload_3
    //   103: aload 4
    //   105: invokevirtual 402	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   108: aload 4
    //   110: invokespecial 107	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   113: aload_3
    //   114: athrow
    //   115: aload_2
    //   116: invokeinterface 392 1 0
    //   121: aload_3
    //   122: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	this	TransitionInflater
    //   0	123	1	paramInt	int
    //   11	105	2	localXmlResourceParser	android.content.res.XmlResourceParser
    //   22	8	3	localTransition	Transition
    //   31	1	3	localObject	Object
    //   40	82	3	localInflateException	InflateException
    //   35	55	4	localIOException	IOException
    //   96	13	4	localXmlPullParserException	XmlPullParserException
    //   44	41	5	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   12	23	31	finally
    //   37	96	31	finally
    //   98	115	31	finally
    //   12	23	35	java/io/IOException
    //   12	23	96	org/xmlpull/v1/XmlPullParserException
  }
  
  /* Error */
  public TransitionManager inflateTransitionManager(int paramInt, ViewGroup paramViewGroup)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	androidx/transition/TransitionInflater:mContext	Landroid/content/Context;
    //   4: invokevirtual 375	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   7: iload_1
    //   8: invokevirtual 381	android/content/res/Resources:getXml	(I)Landroid/content/res/XmlResourceParser;
    //   11: astore_3
    //   12: aload_0
    //   13: aload_3
    //   14: aload_3
    //   15: invokestatic 387	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   18: aload_2
    //   19: invokespecial 406	androidx/transition/TransitionInflater:createTransitionManagerFromXml	(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/ViewGroup;)Landroidx/transition/TransitionManager;
    //   22: astore_2
    //   23: aload_3
    //   24: invokeinterface 392 1 0
    //   29: aload_2
    //   30: areturn
    //   31: astore_2
    //   32: goto +91 -> 123
    //   35: astore 4
    //   37: new 100	android/view/InflateException
    //   40: astore 5
    //   42: new 86	java/lang/StringBuilder
    //   45: astore_2
    //   46: aload_2
    //   47: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   50: aload_2
    //   51: aload_3
    //   52: invokeinterface 395 1 0
    //   57: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: aload_2
    //   62: ldc_w 397
    //   65: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload_2
    //   70: aload 4
    //   72: invokevirtual 402	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   75: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: aload 5
    //   81: aload_2
    //   82: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   85: invokespecial 117	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   88: aload 5
    //   90: aload 4
    //   92: invokevirtual 410	java/lang/Throwable:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   95: pop
    //   96: aload 5
    //   98: athrow
    //   99: astore 4
    //   101: new 100	android/view/InflateException
    //   104: astore_2
    //   105: aload_2
    //   106: aload 4
    //   108: invokevirtual 402	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   111: invokespecial 117	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   114: aload_2
    //   115: aload 4
    //   117: invokevirtual 410	java/lang/Throwable:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   120: pop
    //   121: aload_2
    //   122: athrow
    //   123: aload_3
    //   124: invokeinterface 392 1 0
    //   129: aload_2
    //   130: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	this	TransitionInflater
    //   0	131	1	paramInt	int
    //   0	131	2	paramViewGroup	ViewGroup
    //   11	113	3	localXmlResourceParser	android.content.res.XmlResourceParser
    //   35	56	4	localIOException	IOException
    //   99	17	4	localXmlPullParserException	XmlPullParserException
    //   40	57	5	localInflateException	InflateException
    // Exception table:
    //   from	to	target	type
    //   12	23	31	finally
    //   37	99	31	finally
    //   101	123	31	finally
    //   12	23	35	java/io/IOException
    //   12	23	99	org/xmlpull/v1/XmlPullParserException
  }
}

/* Location:
 * Qualified Name:     androidx.transition.TransitionInflater
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */