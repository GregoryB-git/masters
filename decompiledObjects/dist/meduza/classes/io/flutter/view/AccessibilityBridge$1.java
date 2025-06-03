package io.flutter.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

class AccessibilityBridge$1
  implements AccessibilityChannel.AccessibilityMessageHandler
{
  public AccessibilityBridge$1(AccessibilityBridge paramAccessibilityBridge) {}
  
  public void announce(String paramString)
  {
    AccessibilityBridge.access$100(this$0).announceForAccessibility(paramString);
  }
  
  public void onFocus(int paramInt)
  {
    this$0.sendAccessibilityEvent(paramInt, 8);
  }
  
  public void onLongPress(int paramInt)
  {
    this$0.sendAccessibilityEvent(paramInt, 2);
  }
  
  public void onTap(int paramInt)
  {
    this$0.sendAccessibilityEvent(paramInt, 1);
  }
  
  public void onTooltip(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return;
    }
    AccessibilityEvent localAccessibilityEvent = AccessibilityBridge.access$200(this$0, 0, 32);
    localAccessibilityEvent.getText().add(paramString);
    AccessibilityBridge.access$300(this$0, localAccessibilityEvent);
  }
  
  public void updateCustomAccessibilityActions(ByteBuffer paramByteBuffer, String[] paramArrayOfString)
  {
    paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    this$0.updateCustomAccessibilityActions(paramByteBuffer, paramArrayOfString);
  }
  
  public void updateSemantics(ByteBuffer paramByteBuffer, String[] paramArrayOfString, ByteBuffer[] paramArrayOfByteBuffer)
  {
    paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    int i = paramArrayOfByteBuffer.length;
    for (int j = 0; j < i; j++) {
      paramArrayOfByteBuffer[j].order(ByteOrder.LITTLE_ENDIAN);
    }
    this$0.updateSemantics(paramByteBuffer, paramArrayOfString, paramArrayOfByteBuffer);
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityBridge.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */