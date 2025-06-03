package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

class ResizeAndRotateProducer$TransformingConsumer
  extends DelegatingConsumer<EncodedImage, EncodedImage>
{
  private boolean mIsCancelled = false;
  private final JobScheduler mJobScheduler;
  private final ProducerContext mProducerContext;
  
  public ResizeAndRotateProducer$TransformingConsumer(final Consumer<EncodedImage> paramConsumer, final ProducerContext paramProducerContext)
  {
    super(paramProducerContext);
    ProducerContext localProducerContext;
    mProducerContext = localProducerContext;
    JobScheduler.JobRunnable local1 = new JobScheduler.JobRunnable()
    {
      public void run(EncodedImage paramAnonymousEncodedImage, int paramAnonymousInt)
      {
        ResizeAndRotateProducer.TransformingConsumer.access$000(ResizeAndRotateProducer.TransformingConsumer.this, paramAnonymousEncodedImage, paramAnonymousInt);
      }
    };
    mJobScheduler = new JobScheduler(ResizeAndRotateProducer.access$100(paramConsumer), local1, 100);
    localProducerContext.addCallbacks(new BaseProducerContextCallbacks()
    {
      public void onCancellationRequested()
      {
        ResizeAndRotateProducer.TransformingConsumer.access$300(ResizeAndRotateProducer.TransformingConsumer.this).clearJob();
        ResizeAndRotateProducer.TransformingConsumer.access$402(ResizeAndRotateProducer.TransformingConsumer.this, true);
        paramProducerContext.onCancellation();
      }
      
      public void onIsIntermediateResultExpectedChanged()
      {
        if (ResizeAndRotateProducer.TransformingConsumer.access$200(ResizeAndRotateProducer.TransformingConsumer.this).isIntermediateResultExpected()) {
          ResizeAndRotateProducer.TransformingConsumer.access$300(ResizeAndRotateProducer.TransformingConsumer.this).scheduleJob();
        }
      }
    });
  }
  
  /* Error */
  private void doTransform(EncodedImage paramEncodedImage, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 31	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
    //   4: invokeinterface 75 1 0
    //   9: aload_0
    //   10: getfield 31	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
    //   13: invokeinterface 79 1 0
    //   18: ldc 81
    //   20: invokeinterface 87 3 0
    //   25: aload_0
    //   26: getfield 31	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
    //   29: invokeinterface 91 1 0
    //   34: astore_3
    //   35: aload_0
    //   36: getfield 24	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:this$0	Lcom/facebook/imagepipeline/producers/ResizeAndRotateProducer;
    //   39: invokestatic 95	com/facebook/imagepipeline/producers/ResizeAndRotateProducer:access$700	(Lcom/facebook/imagepipeline/producers/ResizeAndRotateProducer;)Lcom/facebook/common/memory/PooledByteBufferFactory;
    //   42: invokeinterface 101 1 0
    //   47: astore 4
    //   49: aconst_null
    //   50: astore 5
    //   52: aconst_null
    //   53: astore 6
    //   55: aconst_null
    //   56: astore 7
    //   58: aload_3
    //   59: aload_1
    //   60: aload_0
    //   61: getfield 24	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:this$0	Lcom/facebook/imagepipeline/producers/ResizeAndRotateProducer;
    //   64: invokestatic 105	com/facebook/imagepipeline/producers/ResizeAndRotateProducer:access$500	(Lcom/facebook/imagepipeline/producers/ResizeAndRotateProducer;)Z
    //   67: invokestatic 109	com/facebook/imagepipeline/producers/ResizeAndRotateProducer:access$800	(Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/image/EncodedImage;Z)I
    //   70: istore 8
    //   72: aload_3
    //   73: aload_1
    //   74: invokestatic 115	com/facebook/imagepipeline/producers/DownsampleUtil:determineSampleSize	(Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/image/EncodedImage;)I
    //   77: istore 9
    //   79: iload 9
    //   81: invokestatic 119	com/facebook/imagepipeline/producers/ResizeAndRotateProducer:calculateDownsampleNumerator	(I)I
    //   84: istore 10
    //   86: aload_0
    //   87: getfield 24	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:this$0	Lcom/facebook/imagepipeline/producers/ResizeAndRotateProducer;
    //   90: invokestatic 122	com/facebook/imagepipeline/producers/ResizeAndRotateProducer:access$900	(Lcom/facebook/imagepipeline/producers/ResizeAndRotateProducer;)Z
    //   93: ifeq +10 -> 103
    //   96: iload 10
    //   98: istore 11
    //   100: goto +7 -> 107
    //   103: iload 8
    //   105: istore 11
    //   107: aload_1
    //   108: invokevirtual 128	com/facebook/imagepipeline/image/EncodedImage:getInputStream	()Ljava/io/InputStream;
    //   111: astore 12
    //   113: aload 7
    //   115: astore 6
    //   117: aload 12
    //   119: astore 5
    //   121: invokestatic 132	com/facebook/imagepipeline/producers/ResizeAndRotateProducer:access$1000	()Lcom/facebook/common/internal/ImmutableList;
    //   124: aload_1
    //   125: invokevirtual 136	com/facebook/imagepipeline/image/EncodedImage:getExifOrientation	()I
    //   128: invokestatic 142	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   131: invokevirtual 148	java/util/AbstractCollection:contains	(Ljava/lang/Object;)Z
    //   134: ifeq +66 -> 200
    //   137: aload 7
    //   139: astore 6
    //   141: aload 12
    //   143: astore 5
    //   145: aload_3
    //   146: invokevirtual 154	com/facebook/imagepipeline/request/ImageRequest:getRotationOptions	()Lcom/facebook/imagepipeline/common/RotationOptions;
    //   149: aload_1
    //   150: invokestatic 158	com/facebook/imagepipeline/producers/ResizeAndRotateProducer:access$1100	(Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/image/EncodedImage;)I
    //   153: istore 13
    //   155: aload 7
    //   157: astore 6
    //   159: aload 12
    //   161: astore 5
    //   163: aload_0
    //   164: aload_1
    //   165: aload_3
    //   166: iload 11
    //   168: iload 10
    //   170: iload 8
    //   172: iconst_0
    //   173: invokespecial 162	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:getExtraMap	(Lcom/facebook/imagepipeline/image/EncodedImage;Lcom/facebook/imagepipeline/request/ImageRequest;IIII)Ljava/util/Map;
    //   176: astore_1
    //   177: aload_1
    //   178: astore 6
    //   180: aload 12
    //   182: astore 5
    //   184: aload 12
    //   186: aload 4
    //   188: iload 13
    //   190: iload 11
    //   192: bipush 85
    //   194: invokestatic 168	com/facebook/imagepipeline/nativecode/JpegTranscoder:transcodeJpegWithExifOrientation	(Ljava/io/InputStream;Ljava/io/OutputStream;III)V
    //   197: goto +64 -> 261
    //   200: aload 7
    //   202: astore 6
    //   204: aload 12
    //   206: astore 5
    //   208: aload_3
    //   209: invokevirtual 154	com/facebook/imagepipeline/request/ImageRequest:getRotationOptions	()Lcom/facebook/imagepipeline/common/RotationOptions;
    //   212: aload_1
    //   213: invokestatic 171	com/facebook/imagepipeline/producers/ResizeAndRotateProducer:access$1200	(Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/image/EncodedImage;)I
    //   216: istore 13
    //   218: aload 7
    //   220: astore 6
    //   222: aload 12
    //   224: astore 5
    //   226: aload_0
    //   227: aload_1
    //   228: aload_3
    //   229: iload 11
    //   231: iload 10
    //   233: iload 8
    //   235: iload 13
    //   237: invokespecial 162	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:getExtraMap	(Lcom/facebook/imagepipeline/image/EncodedImage;Lcom/facebook/imagepipeline/request/ImageRequest;IIII)Ljava/util/Map;
    //   240: astore_1
    //   241: aload_1
    //   242: astore 6
    //   244: aload 12
    //   246: astore 5
    //   248: aload 12
    //   250: aload 4
    //   252: iload 13
    //   254: iload 11
    //   256: bipush 85
    //   258: invokestatic 174	com/facebook/imagepipeline/nativecode/JpegTranscoder:transcodeJpeg	(Ljava/io/InputStream;Ljava/io/OutputStream;III)V
    //   261: aload_1
    //   262: astore 6
    //   264: aload 12
    //   266: astore 5
    //   268: aload 4
    //   270: invokevirtual 180	com/facebook/common/memory/PooledByteBufferOutputStream:toByteBuffer	()Lcom/facebook/common/memory/PooledByteBuffer;
    //   273: invokestatic 186	com/facebook/common/references/CloseableReference:of	(Ljava/io/Closeable;)Lcom/facebook/common/references/CloseableReference;
    //   276: astore 7
    //   278: new 124	com/facebook/imagepipeline/image/EncodedImage
    //   281: astore 5
    //   283: aload 5
    //   285: aload 7
    //   287: invokespecial 189	com/facebook/imagepipeline/image/EncodedImage:<init>	(Lcom/facebook/common/references/CloseableReference;)V
    //   290: aload 5
    //   292: getstatic 195	com/facebook/imageformat/DefaultImageFormats:JPEG	Lcom/facebook/imageformat/ImageFormat;
    //   295: invokevirtual 199	com/facebook/imagepipeline/image/EncodedImage:setImageFormat	(Lcom/facebook/imageformat/ImageFormat;)V
    //   298: aload 5
    //   300: invokevirtual 203	com/facebook/imagepipeline/image/EncodedImage:parseMetaData	()V
    //   303: aload_0
    //   304: getfield 31	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
    //   307: invokeinterface 75 1 0
    //   312: aload_0
    //   313: getfield 31	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
    //   316: invokeinterface 79 1 0
    //   321: ldc 81
    //   323: aload_1
    //   324: invokeinterface 207 4 0
    //   329: iload 9
    //   331: iconst_1
    //   332: if_icmpeq +11 -> 343
    //   335: iload_2
    //   336: bipush 16
    //   338: ior
    //   339: istore_2
    //   340: goto +3 -> 343
    //   343: aload_0
    //   344: invokevirtual 211	com/facebook/imagepipeline/producers/DelegatingConsumer:getConsumer	()Lcom/facebook/imagepipeline/producers/Consumer;
    //   347: aload 5
    //   349: iload_2
    //   350: invokeinterface 217 3 0
    //   355: iload_2
    //   356: istore 11
    //   358: aload 5
    //   360: invokestatic 221	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
    //   363: aload 12
    //   365: astore 5
    //   367: aload 7
    //   369: invokestatic 223	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   372: aload 12
    //   374: invokestatic 229	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   377: aload 4
    //   379: invokevirtual 232	com/facebook/common/memory/PooledByteBufferOutputStream:close	()V
    //   382: return
    //   383: astore 6
    //   385: goto +5 -> 390
    //   388: astore 6
    //   390: iload_2
    //   391: istore 11
    //   393: aload 5
    //   395: invokestatic 221	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
    //   398: iload_2
    //   399: istore 11
    //   401: aload 6
    //   403: athrow
    //   404: astore 6
    //   406: goto +8 -> 414
    //   409: astore 6
    //   411: iload_2
    //   412: istore 11
    //   414: iload 11
    //   416: istore_2
    //   417: aload 12
    //   419: astore 5
    //   421: aload 7
    //   423: invokestatic 223	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   426: iload 11
    //   428: istore_2
    //   429: aload 12
    //   431: astore 5
    //   433: aload 6
    //   435: athrow
    //   436: astore 7
    //   438: aload 12
    //   440: astore 6
    //   442: goto +27 -> 469
    //   445: astore 7
    //   447: aload 6
    //   449: astore_1
    //   450: aload 12
    //   452: astore 6
    //   454: goto +15 -> 469
    //   457: astore_1
    //   458: goto +85 -> 543
    //   461: astore 7
    //   463: aconst_null
    //   464: astore 6
    //   466: aload 5
    //   468: astore_1
    //   469: aload 6
    //   471: astore 5
    //   473: aload_0
    //   474: getfield 31	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
    //   477: invokeinterface 75 1 0
    //   482: aload_0
    //   483: getfield 31	com/facebook/imagepipeline/producers/ResizeAndRotateProducer$TransformingConsumer:mProducerContext	Lcom/facebook/imagepipeline/producers/ProducerContext;
    //   486: invokeinterface 79 1 0
    //   491: ldc 81
    //   493: aload 7
    //   495: aload_1
    //   496: invokeinterface 236 5 0
    //   501: aload 6
    //   503: astore 5
    //   505: iload_2
    //   506: invokestatic 242	com/facebook/imagepipeline/producers/BaseConsumer:isLast	(I)Z
    //   509: ifeq +18 -> 527
    //   512: aload 6
    //   514: astore 5
    //   516: aload_0
    //   517: invokevirtual 211	com/facebook/imagepipeline/producers/DelegatingConsumer:getConsumer	()Lcom/facebook/imagepipeline/producers/Consumer;
    //   520: aload 7
    //   522: invokeinterface 246 2 0
    //   527: aload 6
    //   529: invokestatic 229	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   532: aload 4
    //   534: invokevirtual 232	com/facebook/common/memory/PooledByteBufferOutputStream:close	()V
    //   537: return
    //   538: astore_1
    //   539: aload 5
    //   541: astore 6
    //   543: aload 6
    //   545: invokestatic 229	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   548: aload 4
    //   550: invokevirtual 232	com/facebook/common/memory/PooledByteBufferOutputStream:close	()V
    //   553: aload_1
    //   554: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	555	0	this	TransformingConsumer
    //   0	555	1	paramEncodedImage	EncodedImage
    //   0	555	2	paramInt	int
    //   34	195	3	localImageRequest	ImageRequest
    //   47	502	4	localPooledByteBufferOutputStream	com.facebook.common.memory.PooledByteBufferOutputStream
    //   50	490	5	localObject1	Object
    //   53	210	6	localObject2	Object
    //   383	1	6	localObject3	Object
    //   388	14	6	localObject4	Object
    //   404	1	6	localObject5	Object
    //   409	25	6	localObject6	Object
    //   440	104	6	localObject7	Object
    //   56	366	7	localCloseableReference	com.facebook.common.references.CloseableReference
    //   436	1	7	localException1	Exception
    //   445	1	7	localException2	Exception
    //   461	60	7	localException3	Exception
    //   70	164	8	i	int
    //   77	256	9	j	int
    //   84	148	10	k	int
    //   98	329	11	m	int
    //   111	340	12	localInputStream	java.io.InputStream
    //   153	100	13	n	int
    // Exception table:
    //   from	to	target	type
    //   343	355	383	finally
    //   298	329	388	finally
    //   358	363	404	finally
    //   393	398	404	finally
    //   401	404	404	finally
    //   278	298	409	finally
    //   367	372	436	java/lang/Exception
    //   421	426	436	java/lang/Exception
    //   433	436	436	java/lang/Exception
    //   121	137	445	java/lang/Exception
    //   145	155	445	java/lang/Exception
    //   163	177	445	java/lang/Exception
    //   184	197	445	java/lang/Exception
    //   208	218	445	java/lang/Exception
    //   226	241	445	java/lang/Exception
    //   248	261	445	java/lang/Exception
    //   268	278	445	java/lang/Exception
    //   58	96	457	finally
    //   107	113	457	finally
    //   58	96	461	java/lang/Exception
    //   107	113	461	java/lang/Exception
    //   121	137	538	finally
    //   145	155	538	finally
    //   163	177	538	finally
    //   184	197	538	finally
    //   208	218	538	finally
    //   226	241	538	finally
    //   248	261	538	finally
    //   268	278	538	finally
    //   367	372	538	finally
    //   421	426	538	finally
    //   433	436	538	finally
    //   473	501	538	finally
    //   505	512	538	finally
    //   516	527	538	finally
  }
  
  private Map<String, String> getExtraMap(EncodedImage paramEncodedImage, ImageRequest paramImageRequest, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!mProducerContext.getListener().requiresExtraMap(mProducerContext.getId())) {
      return null;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramEncodedImage.getWidth());
    ((StringBuilder)localObject).append("x");
    ((StringBuilder)localObject).append(paramEncodedImage.getHeight());
    localObject = ((StringBuilder)localObject).toString();
    if (paramImageRequest.getResizeOptions() != null)
    {
      paramEncodedImage = new StringBuilder();
      paramEncodedImage.append(getResizeOptionswidth);
      paramEncodedImage.append("x");
      paramEncodedImage.append(getResizeOptionsheight);
      paramEncodedImage = paramEncodedImage.toString();
    }
    else
    {
      paramEncodedImage = "Unspecified";
    }
    if (paramInt1 > 0)
    {
      paramImageRequest = new StringBuilder();
      paramImageRequest.append(paramInt1);
      paramImageRequest.append("/8");
      paramImageRequest = paramImageRequest.toString();
    }
    else
    {
      paramImageRequest = "";
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("Original size", localObject);
    localHashMap.put("Requested size", paramEncodedImage);
    localHashMap.put("Fraction", paramImageRequest);
    localHashMap.put("queueTime", String.valueOf(mJobScheduler.getQueuedTime()));
    localHashMap.put("downsampleEnumerator", Integer.toString(paramInt2));
    localHashMap.put("softwareEnumerator", Integer.toString(paramInt3));
    localHashMap.put("rotationAngle", Integer.toString(paramInt4));
    return ImmutableMap.copyOf(localHashMap);
  }
  
  private EncodedImage moveImage(EncodedImage paramEncodedImage)
  {
    EncodedImage localEncodedImage = EncodedImage.cloneOrNull(paramEncodedImage);
    paramEncodedImage.close();
    return localEncodedImage;
  }
  
  public void onNewResultImpl(@Nullable EncodedImage paramEncodedImage, int paramInt)
  {
    if (mIsCancelled) {
      return;
    }
    boolean bool = BaseConsumer.isLast(paramInt);
    if (paramEncodedImage == null)
    {
      if (bool) {
        getConsumer().onNewResult(null, 1);
      }
      return;
    }
    Object localObject = ResizeAndRotateProducer.access$600(mProducerContext.getImageRequest(), paramEncodedImage, ResizeAndRotateProducer.access$500(this$0));
    if ((!bool) && (localObject == TriState.UNSET)) {
      return;
    }
    if (localObject != TriState.YES)
    {
      localObject = paramEncodedImage;
      if (!mProducerContext.getImageRequest().getRotationOptions().canDeferUntilRendered())
      {
        localObject = paramEncodedImage;
        if (paramEncodedImage.getRotationAngle() != 0)
        {
          localObject = paramEncodedImage;
          if (paramEncodedImage.getRotationAngle() != -1)
          {
            localObject = moveImage(paramEncodedImage);
            ((EncodedImage)localObject).setRotationAngle(0);
          }
        }
      }
      getConsumer().onNewResult(localObject, paramInt);
      return;
    }
    if (!mJobScheduler.updateJob(paramEncodedImage, paramInt)) {
      return;
    }
    if ((bool) || (mProducerContext.isIntermediateResultExpected())) {
      mJobScheduler.scheduleJob();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.ResizeAndRotateProducer.TransformingConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */