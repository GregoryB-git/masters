package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class PsshAtomUtil
{
  private static final String TAG = "PsshAtomUtil";
  
  public static byte[] buildPsshAtom(UUID paramUUID, @Nullable byte[] paramArrayOfByte)
  {
    return buildPsshAtom(paramUUID, null, paramArrayOfByte);
  }
  
  public static byte[] buildPsshAtom(UUID paramUUID, @Nullable UUID[] paramArrayOfUUID, @Nullable byte[] paramArrayOfByte)
  {
    int i = 0;
    if (paramArrayOfByte != null) {
      j = paramArrayOfByte.length;
    } else {
      j = 0;
    }
    int k = j + 32;
    int j = k;
    if (paramArrayOfUUID != null) {
      j = k + (paramArrayOfUUID.length * 16 + 4);
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(j);
    localByteBuffer.putInt(j);
    localByteBuffer.putInt(Atom.TYPE_pssh);
    if (paramArrayOfUUID != null) {
      j = 16777216;
    } else {
      j = 0;
    }
    localByteBuffer.putInt(j);
    localByteBuffer.putLong(paramUUID.getMostSignificantBits());
    localByteBuffer.putLong(paramUUID.getLeastSignificantBits());
    if (paramArrayOfUUID != null)
    {
      localByteBuffer.putInt(paramArrayOfUUID.length);
      k = paramArrayOfUUID.length;
      for (j = i; j < k; j++)
      {
        paramUUID = paramArrayOfUUID[j];
        localByteBuffer.putLong(paramUUID.getMostSignificantBits());
        localByteBuffer.putLong(paramUUID.getLeastSignificantBits());
      }
    }
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0))
    {
      localByteBuffer.putInt(paramArrayOfByte.length);
      localByteBuffer.put(paramArrayOfByte);
    }
    return localByteBuffer.array();
  }
  
  public static boolean isPsshAtom(byte[] paramArrayOfByte)
  {
    boolean bool;
    if (parsePsshAtom(paramArrayOfByte) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Nullable
  private static PsshAtom parsePsshAtom(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new ParsableByteArray(paramArrayOfByte);
    if (paramArrayOfByte.limit() < 32) {
      return null;
    }
    paramArrayOfByte.setPosition(0);
    if (paramArrayOfByte.readInt() != paramArrayOfByte.bytesLeft() + 4) {
      return null;
    }
    if (paramArrayOfByte.readInt() != Atom.TYPE_pssh) {
      return null;
    }
    int i = Atom.parseFullAtomVersion(paramArrayOfByte.readInt());
    if (i > 1)
    {
      paramArrayOfByte = new StringBuilder();
      paramArrayOfByte.append("Unsupported pssh version: ");
      paramArrayOfByte.append(i);
      Log.w("PsshAtomUtil", paramArrayOfByte.toString());
      return null;
    }
    UUID localUUID = new UUID(paramArrayOfByte.readLong(), paramArrayOfByte.readLong());
    if (i == 1) {
      paramArrayOfByte.skipBytes(paramArrayOfByte.readUnsignedIntToInt() * 16);
    }
    int j = paramArrayOfByte.readUnsignedIntToInt();
    if (j != paramArrayOfByte.bytesLeft()) {
      return null;
    }
    byte[] arrayOfByte = new byte[j];
    paramArrayOfByte.readBytes(arrayOfByte, 0, j);
    return new PsshAtom(localUUID, i, arrayOfByte);
  }
  
  @Nullable
  public static byte[] parseSchemeSpecificData(byte[] paramArrayOfByte, UUID paramUUID)
  {
    paramArrayOfByte = parsePsshAtom(paramArrayOfByte);
    if (paramArrayOfByte == null) {
      return null;
    }
    if ((paramUUID != null) && (!paramUUID.equals(PsshAtom.access$000(paramArrayOfByte))))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("UUID mismatch. Expected: ");
      localStringBuilder.append(paramUUID);
      localStringBuilder.append(", got: ");
      localStringBuilder.append(PsshAtom.access$000(paramArrayOfByte));
      localStringBuilder.append(".");
      Log.w("PsshAtomUtil", localStringBuilder.toString());
      return null;
    }
    return PsshAtom.access$200(paramArrayOfByte);
  }
  
  @Nullable
  public static UUID parseUuid(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = parsePsshAtom(paramArrayOfByte);
    if (paramArrayOfByte == null) {
      return null;
    }
    return PsshAtom.access$000(paramArrayOfByte);
  }
  
  public static int parseVersion(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = parsePsshAtom(paramArrayOfByte);
    if (paramArrayOfByte == null) {
      return -1;
    }
    return PsshAtom.access$100(paramArrayOfByte);
  }
  
  public static class PsshAtom
  {
    private final byte[] schemeData;
    private final UUID uuid;
    private final int version;
    
    public PsshAtom(UUID paramUUID, int paramInt, byte[] paramArrayOfByte)
    {
      uuid = paramUUID;
      version = paramInt;
      schemeData = paramArrayOfByte;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */