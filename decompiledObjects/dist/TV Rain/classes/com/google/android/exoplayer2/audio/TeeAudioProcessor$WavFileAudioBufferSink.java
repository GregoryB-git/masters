package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class TeeAudioProcessor$WavFileAudioBufferSink
  implements TeeAudioProcessor.AudioBufferSink
{
  private static final int FILE_SIZE_MINUS_44_OFFSET = 40;
  private static final int FILE_SIZE_MINUS_8_OFFSET = 4;
  private static final int HEADER_LENGTH = 44;
  private static final String TAG = "WaveFileAudioBufferSink";
  private int bytesWritten;
  private int channelCount;
  private int counter;
  private int encoding;
  private final String outputFileNamePrefix;
  @Nullable
  private RandomAccessFile randomAccessFile;
  private int sampleRateHz;
  private final byte[] scratchBuffer;
  private final ByteBuffer scratchByteBuffer;
  
  public TeeAudioProcessor$WavFileAudioBufferSink(String paramString)
  {
    outputFileNamePrefix = paramString;
    paramString = new byte['Ѐ'];
    scratchBuffer = paramString;
    scratchByteBuffer = ByteBuffer.wrap(paramString).order(ByteOrder.LITTLE_ENDIAN);
  }
  
  private String getNextOutputFileName()
  {
    String str = outputFileNamePrefix;
    int i = counter;
    counter = (i + 1);
    return Util.formatInvariant("%s-%04d.wav", new Object[] { str, Integer.valueOf(i) });
  }
  
  private void maybePrepareFile()
    throws IOException
  {
    if (randomAccessFile != null) {
      return;
    }
    RandomAccessFile localRandomAccessFile = new RandomAccessFile(getNextOutputFileName(), "rw");
    writeFileHeader(localRandomAccessFile);
    randomAccessFile = localRandomAccessFile;
    bytesWritten = 44;
  }
  
  private void reset()
    throws IOException
  {
    RandomAccessFile localRandomAccessFile = randomAccessFile;
    if (localRandomAccessFile == null) {
      return;
    }
    try
    {
      scratchByteBuffer.clear();
      scratchByteBuffer.putInt(bytesWritten - 8);
      localRandomAccessFile.seek(4L);
      localRandomAccessFile.write(scratchBuffer, 0, 4);
      scratchByteBuffer.clear();
      scratchByteBuffer.putInt(bytesWritten - 44);
      localRandomAccessFile.seek(40L);
      localRandomAccessFile.write(scratchBuffer, 0, 4);
    }
    catch (IOException localIOException)
    {
      Log.w("WaveFileAudioBufferSink", "Error updating file size", localIOException);
    }
    try
    {
      localRandomAccessFile.close();
      return;
    }
    finally
    {
      randomAccessFile = null;
    }
  }
  
  private void writeBuffer(ByteBuffer paramByteBuffer)
    throws IOException
  {
    RandomAccessFile localRandomAccessFile = (RandomAccessFile)Assertions.checkNotNull(randomAccessFile);
    while (paramByteBuffer.hasRemaining())
    {
      int i = Math.min(paramByteBuffer.remaining(), scratchBuffer.length);
      paramByteBuffer.get(scratchBuffer, 0, i);
      localRandomAccessFile.write(scratchBuffer, 0, i);
      bytesWritten += i;
    }
  }
  
  private void writeFileHeader(RandomAccessFile paramRandomAccessFile)
    throws IOException
  {
    paramRandomAccessFile.writeInt(WavUtil.RIFF_FOURCC);
    paramRandomAccessFile.writeInt(-1);
    paramRandomAccessFile.writeInt(WavUtil.WAVE_FOURCC);
    paramRandomAccessFile.writeInt(WavUtil.FMT_FOURCC);
    scratchByteBuffer.clear();
    scratchByteBuffer.putInt(16);
    scratchByteBuffer.putShort((short)WavUtil.getTypeForEncoding(encoding));
    scratchByteBuffer.putShort((short)channelCount);
    scratchByteBuffer.putInt(sampleRateHz);
    int i = Util.getPcmFrameSize(encoding, channelCount);
    scratchByteBuffer.putInt(sampleRateHz * i);
    scratchByteBuffer.putShort((short)i);
    scratchByteBuffer.putShort((short)(i * 8 / channelCount));
    paramRandomAccessFile.write(scratchBuffer, 0, scratchByteBuffer.position());
    paramRandomAccessFile.writeInt(WavUtil.DATA_FOURCC);
    paramRandomAccessFile.writeInt(-1);
  }
  
  public void flush(int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      reset();
    }
    catch (IOException localIOException)
    {
      Log.e("WaveFileAudioBufferSink", "Error resetting", localIOException);
    }
    sampleRateHz = paramInt1;
    channelCount = paramInt2;
    encoding = paramInt3;
  }
  
  public void handleBuffer(ByteBuffer paramByteBuffer)
  {
    try
    {
      maybePrepareFile();
      writeBuffer(paramByteBuffer);
    }
    catch (IOException paramByteBuffer)
    {
      Log.e("WaveFileAudioBufferSink", "Error writing data", paramByteBuffer);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.TeeAudioProcessor.WavFileAudioBufferSink
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */