.class public final Le7/n6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:Lcom/google/android/gms/internal/measurement/zzgf$zzj;

.field public c:Ljava/lang/String;

.field public d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public e:I

.field public f:J


# direct methods
.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(JLcom/google/android/gms/internal/measurement/zzgf$zzj;Ljava/lang/String;Ljava/util/Map;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Le7/n6;->a:J

    iput-object p3, p0, Le7/n6;->b:Lcom/google/android/gms/internal/measurement/zzgf$zzj;

    iput-object p4, p0, Le7/n6;->c:Ljava/lang/String;

    iput-object p5, p0, Le7/n6;->d:Ljava/util/Map;

    iput p6, p0, Le7/n6;->e:I

    iput-wide p7, p0, Le7/n6;->f:J

    return-void
.end method
