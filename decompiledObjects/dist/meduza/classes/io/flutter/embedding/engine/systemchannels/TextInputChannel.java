package io.flutter.embedding.engine.systemchannels;

import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import f;
import g;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.editing.TextEditingDelta;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TextInputChannel
{
  private static final String TAG = "TextInputChannel";
  public final MethodChannel channel;
  public final MethodChannel.MethodCallHandler parsingMethodHandler;
  private TextInputMethodHandler textInputMethodHandler;
  
  public TextInputChannel(DartExecutor paramDartExecutor)
  {
    MethodChannel.MethodCallHandler local1 = new MethodChannel.MethodCallHandler()
    {
      public void onMethodCall(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        if (TextInputChannel.access$000(TextInputChannel.this) == null) {
          return;
        }
        Object localObject1 = method;
        Object localObject2 = arguments;
        paramAnonymousMethodCall = new StringBuilder();
        paramAnonymousMethodCall.append("Received '");
        paramAnonymousMethodCall.append((String)localObject1);
        paramAnonymousMethodCall.append("' message.");
        Log.v("TextInputChannel", paramAnonymousMethodCall.toString());
        localObject1.getClass();
        int i = -1;
        int j = ((String)localObject1).hashCode();
        int k = 0;
        switch (j)
        {
        default: 
          break;
        case 2113369584: 
          if (((String)localObject1).equals("TextInput.requestAutofill")) {
            i = 9;
          }
          break;
        case 1904427655: 
          if (((String)localObject1).equals("TextInput.clearClient")) {
            i = 8;
          }
          break;
        case 1727570905: 
          if (((String)localObject1).equals("TextInput.finishAutofillContext")) {
            i = 7;
          }
          break;
        case 1204752139: 
          if (((String)localObject1).equals("TextInput.setEditableSizeAndTransform")) {
            i = 6;
          }
          break;
        case 649192816: 
          if (((String)localObject1).equals("TextInput.sendAppPrivateCommand")) {
            i = 5;
          }
          break;
        case 270803918: 
          if (((String)localObject1).equals("TextInput.show")) {
            i = 4;
          }
          break;
        case 270476819: 
          if (((String)localObject1).equals("TextInput.hide")) {
            i = 3;
          }
          break;
        case -37561188: 
          if (((String)localObject1).equals("TextInput.setClient")) {
            i = 2;
          }
          break;
        case -1015421462: 
          if (((String)localObject1).equals("TextInput.setEditingState")) {
            i = 1;
          }
          break;
        case -1779068172: 
          if (((String)localObject1).equals("TextInput.setPlatformViewClient")) {
            i = 0;
          }
          break;
        }
        switch (i)
        {
        default: 
          paramAnonymousResult.notImplemented();
          break;
        case 9: 
          TextInputChannel.access$000(TextInputChannel.this).requestAutofill();
          break;
        case 8: 
          TextInputChannel.access$000(TextInputChannel.this).clearClient();
          break;
        case 7: 
          TextInputChannel.access$000(TextInputChannel.this).finishAutofillContext(((Boolean)localObject2).booleanValue());
          break;
        case 6: 
        case 5: 
        case 4: 
        case 3: 
        case 2: 
          try
          {
            paramAnonymousMethodCall = (JSONObject)localObject2;
            double d1 = paramAnonymousMethodCall.getDouble("width");
            double d2 = paramAnonymousMethodCall.getDouble("height");
            paramAnonymousMethodCall = paramAnonymousMethodCall.getJSONArray("transform");
            localObject1 = new double[16];
            for (i = k; i < 16; i++) {
              localObject1[i] = paramAnonymousMethodCall.getDouble(i);
            }
            TextInputChannel.access$000(TextInputChannel.this).setEditableSizeAndTransform(d1, d2, (double[])localObject1);
            paramAnonymousResult.success(null);
          }
          catch (JSONException paramAnonymousMethodCall) {}
          paramAnonymousMethodCall = (JSONObject)localObject2;
          localObject1 = paramAnonymousMethodCall.getString("action");
          localObject2 = paramAnonymousMethodCall.getString("data");
          if ((localObject2 != null) && (!((String)localObject2).isEmpty()))
          {
            paramAnonymousMethodCall = new android/os/Bundle;
            paramAnonymousMethodCall.<init>();
            paramAnonymousMethodCall.putString("data", (String)localObject2);
          }
          else
          {
            paramAnonymousMethodCall = null;
          }
          TextInputChannel.access$000(TextInputChannel.this).sendAppPrivateCommand((String)localObject1, paramAnonymousMethodCall);
          paramAnonymousResult.success(null);
          return;
          TextInputChannel.access$000(TextInputChannel.this).show();
          for (;;)
          {
            paramAnonymousResult.success(null);
            break;
            TextInputChannel.access$000(TextInputChannel.this).hide();
          }
          try
          {
            paramAnonymousMethodCall = (JSONArray)localObject2;
            i = paramAnonymousMethodCall.getInt(0);
            paramAnonymousMethodCall = paramAnonymousMethodCall.getJSONObject(1);
            TextInputChannel.access$000(TextInputChannel.this).setClient(i, TextInputChannel.Configuration.fromJson(paramAnonymousMethodCall));
            paramAnonymousResult.success(null);
          }
          catch (NoSuchFieldException paramAnonymousMethodCall) {}
          paramAnonymousResult.error("error", paramAnonymousMethodCall.getMessage(), null);
          break;
        case 1: 
          paramAnonymousMethodCall = (JSONObject)localObject2;
          TextInputChannel.access$000(TextInputChannel.this).setEditingState(TextInputChannel.TextEditState.fromJson(paramAnonymousMethodCall));
          paramAnonymousResult.success(null);
          break;
        }
        paramAnonymousMethodCall = (JSONObject)localObject2;
        i = paramAnonymousMethodCall.getInt("platformViewId");
        boolean bool = paramAnonymousMethodCall.optBoolean("usesVirtualDisplay", false);
        TextInputChannel.access$000(TextInputChannel.this).setPlatformViewClient(i, bool);
        paramAnonymousResult.success(null);
      }
    };
    parsingMethodHandler = local1;
    paramDartExecutor = new MethodChannel(paramDartExecutor, "flutter/textinput", JSONMethodCodec.INSTANCE);
    channel = paramDartExecutor;
    paramDartExecutor.setMethodCallHandler(local1);
  }
  
  private static HashMap<Object, Object> createEditingDeltaJSON(ArrayList<TextEditingDelta> paramArrayList)
  {
    HashMap localHashMap = new HashMap();
    JSONArray localJSONArray = new JSONArray();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext()) {
      localJSONArray.put(((TextEditingDelta)paramArrayList.next()).toJSON());
    }
    localHashMap.put("deltas", localJSONArray);
    return localHashMap;
  }
  
  private static HashMap<Object, Object> createEditingStateJSON(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("text", paramString);
    g.k(paramInt1, localHashMap, "selectionBase", paramInt2, "selectionExtent", paramInt3, "composingBase", paramInt4, "composingExtent");
    return localHashMap;
  }
  
  public void commitContent(int paramInt, Map<String, Object> paramMap)
  {
    Log.v("TextInputChannel", "Sending 'commitContent' message.");
    channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Object[] { Integer.valueOf(paramInt), "TextInputAction.commitContent", paramMap }));
  }
  
  public void done(int paramInt)
  {
    Log.v("TextInputChannel", "Sending 'done' message.");
    channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.done" }));
  }
  
  public void go(int paramInt)
  {
    Log.v("TextInputChannel", "Sending 'go' message.");
    channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.go" }));
  }
  
  public void newline(int paramInt)
  {
    Log.v("TextInputChannel", "Sending 'newline' message.");
    channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.newline" }));
  }
  
  public void next(int paramInt)
  {
    Log.v("TextInputChannel", "Sending 'next' message.");
    channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.next" }));
  }
  
  public void performPrivateCommand(int paramInt, String paramString, Bundle paramBundle)
  {
    HashMap localHashMap1 = new HashMap();
    localHashMap1.put("action", paramString);
    if (paramBundle != null)
    {
      HashMap localHashMap2 = new HashMap();
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        paramString = (String)localIterator.next();
        Object localObject = paramBundle.get(paramString);
        if ((localObject instanceof byte[])) {
          localHashMap2.put(paramString, paramBundle.getByteArray(paramString));
        } else if ((localObject instanceof Byte)) {
          localHashMap2.put(paramString, Byte.valueOf(paramBundle.getByte(paramString)));
        } else if ((localObject instanceof char[])) {
          localHashMap2.put(paramString, paramBundle.getCharArray(paramString));
        } else if ((localObject instanceof Character)) {
          localHashMap2.put(paramString, Character.valueOf(paramBundle.getChar(paramString)));
        } else if ((localObject instanceof CharSequence[])) {
          localHashMap2.put(paramString, paramBundle.getCharSequenceArray(paramString));
        } else if ((localObject instanceof CharSequence)) {
          localHashMap2.put(paramString, paramBundle.getCharSequence(paramString));
        } else if ((localObject instanceof float[])) {
          localHashMap2.put(paramString, paramBundle.getFloatArray(paramString));
        } else if ((localObject instanceof Float)) {
          localHashMap2.put(paramString, Float.valueOf(paramBundle.getFloat(paramString)));
        }
      }
      localHashMap1.put("data", localHashMap2);
    }
    channel.invokeMethod("TextInputClient.performPrivateCommand", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), localHashMap1 }));
  }
  
  public void previous(int paramInt)
  {
    Log.v("TextInputChannel", "Sending 'previous' message.");
    channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.previous" }));
  }
  
  public void requestExistingInputState()
  {
    channel.invokeMethod("TextInputClient.requestExistingInputState", null);
  }
  
  public void search(int paramInt)
  {
    Log.v("TextInputChannel", "Sending 'search' message.");
    channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.search" }));
  }
  
  public void send(int paramInt)
  {
    Log.v("TextInputChannel", "Sending 'send' message.");
    channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.send" }));
  }
  
  public void setTextInputMethodHandler(TextInputMethodHandler paramTextInputMethodHandler)
  {
    textInputMethodHandler = paramTextInputMethodHandler;
  }
  
  public void unspecifiedAction(int paramInt)
  {
    Log.v("TextInputChannel", "Sending 'unspecified' message.");
    channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), "TextInputAction.unspecified" }));
  }
  
  public void updateEditingState(int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Sending message to update editing state: \nText: ");
    localStringBuilder.append(paramString);
    localStringBuilder.append("\nSelection start: ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append("\nSelection end: ");
    localStringBuilder.append(paramInt3);
    localStringBuilder.append("\nComposing start: ");
    localStringBuilder.append(paramInt4);
    localStringBuilder.append("\nComposing end: ");
    localStringBuilder.append(paramInt5);
    Log.v("TextInputChannel", localStringBuilder.toString());
    paramString = createEditingStateJSON(paramString, paramInt2, paramInt3, paramInt4, paramInt5);
    channel.invokeMethod("TextInputClient.updateEditingState", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt1), paramString }));
  }
  
  public void updateEditingStateWithDeltas(int paramInt, ArrayList<TextEditingDelta> paramArrayList)
  {
    StringBuilder localStringBuilder = f.l("Sending message to update editing state with deltas: \nNumber of deltas: ");
    localStringBuilder.append(paramArrayList.size());
    Log.v("TextInputChannel", localStringBuilder.toString());
    paramArrayList = createEditingDeltaJSON(paramArrayList);
    channel.invokeMethod("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), paramArrayList }));
  }
  
  public void updateEditingStateWithTag(int paramInt, HashMap<String, TextEditState> paramHashMap)
  {
    Object localObject = f.l("Sending message to update editing state for ");
    ((StringBuilder)localObject).append(String.valueOf(paramHashMap.size()));
    ((StringBuilder)localObject).append(" field(s).");
    Log.v("TextInputChannel", ((StringBuilder)localObject).toString());
    localObject = new HashMap();
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      paramHashMap = (TextEditState)localEntry.getValue();
      ((HashMap)localObject).put((String)localEntry.getKey(), createEditingStateJSON(text, selectionStart, selectionEnd, -1, -1));
    }
    channel.invokeMethod("TextInputClient.updateEditingStateWithTag", Arrays.asList(new Serializable[] { Integer.valueOf(paramInt), localObject }));
  }
  
  public static class Configuration
  {
    public final String actionLabel;
    public final boolean autocorrect;
    public final Autofill autofill;
    public final String[] contentCommitMimeTypes;
    public final boolean enableDeltaModel;
    public final boolean enableIMEPersonalizedLearning;
    public final boolean enableSuggestions;
    public final Configuration[] fields;
    public final Integer inputAction;
    public final TextInputChannel.InputType inputType;
    public final boolean obscureText;
    public final TextInputChannel.TextCapitalization textCapitalization;
    
    public Configuration(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, TextInputChannel.TextCapitalization paramTextCapitalization, TextInputChannel.InputType paramInputType, Integer paramInteger, String paramString, Autofill paramAutofill, String[] paramArrayOfString, Configuration[] paramArrayOfConfiguration)
    {
      obscureText = paramBoolean1;
      autocorrect = paramBoolean2;
      enableSuggestions = paramBoolean3;
      enableIMEPersonalizedLearning = paramBoolean4;
      enableDeltaModel = paramBoolean5;
      textCapitalization = paramTextCapitalization;
      inputType = paramInputType;
      inputAction = paramInteger;
      actionLabel = paramString;
      autofill = paramAutofill;
      contentCommitMimeTypes = paramArrayOfString;
      fields = paramArrayOfConfiguration;
    }
    
    public static Configuration fromJson(JSONObject paramJSONObject)
    {
      Object localObject1 = paramJSONObject.getString("inputAction");
      if (localObject1 != null)
      {
        boolean bool1 = paramJSONObject.isNull("fields");
        int i = 0;
        Object localObject2 = null;
        Configuration[] arrayOfConfiguration;
        int k;
        if (!bool1)
        {
          localObject3 = paramJSONObject.getJSONArray("fields");
          int j = ((JSONArray)localObject3).length();
          arrayOfConfiguration = new Configuration[j];
          for (k = 0; k < j; k++) {
            arrayOfConfiguration[k] = fromJson(((JSONArray)localObject3).getJSONObject(k));
          }
        }
        else
        {
          arrayOfConfiguration = null;
        }
        Object localObject3 = inputActionFromTextInputAction((String)localObject1);
        ArrayList localArrayList = new ArrayList();
        if (paramJSONObject.isNull("contentCommitMimeTypes")) {
          localObject1 = null;
        } else {
          localObject1 = paramJSONObject.getJSONArray("contentCommitMimeTypes");
        }
        if (localObject1 != null) {
          for (k = i; k < ((JSONArray)localObject1).length(); k++) {
            localArrayList.add(((JSONArray)localObject1).optString(k));
          }
        }
        boolean bool2 = paramJSONObject.optBoolean("obscureText");
        boolean bool3 = paramJSONObject.optBoolean("autocorrect", true);
        bool1 = paramJSONObject.optBoolean("enableSuggestions");
        boolean bool4 = paramJSONObject.optBoolean("enableIMEPersonalizedLearning");
        boolean bool5 = paramJSONObject.optBoolean("enableDeltaModel");
        TextInputChannel.TextCapitalization localTextCapitalization = TextInputChannel.TextCapitalization.fromValue(paramJSONObject.getString("textCapitalization"));
        TextInputChannel.InputType localInputType = TextInputChannel.InputType.fromJson(paramJSONObject.getJSONObject("inputType"));
        if (paramJSONObject.isNull("actionLabel")) {
          localObject1 = null;
        } else {
          localObject1 = paramJSONObject.getString("actionLabel");
        }
        if (paramJSONObject.isNull("autofill")) {
          paramJSONObject = (JSONObject)localObject2;
        } else {
          paramJSONObject = Autofill.fromJson(paramJSONObject.getJSONObject("autofill"));
        }
        return new Configuration(bool2, bool3, bool1, bool4, bool5, localTextCapitalization, localInputType, (Integer)localObject3, (String)localObject1, paramJSONObject, (String[])localArrayList.toArray(new String[localArrayList.size()]), arrayOfConfiguration);
      }
      throw new JSONException("Configuration JSON missing 'inputAction' property.");
    }
    
    private static Integer inputActionFromTextInputAction(String paramString)
    {
      paramString.getClass();
      int i = paramString.hashCode();
      int j = 1;
      Integer localInteger1 = Integer.valueOf(1);
      Integer localInteger2 = Integer.valueOf(0);
      switch (i)
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
                    do
                    {
                      j = -1;
                      break;
                    } while (!paramString.equals("TextInputAction.previous"));
                    j = 8;
                    break;
                  } while (!paramString.equals("TextInputAction.newline"));
                  j = 7;
                  break;
                } while (!paramString.equals("TextInputAction.go"));
                j = 6;
                break;
              } while (!paramString.equals("TextInputAction.search"));
              j = 5;
              break;
            } while (!paramString.equals("TextInputAction.send"));
            j = 4;
            break;
          } while (!paramString.equals("TextInputAction.none"));
          j = 3;
          break;
        } while (!paramString.equals("TextInputAction.next"));
        j = 2;
        break;
        if (paramString.equals("TextInputAction.done")) {
          break;
        }
      } while ((goto 108) || (!paramString.equals("TextInputAction.unspecified")));
      j = 0;
      switch (j)
      {
      default: 
        return localInteger2;
      case 8: 
        return Integer.valueOf(7);
      case 7: 
        return localInteger1;
      case 6: 
        return Integer.valueOf(2);
      case 5: 
        return Integer.valueOf(3);
      case 4: 
        return Integer.valueOf(4);
      case 3: 
        return localInteger1;
      case 2: 
        return Integer.valueOf(5);
      case 1: 
        return Integer.valueOf(6);
      }
      return localInteger2;
    }
    
    public static class Autofill
    {
      public final TextInputChannel.TextEditState editState;
      public final String hintText;
      public final String[] hints;
      public final String uniqueIdentifier;
      
      public Autofill(String paramString1, String[] paramArrayOfString, String paramString2, TextInputChannel.TextEditState paramTextEditState)
      {
        uniqueIdentifier = paramString1;
        hints = paramArrayOfString;
        hintText = paramString2;
        editState = paramTextEditState;
      }
      
      public static Autofill fromJson(JSONObject paramJSONObject)
      {
        String str1 = paramJSONObject.getString("uniqueIdentifier");
        JSONArray localJSONArray = paramJSONObject.getJSONArray("hints");
        String str2;
        if (paramJSONObject.isNull("hintText")) {
          str2 = null;
        } else {
          str2 = paramJSONObject.getString("hintText");
        }
        paramJSONObject = paramJSONObject.getJSONObject("editingValue");
        String[] arrayOfString = new String[localJSONArray.length()];
        for (int i = 0; i < localJSONArray.length(); i++) {
          arrayOfString[i] = translateAutofillHint(localJSONArray.getString(i));
        }
        return new Autofill(str1, arrayOfString, str2, TextInputChannel.TextEditState.fromJson(paramJSONObject));
      }
      
      private static String translateAutofillHint(String paramString)
      {
        int i = Build.VERSION.SDK_INT;
        int j = 26;
        if (i < 26) {
          return paramString;
        }
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
                                                                              j = -1;
                                                                              break;
                                                                            } while (!paramString.equals("birthdayDay"));
                                                                            j = 35;
                                                                            break;
                                                                          } while (!paramString.equals("postalCode"));
                                                                          j = 34;
                                                                          break;
                                                                        } while (!paramString.equals("postalAddressExtended"));
                                                                        j = 33;
                                                                        break;
                                                                      } while (!paramString.equals("postalAddress"));
                                                                      j = 32;
                                                                      break;
                                                                    } while (!paramString.equals("givenName"));
                                                                    j = 31;
                                                                    break;
                                                                  } while (!paramString.equals("password"));
                                                                  j = 30;
                                                                  break;
                                                                } while (!paramString.equals("birthday"));
                                                                j = 29;
                                                                break;
                                                              } while (!paramString.equals("newUsername"));
                                                              j = 28;
                                                              break;
                                                            } while (!paramString.equals("telephoneNumber"));
                                                            j = 27;
                                                            break;
                                                            if (paramString.equals("familyName")) {
                                                              break;
                                                            }
                                                          } while ((goto 324) || (!paramString.equals("birthdayMonth")));
                                                          j = 25;
                                                          break;
                                                        } while (!paramString.equals("addressState"));
                                                        j = 24;
                                                        break;
                                                      } while (!paramString.equals("email"));
                                                      j = 23;
                                                      break;
                                                    } while (!paramString.equals("name"));
                                                    j = 22;
                                                    break;
                                                  } while (!paramString.equals("username"));
                                                  j = 21;
                                                  break;
                                                } while (!paramString.equals("telephoneNumberCountryCode"));
                                                j = 20;
                                                break;
                                              } while (!paramString.equals("creditCardExpirationYear"));
                                              j = 19;
                                              break;
                                            } while (!paramString.equals("creditCardExpirationDate"));
                                            j = 18;
                                            break;
                                          } while (!paramString.equals("nameSuffix"));
                                          j = 17;
                                          break;
                                        } while (!paramString.equals("middleName"));
                                        j = 16;
                                        break;
                                      } while (!paramString.equals("namePrefix"));
                                      j = 15;
                                      break;
                                    } while (!paramString.equals("creditCardNumber"));
                                    j = 14;
                                    break;
                                  } while (!paramString.equals("postalAddressExtendedPostalCode"));
                                  j = 13;
                                  break;
                                } while (!paramString.equals("gender"));
                                j = 12;
                                break;
                              } while (!paramString.equals("addressCity"));
                              j = 11;
                              break;
                            } while (!paramString.equals("middleInitial"));
                            j = 10;
                            break;
                          } while (!paramString.equals("countryName"));
                          j = 9;
                          break;
                        } while (!paramString.equals("telephoneNumberDevice"));
                        j = 8;
                        break;
                      } while (!paramString.equals("fullStreetAddress"));
                      j = 7;
                      break;
                    } while (!paramString.equals("creditCardExpirationDay"));
                    j = 6;
                    break;
                  } while (!paramString.equals("creditCardSecurityCode"));
                  j = 5;
                  break;
                } while (!paramString.equals("newPassword"));
                j = 4;
                break;
              } while (!paramString.equals("telephoneNumberNational"));
              j = 3;
              break;
            } while (!paramString.equals("creditCardExpirationMonth"));
            j = 2;
            break;
          } while (!paramString.equals("oneTimeCode"));
          j = 1;
          break;
        } while (!paramString.equals("birthdayYear"));
        j = 0;
        switch (j)
        {
        default: 
          return paramString;
        case 35: 
          return "birthDateDay";
        case 34: 
          return "postalCode";
        case 33: 
          return "extendedAddress";
        case 32: 
          return "postalAddress";
        case 31: 
          return "personGivenName";
        case 30: 
          return "password";
        case 29: 
          return "birthDateFull";
        case 28: 
          return "newUsername";
        case 27: 
          return "phoneNumber";
        case 26: 
          return "personFamilyName";
        case 25: 
          return "birthDateMonth";
        case 24: 
          return "addressRegion";
        case 23: 
          return "emailAddress";
        case 22: 
          return "personName";
        case 21: 
          return "username";
        case 20: 
          return "phoneCountryCode";
        case 19: 
          return "creditCardExpirationYear";
        case 18: 
          return "creditCardExpirationDate";
        case 17: 
          return "personNameSuffix";
        case 16: 
          return "personMiddleName";
        case 15: 
          return "personNamePrefix";
        case 14: 
          return "creditCardNumber";
        case 13: 
          return "extendedPostalCode";
        case 12: 
          return "gender";
        case 11: 
          return "addressLocality";
        case 10: 
          return "personMiddleInitial";
        case 9: 
          return "addressCountry";
        case 8: 
          return "phoneNumberDevice";
        case 7: 
          return "streetAddress";
        case 6: 
          return "creditCardExpirationDay";
        case 5: 
          return "creditCardSecurityCode";
        case 4: 
          return "newPassword";
        case 3: 
          return "phoneNational";
        case 2: 
          return "creditCardExpirationMonth";
        case 1: 
          return "smsOTPCode";
        }
        return "birthDateYear";
      }
    }
  }
  
  public static class InputType
  {
    public final boolean isDecimal;
    public final boolean isSigned;
    public final TextInputChannel.TextInputType type;
    
    public InputType(TextInputChannel.TextInputType paramTextInputType, boolean paramBoolean1, boolean paramBoolean2)
    {
      type = paramTextInputType;
      isSigned = paramBoolean1;
      isDecimal = paramBoolean2;
    }
    
    public static InputType fromJson(JSONObject paramJSONObject)
    {
      return new InputType(TextInputChannel.TextInputType.fromValue(paramJSONObject.getString("name")), paramJSONObject.optBoolean("signed", false), paramJSONObject.optBoolean("decimal", false));
    }
  }
  
  public static enum TextCapitalization
  {
    private final String encodedName;
    
    static
    {
      SENTENCES = new TextCapitalization("SENTENCES", 2, "TextCapitalization.sentences");
      NONE = new TextCapitalization("NONE", 3, "TextCapitalization.none");
    }
    
    private TextCapitalization(String paramString)
    {
      encodedName = paramString;
    }
    
    public static TextCapitalization fromValue(String paramString)
    {
      for (TextCapitalization localTextCapitalization : ) {
        if (encodedName.equals(paramString)) {
          return localTextCapitalization;
        }
      }
      throw new NoSuchFieldException(g.d("No such TextCapitalization: ", paramString));
    }
  }
  
  public static class TextEditState
  {
    public final int composingEnd;
    public final int composingStart;
    public final int selectionEnd;
    public final int selectionStart;
    public final String text;
    
    public TextEditState(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if (((paramInt1 == -1) && (paramInt2 == -1)) || ((paramInt1 >= 0) && (paramInt2 >= 0)))
      {
        if (((paramInt3 == -1) && (paramInt4 == -1)) || ((paramInt3 >= 0) && (paramInt3 <= paramInt4)))
        {
          if (paramInt4 <= paramString.length())
          {
            if (paramInt1 <= paramString.length())
            {
              if (paramInt2 <= paramString.length())
              {
                text = paramString;
                selectionStart = paramInt1;
                selectionEnd = paramInt2;
                composingStart = paramInt3;
                composingEnd = paramInt4;
                return;
              }
              paramString = f.l("invalid selection end: ");
              paramString.append(String.valueOf(paramInt2));
              throw new IndexOutOfBoundsException(paramString.toString());
            }
            paramString = f.l("invalid selection start: ");
            paramString.append(String.valueOf(paramInt1));
            throw new IndexOutOfBoundsException(paramString.toString());
          }
          paramString = f.l("invalid composing start: ");
          paramString.append(String.valueOf(paramInt3));
          throw new IndexOutOfBoundsException(paramString.toString());
        }
        paramString = f.l("invalid composing range: (");
        paramString.append(String.valueOf(paramInt3));
        paramString.append(", ");
        paramString.append(String.valueOf(paramInt4));
        paramString.append(")");
        throw new IndexOutOfBoundsException(paramString.toString());
      }
      paramString = f.l("invalid selection: (");
      paramString.append(String.valueOf(paramInt1));
      paramString.append(", ");
      paramString.append(String.valueOf(paramInt2));
      paramString.append(")");
      throw new IndexOutOfBoundsException(paramString.toString());
    }
    
    public static TextEditState fromJson(JSONObject paramJSONObject)
    {
      return new TextEditState(paramJSONObject.getString("text"), paramJSONObject.getInt("selectionBase"), paramJSONObject.getInt("selectionExtent"), paramJSONObject.getInt("composingBase"), paramJSONObject.getInt("composingExtent"));
    }
    
    public boolean hasComposing()
    {
      int i = composingStart;
      boolean bool;
      if ((i >= 0) && (composingEnd > i)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean hasSelection()
    {
      boolean bool;
      if (selectionStart >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static abstract interface TextInputMethodHandler
  {
    public abstract void clearClient();
    
    public abstract void finishAutofillContext(boolean paramBoolean);
    
    public abstract void hide();
    
    public abstract void requestAutofill();
    
    public abstract void sendAppPrivateCommand(String paramString, Bundle paramBundle);
    
    public abstract void setClient(int paramInt, TextInputChannel.Configuration paramConfiguration);
    
    public abstract void setEditableSizeAndTransform(double paramDouble1, double paramDouble2, double[] paramArrayOfDouble);
    
    public abstract void setEditingState(TextInputChannel.TextEditState paramTextEditState);
    
    public abstract void setPlatformViewClient(int paramInt, boolean paramBoolean);
    
    public abstract void show();
  }
  
  public static enum TextInputType
  {
    private final String encodedName;
    
    static
    {
      DATETIME = new TextInputType("DATETIME", 1, "TextInputType.datetime");
      NAME = new TextInputType("NAME", 2, "TextInputType.name");
      POSTAL_ADDRESS = new TextInputType("POSTAL_ADDRESS", 3, "TextInputType.address");
      NUMBER = new TextInputType("NUMBER", 4, "TextInputType.number");
      PHONE = new TextInputType("PHONE", 5, "TextInputType.phone");
      MULTILINE = new TextInputType("MULTILINE", 6, "TextInputType.multiline");
      EMAIL_ADDRESS = new TextInputType("EMAIL_ADDRESS", 7, "TextInputType.emailAddress");
      URL = new TextInputType("URL", 8, "TextInputType.url");
      VISIBLE_PASSWORD = new TextInputType("VISIBLE_PASSWORD", 9, "TextInputType.visiblePassword");
      NONE = new TextInputType("NONE", 10, "TextInputType.none");
      WEB_SEARCH = new TextInputType("WEB_SEARCH", 11, "TextInputType.webSearch");
      TWITTER = new TextInputType("TWITTER", 12, "TextInputType.twitter");
    }
    
    private TextInputType(String paramString)
    {
      encodedName = paramString;
    }
    
    public static TextInputType fromValue(String paramString)
    {
      for (TextInputType localTextInputType : ) {
        if (encodedName.equals(paramString)) {
          return localTextInputType;
        }
      }
      throw new NoSuchFieldException(g.d("No such TextInputType: ", paramString));
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.TextInputChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */