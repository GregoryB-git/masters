.class final Lcom/google/android/recaptcha/internal/zzct;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# instance fields
.field public zza:Ljava/lang/Object;

.field public zzb:I

.field public synthetic zzc:Ljava/lang/Object;

.field public final synthetic zzd:Lcom/google/android/recaptcha/internal/zzcv;

.field public final synthetic zze:Ljava/lang/String;

.field public final synthetic zzf:J

.field public final synthetic zzg:Lcom/google/android/recaptcha/internal/zzcn;

.field public final synthetic zzh:Lcom/google/android/recaptcha/internal/zzch;

.field public final synthetic zzi:Lcom/google/android/recaptcha/internal/zzbi;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzcv;Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzcn;Lcom/google/android/recaptcha/internal/zzbi;Lcom/google/android/recaptcha/internal/zzch;Lub/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzct;->zzd:Lcom/google/android/recaptcha/internal/zzcv;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzct;->zze:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/recaptcha/internal/zzct;->zzf:J

    iput-object p5, p0, Lcom/google/android/recaptcha/internal/zzct;->zzg:Lcom/google/android/recaptcha/internal/zzcn;

    iput-object p6, p0, Lcom/google/android/recaptcha/internal/zzct;->zzi:Lcom/google/android/recaptcha/internal/zzbi;

    iput-object p7, p0, Lcom/google/android/recaptcha/internal/zzct;->zzh:Lcom/google/android/recaptcha/internal/zzch;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 10

    new-instance v9, Lcom/google/android/recaptcha/internal/zzct;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzct;->zzd:Lcom/google/android/recaptcha/internal/zzcv;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzct;->zze:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/recaptcha/internal/zzct;->zzf:J

    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzct;->zzg:Lcom/google/android/recaptcha/internal/zzcn;

    iget-object v6, p0, Lcom/google/android/recaptcha/internal/zzct;->zzi:Lcom/google/android/recaptcha/internal/zzbi;

    iget-object v7, p0, Lcom/google/android/recaptcha/internal/zzct;->zzh:Lcom/google/android/recaptcha/internal/zzch;

    move-object v0, v9

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/google/android/recaptcha/internal/zzct;-><init>(Lcom/google/android/recaptcha/internal/zzcv;Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzcn;Lcom/google/android/recaptcha/internal/zzbi;Lcom/google/android/recaptcha/internal/zzch;Lub/e;)V

    iput-object p1, v9, Lcom/google/android/recaptcha/internal/zzct;->zzc:Ljava/lang/Object;

    return-object v9
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/recaptcha/internal/zzek;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzct;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lcom/google/android/recaptcha/internal/zzct;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzct;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lvb/a;->a:Lvb/a;

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzct;->zzb:I

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzct;->zza:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/recaptcha/internal/zzcn;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzct;->zzc:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/recaptcha/internal/zzek;

    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzct;->zzc:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lcom/google/android/recaptcha/internal/zzek;

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzct;->zzd:Lcom/google/android/recaptcha/internal/zzcv;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzct;->zze:Ljava/lang/String;

    invoke-static {p1, v2}, Lcom/google/android/recaptcha/internal/zzcv;->zza(Lcom/google/android/recaptcha/internal/zzcv;Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzdc;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzct;->zzd:Lcom/google/android/recaptcha/internal/zzcv;

    iget-wide v2, p0, Lcom/google/android/recaptcha/internal/zzct;->zzf:J

    invoke-static {p1, v2, v3}, Lcom/google/android/recaptcha/internal/zzcv;->zzc(Lcom/google/android/recaptcha/internal/zzcv;J)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzct;->zzg:Lcom/google/android/recaptcha/internal/zzcn;

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzct;->zzd:Lcom/google/android/recaptcha/internal/zzcv;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzct;->zze:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzct;->zzi:Lcom/google/android/recaptcha/internal/zzbi;

    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzct;->zzh:Lcom/google/android/recaptcha/internal/zzch;

    invoke-static {p1, v2, v3, v4, v1}, Lcom/google/android/recaptcha/internal/zzcv;->zze(Lcom/google/android/recaptcha/internal/zzcv;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzbi;Lcom/google/android/recaptcha/internal/zzch;Lcom/google/android/recaptcha/internal/zzek;)Lcom/google/android/recaptcha/internal/zzcn;

    move-result-object p1

    :cond_2
    iget-wide v2, p0, Lcom/google/android/recaptcha/internal/zzct;->zzf:J

    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzct;->zzc:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzct;->zza:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, p0, Lcom/google/android/recaptcha/internal/zzct;->zzb:I

    invoke-interface {p1, v2, v3, p0}, Lcom/google/android/recaptcha/internal/zzcn;->zzb(JLub/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, p1

    :goto_0
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzct;->zze:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzct;->zzi:Lcom/google/android/recaptcha/internal/zzbi;

    new-instance v3, Lcom/google/android/recaptcha/internal/zzdc;

    invoke-direct {v3, v0, p1, v2, v1}, Lcom/google/android/recaptcha/internal/zzdc;-><init>(Lcom/google/android/recaptcha/internal/zzcn;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzbi;Lcom/google/android/recaptcha/internal/zzek;)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzct;->zzd:Lcom/google/android/recaptcha/internal/zzcv;

    invoke-static {p1, v3}, Lcom/google/android/recaptcha/internal/zzcv;->zzb(Lcom/google/android/recaptcha/internal/zzcv;Lcom/google/android/recaptcha/internal/zzdc;)V

    return-object v3
.end method
