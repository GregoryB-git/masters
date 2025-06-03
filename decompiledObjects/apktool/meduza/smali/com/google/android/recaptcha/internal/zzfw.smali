.class public final Lcom/google/android/recaptcha/internal/zzfw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/webkit/WebView;

.field private final zzb:Lnc/d0;


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;Lnc/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzfw;->zza:Landroid/webkit/WebView;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzfw;->zzb:Lnc/d0;

    return-void
.end method

.method public static final synthetic zza(Lcom/google/android/recaptcha/internal/zzfw;)Landroid/webkit/WebView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzfw;->zza:Landroid/webkit/WebView;

    return-object p0
.end method


# virtual methods
.method public final varargs zzb(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    new-instance v0, Lcom/google/android/recaptcha/internal/zzfv;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p0, p1, v1}, Lcom/google/android/recaptcha/internal/zzfv;-><init>([Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzfw;Ljava/lang/String;Lub/e;)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzfw;->zzb:Lnc/d0;

    const/4 p2, 0x3

    invoke-static {p1, v1, v0, p2}, Lx6/b;->g0(Lnc/d0;Ltc/b;Ldc/p;I)Lnc/z1;

    return-void
.end method
