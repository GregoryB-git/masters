package com.facebook.appevents.aam;

import androidx.annotation.RestrictTo;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class MetadataRule
{
  private static final String FIELD_K = "k";
  private static final String FIELD_K_DELIMITER = ",";
  private static final String FIELD_V = "v";
  private static final String TAG = "com.facebook.appevents.aam.MetadataRule";
  private static final Set<MetadataRule> rules = new CopyOnWriteArraySet();
  private List<String> keyRules;
  private String name;
  private String valRule;
  
  private MetadataRule(String paramString1, List<String> paramList, String paramString2)
  {
    name = paramString1;
    keyRules = paramList;
    valRule = paramString2;
  }
  
  private static void constructRules(JSONObject paramJSONObject)
  {
    if (CrashShieldHandler.isObjectCrashing(MetadataRule.class)) {
      return;
    }
    try
    {
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        Object localObject = paramJSONObject.optJSONObject(str1);
        if (localObject != null)
        {
          String str2 = ((JSONObject)localObject).optString("k");
          String str3 = ((JSONObject)localObject).optString("v");
          if (!str2.isEmpty())
          {
            Set localSet = rules;
            localObject = new com/facebook/appevents/aam/MetadataRule;
            ((MetadataRule)localObject).<init>(str1, Arrays.asList(str2.split(",")), str3);
            localSet.add(localObject);
          }
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramJSONObject, MetadataRule.class);
    }
  }
  
  public static Set<String> getEnabledRuleNames()
  {
    if (CrashShieldHandler.isObjectCrashing(MetadataRule.class)) {
      return null;
    }
    try
    {
      HashSet localHashSet = new java/util/HashSet;
      localHashSet.<init>();
      Iterator localIterator = rules.iterator();
      while (localIterator.hasNext()) {
        localHashSet.add(((MetadataRule)localIterator.next()).getName());
      }
      return localHashSet;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, MetadataRule.class);
    }
    return null;
  }
  
  public static Set<MetadataRule> getRules()
  {
    if (CrashShieldHandler.isObjectCrashing(MetadataRule.class)) {
      return null;
    }
    try
    {
      HashSet localHashSet = new HashSet(rules);
      return localHashSet;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, MetadataRule.class);
    }
    return null;
  }
  
  /* Error */
  public static void updateRules(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 57	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: getstatic 38	com/facebook/appevents/aam/MetadataRule:rules	Ljava/util/Set;
    //   12: invokeinterface 133 1 0
    //   17: new 59	org/json/JSONObject
    //   20: astore_1
    //   21: aload_1
    //   22: aload_0
    //   23: invokespecial 135	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   26: aload_1
    //   27: invokestatic 137	com/facebook/appevents/aam/MetadataRule:constructRules	(Lorg/json/JSONObject;)V
    //   30: goto +10 -> 40
    //   33: astore_0
    //   34: aload_0
    //   35: ldc 2
    //   37: invokestatic 107	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   40: return
    //   41: astore_0
    //   42: goto -2 -> 40
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	paramString	String
    //   20	7	1	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   9	30	33	finally
    //   9	30	41	org/json/JSONException
  }
  
  public List<String> getKeyRules()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      ArrayList localArrayList = new ArrayList(keyRules);
      return localArrayList;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public String getName()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      String str = name;
      return str;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public String getValRule()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      String str = valRule;
      return str;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.aam.MetadataRule
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */