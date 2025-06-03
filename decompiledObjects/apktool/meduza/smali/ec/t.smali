.class public final Lec/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lec/u;

.field public static final b:[Ljc/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lec/u;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :catch_0
    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lec/u;

    invoke-direct {v0}, Lec/u;-><init>()V

    :goto_0
    sput-object v0, Lec/t;->a:Lec/u;

    const/4 v0, 0x0

    new-array v0, v0, [Ljc/c;

    sput-object v0, Lec/t;->b:[Ljc/c;

    return-void
.end method

.method public static a(Ljava/lang/Class;)Lec/d;
    .locals 1

    sget-object v0, Lec/t;->a:Lec/u;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lec/d;

    invoke-direct {v0, p0}, Lec/d;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method
