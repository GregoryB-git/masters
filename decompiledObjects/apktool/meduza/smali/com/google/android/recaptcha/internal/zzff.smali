.class public final Lcom/google/android/recaptcha/internal/zzff;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lrb/c;

.field private final zzb:Lrb/c;

.field private final zzc:Lrb/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/google/android/recaptcha/internal/zzav;->zza:I

    sget-object v0, Lcom/google/android/recaptcha/internal/zzfc;->zza:Lcom/google/android/recaptcha/internal/zzfc;

    invoke-static {v0}, Lb/z;->n(Ldc/a;)Lrb/g;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzff;->zza:Lrb/c;

    sget-object v0, Lcom/google/android/recaptcha/internal/zzfd;->zza:Lcom/google/android/recaptcha/internal/zzfd;

    invoke-static {v0}, Lb/z;->n(Ldc/a;)Lrb/g;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzff;->zzb:Lrb/c;

    sget-object v0, Lcom/google/android/recaptcha/internal/zzfe;->zza:Lcom/google/android/recaptcha/internal/zzfe;

    invoke-static {v0}, Lb/z;->n(Ldc/a;)Lrb/g;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzff;->zzc:Lrb/c;

    return-void
.end method

.method public static final synthetic zza(Lcom/google/android/recaptcha/internal/zzff;)Lcom/google/android/recaptcha/internal/zzey;
    .locals 0

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzff;->zzg()Lcom/google/android/recaptcha/internal/zzey;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic zzb(Lcom/google/android/recaptcha/internal/zzff;)Lcom/google/android/recaptcha/internal/zzfk;
    .locals 0

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzff;->zza:Lrb/c;

    invoke-interface {p0}, Lrb/c;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/recaptcha/internal/zzfk;

    return-object p0
.end method

.method public static synthetic zze(Lcom/google/android/recaptcha/internal/zzff;Lcom/google/android/recaptcha/internal/zzsc;Lcom/google/android/recaptcha/internal/zzek;Lub/e;)Ljava/lang/Object;
    .locals 7

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzsc;->zzl()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzsc;->zzM()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzff;->zzf()Lcom/google/android/recaptcha/internal/zzaq;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v1, v0}, Lcom/google/android/recaptcha/internal/zzaq;->zzd(Ljava/lang/String;)Z

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_1

    const/16 v1, 0x19

    invoke-virtual {p2, v1}, Lcom/google/android/recaptcha/internal/zzek;->zzf(I)Lcom/google/android/recaptcha/internal/zzen;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    :try_start_1
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzff;->zzf()Lcom/google/android/recaptcha/internal/zzaq;

    move-result-object v3

    invoke-interface {v3, v0}, Lcom/google/android/recaptcha/internal/zzaq;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzen;->zza()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v2, v3

    goto :goto_0

    :catch_0
    move-exception v3

    :try_start_2
    new-instance v4, Lcom/google/android/recaptcha/internal/zzbd;

    sget-object v5, Lcom/google/android/recaptcha/internal/zzbb;->zzk:Lcom/google/android/recaptcha/internal/zzbb;

    sget-object v6, Lcom/google/android/recaptcha/internal/zzba;->zzR:Lcom/google/android/recaptcha/internal/zzba;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v5, v6, v3}, Lcom/google/android/recaptcha/internal/zzbd;-><init>(Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzba;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Lcom/google/android/recaptcha/internal/zzen;->zzb(Lcom/google/android/recaptcha/internal/zzbd;)V

    :cond_0
    new-instance v3, Lcom/google/android/recaptcha/internal/zzbd;

    sget-object v4, Lcom/google/android/recaptcha/internal/zzbb;->zzk:Lcom/google/android/recaptcha/internal/zzbb;

    sget-object v5, Lcom/google/android/recaptcha/internal/zzba;->zzS:Lcom/google/android/recaptcha/internal/zzba;

    invoke-direct {v3, v4, v5, v2}, Lcom/google/android/recaptcha/internal/zzbd;-><init>(Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzba;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lcom/google/android/recaptcha/internal/zzen;->zzb(Lcom/google/android/recaptcha/internal/zzbd;)V

    :cond_1
    :goto_0
    if-nez v2, :cond_4

    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzff;->zzf()Lcom/google/android/recaptcha/internal/zzaq;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lcom/google/android/recaptcha/internal/zzaq;->zzb()V

    :cond_2
    const/16 v1, 0x17

    invoke-virtual {p2, v1}, Lcom/google/android/recaptcha/internal/zzek;->zzf(I)Lcom/google/android/recaptcha/internal/zzen;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    :try_start_3
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzff;->zzg()Lcom/google/android/recaptcha/internal/zzey;

    move-result-object v2

    invoke-interface {v2, p3}, Lcom/google/android/recaptcha/internal/zzey;->zzb(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzen;->zza()V
    :try_end_3
    .catch Lcom/google/android/recaptcha/internal/zzbd; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    const/16 p3, 0x18

    :try_start_4
    invoke-virtual {p2, p3}, Lcom/google/android/recaptcha/internal/zzek;->zzf(I)Lcom/google/android/recaptcha/internal/zzen;

    move-result-object p2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    :try_start_5
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzff;->zzf()Lcom/google/android/recaptcha/internal/zzaq;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-interface {p0, v0, v2}, Lcom/google/android/recaptcha/internal/zzaq;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p2}, Lcom/google/android/recaptcha/internal/zzen;->zza()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_1

    :catch_1
    move-exception p0

    :try_start_6
    new-instance p3, Lcom/google/android/recaptcha/internal/zzbd;

    sget-object v0, Lcom/google/android/recaptcha/internal/zzbb;->zzk:Lcom/google/android/recaptcha/internal/zzbb;

    sget-object v1, Lcom/google/android/recaptcha/internal/zzba;->zzT:Lcom/google/android/recaptcha/internal/zzba;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p3, v0, v1, p0}, Lcom/google/android/recaptcha/internal/zzbd;-><init>(Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzba;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lcom/google/android/recaptcha/internal/zzen;->zzb(Lcom/google/android/recaptcha/internal/zzbd;)V

    goto :goto_1

    :catch_2
    move-exception p0

    invoke-virtual {v1, p0}, Lcom/google/android/recaptcha/internal/zzen;->zzb(Lcom/google/android/recaptcha/internal/zzbd;)V

    throw p0

    :cond_4
    :goto_1
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzsc;->zzk()Ljava/lang/String;

    move-result-object p0

    const-string p1, "JAVASCRIPT_TAG"

    invoke-static {p0, p1, v2}, Llc/h;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    return-object p0

    :catch_3
    move-exception p0

    instance-of p1, p0, Lcom/google/android/recaptcha/internal/zzbd;

    if-eqz p1, :cond_5

    throw p0

    :cond_5
    new-instance p1, Lcom/google/android/recaptcha/internal/zzbd;

    sget-object p2, Lcom/google/android/recaptcha/internal/zzbb;->zzb:Lcom/google/android/recaptcha/internal/zzbb;

    sget-object p3, Lcom/google/android/recaptcha/internal/zzba;->zzL:Lcom/google/android/recaptcha/internal/zzba;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p2, p3, p0}, Lcom/google/android/recaptcha/internal/zzbd;-><init>(Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzba;Ljava/lang/String;)V

    throw p1
.end method

.method private final zzf()Lcom/google/android/recaptcha/internal/zzaq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzff;->zzb:Lrb/c;

    invoke-interface {v0}, Lrb/c;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/recaptcha/internal/zzaq;

    return-object v0
.end method

.method private final zzg()Lcom/google/android/recaptcha/internal/zzey;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzff;->zzc:Lrb/c;

    invoke-interface {v0}, Lrb/c;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/recaptcha/internal/zzey;

    return-object v0
.end method


# virtual methods
.method public final zzc(Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzto;Lub/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zzfb;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/google/android/recaptcha/internal/zzfb;-><init>(Lcom/google/android/recaptcha/internal/zzff;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzto;Lub/e;)V

    invoke-static {v0, p3}, Lnc/e0;->b(Ldc/p;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzd(Lcom/google/android/recaptcha/internal/zzsc;Lcom/google/android/recaptcha/internal/zzek;Lub/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/recaptcha/internal/zzff;->zze(Lcom/google/android/recaptcha/internal/zzff;Lcom/google/android/recaptcha/internal/zzsc;Lcom/google/android/recaptcha/internal/zzek;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
