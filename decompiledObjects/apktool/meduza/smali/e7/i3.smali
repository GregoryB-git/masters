.class public final Le7/i3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/Boolean;

.field public f:J

.field public g:Lcom/google/android/gms/internal/measurement/zzdz;

.field public h:Z

.field public i:Ljava/lang/Long;

.field public j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdz;Ljava/lang/Long;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Le7/i3;->h:Z

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iput-object p1, p0, Le7/i3;->a:Landroid/content/Context;

    iput-object p3, p0, Le7/i3;->i:Ljava/lang/Long;

    if-eqz p2, :cond_0

    iput-object p2, p0, Le7/i3;->g:Lcom/google/android/gms/internal/measurement/zzdz;

    iget-object p1, p2, Lcom/google/android/gms/internal/measurement/zzdz;->zzf:Ljava/lang/String;

    iput-object p1, p0, Le7/i3;->b:Ljava/lang/String;

    iget-object p1, p2, Lcom/google/android/gms/internal/measurement/zzdz;->zze:Ljava/lang/String;

    iput-object p1, p0, Le7/i3;->c:Ljava/lang/String;

    iget-object p1, p2, Lcom/google/android/gms/internal/measurement/zzdz;->zzd:Ljava/lang/String;

    iput-object p1, p0, Le7/i3;->d:Ljava/lang/String;

    iget-boolean p1, p2, Lcom/google/android/gms/internal/measurement/zzdz;->zzc:Z

    iput-boolean p1, p0, Le7/i3;->h:Z

    iget-wide v1, p2, Lcom/google/android/gms/internal/measurement/zzdz;->zzb:J

    iput-wide v1, p0, Le7/i3;->f:J

    iget-object p1, p2, Lcom/google/android/gms/internal/measurement/zzdz;->zzh:Ljava/lang/String;

    iput-object p1, p0, Le7/i3;->j:Ljava/lang/String;

    iget-object p1, p2, Lcom/google/android/gms/internal/measurement/zzdz;->zzg:Landroid/os/Bundle;

    if-eqz p1, :cond_0

    const-string p2, "dataCollectionDefaultEnabled"

    invoke-virtual {p1, p2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Le7/i3;->e:Ljava/lang/Boolean;

    :cond_0
    return-void
.end method
