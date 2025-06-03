.class public final Lx3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx3/d$b;,
        Lx3/d$a;,
        Lx3/d$c;
    }
.end annotation


# static fields
.field public static final o:Lx3/d;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public f:Lx3/d$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v6, Lx3/d;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v4, 0x1

    .line 5
    move-object v0, v6

    .line 6
    move v1, v5

    .line 7
    move v2, v5

    .line 8
    move v3, v4

    .line 9
    invoke-direct/range {v0 .. v5}, Lx3/d;-><init>(IIIII)V

    .line 10
    .line 11
    .line 12
    sput-object v6, Lx3/d;->o:Lx3/d;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x4

    .line 31
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public constructor <init>(IIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lx3/d;->a:I

    iput p2, p0, Lx3/d;->b:I

    iput p3, p0, Lx3/d;->c:I

    iput p4, p0, Lx3/d;->d:I

    iput p5, p0, Lx3/d;->e:I

    return-void
.end method


# virtual methods
.method public final a()Lx3/d$c;
    .locals 1

    iget-object v0, p0, Lx3/d;->f:Lx3/d$c;

    if-nez v0, :cond_0

    new-instance v0, Lx3/d$c;

    invoke-direct {v0, p0}, Lx3/d$c;-><init>(Lx3/d;)V

    iput-object v0, p0, Lx3/d;->f:Lx3/d$c;

    :cond_0
    iget-object v0, p0, Lx3/d;->f:Lx3/d$c;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lx3/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lx3/d;

    iget v2, p0, Lx3/d;->a:I

    iget v3, p1, Lx3/d;->a:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lx3/d;->b:I

    iget v3, p1, Lx3/d;->b:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lx3/d;->c:I

    iget v3, p1, Lx3/d;->c:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lx3/d;->d:I

    iget v3, p1, Lx3/d;->d:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lx3/d;->e:I

    iget p1, p1, Lx3/d;->e:I

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
    .locals 2

    iget v0, p0, Lx3/d;->a:I

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lx3/d;->b:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lx3/d;->c:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lx3/d;->d:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lx3/d;->e:I

    add-int/2addr v1, v0

    return v1
.end method
