.class public final Lcom/google/android/recaptcha/internal/zzai;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final synthetic zza:Lcom/google/android/recaptcha/internal/zzan;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzan;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzai;->zza:Lcom/google/android/recaptcha/internal/zzan;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzai;->zza:Lcom/google/android/recaptcha/internal/zzan;

    invoke-static {v0}, Lcom/google/android/recaptcha/internal/zzan;->zzg(Lcom/google/android/recaptcha/internal/zzan;)Lnc/d0;

    move-result-object v1

    new-instance v2, Lcom/google/android/recaptcha/internal/zzaj;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/google/android/recaptcha/internal/zzaj;-><init>(Lcom/google/android/recaptcha/internal/zzan;Lub/e;)V

    const/4 v0, 0x3

    invoke-static {v1, v3, v2, v0}, Lx6/b;->g0(Lnc/d0;Ltc/b;Ldc/p;I)Lnc/z1;

    return-void
.end method
