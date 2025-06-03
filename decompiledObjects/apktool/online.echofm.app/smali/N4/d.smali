.class public final enum LN4/d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/t$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN4/d$b;
    }
.end annotation


# static fields
.field public static final enum p:LN4/d;

.field public static final enum q:LN4/d;

.field public static final enum r:LN4/d;

.field public static final enum s:LN4/d;

.field public static final t:Lcom/google/protobuf/t$b;

.field public static final synthetic u:[LN4/d;


# instance fields
.field public final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, LN4/d;

    .line 2
    .line 3
    const-string v1, "APPLICATION_PROCESS_STATE_UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, LN4/d;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LN4/d;->p:LN4/d;

    .line 10
    .line 11
    new-instance v1, LN4/d;

    .line 12
    .line 13
    const-string v3, "FOREGROUND"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4, v4}, LN4/d;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, LN4/d;->q:LN4/d;

    .line 20
    .line 21
    new-instance v3, LN4/d;

    .line 22
    .line 23
    const-string v5, "BACKGROUND"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6, v6}, LN4/d;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v3, LN4/d;->r:LN4/d;

    .line 30
    .line 31
    new-instance v5, LN4/d;

    .line 32
    .line 33
    const-string v7, "FOREGROUND_BACKGROUND"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8, v8}, LN4/d;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v5, LN4/d;->s:LN4/d;

    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    new-array v7, v7, [LN4/d;

    .line 43
    .line 44
    aput-object v0, v7, v2

    .line 45
    .line 46
    aput-object v1, v7, v4

    .line 47
    .line 48
    aput-object v3, v7, v6

    .line 49
    .line 50
    aput-object v5, v7, v8

    .line 51
    .line 52
    sput-object v7, LN4/d;->u:[LN4/d;

    .line 53
    .line 54
    new-instance v0, LN4/d$a;

    .line 55
    .line 56
    invoke-direct {v0}, LN4/d$a;-><init>()V

    .line 57
    .line 58
    .line 59
    sput-object v0, LN4/d;->t:Lcom/google/protobuf/t$b;

    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LN4/d;->o:I

    .line 5
    .line 6
    return-void
.end method

.method public static c()Lcom/google/protobuf/t$c;
    .locals 1

    .line 1
    sget-object v0, LN4/d$b;->a:Lcom/google/protobuf/t$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LN4/d;
    .locals 1

    .line 1
    const-class v0, LN4/d;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LN4/d;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LN4/d;
    .locals 1

    .line 1
    sget-object v0, LN4/d;->u:[LN4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, [LN4/d;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LN4/d;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, LN4/d;->o:I

    .line 2
    .line 3
    return v0
.end method
