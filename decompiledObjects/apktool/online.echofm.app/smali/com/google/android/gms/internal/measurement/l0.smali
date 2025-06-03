.class public abstract Lcom/google/android/gms/internal/measurement/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/m0;

.field public static volatile b:Lcom/google/android/gms/internal/measurement/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/o0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/o0;-><init>(Lcom/google/android/gms/internal/measurement/n0;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/l0;->a:Lcom/google/android/gms/internal/measurement/m0;

    sput-object v0, Lcom/google/android/gms/internal/measurement/l0;->b:Lcom/google/android/gms/internal/measurement/m0;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/measurement/m0;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/l0;->b:Lcom/google/android/gms/internal/measurement/m0;

    return-object v0
.end method
