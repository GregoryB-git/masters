.class public final Le7/q5;
.super Le7/j0;
.source "SourceFile"


# instance fields
.field public d:Lcom/google/android/gms/internal/measurement/zzdj;

.field public e:Z

.field public final f:Le7/v5;

.field public final o:Le7/t5;

.field public final p:Ll3/l;


# direct methods
.method public constructor <init>(Le7/j2;)V
    .locals 0

    invoke-direct {p0, p1}, Le7/j0;-><init>(Le7/j2;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Le7/q5;->e:Z

    new-instance p1, Le7/v5;

    invoke-direct {p1, p0}, Le7/v5;-><init>(Le7/q5;)V

    iput-object p1, p0, Le7/q5;->f:Le7/v5;

    new-instance p1, Le7/t5;

    invoke-direct {p1, p0}, Le7/t5;-><init>(Le7/q5;)V

    iput-object p1, p0, Le7/q5;->o:Le7/t5;

    new-instance p1, Ll3/l;

    invoke-direct {p1, p0}, Ll3/l;-><init>(Le7/q5;)V

    iput-object p1, p0, Le7/q5;->p:Ll3/l;

    return-void
.end method


# virtual methods
.method public final s()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final v()V
    .locals 2

    invoke-virtual {p0}, Le7/o0;->l()V

    iget-object v0, p0, Le7/q5;->d:Lcom/google/android/gms/internal/measurement/zzdj;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdj;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzdj;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Le7/q5;->d:Lcom/google/android/gms/internal/measurement/zzdj;

    :cond_0
    return-void
.end method
