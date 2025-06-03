package androidx.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.MustBeDocumented;

@Documented
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
@Metadata(d1={"\000\030\n\002\030\002\n\002\020\033\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\005\b\002\030\0002\0020\001B(\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\003\022\b\b\002\020\007\032\0020\003R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\bR\017\020\004\032\0020\005¢\006\006\032\004\b\004\020\tR\017\020\007\032\0020\003¢\006\006\032\004\b\007\020\bR\017\020\006\032\0020\003¢\006\006\032\004\b\006\020\b¨\006\n"}, d2={"Landroidx/annotation/ChecksSdkIntAtLeast;", "", "api", "", "codename", "", "parameter", "lambda", "()I", "()Ljava/lang/String;", "annotation"}, k=1, mv={1, 7, 1}, xi=48)
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.FIELD})
public @interface ChecksSdkIntAtLeast
{
  int api() default -1;
  
  String codename() default "";
  
  int lambda() default -1;
  
  int parameter() default -1;
}

/* Location:
 * Qualified Name:     androidx.annotation.ChecksSdkIntAtLeast
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */