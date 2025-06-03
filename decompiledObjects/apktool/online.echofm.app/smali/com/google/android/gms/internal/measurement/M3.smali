.class public Lcom/google/android/gms/internal/measurement/M3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/M3$a;
    }
.end annotation


# static fields
.field public static volatile b:Lcom/google/android/gms/internal/measurement/M3;

.field public static final c:Lcom/google/android/gms/internal/measurement/M3;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/M3;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/M3;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/M3;->c:Lcom/google/android/gms/internal/measurement/M3;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/M3;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/measurement/M3;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/M3;->b:Lcom/google/android/gms/internal/measurement/M3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-class v0, Lcom/google/android/gms/internal/measurement/M3;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/M3;->b:Lcom/google/android/gms/internal/measurement/M3;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_1
    const-class v1, Lcom/google/android/gms/internal/measurement/M3;

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/X3;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/M3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/M3;->b:Lcom/google/android/gms/internal/measurement/M3;

    monitor-exit v0

    return-object v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/internal/measurement/I4;I)Lcom/google/android/gms/internal/measurement/Y3$d;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/M3;->a:Ljava/util/Map;

    new-instance v1, Lcom/google/android/gms/internal/measurement/M3$a;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/measurement/M3$a;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method
