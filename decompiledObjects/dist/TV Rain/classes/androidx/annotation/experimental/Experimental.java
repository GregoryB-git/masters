package androidx.annotation.experimental;

import java.lang.annotation.Annotation;
import java.lang.annotation.RetentionPolicy;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.annotation.AnnotationRetention;

@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Deprecated(message="This annotation has been replaced by `@RequiresOptIn`", replaceWith=@ReplaceWith(expression="RequiresOptIn", imports={"androidx.annotation.RequiresOptIn"}))
@Metadata(d1={"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\030\002\n\002\b\003\b\002\030\0002\0020\001:\001\005B\n\022\b\b\002\020\002\032\0020\003R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\004¨\006\006"}, d2={"Landroidx/annotation/experimental/Experimental;", "", "level", "Landroidx/annotation/experimental/Experimental$Level;", "()Landroidx/annotation/experimental/Experimental$Level;", "Level", "annotation-experimental_release"}, k=1, mv={1, 7, 1}, xi=48)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
public @interface Experimental
{
  Level level() default Level.ERROR;
  
  @Metadata(d1={"\000\f\n\002\030\002\n\002\020\020\n\002\b\004\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\005"}, d2={"Landroidx/annotation/experimental/Experimental$Level;", "", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "annotation-experimental_release"}, k=1, mv={1, 7, 1}, xi=48)
  public static enum Level
  {
    static
    {
      ERROR = new Level("ERROR", 1);
    }
    
    private Level() {}
  }
}

/* Location:
 * Qualified Name:     androidx.annotation.experimental.Experimental
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */