package io.flutter.embedding.engine.systemchannels;

import android.os.BaseBundle;
import android.os.Bundle;
import io.flutter.Log;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class TextInputChannel$1
  implements MethodChannel.MethodCallHandler
{
  public TextInputChannel$1(TextInputChannel paramTextInputChannel) {}
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if (TextInputChannel.access$000(this$0) == null) {
      return;
    }
    Object localObject1 = method;
    Object localObject2 = arguments;
    paramMethodCall = new StringBuilder();
    paramMethodCall.append("Received '");
    paramMethodCall.append((String)localObject1);
    paramMethodCall.append("' message.");
    Log.v("TextInputChannel", paramMethodCall.toString());
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
      paramResult.notImplemented();
      break;
    case 9: 
      TextInputChannel.access$000(this$0).requestAutofill();
      break;
    case 8: 
      TextInputChannel.access$000(this$0).clearClient();
      break;
    case 7: 
      TextInputChannel.access$000(this$0).finishAutofillContext(((Boolean)localObject2).booleanValue());
      break;
    case 6: 
    case 5: 
    case 4: 
    case 3: 
    case 2: 
      try
      {
        paramMethodCall = (JSONObject)localObject2;
        double d1 = paramMethodCall.getDouble("width");
        double d2 = paramMethodCall.getDouble("height");
        paramMethodCall = paramMethodCall.getJSONArray("transform");
        localObject1 = new double[16];
        for (i = k; i < 16; i++) {
          localObject1[i] = paramMethodCall.getDouble(i);
        }
        TextInputChannel.access$000(this$0).setEditableSizeAndTransform(d1, d2, (double[])localObject1);
        paramResult.success(null);
      }
      catch (JSONException paramMethodCall) {}
      paramMethodCall = (JSONObject)localObject2;
      localObject1 = paramMethodCall.getString("action");
      localObject2 = paramMethodCall.getString("data");
      if ((localObject2 != null) && (!((String)localObject2).isEmpty()))
      {
        paramMethodCall = new android/os/Bundle;
        paramMethodCall.<init>();
        paramMethodCall.putString("data", (String)localObject2);
      }
      else
      {
        paramMethodCall = null;
      }
      TextInputChannel.access$000(this$0).sendAppPrivateCommand((String)localObject1, paramMethodCall);
      paramResult.success(null);
      return;
      TextInputChannel.access$000(this$0).show();
      for (;;)
      {
        paramResult.success(null);
        break;
        TextInputChannel.access$000(this$0).hide();
      }
      try
      {
        paramMethodCall = (JSONArray)localObject2;
        i = paramMethodCall.getInt(0);
        paramMethodCall = paramMethodCall.getJSONObject(1);
        TextInputChannel.access$000(this$0).setClient(i, TextInputChannel.Configuration.fromJson(paramMethodCall));
        paramResult.success(null);
      }
      catch (NoSuchFieldException paramMethodCall) {}
      paramResult.error("error", paramMethodCall.getMessage(), null);
      break;
    case 1: 
      paramMethodCall = (JSONObject)localObject2;
      TextInputChannel.access$000(this$0).setEditingState(TextInputChannel.TextEditState.fromJson(paramMethodCall));
      paramResult.success(null);
      break;
    }
    paramMethodCall = (JSONObject)localObject2;
    i = paramMethodCall.getInt("platformViewId");
    boolean bool = paramMethodCall.optBoolean("usesVirtualDisplay", false);
    TextInputChannel.access$000(this$0).setPlatformViewClient(i, bool);
    paramResult.success(null);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.TextInputChannel.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */