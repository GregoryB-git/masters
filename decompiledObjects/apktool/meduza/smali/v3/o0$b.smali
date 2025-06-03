.class public Lv3/o0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv3/o0$b$a;
    }
.end annotation


# static fields
.field public static final f:Lv3/o0$c;

.field public static final o:Ljava/lang/String;

.field public static final p:Ljava/lang/String;

.field public static final q:Ljava/lang/String;

.field public static final r:Ljava/lang/String;

.field public static final s:Ljava/lang/String;

.field public static final t:Lw3/v;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Z

.field public final d:Z

.field public final e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv3/o0$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lv3/o0$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lv3/o0$c;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lv3/o0$c;-><init>(Lv3/o0$b$a;)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Lv3/o0$b;->f:Lv3/o0$c;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lv3/o0$b;->o:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lv3/o0$b;->p:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lv3/o0$b;->q:Ljava/lang/String;

    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lv3/o0$b;->r:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v0, 0x4

    .line 42
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    sput-object v1, Lv3/o0$b;->s:Ljava/lang/String;

    .line 47
    .line 48
    new-instance v1, Lw3/v;

    .line 49
    .line 50
    invoke-direct {v1, v0}, Lw3/v;-><init>(I)V

    .line 51
    .line 52
    .line 53
    sput-object v1, Lv3/o0$b;->t:Lw3/v;

    .line 54
    .line 55
    return-void
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

.method public constructor <init>(Lv3/o0$b$a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p1, Lv3/o0$b$a;->a:J

    .line 5
    .line 6
    iput-wide v0, p0, Lv3/o0$b;->a:J

    .line 7
    .line 8
    iget-wide v0, p1, Lv3/o0$b$a;->b:J

    .line 9
    .line 10
    iput-wide v0, p0, Lv3/o0$b;->b:J

    .line 11
    .line 12
    iget-boolean v0, p1, Lv3/o0$b$a;->c:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lv3/o0$b;->c:Z

    .line 15
    .line 16
    iget-boolean v0, p1, Lv3/o0$b$a;->d:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Lv3/o0$b;->d:Z

    .line 19
    .line 20
    iget-boolean p1, p1, Lv3/o0$b$a;->e:Z

    .line 21
    .line 22
    iput-boolean p1, p0, Lv3/o0$b;->e:Z

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv3/o0$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv3/o0$b;

    iget-wide v3, p0, Lv3/o0$b;->a:J

    iget-wide v5, p1, Lv3/o0$b;->a:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Lv3/o0$b;->b:J

    iget-wide v5, p1, Lv3/o0$b;->b:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lv3/o0$b;->c:Z

    iget-boolean v3, p1, Lv3/o0$b;->c:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lv3/o0$b;->d:Z

    iget-boolean v3, p1, Lv3/o0$b;->d:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lv3/o0$b;->e:Z

    iget-boolean p1, p1, Lv3/o0$b;->e:Z

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 5

    iget-wide v0, p0, Lv3/o0$b;->a:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v0, v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lv3/o0$b;->b:J

    ushr-long v1, v3, v2

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lv3/o0$b;->c:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lv3/o0$b;->d:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lv3/o0$b;->e:Z

    add-int/2addr v0, v1

    return v0
.end method
