package com.facebook.soloader;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public final class UnpackingSoSource$DsoManifest
{
  public final UnpackingSoSource.Dso[] dsos;
  
  public UnpackingSoSource$DsoManifest(UnpackingSoSource.Dso[] paramArrayOfDso)
  {
    dsos = paramArrayOfDso;
  }
  
  public static final DsoManifest read(DataInput paramDataInput)
    throws IOException
  {
    if (paramDataInput.readByte() == 1)
    {
      int i = paramDataInput.readInt();
      if (i >= 0)
      {
        UnpackingSoSource.Dso[] arrayOfDso = new UnpackingSoSource.Dso[i];
        for (int j = 0; j < i; j++) {
          arrayOfDso[j] = new UnpackingSoSource.Dso(paramDataInput.readUTF(), paramDataInput.readUTF());
        }
        return new DsoManifest(arrayOfDso);
      }
      throw new RuntimeException("illegal number of shared libraries");
    }
    throw new RuntimeException("wrong dso manifest version");
  }
  
  public final void write(DataOutput paramDataOutput)
    throws IOException
  {
    paramDataOutput.writeByte(1);
    paramDataOutput.writeInt(dsos.length);
    for (int i = 0;; i++)
    {
      UnpackingSoSource.Dso[] arrayOfDso = dsos;
      if (i >= arrayOfDso.length) {
        break;
      }
      paramDataOutput.writeUTF(name);
      paramDataOutput.writeUTF(dsos[i].hash);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.UnpackingSoSource.DsoManifest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */