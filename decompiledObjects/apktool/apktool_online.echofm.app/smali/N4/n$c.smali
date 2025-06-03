.class public final enum LN4/n$c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN4/n$c$b;
    }
.end annotation


# static fields
.field public static final enum p:LN4/n$c;

.field public static final enum q:LN4/n$c;

.field public static final r:Lcom/google/protobuf/t$b;

.field public static final synthetic s:[LN4/n$c;


# instance fields
.field public final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LN4/n$c;

    .line 2
    .line 3
    const-string v1, "SOURCE_UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, LN4/n$c;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LN4/n$c;->p:LN4/n$c;

    .line 10
    .line 11
    new-instance v1, LN4/n$c;

    .line 12
    .line 13
    const-string v3, "FL_LEGACY_V1"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4, v4}, LN4/n$c;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, LN4/n$c;->q:LN4/n$c;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    new-array v3, v3, [LN4/n$c;

    .line 23
    .line 24
    aput-object v0, v3, v2

    .line 25
    .line 26
    aput-object v1, v3, v4

    .line 27
    .line 28
    sput-object v3, LN4/n$c;->s:[LN4/n$c;

    .line 29
    .line 30
    new-instance v0, LN4/n$c$a;

    .line 31
    .line 32
    invoke-direct {v0}, LN4/n$c$a;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, LN4/n$c;->r:Lcom/google/protobuf/t$b;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LN4/n$c;->o:I

    .line 5
    .line 6
    return-void
.end method

.method public static c()Lcom/google/protobuf/t$c;
    .locals 1

    .line 1
    sget-object v0, LN4/n$c$b;->a:Lcom/google/protobuf/t$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LN4/n$c;
    .locals 1

    .line 1
    const-class v0, LN4/n$c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LN4/n$c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LN4/n$c;
    .locals 1

    .line 1
    sget-object v0, LN4/n$c;->s:[LN4/n$c;

    .line 2
    .line 3
    invoke-virtual {v0}, [LN4/n$c;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LN4/n$c;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, LN4/n$c;->o:I

    .line 2
    .line 3
    return v0
.end method
