package com.google.android.exoplayer2.drm;

import java.util.List;

public abstract interface ExoMediaDrm$OnKeyStatusChangeListener<T extends ExoMediaCrypto>
{
  public abstract void onKeyStatusChange(ExoMediaDrm<? extends T> paramExoMediaDrm, byte[] paramArrayOfByte, List<ExoMediaDrm.KeyStatus> paramList, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.ExoMediaDrm.OnKeyStatusChangeListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */