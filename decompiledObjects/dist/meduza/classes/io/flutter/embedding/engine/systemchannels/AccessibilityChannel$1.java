package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.plugin.common.BasicMessageChannel.MessageHandler;
import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.HashMap;

class AccessibilityChannel$1
  implements BasicMessageChannel.MessageHandler<Object>
{
  public AccessibilityChannel$1(AccessibilityChannel paramAccessibilityChannel) {}
  
  public void onMessage(Object paramObject, BasicMessageChannel.Reply<Object> paramReply)
  {
    if (AccessibilityChannel.access$000(this$0) == null)
    {
      paramReply.reply(null);
      return;
    }
    HashMap localHashMap1 = (HashMap)paramObject;
    String str = (String)localHashMap1.get("type");
    HashMap localHashMap2 = (HashMap)localHashMap1.get("data");
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("Received ");
    ((StringBuilder)paramObject).append(str);
    ((StringBuilder)paramObject).append(" message.");
    Log.v("AccessibilityChannel", ((StringBuilder)paramObject).toString());
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
      paramObject = (Integer)localHashMap1.get("nodeId");
      if (paramObject != null) {
        AccessibilityChannel.access$000(this$0).onLongPress(((Integer)paramObject).intValue());
      }
      break;
    case 3: 
      paramObject = (Integer)localHashMap1.get("nodeId");
      if (paramObject != null) {
        AccessibilityChannel.access$000(this$0).onFocus(((Integer)paramObject).intValue());
      }
      break;
    case 2: 
      paramObject = (Integer)localHashMap1.get("nodeId");
      if (paramObject != null) {
        AccessibilityChannel.access$000(this$0).onTap(((Integer)paramObject).intValue());
      }
      break;
    case 1: 
      paramObject = (String)localHashMap2.get("message");
      if (paramObject != null) {
        AccessibilityChannel.access$000(this$0).announce((String)paramObject);
      }
      break;
    case 0: 
      paramObject = (String)localHashMap2.get("message");
      if (paramObject != null) {
        AccessibilityChannel.access$000(this$0).onTooltip((String)paramObject);
      }
      break;
    }
    paramReply.reply(null);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.AccessibilityChannel.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */