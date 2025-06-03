.class public final Lcom/google/android/recaptcha/internal/zzl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/util/List;

.field private zzb:Lcom/google/android/recaptcha/internal/zzek;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/google/android/recaptcha/internal/zzl;-><init>(Ljava/util/List;ILec/e;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ILec/e;)V
    .locals 0

    sget-object p1, Lsb/s;->a:Lsb/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzl;->zza:Ljava/util/List;

    const/4 p2, 0x0

    new-array p2, p2, [Lcom/google/android/recaptcha/internal/zze;

    invoke-interface {p1, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/google/android/recaptcha/internal/zze;

    array-length p2, p1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/google/android/recaptcha/internal/zze;

    invoke-direct {p0, p1}, Lcom/google/android/recaptcha/internal/zzl;->zzh([Lcom/google/android/recaptcha/internal/zze;)V

    return-void
.end method

.method public static final synthetic zza(Lcom/google/android/recaptcha/internal/zzl;)Lcom/google/android/recaptcha/internal/zzek;
    .locals 0

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzl;->zzb:Lcom/google/android/recaptcha/internal/zzek;

    return-object p0
.end method

.method public static final synthetic zze(Lcom/google/android/recaptcha/internal/zzl;Lcom/google/android/recaptcha/internal/zzek;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzl;->zzb:Lcom/google/android/recaptcha/internal/zzek;

    return-void
.end method

.method private final varargs zzh([Lcom/google/android/recaptcha/internal/zze;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzl;->zza:Ljava/util/List;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "elements"

    invoke-static {p1, v1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lsb/j;->j([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public final zzb(Ljava/lang/String;JLub/e;)Ljava/lang/Object;
    .locals 7

    new-instance v6, Lcom/google/android/recaptcha/internal/zzh;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/recaptcha/internal/zzh;-><init>(Lcom/google/android/recaptcha/internal/zzl;Ljava/lang/String;JLub/e;)V

    invoke-static {v6, p4}, Lnc/e0;->b(Ldc/p;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzc(JLcom/google/android/recaptcha/internal/zzsc;Lcom/google/android/recaptcha/internal/zzek;Lub/e;)Ljava/lang/Object;
    .locals 12

    move-object/from16 v0, p5

    instance-of v1, v0, Lcom/google/android/recaptcha/internal/zzi;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/google/android/recaptcha/internal/zzi;

    iget v2, v1, Lcom/google/android/recaptcha/internal/zzi;->zzc:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/google/android/recaptcha/internal/zzi;->zzc:I

    move-object v9, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/android/recaptcha/internal/zzi;

    move-object v9, p0

    invoke-direct {v1, p0, v0}, Lcom/google/android/recaptcha/internal/zzi;-><init>(Lcom/google/android/recaptcha/internal/zzl;Lub/e;)V

    :goto_0
    iget-object v0, v1, Lcom/google/android/recaptcha/internal/zzi;->zza:Ljava/lang/Object;

    sget-object v10, Lvb/a;->a:Lvb/a;

    iget v2, v1, Lcom/google/android/recaptcha/internal/zzi;->zzc:I

    const/4 v11, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v11, :cond_1

    invoke-static {v0}, Lrb/f;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lrb/f;->b(Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/recaptcha/internal/zzk;

    const/4 v8, 0x0

    move-object v2, v0

    move-object v3, p0

    move-object/from16 v4, p4

    move-wide v5, p1

    move-object v7, p3

    invoke-direct/range {v2 .. v8}, Lcom/google/android/recaptcha/internal/zzk;-><init>(Lcom/google/android/recaptcha/internal/zzl;Lcom/google/android/recaptcha/internal/zzek;JLcom/google/android/recaptcha/internal/zzsc;Lub/e;)V

    iput v11, v1, Lcom/google/android/recaptcha/internal/zzi;->zzc:I

    invoke-static {v0, v1}, Lnc/e0;->b(Ldc/p;Lub/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_3

    return-object v10

    :cond_3
    :goto_1
    check-cast v0, Lrb/e;

    iget-object v0, v0, Lrb/e;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final zzd()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzl;->zza:Ljava/util/List;

    return-object v0
.end method

.method public final varargs zzf([Lcom/google/android/recaptcha/internal/zze;)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/google/android/recaptcha/internal/zze;

    invoke-direct {p0, p1}, Lcom/google/android/recaptcha/internal/zzl;->zzh([Lcom/google/android/recaptcha/internal/zze;)V

    return-void
.end method

.method public final zzg(Lcom/google/android/recaptcha/internal/zzsr;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzl;->zza:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/recaptcha/internal/zze;

    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zze;->zzk(Lcom/google/android/recaptcha/internal/zzsr;)V

    goto :goto_0

    :cond_0
    return-void
.end method
