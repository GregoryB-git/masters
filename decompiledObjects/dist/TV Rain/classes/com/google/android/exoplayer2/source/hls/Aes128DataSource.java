package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceInputStream;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

class Aes128DataSource
  implements DataSource
{
  @Nullable
  private CipherInputStream cipherInputStream;
  private final byte[] encryptionIv;
  private final byte[] encryptionKey;
  private final DataSource upstream;
  
  public Aes128DataSource(DataSource paramDataSource, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    upstream = paramDataSource;
    encryptionKey = paramArrayOfByte1;
    encryptionIv = paramArrayOfByte2;
  }
  
  public final void addTransferListener(TransferListener paramTransferListener)
  {
    upstream.addTransferListener(paramTransferListener);
  }
  
  public void close()
    throws IOException
  {
    if (cipherInputStream != null)
    {
      cipherInputStream = null;
      upstream.close();
    }
  }
  
  public Cipher getCipherInstance()
    throws NoSuchPaddingException, NoSuchAlgorithmException
  {
    return Cipher.getInstance("AES/CBC/PKCS7Padding");
  }
  
  public final Map<String, List<String>> getResponseHeaders()
  {
    return upstream.getResponseHeaders();
  }
  
  @Nullable
  public final Uri getUri()
  {
    return upstream.getUri();
  }
  
  public final long open(DataSpec paramDataSpec)
    throws IOException
  {
    try
    {
      Cipher localCipher = getCipherInstance();
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(encryptionKey, "AES");
      IvParameterSpec localIvParameterSpec = new IvParameterSpec(encryptionIv);
      try
      {
        localCipher.init(2, localSecretKeySpec, localIvParameterSpec);
        paramDataSpec = new DataSourceInputStream(upstream, paramDataSpec);
        cipherInputStream = new CipherInputStream(paramDataSpec, localCipher);
        paramDataSpec.open();
        return -1L;
      }
      catch (InvalidAlgorithmParameterException paramDataSpec) {}catch (InvalidKeyException paramDataSpec) {}
      throw new RuntimeException(paramDataSpec);
    }
    catch (NoSuchPaddingException paramDataSpec) {}catch (NoSuchAlgorithmException paramDataSpec) {}
    throw new RuntimeException(paramDataSpec);
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    Assertions.checkNotNull(cipherInputStream);
    paramInt2 = cipherInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
    paramInt1 = paramInt2;
    if (paramInt2 < 0) {
      paramInt1 = -1;
    }
    return paramInt1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.Aes128DataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */