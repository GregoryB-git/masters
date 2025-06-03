.class public final Lcom/google/android/gms/internal/measurement/o1;
.super Lcom/google/android/gms/internal/measurement/J0$a;
.source "SourceFile"


# instance fields
.field public final synthetic s:Landroid/os/Bundle;

.field public final synthetic t:Landroid/app/Activity;

.field public final synthetic u:Lcom/google/android/gms/internal/measurement/J0$c;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/J0$c;Landroid/os/Bundle;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/o1;->u:Lcom/google/android/gms/internal/measurement/J0$c;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/o1;->s:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/o1;->t:Landroid/app/Activity;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/J0$c;->o:Lcom/google/android/gms/internal/measurement/J0;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/J0$a;-><init>(Lcom/google/android/gms/internal/measurement/J0;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/o1;->s:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/o1;->s:Landroid/os/Bundle;

    const-string v2, "com.google.app_measurement.screen_service"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/o1;->s:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Landroid/os/Bundle;

    if-eqz v3, :cond_1

    check-cast v1, Landroid/os/Bundle;

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/o1;->u:Lcom/google/android/gms/internal/measurement/J0$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/J0$c;->o:Lcom/google/android/gms/internal/measurement/J0;

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/J0;->d(Lcom/google/android/gms/internal/measurement/J0;)Lcom/google/android/gms/internal/measurement/x0;

    move-result-object v1

    invoke-static {v1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/x0;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/o1;->t:Landroid/app/Activity;

    invoke-static {v2}, LH2/b;->Z0(Ljava/lang/Object;)LH2/a;

    move-result-object v2

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/J0$a;->p:J

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/google/android/gms/internal/measurement/x0;->onActivityCreated(LH2/a;Landroid/os/Bundle;J)V

    return-void
.end method
