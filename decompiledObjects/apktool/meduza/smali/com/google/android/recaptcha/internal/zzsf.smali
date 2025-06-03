.class public final Lcom/google/android/recaptcha/internal/zzsf;
.super Lcom/google/android/recaptcha/internal/zzmx;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzoj;


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public synthetic constructor <init>(Lcom/google/android/recaptcha/internal/zzsn;)V
    .locals 0

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzsg;->zzg()Lcom/google/android/recaptcha/internal/zzsg;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/recaptcha/internal/zzmx;-><init>(Lcom/google/android/recaptcha/internal/zznd;)V

    return-void
.end method


# virtual methods
.method public final zze(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzsf;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/recaptcha/internal/zzmx;->zzn()V

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzmx;->zza:Lcom/google/android/recaptcha/internal/zznd;

    check-cast v0, Lcom/google/android/recaptcha/internal/zzsg;

    invoke-static {v0, p1}, Lcom/google/android/recaptcha/internal/zzsg;->zzi(Lcom/google/android/recaptcha/internal/zzsg;Ljava/lang/String;)V

    return-object p0
.end method
