.class public final La5/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final q:Ljava/lang/String;

.field public static final r:Ljava/lang/String;

.field public static final s:Ljava/lang/String;

.field public static final t:Ljava/lang/String;

.field public static final u:Ljava/lang/String;

.field public static final v:Ljava/lang/String;

.field public static final w:Ljava/lang/String;

.field public static final x:Ljava/lang/String;

.field public static final y:Le0/d;


# instance fields
.field public final a:J

.field public final b:I

.field public final c:I

.field public final d:[Landroid/net/Uri;

.field public final e:[I

.field public final f:[J

.field public final o:J

.field public final p:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La5/a$a;->q:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La5/a$a;->r:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La5/a$a;->s:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La5/a$a;->t:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La5/a$a;->u:Ljava/lang/String;

    const/4 v0, 0x5

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La5/a$a;->v:Ljava/lang/String;

    const/4 v0, 0x6

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La5/a$a;->w:Ljava/lang/String;

    const/4 v0, 0x7

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La5/a$a;->x:Ljava/lang/String;

    new-instance v0, Le0/d;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Le0/d;-><init>(I)V

    sput-object v0, La5/a$a;->y:Le0/d;

    return-void
.end method

.method public constructor <init>(JII[I[Landroid/net/Uri;[JJZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p5

    array-length v1, p6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx6/b;->q(Z)V

    iput-wide p1, p0, La5/a$a;->a:J

    iput p3, p0, La5/a$a;->b:I

    iput p4, p0, La5/a$a;->c:I

    iput-object p5, p0, La5/a$a;->e:[I

    iput-object p6, p0, La5/a$a;->d:[Landroid/net/Uri;

    iput-object p7, p0, La5/a$a;->f:[J

    iput-wide p8, p0, La5/a$a;->o:J

    iput-boolean p10, p0, La5/a$a;->p:Z

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 3

    const/4 v0, 0x1

    add-int/2addr p1, v0

    :goto_0
    iget-object v1, p0, La5/a$a;->e:[I

    array-length v2, v1

    if-ge p1, v2, :cond_1

    iget-boolean v2, p0, La5/a$a;->p:Z

    if-nez v2, :cond_1

    aget v1, v1, p1

    if-eqz v1, :cond_1

    if-ne v1, v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, La5/a$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, La5/a$a;

    iget-wide v2, p0, La5/a$a;->a:J

    iget-wide v4, p1, La5/a$a;->a:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, La5/a$a;->b:I

    iget v3, p1, La5/a$a;->b:I

    if-ne v2, v3, :cond_2

    iget v2, p0, La5/a$a;->c:I

    iget v3, p1, La5/a$a;->c:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, La5/a$a;->d:[Landroid/net/Uri;

    iget-object v3, p1, La5/a$a;->d:[Landroid/net/Uri;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, La5/a$a;->e:[I

    iget-object v3, p1, La5/a$a;->e:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, La5/a$a;->f:[J

    iget-object v3, p1, La5/a$a;->f:[J

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, La5/a$a;->o:J

    iget-wide v4, p1, La5/a$a;->o:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-boolean v2, p0, La5/a$a;->p:Z

    iget-boolean p1, p1, La5/a$a;->p:Z

    if-ne v2, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 6

    iget v0, p0, La5/a$a;->b:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, La5/a$a;->c:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, La5/a$a;->a:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, La5/a$a;->d:[Landroid/net/Uri;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, La5/a$a;->e:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, La5/a$a;->f:[J

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([J)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, La5/a$a;->o:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, La5/a$a;->p:Z

    add-int/2addr v0, v1

    return v0
.end method
