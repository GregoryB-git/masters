package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class LocalContentUriFetchProducer
  extends LocalFetchProducer
{
  public static final String PRODUCER_NAME = "LocalContentUriFetchProducer";
  private static final String[] PROJECTION = { "_id", "_data" };
  private final ContentResolver mContentResolver;
  
  public LocalContentUriFetchProducer(Executor paramExecutor, PooledByteBufferFactory paramPooledByteBufferFactory, ContentResolver paramContentResolver)
  {
    super(paramExecutor, paramPooledByteBufferFactory);
    mContentResolver = paramContentResolver;
  }
  
  @Nullable
  private EncodedImage getCameraImage(Uri paramUri)
    throws IOException
  {
    paramUri = mContentResolver.query(paramUri, PROJECTION, null, null, null);
    if (paramUri == null) {
      return null;
    }
    try
    {
      int i = paramUri.getCount();
      if (i == 0) {
        return null;
      }
      paramUri.moveToFirst();
      Object localObject1 = paramUri.getString(paramUri.getColumnIndex("_data"));
      if (localObject1 != null)
      {
        FileInputStream localFileInputStream = new java/io/FileInputStream;
        localFileInputStream.<init>((String)localObject1);
        localObject1 = getEncodedImage(localFileInputStream, getLength((String)localObject1));
        return (EncodedImage)localObject1;
      }
      return null;
    }
    finally
    {
      paramUri.close();
    }
  }
  
  private static int getLength(String paramString)
  {
    int i;
    if (paramString == null) {
      i = -1;
    } else {
      i = (int)new File(paramString).length();
    }
    return i;
  }
  
  public EncodedImage getEncodedImage(ImageRequest paramImageRequest)
    throws IOException
  {
    Uri localUri = paramImageRequest.getSourceUri();
    if (UriUtil.isLocalContactUri(localUri))
    {
      if (localUri.toString().endsWith("/photo"))
      {
        paramImageRequest = mContentResolver.openInputStream(localUri);
      }
      else
      {
        paramImageRequest = ContactsContract.Contacts.openContactPhotoInputStream(mContentResolver, localUri);
        if (paramImageRequest == null) {
          break label56;
        }
      }
      return getEncodedImage(paramImageRequest, -1);
      label56:
      paramImageRequest = new StringBuilder();
      paramImageRequest.append("Contact photo does not exist: ");
      paramImageRequest.append(localUri);
      throw new IOException(paramImageRequest.toString());
    }
    if (UriUtil.isLocalCameraUri(localUri))
    {
      paramImageRequest = getCameraImage(localUri);
      if (paramImageRequest != null) {
        return paramImageRequest;
      }
    }
    return getEncodedImage(mContentResolver.openInputStream(localUri), -1);
  }
  
  public String getProducerName()
  {
    return "LocalContentUriFetchProducer";
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.LocalContentUriFetchProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */