.class final synthetic Lcom/google/android/recaptcha/internal/zzif;
.super Lec/h;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# static fields
.field public static final zza:Lcom/google/android/recaptcha/internal/zzif;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/recaptcha/internal/zzif;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzif;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzif;->zza:Lcom/google/android/recaptcha/internal/zzif;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-class v2, Lcom/google/android/recaptcha/internal/zzih;

    const/4 v1, 0x2

    const-string v3, "cs"

    const-string v4, "cs([Ljava/lang/Object;)Ljava/lang/Object;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lec/h;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/recaptcha/internal/zzih;

    check-cast p2, [Ljava/lang/Object;

    invoke-interface {p1, p2}, Lcom/google/android/recaptcha/internal/zzih;->cs([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
