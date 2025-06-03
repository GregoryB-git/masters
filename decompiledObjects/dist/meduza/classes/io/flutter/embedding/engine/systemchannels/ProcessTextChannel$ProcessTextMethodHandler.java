package io.flutter.embedding.engine.systemchannels;

import io.flutter.plugin.common.MethodChannel.Result;
import java.util.Map;

public abstract interface ProcessTextChannel$ProcessTextMethodHandler
{
  public abstract void processTextAction(String paramString1, String paramString2, boolean paramBoolean, MethodChannel.Result paramResult);
  
  public abstract Map<String, String> queryTextActions();
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.ProcessTextChannel.ProcessTextMethodHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */