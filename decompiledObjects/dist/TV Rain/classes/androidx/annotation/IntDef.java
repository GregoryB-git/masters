package androidx.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Metadata(d1={"\000\034\n\002\030\002\n\002\020\033\n\000\n\002\020\025\n\002\020\b\n\000\n\002\020\013\n\002\b\004\b\002\030\0002\0020\001B\"\022\f\b\002\020\002\032\0020\003\"\0020\004\022\b\b\002\020\005\032\0020\006\022\b\b\002\020\007\032\0020\006R\017\020\005\032\0020\006¢\006\006\032\004\b\005\020\bR\017\020\007\032\0020\006¢\006\006\032\004\b\007\020\bR\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\t¨\006\n"}, d2={"Landroidx/annotation/IntDef;", "", "value", "", "", "flag", "", "open", "()Z", "()[I", "annotation"}, k=1, mv={1, 7, 1}, xi=48)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
public @interface IntDef
{
  boolean flag() default false;
  
  boolean open() default false;
  
  int[] value() default {};
}

/* Location:
 * Qualified Name:     androidx.annotation.IntDef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */