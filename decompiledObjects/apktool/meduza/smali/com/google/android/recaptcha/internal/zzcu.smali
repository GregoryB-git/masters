.class final Lcom/google/android/recaptcha/internal/zzcu;
.super Lwb/c;
.source "SourceFile"


# instance fields
.field public synthetic zza:Ljava/lang/Object;

.field public final synthetic zzb:Lcom/google/android/recaptcha/internal/zzcv;

.field public zzc:I

.field public zzd:Lcom/google/android/recaptcha/internal/zzen;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzcv;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzcu;->zzb:Lcom/google/android/recaptcha/internal/zzcv;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzcu;->zza:Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzcu;->zzc:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzcu;->zzc:I

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzcu;->zzb:Lcom/google/android/recaptcha/internal/zzcv;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, p0}, Lcom/google/android/recaptcha/internal/zzcv;->zzi(Lcom/google/android/recaptcha/internal/zzcv;Ljava/lang/String;ILdc/p;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
