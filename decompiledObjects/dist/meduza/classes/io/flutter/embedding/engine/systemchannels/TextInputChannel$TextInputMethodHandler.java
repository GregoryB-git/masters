package io.flutter.embedding.engine.systemchannels;

import android.os.Bundle;

public abstract interface TextInputChannel$TextInputMethodHandler
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

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */