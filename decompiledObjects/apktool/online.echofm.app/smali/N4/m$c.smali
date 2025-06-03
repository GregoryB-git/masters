.class public abstract LN4/m$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Lcom/google/protobuf/D;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lcom/google/protobuf/m0$b;->y:Lcom/google/protobuf/m0$b;

    .line 2
    .line 3
    sget-object v1, Lcom/google/protobuf/m0$b;->s:Lcom/google/protobuf/m0$b;

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v3, ""

    .line 12
    .line 13
    invoke-static {v0, v3, v1, v2}, Lcom/google/protobuf/D;->d(Lcom/google/protobuf/m0$b;Ljava/lang/Object;Lcom/google/protobuf/m0$b;Ljava/lang/Object;)Lcom/google/protobuf/D;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, LN4/m$c;->a:Lcom/google/protobuf/D;

    .line 18
    .line 19
    return-void
.end method
