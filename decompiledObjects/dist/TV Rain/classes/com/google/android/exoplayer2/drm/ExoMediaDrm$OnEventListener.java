package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;

public abstract interface ExoMediaDrm$OnEventListener<T extends ExoMediaCrypto>
{
  public abstract void onEvent(ExoMediaDrm<? extends T> paramExoMediaDrm, byte[] paramArrayOfByte1, int paramInt1, int paramInt2, @Nullable byte[] paramArrayOfByte2);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */