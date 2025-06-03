.class public abstract LX2/x$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:LX2/Y$b;

.field public static final b:LX2/Y$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "map"

    .line 2
    .line 3
    const-class v1, LX2/x;

    .line 4
    .line 5
    invoke-static {v1, v0}, LX2/Y;->a(Ljava/lang/Class;Ljava/lang/String;)LX2/Y$b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LX2/x$c;->a:LX2/Y$b;

    .line 10
    .line 11
    const-string v0, "size"

    .line 12
    .line 13
    invoke-static {v1, v0}, LX2/Y;->a(Ljava/lang/Class;Ljava/lang/String;)LX2/Y$b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, LX2/x$c;->b:LX2/Y$b;

    .line 18
    .line 19
    return-void
.end method
