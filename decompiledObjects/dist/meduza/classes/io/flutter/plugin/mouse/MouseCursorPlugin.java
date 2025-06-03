package io.flutter.plugin.mouse;

import a0.e;
import android.view.PointerIcon;
import io.flutter.embedding.engine.systemchannels.MouseCursorChannel;
import io.flutter.embedding.engine.systemchannels.MouseCursorChannel.MouseCursorMethodHandler;
import java.util.AbstractMap;
import java.util.HashMap;

public class MouseCursorPlugin
{
  private static HashMap<String, Integer> systemCursorConstants;
  private final MouseCursorViewDelegate mView;
  private final MouseCursorChannel mouseCursorChannel;
  
  public MouseCursorPlugin(MouseCursorViewDelegate paramMouseCursorViewDelegate, MouseCursorChannel paramMouseCursorChannel)
  {
    mView = paramMouseCursorViewDelegate;
    mouseCursorChannel = paramMouseCursorChannel;
    paramMouseCursorChannel.setMethodHandler(new MouseCursorChannel.MouseCursorMethodHandler()
    {
      public void activateSystemCursor(String paramAnonymousString)
      {
        MouseCursorPlugin.access$100(MouseCursorPlugin.this).setPointerIcon(MouseCursorPlugin.access$000(MouseCursorPlugin.this, paramAnonymousString));
      }
    });
  }
  
  private PointerIcon resolveSystemCursor(String paramString)
  {
    if (systemCursorConstants == null) {
      systemCursorConstants = new HashMap()
      {
        private static final long serialVersionUID = 1L;
      };
    }
    int i = ((Integer)e.e(systemCursorConstants, paramString, Integer.valueOf(1000))).intValue();
    return mView.getSystemPointerIcon(i);
  }
  
  public void destroy()
  {
    mouseCursorChannel.setMethodHandler(null);
  }
  
  public static abstract interface MouseCursorViewDelegate
  {
    public abstract PointerIcon getSystemPointerIcon(int paramInt);
    
    public abstract void setPointerIcon(PointerIcon paramPointerIcon);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.mouse.MouseCursorPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */