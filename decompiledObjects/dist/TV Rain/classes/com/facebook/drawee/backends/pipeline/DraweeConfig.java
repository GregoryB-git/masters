package com.facebook.drawee.backends.pipeline;

import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.Suppliers;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class DraweeConfig
{
  @Nullable
  private final ImmutableList<DrawableFactory> mCustomDrawableFactories;
  private final Supplier<Boolean> mDebugOverlayEnabledSupplier;
  @Nullable
  private final PipelineDraweeControllerFactory mPipelineDraweeControllerFactory;
  
  private DraweeConfig(Builder paramBuilder)
  {
    Object localObject;
    if (Builder.access$000(paramBuilder) != null) {
      localObject = ImmutableList.copyOf(Builder.access$000(paramBuilder));
    } else {
      localObject = null;
    }
    mCustomDrawableFactories = ((ImmutableList)localObject);
    if (Builder.access$100(paramBuilder) != null) {
      localObject = Builder.access$100(paramBuilder);
    } else {
      localObject = Suppliers.of(Boolean.FALSE);
    }
    mDebugOverlayEnabledSupplier = ((Supplier)localObject);
    mPipelineDraweeControllerFactory = Builder.access$200(paramBuilder);
  }
  
  public static Builder newBuilder()
  {
    return new Builder();
  }
  
  @Nullable
  public ImmutableList<DrawableFactory> getCustomDrawableFactories()
  {
    return mCustomDrawableFactories;
  }
  
  public Supplier<Boolean> getDebugOverlayEnabledSupplier()
  {
    return mDebugOverlayEnabledSupplier;
  }
  
  @Nullable
  public PipelineDraweeControllerFactory getPipelineDraweeControllerFactory()
  {
    return mPipelineDraweeControllerFactory;
  }
  
  public static class Builder
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
}

/* Location:
 * Qualified Name:     com.facebook.drawee.backends.pipeline.DraweeConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */