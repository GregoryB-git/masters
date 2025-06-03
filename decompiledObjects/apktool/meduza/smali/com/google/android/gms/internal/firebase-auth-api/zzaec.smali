.class final Lcom/google/android/gms/internal/firebase-auth-api/zzaec;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzaeu;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzafo;


# instance fields
.field private zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

.field private zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadz;

.field private zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

.field private final zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzaed;

.field private final zze:Lu7/f;

.field private zzf:Ljava/lang/String;

.field private zzg:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;


# direct methods
.method public constructor <init>(Lu7/f;Lcom/google/android/gms/internal/firebase-auth-api/zzaed;)V
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;-><init>(Lu7/f;Lcom/google/android/gms/internal/firebase-auth-api/zzaed;Lcom/google/android/gms/internal/firebase-auth-api/zzaez;Lcom/google/android/gms/internal/firebase-auth-api/zzadw;Lcom/google/android/gms/internal/firebase-auth-api/zzadz;)V

    return-void
.end method

.method private constructor <init>(Lu7/f;Lcom/google/android/gms/internal/firebase-auth-api/zzaed;Lcom/google/android/gms/internal/firebase-auth-api/zzaez;Lcom/google/android/gms/internal/firebase-auth-api/zzadw;Lcom/google/android/gms/internal/firebase-auth-api/zzadz;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaeu;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zze:Lu7/f;

    .line 1
    invoke-virtual {p1}, Lu7/f;->a()V

    .line 2
    iget-object p1, p1, Lu7/f;->c:Lu7/j;

    .line 3
    iget-object p1, p1, Lu7/j;->a:Ljava/lang/String;

    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzaed;

    const/4 p1, 0x0

    invoke-direct {p0, p1, p1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaez;Lcom/google/android/gms/internal/firebase-auth-api/zzadw;Lcom/google/android/gms/internal/firebase-auth-api/zzadz;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzafo;)V

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaez;Lcom/google/android/gms/internal/firebase-auth-api/zzadw;Lcom/google/android/gms/internal/firebase-auth-api/zzadz;)V
    .locals 1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadz;

    const-string p1, "firebear.secureToken"

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafj;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const-string p3, "LocalClient"

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzd(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Found hermetic configuration for secureToken URL: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

    if-nez p2, :cond_1

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaez;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

    :cond_1
    const-string p1, "firebear.identityToolkit"

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafj;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzb(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Found hermetic configuration for identityToolkit URL: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    if-nez p2, :cond_3

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadw;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    :cond_3
    const-string p1, "firebear.identityToolkitV2"

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafj;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Found hermetic configuration for identityToolkitV2 URL: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadz;

    if-nez p2, :cond_5

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/zzadz;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzadz;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadz;

    :cond_5
    return-void
.end method

.method private final zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzaef;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zze:Lu7/f;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzaed;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaed;->zzb()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaef;-><init>(Lu7/f;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    return-object v0
.end method


# virtual methods
.method public final zza()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaez;Lcom/google/android/gms/internal/firebase-auth-api/zzadw;Lcom/google/android/gms/internal/firebase-auth-api/zzadz;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaft;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaft;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafw;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/createAuthUri"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzafw;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafv;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafv;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/deleteAccount"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Ljava/lang/Void;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzafy;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafy;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafx;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/emailLinkSignin"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzafx;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaga;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaga;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafz;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadz;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/accounts/mfaEnrollment:finalize"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadz;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagc;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagc;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagb;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadz;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/accounts/mfaSignIn:finalize"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzagb;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadz;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagj;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagj;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagm;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/getAccountInfo"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzagm;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagk;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagk;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagw;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/token"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzagw;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagn;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagn;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagq;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagn;->zzb()Lb8/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagn;->zzb()Lb8/c;

    move-result-object v1

    .line 1
    iget-object v1, v1, Lb8/c;->p:Ljava/lang/String;

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaef;->zzb(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/getOobConfirmationCode"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzagq;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagp;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagp;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzags;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v1, "/getRecaptchaParam"

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v0, p2, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagu;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagu;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagt;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadz;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/recaptchaConfig"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagu;->zzb()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagu;->zzc()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&clientType="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&version="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagu;->zzd()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzae;->zzc(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagu;->zzd()Ljava/lang/String;

    move-result-object p1

    const-string v2, "&tenantId="

    .line 3
    invoke-static {v1, v2, p1}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    :cond_0
    const-class p1, Lcom/google/android/gms/internal/firebase-auth-api/zzagt;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahd;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzahd;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzahg;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/resetPassword"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzahg;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahf;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzahf;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzahh;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadz;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/accounts:revokeToken"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzahh;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadz;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahk;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzahk;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzahj;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahk;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahk;->zzc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaef;->zzb(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/sendVerificationCode"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzahj;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahm;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzahm;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzahl;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/setAccountInfo"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzahl;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahn;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzahn;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzahq;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/signupNewUser"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzahq;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahp;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzahp;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzahs;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaht;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaht;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaht;->zzb()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaht;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaef;->zzb(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadz;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/accounts/mfaEnrollment:start"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzahs;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadz;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahr;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzahr;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzahu;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahr;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahr;->zzb()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaef;->zzb(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadz;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/accounts/mfaSignIn:start"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzahu;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadz;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaic;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaic;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaie;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/verifyAssertion"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaie;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaid;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaid;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaig;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/verifyCustomToken"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaig;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaif;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaif;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaii;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/verifyPassword"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaii;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaih;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaih;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaik;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadw;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/verifyPhoneNumber"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaik;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaev;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaij;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaij;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaim;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadz;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzf:Ljava/lang/String;

    const-string v2, "/accounts/mfaEnrollment:withdraw"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaim;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadz;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaeb;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/zzaef;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaew<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-static {p2}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzaef;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaef;->zza(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaew;->zza(Ljava/lang/Object;)V

    return-void
.end method
