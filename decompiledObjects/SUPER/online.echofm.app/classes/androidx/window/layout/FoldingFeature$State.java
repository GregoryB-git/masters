package androidx.window.layout;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class FoldingFeature$State
{
  @NotNull
  public static final Companion Companion = new Companion(null);
  @NotNull
  public static final State FLAT = new State("FLAT");
  @NotNull
  public static final State HALF_OPENED = new State("HALF_OPENED");
  @NotNull
  private final String description;
  
  private FoldingFeature$State(String paramString)
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

/* Location:
 * Qualified Name:     androidx.window.layout.FoldingFeature.State
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */