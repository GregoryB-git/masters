package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class RemoteActionCompatParcelizer
{
  public static RemoteActionCompat read(VersionedParcel paramVersionedParcel)
  {
    RemoteActionCompat localRemoteActionCompat = new RemoteActionCompat();
    mIcon = ((IconCompat)paramVersionedParcel.readVersionedParcelable(mIcon, 1));
    mTitle = paramVersionedParcel.readCharSequence(mTitle, 2);
    mContentDescription = paramVersionedParcel.readCharSequence(mContentDescription, 3);
    mActionIntent = ((PendingIntent)paramVersionedParcel.readParcelable(mActionIntent, 4));
    mEnabled = paramVersionedParcel.readBoolean(mEnabled, 5);
    mShouldShowIcon = paramVersionedParcel.readBoolean(mShouldShowIcon, 6);
    return localRemoteActionCompat;
  }
  
  public static void write(RemoteActionCompat paramRemoteActionCompat, VersionedParcel paramVersionedParcel)
  {
    paramVersionedParcel.setSerializationFlags(false, false);
    paramVersionedParcel.writeVersionedParcelable(mIcon, 1);
    paramVersionedParcel.writeCharSequence(mTitle, 2);
    paramVersionedParcel.writeCharSequence(mContentDescription, 3);
    paramVersionedParcel.writeParcelable(mActionIntent, 4);
    paramVersionedParcel.writeBoolean(mEnabled, 5);
    paramVersionedParcel.writeBoolean(mShouldShowIcon, 6);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.RemoteActionCompatParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */