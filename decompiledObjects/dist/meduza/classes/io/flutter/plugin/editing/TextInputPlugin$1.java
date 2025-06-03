package io.flutter.plugin.editing;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.autofill.AutofillManager;
import io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration;
import io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState;
import io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler;

class TextInputPlugin$1
  implements TextInputChannel.TextInputMethodHandler
{
  public TextInputPlugin$1(TextInputPlugin paramTextInputPlugin) {}
  
  public void clearClient()
  {
    this$0.clearTextInputClient();
  }
  
  public void finishAutofillContext(boolean paramBoolean)
  {
    if ((Build.VERSION.SDK_INT >= 26) && (TextInputPlugin.access$500(this$0) != null)) {
      if (paramBoolean) {
        TextInputPlugin.access$500(this$0).commit();
      } else {
        TextInputPlugin.access$500(this$0).cancel();
      }
    }
  }
  
  public void hide()
  {
    if (access$100this$0).type == TextInputPlugin.InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW)
    {
      TextInputPlugin.access$200(this$0);
    }
    else
    {
      TextInputPlugin localTextInputPlugin = this$0;
      TextInputPlugin.access$300(localTextInputPlugin, TextInputPlugin.access$000(localTextInputPlugin));
    }
  }
  
  public void requestAutofill()
  {
    TextInputPlugin.access$400(this$0);
  }
  
  public void sendAppPrivateCommand(String paramString, Bundle paramBundle)
  {
    this$0.sendTextInputAppPrivateCommand(paramString, paramBundle);
  }
  
  public void setClient(int paramInt, TextInputChannel.Configuration paramConfiguration)
  {
    this$0.setTextInputClient(paramInt, paramConfiguration);
  }
  
  public void setEditableSizeAndTransform(double paramDouble1, double paramDouble2, double[] paramArrayOfDouble)
  {
    TextInputPlugin.access$700(this$0, paramDouble1, paramDouble2, paramArrayOfDouble);
  }
  
  public void setEditingState(TextInputChannel.TextEditState paramTextEditState)
  {
    TextInputPlugin localTextInputPlugin = this$0;
    localTextInputPlugin.setTextInputEditingState(TextInputPlugin.access$000(localTextInputPlugin), paramTextEditState);
  }
  
  public void setPlatformViewClient(int paramInt, boolean paramBoolean)
  {
    TextInputPlugin.access$600(this$0, paramInt, paramBoolean);
  }
  
  public void show()
  {
    TextInputPlugin localTextInputPlugin = this$0;
    localTextInputPlugin.showTextInput(TextInputPlugin.access$000(localTextInputPlugin));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.TextInputPlugin.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */