package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import android.util.Log;
import f;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LegacySharedPreferencesPlugin
  implements FlutterPlugin, Messages.SharedPreferencesApi
{
  private static final String BIG_INTEGER_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy";
  private static final String DOUBLE_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu";
  private static final String LIST_IDENTIFIER = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";
  private static final String SHARED_PREFERENCES_NAME = "FlutterSharedPreferences";
  private static final String TAG = "SharedPreferencesPlugin";
  private SharedPreferencesListEncoder listEncoder;
  private SharedPreferences preferences;
  
  public LegacySharedPreferencesPlugin()
  {
    this(new ListEncoder());
  }
  
  public LegacySharedPreferencesPlugin(SharedPreferencesListEncoder paramSharedPreferencesListEncoder)
  {
    listEncoder = paramSharedPreferencesListEncoder;
  }
  
  private Map<String, Object> getAllPrefs(String paramString, Set<String> paramSet)
  {
    Map localMap = preferences.getAll();
    HashMap localHashMap = new HashMap();
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str.startsWith(paramString)) && ((paramSet == null) || (paramSet.contains(str)))) {
        localHashMap.put(str, transformPref(str, localMap.get(str)));
      }
    }
    return localHashMap;
  }
  
  private void setUp(BinaryMessenger paramBinaryMessenger, Context paramContext)
  {
    preferences = paramContext.getSharedPreferences("FlutterSharedPreferences", 0);
    try
    {
      e.j(paramBinaryMessenger, this);
    }
    catch (Exception paramBinaryMessenger)
    {
      Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", paramBinaryMessenger);
    }
  }
  
  private Object transformPref(String paramString, Object paramObject)
  {
    if ((paramObject instanceof String))
    {
      paramString = (String)paramObject;
      if (paramString.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
        return listEncoder.decode(paramString.substring(40));
      }
      if (paramString.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
        return new BigInteger(paramString.substring(44), 36);
      }
      if (paramString.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
        return Double.valueOf(paramString.substring(40));
      }
    }
    else if ((paramObject instanceof Set))
    {
      ArrayList localArrayList = new ArrayList((Set)paramObject);
      paramObject = preferences.edit().remove(paramString);
      StringBuilder localStringBuilder = f.l("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu");
      localStringBuilder.append(listEncoder.encode(localArrayList));
      ((SharedPreferences.Editor)paramObject).putString(paramString, localStringBuilder.toString()).apply();
      return localArrayList;
    }
    return paramObject;
  }
  
  public Boolean clear(String paramString, List<String> paramList)
  {
    SharedPreferences.Editor localEditor = preferences.edit();
    Object localObject = preferences.getAll();
    ArrayList localArrayList = new ArrayList();
    localObject = ((Map)localObject).keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if ((str.startsWith(paramString)) && ((paramList == null) || (paramList.contains(str)))) {
        localArrayList.add(str);
      }
    }
    paramString = localArrayList.iterator();
    while (paramString.hasNext()) {
      localEditor.remove((String)paramString.next());
    }
    return Boolean.valueOf(localEditor.commit());
  }
  
  public Map<String, Object> getAll(String paramString, List<String> paramList)
  {
    if (paramList == null) {
      paramList = null;
    } else {
      paramList = new HashSet(paramList);
    }
    return getAllPrefs(paramString, paramList);
  }
  
  public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    setUp(paramFlutterPluginBinding.getBinaryMessenger(), paramFlutterPluginBinding.getApplicationContext());
  }
  
  public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    e.j(paramFlutterPluginBinding.getBinaryMessenger(), null);
  }
  
  public Boolean remove(String paramString)
  {
    return Boolean.valueOf(preferences.edit().remove(paramString).commit());
  }
  
  public Boolean setBool(String paramString, Boolean paramBoolean)
  {
    return Boolean.valueOf(preferences.edit().putBoolean(paramString, paramBoolean.booleanValue()).commit());
  }
  
  public Boolean setDouble(String paramString, Double paramDouble)
  {
    paramDouble = Double.toString(paramDouble.doubleValue());
    SharedPreferences.Editor localEditor = preferences.edit();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu");
    localStringBuilder.append(paramDouble);
    return Boolean.valueOf(localEditor.putString(paramString, localStringBuilder.toString()).commit());
  }
  
  public Boolean setInt(String paramString, Long paramLong)
  {
    return Boolean.valueOf(preferences.edit().putLong(paramString, paramLong.longValue()).commit());
  }
  
  public Boolean setString(String paramString1, String paramString2)
  {
    if ((!paramString2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) && (!paramString2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) && (!paramString2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu"))) {
      return Boolean.valueOf(preferences.edit().putString(paramString1, paramString2).commit());
    }
    throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
  }
  
  public Boolean setStringList(String paramString, List<String> paramList)
  {
    SharedPreferences.Editor localEditor = preferences.edit();
    StringBuilder localStringBuilder = f.l("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu");
    localStringBuilder.append(listEncoder.encode(paramList));
    return Boolean.valueOf(localEditor.putString(paramString, localStringBuilder.toString()).commit());
  }
  
  public static class ListEncoder
    implements SharedPreferencesListEncoder
  {
    public List<String> decode(String paramString)
    {
      try
      {
        ObjectInputStream localObjectInputStream = new java/io/ObjectInputStream;
        ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
        localByteArrayInputStream.<init>(Base64.decode(paramString, 0));
        localObjectInputStream.<init>(localByteArrayInputStream);
        paramString = (List)localObjectInputStream.readObject();
        return paramString;
      }
      catch (ClassNotFoundException paramString) {}catch (IOException paramString) {}
      throw new RuntimeException(paramString);
    }
    
    public String encode(List<String> paramList)
    {
      try
      {
        ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
        localByteArrayOutputStream.<init>();
        ObjectOutputStream localObjectOutputStream = new java/io/ObjectOutputStream;
        localObjectOutputStream.<init>(localByteArrayOutputStream);
        localObjectOutputStream.writeObject(paramList);
        localObjectOutputStream.flush();
        paramList = Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 0);
        return paramList;
      }
      catch (IOException paramList)
      {
        throw new RuntimeException(paramList);
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.LegacySharedPreferencesPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */