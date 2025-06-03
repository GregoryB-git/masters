.class public abstract Lcom/google/android/gms/internal/measurement/q4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/q4;

.field public static final b:Lcom/google/android/gms/internal/measurement/q4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/p4;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/p4;-><init>(Lcom/google/android/gms/internal/measurement/s4;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/q4;->a:Lcom/google/android/gms/internal/measurement/q4;

    new-instance v0, Lcom/google/android/gms/internal/measurement/r4;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/r4;-><init>(Lcom/google/android/gms/internal/measurement/u4;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/q4;->b:Lcom/google/android/gms/internal/measurement/q4;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/t4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/q4;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/measurement/q4;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/q4;->a:Lcom/google/android/gms/internal/measurement/q4;

    return-object v0
.end method

.method public static c()Lcom/google/android/gms/internal/measurement/q4;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/q4;->b:Lcom/google/android/gms/internal/measurement/q4;

    return-object v0
.end method


# virtual methods
.method public abstract b(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method

.method public abstract d(Ljava/lang/Object;J)V
.end method
