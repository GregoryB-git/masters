package androidx.window.layout;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public abstract interface FoldingFeature
  extends DisplayFeature
{
  @NotNull
  public abstract OcclusionType getOcclusionType();
  
  @NotNull
  public abstract Orientation getOrientation();
  
  @NotNull
  public abstract State getState();
  
  public abstract boolean isSeparating();
  
  @Metadata
  public static final class OcclusionType
  {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final OcclusionType FULL = new OcclusionType("FULL");
    @NotNull
    public static final OcclusionType NONE = new OcclusionType("NONE");
    @NotNull
    private final String description;
    
    private OcclusionType(String paramString)
    {
      description = paramString;
    }
    
    @NotNull
    public String toString()
    {
      return description;
    }
    
    @Metadata
    public static final class Companion {}
  }
  
  @Metadata
  public static final class Orientation
  {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL");
    @NotNull
    public static final Orientation VERTICAL = new Orientation("VERTICAL");
    @NotNull
    private final String description;
    
    private Orientation(String paramString)
    {
      description = paramString;
    }
    
    @NotNull
    public String toString()
    {
      return description;
    }
    
    @Metadata
    public static final class Companion {}
  }
  
  @Metadata
  public static final class State
  {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final State FLAT = new State("FLAT");
    @NotNull
    public static final State HALF_OPENED = new State("HALF_OPENED");
    @NotNull
    private final String description;
    
    private State(String paramString)
    {
      description = paramString;
    }
    
    @NotNull
    public String toString()
    {
      return description;
    }
    
    @Metadata
    public static final class Companion {}
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.FoldingFeature
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */