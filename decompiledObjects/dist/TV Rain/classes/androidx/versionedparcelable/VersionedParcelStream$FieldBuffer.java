package androidx.versionedparcelable;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

class VersionedParcelStream$FieldBuffer
{
  public final DataOutputStream mDataStream;
  private final int mFieldId;
  public final ByteArrayOutputStream mOutput;
  private final DataOutputStream mTarget;
  
  public VersionedParcelStream$FieldBuffer(int paramInt, DataOutputStream paramDataOutputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    mOutput = localByteArrayOutputStream;
    mDataStream = new DataOutputStream(localByteArrayOutputStream);
    mFieldId = paramInt;
    mTarget = paramDataOutputStream;
  }
  
  public void flushField()
    throws IOException
  {
    mDataStream.flush();
    int i = mOutput.size();
    int j = mFieldId;
    int k;
    if (i >= 65535) {
      k = 65535;
    } else {
      k = i;
    }
    mTarget.writeInt(j << 16 | k);
    if (i >= 65535) {
      mTarget.writeInt(i);
    }
    mOutput.writeTo(mTarget);
  }
}

/* Location:
 * Qualified Name:     androidx.versionedparcelable.VersionedParcelStream.FieldBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */