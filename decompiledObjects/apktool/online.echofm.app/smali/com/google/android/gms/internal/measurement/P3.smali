.class public abstract Lcom/google/android/gms/internal/measurement/P3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/O3;

.field public static final b:Lcom/google/android/gms/internal/measurement/O3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/Q3;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/Q3;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/P3;->a:Lcom/google/android/gms/internal/measurement/O3;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/P3;->c()Lcom/google/android/gms/internal/measurement/O3;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/P3;->b:Lcom/google/android/gms/internal/measurement/O3;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/measurement/O3;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/P3;->b:Lcom/google/android/gms/internal/measurement/O3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Protobuf runtime is not correctly loaded."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b()Lcom/google/android/gms/internal/measurement/O3;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/P3;->a:Lcom/google/android/gms/internal/measurement/O3;

    return-object v0
.end method

.method public static c()Lcom/google/android/gms/internal/measurement/O3;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "com.google.protobuf.ExtensionSchemaFull"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/O3;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
