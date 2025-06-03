package com.devbrackets.android.exomedia.core.video.mp;

public enum NativeVideoDelegate$State
{
  static
  {
    State localState1 = new State("ERROR", 0);
    ERROR = localState1;
    State localState2 = new State("IDLE", 1);
    IDLE = localState2;
    State localState3 = new State("PREPARING", 2);
    PREPARING = localState3;
    State localState4 = new State("PREPARED", 3);
    PREPARED = localState4;
    State localState5 = new State("PLAYING", 4);
    PLAYING = localState5;
    State localState6 = new State("PAUSED", 5);
    PAUSED = localState6;
    State localState7 = new State("COMPLETED", 6);
    COMPLETED = localState7;
    $VALUES = new State[] { localState1, localState2, localState3, localState4, localState5, localState6, localState7 };
  }
  
  private NativeVideoDelegate$State() {}
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.mp.NativeVideoDelegate.State
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */