.class public abstract Lcom/google/android/gms/internal/measurement/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/q0;

.field public static b:Lcom/google/android/gms/internal/measurement/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/r0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/r0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/s0;->a:Lcom/google/android/gms/internal/measurement/q0;

    sput-object v0, Lcom/google/android/gms/internal/measurement/s0;->b:Lcom/google/android/gms/internal/measurement/q0;

    return-void
.end method

.method public static bridge synthetic a()Lcom/google/android/gms/internal/measurement/q0;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/s0;->b:Lcom/google/android/gms/internal/measurement/q0;

    return-object v0
.end method
