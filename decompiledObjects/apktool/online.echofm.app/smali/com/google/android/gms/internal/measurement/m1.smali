.class public final Lcom/google/android/gms/internal/measurement/m1;
.super Lcom/google/android/gms/internal/measurement/J0$a;
.source "SourceFile"


# instance fields
.field public final synthetic s:Ljava/lang/Long;

.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Landroid/os/Bundle;

.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Lcom/google/android/gms/internal/measurement/J0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZ)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/m1;->y:Lcom/google/android/gms/internal/measurement/J0;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/m1;->s:Ljava/lang/Long;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/m1;->t:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/m1;->u:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/m1;->v:Landroid/os/Bundle;

    iput-boolean p6, p0, Lcom/google/android/gms/internal/measurement/m1;->w:Z

    iput-boolean p7, p0, Lcom/google/android/gms/internal/measurement/m1;->x:Z

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/J0$a;-><init>(Lcom/google/android/gms/internal/measurement/J0;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m1;->s:Ljava/lang/Long;

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/J0$a;->o:J

    :goto_0
    move-wide v8, v0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m1;->y:Lcom/google/android/gms/internal/measurement/J0;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/J0;->d(Lcom/google/android/gms/internal/measurement/J0;)Lcom/google/android/gms/internal/measurement/x0;

    move-result-object v0

    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/google/android/gms/internal/measurement/x0;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/m1;->t:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/m1;->u:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/m1;->v:Landroid/os/Bundle;

    iget-boolean v6, p0, Lcom/google/android/gms/internal/measurement/m1;->w:Z

    iget-boolean v7, p0, Lcom/google/android/gms/internal/measurement/m1;->x:Z

    invoke-interface/range {v2 .. v9}, Lcom/google/android/gms/internal/measurement/x0;->logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    return-void
.end method
