.class public Lcom/google/android/recaptcha/internal/zzkq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzoq;


# static fields
.field private static final zza:Lcom/google/android/recaptcha/internal/zzmo;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzmo;->zza:Lcom/google/android/recaptcha/internal/zzmo;

    sget v0, Lcom/google/android/recaptcha/internal/zzos;->zza:I

    sget-object v0, Lcom/google/android/recaptcha/internal/zzmo;->zza:Lcom/google/android/recaptcha/internal/zzmo;

    sput-object v0, Lcom/google/android/recaptcha/internal/zzkq;->zza:Lcom/google/android/recaptcha/internal/zzmo;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zza([BIILcom/google/android/recaptcha/internal/zzmo;)Lcom/google/android/recaptcha/internal/zzoi;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic zzb([B)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lcom/google/android/recaptcha/internal/zzkq;->zza:Lcom/google/android/recaptcha/internal/zzmo;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2, v1, v0}, Lcom/google/android/recaptcha/internal/zzkq;->zza([BIILcom/google/android/recaptcha/internal/zzmo;)Lcom/google/android/recaptcha/internal/zzoi;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/google/android/recaptcha/internal/zzoj;->zzp()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/google/android/recaptcha/internal/zzko;

    new-instance v0, Lcom/google/android/recaptcha/internal/zzpk;

    invoke-direct {v0, p1}, Lcom/google/android/recaptcha/internal/zzpk;-><init>(Lcom/google/android/recaptcha/internal/zzoi;)V

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzpk;->zza()Lcom/google/android/recaptcha/internal/zznn;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-object p1
.end method
