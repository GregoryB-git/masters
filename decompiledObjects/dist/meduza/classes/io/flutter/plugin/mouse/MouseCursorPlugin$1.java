package io.flutter.plugin.mouse;

import io.flutter.embedding.engine.systemchannels.MouseCursorChannel.MouseCursorMethodHandler;

class MouseCursorPlugin$1
  implements MouseCursorChannel.MouseCursorMethodHandler
{
  public MouseCursorPlugin$1(MouseCursorPlugin paramMouseCursorPlugin) {}
  
  public void activateSystemCursor(String paramString)
  {
    MouseCursorPlugin.access$100(this$0).setPointerIcon(MouseCursorPlugin.access$000(this$0, paramString));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.mouse.MouseCursorPlugin.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */