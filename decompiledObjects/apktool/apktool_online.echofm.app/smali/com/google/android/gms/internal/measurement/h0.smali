.class public abstract Lcom/google/android/gms/internal/measurement/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lcom/google/android/gms/internal/measurement/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/k0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/k0;-><init>(Lcom/google/android/gms/internal/measurement/j0;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/h0;->a:Lcom/google/android/gms/internal/measurement/h0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Lcom/google/android/gms/internal/measurement/h0;
    .locals 2

    .line 1
    const-class v0, Lcom/google/android/gms/internal/measurement/h0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/h0;->a:Lcom/google/android/gms/internal/measurement/h0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public abstract b(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URLConnection;
.end method
