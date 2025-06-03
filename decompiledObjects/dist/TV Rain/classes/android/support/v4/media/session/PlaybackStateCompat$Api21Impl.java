package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.media.session.PlaybackState.Builder;
import android.media.session.PlaybackState.CustomAction;
import android.media.session.PlaybackState.CustomAction.Builder;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(21)
class PlaybackStateCompat$Api21Impl
{
  @DoNotInline
  public static void addCustomAction(PlaybackState.Builder paramBuilder, PlaybackState.CustomAction paramCustomAction)
  {
    paramBuilder.addCustomAction(paramCustomAction);
  }
  
  @DoNotInline
  public static PlaybackState.CustomAction build(PlaybackState.CustomAction.Builder paramBuilder)
  {
    return paramBuilder.build();
  }
  
  @DoNotInline
  public static PlaybackState build(PlaybackState.Builder paramBuilder)
  {
    return paramBuilder.build();
  }
  
  @DoNotInline
  public static PlaybackState.Builder createBuilder()
  {
    return new PlaybackState.Builder();
  }
  
  @DoNotInline
  public static PlaybackState.CustomAction.Builder createCustomActionBuilder(String paramString, CharSequence paramCharSequence, int paramInt)
  {
    return new PlaybackState.CustomAction.Builder(paramString, paramCharSequence, paramInt);
  }
  
  @DoNotInline
  public static String getAction(PlaybackState.CustomAction paramCustomAction)
  {
    return paramCustomAction.getAction();
  }
  
  @DoNotInline
  public static long getActions(PlaybackState paramPlaybackState)
  {
    return paramPlaybackState.getActions();
  }
  
  @DoNotInline
  public static long getActiveQueueItemId(PlaybackState paramPlaybackState)
  {
    return paramPlaybackState.getActiveQueueItemId();
  }
  
  @DoNotInline
  public static long getBufferedPosition(PlaybackState paramPlaybackState)
  {
    return paramPlaybackState.getBufferedPosition();
  }
  
  @DoNotInline
  public static List<PlaybackState.CustomAction> getCustomActions(PlaybackState paramPlaybackState)
  {
    return paramPlaybackState.getCustomActions();
  }
  
  @DoNotInline
  public static CharSequence getErrorMessage(PlaybackState paramPlaybackState)
  {
    return paramPlaybackState.getErrorMessage();
  }
  
  @DoNotInline
  public static Bundle getExtras(PlaybackState.CustomAction paramCustomAction)
  {
    return paramCustomAction.getExtras();
  }
  
  @DoNotInline
  public static int getIcon(PlaybackState.CustomAction paramCustomAction)
  {
    return paramCustomAction.getIcon();
  }
  
  @DoNotInline
  public static long getLastPositionUpdateTime(PlaybackState paramPlaybackState)
  {
    return paramPlaybackState.getLastPositionUpdateTime();
  }
  
  @DoNotInline
  public static CharSequence getName(PlaybackState.CustomAction paramCustomAction)
  {
    return paramCustomAction.getName();
  }
  
  @DoNotInline
  public static float getPlaybackSpeed(PlaybackState paramPlaybackState)
  {
    return paramPlaybackState.getPlaybackSpeed();
  }
  
  @DoNotInline
  public static long getPosition(PlaybackState paramPlaybackState)
  {
    return paramPlaybackState.getPosition();
  }
  
  @DoNotInline
  public static int getState(PlaybackState paramPlaybackState)
  {
    return paramPlaybackState.getState();
  }
  
  @DoNotInline
  public static void setActions(PlaybackState.Builder paramBuilder, long paramLong)
  {
    paramBuilder.setActions(paramLong);
  }
  
  @DoNotInline
  public static void setActiveQueueItemId(PlaybackState.Builder paramBuilder, long paramLong)
  {
    paramBuilder.setActiveQueueItemId(paramLong);
  }
  
  @DoNotInline
  public static void setBufferedPosition(PlaybackState.Builder paramBuilder, long paramLong)
  {
    paramBuilder.setBufferedPosition(paramLong);
  }
  
  @DoNotInline
  public static void setErrorMessage(PlaybackState.Builder paramBuilder, CharSequence paramCharSequence)
  {
    paramBuilder.setErrorMessage(paramCharSequence);
  }
  
  @DoNotInline
  public static void setExtras(PlaybackState.CustomAction.Builder paramBuilder, Bundle paramBundle)
  {
    paramBuilder.setExtras(paramBundle);
  }
  
  @DoNotInline
  public static void setState(PlaybackState.Builder paramBuilder, int paramInt, long paramLong1, float paramFloat, long paramLong2)
  {
    paramBuilder.setState(paramInt, paramLong1, paramFloat, paramLong2);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */