package io.flutter.embedding.engine.systemchannels;

import android.util.DisplayMetrics;

public class SettingsChannel$ConfigurationQueue$SentConfiguration
{
  private static int nextConfigGeneration = Integer.MIN_VALUE;
  private final DisplayMetrics displayMetrics;
  public final int generationNumber;
  
  public SettingsChannel$ConfigurationQueue$SentConfiguration(DisplayMetrics paramDisplayMetrics)
  {
    int i = nextConfigGeneration;
    nextConfigGeneration = i + 1;
    generationNumber = i;
    displayMetrics = paramDisplayMetrics;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.SentConfiguration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */