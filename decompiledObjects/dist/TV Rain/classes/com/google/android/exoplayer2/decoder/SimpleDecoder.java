package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayDeque;

public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends OutputBuffer, E extends Exception>
  implements Decoder<I, O, E>
{
  private int availableInputBufferCount;
  private final I[] availableInputBuffers;
  private int availableOutputBufferCount;
  private final O[] availableOutputBuffers;
  private final Thread decodeThread;
  private I dequeuedInputBuffer;
  private E exception;
  private boolean flushed;
  private final Object lock = new Object();
  private final ArrayDeque<I> queuedInputBuffers = new ArrayDeque();
  private final ArrayDeque<O> queuedOutputBuffers = new ArrayDeque();
  private boolean released;
  private int skippedOutputBufferCount;
  
  public SimpleDecoder(I[] paramArrayOfI, O[] paramArrayOfO)
  {
    availableInputBuffers = paramArrayOfI;
    availableInputBufferCount = paramArrayOfI.length;
    int i = 0;
    for (int j = 0; j < availableInputBufferCount; j++) {
      availableInputBuffers[j] = createInputBuffer();
    }
    availableOutputBuffers = paramArrayOfO;
    availableOutputBufferCount = paramArrayOfO.length;
    for (j = i; j < availableOutputBufferCount; j++) {
      availableOutputBuffers[j] = createOutputBuffer();
    }
    paramArrayOfI = new Thread()
    {
      public void run()
      {
        SimpleDecoder.access$000(SimpleDecoder.this);
      }
    };
    decodeThread = paramArrayOfI;
    paramArrayOfI.start();
  }
  
  private boolean canDecodeBuffer()
  {
    boolean bool;
    if ((!queuedInputBuffers.isEmpty()) && (availableOutputBufferCount > 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean decode()
    throws InterruptedException
  {
    synchronized (lock)
    {
      while ((!released) && (!canDecodeBuffer())) {
        lock.wait();
      }
      if (released) {
        return false;
      }
      ??? = (DecoderInputBuffer)queuedInputBuffers.removeFirst();
      Object localObject6 = availableOutputBuffers;
      int i = availableOutputBufferCount - 1;
      availableOutputBufferCount = i;
      localObject6 = localObject6[i];
      boolean bool = flushed;
      flushed = false;
      if (((Buffer)???).isEndOfStream())
      {
        ((Buffer)localObject6).addFlag(4);
      }
      else
      {
        if (((Buffer)???).isDecodeOnly()) {
          ((Buffer)localObject6).addFlag(Integer.MIN_VALUE);
        }
        try
        {
          exception = decode((DecoderInputBuffer)???, (OutputBuffer)localObject6, bool);
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          exception = createUnexpectedDecodeException(localOutOfMemoryError);
        }
        catch (RuntimeException localRuntimeException)
        {
          exception = createUnexpectedDecodeException(localRuntimeException);
        }
        if (exception != null) {
          synchronized (lock)
          {
            return false;
          }
        }
      }
      synchronized (lock)
      {
        if (flushed)
        {
          ((OutputBuffer)localObject7).release();
        }
        else if (((Buffer)localObject7).isDecodeOnly())
        {
          skippedOutputBufferCount += 1;
          ((OutputBuffer)localObject7).release();
        }
        else
        {
          skippedOutputBufferCount = skippedOutputBufferCount;
          skippedOutputBufferCount = 0;
          queuedOutputBuffers.addLast(localObject7);
        }
        releaseInputBufferInternal((DecoderInputBuffer)???);
        return true;
      }
    }
  }
  
  private void maybeNotifyDecodeLoop()
  {
    if (canDecodeBuffer()) {
      lock.notify();
    }
  }
  
  private void maybeThrowException()
    throws Exception
  {
    Exception localException = exception;
    if (localException == null) {
      return;
    }
    throw localException;
  }
  
  private void releaseInputBufferInternal(I paramI)
  {
    paramI.clear();
    DecoderInputBuffer[] arrayOfDecoderInputBuffer = availableInputBuffers;
    int i = availableInputBufferCount;
    availableInputBufferCount = (i + 1);
    arrayOfDecoderInputBuffer[i] = paramI;
  }
  
  private void releaseOutputBufferInternal(O paramO)
  {
    paramO.clear();
    OutputBuffer[] arrayOfOutputBuffer = availableOutputBuffers;
    int i = availableOutputBufferCount;
    availableOutputBufferCount = (i + 1);
    arrayOfOutputBuffer[i] = paramO;
  }
  
  private void run()
  {
    try
    {
      boolean bool;
      do
      {
        bool = decode();
      } while (bool);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new IllegalStateException(localInterruptedException);
    }
  }
  
  public abstract I createInputBuffer();
  
  public abstract O createOutputBuffer();
  
  public abstract E createUnexpectedDecodeException(Throwable paramThrowable);
  
  @Nullable
  public abstract E decode(I paramI, O paramO, boolean paramBoolean);
  
  public final I dequeueInputBuffer()
    throws Exception
  {
    synchronized (lock)
    {
      maybeThrowException();
      boolean bool;
      if (dequeuedInputBuffer == null) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      int i = availableInputBufferCount;
      Object localObject2;
      if (i == 0)
      {
        localObject2 = null;
      }
      else
      {
        localObject2 = availableInputBuffers;
        i--;
        availableInputBufferCount = i;
        localObject2 = localObject2[i];
      }
      dequeuedInputBuffer = ((DecoderInputBuffer)localObject2);
      return (I)localObject2;
    }
  }
  
  public final O dequeueOutputBuffer()
    throws Exception
  {
    synchronized (lock)
    {
      maybeThrowException();
      if (queuedOutputBuffers.isEmpty()) {
        return null;
      }
      OutputBuffer localOutputBuffer = (OutputBuffer)queuedOutputBuffers.removeFirst();
      return localOutputBuffer;
    }
  }
  
  public final void flush()
  {
    synchronized (lock)
    {
      flushed = true;
      skippedOutputBufferCount = 0;
      DecoderInputBuffer localDecoderInputBuffer = dequeuedInputBuffer;
      if (localDecoderInputBuffer != null)
      {
        releaseInputBufferInternal(localDecoderInputBuffer);
        dequeuedInputBuffer = null;
      }
      while (!queuedInputBuffers.isEmpty()) {
        releaseInputBufferInternal((DecoderInputBuffer)queuedInputBuffers.removeFirst());
      }
      while (!queuedOutputBuffers.isEmpty()) {
        ((OutputBuffer)queuedOutputBuffers.removeFirst()).release();
      }
      return;
    }
  }
  
  public final void queueInputBuffer(I paramI)
    throws Exception
  {
    synchronized (lock)
    {
      maybeThrowException();
      boolean bool;
      if (paramI == dequeuedInputBuffer) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkArgument(bool);
      queuedInputBuffers.addLast(paramI);
      maybeNotifyDecodeLoop();
      dequeuedInputBuffer = null;
      return;
    }
  }
  
  public void release()
  {
    synchronized (lock)
    {
      released = true;
      lock.notify();
      try
      {
        decodeThread.join();
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
      }
      return;
    }
  }
  
  public void releaseOutputBuffer(O paramO)
  {
    synchronized (lock)
    {
      releaseOutputBufferInternal(paramO);
      maybeNotifyDecodeLoop();
      return;
    }
  }
  
  public final void setInitialInputBufferSize(int paramInt)
  {
    int i = availableInputBufferCount;
    int j = availableInputBuffers.length;
    int k = 0;
    boolean bool;
    if (i == j) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    DecoderInputBuffer[] arrayOfDecoderInputBuffer = availableInputBuffers;
    j = arrayOfDecoderInputBuffer.length;
    while (k < j)
    {
      arrayOfDecoderInputBuffer[k].ensureSpaceForWrite(paramInt);
      k++;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.decoder.SimpleDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */