package com.facebook.drawee.backends.pipeline;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.Suppliers;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import java.util.ArrayList;
import java.util.List;

public class DraweeConfig$Builder
{
  private List<DrawableFactory> mCustomDrawableFactories;
  private Supplier<Boolean> mDebugOverlayEnabledSupplier;
  private PipelineDraweeControllerFactory mPipelineDraweeControllerFactory;
  
  public Builder addCustomDrawableFactory(DrawableFactory paramDrawableFactory)
  {
    if (mCustomDrawableFactories == null) {
      mCustomDrawableFactories = new ArrayList();
    }
    mCustomDrawableFactories.add(paramDrawableFactory);
    return this;
  }
  
  public DraweeConfig build()
  {
    return new DraweeConfig(this, null);
  }
  
  public Builder setDebugOverlayEnabledSupplier(Supplier<Boolean> paramSupplier)
  {
    Preconditions.checkNotNull(paramSupplier);
    mDebugOverlayEnabledSupplier = paramSupplier;
    return this;
  }
  
  public Builder setDrawDebugOverlay(boolean paramBoolean)
  {
    return setDebugOverlayEnabledSupplier(Suppliers.of(Boolean.valueOf(paramBoolean)));
  }
  
  public Builder setPipelineDraweeControllerFactory(PipelineDraweeControllerFactory paramPipelineDraweeControllerFactory)
  {
    mPipelineDraweeControllerFactory = paramPipelineDraweeControllerFactory;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.backends.pipeline.DraweeConfig.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */