package androidx.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Metadata(d1={"\000\034\n\002\030\002\n\002\020\033\n\000\n\002\020\021\n\002\020\016\n\000\n\002\020\013\n\002\b\003\b\002\030\0002\0020\001B \022\024\b\002\020\002\032\n\022\006\b\001\022\0020\0040\003\"\0020\004\022\b\b\002\020\005\032\0020\006R\017\020\005\032\0020\006¢\006\006\032\004\b\005\020\007R\027\020\002\032\n\022\006\b\001\022\0020\0040\003¢\006\006\032\004\b\002\020\b¨\006\t"}, d2={"Landroidx/annotation/StringDef;", "", "value", "", "", "open", "", "()Z", "()[Ljava/lang/String;", "annotation"}, k=1, mv={1, 7, 1}, xi=48)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
public @interface StringDef
{
  boolean open() default false;
  
  String[] value() default {};
}

/* Location:
 * Qualified Name:     androidx.annotation.StringDef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */