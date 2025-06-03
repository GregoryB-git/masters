.class public final Lv3/o1;
.super Lv3/i1;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;

.field public static final o:Le0/e;


# instance fields
.field public final c:I

.field public final d:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/o1;->e:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/o1;->f:Ljava/lang/String;

    new-instance v0, Le0/e;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Le0/e;-><init>(I)V

    sput-object v0, Lv3/o1;->o:Le0/e;

    return-void
.end method

.method public constructor <init>(FI)V
    .locals 4

    invoke-direct {p0}, Lv3/i1;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-lez p2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "maxStars must be a positive integer"

    invoke-static {v3, v2}, Lx6/b;->o(Ljava/lang/String;Z)V

    const/4 v2, 0x0

    cmpl-float v2, p1, v2

    if-ltz v2, :cond_1

    int-to-float v2, p2

    cmpg-float v2, p1, v2

    if-gtz v2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const-string v1, "starRating is out of range [0, maxStars]"

    invoke-static {v1, v0}, Lx6/b;->o(Ljava/lang/String;Z)V

    iput p2, p0, Lv3/o1;->c:I

    iput p1, p0, Lv3/o1;->d:F

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Lv3/i1;-><init>()V

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "maxStars must be a positive integer"

    invoke-static {v1, v0}, Lx6/b;->o(Ljava/lang/String;Z)V

    iput p1, p0, Lv3/o1;->c:I

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lv3/o1;->d:F

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lv3/o1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lv3/o1;

    iget v0, p0, Lv3/o1;->c:I

    iget v2, p1, Lv3/o1;->c:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lv3/o1;->d:F

    iget p1, p1, Lv3/o1;->d:F

    cmpl-float p1, v0, p1

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lv3/o1;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lv3/o1;->d:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
