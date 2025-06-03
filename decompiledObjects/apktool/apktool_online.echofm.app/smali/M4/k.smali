.class public abstract enum LM4/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum p:LM4/k;

.field public static final enum q:LM4/k;

.field public static final enum r:LM4/k;

.field public static final enum s:LM4/k;

.field public static final enum t:LM4/k;

.field public static final synthetic u:[LM4/k;


# instance fields
.field public o:J


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, LM4/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide v2, 0x10000000000L

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const-string v4, "TERABYTES"

    .line 10
    .line 11
    invoke-direct {v0, v4, v1, v2, v3}, LM4/k$a;-><init>(Ljava/lang/String;IJ)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LM4/k;->p:LM4/k;

    .line 15
    .line 16
    new-instance v2, LM4/k$b;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    const-wide/32 v4, 0x40000000

    .line 20
    .line 21
    .line 22
    const-string v6, "GIGABYTES"

    .line 23
    .line 24
    invoke-direct {v2, v6, v3, v4, v5}, LM4/k$b;-><init>(Ljava/lang/String;IJ)V

    .line 25
    .line 26
    .line 27
    sput-object v2, LM4/k;->q:LM4/k;

    .line 28
    .line 29
    new-instance v4, LM4/k$c;

    .line 30
    .line 31
    const/4 v5, 0x2

    .line 32
    const-wide/32 v6, 0x100000

    .line 33
    .line 34
    .line 35
    const-string v8, "MEGABYTES"

    .line 36
    .line 37
    invoke-direct {v4, v8, v5, v6, v7}, LM4/k$c;-><init>(Ljava/lang/String;IJ)V

    .line 38
    .line 39
    .line 40
    sput-object v4, LM4/k;->r:LM4/k;

    .line 41
    .line 42
    new-instance v6, LM4/k$d;

    .line 43
    .line 44
    const/4 v7, 0x3

    .line 45
    const-wide/16 v8, 0x400

    .line 46
    .line 47
    const-string v10, "KILOBYTES"

    .line 48
    .line 49
    invoke-direct {v6, v10, v7, v8, v9}, LM4/k$d;-><init>(Ljava/lang/String;IJ)V

    .line 50
    .line 51
    .line 52
    sput-object v6, LM4/k;->s:LM4/k;

    .line 53
    .line 54
    new-instance v8, LM4/k$e;

    .line 55
    .line 56
    const/4 v9, 0x4

    .line 57
    const-wide/16 v10, 0x1

    .line 58
    .line 59
    const-string v12, "BYTES"

    .line 60
    .line 61
    invoke-direct {v8, v12, v9, v10, v11}, LM4/k$e;-><init>(Ljava/lang/String;IJ)V

    .line 62
    .line 63
    .line 64
    sput-object v8, LM4/k;->t:LM4/k;

    .line 65
    .line 66
    const/4 v10, 0x5

    .line 67
    new-array v10, v10, [LM4/k;

    .line 68
    .line 69
    aput-object v0, v10, v1

    .line 70
    .line 71
    aput-object v2, v10, v3

    .line 72
    .line 73
    aput-object v4, v10, v5

    .line 74
    .line 75
    aput-object v6, v10, v7

    .line 76
    .line 77
    aput-object v8, v10, v9

    .line 78
    .line 79
    sput-object v10, LM4/k;->u:[LM4/k;

    .line 80
    .line 81
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, LM4/k;->o:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IJLM4/k$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, LM4/k;-><init>(Ljava/lang/String;IJ)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LM4/k;
    .locals 1

    .line 1
    const-class v0, LM4/k;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LM4/k;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LM4/k;
    .locals 1

    .line 1
    sget-object v0, LM4/k;->u:[LM4/k;

    .line 2
    .line 3
    invoke-virtual {v0}, [LM4/k;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LM4/k;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public c(J)J
    .locals 2

    .line 1
    iget-wide v0, p0, LM4/k;->o:J

    .line 2
    .line 3
    mul-long/2addr p1, v0

    .line 4
    sget-object v0, LM4/k;->s:LM4/k;

    .line 5
    .line 6
    iget-wide v0, v0, LM4/k;->o:J

    .line 7
    .line 8
    div-long/2addr p1, v0

    .line 9
    return-wide p1
.end method
