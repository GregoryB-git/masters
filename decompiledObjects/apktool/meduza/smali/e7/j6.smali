.class public final Le7/j6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final c:I

.field public final d:Lcom/google/android/gms/internal/measurement/zzgf$zzo;


# direct methods
.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 2

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, p2, v1}, Le7/j6;-><init>(Ljava/lang/String;Ljava/util/Map;ILcom/google/android/gms/internal/measurement/zzgf$zzo;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;ILcom/google/android/gms/internal/measurement/zzgf$zzo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/measurement/zzgf$zzo;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/j6;->a:Ljava/lang/String;

    iput-object p2, p0, Le7/j6;->b:Ljava/util/Map;

    iput p3, p0, Le7/j6;->c:I

    iput-object p4, p0, Le7/j6;->d:Lcom/google/android/gms/internal/measurement/zzgf$zzo;

    return-void
.end method
