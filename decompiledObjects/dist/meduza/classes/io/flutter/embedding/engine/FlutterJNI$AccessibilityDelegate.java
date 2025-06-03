package io.flutter.embedding.engine;

import java.nio.ByteBuffer;

public abstract interface FlutterJNI$AccessibilityDelegate
{
  public abstract void updateCustomAccessibilityActions(ByteBuffer paramByteBuffer, String[] paramArrayOfString);
  
  public abstract void updateSemantics(ByteBuffer paramByteBuffer, String[] paramArrayOfString, ByteBuffer[] paramArrayOfByteBuffer);
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */