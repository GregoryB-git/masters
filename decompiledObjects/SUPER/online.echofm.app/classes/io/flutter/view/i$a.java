package io.flutter.view;

import D5.a.b;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

public class i$a
  implements a.b
{
  public i$a(i parami) {}
  
  public void a(String paramString)
  {
    i.c(a).announceForAccessibility(paramString);
  }
  
  public void b(ByteBuffer paramByteBuffer, String[] paramArrayOfString, ByteBuffer[] paramArrayOfByteBuffer)
  {
    paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    int i = paramArrayOfByteBuffer.length;
    for (int j = 0; j < i; j++) {
      paramArrayOfByteBuffer[j].order(ByteOrder.LITTLE_ENDIAN);
    }
    a.c0(paramByteBuffer, paramArrayOfString, paramArrayOfByteBuffer);
  }
  
  public void c(ByteBuffer paramByteBuffer, String[] paramArrayOfString)
  {
    paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    a.b0(paramByteBuffer, paramArrayOfString);
  }
  
  public void d(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return;
    }
    AccessibilityEvent localAccessibilityEvent = i.i(a, 0, 32);
    localAccessibilityEvent.getText().add(paramString);
    i.j(a, localAccessibilityEvent);
  }
  
  public void e(int paramInt)
  {
    a.S(paramInt, 8);
  }
  
  public void f(int paramInt)
  {
    a.S(paramInt, 2);
  }
  
  public void g(int paramInt)
  {
    a.S(paramInt, 1);
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */