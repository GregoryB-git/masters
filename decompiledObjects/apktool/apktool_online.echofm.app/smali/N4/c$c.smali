.class public abstract LN4/c$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Lcom/google/protobuf/D;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/m0$b;->y:Lcom/google/protobuf/m0$b;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v0, v1, v0, v1}, Lcom/google/protobuf/D;->d(Lcom/google/protobuf/m0$b;Ljava/lang/Object;Lcom/google/protobuf/m0$b;Ljava/lang/Object;)Lcom/google/protobuf/D;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LN4/c$c;->a:Lcom/google/protobuf/D;

    .line 10
    .line 11
    return-void
.end method
