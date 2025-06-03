package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class SegmentDownloadAction
  extends DownloadAction
{
  public final List<StreamKey> keys;
  
  public SegmentDownloadAction(String paramString, int paramInt, Uri paramUri, boolean paramBoolean, @Nullable byte[] paramArrayOfByte, List<StreamKey> paramList)
  {
    super(paramString, paramInt, paramUri, paramBoolean, paramArrayOfByte);
    if (paramBoolean)
    {
      Assertions.checkArgument(paramList.isEmpty());
      keys = Collections.emptyList();
    }
    else
    {
      paramString = new ArrayList(paramList);
      Collections.sort(paramString);
      keys = Collections.unmodifiableList(paramString);
    }
  }
  
  private void writeKey(DataOutputStream paramDataOutputStream, StreamKey paramStreamKey)
    throws IOException
  {
    paramDataOutputStream.writeInt(periodIndex);
    paramDataOutputStream.writeInt(groupIndex);
    paramDataOutputStream.writeInt(trackIndex);
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!super.equals(paramObject)) {
      return false;
    }
    paramObject = (SegmentDownloadAction)paramObject;
    return keys.equals(keys);
  }
  
  public List<StreamKey> getKeys()
  {
    return keys;
  }
  
  public int hashCode()
  {
    int i = super.hashCode();
    return keys.hashCode() + i * 31;
  }
  
  public final void writeToStream(DataOutputStream paramDataOutputStream)
    throws IOException
  {
    paramDataOutputStream.writeUTF(uri.toString());
    paramDataOutputStream.writeBoolean(isRemoveAction);
    paramDataOutputStream.writeInt(data.length);
    paramDataOutputStream.write(data);
    paramDataOutputStream.writeInt(keys.size());
    for (int i = 0; i < keys.size(); i++) {
      writeKey(paramDataOutputStream, (StreamKey)keys.get(i));
    }
  }
  
  public static abstract class SegmentDownloadActionDeserializer
    extends DownloadAction.Deserializer
  {
    public SegmentDownloadActionDeserializer(String paramString, int paramInt)
    {
      super(paramInt);
    }
    
    public abstract DownloadAction createDownloadAction(Uri paramUri, boolean paramBoolean, byte[] paramArrayOfByte, List<StreamKey> paramList);
    
    public final DownloadAction readFromStream(int paramInt, DataInputStream paramDataInputStream)
      throws IOException
    {
      Uri localUri = Uri.parse(paramDataInputStream.readUTF());
      boolean bool = paramDataInputStream.readBoolean();
      byte[] arrayOfByte = new byte[paramDataInputStream.readInt()];
      paramDataInputStream.readFully(arrayOfByte);
      int i = paramDataInputStream.readInt();
      ArrayList localArrayList = new ArrayList();
      for (int j = 0; j < i; j++) {
        localArrayList.add(readKey(paramInt, paramDataInputStream));
      }
      return createDownloadAction(localUri, bool, arrayOfByte, localArrayList);
    }
    
    public StreamKey readKey(int paramInt, DataInputStream paramDataInputStream)
      throws IOException
    {
      return new StreamKey(paramDataInputStream.readInt(), paramDataInputStream.readInt(), paramDataInputStream.readInt());
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.SegmentDownloadAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */