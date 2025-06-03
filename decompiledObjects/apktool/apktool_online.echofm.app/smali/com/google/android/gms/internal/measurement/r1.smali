.class public final Lcom/google/android/gms/internal/measurement/r1;
.super Lcom/google/android/gms/internal/measurement/J0$a;
.source "SourceFile"


# instance fields
.field public final synthetic s:Landroid/app/Activity;

.field public final synthetic t:Lcom/google/android/gms/internal/measurement/J0$c;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/J0$c;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/r1;->t:Lcom/google/android/gms/internal/measurement/J0$c;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/r1;->s:Landroid/app/Activity;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/J0$c;->o:Lcom/google/android/gms/internal/measurement/J0;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/J0$a;-><init>(Lcom/google/android/gms/internal/measurement/J0;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/r1;->t:Lcom/google/android/gms/internal/measurement/J0$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/J0$c;->o:Lcom/google/android/gms/internal/measurement/J0;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/J0;->d(Lcom/google/android/gms/internal/measurement/J0;)Lcom/google/android/gms/internal/measurement/x0;

    move-result-object v0

    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/x0;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/r1;->s:Landroid/app/Activity;

    invoke-static {v1}, LH2/b;->Z0(Ljava/lang/Object;)LH2/a;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/J0$a;->p:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/x0;->onActivityStopped(LH2/a;J)V

    return-void
.end method
