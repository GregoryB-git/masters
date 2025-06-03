.class public abstract Lcom/google/android/gms/internal/measurement/J0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/J0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "a"
.end annotation


# instance fields
.field public final o:J

.field public final p:J

.field public final q:Z

.field public final synthetic r:Lcom/google/android/gms/internal/measurement/J0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/J0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/J0$a;-><init>(Lcom/google/android/gms/internal/measurement/J0;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/measurement/J0;Z)V
    .locals 2

    .line 2
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/J0$a;->r:Lcom/google/android/gms/internal/measurement/J0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/J0;->b:LE2/e;

    invoke-interface {v0}, LE2/e;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/J0$a;->o:J

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/J0;->b:LE2/e;

    invoke-interface {p1}, LE2/e;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/J0$a;->p:J

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/J0$a;->q:Z

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/J0$a;->r:Lcom/google/android/gms/internal/measurement/J0;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/J0;->I(Lcom/google/android/gms/internal/measurement/J0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/J0$a;->b()V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/J0$a;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/J0$a;->r:Lcom/google/android/gms/internal/measurement/J0;

    const/4 v2, 0x0

    iget-boolean v3, p0, Lcom/google/android/gms/internal/measurement/J0$a;->q:Z

    invoke-static {v1, v0, v2, v3}, Lcom/google/android/gms/internal/measurement/J0;->q(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/Exception;ZZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/J0$a;->b()V

    return-void
.end method
