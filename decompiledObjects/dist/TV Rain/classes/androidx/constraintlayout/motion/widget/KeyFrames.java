package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class KeyFrames
{
  private static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
  private static final String CUSTOM_METHOD = "CustomMethod";
  private static final String TAG = "KeyFrames";
  public static final int UNSET = -1;
  public static HashMap<String, Constructor<? extends Key>> sKeyMakers;
  private HashMap<Integer, ArrayList<Key>> mFramesMap = new HashMap();
  
  static
  {
    HashMap localHashMap = new HashMap();
    sKeyMakers = localHashMap;
    try
    {
      localHashMap.put("KeyAttribute", KeyAttributes.class.getConstructor(new Class[0]));
      sKeyMakers.put("KeyPosition", KeyPosition.class.getConstructor(new Class[0]));
      sKeyMakers.put("KeyCycle", KeyCycle.class.getConstructor(new Class[0]));
      sKeyMakers.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(new Class[0]));
      sKeyMakers.put("KeyTrigger", KeyTrigger.class.getConstructor(new Class[0]));
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Log.e("KeyFrames", "unable to load", localNoSuchMethodException);
    }
  }
  
  public KeyFrames() {}
  
  public KeyFrames(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    Object localObject1 = null;
    try
    {
      int i = paramXmlPullParser.getEventType();
      while (i != 1)
      {
        Object localObject2;
        if (i != 2)
        {
          if (i != 3)
          {
            localObject2 = localObject1;
          }
          else
          {
            localObject2 = localObject1;
            if (!"KeyFrameSet".equals(paramXmlPullParser.getName())) {}
          }
        }
        else
        {
          String str = paramXmlPullParser.getName();
          boolean bool = sKeyMakers.containsKey(str);
          if (bool) {
            try
            {
              localObject2 = (Constructor)sKeyMakers.get(str);
              if (localObject2 != null)
              {
                localObject2 = (Key)((Constructor)localObject2).newInstance(new Object[0]);
                try
                {
                  ((Key)localObject2).load(paramContext, Xml.asAttributeSet(paramXmlPullParser));
                  addKey((Key)localObject2);
                  localObject1 = localObject2;
                }
                catch (Exception localException1)
                {
                  localObject1 = localObject2;
                  break label206;
                }
              }
              else
              {
                localObject2 = new java/lang/NullPointerException;
                StringBuilder localStringBuilder = new java/lang/StringBuilder;
                localStringBuilder.<init>();
                localStringBuilder.append("Keymaker for ");
                localStringBuilder.append(localException1);
                localStringBuilder.append(" not found");
                ((NullPointerException)localObject2).<init>(localStringBuilder.toString());
                throw ((Throwable)localObject2);
              }
            }
            catch (Exception localException2)
            {
              label206:
              Log.e("KeyFrames", "unable to create ", localException2);
              localObject2 = localObject1;
            }
          }
          HashMap localHashMap;
          if (localException2.equalsIgnoreCase("CustomAttribute"))
          {
            localObject2 = localObject1;
            if (localObject1 != null)
            {
              localHashMap = mCustomConstraints;
              localObject2 = localObject1;
              if (localHashMap != null)
              {
                ConstraintAttribute.parse(paramContext, paramXmlPullParser, localHashMap);
                localObject2 = localObject1;
              }
            }
          }
          else
          {
            localObject2 = localObject1;
            if (localHashMap.equalsIgnoreCase("CustomMethod"))
            {
              localObject2 = localObject1;
              if (localObject1 != null)
              {
                localHashMap = mCustomConstraints;
                localObject2 = localObject1;
                if (localHashMap != null)
                {
                  ConstraintAttribute.parse(paramContext, paramXmlPullParser, localHashMap);
                  localObject2 = localObject1;
                }
              }
            }
          }
        }
        i = paramXmlPullParser.next();
        localObject1 = localObject2;
      }
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    catch (XmlPullParserException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public static String name(int paramInt, Context paramContext)
  {
    return paramContext.getResources().getResourceEntryName(paramInt);
  }
  
  public void addAllFrames(MotionController paramMotionController)
  {
    ArrayList localArrayList = (ArrayList)mFramesMap.get(Integer.valueOf(-1));
    if (localArrayList != null) {
      paramMotionController.addKeys(localArrayList);
    }
  }
  
  public void addFrames(MotionController paramMotionController)
  {
    Object localObject = (ArrayList)mFramesMap.get(Integer.valueOf(mId));
    if (localObject != null) {
      paramMotionController.addKeys((ArrayList)localObject);
    }
    localObject = (ArrayList)mFramesMap.get(Integer.valueOf(-1));
    if (localObject != null)
    {
      Iterator localIterator = ((ArrayList)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (Key)localIterator.next();
        if (((Key)localObject).matches(mView.getLayoutParams()).constraintTag)) {
          paramMotionController.addKey((Key)localObject);
        }
      }
    }
  }
  
  public void addKey(Key paramKey)
  {
    if (!mFramesMap.containsKey(Integer.valueOf(mTargetId))) {
      mFramesMap.put(Integer.valueOf(mTargetId), new ArrayList());
    }
    ArrayList localArrayList = (ArrayList)mFramesMap.get(Integer.valueOf(mTargetId));
    if (localArrayList != null) {
      localArrayList.add(paramKey);
    }
  }
  
  public ArrayList<Key> getKeyFramesForView(int paramInt)
  {
    return (ArrayList)mFramesMap.get(Integer.valueOf(paramInt));
  }
  
  public Set<Integer> getKeys()
  {
    return mFramesMap.keySet();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyFrames
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */