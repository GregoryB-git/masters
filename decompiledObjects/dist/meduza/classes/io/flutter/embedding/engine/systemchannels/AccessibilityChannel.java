package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BasicMessageChannel.MessageHandler;
import io.flutter.plugin.common.BasicMessageChannel.Reply;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.view.AccessibilityBridge.Action;
import java.util.HashMap;

public class AccessibilityChannel
{
  private static final String TAG = "AccessibilityChannel";
  public final BasicMessageChannel<Object> channel;
  public final FlutterJNI flutterJNI;
  private AccessibilityMessageHandler handler;
  public final BasicMessageChannel.MessageHandler<Object> parsingMessageHandler;
  
  public AccessibilityChannel(DartExecutor paramDartExecutor, FlutterJNI paramFlutterJNI)
  {
    BasicMessageChannel.MessageHandler local1 = new BasicMessageChannel.MessageHandler()
    {
      public void onMessage(Object paramAnonymousObject, BasicMessageChannel.Reply<Object> paramAnonymousReply)
      {
        if (AccessibilityChannel.access$000(AccessibilityChannel.this) == null)
        {
          paramAnonymousReply.reply(null);
          return;
        }
        HashMap localHashMap1 = (HashMap)paramAnonymousObject;
        String str = (String)localHashMap1.get("type");
        HashMap localHashMap2 = (HashMap)localHashMap1.get("data");
        paramAnonymousObject = new StringBuilder();
        ((StringBuilder)paramAnonymousObject).append("Received ");
        ((StringBuilder)paramAnonymousObject).append(str);
        ((StringBuilder)paramAnonymousObject).append(" message.");
        Log.v("AccessibilityChannel", ((StringBuilder)paramAnonymousObject).toString());
        str.getClass();
        int i = -1;
        switch (str.hashCode())
        {
        default: 
          break;
        case 114203431: 
          if (str.equals("longPress")) {
            i = 4;
          }
          break;
        case 97604824: 
          if (str.equals("focus")) {
            i = 3;
          }
          break;
        case 114595: 
          if (str.equals("tap")) {
            i = 2;
          }
          break;
        case -649620375: 
          if (str.equals("announce")) {
            i = 1;
          }
          break;
        case -1140076541: 
          if (str.equals("tooltip")) {
            i = 0;
          }
          break;
        }
        switch (i)
        {
        default: 
          break;
        case 4: 
          paramAnonymousObject = (Integer)localHashMap1.get("nodeId");
          if (paramAnonymousObject != null) {
            AccessibilityChannel.access$000(AccessibilityChannel.this).onLongPress(((Integer)paramAnonymousObject).intValue());
          }
          break;
        case 3: 
          paramAnonymousObject = (Integer)localHashMap1.get("nodeId");
          if (paramAnonymousObject != null) {
            AccessibilityChannel.access$000(AccessibilityChannel.this).onFocus(((Integer)paramAnonymousObject).intValue());
          }
          break;
        case 2: 
          paramAnonymousObject = (Integer)localHashMap1.get("nodeId");
          if (paramAnonymousObject != null) {
            AccessibilityChannel.access$000(AccessibilityChannel.this).onTap(((Integer)paramAnonymousObject).intValue());
          }
          break;
        case 1: 
          paramAnonymousObject = (String)localHashMap2.get("message");
          if (paramAnonymousObject != null) {
            AccessibilityChannel.access$000(AccessibilityChannel.this).announce((String)paramAnonymousObject);
          }
          break;
        case 0: 
          paramAnonymousObject = (String)localHashMap2.get("message");
          if (paramAnonymousObject != null) {
            AccessibilityChannel.access$000(AccessibilityChannel.this).onTooltip((String)paramAnonymousObject);
          }
          break;
        }
        paramAnonymousReply.reply(null);
      }
    };
    parsingMessageHandler = local1;
    paramDartExecutor = new BasicMessageChannel(paramDartExecutor, "flutter/accessibility", StandardMessageCodec.INSTANCE);
    channel = paramDartExecutor;
    paramDartExecutor.setMessageHandler(local1);
    flutterJNI = paramFlutterJNI;
  }
  
  public AccessibilityChannel(BasicMessageChannel<Object> paramBasicMessageChannel, FlutterJNI paramFlutterJNI)
  {
    parsingMessageHandler = new BasicMessageChannel.MessageHandler()
    {
      public void onMessage(Object paramAnonymousObject, BasicMessageChannel.Reply<Object> paramAnonymousReply)
      {
        if (AccessibilityChannel.access$000(AccessibilityChannel.this) == null)
        {
          paramAnonymousReply.reply(null);
          return;
        }
        HashMap localHashMap1 = (HashMap)paramAnonymousObject;
        String str = (String)localHashMap1.get("type");
        HashMap localHashMap2 = (HashMap)localHashMap1.get("data");
        paramAnonymousObject = new StringBuilder();
        ((StringBuilder)paramAnonymousObject).append("Received ");
        ((StringBuilder)paramAnonymousObject).append(str);
        ((StringBuilder)paramAnonymousObject).append(" message.");
        Log.v("AccessibilityChannel", ((StringBuilder)paramAnonymousObject).toString());
        str.getClass();
        int i = -1;
        switch (str.hashCode())
        {
        default: 
          break;
        case 114203431: 
          if (str.equals("longPress")) {
            i = 4;
          }
          break;
        case 97604824: 
          if (str.equals("focus")) {
            i = 3;
          }
          break;
        case 114595: 
          if (str.equals("tap")) {
            i = 2;
          }
          break;
        case -649620375: 
          if (str.equals("announce")) {
            i = 1;
          }
          break;
        case -1140076541: 
          if (str.equals("tooltip")) {
            i = 0;
          }
          break;
        }
        switch (i)
        {
        default: 
          break;
        case 4: 
          paramAnonymousObject = (Integer)localHashMap1.get("nodeId");
          if (paramAnonymousObject != null) {
            AccessibilityChannel.access$000(AccessibilityChannel.this).onLongPress(((Integer)paramAnonymousObject).intValue());
          }
          break;
        case 3: 
          paramAnonymousObject = (Integer)localHashMap1.get("nodeId");
          if (paramAnonymousObject != null) {
            AccessibilityChannel.access$000(AccessibilityChannel.this).onFocus(((Integer)paramAnonymousObject).intValue());
          }
          break;
        case 2: 
          paramAnonymousObject = (Integer)localHashMap1.get("nodeId");
          if (paramAnonymousObject != null) {
            AccessibilityChannel.access$000(AccessibilityChannel.this).onTap(((Integer)paramAnonymousObject).intValue());
          }
          break;
        case 1: 
          paramAnonymousObject = (String)localHashMap2.get("message");
          if (paramAnonymousObject != null) {
            AccessibilityChannel.access$000(AccessibilityChannel.this).announce((String)paramAnonymousObject);
          }
          break;
        case 0: 
          paramAnonymousObject = (String)localHashMap2.get("message");
          if (paramAnonymousObject != null) {
            AccessibilityChannel.access$000(AccessibilityChannel.this).onTooltip((String)paramAnonymousObject);
          }
          break;
        }
        paramAnonymousReply.reply(null);
      }
    };
    channel = paramBasicMessageChannel;
    flutterJNI = paramFlutterJNI;
  }
  
  public void dispatchSemanticsAction(int paramInt, AccessibilityBridge.Action paramAction)
  {
    flutterJNI.dispatchSemanticsAction(paramInt, paramAction);
  }
  
  public void dispatchSemanticsAction(int paramInt, AccessibilityBridge.Action paramAction, Object paramObject)
  {
    flutterJNI.dispatchSemanticsAction(paramInt, paramAction, paramObject);
  }
  
  public void onAndroidAccessibilityDisabled()
  {
    flutterJNI.setSemanticsEnabled(false);
  }
  
  public void onAndroidAccessibilityEnabled()
  {
    flutterJNI.setSemanticsEnabled(true);
  }
  
  public void setAccessibilityFeatures(int paramInt)
  {
    flutterJNI.setAccessibilityFeatures(paramInt);
  }
  
  public void setAccessibilityMessageHandler(AccessibilityMessageHandler paramAccessibilityMessageHandler)
  {
    handler = paramAccessibilityMessageHandler;
    flutterJNI.setAccessibilityDelegate(paramAccessibilityMessageHandler);
  }
  
  public static abstract interface AccessibilityMessageHandler
    extends FlutterJNI.AccessibilityDelegate
  {
    public abstract void announce(String paramString);
    
    public abstract void onFocus(int paramInt);
    
    public abstract void onLongPress(int paramInt);
    
    public abstract void onTap(int paramInt);
    
    public abstract void onTooltip(String paramString);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.AccessibilityChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */