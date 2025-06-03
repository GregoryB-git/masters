package com.facebook.imagepipeline.nativecode;

import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImagePipelineNativeLoader
{
  public static final List<String> DEPENDENCIES = Collections.unmodifiableList(new ArrayList());
  public static final String DSO_NAME = "imagepipeline";
  
  public static void load()
  {
    SoLoader.loadLibrary("imagepipeline");
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.nativecode.ImagePipelineNativeLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */