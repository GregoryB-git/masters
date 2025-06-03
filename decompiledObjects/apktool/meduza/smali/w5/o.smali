.class public final Lw5/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/g;


# static fields
.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;

.field public static final o:Ljava/lang/String;

.field public static final p:Ljava/lang/String;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lw5/o;->e:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lw5/o;->f:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lw5/o;->o:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lw5/o;->p:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(FIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lw5/o;->a:I

    iput p3, p0, Lw5/o;->b:I

    iput p4, p0, Lw5/o;->c:I

    iput p1, p0, Lw5/o;->d:F

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lw5/o;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lw5/o;

    iget v1, p0, Lw5/o;->a:I

    iget v3, p1, Lw5/o;->a:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lw5/o;->b:I

    iget v3, p1, Lw5/o;->b:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lw5/o;->c:I

    iget v3, p1, Lw5/o;->c:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lw5/o;->d:F

    iget p1, p1, Lw5/o;->d:F

    cmpl-float p1, v1, p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lw5/o;->a:I

    const/16 v1, 0xd9

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lw5/o;->b:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lw5/o;->c:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lw5/o;->d:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
