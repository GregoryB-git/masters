.class public final enum Ls1/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field public static final enum p:Ls1/a$c;

.field public static final enum q:Ls1/a$c;

.field public static final enum r:Ls1/a$c;

.field public static final enum s:Ls1/a$c;

.field public static final enum t:Ls1/a$c;

.field public static final enum u:Ls1/a$c;

.field public static final synthetic v:[Ls1/a$c;


# instance fields
.field public final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ls1/a$c;

    .line 2
    .line 3
    const-string v1, "STRING"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Ls1/a$c;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ls1/a$c;->p:Ls1/a$c;

    .line 10
    .line 11
    new-instance v0, Ls1/a$c;

    .line 12
    .line 13
    const-string v1, "STRING_SET"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Ls1/a$c;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Ls1/a$c;->q:Ls1/a$c;

    .line 20
    .line 21
    new-instance v0, Ls1/a$c;

    .line 22
    .line 23
    const-string v1, "INT"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Ls1/a$c;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Ls1/a$c;->r:Ls1/a$c;

    .line 30
    .line 31
    new-instance v0, Ls1/a$c;

    .line 32
    .line 33
    const-string v1, "LONG"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2, v2}, Ls1/a$c;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Ls1/a$c;->s:Ls1/a$c;

    .line 40
    .line 41
    new-instance v0, Ls1/a$c;

    .line 42
    .line 43
    const-string v1, "FLOAT"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2, v2}, Ls1/a$c;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Ls1/a$c;->t:Ls1/a$c;

    .line 50
    .line 51
    new-instance v0, Ls1/a$c;

    .line 52
    .line 53
    const-string v1, "BOOLEAN"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2, v2}, Ls1/a$c;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Ls1/a$c;->u:Ls1/a$c;

    .line 60
    .line 61
    invoke-static {}, Ls1/a$c;->c()[Ls1/a$c;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Ls1/a$c;->v:[Ls1/a$c;

    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Ls1/a$c;->o:I

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic c()[Ls1/a$c;
    .locals 3

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [Ls1/a$c;

    .line 3
    .line 4
    sget-object v1, Ls1/a$c;->p:Ls1/a$c;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Ls1/a$c;->q:Ls1/a$c;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, Ls1/a$c;->r:Ls1/a$c;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, Ls1/a$c;->s:Ls1/a$c;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    sget-object v1, Ls1/a$c;->t:Ls1/a$c;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    aput-object v1, v0, v2

    .line 28
    .line 29
    sget-object v1, Ls1/a$c;->u:Ls1/a$c;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    aput-object v1, v0, v2

    .line 33
    .line 34
    return-object v0
.end method

.method public static e(I)Ls1/a$c;
    .locals 1

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_4

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p0, v0, :cond_2

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p0, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x5

    .line 16
    if-eq p0, v0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Ls1/a$c;->u:Ls1/a$c;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    sget-object p0, Ls1/a$c;->t:Ls1/a$c;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    sget-object p0, Ls1/a$c;->s:Ls1/a$c;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_3
    sget-object p0, Ls1/a$c;->r:Ls1/a$c;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_4
    sget-object p0, Ls1/a$c;->q:Ls1/a$c;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_5
    sget-object p0, Ls1/a$c;->p:Ls1/a$c;

    .line 36
    .line 37
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Ls1/a$c;
    .locals 1

    .line 1
    const-class v0, Ls1/a$c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ls1/a$c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ls1/a$c;
    .locals 1

    .line 1
    sget-object v0, Ls1/a$c;->v:[Ls1/a$c;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ls1/a$c;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ls1/a$c;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Ls1/a$c;->o:I

    .line 2
    .line 3
    return v0
.end method
